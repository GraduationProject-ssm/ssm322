package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 老师课程信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-28 14:52:36
 */
@TableName("laoshikechengxinxi")
public class LaoshikechengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LaoshikechengxinxiEntity() {
		
	}
	
	public LaoshikechengxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教师账号
	 */
					
	private String jiaoshizhanghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 课程号
	 */
					
	private String kechenghao;
	
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 课程学分
	 */
					
	private Integer kechengxuefen;
	
	/**
	 * 学时数
	 */
					
	private Integer xueshishu;
	
	/**
	 * 任课院系
	 */
					
	private String renkeyuanxi;
	
	/**
	 * 任课年级
	 */
					
	private String renkenianji;
	
	/**
	 * 任课班级
	 */
					
	private String renkebanji;
	
	/**
	 * 上课时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shangkeshijian;
	
	/**
	 * 上课地点
	 */
					
	private String shangkedidian;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教师账号
	 */
	public void setJiaoshizhanghao(String jiaoshizhanghao) {
		this.jiaoshizhanghao = jiaoshizhanghao;
	}
	/**
	 * 获取：教师账号
	 */
	public String getJiaoshizhanghao() {
		return jiaoshizhanghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：课程号
	 */
	public void setKechenghao(String kechenghao) {
		this.kechenghao = kechenghao;
	}
	/**
	 * 获取：课程号
	 */
	public String getKechenghao() {
		return kechenghao;
	}
	/**
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
	/**
	 * 设置：课程学分
	 */
	public void setKechengxuefen(Integer kechengxuefen) {
		this.kechengxuefen = kechengxuefen;
	}
	/**
	 * 获取：课程学分
	 */
	public Integer getKechengxuefen() {
		return kechengxuefen;
	}
	/**
	 * 设置：学时数
	 */
	public void setXueshishu(Integer xueshishu) {
		this.xueshishu = xueshishu;
	}
	/**
	 * 获取：学时数
	 */
	public Integer getXueshishu() {
		return xueshishu;
	}
	/**
	 * 设置：任课院系
	 */
	public void setRenkeyuanxi(String renkeyuanxi) {
		this.renkeyuanxi = renkeyuanxi;
	}
	/**
	 * 获取：任课院系
	 */
	public String getRenkeyuanxi() {
		return renkeyuanxi;
	}
	/**
	 * 设置：任课年级
	 */
	public void setRenkenianji(String renkenianji) {
		this.renkenianji = renkenianji;
	}
	/**
	 * 获取：任课年级
	 */
	public String getRenkenianji() {
		return renkenianji;
	}
	/**
	 * 设置：任课班级
	 */
	public void setRenkebanji(String renkebanji) {
		this.renkebanji = renkebanji;
	}
	/**
	 * 获取：任课班级
	 */
	public String getRenkebanji() {
		return renkebanji;
	}
	/**
	 * 设置：上课时间
	 */
	public void setShangkeshijian(Date shangkeshijian) {
		this.shangkeshijian = shangkeshijian;
	}
	/**
	 * 获取：上课时间
	 */
	public Date getShangkeshijian() {
		return shangkeshijian;
	}
	/**
	 * 设置：上课地点
	 */
	public void setShangkedidian(String shangkedidian) {
		this.shangkedidian = shangkedidian;
	}
	/**
	 * 获取：上课地点
	 */
	public String getShangkedidian() {
		return shangkedidian;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}

}
