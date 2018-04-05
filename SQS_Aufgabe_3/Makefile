all:
	echo "please use 'make build' or 'make clean'"
build:
	for filename in *.tex; do pdflatex $filename; done;

clean:
	rm -rf *.aux *.log *.synctex.gz *.toc *.out *.bbl *.blg *.lof *.lot *.run.xml *.bcf *.snm *.nav
