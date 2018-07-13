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

import com.aliyuncs.ehpc.model.v20180412.DescribeAutoScaleConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoScaleConfigResponseUnmarshaller {

	public static DescribeAutoScaleConfigResponse unmarshall(DescribeAutoScaleConfigResponse describeAutoScaleConfigResponse, UnmarshallerContext context) {
		
		describeAutoScaleConfigResponse.setRequestId(context.stringValue("DescribeAutoScaleConfigResponse.RequestId"));
		describeAutoScaleConfigResponse.setUid(context.stringValue("DescribeAutoScaleConfigResponse.Uid"));
		describeAutoScaleConfigResponse.setClusterId(context.stringValue("DescribeAutoScaleConfigResponse.ClusterId"));
		describeAutoScaleConfigResponse.setClusterType(context.stringValue("DescribeAutoScaleConfigResponse.ClusterType"));
		describeAutoScaleConfigResponse.setEnableAutoGrow(context.booleanValue("DescribeAutoScaleConfigResponse.EnableAutoGrow"));
		describeAutoScaleConfigResponse.setEnableAutoShrink(context.booleanValue("DescribeAutoScaleConfigResponse.EnableAutoShrink"));
		describeAutoScaleConfigResponse.setGrowIntervalInMinutes(context.integerValue("DescribeAutoScaleConfigResponse.GrowIntervalInMinutes"));
		describeAutoScaleConfigResponse.setShrinkIntervalInMinutes(context.integerValue("DescribeAutoScaleConfigResponse.ShrinkIntervalInMinutes"));
		describeAutoScaleConfigResponse.setShrinkIdleTimes(context.integerValue("DescribeAutoScaleConfigResponse.ShrinkIdleTimes"));
		describeAutoScaleConfigResponse.setGrowTimeoutInMinutes(context.integerValue("DescribeAutoScaleConfigResponse.GrowTimeoutInMinutes"));
		describeAutoScaleConfigResponse.setExtraNodesGrowRatio(context.integerValue("DescribeAutoScaleConfigResponse.ExtraNodesGrowRatio"));
		describeAutoScaleConfigResponse.setGrowRatio(context.integerValue("DescribeAutoScaleConfigResponse.GrowRatio"));
		describeAutoScaleConfigResponse.setMaxNodesInCluster(context.integerValue("DescribeAutoScaleConfigResponse.MaxNodesInCluster"));
		describeAutoScaleConfigResponse.setExcludeNodes(context.stringValue("DescribeAutoScaleConfigResponse.ExcludeNodes"));
		describeAutoScaleConfigResponse.setSpotStrategy(context.stringValue("DescribeAutoScaleConfigResponse.SpotStrategy"));
		describeAutoScaleConfigResponse.setSpotPriceLimit(context.stringValue("DescribeAutoScaleConfigResponse.SpotPriceLimit"));
	 
	 	return describeAutoScaleConfigResponse;
	}
}