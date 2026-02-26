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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetSparkLocalClientInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSparkLocalClientInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<SparkLocalClientInfo> data;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public List<SparkLocalClientInfo> getData() {
		return this.data;
	}

	public void setData(List<SparkLocalClientInfo> data) {
		this.data = data;
	}

	public static class SparkLocalClientInfo {

		private String clientName;

		private String clientFileResourceName;

		private String clientFileResourceId;

		private Boolean editable;

		public String getClientName() {
			return this.clientName;
		}

		public void setClientName(String clientName) {
			this.clientName = clientName;
		}

		public String getClientFileResourceName() {
			return this.clientFileResourceName;
		}

		public void setClientFileResourceName(String clientFileResourceName) {
			this.clientFileResourceName = clientFileResourceName;
		}

		public String getClientFileResourceId() {
			return this.clientFileResourceId;
		}

		public void setClientFileResourceId(String clientFileResourceId) {
			this.clientFileResourceId = clientFileResourceId;
		}

		public Boolean getEditable() {
			return this.editable;
		}

		public void setEditable(Boolean editable) {
			this.editable = editable;
		}
	}

	@Override
	public GetSparkLocalClientInfoResponse getInstance(UnmarshallerContext context) {
		return	GetSparkLocalClientInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
