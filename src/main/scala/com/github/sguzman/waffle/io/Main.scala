package com.github.sguzman.waffle.io

import com.beust.jcommander.JCommander
import com.github.sguzman.waffle.io.cmd.Args

object Main {
  def main(args: Array[String]): Unit = {
    val argv = new Args
    JCommander.newBuilder.addObject(argv).build.parse(args: _*)
  }
}
