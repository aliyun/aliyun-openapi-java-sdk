/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model.v20170301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListAlarmRequest extends RpcAcsRequest<ListAlarmResponse> {
	
	public ListAlarmRequest() {
		super("Cms", "2017-03-01", "ListAlarm");
	}

	private String callby_cms_owner;

	private String id;

	private String name;

	private String namespace;

	private String dimension;

	private String state;

	private Boolean isEnable;

	private Integer pageNumber;

	private Integer pageSize;

	public String getcallby_cms_owner() {
		return this.callby_cms_owner;
	}

	public void setcallby_cms_owner(String callby_cms_owner) {
		this.callby_cms_owner = callby_cms_owner;
		putQueryParameter("callby_cms_owner", callby_cms_owner);
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		putQueryParameter("Id", id);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		putQueryParameter("Name", name);
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		putQueryParameter("Namespace", namespace);
	}

	public String getDimension() {
		return this.dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
		putQueryParameter("Dimension", dimension);
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		putQueryParameter("State", state);
	}

	public Boolean getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
		putQueryParameter("IsEnable", isEnable);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		putQueryParameter("PageNumber", pageNumber);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	@Override
	public Class<ListAlarmResponse> getResponseClass() {
		return ListAlarmResponse.class;
	}

}
