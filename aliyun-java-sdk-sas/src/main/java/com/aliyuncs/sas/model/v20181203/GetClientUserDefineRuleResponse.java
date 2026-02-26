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
import com.aliyuncs.sas.transform.v20181203.GetClientUserDefineRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClientUserDefineRuleResponse extends AcsResponse {

	private String requestId;

	private UserDefineRuleDetail userDefineRuleDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UserDefineRuleDetail getUserDefineRuleDetail() {
		return this.userDefineRuleDetail;
	}

	public void setUserDefineRuleDetail(UserDefineRuleDetail userDefineRuleDetail) {
		this.userDefineRuleDetail = userDefineRuleDetail;
	}

	public static class UserDefineRuleDetail {

		private Integer type;

		private String actionType;

		private Long gmtCreate;

		private String md5List;

		private Long gmtModified;

		private String name;

		private Long id;

		private String procPath;

		private String cmdline;

		private String platform;

		private String iP;

		private Integer port;

		private String filePath;

		private String newFilePath;

		private String registryKey;

		private String registryContent;

		private String parentProcPath;

		private String parentCmdline;

		private String portStr;

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getMd5List() {
			return this.md5List;
		}

		public void setMd5List(String md5List) {
			this.md5List = md5List;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProcPath() {
			return this.procPath;
		}

		public void setProcPath(String procPath) {
			this.procPath = procPath;
		}

		public String getCmdline() {
			return this.cmdline;
		}

		public void setCmdline(String cmdline) {
			this.cmdline = cmdline;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getFilePath() {
			return this.filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getNewFilePath() {
			return this.newFilePath;
		}

		public void setNewFilePath(String newFilePath) {
			this.newFilePath = newFilePath;
		}

		public String getRegistryKey() {
			return this.registryKey;
		}

		public void setRegistryKey(String registryKey) {
			this.registryKey = registryKey;
		}

		public String getRegistryContent() {
			return this.registryContent;
		}

		public void setRegistryContent(String registryContent) {
			this.registryContent = registryContent;
		}

		public String getParentProcPath() {
			return this.parentProcPath;
		}

		public void setParentProcPath(String parentProcPath) {
			this.parentProcPath = parentProcPath;
		}

		public String getParentCmdline() {
			return this.parentCmdline;
		}

		public void setParentCmdline(String parentCmdline) {
			this.parentCmdline = parentCmdline;
		}

		public String getPortStr() {
			return this.portStr;
		}

		public void setPortStr(String portStr) {
			this.portStr = portStr;
		}
	}

	@Override
	public GetClientUserDefineRuleResponse getInstance(UnmarshallerContext context) {
		return	GetClientUserDefineRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
