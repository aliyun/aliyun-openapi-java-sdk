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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.lto.transform.v20210707.DescribeDashboardBaseInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDashboardBaseInfoResponse extends AcsResponse {

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

		private Integer bizChainCount;

		private Integer memberCount;

		private Integer deviceCount;

		private Long apiInvokeCount;

		public Integer getBizChainCount() {
			return this.bizChainCount;
		}

		public void setBizChainCount(Integer bizChainCount) {
			this.bizChainCount = bizChainCount;
		}

		public Integer getMemberCount() {
			return this.memberCount;
		}

		public void setMemberCount(Integer memberCount) {
			this.memberCount = memberCount;
		}

		public Integer getDeviceCount() {
			return this.deviceCount;
		}

		public void setDeviceCount(Integer deviceCount) {
			this.deviceCount = deviceCount;
		}

		public Long getApiInvokeCount() {
			return this.apiInvokeCount;
		}

		public void setApiInvokeCount(Long apiInvokeCount) {
			this.apiInvokeCount = apiInvokeCount;
		}
	}

	@Override
	public DescribeDashboardBaseInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDashboardBaseInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
