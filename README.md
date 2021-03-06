# objex
Java object based regular expressions.

# Usage
```
Regex regex = Regex.builder()
                .group()
                    .phrase("start")
                    .character('_')
                .once()
                .group()
                    .group().digit().atLeast(2)
                    .phrase("-")
                    .group().wordCharacter().times(2)
                    .phrase("_")
                .zeroOrMore()
                .group()
                    .phrase("end")
                .once()
                .build();

Assert.assertTrue(regex.match("start_00-aa_01-ab_02-ac_end").matches());
```

# Download

[![](https://jitpack.io/v/mgrzeszczak/objex.svg)](https://jitpack.io/#mgrzeszczak/objex)

# License
```
MIT License

Copyright (c) 2017 Maciej Grzeszczak

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```