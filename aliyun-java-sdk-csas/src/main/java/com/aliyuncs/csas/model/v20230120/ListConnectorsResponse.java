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
import com.aliyuncs.csas.transform.v20230120.ListConnectorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConnectorsResponse extends AcsResponse {

	private String requestId;

	private Integer totalNum;

	private List<Connector> connectors;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public List<Connector> getConnectors() {
		return this.connectors;
	}

	public void setConnectors(List<Connector> connectors) {
		this.connectors = connectors;
	}

	public static class Connector {

		private String connectorId;

		private String name;

		private String regionId;

		private String switchStatus;

		private String status;

		private String createTime;

		private List<Application> applications;

		private UpgradeTime upgradeTime;

		public String getConnectorId() {
			return this.connectorId;
		}

		public void setConnectorId(String connectorId) {
			this.connectorId = connectorId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getSwitchStatus() {
			return this.switchStatus;
		}

		public void setSwitchStatus(String switchStatus) {
			this.switchStatus = switchStatus;
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

		public List<Application> getApplications() {
			return this.applications;
		}

		public void setApplications(List<Application> applications) {
			this.applications = applications;
		}

		public UpgradeTime getUpgradeTime() {
			return this.upgradeTime;
		}

		public void setUpgradeTime(UpgradeTime upgradeTime) {
			this.upgradeTime = upgradeTime;
		}

		public static class Application {

			private String applicationId;

			private String applicationName;

			public String getApplicationId() {
				return this.applicationId;
			}

			public void setApplicationId(String applicationId) {
				this.applicationId = applicationId;
			}

			public String getApplicationName() {
				return this.applicationName;
			}

			public void setApplicationName(String applicationName) {
				this.applicationName = applicationName;
			}
		}

		public static class UpgradeTime {

			private String start;

			private String end;

			public String getStart() {
				return this.start;
			}

			public void setStart(String start) {
				this.start = start;
			}

			public String getEnd() {
				return this.end;
			}

			public void setEnd(String end) {
				this.end = end;
			}
		}
	}

	@Override
	public ListConnectorsResponse getInstance(UnmarshallerContext context) {
		return	ListConnectorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
