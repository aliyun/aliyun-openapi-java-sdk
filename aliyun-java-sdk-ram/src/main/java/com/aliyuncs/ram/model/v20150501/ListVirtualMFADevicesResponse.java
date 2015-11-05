/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ram.model.v20150501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ram.transform.v20150501.ListVirtualMFADevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVirtualMFADevicesResponse extends AcsResponse {

	private String requestId;

	private List<VirtualMFADevice> virtualMFADevices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VirtualMFADevice> getVirtualMFADevices() {
		return this.virtualMFADevices;
	}

	public void setVirtualMFADevices(List<VirtualMFADevice> virtualMFADevices) {
		this.virtualMFADevices = virtualMFADevices;
	}

	public static class VirtualMFADevice {

		private String serialNumber;

		private String activateDate;

		private User user;

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getActivateDate() {
			return this.activateDate;
		}

		public void setActivateDate(String activateDate) {
			this.activateDate = activateDate;
		}

		public User getUser() {
			return this.user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public static class User {

			private String userId;

			private String userName;

			private String displayName;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}
		}
	}

	@Override
	public ListVirtualMFADevicesResponse getInstance(UnmarshallerContext context) {
		return	ListVirtualMFADevicesResponseUnmarshaller.unmarshall(this, context);
	}
}
