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

	public static GetAutoScaleConfigResponse unmarshall(GetAutoScaleConfigResponse getAutoScaleConfigResponse, UnmarshallerContext _ctx) {
		
		getAutoScaleConfigResponse.setRequestId(_ctx.stringValue("GetAutoScaleConfigResponse.RequestId"));
		getAutoScaleConfigResponse.setUid(_ctx.stringValue("GetAutoScaleConfigResponse.Uid"));
		getAutoScaleConfigResponse.setClusterId(_ctx.stringValue("GetAutoScaleConfigResponse.ClusterId"));
		getAutoScaleConfigResponse.setClusterType(_ctx.stringValue("GetAutoScaleConfigResponse.ClusterType"));
		getAutoScaleConfigResponse.setEnableAutoGrow(_ctx.booleanValue("GetAutoScaleConfigResponse.EnableAutoGrow"));
		getAutoScaleConfigResponse.setEnableAutoShrink(_ctx.booleanValue("GetAutoScaleConfigResponse.EnableAutoShrink"));
		getAutoScaleConfigResponse.setGrowIntervalInMinutes(_ctx.integerValue("GetAutoScaleConfigResponse.GrowIntervalInMinutes"));
		getAutoScaleConfigResponse.setShrinkIntervalInMinutes(_ctx.integerValue("GetAutoScaleConfigResponse.ShrinkIntervalInMinutes"));
		getAutoScaleConfigResponse.setShrinkIdleTimes(_ctx.integerValue("GetAutoScaleConfigResponse.ShrinkIdleTimes"));
		getAutoScaleConfigResponse.setGrowTimeoutInMinutes(_ctx.integerValue("GetAutoScaleConfigResponse.GrowTimeoutInMinutes"));
		getAutoScaleConfigResponse.setExtraNodesGrowRatio(_ctx.integerValue("GetAutoScaleConfigResponse.ExtraNodesGrowRatio"));
		getAutoScaleConfigResponse.setGrowRatio(_ctx.integerValue("GetAutoScaleConfigResponse.GrowRatio"));
		getAutoScaleConfigResponse.setMaxNodesInCluster(_ctx.integerValue("GetAutoScaleConfigResponse.MaxNodesInCluster"));
		getAutoScaleConfigResponse.setExcludeNodes(_ctx.stringValue("GetAutoScaleConfigResponse.ExcludeNodes"));
		getAutoScaleConfigResponse.setSpotStrategy(_ctx.stringValue("GetAutoScaleConfigResponse.SpotStrategy"));
		getAutoScaleConfigResponse.setSpotPriceLimit(_ctx.floatValue("GetAutoScaleConfigResponse.SpotPriceLimit"));
		getAutoScaleConfigResponse.setImageId(_ctx.stringValue("GetAutoScaleConfigResponse.ImageId"));

		List<QueueInfo> queues = new ArrayList<QueueInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoScaleConfigResponse.Queues.Length"); i++) {
			QueueInfo queueInfo = new QueueInfo();
			queueInfo.setQueueName(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].QueueName"));
			queueInfo.setResourceGroupId(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].ResourceGroupId"));
			queueInfo.setInstanceType(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceType"));
			queueInfo.setSpotStrategy(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].SpotStrategy"));
			queueInfo.setSpotPriceLimit(_ctx.floatValue("GetAutoScaleConfigResponse.Queues["+ i +"].SpotPriceLimit"));
			queueInfo.setEnableAutoGrow(_ctx.booleanValue("GetAutoScaleConfigResponse.Queues["+ i +"].EnableAutoGrow"));
			queueInfo.setEnableAutoShrink(_ctx.booleanValue("GetAutoScaleConfigResponse.Queues["+ i +"].EnableAutoShrink"));
			queueInfo.setMaxNodesInQueue(_ctx.integerValue("GetAutoScaleConfigResponse.Queues["+ i +"].MaxNodesInQueue"));

			List<InstanceTypeInfo> instanceTypes = new ArrayList<InstanceTypeInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes.Length"); j++) {
				InstanceTypeInfo instanceTypeInfo = new InstanceTypeInfo();
				instanceTypeInfo.setInstanceType(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].InstanceType"));
				instanceTypeInfo.setSpotStrategy(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].SpotStrategy"));
				instanceTypeInfo.setSpotPriceLimit(_ctx.floatValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].SpotPriceLimit"));
				instanceTypeInfo.setZoneId(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].ZoneId"));
				instanceTypeInfo.setVSwitchId(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].VSwitchId"));
				instanceTypeInfo.setHostNamePrefix(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].HostNamePrefix"));

				instanceTypes.add(instanceTypeInfo);
			}
			queueInfo.setInstanceTypes(instanceTypes);

			queues.add(queueInfo);
		}
		getAutoScaleConfigResponse.setQueues(queues);
	 
	 	return getAutoScaleConfigResponse;
	}
}