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

WEBPAGE_REPO := git@gitlab.lre.epita.fr:lre/lre-web/members/jim-newton.git

webpage: mgs-2022-syllabus.pdf mgs-2022-slides.pdf
	tmp=$$(mktemp -d) && \
	git clone --depth 1 --quiet $(WEBPAGE_REPO) $$tmp && \
	cp mgs-2022-syllabus.pdf mgs-2022-slides.pdf $$tmp/ && \
	cd $$tmp && \
	git add mgs-2022-syllabus.pdf mgs-2022-slides.pdf && \
	(git diff --cached --quiet || git commit --quiet -m "Update mgs-2022-syllabus.pdf, mgs-2022-slides.pdf") && \
	git push --quiet ; \
	status=$$? ; rm -rf $$tmp ; exit $$status
