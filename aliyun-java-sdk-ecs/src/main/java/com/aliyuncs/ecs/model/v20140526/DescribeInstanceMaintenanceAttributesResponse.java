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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInstanceMaintenanceAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceMaintenanceAttributesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<MaintenanceAttribute> maintenanceAttributes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<MaintenanceAttribute> getMaintenanceAttributes() {
		return this.maintenanceAttributes;
	}

	public void setMaintenanceAttributes(List<MaintenanceAttribute> maintenanceAttributes) {
		this.maintenanceAttributes = maintenanceAttributes;
	}

	public static class MaintenanceAttribute {

		private String instanceId;

		private List<MaintenanceWindow> maintenanceWindows;

		private ActionOnMaintenance actionOnMaintenance;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public static class MaintenanceWindow {

			private String startTime;

			private String endTime;

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}
		}

		public static class ActionOnMaintenance {

			private String value;

			private String defaultValue;

			private List<String> supportedValues;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
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
	public DescribeInstanceMaintenanceAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceMaintenanceAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
