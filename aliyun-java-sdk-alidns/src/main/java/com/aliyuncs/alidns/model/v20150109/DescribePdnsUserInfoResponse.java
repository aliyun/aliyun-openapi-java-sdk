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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribePdnsUserInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePdnsUserInfoResponse extends AcsResponse {

	private String requestId;

	private UserInfo userInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public static class UserInfo {

		private String availableService;

		private String serviceType;

		private String state;

		private String stoppedService;

		private Long pdnsId;

		public String getAvailableService() {
			return this.availableService;
		}

		public void setAvailableService(String availableService) {
			this.availableService = availableService;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getStoppedService() {
			return this.stoppedService;
		}

		public void setStoppedService(String stoppedService) {
			this.stoppedService = stoppedService;
		}

		public Long getPdnsId() {
			return this.pdnsId;
		}

		public void setPdnsId(Long pdnsId) {
			this.pdnsId = pdnsId;
		}
	}

	@Override
	public DescribePdnsUserInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribePdnsUserInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
