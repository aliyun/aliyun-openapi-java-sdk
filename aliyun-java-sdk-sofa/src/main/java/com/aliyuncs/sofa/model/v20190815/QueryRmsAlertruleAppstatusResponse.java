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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryRmsAlertruleAppstatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsAlertruleAppstatusResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Response response;

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

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public static class Response {

		private List<String> itemTypeAlerting;

		private List<String> itemTypeConfigured;

		private List<String> itemTypeNotConfigured;

		public List<String> getItemTypeAlerting() {
			return this.itemTypeAlerting;
		}

		public void setItemTypeAlerting(List<String> itemTypeAlerting) {
			this.itemTypeAlerting = itemTypeAlerting;
		}

		public List<String> getItemTypeConfigured() {
			return this.itemTypeConfigured;
		}

		public void setItemTypeConfigured(List<String> itemTypeConfigured) {
			this.itemTypeConfigured = itemTypeConfigured;
		}

		public List<String> getItemTypeNotConfigured() {
			return this.itemTypeNotConfigured;
		}

		public void setItemTypeNotConfigured(List<String> itemTypeNotConfigured) {
			this.itemTypeNotConfigured = itemTypeNotConfigured;
		}
	}

	@Override
	public QueryRmsAlertruleAppstatusResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsAlertruleAppstatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
