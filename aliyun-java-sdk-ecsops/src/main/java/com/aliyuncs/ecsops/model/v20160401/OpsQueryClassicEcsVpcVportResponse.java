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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryClassicEcsVpcVportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryClassicEcsVpcVportResponse extends AcsResponse {

	private String requestId;

	private List<ClassicEcsVpcVport> classicEcsVpcVportSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClassicEcsVpcVport> getClassicEcsVpcVportSet() {
		return this.classicEcsVpcVportSet;
	}

	public void setClassicEcsVpcVportSet(List<ClassicEcsVpcVport> classicEcsVpcVportSet) {
		this.classicEcsVpcVportSet = classicEcsVpcVportSet;
	}

	public static class ClassicEcsVpcVport {

		private String instanceId;

		private String vportId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getVportId() {
			return this.vportId;
		}

		public void setVportId(String vportId) {
			this.vportId = vportId;
		}
	}

	@Override
	public OpsQueryClassicEcsVpcVportResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryClassicEcsVpcVportResponseUnmarshaller.unmarshall(this, context);
	}
}
