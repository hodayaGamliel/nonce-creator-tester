Takipi site
===========

Debug
-----
1. Uncomment `pipelineStages in Assets := Seq(uglify, concat, cssCompress, gzip)` in `build.sbt`
2. Run: `activator run` 
3. Enter: `http://localhost:9000`


Deploy
------
1. Comment `pipelineStages in Assets := Seq(uglify, concat, cssCompress, gzip)` in `build.sbt`
2. Run `activator stage`.
