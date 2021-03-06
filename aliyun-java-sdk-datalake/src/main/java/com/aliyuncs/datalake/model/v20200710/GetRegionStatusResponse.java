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
import com.aliyuncs.datalake.transform.v20200710.GetRegionStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRegionStatusResponse extends AcsResponse {

	private String requestId;

	private String success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private String regionId;

		private Boolean isDlfServiceOpen;

		private String regionStatus;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Boolean getIsDlfServiceOpen() {
			return this.isDlfServiceOpen;
		}

		public void setIsDlfServiceOpen(Boolean isDlfServiceOpen) {
			this.isDlfServiceOpen = isDlfServiceOpen;
		}

		public String getRegionStatus() {
			return this.regionStatus;
		}

		public void setRegionStatus(String regionStatus) {
			this.regionStatus = regionStatus;
		}
	}

	@Override
	public GetRegionStatusResponse getInstance(UnmarshallerContext context) {
		return	GetRegionStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
