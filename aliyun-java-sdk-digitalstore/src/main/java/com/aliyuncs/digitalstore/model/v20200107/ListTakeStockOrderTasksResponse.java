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

package com.aliyuncs.digitalstore.model.v20200107;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.ListTakeStockOrderTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTakeStockOrderTasksResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<TakeStockOrderTaskModel> takeStockOrderTasks;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

	public List<TakeStockOrderTaskModel> getTakeStockOrderTasks() {
		return this.takeStockOrderTasks;
	}

	public void setTakeStockOrderTasks(List<TakeStockOrderTaskModel> takeStockOrderTasks) {
		this.takeStockOrderTasks = takeStockOrderTasks;
	}

	public static class TakeStockOrderTaskModel {

		private String deviceNumber;

		private String createDate;

		private Integer operateQuantity;

		private String status;

		private String takeStockTaskId;

		private String syncStatus;

		private String description;

		private String takeStockOrderId;

		private String code;

		private String updateDate;

		public String getDeviceNumber() {
			return this.deviceNumber;
		}

		public void setDeviceNumber(String deviceNumber) {
			this.deviceNumber = deviceNumber;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public Integer getOperateQuantity() {
			return this.operateQuantity;
		}

		public void setOperateQuantity(Integer operateQuantity) {
			this.operateQuantity = operateQuantity;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTakeStockTaskId() {
			return this.takeStockTaskId;
		}

		public void setTakeStockTaskId(String takeStockTaskId) {
			this.takeStockTaskId = takeStockTaskId;
		}

		public String getSyncStatus() {
			return this.syncStatus;
		}

		public void setSyncStatus(String syncStatus) {
			this.syncStatus = syncStatus;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTakeStockOrderId() {
			return this.takeStockOrderId;
		}

		public void setTakeStockOrderId(String takeStockOrderId) {
			this.takeStockOrderId = takeStockOrderId;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}
	}

	@Override
	public ListTakeStockOrderTasksResponse getInstance(UnmarshallerContext context) {
		return	ListTakeStockOrderTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
