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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryDynamicGroupDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDynamicGroupDevicesResponse extends AcsResponse {

	private String nextToken;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String code;

	private Integer pageSize;

	private Integer total;

	private Integer pageCount;

	private Integer page;

	private List<SimpleDeviceInfo> data;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public List<SimpleDeviceInfo> getData() {
		return this.data;
	}

	public void setData(List<SimpleDeviceInfo> data) {
		this.data = data;
	}

	public static class SimpleDeviceInfo {

		private String status;

		private String productName;

		private String deviceName;

		private String utcActiveTime;

		private String activeTime;

		private String productKey;

		private String lastOnlineTime;

		private Integer nodeType;

		private String utcLastOnlineTime;

		private String nickname;

		private String categoryKey;

		private String iotId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getUtcActiveTime() {
			return this.utcActiveTime;
		}

		public void setUtcActiveTime(String utcActiveTime) {
			this.utcActiveTime = utcActiveTime;
		}

		public String getActiveTime() {
			return this.activeTime;
		}

		public void setActiveTime(String activeTime) {
			this.activeTime = activeTime;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getLastOnlineTime() {
			return this.lastOnlineTime;
		}

		public void setLastOnlineTime(String lastOnlineTime) {
			this.lastOnlineTime = lastOnlineTime;
		}

		public Integer getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(Integer nodeType) {
			this.nodeType = nodeType;
		}

		public String getUtcLastOnlineTime() {
			return this.utcLastOnlineTime;
		}

		public void setUtcLastOnlineTime(String utcLastOnlineTime) {
			this.utcLastOnlineTime = utcLastOnlineTime;
		}

		public String getNickname() {
			return this.nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public String getCategoryKey() {
			return this.categoryKey;
		}

		public void setCategoryKey(String categoryKey) {
			this.categoryKey = categoryKey;
		}

		public String getIotId() {
			return this.iotId;
		}

		public void setIotId(String iotId) {
			this.iotId = iotId;
		}
	}

	@Override
	public QueryDynamicGroupDevicesResponse getInstance(UnmarshallerContext context) {
		return	QueryDynamicGroupDevicesResponseUnmarshaller.unmarshall(this, context);
	}
}
