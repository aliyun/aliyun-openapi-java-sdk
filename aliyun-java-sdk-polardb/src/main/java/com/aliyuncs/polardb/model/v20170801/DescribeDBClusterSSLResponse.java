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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterSSLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterSSLResponse extends AcsResponse {

	private String requestId;

	private List<Item> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String dBEndpointId;

		private String sSLEnabled;

		private String sSLConnectionString;

		private String sSLExpireTime;

		public String getDBEndpointId() {
			return this.dBEndpointId;
		}

		public void setDBEndpointId(String dBEndpointId) {
			this.dBEndpointId = dBEndpointId;
		}

		public String getSSLEnabled() {
			return this.sSLEnabled;
		}

		public void setSSLEnabled(String sSLEnabled) {
			this.sSLEnabled = sSLEnabled;
		}

		public String getSSLConnectionString() {
			return this.sSLConnectionString;
		}

		public void setSSLConnectionString(String sSLConnectionString) {
			this.sSLConnectionString = sSLConnectionString;
		}

		public String getSSLExpireTime() {
			return this.sSLExpireTime;
		}

		public void setSSLExpireTime(String sSLExpireTime) {
			this.sSLExpireTime = sSLExpireTime;
		}
	}

	@Override
	public DescribeDBClusterSSLResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterSSLResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
