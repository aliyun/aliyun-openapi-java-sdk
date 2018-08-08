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

package com.aliyuncs.linkface.model.v20180720;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkface.transform.v20180720.QueryAddUserInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAddUserInfoResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

		private List<CurrentFaceInfosItem> currentFaceInfos;

		private List<FailedFaceInfosItem> failedFaceInfos;

		public List<CurrentFaceInfosItem> getCurrentFaceInfos() {
			return this.currentFaceInfos;
		}

		public void setCurrentFaceInfos(List<CurrentFaceInfosItem> currentFaceInfos) {
			this.currentFaceInfos = currentFaceInfos;
		}

		public List<FailedFaceInfosItem> getFailedFaceInfos() {
			return this.failedFaceInfos;
		}

		public void setFailedFaceInfos(List<FailedFaceInfosItem> failedFaceInfos) {
			this.failedFaceInfos = failedFaceInfos;
		}

		public static class CurrentFaceInfosItem {

			private String userId;

			private String clientTag;

			private Integer index;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getClientTag() {
				return this.clientTag;
			}

			public void setClientTag(String clientTag) {
				this.clientTag = clientTag;
			}

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}
		}

		public static class FailedFaceInfosItem {

			private String userId;

			private String clientTag;

			private Integer index;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getClientTag() {
				return this.clientTag;
			}

			public void setClientTag(String clientTag) {
				this.clientTag = clientTag;
			}

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}
		}
	}

	@Override
	public QueryAddUserInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryAddUserInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
