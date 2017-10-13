set projectLocation=%projectLocation\Amazon-master\Amazon-master%
set classpath=%projectLocation%\lib\*
set execution=mvn integration-test
%execution%
pause
