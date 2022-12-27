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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.ListAggregateRemediationsResponse;
import com.aliyuncs.config.model.v20200907.ListAggregateRemediationsResponse.Remediation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAggregateRemediationsResponseUnmarshaller {

	public static ListAggregateRemediationsResponse unmarshall(ListAggregateRemediationsResponse listAggregateRemediationsResponse, UnmarshallerContext _ctx) {
		
		listAggregateRemediationsResponse.setRequestId(_ctx.stringValue("ListAggregateRemediationsResponse.RequestId"));

		List<Remediation> remediations = new ArrayList<Remediation>();
		for (int i = 0; i < _ctx.lengthValue("ListAggregateRemediationsResponse.Remediations.Length"); i++) {
			Remediation remediation = new Remediation();
			remediation.setRemediationTemplateId(_ctx.stringValue("ListAggregateRemediationsResponse.Remediations["+ i +"].RemediationTemplateId"));
			remediation.setRemediationDynamicParams(_ctx.stringValue("ListAggregateRemediationsResponse.Remediations["+ i +"].RemediationDynamicParams"));
			remediation.setRemediationSourceType(_ctx.stringValue("ListAggregateRemediationsResponse.Remediations["+ i +"].RemediationSourceType"));
			remediation.setRemediationType(_ctx.stringValue("ListAggregateRemediationsResponse.Remediations["+ i +"].RemediationType"));
			remediation.setLastSuccessfulInvocationId(_ctx.stringValue("ListAggregateRemediationsResponse.Remediations["+ i +"].LastSuccessfulInvocationId"));
			remediation.setAccountId(_ctx.longValue("ListAggregateRemediationsResponse.Remediations["+ i +"].AccountId"));
			remediation.setAggregatorId(_ctx.stringValue("ListAggregateRemediationsResponse.Remediations["+ i +"].AggregatorId"));
			remediation.setLastSuccessfulInvocationType(_ctx.stringValue("ListAggregateRemediationsResponse.Remediations["+ i +"].LastSuccessfulInvocationType"));
			remediation.setRemediationId(_ctx.stringValue("ListAggregateRemediationsResponse.Remediations["+ i +"].RemediationId"));
			remediation.setInvokeType(_ctx.stringValue("ListAggregateRemediationsResponse.Remediations["+ i +"].InvokeType"));
			remediation.setConfigRuleId(_ctx.stringValue("ListAggregateRemediationsResponse.Remediations["+ i +"].ConfigRuleId"));
			remediation.setLastSuccessfulInvocationTime(_ctx.longValue("ListAggregateRemediationsResponse.Remediations["+ i +"].LastSuccessfulInvocationTime"));
			remediation.setRemediaitonOriginParams(_ctx.stringValue("ListAggregateRemediationsResponse.Remediations["+ i +"].RemediaitonOriginParams"));

			remediations.add(remediation);
		}
		listAggregateRemediationsResponse.setRemediations(remediations);
	 
	 	return listAggregateRemediationsResponse;
	}
}