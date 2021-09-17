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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetHDMAliyunResourceSyncResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHDMAliyunResourceSyncResultResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String synchro;

	private String code;

	private String success;

	private Data data;

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

	public String getSynchro() {
		return this.synchro;
	}

	public void setSynchro(String synchro) {
		this.synchro = synchro;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String syncStatus;

		private String errorMsg;

		private String results;

		private List<ResourceSyncSubResult> subResults;

		public String getSyncStatus() {
			return this.syncStatus;
		}

		public void setSyncStatus(String syncStatus) {
			this.syncStatus = syncStatus;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public String getResults() {
			return this.results;
		}

		public void setResults(String results) {
			this.results = results;
		}

		public List<ResourceSyncSubResult> getSubResults() {
			return this.subResults;
		}

		public void setSubResults(List<ResourceSyncSubResult> subResults) {
			this.subResults = subResults;
		}

		public static class ResourceSyncSubResult {

			private Integer syncCount;

			private String resourceType;

			private Boolean success;

			private String errMsg;

			public Integer getSyncCount() {
				return this.syncCount;
			}

			public void setSyncCount(Integer syncCount) {
				this.syncCount = syncCount;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public Boolean getSuccess() {
				return this.success;
			}

			public void setSuccess(Boolean success) {
				this.success = success;
			}

			public String getErrMsg() {
				return this.errMsg;
			}

			public void setErrMsg(String errMsg) {
				this.errMsg = errMsg;
			}
		}
	}

	@Override
	public GetHDMAliyunResourceSyncResultResponse getInstance(UnmarshallerContext context) {
		return	GetHDMAliyunResourceSyncResultResponseUnmarshaller.unmarshall(this, context);
	}
}
