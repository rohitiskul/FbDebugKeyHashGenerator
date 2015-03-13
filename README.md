# Facebook key hash generator

<b>Why?</b>

Because everytime we need to open the same project and change package name, compile and run. 

<b>Solution</b>

    FacebookKeyHash fbKeyHash = new FacebookKeyHash(context);
    fbKeyHash.generate("<package name>");

Thats it, print hash anywhere you want.

Add gradle dependency :

    repositories {
        maven {
           url "https://jitpack.io"
        }
    }
    dependencies {
        compile 'com.github.rohitiskul:FbDebugKeyHashGenerator:1.0'
    }
	
More information on http://jitpack.io
