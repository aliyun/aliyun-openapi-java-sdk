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

package com.aliyuncs.datalake.model.v20200710;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.datalake.transform.v20200710.GetServiceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private Boolean isOssOpen;

		private Boolean hasRamPermissions;

		private Boolean isDlfServiceOpen;

		public Boolean getIsOssOpen() {
			return this.isOssOpen;
		}

		public void setIsOssOpen(Boolean isOssOpen) {
			this.isOssOpen = isOssOpen;
		}

		public Boolean getHasRamPermissions() {
			return this.hasRamPermissions;
		}

		public void setHasRamPermissions(Boolean hasRamPermissions) {
			this.hasRamPermissions = hasRamPermissions;
		}

		public Boolean getIsDlfServiceOpen() {
			return this.isDlfServiceOpen;
		}

		public void setIsDlfServiceOpen(Boolean isDlfServiceOpen) {
			this.isDlfServiceOpen = isDlfServiceOpen;
		}
	}

	@Override
	public GetServiceStatusResponse getInstance(UnmarshallerContext context) {
		return	GetServiceStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
