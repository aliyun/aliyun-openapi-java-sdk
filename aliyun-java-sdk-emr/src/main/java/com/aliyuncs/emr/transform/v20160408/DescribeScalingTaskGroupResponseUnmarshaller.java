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

	public static DescribeScalingTaskGroupResponse unmarshall(DescribeScalingTaskGroupResponse describeScalingTaskGroupResponse, UnmarshallerContext context) {
		
		describeScalingTaskGroupResponse.setRequestId(context.stringValue("DescribeScalingTaskGroupResponse.RequestId"));
		describeScalingTaskGroupResponse.setScalingGroupId(context.stringValue("DescribeScalingTaskGroupResponse.ScalingGroupId"));
		describeScalingTaskGroupResponse.setHostGroupId(context.stringValue("DescribeScalingTaskGroupResponse.HostGroupId"));
		describeScalingTaskGroupResponse.setMinSize(context.integerValue("DescribeScalingTaskGroupResponse.MinSize"));
		describeScalingTaskGroupResponse.setMaxSize(context.integerValue("DescribeScalingTaskGroupResponse.MaxSize"));
		describeScalingTaskGroupResponse.setDefaultCooldown(context.integerValue("DescribeScalingTaskGroupResponse.DefaultCooldown"));
		describeScalingTaskGroupResponse.setStatus(context.stringValue("DescribeScalingTaskGroupResponse.Status"));
		describeScalingTaskGroupResponse.setActiveRuleCategory(context.stringValue("DescribeScalingTaskGroupResponse.ActiveRuleCategory"));

		ScalingConfig scalingConfig = new ScalingConfig();
		scalingConfig.setPayType(context.stringValue("DescribeScalingTaskGroupResponse.ScalingConfig.PayType"));
		scalingConfig.setDataDiskCategory(context.stringValue("DescribeScalingTaskGroupResponse.ScalingConfig.DataDiskCategory"));
		scalingConfig.setDataDiskSize(context.integerValue("DescribeScalingTaskGroupResponse.ScalingConfig.DataDiskSize"));
		scalingConfig.setDataDiskCount(context.integerValue("DescribeScalingTaskGroupResponse.ScalingConfig.DataDiskCount"));
		scalingConfig.setSysDiskCategory(context.stringValue("DescribeScalingTaskGroupResponse.ScalingConfig.SysDiskCategory"));
		scalingConfig.setSysDiskSize(context.integerValue("DescribeScalingTaskGroupResponse.ScalingConfig.SysDiskSize"));
		scalingConfig.setCpuCount(context.integerValue("DescribeScalingTaskGroupResponse.ScalingConfig.CpuCount"));
		scalingConfig.setMemSize(context.integerValue("DescribeScalingTaskGroupResponse.ScalingConfig.MemSize"));
		scalingConfig.setSpotStrategy(context.stringValue("DescribeScalingTaskGroupResponse.ScalingConfig.SpotStrategy"));

		List<String> instanceTypeList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScalingTaskGroupResponse.ScalingConfig.InstanceTypeList.Length"); i++) {
			instanceTypeList.add(context.stringValue("DescribeScalingTaskGroupResponse.ScalingConfig.InstanceTypeList["+ i +"]"));
		}
		scalingConfig.setInstanceTypeList(instanceTypeList);

		List<SpotPriceLimit> spotPriceLimits = new ArrayList<SpotPriceLimit>();
		for (int i = 0; i < context.lengthValue("DescribeScalingTaskGroupResponse.ScalingConfig.SpotPriceLimits.Length"); i++) {
			SpotPriceLimit spotPriceLimit = new SpotPriceLimit();
			spotPriceLimit.setInstanceType(context.stringValue("DescribeScalingTaskGroupResponse.ScalingConfig.SpotPriceLimits["+ i +"].InstanceType"));
			spotPriceLimit.setPriceLimit(context.floatValue("DescribeScalingTaskGroupResponse.ScalingConfig.SpotPriceLimits["+ i +"].PriceLimit"));

			spotPriceLimits.add(spotPriceLimit);
		}
		scalingConfig.setSpotPriceLimits(spotPriceLimits);
		describeScalingTaskGroupResponse.setScalingConfig(scalingConfig);
	 
	 	return describeScalingTaskGroupResponse;
	}
}