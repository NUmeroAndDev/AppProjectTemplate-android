# Android application project template

This project is Android application project template.


## Architecture

```mermaid
  graph TD;
      :app-->:feature:*;
      :app-->:data-impl;
      :feature:*-->:data;
      :data-impl-->:data;
```
