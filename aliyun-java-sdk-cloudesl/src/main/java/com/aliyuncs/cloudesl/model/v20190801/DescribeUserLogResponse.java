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

package com.aliyuncs.cloudesl.model.v20190801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20190801.DescribeUserLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserLogResponse extends AcsResponse {

	private String errorMessage;

	private Integer pageNumber;

	private String errorCode;

	private String message;

	private String dynamicCode;

	private Integer pageSize;

	private String code;

	private String dynamicMessage;

	private Integer totalCount;

	private String requestId;

	private Boolean success;

	private List<UserLogInfo> userLogs;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<UserLogInfo> getUserLogs() {
		return this.userLogs;
	}

	public void setUserLogs(List<UserLogInfo> userLogs) {
		this.userLogs = userLogs;
	}

	public static class UserLogInfo {

		private String operateType;

		private Long operateUserId;

		private String mac;

		private Integer itemActionPrice;

		private String storeId;

		private String eslBarCode;

		private String operateStatus;

		private String itemBarCode;

		private Long itemId;

		private String shelfCode;

		private String operateTime;

		private String itemTitle;

		public String getOperateType() {
			return this.operateType;
		}

		public void setOperateType(String operateType) {
			this.operateType = operateType;
		}

		public Long getOperateUserId() {
			return this.operateUserId;
		}

		public void setOperateUserId(Long operateUserId) {
			this.operateUserId = operateUserId;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}

		public Integer getItemActionPrice() {
			return this.itemActionPrice;
		}

		public void setItemActionPrice(Integer itemActionPrice) {
			this.itemActionPrice = itemActionPrice;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getEslBarCode() {
			return this.eslBarCode;
		}

		public void setEslBarCode(String eslBarCode) {
			this.eslBarCode = eslBarCode;
		}

		public String getOperateStatus() {
			return this.operateStatus;
		}

		public void setOperateStatus(String operateStatus) {
			this.operateStatus = operateStatus;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getShelfCode() {
			return this.shelfCode;
		}

		public void setShelfCode(String shelfCode) {
			this.shelfCode = shelfCode;
		}

		public String getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(String operateTime) {
			this.operateTime = operateTime;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}
	}

	@Override
	public DescribeUserLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserLogResponseUnmarshaller.unmarshall(this, context);
	}
}
