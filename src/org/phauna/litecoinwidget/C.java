package org.phauna.litecoinwidget;

import java.util.Currency;

public class C {
  public static final String EXCH_CRSY = "exch_crsy";
  public static final String EXCH_VREX = "exch_vrex";
  public static final String EXCH_MCXN = "exch_mcxn";
  public static final String EXCH_MGOX = "exch_mgox";
  public static final String EXCH_BTCE = "exch_btce";
  public static final String EXCH_BSTP = "exch_bstp";
  public static final String EXCH_CPBX = "exch_cpbx";
  public static final String EXCH_CBSE = "exch_cbse";
  public static final String EXCH_VRTX = "exch_vrtx";
  public static final String EXCH_BITC = "exch_bitc";
  public static final String EXCH_CHNA = "exch_chna";
  public static final String EXCH_BAVG = "exch_bavg";
  public static final String EXCH_KRKN = "exch_krkn";


  /*
  public static final String CFG_VREX_LTC = "vircurex_ltc";
  public static final String CFG_VREX_NMC = "vircurex_nmc";
  public static final String CFG_VREX_PPC = "vircurex_ppc";
  public static final String CFG_VREX_TRC = "vircurex_trc";
  public static final String CFG_MGOX_BTC = "mgox_btc";
  public static final String CFG_BTCE_LTC = "btce_ltc";
  public static final String CFG_BTCE_BTC = "btce_btc";
  public static final String CFG_BTCE_NMC = "btce_nmc";
  public static final String CFG_BTCE_PPC = "btce_ppc";
  public static final String CFG_BTCE_TRC = "btce_trc";
  public static final String CFG_INVALID  = "invalid";
  */

  public static String exchangeName(String exchange) {
    if (   exchange.equals(EXCH_VREX)) {
      return "V'rex";
    } else if (exchange.equals(EXCH_CRSY)) {
      return "C'tsy";
    } else if (exchange.equals(EXCH_BAVG)) {
      return "B-avg";
    } else if (exchange.equals(EXCH_BITC)) {
      return "Bit2C";
    } else if (exchange.equals(EXCH_MCXN)) {
      return "mcxNW";
    } else if (exchange.equals(EXCH_BTCE)) {
      return "Btc-e";
    } else if (exchange.equals(EXCH_MGOX)) {
      return "Mtgox";
    } else if (exchange.equals(EXCH_BSTP)) {
      return "stamp";
    } else if (exchange.equals(EXCH_CPBX)) {
      return "cmpBX";
    } else if (exchange.equals(EXCH_CBSE)) {
      return "C'bse";
    } else if (exchange.equals(EXCH_KRKN)) {
      return "Kr'kn";
    } else if (exchange.equals(EXCH_VRTX)) {
      return "CaVtx";
    } else if (exchange.equals(EXCH_CHNA)) {
      return "China";
    } else {
      return "???";
    }
  }

  public static final String pref_key_exchange      = "pref_key_exchange";
  public static final String pref_key_interval      = "pref_key_interval";
  public static final String pref_key_coin          = "pref_key_coin";
  public static final String pref_key_transparbar   = "pref_key_transparbar";
  public static final String pref_key_rate_price    = "pref_key_rate_price";
  public static final String pref_key_rate_date     = "pref_key_rate_date";
  public static final String pref_key_rate_exchange = "pref_key_rate_exchange";
  public static final String pref_key_owc           = "pref_key_owc";
  public static final String pref_key_done          = "pref_key_done";
  public static final String pref_key_txtcolor      = "pref_key_txtcolor";
  public static final String pref_key_bgcolor       = "pref_key_bgcolor";

  public static final String LOG = "org.phauna.litecoinwidget";

  public static final String firstrun = "firstrun";

  public static final String USD = "USD";
  public static final String EUR = "EUR";
  public static final String GBP = "GBP";
  public static final String JPY = "JPY";
  public static final String CAD = "CAD";
  public static final String CNY = "CNY";
  public static final String ILS = "ILS";

  public static String defaultOWC(String exchange) {
    if (exchange.equals(EXCH_BITC)) {
      return ILS;
    } else if (exchange.equals(EXCH_VRTX)) {
      return CAD;
    } else if (exchange.equals(EXCH_CHNA)) {
      return CNY;
    } else {
      return USD;
    }
  }

  public static final int DEFAULT_COLOR_TEXT = 0xffC9C9C9;
  public static final int DEFAULT_COLOR_BG = 0xbb494949;

  public static final String DEFAULT_INTERVAL = "1800";

  public static final String EXTRA_IS_MANUAL_UPDATE = "extra_is_manual_update";

  public static String currencySymbol(String c) {
    return Currency.getInstance(c).getSymbol();
  }


}
