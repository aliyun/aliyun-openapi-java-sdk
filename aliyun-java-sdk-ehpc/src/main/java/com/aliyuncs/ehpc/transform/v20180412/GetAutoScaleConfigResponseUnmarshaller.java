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
import com.aliyuncs.ehpc.model.v20180412.GetAutoScaleConfigResponse.QueueInfo.DataDisksInfo;
import com.aliyuncs.ehpc.model.v20180412.GetAutoScaleConfigResponse.QueueInfo.InstanceTypeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutoScaleConfigResponseUnmarshaller {

	public static GetAutoScaleConfigResponse unmarshall(GetAutoScaleConfigResponse getAutoScaleConfigResponse, UnmarshallerContext _ctx) {
		
		getAutoScaleConfigResponse.setRequestId(_ctx.stringValue("GetAutoScaleConfigResponse.RequestId"));
		getAutoScaleConfigResponse.setMaxNodesInCluster(_ctx.integerValue("GetAutoScaleConfigResponse.MaxNodesInCluster"));
		getAutoScaleConfigResponse.setGrowTimeoutInMinutes(_ctx.integerValue("GetAutoScaleConfigResponse.GrowTimeoutInMinutes"));
		getAutoScaleConfigResponse.setSpotStrategy(_ctx.stringValue("GetAutoScaleConfigResponse.SpotStrategy"));
		getAutoScaleConfigResponse.setEnableAutoShrink(_ctx.booleanValue("GetAutoScaleConfigResponse.EnableAutoShrink"));
		getAutoScaleConfigResponse.setEnableAutoGrow(_ctx.booleanValue("GetAutoScaleConfigResponse.EnableAutoGrow"));
		getAutoScaleConfigResponse.setClusterType(_ctx.stringValue("GetAutoScaleConfigResponse.ClusterType"));
		getAutoScaleConfigResponse.setExcludeNodes(_ctx.stringValue("GetAutoScaleConfigResponse.ExcludeNodes"));
		getAutoScaleConfigResponse.setShrinkIntervalInMinutes(_ctx.integerValue("GetAutoScaleConfigResponse.ShrinkIntervalInMinutes"));
		getAutoScaleConfigResponse.setGrowIntervalInMinutes(_ctx.integerValue("GetAutoScaleConfigResponse.GrowIntervalInMinutes"));
		getAutoScaleConfigResponse.setSpotPriceLimit(_ctx.floatValue("GetAutoScaleConfigResponse.SpotPriceLimit"));
		getAutoScaleConfigResponse.setExtraNodesGrowRatio(_ctx.integerValue("GetAutoScaleConfigResponse.ExtraNodesGrowRatio"));
		getAutoScaleConfigResponse.setShrinkIdleTimes(_ctx.integerValue("GetAutoScaleConfigResponse.ShrinkIdleTimes"));
		getAutoScaleConfigResponse.setImageId(_ctx.stringValue("GetAutoScaleConfigResponse.ImageId"));
		getAutoScaleConfigResponse.setGrowRatio(_ctx.integerValue("GetAutoScaleConfigResponse.GrowRatio"));
		getAutoScaleConfigResponse.setClusterId(_ctx.stringValue("GetAutoScaleConfigResponse.ClusterId"));
		getAutoScaleConfigResponse.setUid(_ctx.stringValue("GetAutoScaleConfigResponse.Uid"));

		List<QueueInfo> queues = new ArrayList<QueueInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoScaleConfigResponse.Queues.Length"); i++) {
			QueueInfo queueInfo = new QueueInfo();
			queueInfo.setQueueImageId(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].QueueImageId"));
			queueInfo.setSystemDiskCategory(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].SystemDiskCategory"));
			queueInfo.setInstanceType(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceType"));
			queueInfo.setHostNameSuffix(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].HostNameSuffix"));
			queueInfo.setSpotStrategy(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].SpotStrategy"));
			queueInfo.setMinNodesInQueue(_ctx.integerValue("GetAutoScaleConfigResponse.Queues["+ i +"].MinNodesInQueue"));
			queueInfo.setHostNamePrefix(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].HostNamePrefix"));
			queueInfo.setSystemDiskSize(_ctx.integerValue("GetAutoScaleConfigResponse.Queues["+ i +"].SystemDiskSize"));
			queueInfo.setMaxNodesInQueue(_ctx.integerValue("GetAutoScaleConfigResponse.Queues["+ i +"].MaxNodesInQueue"));
			queueInfo.setEnableAutoShrink(_ctx.booleanValue("GetAutoScaleConfigResponse.Queues["+ i +"].EnableAutoShrink"));
			queueInfo.setQueueName(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].QueueName"));
			queueInfo.setEnableAutoGrow(_ctx.booleanValue("GetAutoScaleConfigResponse.Queues["+ i +"].EnableAutoGrow"));
			queueInfo.setSystemDiskLevel(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].SystemDiskLevel"));
			queueInfo.setResourceGroupId(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].ResourceGroupId"));
			queueInfo.setSpotPriceLimit(_ctx.floatValue("GetAutoScaleConfigResponse.Queues["+ i +"].SpotPriceLimit"));
			queueInfo.setMaxNodesPerCycle(_ctx.longValue("GetAutoScaleConfigResponse.Queues["+ i +"].MaxNodesPerCycle"));
			queueInfo.setMinNodesPerCycle(_ctx.longValue("GetAutoScaleConfigResponse.Queues["+ i +"].MinNodesPerCycle"));

			List<InstanceTypeInfo> instanceTypes = new ArrayList<InstanceTypeInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes.Length"); j++) {
				InstanceTypeInfo instanceTypeInfo = new InstanceTypeInfo();
				instanceTypeInfo.setHostNamePrefix(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].HostNamePrefix"));
				instanceTypeInfo.setVSwitchId(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].VSwitchId"));
				instanceTypeInfo.setZoneId(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].ZoneId"));
				instanceTypeInfo.setSpotPriceLimit(_ctx.floatValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].SpotPriceLimit"));
				instanceTypeInfo.setInstanceType(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].InstanceType"));
				instanceTypeInfo.setSpotStrategy(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].InstanceTypes["+ j +"].SpotStrategy"));

				instanceTypes.add(instanceTypeInfo);
			}
			queueInfo.setInstanceTypes(instanceTypes);

			List<DataDisksInfo> dataDisks = new ArrayList<DataDisksInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetAutoScaleConfigResponse.Queues["+ i +"].DataDisks.Length"); j++) {
				DataDisksInfo dataDisksInfo = new DataDisksInfo();
				dataDisksInfo.setDataDiskCategory(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].DataDisks["+ j +"].DataDiskCategory"));
				dataDisksInfo.setDataDiskSize(_ctx.integerValue("GetAutoScaleConfigResponse.Queues["+ i +"].DataDisks["+ j +"].DataDiskSize"));
				dataDisksInfo.setDataDiskDeleteWithInstance(_ctx.booleanValue("GetAutoScaleConfigResponse.Queues["+ i +"].DataDisks["+ j +"].DataDiskDeleteWithInstance"));
				dataDisksInfo.setDataDiskPerformanceLevel(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].DataDisks["+ j +"].DataDiskPerformanceLevel"));
				dataDisksInfo.setDataDiskEncrypted(_ctx.booleanValue("GetAutoScaleConfigResponse.Queues["+ i +"].DataDisks["+ j +"].DataDiskEncrypted"));
				dataDisksInfo.setDataDiskKMSKeyId(_ctx.stringValue("GetAutoScaleConfigResponse.Queues["+ i +"].DataDisks["+ j +"].DataDiskKMSKeyId"));

				dataDisks.add(dataDisksInfo);
			}
			queueInfo.setDataDisks(dataDisks);

			queues.add(queueInfo);
		}
		getAutoScaleConfigResponse.setQueues(queues);
	 
	 	return getAutoScaleConfigResponse;
	}
}