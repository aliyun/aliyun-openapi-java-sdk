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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDevicesResponse extends AcsResponse {

	private String requestId;

	private List<DevicesItem> devices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DevicesItem> getDevices() {
		return this.devices;
	}

	public void setDevices(List<DevicesItem> devices) {
		this.devices = devices;
	}

	public static class DevicesItem {

		private String deviceId;

		private List<EndUserListItem> endUserList;

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public List<EndUserListItem> getEndUserList() {
			return this.endUserList;
		}

		public void setEndUserList(List<EndUserListItem> endUserList) {
			this.endUserList = endUserList;
		}

		public static class EndUserListItem {

			private String endUserId;

			private String userType;

			private String directoryId;

			private String adDomain;

			public String getEndUserId() {
				return this.endUserId;
			}

			public void setEndUserId(String endUserId) {
				this.endUserId = endUserId;
			}

			public String getUserType() {
				return this.userType;
			}

			public void setUserType(String userType) {
				this.userType = userType;
			}

			public String getDirectoryId() {
				return this.directoryId;
			}

			public void setDirectoryId(String directoryId) {
				this.directoryId = directoryId;
			}

			public String getAdDomain() {
				return this.adDomain;
			}

			public void setAdDomain(String adDomain) {
				this.adDomain = adDomain;
			}
		}
	}

	@Override
	public DescribeDevicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
