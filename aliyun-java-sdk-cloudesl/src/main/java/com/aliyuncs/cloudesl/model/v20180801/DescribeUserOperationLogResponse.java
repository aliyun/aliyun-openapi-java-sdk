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

package com.aliyuncs.cloudesl.model.v20180801;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20180801.DescribeUserOperationLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserOperationLogResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private String errorCode;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<OperationLogInfo> operationLogs;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

	public List<OperationLogInfo> getOperationLogs() {
		return this.operationLogs;
	}

	public void setOperationLogs(List<OperationLogInfo> operationLogs) {
		this.operationLogs = operationLogs;
	}

	public static class OperationLogInfo {

		private String operateType;

		private String operateStatus;

		private Long operateUserId;

		private String operateTime;

		private String storeId;

		private String itemTitle;

		private String itemId;

		private Integer itemActionPrice;

		private String itemBarCode;

		private String eslBarCode;

		private String shelfCode;

		public String getOperateType() {
			return this.operateType;
		}

		public void setOperateType(String operateType) {
			this.operateType = operateType;
		}

		public String getOperateStatus() {
			return this.operateStatus;
		}

		public void setOperateStatus(String operateStatus) {
			this.operateStatus = operateStatus;
		}

		public Long getOperateUserId() {
			return this.operateUserId;
		}

		public void setOperateUserId(Long operateUserId) {
			this.operateUserId = operateUserId;
		}

		public String getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(String operateTime) {
			this.operateTime = operateTime;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public Integer getItemActionPrice() {
			return this.itemActionPrice;
		}

		public void setItemActionPrice(Integer itemActionPrice) {
			this.itemActionPrice = itemActionPrice;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}

		public String getEslBarCode() {
			return this.eslBarCode;
		}

		public void setEslBarCode(String eslBarCode) {
			this.eslBarCode = eslBarCode;
		}

		public String getShelfCode() {
			return this.shelfCode;
		}

		public void setShelfCode(String shelfCode) {
			this.shelfCode = shelfCode;
		}
	}

	@Override
	public DescribeUserOperationLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserOperationLogResponseUnmarshaller.unmarshall(this, context);
	}
}
