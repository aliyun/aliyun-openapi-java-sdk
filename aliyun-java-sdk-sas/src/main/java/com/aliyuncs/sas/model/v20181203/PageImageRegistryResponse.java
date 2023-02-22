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
import com.aliyuncs.sas.transform.v20181203.PageImageRegistryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PageImageRegistryResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private List<ListItem> list;

	private PageInfo pageInfo;

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

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ListItem {

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

		private Integer imageCount;

		private String jenkinsEnv;

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

		public Integer getImageCount() {
			return this.imageCount;
		}

		public void setImageCount(Integer imageCount) {
			this.imageCount = imageCount;
		}

		public String getJenkinsEnv() {
			return this.jenkinsEnv;
		}

		public void setJenkinsEnv(String jenkinsEnv) {
			this.jenkinsEnv = jenkinsEnv;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
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

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public PageImageRegistryResponse getInstance(UnmarshallerContext context) {
		return	PageImageRegistryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
