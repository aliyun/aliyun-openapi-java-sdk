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

package com.aliyuncs.ehpc.transform.v20170714;

import com.aliyuncs.ehpc.model.v20170714.GetAutoScaleConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutoScaleConfigResponseUnmarshaller {

	public static GetAutoScaleConfigResponse unmarshall(GetAutoScaleConfigResponse getAutoScaleConfigResponse, UnmarshallerContext _ctx) {
		
		getAutoScaleConfigResponse.setRequestId(_ctx.stringValue("GetAutoScaleConfigResponse.RequestId"));
		getAutoScaleConfigResponse.setMaxNodesInCluster(_ctx.integerValue("GetAutoScaleConfigResponse.MaxNodesInCluster"));
		getAutoScaleConfigResponse.setGrowTimeoutInMinutes(_ctx.integerValue("GetAutoScaleConfigResponse.GrowTimeoutInMinutes"));
		getAutoScaleConfigResponse.setEnableAutoShrink(_ctx.booleanValue("GetAutoScaleConfigResponse.EnableAutoShrink"));
		getAutoScaleConfigResponse.setClusterType(_ctx.stringValue("GetAutoScaleConfigResponse.ClusterType"));
		getAutoScaleConfigResponse.setEnableAutoGrow(_ctx.booleanValue("GetAutoScaleConfigResponse.EnableAutoGrow"));
		getAutoScaleConfigResponse.setExcludeNodes(_ctx.stringValue("GetAutoScaleConfigResponse.ExcludeNodes"));
		getAutoScaleConfigResponse.setGrowIntervalInMinutes(_ctx.integerValue("GetAutoScaleConfigResponse.GrowIntervalInMinutes"));
		getAutoScaleConfigResponse.setShrinkIntervalInMinutes(_ctx.integerValue("GetAutoScaleConfigResponse.ShrinkIntervalInMinutes"));
		getAutoScaleConfigResponse.setShrinkIdleTimes(_ctx.integerValue("GetAutoScaleConfigResponse.ShrinkIdleTimes"));
		getAutoScaleConfigResponse.setExtraNodesGrowRatio(_ctx.integerValue("GetAutoScaleConfigResponse.ExtraNodesGrowRatio"));
		getAutoScaleConfigResponse.setGrowRatio(_ctx.integerValue("GetAutoScaleConfigResponse.GrowRatio"));
		getAutoScaleConfigResponse.setUid(_ctx.stringValue("GetAutoScaleConfigResponse.Uid"));
		getAutoScaleConfigResponse.setClusterId(_ctx.stringValue("GetAutoScaleConfigResponse.ClusterId"));
	 
	 	return getAutoScaleConfigResponse;
	}
}