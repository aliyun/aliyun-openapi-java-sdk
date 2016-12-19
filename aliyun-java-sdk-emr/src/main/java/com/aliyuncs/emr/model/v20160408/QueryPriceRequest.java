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
package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryPriceRequest extends RpcAcsRequest<QueryPriceResponse> {
	
	public QueryPriceRequest() {
		super("Emr", "2016-04-08", "QueryPrice");
	}

	private Long resourceOwnerId;

	private String zoneId;

	private String masterInstanceType;

	private String coreInstanceType;

	private String taskInstanceType;

	private Integer masterInstanceQuantity;

	private Integer coreInstanceQuantity;

	private Integer taskInstanceQuantity;

	private String masterDiskType;

	private String coreDiskType;

	private String taskDiskType;

	private Integer masterDiskQuantity;

	private Integer coreDiskQuantity;

	private Integer taskDiskQuantity;

	private Integer duration;

	private Boolean ioOptimized;

	private String chargeType;

	private String netType;

	private Integer period;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		putQueryParameter("ZoneId", zoneId);
	}

	public String getMasterInstanceType() {
		return this.masterInstanceType;
	}

	public void setMasterInstanceType(String masterInstanceType) {
		this.masterInstanceType = masterInstanceType;
		putQueryParameter("MasterInstanceType", masterInstanceType);
	}

	public String getCoreInstanceType() {
		return this.coreInstanceType;
	}

	public void setCoreInstanceType(String coreInstanceType) {
		this.coreInstanceType = coreInstanceType;
		putQueryParameter("CoreInstanceType", coreInstanceType);
	}

	public String getTaskInstanceType() {
		return this.taskInstanceType;
	}

	public void setTaskInstanceType(String taskInstanceType) {
		this.taskInstanceType = taskInstanceType;
		putQueryParameter("TaskInstanceType", taskInstanceType);
	}

	public Integer getMasterInstanceQuantity() {
		return this.masterInstanceQuantity;
	}

	public void setMasterInstanceQuantity(Integer masterInstanceQuantity) {
		this.masterInstanceQuantity = masterInstanceQuantity;
		putQueryParameter("MasterInstanceQuantity", masterInstanceQuantity);
	}

	public Integer getCoreInstanceQuantity() {
		return this.coreInstanceQuantity;
	}

	public void setCoreInstanceQuantity(Integer coreInstanceQuantity) {
		this.coreInstanceQuantity = coreInstanceQuantity;
		putQueryParameter("CoreInstanceQuantity", coreInstanceQuantity);
	}

	public Integer getTaskInstanceQuantity() {
		return this.taskInstanceQuantity;
	}

	public void setTaskInstanceQuantity(Integer taskInstanceQuantity) {
		this.taskInstanceQuantity = taskInstanceQuantity;
		putQueryParameter("TaskInstanceQuantity", taskInstanceQuantity);
	}

	public String getMasterDiskType() {
		return this.masterDiskType;
	}

	public void setMasterDiskType(String masterDiskType) {
		this.masterDiskType = masterDiskType;
		putQueryParameter("MasterDiskType", masterDiskType);
	}

	public String getCoreDiskType() {
		return this.coreDiskType;
	}

	public void setCoreDiskType(String coreDiskType) {
		this.coreDiskType = coreDiskType;
		putQueryParameter("CoreDiskType", coreDiskType);
	}

	public String getTaskDiskType() {
		return this.taskDiskType;
	}

	public void setTaskDiskType(String taskDiskType) {
		this.taskDiskType = taskDiskType;
		putQueryParameter("TaskDiskType", taskDiskType);
	}

	public Integer getMasterDiskQuantity() {
		return this.masterDiskQuantity;
	}

	public void setMasterDiskQuantity(Integer masterDiskQuantity) {
		this.masterDiskQuantity = masterDiskQuantity;
		putQueryParameter("MasterDiskQuantity", masterDiskQuantity);
	}

	public Integer getCoreDiskQuantity() {
		return this.coreDiskQuantity;
	}

	public void setCoreDiskQuantity(Integer coreDiskQuantity) {
		this.coreDiskQuantity = coreDiskQuantity;
		putQueryParameter("CoreDiskQuantity", coreDiskQuantity);
	}

	public Integer getTaskDiskQuantity() {
		return this.taskDiskQuantity;
	}

	public void setTaskDiskQuantity(Integer taskDiskQuantity) {
		this.taskDiskQuantity = taskDiskQuantity;
		putQueryParameter("TaskDiskQuantity", taskDiskQuantity);
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		putQueryParameter("Duration", duration);
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
		putQueryParameter("IoOptimized", ioOptimized);
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		putQueryParameter("ChargeType", chargeType);
	}

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
		putQueryParameter("NetType", netType);
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		putQueryParameter("Period", period);
	}

	@Override
	public Class<QueryPriceResponse> getResponseClass() {
		return QueryPriceResponse.class;
	}

}
