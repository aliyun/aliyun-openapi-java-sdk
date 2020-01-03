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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListSoftwaresResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSoftwaresResponse extends AcsResponse {

	private String requestId;

	private List<SoftwareInfo> softwares;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SoftwareInfo> getSoftwares() {
		return this.softwares;
	}

	public void setSoftwares(List<SoftwareInfo> softwares) {
		this.softwares = softwares;
	}

	public static class SoftwareInfo {

		private String ehpcVersion;

		private String osTag;

		private String schedulerType;

		private String schedulerVersion;

		private String accountType;

		private String accountVersion;

		private List<ApplicationInfo> applications;

		public String getEhpcVersion() {
			return this.ehpcVersion;
		}

		public void setEhpcVersion(String ehpcVersion) {
			this.ehpcVersion = ehpcVersion;
		}

		public String getOsTag() {
			return this.osTag;
		}

		public void setOsTag(String osTag) {
			this.osTag = osTag;
		}

		public String getSchedulerType() {
			return this.schedulerType;
		}

		public void setSchedulerType(String schedulerType) {
			this.schedulerType = schedulerType;
		}

		public String getSchedulerVersion() {
			return this.schedulerVersion;
		}

		public void setSchedulerVersion(String schedulerVersion) {
			this.schedulerVersion = schedulerVersion;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getAccountVersion() {
			return this.accountVersion;
		}

		public void setAccountVersion(String accountVersion) {
			this.accountVersion = accountVersion;
		}

		public List<ApplicationInfo> getApplications() {
			return this.applications;
		}

		public void setApplications(List<ApplicationInfo> applications) {
			this.applications = applications;
		}

		public static class ApplicationInfo {

			private String tag;

			private String name;

			private String version;

			private Boolean required;

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public Boolean getRequired() {
				return this.required;
			}

			public void setRequired(Boolean required) {
				this.required = required;
			}
		}
	}

	@Override
	public ListSoftwaresResponse getInstance(UnmarshallerContext context) {
		return	ListSoftwaresResponseUnmarshaller.unmarshall(this, context);
	}
}
