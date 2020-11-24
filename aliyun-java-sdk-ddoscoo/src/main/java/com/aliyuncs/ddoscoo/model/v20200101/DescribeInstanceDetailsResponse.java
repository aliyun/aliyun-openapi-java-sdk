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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeInstanceDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceDetailsResponse extends AcsResponse {

	private String requestId;

	private List<InstanceDetail> instanceDetails;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceDetail> getInstanceDetails() {
		return this.instanceDetails;
	}

	public void setInstanceDetails(List<InstanceDetail> instanceDetails) {
		this.instanceDetails = instanceDetails;
	}

	public static class InstanceDetail {

		private String instanceId;

		private String line;

		private List<EipInfo> eipInfos;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getLine() {
			return this.line;
		}

		public void setLine(String line) {
			this.line = line;
		}

		public List<EipInfo> getEipInfos() {
			return this.eipInfos;
		}

		public void setEipInfos(List<EipInfo> eipInfos) {
			this.eipInfos = eipInfos;
		}

		public static class EipInfo {

			private String eip;

			private String status;

			public String getEip() {
				return this.eip;
			}

			public void setEip(String eip) {
				this.eip = eip;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public DescribeInstanceDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
