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
import com.aliyuncs.servicemesh.transform.v20200111.DescribeUpgradeVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUpgradeVersionResponse extends AcsResponse {

	private String requestId;

	private Version version;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Version getVersion() {
		return this.version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

	public static class Version {

		private String istioVersion;

		private String istioOperatorVersion;

		private String kubernetesVersion;

		public String getIstioVersion() {
			return this.istioVersion;
		}

		public void setIstioVersion(String istioVersion) {
			this.istioVersion = istioVersion;
		}

		public String getIstioOperatorVersion() {
			return this.istioOperatorVersion;
		}

		public void setIstioOperatorVersion(String istioOperatorVersion) {
			this.istioOperatorVersion = istioOperatorVersion;
		}

		public String getKubernetesVersion() {
			return this.kubernetesVersion;
		}

		public void setKubernetesVersion(String kubernetesVersion) {
			this.kubernetesVersion = kubernetesVersion;
		}
	}

	@Override
	public DescribeUpgradeVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeUpgradeVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
