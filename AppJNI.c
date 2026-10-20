#include <jni.h>
#include "App.h"         // Generated JNI header
#include "calculator.h"  // Actual C program header

// Implement the function prototype defined in App.h
JNIEXPORT jint JNICALL Java_App_addNumbers(JNIEnv *env, jobject obj, jint a, jint b) {
    
    // Map jint (Java ints) directly to standard C integers and call the core C logic
    int result = core_add((int)a, (int)b);
    
    // Return the result back as a jint
    return (jint)result;
}