rootProject.name = "test_gradle"

extra {
  val kotlinJvm = "1.4.10"
}


includeBuild("build-stuff/dependencies")

include("echo")
