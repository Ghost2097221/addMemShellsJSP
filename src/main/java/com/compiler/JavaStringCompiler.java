package com.compiler;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 * In-memory compile Java source code as String.
 *
 * @author michael
 */
public class JavaStringCompiler {

    JavaCompiler compiler;
    StandardJavaFileManager stdManager;

    public JavaStringCompiler() {
        compiler = ToolProvider.getSystemJavaCompiler();
        System.out.println(compiler);
        this.stdManager = compiler.getStandardFileManager(null, null, null);
    }

    /**
     * Compile a Java source file in memory.
     *
     * @param fileName
     *            Java file name, e.g. "Test.java"
     * @param source
     *            The source code as String.
     * @return The compiled results as Map that contains class name as key,
     *         class binary as value.
     * @throws IOException
     *             If compile error.
     */
    public Map<String, byte[]> compile(String fileName, String source) throws IOException {
        try (MemoryJavaFileManager manager = new MemoryJavaFileManager(stdManager)) {
            JavaFileObject javaFileObject = manager.makeStringSource(fileName, source);
            CompilationTask task = compiler.getTask(null, manager, null, null, null, Arrays.asList(javaFileObject));
            Boolean result = task.call();
            if (result == null || !result.booleanValue()) {
                throw new RuntimeException("Compilation failed.");
            }
            return manager.getClassBytes();
        }
    }
}
