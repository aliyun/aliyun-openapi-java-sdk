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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeInstanceSSLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceSSLResponse extends AcsResponse {

	private String requestId;

	private InstanceSSL instanceSSL;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InstanceSSL getInstanceSSL() {
		return this.instanceSSL;
	}

	public void setInstanceSSL(InstanceSSL instanceSSL) {
		this.instanceSSL = instanceSSL;
	}

	public static class InstanceSSL {

		private String instanceId;

		private String enableSSL;

		private String validPeriod;

		private String caUrl;

		private String status;

		private Boolean forceSSLSupport;

		private String forceSSL;

		private String autoUpdate;

		private String tenantId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getEnableSSL() {
			return this.enableSSL;
		}

		public void setEnableSSL(String enableSSL) {
			this.enableSSL = enableSSL;
		}

		public String getValidPeriod() {
			return this.validPeriod;
		}

		public void setValidPeriod(String validPeriod) {
			this.validPeriod = validPeriod;
		}

		public String getCaUrl() {
			return this.caUrl;
		}

		public void setCaUrl(String caUrl) {
			this.caUrl = caUrl;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getForceSSLSupport() {
			return this.forceSSLSupport;
		}

		public void setForceSSLSupport(Boolean forceSSLSupport) {
			this.forceSSLSupport = forceSSLSupport;
		}

		public String getForceSSL() {
			return this.forceSSL;
		}

		public void setForceSSL(String forceSSL) {
			this.forceSSL = forceSSL;
		}

		public String getAutoUpdate() {
			return this.autoUpdate;
		}

		public void setAutoUpdate(String autoUpdate) {
			this.autoUpdate = autoUpdate;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}

	@Override
	public DescribeInstanceSSLResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceSSLResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
