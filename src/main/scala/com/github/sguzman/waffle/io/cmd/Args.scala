package com.github.sguzman.waffle.io.cmd

import com.beust.jcommander.Parameter

class Args {
  @Parameter(
    names = Array("-a", "--auth"),
    description = "Authorization bearer for waffle.io",
    required = true
  )
  private var auth = ""

  @Parameter(
    names = Array("-j", "--json"),
    description = "JSON file containing the login info",
    required = true
  )
  private var json = ""
}
