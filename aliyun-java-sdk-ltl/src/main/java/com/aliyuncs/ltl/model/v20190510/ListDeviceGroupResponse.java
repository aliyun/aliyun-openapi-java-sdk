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

package com.aliyuncs.ltl.model.v20190510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ltl.transform.v20190510.ListDeviceGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeviceGroupResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer num;

		private Integer total;

		private Integer size;

		private List<DeviceGroupInfo> pageData;

		public Integer getNum() {
			return this.num;
		}

		public void setNum(Integer num) {
			this.num = num;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public List<DeviceGroupInfo> getPageData() {
			return this.pageData;
		}

		public void setPageData(List<DeviceGroupInfo> pageData) {
			this.pageData = pageData;
		}

		public static class DeviceGroupInfo {

			private String status;

			private String deviceGroupId;

			private String productKey;

			private String remark;

			private String authorizeType;

			private String ownerName;

			private String ownerUid;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDeviceGroupId() {
				return this.deviceGroupId;
			}

			public void setDeviceGroupId(String deviceGroupId) {
				this.deviceGroupId = deviceGroupId;
			}

			public String getProductKey() {
				return this.productKey;
			}

			public void setProductKey(String productKey) {
				this.productKey = productKey;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getAuthorizeType() {
				return this.authorizeType;
			}

			public void setAuthorizeType(String authorizeType) {
				this.authorizeType = authorizeType;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getOwnerUid() {
				return this.ownerUid;
			}

			public void setOwnerUid(String ownerUid) {
				this.ownerUid = ownerUid;
			}
		}
	}

	@Override
	public ListDeviceGroupResponse getInstance(UnmarshallerContext context) {
		return	ListDeviceGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
