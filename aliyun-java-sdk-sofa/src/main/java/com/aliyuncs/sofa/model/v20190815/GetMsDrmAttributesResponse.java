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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetMsDrmAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMsDrmAttributesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private DrmAttribute drmAttribute;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public DrmAttribute getDrmAttribute() {
		return this.drmAttribute;
	}

	public void setDrmAttribute(DrmAttribute drmAttribute) {
		this.drmAttribute = drmAttribute;
	}

	public static class DrmAttribute {

		private String attributeName;

		private String dataId;

		private Long id;

		private String instanceId;

		private String name;

		private Long parentId;

		private Parent parent;

		public String getAttributeName() {
			return this.attributeName;
		}

		public void setAttributeName(String attributeName) {
			this.attributeName = attributeName;
		}

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public Parent getParent() {
			return this.parent;
		}

		public void setParent(Parent parent) {
			this.parent = parent;
		}

		public static class Parent {

			private String appName;

			private Long id;

			private String instanceId;

			private String name;

			private String region;

			private String resourceDomain;

			private String resourceId;

			private String resourceVersion;

			private String type;

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getResourceDomain() {
				return this.resourceDomain;
			}

			public void setResourceDomain(String resourceDomain) {
				this.resourceDomain = resourceDomain;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceVersion() {
				return this.resourceVersion;
			}

			public void setResourceVersion(String resourceVersion) {
				this.resourceVersion = resourceVersion;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public GetMsDrmAttributesResponse getInstance(UnmarshallerContext context) {
		return	GetMsDrmAttributesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
