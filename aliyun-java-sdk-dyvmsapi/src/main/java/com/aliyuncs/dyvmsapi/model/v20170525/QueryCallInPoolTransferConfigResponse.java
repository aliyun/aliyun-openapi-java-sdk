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

package com.aliyuncs.dyvmsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyvmsapi.transform.v20170525.QueryCallInPoolTransferConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCallInPoolTransferConfigResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private String transferTimeout;

		private String calledRouteMode;

		private Long gmtCreate;

		private List<DetailsItem> details;

		public String getTransferTimeout() {
			return this.transferTimeout;
		}

		public void setTransferTimeout(String transferTimeout) {
			this.transferTimeout = transferTimeout;
		}

		public String getCalledRouteMode() {
			return this.calledRouteMode;
		}

		public void setCalledRouteMode(String calledRouteMode) {
			this.calledRouteMode = calledRouteMode;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public List<DetailsItem> getDetails() {
			return this.details;
		}

		public void setDetails(List<DetailsItem> details) {
			this.details = details;
		}

		public static class DetailsItem {

			private String called;

			public String getCalled() {
				return this.called;
			}

			public void setCalled(String called) {
				this.called = called;
			}
		}
	}

	@Override
	public QueryCallInPoolTransferConfigResponse getInstance(UnmarshallerContext context) {
		return	QueryCallInPoolTransferConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
