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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsKickVmResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsKickVmResponse extends AcsResponse {

	private String requestId;

	private List<KickVmResult> kickVmResultArrays;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<KickVmResult> getKickVmResultArrays() {
		return this.kickVmResultArrays;
	}

	public void setKickVmResultArrays(List<KickVmResult> kickVmResultArrays) {
		this.kickVmResultArrays = kickVmResultArrays;
	}

	public static class KickVmResult {

		private Long usedTime;

		private String result;

		private String instanceId;

		private String output;

		public Long getUsedTime() {
			return this.usedTime;
		}

		public void setUsedTime(Long usedTime) {
			this.usedTime = usedTime;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getOutput() {
			return this.output;
		}

		public void setOutput(String output) {
			this.output = output;
		}
	}

	@Override
	public OpsKickVmResponse getInstance(UnmarshallerContext context) {
		return	OpsKickVmResponseUnmarshaller.unmarshall(this, context);
	}
}
