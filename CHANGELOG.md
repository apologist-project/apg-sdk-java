# Changelog

## 0.1.0 (2026-01-17)

Full Changelog: [v0.0.2...v0.1.0](https://github.com/apologist-project/apg-sdk-java/compare/v0.0.2...v0.1.0)

### Features

* **client:** add `HttpRequest#url()` method ([a5dcc9d](https://github.com/apologist-project/apg-sdk-java/commit/a5dcc9dbd1ceb4d2ebe3cc41c0ad896987f5cd52))
* **client:** allow configuring dispatcher executor service ([ad0aaf9](https://github.com/apologist-project/apg-sdk-java/commit/ad0aaf9996e27f05e5eb295d44f174f53b4d4bfe))


### Bug Fixes

* **client:** disallow coercion from float to int ([3878dee](https://github.com/apologist-project/apg-sdk-java/commit/3878dee99cd16f31d957365b68f69118454ce40f))
* **client:** fully respect max retries ([f84a982](https://github.com/apologist-project/apg-sdk-java/commit/f84a9826c2b5e52dd5e74cd879051a8161c5f0e8))
* **client:** send retry count header for max retries 0 ([f84a982](https://github.com/apologist-project/apg-sdk-java/commit/f84a9826c2b5e52dd5e74cd879051a8161c5f0e8))
* date time deserialization leniency ([b72b634](https://github.com/apologist-project/apg-sdk-java/commit/b72b6349616864d64ab036495b2b91c7e6baa9aa))


### Chores

* **ci:** upgrade `actions/setup-java` ([9df9e0b](https://github.com/apologist-project/apg-sdk-java/commit/9df9e0b4df944b4250cc56d5b848f5247e186c09))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([f852e4f](https://github.com/apologist-project/apg-sdk-java/commit/f852e4fa11c5cb3108060d9980a42e679c62d082))
* **internal:** depend on packages directly in example ([f84a982](https://github.com/apologist-project/apg-sdk-java/commit/f84a9826c2b5e52dd5e74cd879051a8161c5f0e8))
* **internal:** improve maven repo docs ([786d00a](https://github.com/apologist-project/apg-sdk-java/commit/786d00a3324448f6623cd12c58c0c22da871a5ab))
* **internal:** support uploading Maven repo artifacts to stainless package server ([fdc85bb](https://github.com/apologist-project/apg-sdk-java/commit/fdc85bb71cd01fa3f9b360913488dddde3b03063))
* **internal:** update `actions/checkout` version ([eae378a](https://github.com/apologist-project/apg-sdk-java/commit/eae378af5ac8ad0e4420de89caaf8487bbadc22c))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/apologist-project/apg-sdk-java/issues/3240) in tests ([b72b634](https://github.com/apologist-project/apg-sdk-java/commit/b72b6349616864d64ab036495b2b91c7e6baa9aa))

## 0.0.2 (2025-12-10)

Full Changelog: [v0.0.1...v0.0.2](https://github.com/apologist-project/apg-sdk-java/compare/v0.0.1...v0.0.2)

### Chores

* sync repo ([e602fc4](https://github.com/apologist-project/apg-sdk-java/commit/e602fc42fde255412b18d0d444ca0e38c34b7005))
* update SDK settings ([5dccbe2](https://github.com/apologist-project/apg-sdk-java/commit/5dccbe22d2ff9fd536bb8b7feb46181c3f6833fd))
