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

	public static DescribeAutoScaleConfigResponse unmarshall(DescribeAutoScaleConfigResponse describeAutoScaleConfigResponse, UnmarshallerContext _ctx) {
		
		describeAutoScaleConfigResponse.setRequestId(_ctx.stringValue("DescribeAutoScaleConfigResponse.RequestId"));
		describeAutoScaleConfigResponse.setUid(_ctx.stringValue("DescribeAutoScaleConfigResponse.Uid"));
		describeAutoScaleConfigResponse.setClusterId(_ctx.stringValue("DescribeAutoScaleConfigResponse.ClusterId"));
		describeAutoScaleConfigResponse.setClusterType(_ctx.stringValue("DescribeAutoScaleConfigResponse.ClusterType"));
		describeAutoScaleConfigResponse.setEnableAutoGrow(_ctx.booleanValue("DescribeAutoScaleConfigResponse.EnableAutoGrow"));
		describeAutoScaleConfigResponse.setEnableAutoShrink(_ctx.booleanValue("DescribeAutoScaleConfigResponse.EnableAutoShrink"));
		describeAutoScaleConfigResponse.setGrowIntervalInMinutes(_ctx.integerValue("DescribeAutoScaleConfigResponse.GrowIntervalInMinutes"));
		describeAutoScaleConfigResponse.setShrinkIntervalInMinutes(_ctx.integerValue("DescribeAutoScaleConfigResponse.ShrinkIntervalInMinutes"));
		describeAutoScaleConfigResponse.setShrinkIdleTimes(_ctx.integerValue("DescribeAutoScaleConfigResponse.ShrinkIdleTimes"));
		describeAutoScaleConfigResponse.setGrowTimeoutInMinutes(_ctx.integerValue("DescribeAutoScaleConfigResponse.GrowTimeoutInMinutes"));
		describeAutoScaleConfigResponse.setExtraNodesGrowRatio(_ctx.integerValue("DescribeAutoScaleConfigResponse.ExtraNodesGrowRatio"));
		describeAutoScaleConfigResponse.setGrowRatio(_ctx.integerValue("DescribeAutoScaleConfigResponse.GrowRatio"));
		describeAutoScaleConfigResponse.setMaxNodesInCluster(_ctx.integerValue("DescribeAutoScaleConfigResponse.MaxNodesInCluster"));
		describeAutoScaleConfigResponse.setExcludeNodes(_ctx.stringValue("DescribeAutoScaleConfigResponse.ExcludeNodes"));
		describeAutoScaleConfigResponse.setSpotStrategy(_ctx.stringValue("DescribeAutoScaleConfigResponse.SpotStrategy"));
		describeAutoScaleConfigResponse.setSpotPriceLimit(_ctx.stringValue("DescribeAutoScaleConfigResponse.SpotPriceLimit"));
	 
	 	return describeAutoScaleConfigResponse;
	}
}