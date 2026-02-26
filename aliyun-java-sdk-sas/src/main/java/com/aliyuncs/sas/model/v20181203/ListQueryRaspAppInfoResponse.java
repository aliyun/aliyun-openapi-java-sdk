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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ListQueryRaspAppInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQueryRaspAppInfoResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private List<DataItem> data;

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

		private String uuid;

		private String raspStatus;

		private String raspAppName;

		private Integer raspOnlineStatus;

		private String result;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getRaspStatus() {
			return this.raspStatus;
		}

		public void setRaspStatus(String raspStatus) {
			this.raspStatus = raspStatus;
		}

		public String getRaspAppName() {
			return this.raspAppName;
		}

		public void setRaspAppName(String raspAppName) {
			this.raspAppName = raspAppName;
		}

		public Integer getRaspOnlineStatus() {
			return this.raspOnlineStatus;
		}

		public void setRaspOnlineStatus(Integer raspOnlineStatus) {
			this.raspOnlineStatus = raspOnlineStatus;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}
	}

	@Override
	public ListQueryRaspAppInfoResponse getInstance(UnmarshallerContext context) {
		return	ListQueryRaspAppInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
