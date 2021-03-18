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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.CreateTrafficMirrorFilterRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTrafficMirrorFilterRulesResponse extends AcsResponse {

	private String requestId;

	private List<IngressRule> ingressRules;

	private List<EgressRule> egressRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IngressRule> getIngressRules() {
		return this.ingressRules;
	}

	public void setIngressRules(List<IngressRule> ingressRules) {
		this.ingressRules = ingressRules;
	}

	public List<EgressRule> getEgressRules() {
		return this.egressRules;
	}

	public void setEgressRules(List<EgressRule> egressRules) {
		this.egressRules = egressRules;
	}

	public static class IngressRule {

		private String instanceId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	public static class EgressRule {

		private String instanceId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public CreateTrafficMirrorFilterRulesResponse getInstance(UnmarshallerContext context) {
		return	CreateTrafficMirrorFilterRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
