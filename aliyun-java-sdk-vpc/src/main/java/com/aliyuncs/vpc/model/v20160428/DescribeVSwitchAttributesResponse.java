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
package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeVSwitchAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVSwitchAttributesResponse extends AcsResponse {

	private String requestId;

	private String vSwitchId;

	private String vpcId;

	private String status;

	private String cidrBlock;

	private String zoneId;

	private Long availableIpAddressCount;

	private String description;

	private String vSwitchName;

	private String creationTime;

	private Boolean isDefault;

	private List<CloudResourceSetType> cloudResources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public Long getAvailableIpAddressCount() {
		return this.availableIpAddressCount;
	}

	public void setAvailableIpAddressCount(Long availableIpAddressCount) {
		this.availableIpAddressCount = availableIpAddressCount;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVSwitchName() {
		return this.vSwitchName;
	}

	public void setVSwitchName(String vSwitchName) {
		this.vSwitchName = vSwitchName;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public List<CloudResourceSetType> getCloudResources() {
		return this.cloudResources;
	}

	public void setCloudResources(List<CloudResourceSetType> cloudResources) {
		this.cloudResources = cloudResources;
	}

	public static class CloudResourceSetType {

		private String resourceType;

		private Integer resourceCount;

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Integer getResourceCount() {
			return this.resourceCount;
		}

		public void setResourceCount(Integer resourceCount) {
			this.resourceCount = resourceCount;
		}
	}

	@Override
	public DescribeVSwitchAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeVSwitchAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
