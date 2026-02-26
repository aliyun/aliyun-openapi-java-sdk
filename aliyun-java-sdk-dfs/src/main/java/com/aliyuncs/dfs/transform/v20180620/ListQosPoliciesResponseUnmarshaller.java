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

package com.aliyuncs.dfs.transform.v20180620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dfs.model.v20180620.ListQosPoliciesResponse;
import com.aliyuncs.dfs.model.v20180620.ListQosPoliciesResponse.QosPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQosPoliciesResponseUnmarshaller {

	public static ListQosPoliciesResponse unmarshall(ListQosPoliciesResponse listQosPoliciesResponse, UnmarshallerContext _ctx) {
		
		listQosPoliciesResponse.setRequestId(_ctx.stringValue("ListQosPoliciesResponse.RequestId"));

		List<QosPolicy> qosPolicies = new ArrayList<QosPolicy>();
		for (int i = 0; i < _ctx.lengthValue("ListQosPoliciesResponse.QosPolicies.Length"); i++) {
			QosPolicy qosPolicy = new QosPolicy();
			qosPolicy.setQosPolicyId(_ctx.stringValue("ListQosPoliciesResponse.QosPolicies["+ i +"].QosPolicyId"));
			qosPolicy.setFileSystemId(_ctx.stringValue("ListQosPoliciesResponse.QosPolicies["+ i +"].FileSystemId"));
			qosPolicy.setFederationId(_ctx.stringValue("ListQosPoliciesResponse.QosPolicies["+ i +"].FederationId"));
			qosPolicy.setDescription(_ctx.stringValue("ListQosPoliciesResponse.QosPolicies["+ i +"].Description"));
			qosPolicy.setFlowIds(_ctx.stringValue("ListQosPoliciesResponse.QosPolicies["+ i +"].FlowIds"));
			qosPolicy.setZoneIds(_ctx.stringValue("ListQosPoliciesResponse.QosPolicies["+ i +"].ZoneIds"));
			qosPolicy.setMaxMetaQps(_ctx.longValue("ListQosPoliciesResponse.QosPolicies["+ i +"].MaxMetaQps"));
			qosPolicy.setMaxIOps(_ctx.longValue("ListQosPoliciesResponse.QosPolicies["+ i +"].MaxIOps"));
			qosPolicy.setMaxIOBandWidth(_ctx.longValue("ListQosPoliciesResponse.QosPolicies["+ i +"].MaxIOBandWidth"));

			qosPolicies.add(qosPolicy);
		}
		listQosPoliciesResponse.setQosPolicies(qosPolicies);
	 
	 	return listQosPoliciesResponse;
	}
}