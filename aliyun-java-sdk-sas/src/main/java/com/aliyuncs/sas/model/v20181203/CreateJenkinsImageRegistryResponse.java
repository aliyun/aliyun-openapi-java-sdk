/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.CreateJenkinsImageRegistryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateJenkinsImageRegistryResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private Long timeCost;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Long getTimeCost() {
		return this.timeCost;
	}

	public void setTimeCost(Long timeCost) {
		this.timeCost = timeCost;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private Long aliUid;

		private String registryName;

		private String registryType;

		private Integer protocolType;

		private Integer netType;

		private String vpcId;

		private String registryHostIp;

		private String domainName;

		private String userName;

		private String password;

		private String regionId;

		private String token;

		private String whiteList;

		private String blackList;

		private Integer transPerHour;

		private Integer persistenceDay;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getRegistryName() {
			return this.registryName;
		}

		public void setRegistryName(String registryName) {
			this.registryName = registryName;
		}

		public String getRegistryType() {
			return this.registryType;
		}

		public void setRegistryType(String registryType) {
			this.registryType = registryType;
		}

		public Integer getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(Integer protocolType) {
			this.protocolType = protocolType;
		}

		public Integer getNetType() {
			return this.netType;
		}

		public void setNetType(Integer netType) {
			this.netType = netType;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getRegistryHostIp() {
			return this.registryHostIp;
		}

		public void setRegistryHostIp(String registryHostIp) {
			this.registryHostIp = registryHostIp;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getWhiteList() {
			return this.whiteList;
		}

		public void setWhiteList(String whiteList) {
			this.whiteList = whiteList;
		}

		public String getBlackList() {
			return this.blackList;
		}

		public void setBlackList(String blackList) {
			this.blackList = blackList;
		}

		public Integer getTransPerHour() {
			return this.transPerHour;
		}

		public void setTransPerHour(Integer transPerHour) {
			this.transPerHour = transPerHour;
		}

		public Integer getPersistenceDay() {
			return this.persistenceDay;
		}

		public void setPersistenceDay(Integer persistenceDay) {
			this.persistenceDay = persistenceDay;
		}
	}

	@Override
	public CreateJenkinsImageRegistryResponse getInstance(UnmarshallerContext context) {
		return	CreateJenkinsImageRegistryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
