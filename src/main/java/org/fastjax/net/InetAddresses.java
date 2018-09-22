/* Copyright (c) 2015 FastJAX
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

package org.fastjax.net;

import java.net.InetAddress;

/**
 * Utility methods to {@link InetAddress}.
 */
public class InetAddresses {
  /**
   * Returns the decimal representation of the IP of an {@code InetAddress}
   * <p>
   * (i.e. where each number is specified as a value in the range 0-255)
   *
   * @param address The {@code InetAddress}.
   * @return The decimal representation of the IP of an {@code InetAddress}.
   */
  public static String toStringIP(final InetAddress address) {
    final byte[] bytes = address.getAddress();
    final StringBuilder builder = new StringBuilder();
    for (int i = 0; i < bytes.length; ++i) {
      if (i > 0)
        builder.append('.');

      builder.append(bytes[i] & 0xFF);
    }

    return builder.toString();
  }

  private InetAddresses() {
  }
}