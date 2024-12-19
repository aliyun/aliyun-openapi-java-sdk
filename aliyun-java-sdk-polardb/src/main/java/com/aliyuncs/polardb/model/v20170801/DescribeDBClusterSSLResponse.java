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

	private String sSLAutoRotate;

	private List<Item> items;

	private List<String> supportAdvancedSSLFeatureEndpointTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSSLAutoRotate() {
		return this.sSLAutoRotate;
	}

	public void setSSLAutoRotate(String sSLAutoRotate) {
		this.sSLAutoRotate = sSLAutoRotate;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<String> getSupportAdvancedSSLFeatureEndpointTypes() {
		return this.supportAdvancedSSLFeatureEndpointTypes;
	}

	public void setSupportAdvancedSSLFeatureEndpointTypes(List<String> supportAdvancedSSLFeatureEndpointTypes) {
		this.supportAdvancedSSLFeatureEndpointTypes = supportAdvancedSSLFeatureEndpointTypes;
	}

	public static class Item {

		private String sSLExpireTime;

		private String sSLEnabled;

		private String sSLConnectionString;

		private String dBEndpointId;

		private String cAType;

		private String serverCert;

		private String serverKey;

		private String clientCACert;

		private String clientCrl;

		private String aCL;

		private String sSLAutoRotate;

		private List<String> allowedACLs;

		public String getSSLExpireTime() {
			return this.sSLExpireTime;
		}

		public void setSSLExpireTime(String sSLExpireTime) {
			this.sSLExpireTime = sSLExpireTime;
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

		public String getDBEndpointId() {
			return this.dBEndpointId;
		}

		public void setDBEndpointId(String dBEndpointId) {
			this.dBEndpointId = dBEndpointId;
		}

		public String getCAType() {
			return this.cAType;
		}

		public void setCAType(String cAType) {
			this.cAType = cAType;
		}

		public String getServerCert() {
			return this.serverCert;
		}

		public void setServerCert(String serverCert) {
			this.serverCert = serverCert;
		}

		public String getServerKey() {
			return this.serverKey;
		}

		public void setServerKey(String serverKey) {
			this.serverKey = serverKey;
		}

		public String getClientCACert() {
			return this.clientCACert;
		}

		public void setClientCACert(String clientCACert) {
			this.clientCACert = clientCACert;
		}

		public String getClientCrl() {
			return this.clientCrl;
		}

		public void setClientCrl(String clientCrl) {
			this.clientCrl = clientCrl;
		}

		public String getACL() {
			return this.aCL;
		}

		public void setACL(String aCL) {
			this.aCL = aCL;
		}

		public String getSSLAutoRotate() {
			return this.sSLAutoRotate;
		}

		public void setSSLAutoRotate(String sSLAutoRotate) {
			this.sSLAutoRotate = sSLAutoRotate;
		}

		public List<String> getAllowedACLs() {
			return this.allowedACLs;
		}

		public void setAllowedACLs(List<String> allowedACLs) {
			this.allowedACLs = allowedACLs;
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
