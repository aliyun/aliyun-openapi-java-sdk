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

package com.aliyuncs.lto.model.v20210707;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.lto.transform.v20210707.ListEdgeDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEdgeDeviceResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

		private List<MemberInfo> pageData;

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

		public List<MemberInfo> getPageData() {
			return this.pageData;
		}

		public void setPageData(List<MemberInfo> pageData) {
			this.pageData = pageData;
		}

		public static class MemberInfo {

			private String status;

			private String lastOnchainTime;

			private Long usedOnchainCount;

			private String name;

			private String deviceId;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getLastOnchainTime() {
				return this.lastOnchainTime;
			}

			public void setLastOnchainTime(String lastOnchainTime) {
				this.lastOnchainTime = lastOnchainTime;
			}

			public Long getUsedOnchainCount() {
				return this.usedOnchainCount;
			}

			public void setUsedOnchainCount(Long usedOnchainCount) {
				this.usedOnchainCount = usedOnchainCount;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}
		}
	}

	@Override
	public ListEdgeDeviceResponse getInstance(UnmarshallerContext context) {
		return	ListEdgeDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
