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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.GetDbProxyInstanceSslResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDbProxyInstanceSslResponse extends AcsResponse {

	private String requestId;

	private List<DbProxyCertListItemsItem> dbProxyCertListItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DbProxyCertListItemsItem> getDbProxyCertListItems() {
		return this.dbProxyCertListItems;
	}

	public void setDbProxyCertListItems(List<DbProxyCertListItemsItem> dbProxyCertListItems) {
		this.dbProxyCertListItems = dbProxyCertListItems;
	}

	public static class DbProxyCertListItemsItem {

		private String dbInstanceName;

		private String endpointName;

		private String endpointType;

		private String certCommonName;

		private String sslExpiredTime;

		public String getDbInstanceName() {
			return this.dbInstanceName;
		}

		public void setDbInstanceName(String dbInstanceName) {
			this.dbInstanceName = dbInstanceName;
		}

		public String getEndpointName() {
			return this.endpointName;
		}

		public void setEndpointName(String endpointName) {
			this.endpointName = endpointName;
		}

		public String getEndpointType() {
			return this.endpointType;
		}

		public void setEndpointType(String endpointType) {
			this.endpointType = endpointType;
		}

		public String getCertCommonName() {
			return this.certCommonName;
		}

		public void setCertCommonName(String certCommonName) {
			this.certCommonName = certCommonName;
		}

		public String getSslExpiredTime() {
			return this.sslExpiredTime;
		}

		public void setSslExpiredTime(String sslExpiredTime) {
			this.sslExpiredTime = sslExpiredTime;
		}
	}

	@Override
	public GetDbProxyInstanceSslResponse getInstance(UnmarshallerContext context) {
		return	GetDbProxyInstanceSslResponseUnmarshaller.unmarshall(this, context);
	}
}
