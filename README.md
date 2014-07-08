Yamail - Ecsoya Mail Client
===========================

Eclipse e4 Application with javamail.

#Developing
 * Eclipse e4 application (e4 tools - http://download.vogella.com/luna/e4tools)
 * XWT - http://download.eclipse.org/xwt/updates/
 * JavaMail API 1.5.2 (Include in project) 

#Tycho Build
 * Have Maven 3 installed
 * Clone this Git repo
 * Open a shell in project org.ecsoya.yamail.build.tycho
 * Run command "mvn clean install"
 * Wait a while (first build takes long) until the build succeeds
 * The results for Win (32/64) and Linux GTK (32/64) and Mac Cocoa (32/64) are in project org.ecsoya.yamail.product/target/products