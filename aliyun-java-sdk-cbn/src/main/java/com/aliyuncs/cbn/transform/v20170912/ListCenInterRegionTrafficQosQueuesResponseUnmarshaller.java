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

import com.aliyuncs.cbn.model.v20170912.ListCenInterRegionTrafficQosQueuesResponse;
import com.aliyuncs.cbn.model.v20170912.ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueue;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCenInterRegionTrafficQosQueuesResponseUnmarshaller {

	public static ListCenInterRegionTrafficQosQueuesResponse unmarshall(ListCenInterRegionTrafficQosQueuesResponse listCenInterRegionTrafficQosQueuesResponse, UnmarshallerContext _ctx) {
		
		listCenInterRegionTrafficQosQueuesResponse.setRequestId(_ctx.stringValue("ListCenInterRegionTrafficQosQueuesResponse.RequestId"));
		listCenInterRegionTrafficQosQueuesResponse.setNextToken(_ctx.stringValue("ListCenInterRegionTrafficQosQueuesResponse.NextToken"));

		List<TrafficQosQueue> trafficQosQueues = new ArrayList<TrafficQosQueue>();
		for (int i = 0; i < _ctx.lengthValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues.Length"); i++) {
			TrafficQosQueue trafficQosQueue = new TrafficQosQueue();
			trafficQosQueue.setTransitRouterAttachmentId(_ctx.stringValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues["+ i +"].TransitRouterAttachmentId"));
			trafficQosQueue.setTransitRouterId(_ctx.stringValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues["+ i +"].TransitRouterId"));
			trafficQosQueue.setTrafficQosQueueName(_ctx.stringValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues["+ i +"].TrafficQosQueueName"));
			trafficQosQueue.setRemainBandwidthPercent(_ctx.integerValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues["+ i +"].RemainBandwidthPercent"));
			trafficQosQueue.setBandwidth(_ctx.stringValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues["+ i +"].Bandwidth"));
			trafficQosQueue.setEffectiveBandwidth(_ctx.stringValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues["+ i +"].EffectiveBandwidth"));
			trafficQosQueue.setTrafficQosPolicyId(_ctx.stringValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues["+ i +"].TrafficQosPolicyId"));
			trafficQosQueue.setTrafficQosQueueId(_ctx.stringValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues["+ i +"].TrafficQosQueueId"));
			trafficQosQueue.setTrafficQosQueueDescription(_ctx.stringValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues["+ i +"].TrafficQosQueueDescription"));
			trafficQosQueue.setStatus(_ctx.stringValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues["+ i +"].Status"));

			List<Integer> dscps = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues["+ i +"].Dscps.Length"); j++) {
				dscps.add(_ctx.integerValue("ListCenInterRegionTrafficQosQueuesResponse.TrafficQosQueues["+ i +"].Dscps["+ j +"]"));
			}
			trafficQosQueue.setDscps(dscps);

			trafficQosQueues.add(trafficQosQueue);
		}
		listCenInterRegionTrafficQosQueuesResponse.setTrafficQosQueues(trafficQosQueues);
	 
	 	return listCenInterRegionTrafficQosQueuesResponse;
	}
}