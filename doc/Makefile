## Copyright (C) 2023 Jim Newton

all: pdf

SRC_DIR  := .
IMAGE_DIR := $(SRC_DIR)/../img
LATEXMK = latexmk --pdf

pdf: mgs-2022-syllabus.pdf mgs-2022-slides.pdf

mgs-2022-slides.pdf : ${SRC_DIR}/mgs-2022-slides.ltx
	TEXINPUTS=$(TEXINPUTS):$(IMAGE_DIR) \
	latexmk --pdf ${SRC_DIR}/mgs-2022-slides.ltx
	([ -d ~/Google\ Drive/MGS\ 2022/. ] && cp -fv $@ ~/Google\ Drive/MGS\ 2022/.) || true

mgs-2022-syllabus.pdf : ${SRC_DIR}/mgs-2022-syllabus.ltx
	TEXINPUTS=$(TEXINPUTS):$(IMAGE_DIR) \
	latexmk --pdf ${SRC_DIR}/mgs-2022-syllabus.ltx
	([ -d ~/Google\ Drive/MGS\ 2022/. ] && cp -fv $@ ~/Google\ Drive/MGS\ 2022/.) || true

WEBPAGE_DIR := $(HOME)/Repos/lre-webpage-jim-newton

webpage: mgs-2022-syllabus.pdf mgs-2022-slides.pdf
	mkdir -p ${WEBPAGE_DIR}
	cp mgs-2022-syllabus.pdf mgs-2022-slides.pdf ${WEBPAGE_DIR}/
