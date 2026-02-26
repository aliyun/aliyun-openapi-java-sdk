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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.AccountMaintenanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AccountMaintenanceResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

		private Long pageNo;

		private Long pageSize;

		private Long total;

		private List<ResultItem> result;

		public Long getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Long pageNo) {
			this.pageNo = pageNo;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<ResultItem> getResult() {
			return this.result;
		}

		public void setResult(List<ResultItem> result) {
			this.result = result;
		}

		public static class ResultItem {

			private Long aliyunId;

			private String authorizationTime;

			private String nickName;

			public Long getAliyunId() {
				return this.aliyunId;
			}

			public void setAliyunId(Long aliyunId) {
				this.aliyunId = aliyunId;
			}

			public String getAuthorizationTime() {
				return this.authorizationTime;
			}

			public void setAuthorizationTime(String authorizationTime) {
				this.authorizationTime = authorizationTime;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}
		}
	}

	@Override
	public AccountMaintenanceResponse getInstance(UnmarshallerContext context) {
		return	AccountMaintenanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
