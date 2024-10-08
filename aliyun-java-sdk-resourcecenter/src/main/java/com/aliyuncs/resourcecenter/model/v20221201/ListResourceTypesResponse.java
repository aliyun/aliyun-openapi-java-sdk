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

package com.aliyuncs.resourcecenter.model.v20221201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcecenter.transform.v20221201.ListResourceTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceTypesResponse extends AcsResponse {

	private String dynamicCode;

	private String dynamicMessage;

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private List<ResourceType> resourceTypes;

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public List<ResourceType> getResourceTypes() {
		return this.resourceTypes;
	}

	public void setResourceTypes(List<ResourceType> resourceTypes) {
		this.resourceTypes = resourceTypes;
	}

	public static class ResourceType {

		private Boolean authorized;

		private String productName;

		private String resourceType;

		private String resourceTypeName;

		private List<String> filterKeys;

		private CodeMapping codeMapping;

		private Urls urls;

		public Boolean getAuthorized() {
			return this.authorized;
		}

		public void setAuthorized(Boolean authorized) {
			this.authorized = authorized;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getResourceTypeName() {
			return this.resourceTypeName;
		}

		public void setResourceTypeName(String resourceTypeName) {
			this.resourceTypeName = resourceTypeName;
		}

		public List<String> getFilterKeys() {
			return this.filterKeys;
		}

		public void setFilterKeys(List<String> filterKeys) {
			this.filterKeys = filterKeys;
		}

		public CodeMapping getCodeMapping() {
			return this.codeMapping;
		}

		public void setCodeMapping(CodeMapping codeMapping) {
			this.codeMapping = codeMapping;
		}

		public Urls getUrls() {
			return this.urls;
		}

		public void setUrls(Urls urls) {
			this.urls = urls;
		}

		public static class CodeMapping {

			private String resourceGroup;

			private String tag;

			public String getResourceGroup() {
				return this.resourceGroup;
			}

			public void setResourceGroup(String resourceGroup) {
				this.resourceGroup = resourceGroup;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}
		}

		public static class Urls {

			private String productConsoleUrl;

			private String resourceConsoleUrl;

			public String getProductConsoleUrl() {
				return this.productConsoleUrl;
			}

			public void setProductConsoleUrl(String productConsoleUrl) {
				this.productConsoleUrl = productConsoleUrl;
			}

			public String getResourceConsoleUrl() {
				return this.resourceConsoleUrl;
			}

			public void setResourceConsoleUrl(String resourceConsoleUrl) {
				this.resourceConsoleUrl = resourceConsoleUrl;
			}
		}
	}

	@Override
	public ListResourceTypesResponse getInstance(UnmarshallerContext context) {
		return	ListResourceTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
