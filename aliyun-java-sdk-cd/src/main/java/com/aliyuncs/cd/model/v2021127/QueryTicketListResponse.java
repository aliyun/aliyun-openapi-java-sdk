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

package com.aliyuncs.cd.model.v2021127;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cd.transform.v2021127.QueryTicketListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTicketListResponse extends AcsResponse {

	private Boolean success;

	private String message;

	private String code;

	private Integer httpStatusCode;

	private String requestId;

	private Long totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<DataItem> data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String ticketId;

		private String deviceSn;

		private String deviceAlias;

		private String shopName;

		private String shopId;

		private String ticketType;

		private Integer status;

		private Long submitDate;

		private Long updateDate;

		public String getTicketId() {
			return this.ticketId;
		}

		public void setTicketId(String ticketId) {
			this.ticketId = ticketId;
		}

		public String getDeviceSn() {
			return this.deviceSn;
		}

		public void setDeviceSn(String deviceSn) {
			this.deviceSn = deviceSn;
		}

		public String getDeviceAlias() {
			return this.deviceAlias;
		}

		public void setDeviceAlias(String deviceAlias) {
			this.deviceAlias = deviceAlias;
		}

		public String getShopName() {
			return this.shopName;
		}

		public void setShopName(String shopName) {
			this.shopName = shopName;
		}

		public String getShopId() {
			return this.shopId;
		}

		public void setShopId(String shopId) {
			this.shopId = shopId;
		}

		public String getTicketType() {
			return this.ticketType;
		}

		public void setTicketType(String ticketType) {
			this.ticketType = ticketType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getSubmitDate() {
			return this.submitDate;
		}

		public void setSubmitDate(Long submitDate) {
			this.submitDate = submitDate;
		}

		public Long getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(Long updateDate) {
			this.updateDate = updateDate;
		}
	}

	@Override
	public QueryTicketListResponse getInstance(UnmarshallerContext context) {
		return	QueryTicketListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
