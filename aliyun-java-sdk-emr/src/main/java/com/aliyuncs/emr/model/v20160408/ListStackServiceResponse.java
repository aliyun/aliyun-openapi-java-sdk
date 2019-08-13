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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListStackServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStackServiceResponse extends AcsResponse {

	private String requestId;

	private String stackName;

	private String stackVersion;

	private List<Service> serviceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStackName() {
		return this.stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
	}

	public String getStackVersion() {
		return this.stackVersion;
	}

	public void setStackVersion(String stackVersion) {
		this.stackVersion = stackVersion;
	}

	public List<Service> getServiceList() {
		return this.serviceList;
	}

	public void setServiceList(List<Service> serviceList) {
		this.serviceList = serviceList;
	}

	public static class Service {

		private String serviceName;

		private String displayName;

		private String version;

		private String ecmVersion;

		private String comment;

		private List<Component> componentList;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getBizVersion() {
			return this.version;
		}

		public void setBizVersion(String version) {
			this.version = version;
		}

		/**
		 * @deprecated use getBizVersion instead of this.
		 */
		@Deprecated
		public String getVersion() {
			return this.version;
		}

		/**
		 * @deprecated use setBizVersion instead of this.
		 */
		@Deprecated
		public void setVersion(String version) {
			this.version = version;
		}

		public String getEcmVersion() {
			return this.ecmVersion;
		}

		public void setEcmVersion(String ecmVersion) {
			this.ecmVersion = ecmVersion;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public List<Component> getComponentList() {
			return this.componentList;
		}

		public void setComponentList(List<Component> componentList) {
			this.componentList = componentList;
		}

		public static class Component {

			private String componentName;

			private String componentDisplayName;

			public String getComponentName() {
				return this.componentName;
			}

			public void setComponentName(String componentName) {
				this.componentName = componentName;
			}

			public String getComponentDisplayName() {
				return this.componentDisplayName;
			}

			public void setComponentDisplayName(String componentDisplayName) {
				this.componentDisplayName = componentDisplayName;
			}
		}
	}

	@Override
	public ListStackServiceResponse getInstance(UnmarshallerContext context) {
		return	ListStackServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
