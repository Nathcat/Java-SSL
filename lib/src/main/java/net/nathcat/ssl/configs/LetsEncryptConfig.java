package net.nathcat.ssl.configs;

public final class LetsEncryptConfig extends Config {
  /**
   * The path to the private key PEM file
   */
  public String privKeyPath;
  /**
   * The path to the certificate chain path
   */
  public String certChainPath;
}
