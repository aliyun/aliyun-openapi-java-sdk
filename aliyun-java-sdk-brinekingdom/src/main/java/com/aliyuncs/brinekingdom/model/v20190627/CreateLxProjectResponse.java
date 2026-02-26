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

package com.aliyuncs.brinekingdom.model.v20190627;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.brinekingdom.transform.v20190627.CreateLxProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLxProjectResponse extends AcsResponse {

	private Boolean success;

	private String errorCode;

	private String msg;

	private Long totalItems;

	private List<DataItem> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String constructionTeam;

		private String sourceNumber;

		private Long projectId;

		private String projectNo;

		private String user;

		private String remark;

		private String projectSource;

		private String extInfo;

		private String systemSource;

		private Integer isStanderProcess;

		private String cancelProjectUrl;

		private String sourceSystemUrl;

		private String initWiringUrl;

		public String getConstructionTeam() {
			return this.constructionTeam;
		}

		public void setConstructionTeam(String constructionTeam) {
			this.constructionTeam = constructionTeam;
		}

		public String getSourceNumber() {
			return this.sourceNumber;
		}

		public void setSourceNumber(String sourceNumber) {
			this.sourceNumber = sourceNumber;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getProjectNo() {
			return this.projectNo;
		}

		public void setProjectNo(String projectNo) {
			this.projectNo = projectNo;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getProjectSource() {
			return this.projectSource;
		}

		public void setProjectSource(String projectSource) {
			this.projectSource = projectSource;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public String getSystemSource() {
			return this.systemSource;
		}

		public void setSystemSource(String systemSource) {
			this.systemSource = systemSource;
		}

		public Integer getIsStanderProcess() {
			return this.isStanderProcess;
		}

		public void setIsStanderProcess(Integer isStanderProcess) {
			this.isStanderProcess = isStanderProcess;
		}

		public String getCancelProjectUrl() {
			return this.cancelProjectUrl;
		}

		public void setCancelProjectUrl(String cancelProjectUrl) {
			this.cancelProjectUrl = cancelProjectUrl;
		}

		public String getSourceSystemUrl() {
			return this.sourceSystemUrl;
		}

		public void setSourceSystemUrl(String sourceSystemUrl) {
			this.sourceSystemUrl = sourceSystemUrl;
		}

		public String getInitWiringUrl() {
			return this.initWiringUrl;
		}

		public void setInitWiringUrl(String initWiringUrl) {
			this.initWiringUrl = initWiringUrl;
		}
	}

	@Override
	public CreateLxProjectResponse getInstance(UnmarshallerContext context) {
		return	CreateLxProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
