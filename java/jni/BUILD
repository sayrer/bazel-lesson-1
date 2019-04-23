cc_library(
    name = "democpp-lib",
    srcs = [
        "cpp/demo.cpp"
    ],
    copts = ["-v"],
    visibility = ["//visibility:public"],
    deps = [
        "//cpp:basic",
        "//jni:jniheaders"
    ],
)

cc_binary(
    name = "libdemocpp.dylib",
    deps = [ ":democpp-lib" ],
    linkshared = 1,
)

java_library(
    name = "jnilib",
    srcs = ["src/main/java/com/github/sayrer/jni/JNILib.java"],
    deps = [
        ":libdemocpp.dylib",
    ],
)

java_binary(
    name = "command",
    srcs = ["src/main/java/com/github/sayrer/jni/CommandLineApp.java"],
    main_class = "com.github.sayrer.jni.CommandLineApp",
    deps = [
        "//java/basic:infoprinter",
        ":jnilib",
    ],
)
