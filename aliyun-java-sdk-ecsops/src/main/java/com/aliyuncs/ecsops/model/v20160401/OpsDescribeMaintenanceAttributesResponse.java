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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeMaintenanceAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeMaintenanceAttributesResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer total;

	private List<MaintenanceAttribute> maintenanceAttributes;

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<MaintenanceAttribute> getMaintenanceAttributes() {
		return this.maintenanceAttributes;
	}

	public void setMaintenanceAttributes(List<MaintenanceAttribute> maintenanceAttributes) {
		this.maintenanceAttributes = maintenanceAttributes;
	}

	public static class MaintenanceAttribute {

		private Boolean liveMigration;

		private Boolean notifyOnMaintenance;

		private String instanceId;

		private String propertyId;

		private String level;

		private List<ReleaseWindow> releaseWindows;

		private List<MaintenanceWindow> maintenanceWindows;

		private ActionOnMaintenance actionOnMaintenance;

		public Boolean getLiveMigration() {
			return this.liveMigration;
		}

		public void setLiveMigration(Boolean liveMigration) {
			this.liveMigration = liveMigration;
		}

		public Boolean getNotifyOnMaintenance() {
			return this.notifyOnMaintenance;
		}

		public void setNotifyOnMaintenance(Boolean notifyOnMaintenance) {
			this.notifyOnMaintenance = notifyOnMaintenance;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getPropertyId() {
			return this.propertyId;
		}

		public void setPropertyId(String propertyId) {
			this.propertyId = propertyId;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public List<ReleaseWindow> getReleaseWindows() {
			return this.releaseWindows;
		}

		public void setReleaseWindows(List<ReleaseWindow> releaseWindows) {
			this.releaseWindows = releaseWindows;
		}

		public List<MaintenanceWindow> getMaintenanceWindows() {
			return this.maintenanceWindows;
		}

		public void setMaintenanceWindows(List<MaintenanceWindow> maintenanceWindows) {
			this.maintenanceWindows = maintenanceWindows;
		}

		public ActionOnMaintenance getActionOnMaintenance() {
			return this.actionOnMaintenance;
		}

		public void setActionOnMaintenance(ActionOnMaintenance actionOnMaintenance) {
			this.actionOnMaintenance = actionOnMaintenance;
		}

		public static class ReleaseWindow {

			private String endTime;

			private String startTime;

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
		}

		public static class MaintenanceWindow {

			private String endTime;

			private String startTime;

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
		}

		public static class ActionOnMaintenance {

			private String value;

			private Integer canRecover;

			private String defaultValue;

			private List<String> supportedValues;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public Integer getCanRecover() {
				return this.canRecover;
			}

			public void setCanRecover(Integer canRecover) {
				this.canRecover = canRecover;
			}

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}

			public List<String> getSupportedValues() {
				return this.supportedValues;
			}

			public void setSupportedValues(List<String> supportedValues) {
				this.supportedValues = supportedValues;
			}
		}
	}

	@Override
	public OpsDescribeMaintenanceAttributesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeMaintenanceAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
