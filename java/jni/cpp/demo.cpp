#include <jni.h>
#include <string>
#include "cpp/basic_library.h"

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_github_sayrer_jni_JNILib_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    InfoPrinter printer;
    return env->NewStringUTF(printer.getString().c_str());
}
