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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.CreateTrafficMirrorFilterRulesResponse;
import com.aliyuncs.vpc.model.v20160428.CreateTrafficMirrorFilterRulesResponse.EgressRule;
import com.aliyuncs.vpc.model.v20160428.CreateTrafficMirrorFilterRulesResponse.IngressRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTrafficMirrorFilterRulesResponseUnmarshaller {

	public static CreateTrafficMirrorFilterRulesResponse unmarshall(CreateTrafficMirrorFilterRulesResponse createTrafficMirrorFilterRulesResponse, UnmarshallerContext _ctx) {
		
		createTrafficMirrorFilterRulesResponse.setRequestId(_ctx.stringValue("CreateTrafficMirrorFilterRulesResponse.RequestId"));

		List<IngressRule> ingressRules = new ArrayList<IngressRule>();
		for (int i = 0; i < _ctx.lengthValue("CreateTrafficMirrorFilterRulesResponse.IngressRules.Length"); i++) {
			IngressRule ingressRule = new IngressRule();
			ingressRule.setInstanceId(_ctx.stringValue("CreateTrafficMirrorFilterRulesResponse.IngressRules["+ i +"].InstanceId"));

			ingressRules.add(ingressRule);
		}
		createTrafficMirrorFilterRulesResponse.setIngressRules(ingressRules);

		List<EgressRule> egressRules = new ArrayList<EgressRule>();
		for (int i = 0; i < _ctx.lengthValue("CreateTrafficMirrorFilterRulesResponse.EgressRules.Length"); i++) {
			EgressRule egressRule = new EgressRule();
			egressRule.setInstanceId(_ctx.stringValue("CreateTrafficMirrorFilterRulesResponse.EgressRules["+ i +"].InstanceId"));

			egressRules.add(egressRule);
		}
		createTrafficMirrorFilterRulesResponse.setEgressRules(egressRules);
	 
	 	return createTrafficMirrorFilterRulesResponse;
	}
}