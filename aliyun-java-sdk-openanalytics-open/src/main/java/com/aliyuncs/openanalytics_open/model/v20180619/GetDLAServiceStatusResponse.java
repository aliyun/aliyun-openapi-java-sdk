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

package com.aliyuncs.openanalytics_open.model.v20180619;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.openanalytics_open.transform.v20180619.GetDLAServiceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDLAServiceStatusResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private UserDLAServiceStatus userDLAServiceStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public UserDLAServiceStatus getUserDLAServiceStatus() {
		return this.userDLAServiceStatus;
	}

	public void setUserDLAServiceStatus(UserDLAServiceStatus userDLAServiceStatus) {
		this.userDLAServiceStatus = userDLAServiceStatus;
	}

	public static class UserDLAServiceStatus {

		private Boolean isServiceReady;

		private Boolean isOSSOpen;

		private Boolean isDLAAccountReady;

		public Boolean getIsServiceReady() {
			return this.isServiceReady;
		}

		public void setIsServiceReady(Boolean isServiceReady) {
			this.isServiceReady = isServiceReady;
		}

		public Boolean getIsOSSOpen() {
			return this.isOSSOpen;
		}

		public void setIsOSSOpen(Boolean isOSSOpen) {
			this.isOSSOpen = isOSSOpen;
		}

		public Boolean getIsDLAAccountReady() {
			return this.isDLAAccountReady;
		}

		public void setIsDLAAccountReady(Boolean isDLAAccountReady) {
			this.isDLAAccountReady = isDLAAccountReady;
		}
	}

	@Override
	public GetDLAServiceStatusResponse getInstance(UnmarshallerContext context) {
		return	GetDLAServiceStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
