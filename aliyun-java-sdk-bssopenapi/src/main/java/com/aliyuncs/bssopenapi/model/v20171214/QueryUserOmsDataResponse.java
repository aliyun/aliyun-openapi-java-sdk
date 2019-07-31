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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryUserOmsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUserOmsDataResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String marker;

		private String hostId;

		private List<Map<Object,Object>> omsData;

		public String getMarker() {
			return this.marker;
		}

		public void setMarker(String marker) {
			this.marker = marker;
		}

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public List<Map<Object,Object>> getOmsData() {
			return this.omsData;
		}

		public void setOmsData(List<Map<Object,Object>> omsData) {
			this.omsData = omsData;
		}
	}

	@Override
	public QueryUserOmsDataResponse getInstance(UnmarshallerContext context) {
		return	QueryUserOmsDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
