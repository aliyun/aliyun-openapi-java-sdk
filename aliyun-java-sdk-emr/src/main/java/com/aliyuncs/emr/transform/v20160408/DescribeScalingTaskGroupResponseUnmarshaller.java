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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeScalingTaskGroupResponse;
import com.aliyuncs.emr.model.v20160408.DescribeScalingTaskGroupResponse.ScalingConfig;
import com.aliyuncs.emr.model.v20160408.DescribeScalingTaskGroupResponse.ScalingConfig.SpotPriceLimit;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingTaskGroupResponseUnmarshaller {

	public static DescribeScalingTaskGroupResponse unmarshall(DescribeScalingTaskGroupResponse describeScalingTaskGroupResponse, UnmarshallerContext _ctx) {
		
		describeScalingTaskGroupResponse.setRequestId(_ctx.stringValue("DescribeScalingTaskGroupResponse.RequestId"));
		describeScalingTaskGroupResponse.setScalingGroupId(_ctx.stringValue("DescribeScalingTaskGroupResponse.ScalingGroupId"));
		describeScalingTaskGroupResponse.setHostGroupId(_ctx.stringValue("DescribeScalingTaskGroupResponse.HostGroupId"));
		describeScalingTaskGroupResponse.setMinSize(_ctx.integerValue("DescribeScalingTaskGroupResponse.MinSize"));
		describeScalingTaskGroupResponse.setMaxSize(_ctx.integerValue("DescribeScalingTaskGroupResponse.MaxSize"));
		describeScalingTaskGroupResponse.setDefaultCooldown(_ctx.integerValue("DescribeScalingTaskGroupResponse.DefaultCooldown"));
		describeScalingTaskGroupResponse.setStatus(_ctx.stringValue("DescribeScalingTaskGroupResponse.Status"));
		describeScalingTaskGroupResponse.setActiveRuleCategory(_ctx.stringValue("DescribeScalingTaskGroupResponse.ActiveRuleCategory"));

		ScalingConfig scalingConfig = new ScalingConfig();
		scalingConfig.setPayType(_ctx.stringValue("DescribeScalingTaskGroupResponse.ScalingConfig.PayType"));
		scalingConfig.setDataDiskCategory(_ctx.stringValue("DescribeScalingTaskGroupResponse.ScalingConfig.DataDiskCategory"));
		scalingConfig.setDataDiskSize(_ctx.integerValue("DescribeScalingTaskGroupResponse.ScalingConfig.DataDiskSize"));
		scalingConfig.setDataDiskCount(_ctx.integerValue("DescribeScalingTaskGroupResponse.ScalingConfig.DataDiskCount"));
		scalingConfig.setSysDiskCategory(_ctx.stringValue("DescribeScalingTaskGroupResponse.ScalingConfig.SysDiskCategory"));
		scalingConfig.setSysDiskSize(_ctx.integerValue("DescribeScalingTaskGroupResponse.ScalingConfig.SysDiskSize"));
		scalingConfig.setCpuCount(_ctx.integerValue("DescribeScalingTaskGroupResponse.ScalingConfig.CpuCount"));
		scalingConfig.setMemSize(_ctx.integerValue("DescribeScalingTaskGroupResponse.ScalingConfig.MemSize"));
		scalingConfig.setSpotStrategy(_ctx.stringValue("DescribeScalingTaskGroupResponse.ScalingConfig.SpotStrategy"));

		List<String> instanceTypeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingTaskGroupResponse.ScalingConfig.InstanceTypeList.Length"); i++) {
			instanceTypeList.add(_ctx.stringValue("DescribeScalingTaskGroupResponse.ScalingConfig.InstanceTypeList["+ i +"]"));
		}
		scalingConfig.setInstanceTypeList(instanceTypeList);

		List<SpotPriceLimit> spotPriceLimits = new ArrayList<SpotPriceLimit>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingTaskGroupResponse.ScalingConfig.SpotPriceLimits.Length"); i++) {
			SpotPriceLimit spotPriceLimit = new SpotPriceLimit();
			spotPriceLimit.setInstanceType(_ctx.stringValue("DescribeScalingTaskGroupResponse.ScalingConfig.SpotPriceLimits["+ i +"].InstanceType"));
			spotPriceLimit.setPriceLimit(_ctx.floatValue("DescribeScalingTaskGroupResponse.ScalingConfig.SpotPriceLimits["+ i +"].PriceLimit"));

			spotPriceLimits.add(spotPriceLimit);
		}
		scalingConfig.setSpotPriceLimits(spotPriceLimits);
		describeScalingTaskGroupResponse.setScalingConfig(scalingConfig);
	 
	 	return describeScalingTaskGroupResponse;
	}
}