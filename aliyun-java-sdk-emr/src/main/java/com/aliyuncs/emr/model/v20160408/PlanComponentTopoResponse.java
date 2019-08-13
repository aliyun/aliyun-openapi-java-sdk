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
import com.aliyuncs.emr.transform.v20160408.PlanComponentTopoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PlanComponentTopoResponse extends AcsResponse {

	private String requestId;

	private List<HostComponent> hostComponentList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<HostComponent> getHostComponentList() {
		return this.hostComponentList;
	}

	public void setHostComponentList(List<HostComponent> hostComponentList) {
		this.hostComponentList = hostComponentList;
	}

	public static class HostComponent {

		private String componentName;

		private String serviceName;

		private String serviceVersion;

		private String serviceEcmVersion;

		private Boolean readOnly;

		private Boolean display;

		private List<String> hostNameList;

		public String getComponentName() {
			return this.componentName;
		}

		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceVersion() {
			return this.serviceVersion;
		}

		public void setServiceVersion(String serviceVersion) {
			this.serviceVersion = serviceVersion;
		}

		public String getServiceEcmVersion() {
			return this.serviceEcmVersion;
		}

		public void setServiceEcmVersion(String serviceEcmVersion) {
			this.serviceEcmVersion = serviceEcmVersion;
		}

		public Boolean getReadOnly() {
			return this.readOnly;
		}

		public void setReadOnly(Boolean readOnly) {
			this.readOnly = readOnly;
		}

		public Boolean getDisplay() {
			return this.display;
		}

		public void setDisplay(Boolean display) {
			this.display = display;
		}

		public List<String> getHostNameList() {
			return this.hostNameList;
		}

		public void setHostNameList(List<String> hostNameList) {
			this.hostNameList = hostNameList;
		}
	}

	@Override
	public PlanComponentTopoResponse getInstance(UnmarshallerContext context) {
		return	PlanComponentTopoResponseUnmarshaller.unmarshall(this, context);
	}
}
