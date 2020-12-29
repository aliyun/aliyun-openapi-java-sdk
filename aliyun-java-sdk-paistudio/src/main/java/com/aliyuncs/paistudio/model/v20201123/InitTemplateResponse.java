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

package com.aliyuncs.paistudio.model.v20201123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.paistudio.transform.v20201123.InitTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InitTemplateResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String content;

		private String description;

		private String experimentId;

		private String gmtCreate;

		private String gmtDeleted;

		private String gmtModified;

		private Integer id;

		private Boolean isDeleted;

		private String name;

		private String operatorCreate;

		private String operatorDeleted;

		private String operatorModified;

		private String parentUserId;

		private Integer version;

		private String workspaceId;

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExperimentId() {
			return this.experimentId;
		}

		public void setExperimentId(String experimentId) {
			this.experimentId = experimentId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtDeleted() {
			return this.gmtDeleted;
		}

		public void setGmtDeleted(String gmtDeleted) {
			this.gmtDeleted = gmtDeleted;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Boolean getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOperatorCreate() {
			return this.operatorCreate;
		}

		public void setOperatorCreate(String operatorCreate) {
			this.operatorCreate = operatorCreate;
		}

		public String getOperatorDeleted() {
			return this.operatorDeleted;
		}

		public void setOperatorDeleted(String operatorDeleted) {
			this.operatorDeleted = operatorDeleted;
		}

		public String getOperatorModified() {
			return this.operatorModified;
		}

		public void setOperatorModified(String operatorModified) {
			this.operatorModified = operatorModified;
		}

		public String getParentUserId() {
			return this.parentUserId;
		}

		public void setParentUserId(String parentUserId) {
			this.parentUserId = parentUserId;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}
	}

	@Override
	public InitTemplateResponse getInstance(UnmarshallerContext context) {
		return	InitTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
