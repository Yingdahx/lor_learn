package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */
public class Customer_entity {
    private String individualCompanyFlag = "个人";
    private boolean foreign;
    private String branch = "上海汇茂融资租赁有限公司";
    private String customerCode;
    private String customerManager;

    //证件信息
    private String idType;
    private String idNum;
    private String idNum2;
    private String chineseName;
    private String engName;

    //基本情况
    private String nationality;
    private String birthday;
    private String sex;
    private String formerName;
    private String minzu;
    private String zzmm;
    private String juminFlag;
    private String email;

    //家庭情况
    private String jtqk_hyzk;
    private String jtqk_jtrk;
    private String jtqk_jzzk;

    //工作情况
    private String gzqk_dwmc;
    private String gzqk_ml;
    private String gzqk_dl;
    private String gzqk_zl;
    private String gzqk_qsnf;
    private String gzqk_zy;
    private String gzqk_zw;
    private String gzqk_zc;
    private String gzqk_ccy;
    private String gzqk_nsr;
    private String gzqk_gzzh;
    private String gzqk_khyh;

    //教育信息
    private String jyxx_zgxl;
    private String jyxx_zgxw;


    //贷款卡信息
    private String dkkxx_dkkbm;
    private String dkkxx_dkkbm2;
    private String dkkxx_dkkzt;
    private String dkkxx_dkkmm;

    //其他信息
    private boolean qtxx_gdFlag;
    private String qtxx_gqzh;
    private String qtxx_tzje;
    private String qtxx_tzje2;
    private String qtxx_tzrq;
    private String qtxx_tzbl;
    private String qtxx_tzfs;
    private boolean qtxx_ygFlag;
    private String qtxx_drzw;
    private String qtxx_bz;

    //通讯地址
    private String txdz_country;
    private String txdz_ss;
    private String txdz_dz1;
    private String txdz_dz2;
    private String txdz_dz3;
    private String txdz_yb;
    private String txdz_tel;
    private String txdz_mobile;

    //户籍地址
    private String hjdz_country;
    private String hjdz_ss;
    private String hjdz_dz1;
    private String hjdz_dz2;
    private String hjdz_dz3;
    private String hjdz_yb;

    //单位地址
    private String dwdz_country;
    private String dwdz_ss;
    private String dwdz_dz1;
    private String dwdz_dz2;
    private String dwdz_dz3;
    private String dwdz_yb;
    private String dwdz_tel;

    //居住地址
    private String jzdz_country;
    private String jzdz_ss;
    private String jzdz_dz1;
    private String jzdz_dz2;
    private String jzdz_dz3;
    private String jzdz_yb;

    //popup
    List<HashMap<String,String>> idTypeList;
    List<HashMap<String,String>> MaritalStatusList;
    List<HashMap<String,String>> JuzhuStatusList;
    List<HashMap<String,String>> ZhiYeList;
    List<HashMap<String,String>> ZhiWuList;
    List<HashMap<String,String>> ZhiChenList;
    List<HashMap<String,String>> CcyList;
    List<HashMap<String,String>> XueLiList;
    List<HashMap<String,String>> XueWeiList;
    List<HashMap<String,String>> GuoJiaList;
    List<HashMap<String,String>> ShengShiList;

    public List<HashMap<String, String>> getShengShiList() {
        return ShengShiList;
    }

    public void setShengShiList(List<HashMap<String, String>> shengShiList) {
        ShengShiList = shengShiList;
    }

    public List<HashMap<String, String>> getGuoJiaList() {
        return GuoJiaList;
    }

    public void setGuoJiaList(List<HashMap<String, String>> guoJiaList) {
        GuoJiaList = guoJiaList;
    }

    public List<HashMap<String, String>> getMaritalStatusList() {
        return MaritalStatusList;
    }

    public void setMaritalStatusList(List<HashMap<String, String>> maritalStatusList) {
        MaritalStatusList = maritalStatusList;
    }

    public List<HashMap<String, String>> getJuzhuStatusList() {
        return JuzhuStatusList;
    }

    public void setJuzhuStatusList(List<HashMap<String, String>> juzhuStatusList) {
        JuzhuStatusList = juzhuStatusList;
    }

    public List<HashMap<String, String>> getZhiYeList() {
        return ZhiYeList;
    }

    public void setZhiYeList(List<HashMap<String, String>> zhiYeList) {
        ZhiYeList = zhiYeList;
    }

    public List<HashMap<String, String>> getZhiWuList() {
        return ZhiWuList;
    }

    public void setZhiWuList(List<HashMap<String, String>> zhiWuList) {
        ZhiWuList = zhiWuList;
    }

    public List<HashMap<String, String>> getZhiChenList() {
        return ZhiChenList;
    }

    public void setZhiChenList(List<HashMap<String, String>> zhiChenList) {
        ZhiChenList = zhiChenList;
    }

    public List<HashMap<String, String>> getCcyList() {
        return CcyList;
    }

    public void setCcyList(List<HashMap<String, String>> ccyList) {
        CcyList = ccyList;
    }

    public List<HashMap<String, String>> getXueLiList() {
        return XueLiList;
    }

    public void setXueLiList(List<HashMap<String, String>> xueLiList) {
        XueLiList = xueLiList;
    }

    public List<HashMap<String, String>> getXueWeiList() {
        return XueWeiList;
    }

    public void setXueWeiList(List<HashMap<String, String>> xueWeiList) {
        XueWeiList = xueWeiList;
    }

    public List<HashMap<String, String>> getIdTypeList() {
        return idTypeList;
    }

    public void setIdTypeList(List<HashMap<String, String>> idTypeList) {
        this.idTypeList = idTypeList;
    }

    public String getQtxx_tzje2() {
        return qtxx_tzje2;
    }

    public void setQtxx_tzje2(String qtxx_tzje2) {
        this.qtxx_tzje2 = qtxx_tzje2;
    }

    public String getIndividualCompanyFlag() {
        return individualCompanyFlag;
    }

    public void setIndividualCompanyFlag(String individualCompanyFlag) {
        this.individualCompanyFlag = individualCompanyFlag;
    }

    public boolean isForeign() {
        return foreign;
    }

    public void setForeign(boolean foreign) {
        this.foreign = foreign;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerManager() {
        return customerManager;
    }

    public void setCustomerManager(String customerManager) {
        this.customerManager = customerManager;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getIdNum2() {
        return idNum2;
    }

    public void setIdNum2(String idNum2) {
        this.idNum2 = idNum2;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public String getMinzu() {
        return minzu;
    }

    public void setMinzu(String minzu) {
        this.minzu = minzu;
    }

    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }

    public String getJuminFlag() {
        return juminFlag;
    }

    public void setJuminFlag(String juminFlag) {
        this.juminFlag = juminFlag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJtqk_hyzk() {
        return jtqk_hyzk;
    }

    public void setJtqk_hyzk(String jtqk_hyzk) {
        this.jtqk_hyzk = jtqk_hyzk;
    }

    public String getJtqk_jtrk() {
        return jtqk_jtrk;
    }

    public void setJtqk_jtrk(String jtqk_jtrk) {
        this.jtqk_jtrk = jtqk_jtrk;
    }

    public String getJtqk_jzzk() {
        return jtqk_jzzk;
    }

    public void setJtqk_jzzk(String jtqk_jzzk) {
        this.jtqk_jzzk = jtqk_jzzk;
    }

    public String getGzqk_dwmc() {
        return gzqk_dwmc;
    }

    public void setGzqk_dwmc(String gzqk_dwmc) {
        this.gzqk_dwmc = gzqk_dwmc;
    }

    public String getGzqk_ml() {
        return gzqk_ml;
    }

    public void setGzqk_ml(String gzqk_ml) {
        this.gzqk_ml = gzqk_ml;
    }

    public String getGzqk_dl() {
        return gzqk_dl;
    }

    public void setGzqk_dl(String gzqk_dl) {
        this.gzqk_dl = gzqk_dl;
    }

    public String getGzqk_zl() {
        return gzqk_zl;
    }

    public void setGzqk_zl(String gzqk_zl) {
        this.gzqk_zl = gzqk_zl;
    }

    public String getGzqk_qsnf() {
        return gzqk_qsnf;
    }

    public void setGzqk_qsnf(String gzqk_qsnf) {
        this.gzqk_qsnf = gzqk_qsnf;
    }

    public String getGzqk_zy() {
        return gzqk_zy;
    }

    public void setGzqk_zy(String gzqk_zy) {
        this.gzqk_zy = gzqk_zy;
    }

    public String getGzqk_zw() {
        return gzqk_zw;
    }

    public void setGzqk_zw(String gzqk_zw) {
        this.gzqk_zw = gzqk_zw;
    }

    public String getGzqk_zc() {
        return gzqk_zc;
    }

    public void setGzqk_zc(String gzqk_zc) {
        this.gzqk_zc = gzqk_zc;
    }

    public String getGzqk_ccy() {
        return gzqk_ccy;
    }

    public void setGzqk_ccy(String gzqk_ccy) {
        this.gzqk_ccy = gzqk_ccy;
    }

    public String getGzqk_nsr() {
        return gzqk_nsr;
    }

    public void setGzqk_nsr(String gzqk_nsr) {
        this.gzqk_nsr = gzqk_nsr;
    }

    public String getGzqk_gzzh() {
        return gzqk_gzzh;
    }

    public void setGzqk_gzzh(String gzqk_gzzh) {
        this.gzqk_gzzh = gzqk_gzzh;
    }

    public String getGzqk_khyh() {
        return gzqk_khyh;
    }

    public void setGzqk_khyh(String gzqk_khyh) {
        this.gzqk_khyh = gzqk_khyh;
    }

    public String getJyxx_zgxl() {
        return jyxx_zgxl;
    }

    public void setJyxx_zgxl(String jyxx_zgxl) {
        this.jyxx_zgxl = jyxx_zgxl;
    }

    public String getJyxx_zgxw() {
        return jyxx_zgxw;
    }

    public void setJyxx_zgxw(String jyxx_zgxw) {
        this.jyxx_zgxw = jyxx_zgxw;
    }

    public String getDkkxx_dkkbm() {
        return dkkxx_dkkbm;
    }

    public void setDkkxx_dkkbm(String dkkxx_dkkbm) {
        this.dkkxx_dkkbm = dkkxx_dkkbm;
    }

    public String getDkkxx_dkkbm2() {
        return dkkxx_dkkbm2;
    }

    public void setDkkxx_dkkbm2(String dkkxx_dkkbm2) {
        this.dkkxx_dkkbm2 = dkkxx_dkkbm2;
    }

    public String getDkkxx_dkkzt() {
        return dkkxx_dkkzt;
    }

    public void setDkkxx_dkkzt(String dkkxx_dkkzt) {
        this.dkkxx_dkkzt = dkkxx_dkkzt;
    }

    public String getDkkxx_dkkmm() {
        return dkkxx_dkkmm;
    }

    public void setDkkxx_dkkmm(String dkkxx_dkkmm) {
        this.dkkxx_dkkmm = dkkxx_dkkmm;
    }

    public boolean isQtxx_gdFlag() {
        return qtxx_gdFlag;
    }

    public void setQtxx_gdFlag(boolean qtxx_gdFlag) {
        this.qtxx_gdFlag = qtxx_gdFlag;
    }

    public String getQtxx_gqzh() {
        return qtxx_gqzh;
    }

    public void setQtxx_gqzh(String qtxx_gqzh) {
        this.qtxx_gqzh = qtxx_gqzh;
    }



    public String getQtxx_tzje() {
        return qtxx_tzje;
    }

    public void setQtxx_tzje(String qtxx_tzje) {
        this.qtxx_tzje = qtxx_tzje;
    }

    public String getQtxx_tzrq() {
        return qtxx_tzrq;
    }

    public void setQtxx_tzrq(String qtxx_tzrq) {
        this.qtxx_tzrq = qtxx_tzrq;
    }

    public String getQtxx_tzbl() {
        return qtxx_tzbl;
    }

    public void setQtxx_tzbl(String qtxx_tzbl) {
        this.qtxx_tzbl = qtxx_tzbl;
    }

    public String getQtxx_tzfs() {
        return qtxx_tzfs;
    }

    public void setQtxx_tzfs(String qtxx_tzfs) {
        this.qtxx_tzfs = qtxx_tzfs;
    }

    public boolean isQtxx_ygFlag() {
        return qtxx_ygFlag;
    }

    public void setQtxx_ygFlag(boolean qtxx_ygFlag) {
        this.qtxx_ygFlag = qtxx_ygFlag;
    }

    public String getQtxx_drzw() {
        return qtxx_drzw;
    }

    public void setQtxx_drzw(String qtxx_drzw) {
        this.qtxx_drzw = qtxx_drzw;
    }

    public String getQtxx_bz() {
        return qtxx_bz;
    }

    public void setQtxx_bz(String qtxx_bz) {
        this.qtxx_bz = qtxx_bz;
    }

    public String getTxdz_country() {
        return txdz_country;
    }

    public void setTxdz_country(String txdz_country) {
        this.txdz_country = txdz_country;
    }

    public String getTxdz_ss() {
        return txdz_ss;
    }

    public void setTxdz_ss(String txdz_ss) {
        this.txdz_ss = txdz_ss;
    }

    public String getTxdz_dz1() {
        return txdz_dz1;
    }

    public void setTxdz_dz1(String txdz_dz1) {
        this.txdz_dz1 = txdz_dz1;
    }

    public String getTxdz_dz2() {
        return txdz_dz2;
    }

    public void setTxdz_dz2(String txdz_dz2) {
        this.txdz_dz2 = txdz_dz2;
    }

    public String getTxdz_dz3() {
        return txdz_dz3;
    }

    public void setTxdz_dz3(String txdz_dz3) {
        this.txdz_dz3 = txdz_dz3;
    }

    public String getTxdz_yb() {
        return txdz_yb;
    }

    public void setTxdz_yb(String txdz_yb) {
        this.txdz_yb = txdz_yb;
    }

    public String getTxdz_tel() {
        return txdz_tel;
    }

    public void setTxdz_tel(String txdz_tel) {
        this.txdz_tel = txdz_tel;
    }

    public String getTxdz_mobile() {
        return txdz_mobile;
    }

    public void setTxdz_mobile(String txdz_mobile) {
        this.txdz_mobile = txdz_mobile;
    }

    public String getHjdz_country() {
        return hjdz_country;
    }

    public void setHjdz_country(String hjdz_country) {
        this.hjdz_country = hjdz_country;
    }

    public String getHjdz_ss() {
        return hjdz_ss;
    }

    public void setHjdz_ss(String hjdz_ss) {
        this.hjdz_ss = hjdz_ss;
    }

    public String getHjdz_dz1() {
        return hjdz_dz1;
    }

    public void setHjdz_dz1(String hjdz_dz1) {
        this.hjdz_dz1 = hjdz_dz1;
    }

    public String getHjdz_dz2() {
        return hjdz_dz2;
    }

    public void setHjdz_dz2(String hjdz_dz2) {
        this.hjdz_dz2 = hjdz_dz2;
    }

    public String getHjdz_dz3() {
        return hjdz_dz3;
    }

    public void setHjdz_dz3(String hjdz_dz3) {
        this.hjdz_dz3 = hjdz_dz3;
    }

    public String getHjdz_yb() {
        return hjdz_yb;
    }

    public void setHjdz_yb(String hjdz_yb) {
        this.hjdz_yb = hjdz_yb;
    }

    public String getDwdz_country() {
        return dwdz_country;
    }

    public void setDwdz_country(String dwdz_country) {
        this.dwdz_country = dwdz_country;
    }

    public String getDwdz_ss() {
        return dwdz_ss;
    }

    public void setDwdz_ss(String dwdz_ss) {
        this.dwdz_ss = dwdz_ss;
    }

    public String getDwdz_dz1() {
        return dwdz_dz1;
    }

    public void setDwdz_dz1(String dwdz_dz1) {
        this.dwdz_dz1 = dwdz_dz1;
    }

    public String getDwdz_dz2() {
        return dwdz_dz2;
    }

    public void setDwdz_dz2(String dwdz_dz2) {
        this.dwdz_dz2 = dwdz_dz2;
    }

    public String getDwdz_dz3() {
        return dwdz_dz3;
    }

    public void setDwdz_dz3(String dwdz_dz3) {
        this.dwdz_dz3 = dwdz_dz3;
    }

    public String getDwdz_yb() {
        return dwdz_yb;
    }

    public void setDwdz_yb(String dwdz_yb) {
        this.dwdz_yb = dwdz_yb;
    }

    public String getDwdz_tel() {
        return dwdz_tel;
    }

    public void setDwdz_tel(String dwdz_tel) {
        this.dwdz_tel = dwdz_tel;
    }

    public String getJzdz_country() {
        return jzdz_country;
    }

    public void setJzdz_country(String jzdz_country) {
        this.jzdz_country = jzdz_country;
    }

    public String getJzdz_ss() {
        return jzdz_ss;
    }

    public void setJzdz_ss(String jzdz_ss) {
        this.jzdz_ss = jzdz_ss;
    }

    public String getJzdz_dz1() {
        return jzdz_dz1;
    }

    public void setJzdz_dz1(String jzdz_dz1) {
        this.jzdz_dz1 = jzdz_dz1;
    }

    public String getJzdz_dz2() {
        return jzdz_dz2;
    }

    public void setJzdz_dz2(String jzdz_dz2) {
        this.jzdz_dz2 = jzdz_dz2;
    }

    public String getJzdz_dz3() {
        return jzdz_dz3;
    }

    public void setJzdz_dz3(String jzdz_dz3) {
        this.jzdz_dz3 = jzdz_dz3;
    }

    public String getJzdz_yb() {
        return jzdz_yb;
    }

    public void setJzdz_yb(String jzdz_yb) {
        this.jzdz_yb = jzdz_yb;
    }
}