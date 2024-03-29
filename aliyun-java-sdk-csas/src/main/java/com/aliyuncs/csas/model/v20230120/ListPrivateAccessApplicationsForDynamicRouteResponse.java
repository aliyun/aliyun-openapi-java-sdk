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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.ListPrivateAccessApplicationsForDynamicRouteResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrivateAccessApplicationsForDynamicRouteResponse extends AcsResponse {

	private String requestId;

	private List<DynamicRoute> dynamicRoutes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DynamicRoute> getDynamicRoutes() {
		return this.dynamicRoutes;
	}

	public void setDynamicRoutes(List<DynamicRoute> dynamicRoutes) {
		this.dynamicRoutes = dynamicRoutes;
	}

	public static class DynamicRoute {

		private String dynamicRouteId;

		private List<Application> applications;

		public String getDynamicRouteId() {
			return this.dynamicRouteId;
		}

		public void setDynamicRouteId(String dynamicRouteId) {
			this.dynamicRouteId = dynamicRouteId;
		}

		public List<Application> getApplications() {
			return this.applications;
		}

		public void setApplications(List<Application> applications) {
			this.applications = applications;
		}

		public static class Application {

			private String applicationId;

			private String name;

			private String description;

			private String protocol;

			private String status;

			private String createTime;

			private List<PortRange> portRanges;

			private List<String> addresses;

			public String getApplicationId() {
				return this.applicationId;
			}

			public void setApplicationId(String applicationId) {
				this.applicationId = applicationId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public List<PortRange> getPortRanges() {
				return this.portRanges;
			}

			public void setPortRanges(List<PortRange> portRanges) {
				this.portRanges = portRanges;
			}

			public List<String> getAddresses() {
				return this.addresses;
			}

			public void setAddresses(List<String> addresses) {
				this.addresses = addresses;
			}

			public static class PortRange {

				private Integer begin;

				private Integer end;

				public Integer getBegin() {
					return this.begin;
				}

				public void setBegin(Integer begin) {
					this.begin = begin;
				}

				public Integer getEnd() {
					return this.end;
				}

				public void setEnd(Integer end) {
					this.end = end;
				}
			}
		}
	}

	@Override
	public ListPrivateAccessApplicationsForDynamicRouteResponse getInstance(UnmarshallerContext context) {
		return	ListPrivateAccessApplicationsForDynamicRouteResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
