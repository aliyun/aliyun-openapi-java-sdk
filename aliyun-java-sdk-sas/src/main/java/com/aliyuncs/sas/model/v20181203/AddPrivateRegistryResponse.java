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
import com.aliyuncs.sas.transform.v20181203.AddPrivateRegistryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddPrivateRegistryResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String vpcId;

		private String token;

		private Integer transPerHour;

		private Long aliUid;

		private String registryType;

		private String domainName;

		private String regionId;

		private String password;

		private Long netType;

		private String registryVersion;

		private Long protocolType;

		private String registryHostIp;

		private String userName;

		private Long id;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public Integer getTransPerHour() {
			return this.transPerHour;
		}

		public void setTransPerHour(Integer transPerHour) {
			this.transPerHour = transPerHour;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getRegistryType() {
			return this.registryType;
		}

		public void setRegistryType(String registryType) {
			this.registryType = registryType;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Long getNetType() {
			return this.netType;
		}

		public void setNetType(Long netType) {
			this.netType = netType;
		}

		public String getRegistryVersion() {
			return this.registryVersion;
		}

		public void setRegistryVersion(String registryVersion) {
			this.registryVersion = registryVersion;
		}

		public Long getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(Long protocolType) {
			this.protocolType = protocolType;
		}

		public String getRegistryHostIp() {
			return this.registryHostIp;
		}

		public void setRegistryHostIp(String registryHostIp) {
			this.registryHostIp = registryHostIp;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public AddPrivateRegistryResponse getInstance(UnmarshallerContext context) {
		return	AddPrivateRegistryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
