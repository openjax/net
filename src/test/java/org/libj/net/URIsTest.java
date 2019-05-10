/* Copyright (c) 2018 LibJ
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * You should have received a copy of The MIT License (MIT) along with this
 * program. If not, see <http://opensource.org/licenses/MIT/>.
 */

package org.libj.net;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class URIsTest {
  @Test
  public void testRelativize() throws URISyntaxException {
    // http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6226081
    final URI a = new URI("file:/c:/abc/def/myDocument/doc.xml");
    final URI b = new URI("file:/c:/abc/def/images/subdir/image.png");

    final URI c = URIs.relativize(a, b);

    assertEquals("../images/subdir/image.png", c.toString());
  }
}