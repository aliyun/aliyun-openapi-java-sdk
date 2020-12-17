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

package com.aliyuncs.servicemesh.model.v20200111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.servicemesh.transform.v20200111.GetVmMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVmMetaResponse extends AcsResponse {

	private String requestId;

	private VmMetaInfo vmMetaInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public VmMetaInfo getVmMetaInfo() {
		return this.vmMetaInfo;
	}

	public void setVmMetaInfo(VmMetaInfo vmMetaInfo) {
		this.vmMetaInfo = vmMetaInfo;
	}

	public static class VmMetaInfo {

		private String rootCertPath;

		private String rootCertContent;

		private String keyPath;

		private String keyContent;

		private String certChainPath;

		private String certChainContent;

		private String envoyEnvPath;

		private String envoyEnvContent;

		private String hostsPath;

		private String hostsContent;

		private String tokenPath;

		private String tokenContent;

		public String getRootCertPath() {
			return this.rootCertPath;
		}

		public void setRootCertPath(String rootCertPath) {
			this.rootCertPath = rootCertPath;
		}

		public String getRootCertContent() {
			return this.rootCertContent;
		}

		public void setRootCertContent(String rootCertContent) {
			this.rootCertContent = rootCertContent;
		}

		public String getKeyPath() {
			return this.keyPath;
		}

		public void setKeyPath(String keyPath) {
			this.keyPath = keyPath;
		}

		public String getKeyContent() {
			return this.keyContent;
		}

		public void setKeyContent(String keyContent) {
			this.keyContent = keyContent;
		}

		public String getCertChainPath() {
			return this.certChainPath;
		}

		public void setCertChainPath(String certChainPath) {
			this.certChainPath = certChainPath;
		}

		public String getCertChainContent() {
			return this.certChainContent;
		}

		public void setCertChainContent(String certChainContent) {
			this.certChainContent = certChainContent;
		}

		public String getEnvoyEnvPath() {
			return this.envoyEnvPath;
		}

		public void setEnvoyEnvPath(String envoyEnvPath) {
			this.envoyEnvPath = envoyEnvPath;
		}

		public String getEnvoyEnvContent() {
			return this.envoyEnvContent;
		}

		public void setEnvoyEnvContent(String envoyEnvContent) {
			this.envoyEnvContent = envoyEnvContent;
		}

		public String getHostsPath() {
			return this.hostsPath;
		}

		public void setHostsPath(String hostsPath) {
			this.hostsPath = hostsPath;
		}

		public String getHostsContent() {
			return this.hostsContent;
		}

		public void setHostsContent(String hostsContent) {
			this.hostsContent = hostsContent;
		}

		public String getTokenPath() {
			return this.tokenPath;
		}

		public void setTokenPath(String tokenPath) {
			this.tokenPath = tokenPath;
		}

		public String getTokenContent() {
			return this.tokenContent;
		}

		public void setTokenContent(String tokenContent) {
			this.tokenContent = tokenContent;
		}
	}

	@Override
	public GetVmMetaResponse getInstance(UnmarshallerContext context) {
		return	GetVmMetaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
