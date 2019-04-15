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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeWebshellResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebshellResponse extends AcsResponse {

	private String requestId;

	private List<WebshellListItem> webshellList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<WebshellListItem> getWebshellList() {
		return this.webshellList;
	}

	public void setWebshellList(List<WebshellListItem> webshellList) {
		this.webshellList = webshellList;
	}

	public static class WebshellListItem {

		private String os;

		private String instanceName;

		private Long groupId;

		private String ip;

		private String uuid;

		private String foundTime;

		private String instanceId;

		private String trojanType;

		private String firstFoundTime;

		private Long trojanSize;

		private String domain;

		private String trojanPath;

		private String region;

		private Integer status;

		public String getOs() {
			return this.os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getFoundTime() {
			return this.foundTime;
		}

		public void setFoundTime(String foundTime) {
			this.foundTime = foundTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getTrojanType() {
			return this.trojanType;
		}

		public void setTrojanType(String trojanType) {
			this.trojanType = trojanType;
		}

		public String getFirstFoundTime() {
			return this.firstFoundTime;
		}

		public void setFirstFoundTime(String firstFoundTime) {
			this.firstFoundTime = firstFoundTime;
		}

		public Long getTrojanSize() {
			return this.trojanSize;
		}

		public void setTrojanSize(Long trojanSize) {
			this.trojanSize = trojanSize;
		}

		public String getBizDomain() {
			return this.domain;
		}

		public void setBizDomain(String domain) {
			this.domain = domain;
		}

		/**
		 * @deprecated use getBizDomain instead of this.
		 */
		@Deprecated
		public String getDomain() {
			return this.domain;
		}

		/**
		 * @deprecated use setBizDomain instead of this.
		 */
		@Deprecated
		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getTrojanPath() {
			return this.trojanPath;
		}

		public void setTrojanPath(String trojanPath) {
			this.trojanPath = trojanPath;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public DescribeWebshellResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebshellResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
