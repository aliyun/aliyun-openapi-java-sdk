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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkefabricFabricSoftwareconfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkefabricFabricSoftwareconfigsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
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

		private String appConfigMap;

		private String releaseId;

		private List<String> appList;

		public String getAppConfigMap() {
			return this.appConfigMap;
		}

		public void setAppConfigMap(String appConfigMap) {
			this.appConfigMap = appConfigMap;
		}

		public String getReleaseId() {
			return this.releaseId;
		}

		public void setReleaseId(String releaseId) {
			this.releaseId = releaseId;
		}

		public List<String> getAppList() {
			return this.appList;
		}

		public void setAppList(List<String> appList) {
			this.appList = appList;
		}
	}

	@Override
	public QueryLinkefabricFabricSoftwareconfigsResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkefabricFabricSoftwareconfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
