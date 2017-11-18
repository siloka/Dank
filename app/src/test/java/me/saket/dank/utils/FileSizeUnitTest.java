package me.saket.dank.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FileSizeUnitTest {

  private static final double TWO_FIFTY_MEGABYTES_IN_BYTES = 262_144_000d;
  private static final double TWO_FIFTY_MEGABYTES_IN_KILO_BYTES = 256_000d;
  private static final double TWO_FIFTY_MEGABYTES_IN_MEGA_BYTES = 250d;
  private static final double TWO_FIFTY_MEGABYTES_IN_GIGA_BYTES = 0.244140625d;
  private static final double DELTA = 0d;

  @Test
  public void poop() {
    assertEquals(FileSizeUnit.BYTES.toBytes(TWO_FIFTY_MEGABYTES_IN_BYTES), TWO_FIFTY_MEGABYTES_IN_BYTES, DELTA);
    assertEquals(FileSizeUnit.BYTES.toKiloBytes(TWO_FIFTY_MEGABYTES_IN_BYTES), TWO_FIFTY_MEGABYTES_IN_KILO_BYTES, DELTA);
    assertEquals(FileSizeUnit.BYTES.toMegaBytes(TWO_FIFTY_MEGABYTES_IN_BYTES), TWO_FIFTY_MEGABYTES_IN_MEGA_BYTES, DELTA);
    assertEquals(FileSizeUnit.BYTES.toGigaBytes(TWO_FIFTY_MEGABYTES_IN_BYTES), TWO_FIFTY_MEGABYTES_IN_GIGA_BYTES, DELTA);

    assertEquals(FileSizeUnit.KB.toBytes(TWO_FIFTY_MEGABYTES_IN_KILO_BYTES), TWO_FIFTY_MEGABYTES_IN_BYTES, DELTA);
    assertEquals(FileSizeUnit.KB.toKiloBytes(TWO_FIFTY_MEGABYTES_IN_KILO_BYTES), TWO_FIFTY_MEGABYTES_IN_KILO_BYTES, DELTA);
    assertEquals(FileSizeUnit.KB.toMegaBytes(TWO_FIFTY_MEGABYTES_IN_KILO_BYTES), TWO_FIFTY_MEGABYTES_IN_MEGA_BYTES, DELTA);
    assertEquals(FileSizeUnit.KB.toGigaBytes(TWO_FIFTY_MEGABYTES_IN_KILO_BYTES), TWO_FIFTY_MEGABYTES_IN_GIGA_BYTES, DELTA);

    assertEquals(FileSizeUnit.MB.toBytes(TWO_FIFTY_MEGABYTES_IN_MEGA_BYTES), TWO_FIFTY_MEGABYTES_IN_BYTES, DELTA);
    assertEquals(FileSizeUnit.MB.toKiloBytes(TWO_FIFTY_MEGABYTES_IN_MEGA_BYTES), TWO_FIFTY_MEGABYTES_IN_KILO_BYTES, DELTA);
    assertEquals(FileSizeUnit.MB.toMegaBytes(TWO_FIFTY_MEGABYTES_IN_MEGA_BYTES), TWO_FIFTY_MEGABYTES_IN_MEGA_BYTES, DELTA);
    assertEquals(FileSizeUnit.MB.toGigaBytes(TWO_FIFTY_MEGABYTES_IN_MEGA_BYTES), TWO_FIFTY_MEGABYTES_IN_GIGA_BYTES, DELTA);

    assertEquals(FileSizeUnit.GB.toBytes(TWO_FIFTY_MEGABYTES_IN_GIGA_BYTES), TWO_FIFTY_MEGABYTES_IN_BYTES, DELTA);
    assertEquals(FileSizeUnit.GB.toKiloBytes(TWO_FIFTY_MEGABYTES_IN_GIGA_BYTES), TWO_FIFTY_MEGABYTES_IN_KILO_BYTES, DELTA);
    assertEquals(FileSizeUnit.GB.toMegaBytes(TWO_FIFTY_MEGABYTES_IN_GIGA_BYTES), TWO_FIFTY_MEGABYTES_IN_MEGA_BYTES, DELTA);
    assertEquals(FileSizeUnit.GB.toGigaBytes(TWO_FIFTY_MEGABYTES_IN_GIGA_BYTES), TWO_FIFTY_MEGABYTES_IN_GIGA_BYTES, DELTA);
  }
}
