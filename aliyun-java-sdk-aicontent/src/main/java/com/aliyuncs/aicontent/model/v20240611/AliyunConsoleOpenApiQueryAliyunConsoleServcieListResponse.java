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

package com.aliyuncs.aicontent.model.v20240611;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aicontent.transform.v20240611.AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

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

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String serviceCode;

		private String serviceName;

		private Integer freeCount;

		private Integer freeConcurrencyCount;

		public String getServiceCode() {
			return this.serviceCode;
		}

		public void setServiceCode(String serviceCode) {
			this.serviceCode = serviceCode;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public Integer getFreeCount() {
			return this.freeCount;
		}

		public void setFreeCount(Integer freeCount) {
			this.freeCount = freeCount;
		}

		public Integer getFreeConcurrencyCount() {
			return this.freeConcurrencyCount;
		}

		public void setFreeConcurrencyCount(Integer freeConcurrencyCount) {
			this.freeConcurrencyCount = freeConcurrencyCount;
		}
	}

	@Override
	public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse getInstance(UnmarshallerContext context) {
		return	AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
