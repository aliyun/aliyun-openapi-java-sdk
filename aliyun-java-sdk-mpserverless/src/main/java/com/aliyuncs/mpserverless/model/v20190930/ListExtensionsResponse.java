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

package com.aliyuncs.mpserverless.model.v20190930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpserverless.transform.v20190930.ListExtensionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExtensionsResponse extends AcsResponse {

	private String httpStatusCode;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<ExtensionsItem> extensions;

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ExtensionsItem> getExtensions() {
		return this.extensions;
	}

	public void setExtensions(List<ExtensionsItem> extensions) {
		this.extensions = extensions;
	}

	public static class ExtensionsItem {

		private String extensionId;

		private String extensionName;

		private String extensionDesc;

		private String extensionDocumentationLink;

		private String enabled;

		public String getExtensionId() {
			return this.extensionId;
		}

		public void setExtensionId(String extensionId) {
			this.extensionId = extensionId;
		}

		public String getExtensionName() {
			return this.extensionName;
		}

		public void setExtensionName(String extensionName) {
			this.extensionName = extensionName;
		}

		public String getExtensionDesc() {
			return this.extensionDesc;
		}

		public void setExtensionDesc(String extensionDesc) {
			this.extensionDesc = extensionDesc;
		}

		public String getExtensionDocumentationLink() {
			return this.extensionDocumentationLink;
		}

		public void setExtensionDocumentationLink(String extensionDocumentationLink) {
			this.extensionDocumentationLink = extensionDocumentationLink;
		}

		public String getEnabled() {
			return this.enabled;
		}

		public void setEnabled(String enabled) {
			this.enabled = enabled;
		}
	}

	@Override
	public ListExtensionsResponse getInstance(UnmarshallerContext context) {
		return	ListExtensionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
