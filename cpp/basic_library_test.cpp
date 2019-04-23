#include "gtest/gtest.h"
#include "basic_library.h"

TEST(HelloTest, GetGreet) {
  InfoPrinter printer;
  EXPECT_EQ(printer.getString(), "I'm a C++ string!");
}