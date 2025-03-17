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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.UpdateWorkspaceUsersRoleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateWorkspaceUsersRoleResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer failure;

		private Map<Object,Object> failureDetail;

		private Integer success;

		private Integer total;

		public Integer getFailure() {
			return this.failure;
		}

		public void setFailure(Integer failure) {
			this.failure = failure;
		}

		public Map<Object,Object> getFailureDetail() {
			return this.failureDetail;
		}

		public void setFailureDetail(Map<Object,Object> failureDetail) {
			this.failureDetail = failureDetail;
		}

		public Integer getSuccess() {
			return this.success;
		}

		public void setSuccess(Integer success) {
			this.success = success;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}
	}

	@Override
	public UpdateWorkspaceUsersRoleResponse getInstance(UnmarshallerContext context) {
		return	UpdateWorkspaceUsersRoleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
