package com.ruoyi.web.domain;

import com.ruoyi.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 学员表 information
 *
 * @author null
 * @date 2019-05-08
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="学员",parent=BaseEntity.class)
public class Information extends BaseEntity{

    private static final long serialVersionUID=1L;
    
    @ApiModelProperty(value="",name="iD1")
    private Integer iD1;
        
    @ApiModelProperty(value="",name="id")
    private String id;
        
    @ApiModelProperty(value="",name="num")
    private String num;
        
    @ApiModelProperty(value="",name="name")
    private String name;
        
    @ApiModelProperty(value="",name="hls")
    private String hls;
        
    @ApiModelProperty(value="",name="sx")
    private String sx;
        
    @ApiModelProperty(value="",name="sex")
    private String sex;
        
    @ApiModelProperty(value="",name="born")
    private String born;
        
    @ApiModelProperty(value="",name="pay")
    private String pay;
        
    @ApiModelProperty(value="",name="level")
    private String level;
        
    @ApiModelProperty(value="",name="con")
    private String con;
        
    @ApiModelProperty(value="",name="conphone")
    private String conphone;
        
    @ApiModelProperty(value="",name="phone")
    private String phone;
        
    @ApiModelProperty(value="",name="mobile")
    private String mobile;
        
    @ApiModelProperty(value="",name="st")
    private String st;
        
    @ApiModelProperty(value="",name="ct")
    private String ct;
        
    @ApiModelProperty(value="",name="dt")
    private String dt;
        
    @ApiModelProperty(value="",name="idcard")
    private String idcard;
        
    @ApiModelProperty(value="",name="unit")
    private String unit;
        
    @ApiModelProperty(value="",name="unitphone")
    private String unitphone;
        
    @ApiModelProperty(value="",name="home")
    private String home;
        
    @ApiModelProperty(value="",name="score1")
    private String score1;
        
    @ApiModelProperty(value="",name="score2")
    private String score2;
        
    @ApiModelProperty(value="",name="date1")
    private String date1;
        
    @ApiModelProperty(value="",name="date2")
    private String date2;
        
    @ApiModelProperty(value="",name="date3")
    private String date3;
        
    @ApiModelProperty(value="",name="letter")
    private String letter;
        
    @ApiModelProperty(value="",name="fzzt")
    private String fzzt;
        
    @ApiModelProperty(value="",name="fxsj")
    private String fxsj;
        
    @ApiModelProperty(value="",name="czsj")
    private String czsj;
        
    @ApiModelProperty(value="",name="djsj")
    private String djsj;
        
    @ApiModelProperty(value="",name="schooling")
    private String schooling;
        
    @ApiModelProperty(value="",name="electric")
    private String electric;
        
    @ApiModelProperty(value="",name="ceyi")
    private String ceyi;
        
    @ApiModelProperty(value="",name="fang")
    private String fang;
        
    @ApiModelProperty(value="",name="zipai")
    private String zipai;
        
    @ApiModelProperty(value="",name="shou")
    private String shou;
        
    @ApiModelProperty(value="",name="burn")
    private String burn;
        
    @ApiModelProperty(value="",name="ton")
    private String ton;
        
    @ApiModelProperty(value="",name="check")
    private String check;
        
    @ApiModelProperty(value="",name="pic")
    private String pic;
        
    @ApiModelProperty(value="新照片",name="pic2")
    private String pic2;
        
    @ApiModelProperty(value="",name="picdb")
    private Object picdb;
        
    @ApiModelProperty(value="",name="rcmd")
    private String rcmd;
        
    @ApiModelProperty(value="",name="time")
    private String time;
        
    @ApiModelProperty(value="",name="intro")
    private String intro;
        
    @ApiModelProperty(value="",name="sg")
    private String sg;
        
    @ApiModelProperty(value="",name="tz")
    private String tz;
        
    @ApiModelProperty(value="",name="xy")
    private String xy;
        
    @ApiModelProperty(value="",name="ej")
    private String ej;
        
    @ApiModelProperty(value="",name="bsl")
    private String bsl;
        
    @ApiModelProperty(value="",name="lsz")
    private String lsz;
        
    @ApiModelProperty(value="",name="lsy")
    private String lsy;
        
    @ApiModelProperty(value="",name="jsz")
    private String jsz;
        
    @ApiModelProperty(value="",name="jsy")
    private String jsy;
        
    @ApiModelProperty(value="",name="hbz")
    private String hbz;
        
    @ApiModelProperty(value="",name="admin")
    private String admin;
        
    @ApiModelProperty(value="",name="ip")
    private String ip;
        
    @ApiModelProperty(value="",name="tj")
    private String tj;
        
    @ApiModelProperty(value="",name="djr")
    private String djr;
        
    @ApiModelProperty(value="",name="xx")
    private String xx;
        
    @ApiModelProperty(value="",name="bx")
    private String bx;
        
    @ApiModelProperty(value="",name="nf")
    private Integer nf;
        
    @ApiModelProperty(value="",name="lastlogin")
    private Date lastlogin;
        
    @ApiModelProperty(value="",name="ipshow")
    private String ipshow;
        
    @ApiModelProperty(value="",name="homephone")
    private String homephone;
        
    @ApiModelProperty(value="",name="lb1")
    private Integer lb1;
        
    @ApiModelProperty(value="",name="lb2")
    private Integer lb2;
        
    @ApiModelProperty(value="",name="lb3")
    private Integer lb3;
        
    @ApiModelProperty(value="",name="xiang")
    private String xiang;
        
    @ApiModelProperty(value="",name="mail")
    private String mail;
        
    @ApiModelProperty(value="",name="xingp")
    private String xingp;
        
    @ApiModelProperty(value="",name="mingp")
    private String mingp;
        
    @ApiModelProperty(value="",name="mingzu")
    private String mingzu;
        
    @ApiModelProperty(value="",name="chushengdi")
    private String chushengdi;
        
    @ApiModelProperty(value="",name="jtphone")
    private String jtphone;
        
    @ApiModelProperty(value="",name="shouyigx")
    private String shouyigx;
        
    @ApiModelProperty(value="",name="shouyitel")
    private String shouyitel;
        
    @ApiModelProperty(value="",name="youbian")
    private String youbian;
        
    @ApiModelProperty(value="",name="wage")
    private String wage;
        
    @ApiModelProperty(value="",name="lmphone")
    private String lmphone;
        
    @ApiModelProperty(value="",name="leibie")
    private String leibie;
        
    @ApiModelProperty(value="",name="shouyi")
    private String shouyi;
        
    @ApiModelProperty(value="",name="lcpic")
    private String lcpic;
        
    @ApiModelProperty(value="",name="kspic")
    private String kspic;
        
    @ApiModelProperty(value="",name="lcmov")
    private String lcmov;
        
    @ApiModelProperty(value="",name="ksmov")
    private String ksmov;
        
    @ApiModelProperty(value="",name="cz")
    private String cz;
        
    @ApiModelProperty(value="",name="ny")
    private String ny;
        
    @ApiModelProperty(value="",name="ls")
    private String ls;
        
    @ApiModelProperty(value="",name="email")
    private String email;
        
    @ApiModelProperty(value="",name="xlfilename")
    private String xlfilename;
        
    @ApiModelProperty(value="",name="idzfilename")
    private String idzfilename;
        
    @ApiModelProperty(value="",name="idffilename")
    private String idffilename;
        
    @ApiModelProperty(value="短信通知数量",name="sms")
    private Integer sms;
        
    @ApiModelProperty(value="短信通知日期",name="smsDate")
    private String smsDate;
        
    @ApiModelProperty(value="",name="uemail")
    private Integer uemail;
        
    @ApiModelProperty(value="邮件通知日期",name="uemailDate")
    private String uemailDate;
        
    @ApiModelProperty(value="",name="zsSms")
    private Integer zsSms;
        
    @ApiModelProperty(value="知识更新短信发送时间",name="zsSmsDate")
    private String zsSmsDate;
        
    @ApiModelProperty(value="知识更新email",name="zsEmail")
    private Integer zsEmail;
        
    @ApiModelProperty(value="",name="zsEmailDate")
    private String zsEmailDate;

    private String searchType;

    private String searchContent;
    
}
