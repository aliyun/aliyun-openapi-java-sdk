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

package com.aliyuncs.onsmqtt.model.v20200420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.onsmqtt.transform.v20200420.ListDeviceCredentialClientIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeviceCredentialClientIdResponse extends AcsResponse {

	private String requestId;

	private DeviceCredentialClientIdList deviceCredentialClientIdList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DeviceCredentialClientIdList getDeviceCredentialClientIdList() {
		return this.deviceCredentialClientIdList;
	}

	public void setDeviceCredentialClientIdList(DeviceCredentialClientIdList deviceCredentialClientIdList) {
		this.deviceCredentialClientIdList = deviceCredentialClientIdList;
	}

	public static class DeviceCredentialClientIdList {

		private String total;

		private String pageNo;

		private String pageSize;

		private String nextToken;

		private List<String> clientIdList;

		public String getTotal() {
			return this.total;
		}

		public void setTotal(String total) {
			this.total = total;
		}

		public String getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(String pageNo) {
			this.pageNo = pageNo;
		}

		public String getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<String> getClientIdList() {
			return this.clientIdList;
		}

		public void setClientIdList(List<String> clientIdList) {
			this.clientIdList = clientIdList;
		}
	}

	@Override
	public ListDeviceCredentialClientIdResponse getInstance(UnmarshallerContext context) {
		return	ListDeviceCredentialClientIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
