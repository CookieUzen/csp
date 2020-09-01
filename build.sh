#!/bin/bash

operation="$1"
[[ -z "$1" ]] && operation="compile"

case $operation in
	compile)
		cd src
		javac -d . *.java
		;;
	run)
		cd src
		java main
		;;
	clean)
		cd src 
		find -name "*.class" -exec rm {} \;
esac
