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

package com.aliyuncs.csb.model.v20171118;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csb.transform.v20171118.GetProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProjectResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Project> projectList;

		public List<Project> getProjectList() {
			return this.projectList;
		}

		public void setProjectList(List<Project> projectList) {
			this.projectList = projectList;
		}

		public static class Project {

			private Integer apiNum;

			private Long csbId;

			private Integer deleteFlag;

			private String description;

			private Long gmtCreate;

			private Long gmtModified;

			private Long id;

			private String interfaceJarLocation;

			private String interfaceJarName;

			private String jarFileKey;

			private String ownerId;

			private String projectName;

			private String projectOwnerEmail;

			private String projectOwnerName;

			private String projectOwnerPhoneNum;

			private Integer status;

			private String userId;

			public Integer getApiNum() {
				return this.apiNum;
			}

			public void setApiNum(Integer apiNum) {
				this.apiNum = apiNum;
			}

			public Long getCsbId() {
				return this.csbId;
			}

			public void setCsbId(Long csbId) {
				this.csbId = csbId;
			}

			public Integer getDeleteFlag() {
				return this.deleteFlag;
			}

			public void setDeleteFlag(Integer deleteFlag) {
				this.deleteFlag = deleteFlag;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getInterfaceJarLocation() {
				return this.interfaceJarLocation;
			}

			public void setInterfaceJarLocation(String interfaceJarLocation) {
				this.interfaceJarLocation = interfaceJarLocation;
			}

			public String getInterfaceJarName() {
				return this.interfaceJarName;
			}

			public void setInterfaceJarName(String interfaceJarName) {
				this.interfaceJarName = interfaceJarName;
			}

			public String getJarFileKey() {
				return this.jarFileKey;
			}

			public void setJarFileKey(String jarFileKey) {
				this.jarFileKey = jarFileKey;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getProjectOwnerEmail() {
				return this.projectOwnerEmail;
			}

			public void setProjectOwnerEmail(String projectOwnerEmail) {
				this.projectOwnerEmail = projectOwnerEmail;
			}

			public String getProjectOwnerName() {
				return this.projectOwnerName;
			}

			public void setProjectOwnerName(String projectOwnerName) {
				this.projectOwnerName = projectOwnerName;
			}

			public String getProjectOwnerPhoneNum() {
				return this.projectOwnerPhoneNum;
			}

			public void setProjectOwnerPhoneNum(String projectOwnerPhoneNum) {
				this.projectOwnerPhoneNum = projectOwnerPhoneNum;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public GetProjectResponse getInstance(UnmarshallerContext context) {
		return	GetProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
