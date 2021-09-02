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

package com.aliyuncs.quickbi_public.model.v20201111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20201111.QueryDatasetSwitchInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDatasetSwitchInfoResponse extends AcsResponse {

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

		private Integer isOpenRowLevelPermission;

		private String cubeId;

		private Integer isOpenColumnLevelPermission;

		public Integer getIsOpenRowLevelPermission() {
			return this.isOpenRowLevelPermission;
		}

		public void setIsOpenRowLevelPermission(Integer isOpenRowLevelPermission) {
			this.isOpenRowLevelPermission = isOpenRowLevelPermission;
		}

		public String getCubeId() {
			return this.cubeId;
		}

		public void setCubeId(String cubeId) {
			this.cubeId = cubeId;
		}

		public Integer getIsOpenColumnLevelPermission() {
			return this.isOpenColumnLevelPermission;
		}

		public void setIsOpenColumnLevelPermission(Integer isOpenColumnLevelPermission) {
			this.isOpenColumnLevelPermission = isOpenColumnLevelPermission;
		}
	}

	@Override
	public QueryDatasetSwitchInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryDatasetSwitchInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
