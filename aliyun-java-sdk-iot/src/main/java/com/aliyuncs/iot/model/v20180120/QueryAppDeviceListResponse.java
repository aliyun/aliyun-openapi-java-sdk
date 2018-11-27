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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryAppDeviceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAppDeviceListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String code;

	private Integer page;

	private Integer pageSize;

	private Integer pageCount;

	private Integer total;

	private List<DataItem> data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String productName;

		private String productKey;

		private String deviceName;

		private Integer nodeType;

		private String status;

		private String activeTime;

		private String lastOnlineTime;

		private String createTime;

		private Long childDeviceCount;

		private String utcActiveTime;

		private String utcLastOnlineTime;

		private String utcCreateTime;

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public Integer getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(Integer nodeType) {
			this.nodeType = nodeType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getActiveTime() {
			return this.activeTime;
		}

		public void setActiveTime(String activeTime) {
			this.activeTime = activeTime;
		}

		public String getLastOnlineTime() {
			return this.lastOnlineTime;
		}

		public void setLastOnlineTime(String lastOnlineTime) {
			this.lastOnlineTime = lastOnlineTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getChildDeviceCount() {
			return this.childDeviceCount;
		}

		public void setChildDeviceCount(Long childDeviceCount) {
			this.childDeviceCount = childDeviceCount;
		}

		public String getUtcActiveTime() {
			return this.utcActiveTime;
		}

		public void setUtcActiveTime(String utcActiveTime) {
			this.utcActiveTime = utcActiveTime;
		}

		public String getUtcLastOnlineTime() {
			return this.utcLastOnlineTime;
		}

		public void setUtcLastOnlineTime(String utcLastOnlineTime) {
			this.utcLastOnlineTime = utcLastOnlineTime;
		}

		public String getUtcCreateTime() {
			return this.utcCreateTime;
		}

		public void setUtcCreateTime(String utcCreateTime) {
			this.utcCreateTime = utcCreateTime;
		}
	}

	@Override
	public QueryAppDeviceListResponse getInstance(UnmarshallerContext context) {
		return	QueryAppDeviceListResponseUnmarshaller.unmarshall(this, context);
	}
}
