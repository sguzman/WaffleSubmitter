# WaffleSubmitter
![Travis]()
[![License: Unlicense](https://img.shields.io/badge/license-Unlicense-blue.svg)](http://unlicense.org/)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/dwyl/esta/issues)
[![codecov]()
[![HitCount](http://hits.dwyl.io/sguzman/WaffleSubmitter.svg)](http://hits.dwyl.io/sguzman/WaffleSubmitter)


A small dirty Scala app that takes a JSON file as input and creates a ticket on Waffle.io for each corresponding item

### Summary
- File should be JSON
- Each item in the file should contain the following fields
- - `assignee`
- - `label`

- That is all