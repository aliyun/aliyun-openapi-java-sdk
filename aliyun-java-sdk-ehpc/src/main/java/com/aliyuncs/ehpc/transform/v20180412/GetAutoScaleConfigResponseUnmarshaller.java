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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.GetAutoScaleConfigResponse;
import com.aliyuncs.ehpc.model.v20180412.GetAutoScaleConfigResponse.QueueInfo;
import com.aliyuncs.ehpc.model.v20180412.GetAutoScaleConfigResponse.QueueInfo.InstanceTypeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutoScaleConfigResponseUnmarshaller {

	public static GetAutoScaleConfigResponse unmarshall(GetAutoScaleConfigResponse getAutoScaleConfigResponse, UnmarshallerContext context) {
		
		getAutoScaleConfigResponse.setRequestId(context.stringValue("GetAutoScaleConfigResponse.RequestId"));
		getAutoScaleConfigResponse.setUid(context.stringValue("GetAutoScaleConfigResponse.Uid"));
		getAutoScaleConfigResponse.setClusterId(context.stringValue("GetAutoScaleConfigResponse.ClusterId"));
		getAutoScaleConfigResponse.setClusterType(context.stringValue("GetAutoScaleConfigResponse.ClusterType"));
		getAutoScaleConfigResponse.setEnableAutoGrow(context.booleanValue("GetAutoScaleConfigResponse.EnableAutoGrow"));
		getAutoScaleConfigResponse.setEnableAutoShrink(context.booleanValue("GetAutoScaleConfigResponse.EnableAutoShrink"));
		getAutoScaleConfigResponse.setGrowIntervalInMinutes(context.integerValue("GetAutoScaleConfigResponse.GrowIntervalInMinutes"));
		getAutoScaleConfigResponse.setShrinkIntervalInMinutes(context.integerValue("GetAutoScaleConfigResponse.ShrinkIntervalInMinutes"));
		getAutoScaleConfigResponse.setShrinkIdleTimes(context.integerValue("GetAutoScaleConfigResponse.ShrinkIdleTimes"));
		getAutoScaleConfigResponse.setGrowTimeoutInMinutes(context.integerValue("GetAutoScaleConfigResponse.GrowTimeoutInMinutes"));
		getAutoScaleConfigResponse.setExtraNodesGrowRatio(context.integerValue("GetAutoScaleConfigResponse.ExtraNodesGrowRatio"));
		getAutoScaleConfigResponse.setGrowRatio(context.integerValue("GetAutoScaleConfigResponse.GrowRatio"));
		getAutoScaleConfigResponse.setMaxNodesInCluster(context.integerValue("GetAutoScaleConfigResponse.MaxNodesInCluster"));
		getAutoScaleConfigResponse.setExcludeNodes(context.stringValue("GetAutoScaleConfigResponse.ExcludeNodes"));
		getAutoScaleConfigResponse.setSpotStrategy(context.stringValue("GetAutoScaleConfigResponse.SpotStrategy"));
		getAutoScaleConfigResponse.setSpotPriceLimit(context.floatValue("GetAutoScaleConfigResponse.SpotPriceLimit"));

		List<QueueInfo> queues = new ArrayList<QueueInfo>();
		for (int i = 0; i < context.lengthValue("GetAutoScaleConfigResponse.Queues.Length"); i++) {
			QueueInfo queueInfo = new QueueInfo();
			queueInfo.setQueueName(context.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].QueueName"));
			queueInfo.setInstanceType(context.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceType"));
			queueInfo.setSpotStrategy(context.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].SpotStrategy"));
			queueInfo.setSpotPriceLimit(context.floatValue("GetAutoScaleConfigResponse.Queues["+ i +"].SpotPriceLimit"));
			queueInfo.setEnableAutoGrow(context.booleanValue("GetAutoScaleConfigResponse.Queues["+ i +"].EnableAutoGrow"));
			queueInfo.setEnableAutoShrink(context.booleanValue("GetAutoScaleConfigResponse.Queues["+ i +"].EnableAutoShrink"));

			List<InstanceTypeInfo> instanceTypes = new ArrayList<InstanceTypeInfo>();
			for (int j = 0; j < context.lengthValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes.Length"); j++) {
				InstanceTypeInfo instanceTypeInfo = new InstanceTypeInfo();
				instanceTypeInfo.setInstanceType(context.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].InstanceType"));
				instanceTypeInfo.setSpotStrategy(context.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].SpotStrategy"));
				instanceTypeInfo.setSpotPriceLimit(context.floatValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].SpotPriceLimit"));
				instanceTypeInfo.setZoneId(context.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].ZoneId"));
				instanceTypeInfo.setVSwitchId(context.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].VSwitchId"));

				instanceTypes.add(instanceTypeInfo);
			}
			queueInfo.setInstanceTypes(instanceTypes);

			queues.add(queueInfo);
		}
		getAutoScaleConfigResponse.setQueues(queues);
	 
	 	return getAutoScaleConfigResponse;
	}
}