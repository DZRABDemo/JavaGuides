#include <jni.h>
#include <stdio.h>

#include "Hello.h"

JNIEXPORT void JNICALL Java_Hello_sayHello
  (JNIEnv * env , jobject thisobj){
  	puts("Hello Sealer\n");
  	return;
}