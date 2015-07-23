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
package com.aliyuncs.yundun.model.v20150416;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun.transform.v20150416.ListInstanceInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceInfosResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<InstanceInfo> infosList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<InstanceInfo> getInfosList() {
		return this.infosList;
	}

	public void setInfosList(List<InstanceInfo> infosList) {
		this.infosList = infosList;
	}

	public static class InstanceInfo {

		private String region;

		private String regionName;

		private String regionEnName;

		private String instanceName;

		private String instanceId;

		private String ip;

		private String internetIp;

		private String intranetIp;

		private Integer ddos;

		private Integer hostEvent;

		private Integer secureCheck;

		private Integer aegisStatus;

		private Integer waf;

		private Boolean isLock;

		private String lockType;

		private Integer unLockTimes;

		private String triggerTime;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getRegionEnName() {
			return this.regionEnName;
		}

		public void setRegionEnName(String regionEnName) {
			this.regionEnName = regionEnName;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public Integer getDdos() {
			return this.ddos;
		}

		public void setDdos(Integer ddos) {
			this.ddos = ddos;
		}

		public Integer getHostEvent() {
			return this.hostEvent;
		}

		public void setHostEvent(Integer hostEvent) {
			this.hostEvent = hostEvent;
		}

		public Integer getSecureCheck() {
			return this.secureCheck;
		}

		public void setSecureCheck(Integer secureCheck) {
			this.secureCheck = secureCheck;
		}

		public Integer getAegisStatus() {
			return this.aegisStatus;
		}

		public void setAegisStatus(Integer aegisStatus) {
			this.aegisStatus = aegisStatus;
		}

		public Integer getWaf() {
			return this.waf;
		}

		public void setWaf(Integer waf) {
			this.waf = waf;
		}

		public Boolean getIsLock() {
			return this.isLock;
		}

		public void setIsLock(Boolean isLock) {
			this.isLock = isLock;
		}

		public String getLockType() {
			return this.lockType;
		}

		public void setLockType(String lockType) {
			this.lockType = lockType;
		}

		public Integer getUnLockTimes() {
			return this.unLockTimes;
		}

		public void setUnLockTimes(Integer unLockTimes) {
			this.unLockTimes = unLockTimes;
		}

		public String getTriggerTime() {
			return this.triggerTime;
		}

		public void setTriggerTime(String triggerTime) {
			this.triggerTime = triggerTime;
		}
	}

	@Override
	public ListInstanceInfosResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceInfosResponseUnmarshaller.unmarshall(this, context);
	}
}
