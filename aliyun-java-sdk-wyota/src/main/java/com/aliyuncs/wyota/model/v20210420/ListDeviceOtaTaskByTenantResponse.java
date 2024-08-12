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

package com.aliyuncs.wyota.model.v20210420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.ListDeviceOtaTaskByTenantResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeviceOtaTaskByTenantResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<TenantDeviceOtaTask> tenantDeviceOtaTasks;

		public List<TenantDeviceOtaTask> getTenantDeviceOtaTasks() {
			return this.tenantDeviceOtaTasks;
		}

		public void setTenantDeviceOtaTasks(List<TenantDeviceOtaTask> tenantDeviceOtaTasks) {
			this.tenantDeviceOtaTasks = tenantDeviceOtaTasks;
		}

		public static class TenantDeviceOtaTask {

			private Integer taskId;

			private String model;

			private String version;

			private Integer status;

			private Integer operationStatus;

			private String publishTime;

			private Long upgradeCount;

			public Integer getTaskId() {
				return this.taskId;
			}

			public void setTaskId(Integer taskId) {
				this.taskId = taskId;
			}

			public String getModel() {
				return this.model;
			}

			public void setModel(String model) {
				this.model = model;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getOperationStatus() {
				return this.operationStatus;
			}

			public void setOperationStatus(Integer operationStatus) {
				this.operationStatus = operationStatus;
			}

			public String getPublishTime() {
				return this.publishTime;
			}

			public void setPublishTime(String publishTime) {
				this.publishTime = publishTime;
			}

			public Long getUpgradeCount() {
				return this.upgradeCount;
			}

			public void setUpgradeCount(Long upgradeCount) {
				this.upgradeCount = upgradeCount;
			}
		}
	}

	@Override
	public ListDeviceOtaTaskByTenantResponse getInstance(UnmarshallerContext context) {
		return	ListDeviceOtaTaskByTenantResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
