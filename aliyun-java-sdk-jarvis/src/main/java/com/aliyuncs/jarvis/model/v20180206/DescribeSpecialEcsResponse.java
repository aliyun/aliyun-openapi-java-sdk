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

package com.aliyuncs.jarvis.model.v20180206;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.jarvis.transform.v20180206.DescribeSpecialEcsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSpecialEcsResponse extends AcsResponse {

	private String requestId;

	private Boolean ecsFound;

	private String module;

	private EcsInfo ecsInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getEcsFound() {
		return this.ecsFound;
	}

	public void setEcsFound(Boolean ecsFound) {
		this.ecsFound = ecsFound;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public EcsInfo getEcsInfo() {
		return this.ecsInfo;
	}

	public void setEcsInfo(EcsInfo ecsInfo) {
		this.ecsInfo = ecsInfo;
	}

	public static class EcsInfo {

		private String instanceId;

		private String instanceName;

		private String iP;

		private String region;

		private String itemSign;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getItemSign() {
			return this.itemSign;
		}

		public void setItemSign(String itemSign) {
			this.itemSign = itemSign;
		}
	}

	@Override
	public DescribeSpecialEcsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSpecialEcsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
