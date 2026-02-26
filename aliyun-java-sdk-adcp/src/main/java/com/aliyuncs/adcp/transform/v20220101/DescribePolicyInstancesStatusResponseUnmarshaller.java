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

package com.aliyuncs.adcp.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adcp.model.v20220101.DescribePolicyInstancesStatusResponse;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyInstancesStatusResponse.Policies;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyInstancesStatusResponse.Policies.PolicyInstance;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyInstancesStatusResponse.Policies.PolicyInstance.PolicyCluster;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyInstancesStatusResponse.Policies.SeverityInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolicyInstancesStatusResponseUnmarshaller {

	public static DescribePolicyInstancesStatusResponse unmarshall(DescribePolicyInstancesStatusResponse describePolicyInstancesStatusResponse, UnmarshallerContext _ctx) {
		
		describePolicyInstancesStatusResponse.setRequestId(_ctx.stringValue("DescribePolicyInstancesStatusResponse.RequestId"));

		Policies policies = new Policies();

		List<PolicyInstance> policyInstances = new ArrayList<PolicyInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolicyInstancesStatusResponse.Policies.PolicyInstances.Length"); i++) {
			PolicyInstance policyInstance = new PolicyInstance();
			policyInstance.setPolicyName(_ctx.stringValue("DescribePolicyInstancesStatusResponse.Policies.PolicyInstances["+ i +"].PolicyName"));
			policyInstance.setPolicyCategory(_ctx.stringValue("DescribePolicyInstancesStatusResponse.Policies.PolicyInstances["+ i +"].PolicyCategory"));
			policyInstance.setPolicyDescription(_ctx.stringValue("DescribePolicyInstancesStatusResponse.Policies.PolicyInstances["+ i +"].PolicyDescription"));
			policyInstance.setPolicySeverity(_ctx.stringValue("DescribePolicyInstancesStatusResponse.Policies.PolicyInstances["+ i +"].PolicySeverity"));
			policyInstance.setPolicyInstancesCount(_ctx.longValue("DescribePolicyInstancesStatusResponse.Policies.PolicyInstances["+ i +"].PolicyInstancesCount"));

			List<PolicyCluster> policyClusters = new ArrayList<PolicyCluster>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyInstancesStatusResponse.Policies.PolicyInstances["+ i +"].PolicyClusters.Length"); j++) {
				PolicyCluster policyCluster = new PolicyCluster();
				policyCluster.setClusterId(_ctx.stringValue("DescribePolicyInstancesStatusResponse.Policies.PolicyInstances["+ i +"].PolicyClusters["+ j +"].ClusterId"));
				policyCluster.setStatus(_ctx.stringValue("DescribePolicyInstancesStatusResponse.Policies.PolicyInstances["+ i +"].PolicyClusters["+ j +"].Status"));

				policyClusters.add(policyCluster);
			}
			policyInstance.setPolicyClusters(policyClusters);

			policyInstances.add(policyInstance);
		}
		policies.setPolicyInstances(policyInstances);

		List<SeverityInfoItem> severityInfo = new ArrayList<SeverityInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolicyInstancesStatusResponse.Policies.SeverityInfo.Length"); i++) {
			SeverityInfoItem severityInfoItem = new SeverityInfoItem();
			severityInfoItem.setSeverityType(_ctx.stringValue("DescribePolicyInstancesStatusResponse.Policies.SeverityInfo["+ i +"].SeverityType"));
			severityInfoItem.setSeverityCount(_ctx.stringValue("DescribePolicyInstancesStatusResponse.Policies.SeverityInfo["+ i +"].SeverityCount"));

			severityInfo.add(severityInfoItem);
		}
		policies.setSeverityInfo(severityInfo);
		describePolicyInstancesStatusResponse.setPolicies(policies);
	 
	 	return describePolicyInstancesStatusResponse;
	}
}