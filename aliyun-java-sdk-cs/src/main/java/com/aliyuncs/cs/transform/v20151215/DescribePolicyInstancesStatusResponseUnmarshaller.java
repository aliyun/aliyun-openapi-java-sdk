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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribePolicyInstancesStatusResponse;
import com.aliyuncs.cs.model.v20151215.DescribePolicyInstancesStatusResponse.Policy_instancesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolicyInstancesStatusResponseUnmarshaller {

	public static DescribePolicyInstancesStatusResponse unmarshall(DescribePolicyInstancesStatusResponse describePolicyInstancesStatusResponse, UnmarshallerContext _ctx) {
		
		describePolicyInstancesStatusResponse.setInstances_severity_count(_ctx.mapValue("DescribePolicyInstancesStatusResponse.instances_severity_count"));

		List<Policy_instancesItem> policy_instances = new ArrayList<Policy_instancesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolicyInstancesStatusResponse.policy_instances.Length"); i++) {
			Policy_instancesItem policy_instancesItem = new Policy_instancesItem();
			policy_instancesItem.setPolicy_category(_ctx.stringValue("DescribePolicyInstancesStatusResponse.policy_instances["+ i +"].policy_category"));
			policy_instancesItem.setPolicy_name(_ctx.stringValue("DescribePolicyInstancesStatusResponse.policy_instances["+ i +"].policy_name"));
			policy_instancesItem.setPolicy_description(_ctx.stringValue("DescribePolicyInstancesStatusResponse.policy_instances["+ i +"].policy_description"));
			policy_instancesItem.setPolicy_severity(_ctx.stringValue("DescribePolicyInstancesStatusResponse.policy_instances["+ i +"].policy_severity"));
			policy_instancesItem.setPolicy_instances_count(_ctx.longValue("DescribePolicyInstancesStatusResponse.policy_instances["+ i +"].policy_instances_count"));

			policy_instances.add(policy_instancesItem);
		}
		describePolicyInstancesStatusResponse.setPolicy_instances(policy_instances);
	 
	 	return describePolicyInstancesStatusResponse;
	}
}