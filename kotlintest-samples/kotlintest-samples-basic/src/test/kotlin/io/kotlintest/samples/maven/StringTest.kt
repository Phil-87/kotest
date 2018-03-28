package io.kotlintest.samples.maven

import io.kotlintest.matchers.haveLength
import io.kotlintest.specs.WordSpec

class StringTest : WordSpec() {
  init {
    "A String" should {
      "Report correct length" {
        "wibble" should haveLength(6)
      }
    }
  }
}