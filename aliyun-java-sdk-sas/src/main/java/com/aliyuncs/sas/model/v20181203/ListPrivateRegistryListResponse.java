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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ListPrivateRegistryListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrivateRegistryListResponse extends AcsResponse {

	private String requestId;

	private List<ImageRegistryInfo> imageRegistryInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImageRegistryInfo> getImageRegistryInfos() {
		return this.imageRegistryInfos;
	}

	public void setImageRegistryInfos(List<ImageRegistryInfo> imageRegistryInfos) {
		this.imageRegistryInfos = imageRegistryInfos;
	}

	public static class ImageRegistryInfo {

		private String vpcId;

		private String token;

		private String whiteList;

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

		private String registryName;

		private Long persistenceDay;

		private String jenkinsEnv;

		private Integer transPerHour;

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

		public String getWhiteList() {
			return this.whiteList;
		}

		public void setWhiteList(String whiteList) {
			this.whiteList = whiteList;
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

		public String getRegistryName() {
			return this.registryName;
		}

		public void setRegistryName(String registryName) {
			this.registryName = registryName;
		}

		public Long getPersistenceDay() {
			return this.persistenceDay;
		}

		public void setPersistenceDay(Long persistenceDay) {
			this.persistenceDay = persistenceDay;
		}

		public String getJenkinsEnv() {
			return this.jenkinsEnv;
		}

		public void setJenkinsEnv(String jenkinsEnv) {
			this.jenkinsEnv = jenkinsEnv;
		}

		public Integer getTransPerHour() {
			return this.transPerHour;
		}

		public void setTransPerHour(Integer transPerHour) {
			this.transPerHour = transPerHour;
		}
	}

	@Override
	public ListPrivateRegistryListResponse getInstance(UnmarshallerContext context) {
		return	ListPrivateRegistryListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
