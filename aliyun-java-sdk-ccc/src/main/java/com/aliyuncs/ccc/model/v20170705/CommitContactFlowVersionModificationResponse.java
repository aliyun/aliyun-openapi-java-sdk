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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.CommitContactFlowVersionModificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CommitContactFlowVersionModificationResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private ContactFlowVersion contactFlowVersion;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public ContactFlowVersion getContactFlowVersion() {
		return this.contactFlowVersion;
	}

	public void setContactFlowVersion(ContactFlowVersion contactFlowVersion) {
		this.contactFlowVersion = contactFlowVersion;
	}

	public static class ContactFlowVersion {

		private String contactFlowVersionId;

		private String version;

		private String contactFlowVersionDescription;

		private String canvas;

		private String content;

		private String lastModified;

		private String lastModifiedBy;

		private String lockedBy;

		private String status;

		public String getContactFlowVersionId() {
			return this.contactFlowVersionId;
		}

		public void setContactFlowVersionId(String contactFlowVersionId) {
			this.contactFlowVersionId = contactFlowVersionId;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getContactFlowVersionDescription() {
			return this.contactFlowVersionDescription;
		}

		public void setContactFlowVersionDescription(String contactFlowVersionDescription) {
			this.contactFlowVersionDescription = contactFlowVersionDescription;
		}

		public String getCanvas() {
			return this.canvas;
		}

		public void setCanvas(String canvas) {
			this.canvas = canvas;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(String lastModified) {
			this.lastModified = lastModified;
		}

		public String getLastModifiedBy() {
			return this.lastModifiedBy;
		}

		public void setLastModifiedBy(String lastModifiedBy) {
			this.lastModifiedBy = lastModifiedBy;
		}

		public String getLockedBy() {
			return this.lockedBy;
		}

		public void setLockedBy(String lockedBy) {
			this.lockedBy = lockedBy;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public CommitContactFlowVersionModificationResponse getInstance(UnmarshallerContext context) {
		return	CommitContactFlowVersionModificationResponseUnmarshaller.unmarshall(this, context);
	}
}
