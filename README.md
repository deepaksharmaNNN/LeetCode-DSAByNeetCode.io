# LeetCode Java Solutions

This repository contains Java solutions to various LeetCode problems. Solutions are organized by topics, and each topic may have subfolders for easy, medium, and hard-level problems.

## Table of Contents

- [Introduction](#introduction)
- [Folder Structure](#folder-structure)
- [Naming Convention](#naming-convention)
- [Comments and Documentation](#comments-and-documentation)
- [Testing](#testing)
- [Contribution Guidelines](#contribution-guidelines)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## Introduction

Welcome to the LeetCode Java Solutions repository! Here, you'll find Java implementations for over 450 LeetCode problems, organized by topics such as "Arrays and Hashing." Whether you're a beginner looking for examples or an experienced developer seeking efficient solutions, this repository is designed to assist you in your coding journey.

## Folder Structure

The solutions are organized into folders based on topics and difficulty levels. The structure is as follows:

- `Arrays_and_Hashing/`
  - `Easy/`: Easy-level problems
  - `Medium/`: Medium-level problems
  - `Hard/`: Hard-level problems
- `Linked_Lists/`
  - `Easy/`: Easy-level problems
  - `Medium/`: Medium-level problems
  - `Hard/`: Hard-level problems
- ... (add more folders based on topics)

## Naming Convention

Each Java file is named according to the following convention:

`[ProblemNumber]_[ShortProblemDescription].java`

For example:

- `001_Two_Sum.java`
- `102_Level_Order_Traversal.java`

name: Update README

on:
  push:
    branches:
      - main

jobs:
  update-readme:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout repository
        uses: actions/checkout@v2

      - name: Copy README to New Location
        run: cp README.md updated-readme/README.md

      - name: Commit and Push Updated README
        run: |
          git config --global user.email "actions@github.com"
          git config --global user.name "GitHub Actions"
          git add updated-readme/README.md
          git commit -m "Update README.md"
          git push

