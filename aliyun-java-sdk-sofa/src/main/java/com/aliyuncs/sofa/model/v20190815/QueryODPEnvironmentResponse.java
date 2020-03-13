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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryODPEnvironmentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryODPEnvironmentResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean advancedUser;

		private Boolean autoCreateSchema;

		private String depolyMode;

		private String netMode;

		public Boolean getAdvancedUser() {
			return this.advancedUser;
		}

		public void setAdvancedUser(Boolean advancedUser) {
			this.advancedUser = advancedUser;
		}

		public Boolean getAutoCreateSchema() {
			return this.autoCreateSchema;
		}

		public void setAutoCreateSchema(Boolean autoCreateSchema) {
			this.autoCreateSchema = autoCreateSchema;
		}

		public String getDepolyMode() {
			return this.depolyMode;
		}

		public void setDepolyMode(String depolyMode) {
			this.depolyMode = depolyMode;
		}

		public String getNetMode() {
			return this.netMode;
		}

		public void setNetMode(String netMode) {
			this.netMode = netMode;
		}
	}

	@Override
	public QueryODPEnvironmentResponse getInstance(UnmarshallerContext context) {
		return	QueryODPEnvironmentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
