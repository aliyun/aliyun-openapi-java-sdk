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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetDataServiceApiTestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataServiceApiTestResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long apiId;

		private String paramMap;

		private Long retCode;

		private String retResult;

		private String debugInfo;

		private String costTime;

		private String nodesDebugInfo;

		private String status;

		public Long getApiId() {
			return this.apiId;
		}

		public void setApiId(Long apiId) {
			this.apiId = apiId;
		}

		public String getParamMap() {
			return this.paramMap;
		}

		public void setParamMap(String paramMap) {
			this.paramMap = paramMap;
		}

		public Long getRetCode() {
			return this.retCode;
		}

		public void setRetCode(Long retCode) {
			this.retCode = retCode;
		}

		public String getRetResult() {
			return this.retResult;
		}

		public void setRetResult(String retResult) {
			this.retResult = retResult;
		}

		public String getDebugInfo() {
			return this.debugInfo;
		}

		public void setDebugInfo(String debugInfo) {
			this.debugInfo = debugInfo;
		}

		public String getCostTime() {
			return this.costTime;
		}

		public void setCostTime(String costTime) {
			this.costTime = costTime;
		}

		public String getNodesDebugInfo() {
			return this.nodesDebugInfo;
		}

		public void setNodesDebugInfo(String nodesDebugInfo) {
			this.nodesDebugInfo = nodesDebugInfo;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public GetDataServiceApiTestResponse getInstance(UnmarshallerContext context) {
		return	GetDataServiceApiTestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
