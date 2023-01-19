## Copyright (C) 2023 Jim Newton

all: pdf

SRC_DIR  := .
IMAGE_DIR := $(SRC_DIR)/../img


pdf: mgs-2022-syllabus.pdf mgs-2022-slides.pdf mgs-2023-syllabus.pdf mgs-2023-slides.pdf

mgs-2022-slides.pdf : ${SRC_DIR}/mgs-2022-slides.ltx
	TEXINPUTS=$(TEXINPUTS):$(IMAGE_DIR) \
	latexmk --pdf ${SRC_DIR}/mgs-2022-slides.ltx
	([ -d ~/Google\ Drive/MGS\ 2022/. ] && cp -fv $@ ~/Google\ Drive/MGS\ 2022/.) || true

mgs-2022-syllabus.pdf : ${SRC_DIR}/mgs-2022-syllabus.ltx
	TEXINPUTS=$(TEXINPUTS):$(IMAGE_DIR) \
	latexmk --pdf ${SRC_DIR}/mgs-2022-syllabus.ltx
	([ -d ~/Google\ Drive/MGS\ 2022/. ] && cp -fv $@ ~/Google\ Drive/MGS\ 2022/.) || true

mgs-2023-slides.pdf : ${SRC_DIR}/mgs-2023-slides.ltx
	TEXINPUTS=$(TEXINPUTS):$(IMAGE_DIR) \
	latexmk --pdf ${SRC_DIR}/mgs-2023-slides.ltx
	([ -d ~/Google\ Drive/MGS\ 2023/. ] && cp -fv $@ ~/Google\ Drive/MGS\ 2023/.) || true

mgs-2023-syllabus.pdf : ${SRC_DIR}/mgs-2023-syllabus.ltx
	TEXINPUTS=$(TEXINPUTS):$(IMAGE_DIR) \
	latexmk --pdf ${SRC_DIR}/mgs-2023-syllabus.ltx
	([ -d ~/Google\ Drive/MGS\ 2023/. ] && cp -fv $@ ~/Google\ Drive/MGS\ 2023/.) || true

pvc-syllabus:
	TEXINPUTS=$(TEXINPUTS):$(IMAGE_DIR) \
	latexmk -pvc --pdf ${SRC_DIR}/mgs-2023-syllabus.ltx

pvc-slides:
	TEXINPUTS=$(TEXINPUTS):$(IMAGE_DIR) \
	latexmk -pvc --pdf ${SRC_DIR}/mgs-2023-slides.ltx
