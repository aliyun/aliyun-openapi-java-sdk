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
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeAbnormalDBInstancesRequest extends RpcAcsRequest<DescribeAbnormalDBInstancesResponse> {
	
	public DescribeAbnormalDBInstancesRequest() {
		super("Rds", "2014-08-15", "DescribeAbnormalDBInstances");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String clientToken;

	private String proxyId;

	private String dBInstanceId;

	private Integer pageSize;

	private Integer pageNumber;

	private String tag1key;

	private String tag2key;

	private String tag3key;

	private String tag4key;

	private String tag5key;

	private String tag1value;

	private String tag2value;

	private String tag3value;

	private String tag4value;

	private String tag5value;

	private String ownerAccount;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		putQueryParameter("ClientToken", clientToken);
	}

	public String getproxyId() {
		return this.proxyId;
	}

	public void setproxyId(String proxyId) {
		this.proxyId = proxyId;
		putQueryParameter("proxyId", proxyId);
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		putQueryParameter("DBInstanceId", dBInstanceId);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		putQueryParameter("PageNumber", pageNumber);
	}

	public String getTag1key() {
		return this.tag1key;
	}

	public void setTag1key(String tag1key) {
		this.tag1key = tag1key;
		putQueryParameter("Tag.1.key", tag1key);
	}

	public String getTag2key() {
		return this.tag2key;
	}

	public void setTag2key(String tag2key) {
		this.tag2key = tag2key;
		putQueryParameter("Tag.2.key", tag2key);
	}

	public String getTag3key() {
		return this.tag3key;
	}

	public void setTag3key(String tag3key) {
		this.tag3key = tag3key;
		putQueryParameter("Tag.3.key", tag3key);
	}

	public String getTag4key() {
		return this.tag4key;
	}

	public void setTag4key(String tag4key) {
		this.tag4key = tag4key;
		putQueryParameter("Tag.4.key", tag4key);
	}

	public String getTag5key() {
		return this.tag5key;
	}

	public void setTag5key(String tag5key) {
		this.tag5key = tag5key;
		putQueryParameter("Tag.5.key", tag5key);
	}

	public String getTag1value() {
		return this.tag1value;
	}

	public void setTag1value(String tag1value) {
		this.tag1value = tag1value;
		putQueryParameter("Tag.1.value", tag1value);
	}

	public String getTag2value() {
		return this.tag2value;
	}

	public void setTag2value(String tag2value) {
		this.tag2value = tag2value;
		putQueryParameter("Tag.2.value", tag2value);
	}

	public String getTag3value() {
		return this.tag3value;
	}

	public void setTag3value(String tag3value) {
		this.tag3value = tag3value;
		putQueryParameter("Tag.3.value", tag3value);
	}

	public String getTag4value() {
		return this.tag4value;
	}

	public void setTag4value(String tag4value) {
		this.tag4value = tag4value;
		putQueryParameter("Tag.4.value", tag4value);
	}

	public String getTag5value() {
		return this.tag5value;
	}

	public void setTag5value(String tag5value) {
		this.tag5value = tag5value;
		putQueryParameter("Tag.5.value", tag5value);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<DescribeAbnormalDBInstancesResponse> getResponseClass() {
		return DescribeAbnormalDBInstancesResponse.class;
	}

}
