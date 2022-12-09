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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.ListCenInterRegionTrafficQosPoliciesResponse;
import com.aliyuncs.cbn.model.v20170912.ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicy;
import com.aliyuncs.cbn.model.v20170912.ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicy.TrafficQosQueue;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCenInterRegionTrafficQosPoliciesResponseUnmarshaller {

	public static ListCenInterRegionTrafficQosPoliciesResponse unmarshall(ListCenInterRegionTrafficQosPoliciesResponse listCenInterRegionTrafficQosPoliciesResponse, UnmarshallerContext _ctx) {
		
		listCenInterRegionTrafficQosPoliciesResponse.setRequestId(_ctx.stringValue("ListCenInterRegionTrafficQosPoliciesResponse.RequestId"));
		listCenInterRegionTrafficQosPoliciesResponse.setNextToken(_ctx.stringValue("ListCenInterRegionTrafficQosPoliciesResponse.NextToken"));
		listCenInterRegionTrafficQosPoliciesResponse.setTotalCount(_ctx.integerValue("ListCenInterRegionTrafficQosPoliciesResponse.TotalCount"));
		listCenInterRegionTrafficQosPoliciesResponse.setMaxResults(_ctx.integerValue("ListCenInterRegionTrafficQosPoliciesResponse.MaxResults"));

		List<TrafficQosPolicy> trafficQosPolicies = new ArrayList<TrafficQosPolicy>();
		for (int i = 0; i < _ctx.lengthValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies.Length"); i++) {
			TrafficQosPolicy trafficQosPolicy = new TrafficQosPolicy();
			trafficQosPolicy.setTrafficQosPolicyName(_ctx.stringValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TrafficQosPolicyName"));
			trafficQosPolicy.setTrafficQosPolicyStatus(_ctx.stringValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TrafficQosPolicyStatus"));
			trafficQosPolicy.setTrafficQosPolicyId(_ctx.stringValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TrafficQosPolicyId"));
			trafficQosPolicy.setTrafficQosPolicyDescription(_ctx.stringValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TrafficQosPolicyDescription"));
			trafficQosPolicy.setTransitRouterId(_ctx.stringValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TransitRouterId"));
			trafficQosPolicy.setTransitRouterAttachmentId(_ctx.stringValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TransitRouterAttachmentId"));

			List<TrafficQosQueue> trafficQosQueues = new ArrayList<TrafficQosQueue>();
			for (int j = 0; j < _ctx.lengthValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TrafficQosQueues.Length"); j++) {
				TrafficQosQueue trafficQosQueue = new TrafficQosQueue();
				trafficQosQueue.setQosQueueName(_ctx.stringValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TrafficQosQueues["+ j +"].QosQueueName"));
				trafficQosQueue.setRemainBandwidthPercent(_ctx.integerValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TrafficQosQueues["+ j +"].RemainBandwidthPercent"));
				trafficQosQueue.setQosQueueId(_ctx.stringValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TrafficQosQueues["+ j +"].QosQueueId"));
				trafficQosQueue.setQosQueueDescription(_ctx.stringValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TrafficQosQueues["+ j +"].QosQueueDescription"));

				List<Integer> dscps = new ArrayList<Integer>();
				for (int k = 0; k < _ctx.lengthValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TrafficQosQueues["+ j +"].Dscps.Length"); k++) {
					dscps.add(_ctx.integerValue("ListCenInterRegionTrafficQosPoliciesResponse.TrafficQosPolicies["+ i +"].TrafficQosQueues["+ j +"].Dscps["+ k +"]"));
				}
				trafficQosQueue.setDscps(dscps);

				trafficQosQueues.add(trafficQosQueue);
			}
			trafficQosPolicy.setTrafficQosQueues(trafficQosQueues);

			trafficQosPolicies.add(trafficQosPolicy);
		}
		listCenInterRegionTrafficQosPoliciesResponse.setTrafficQosPolicies(trafficQosPolicies);
	 
	 	return listCenInterRegionTrafficQosPoliciesResponse;
	}
}