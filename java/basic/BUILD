java_binary(
    name = "command",
    srcs = ["src/main/java/com/github/sayrer/basic/CommandLineApp.java"],
    main_class = "com.github.sayrer.basic.CommandLineApp",
    deps = [":infoprinter"],
)

java_library(
    name = "infoprinter",
    srcs = ["src/main/java/com/github/sayrer/basic/InfoPrinter.java"],
    visibility = ["//visibility:public"],
)

java_test(
    name = "test",
    srcs = glob(["src/test/java/com/github/sayrer/basic/*.java"]),
	test_class = "com.github.sayrer.basic.TestInfoPrinter",
    deps = [
         ":infoprinter",
    ]
)
