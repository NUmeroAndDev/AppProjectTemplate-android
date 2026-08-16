# Android application project template

This project is Android application project template.


## Architecture

```mermaid
  graph TD;
      :app-->:feature:*;
      :app-->:data-impl;
      :feature:*-->:core:common;
      :feature:*-->:core:ui;
      :feature:*-->:data;
      :data-impl-->:data;
      :data-impl-->:core:common;
      :core:common-->:data;
      :core:ui-->:data;
```
