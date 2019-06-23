/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package org.springblade.core.datascope.model;

import lombok.Data;
import org.springblade.core.datascope.enums.DataScopeEnum;

/**
 * 数据权限实体类
 *
 * @author Chill
 */
@Data
public class DataScope {
	/**
	 * 资源编号
	 */
	private String code;
	/**
	 * 数据权限字段
	 */
	private String column = "dept_id";
	/**
	 * 数据权限规则
	 */
	private Integer type = DataScopeEnum.ALL.getType();
	/**
	 * 数据权限规则值
	 */
	private String value;

}