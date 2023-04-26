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

import com.aliyuncs.config.model.v20200907.ListRemediationsResponse;
import com.aliyuncs.config.model.v20200907.ListRemediationsResponse.Remediation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRemediationsResponseUnmarshaller {

	public static ListRemediationsResponse unmarshall(ListRemediationsResponse listRemediationsResponse, UnmarshallerContext _ctx) {
		
		listRemediationsResponse.setRequestId(_ctx.stringValue("ListRemediationsResponse.RequestId"));
		listRemediationsResponse.setPageNumber(_ctx.longValue("ListRemediationsResponse.PageNumber"));
		listRemediationsResponse.setPageSize(_ctx.longValue("ListRemediationsResponse.PageSize"));
		listRemediationsResponse.setTotalCount(_ctx.stringValue("ListRemediationsResponse.TotalCount"));

		List<Remediation> remediations = new ArrayList<Remediation>();
		for (int i = 0; i < _ctx.lengthValue("ListRemediationsResponse.Remediations.Length"); i++) {
			Remediation remediation = new Remediation();
			remediation.setLastSuccessfulInvocationType(_ctx.stringValue("ListRemediationsResponse.Remediations["+ i +"].LastSuccessfulInvocationType"));
			remediation.setRemediationTemplateId(_ctx.stringValue("ListRemediationsResponse.Remediations["+ i +"].RemediationTemplateId"));
			remediation.setRemediationDynamicParams(_ctx.stringValue("ListRemediationsResponse.Remediations["+ i +"].RemediationDynamicParams"));
			remediation.setRemediationId(_ctx.stringValue("ListRemediationsResponse.Remediations["+ i +"].RemediationId"));
			remediation.setRemediationSourceType(_ctx.stringValue("ListRemediationsResponse.Remediations["+ i +"].RemediationSourceType"));
			remediation.setRemediationType(_ctx.stringValue("ListRemediationsResponse.Remediations["+ i +"].RemediationType"));
			remediation.setLastSuccessfulInvocationId(_ctx.stringValue("ListRemediationsResponse.Remediations["+ i +"].LastSuccessfulInvocationId"));
			remediation.setAccountId(_ctx.longValue("ListRemediationsResponse.Remediations["+ i +"].AccountId"));
			remediation.setInvokeType(_ctx.stringValue("ListRemediationsResponse.Remediations["+ i +"].InvokeType"));
			remediation.setConfigRuleId(_ctx.stringValue("ListRemediationsResponse.Remediations["+ i +"].ConfigRuleId"));
			remediation.setLastSuccessfulInvocationTime(_ctx.longValue("ListRemediationsResponse.Remediations["+ i +"].LastSuccessfulInvocationTime"));
			remediation.setRemediationOriginParams(_ctx.stringValue("ListRemediationsResponse.Remediations["+ i +"].RemediationOriginParams"));

			remediations.add(remediation);
		}
		listRemediationsResponse.setRemediations(remediations);
	 
	 	return listRemediationsResponse;
	}
}