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

import com.aliyuncs.emr.model.v20160408.ListScalingTaskGroupResponse;
import com.aliyuncs.emr.model.v20160408.ListScalingTaskGroupResponse.Group;
import com.aliyuncs.emr.model.v20160408.ListScalingTaskGroupResponse.Group.ScalingRule;
import com.aliyuncs.emr.model.v20160408.ListScalingTaskGroupResponse.Group.SpotPriceLimit;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScalingTaskGroupResponseUnmarshaller {

	public static ListScalingTaskGroupResponse unmarshall(ListScalingTaskGroupResponse listScalingTaskGroupResponse, UnmarshallerContext context) {
		
		listScalingTaskGroupResponse.setRequestId(context.stringValue("ListScalingTaskGroupResponse.RequestId"));

		List<Group> groupList = new ArrayList<Group>();
		for (int i = 0; i < context.lengthValue("ListScalingTaskGroupResponse.GroupList.Length"); i++) {
			Group group = new Group();
			group.setScalingGroupId(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingGroupId"));
			group.setHostGroupId(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].HostGroupId"));
			group.setMinSize(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].MinSize"));
			group.setMaxSize(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].MaxSize"));
			group.setDefaultCooldown(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].DefaultCooldown"));
			group.setStatus(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].Status"));
			group.setPayType(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].PayType"));
			group.setDataDiskCategory(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].DataDiskCategory"));
			group.setDataDiskSize(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].DataDiskSize"));
			group.setDataDiskCount(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].DataDiskCount"));
			group.setSysDiskCategory(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].SysDiskCategory"));
			group.setSysDiskSize(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].SysDiskSize"));
			group.setCpuCount(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].CpuCount"));
			group.setMemSize(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].MemSize"));
			group.setSpotStrategy(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].SpotStrategy"));

			List<String> instanceTypeList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListScalingTaskGroupResponse.GroupList["+ i +"].InstanceTypeList.Length"); j++) {
				instanceTypeList.add(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].InstanceTypeList["+ j +"]"));
			}
			group.setInstanceTypeList(instanceTypeList);

			List<ScalingRule> scalingRuleList = new ArrayList<ScalingRule>();
			for (int j = 0; j < context.lengthValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList.Length"); j++) {
				ScalingRule scalingRule = new ScalingRule();
				scalingRule.setId(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].Id"));
				scalingRule.setRuleCategory(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].RuleCategory"));
				scalingRule.setRuleName(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].RuleName"));
				scalingRule.setAdjustmentType(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].AdjustmentType"));
				scalingRule.setAdjustmentValue(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].AdjustmentValue"));
				scalingRule.setCooldown(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].Cooldown"));
				scalingRule.setLaunchTime(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].LaunchTime"));
				scalingRule.setLaunchExpirationTime(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].LaunchExpirationTime"));
				scalingRule.setRecurrenceType(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].RecurrenceType"));
				scalingRule.setRecurrenceValue(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].RecurrenceValue"));
				scalingRule.setRecurrenceEndTime(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].RecurrenceEndTime"));

				scalingRuleList.add(scalingRule);
			}
			group.setScalingRuleList(scalingRuleList);

			List<SpotPriceLimit> spotPriceLimits = new ArrayList<SpotPriceLimit>();
			for (int j = 0; j < context.lengthValue("ListScalingTaskGroupResponse.GroupList["+ i +"].SpotPriceLimits.Length"); j++) {
				SpotPriceLimit spotPriceLimit = new SpotPriceLimit();
				spotPriceLimit.setInstanceType(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].SpotPriceLimits["+ j +"].InstanceType"));
				spotPriceLimit.setPriceLimit(context.floatValue("ListScalingTaskGroupResponse.GroupList["+ i +"].SpotPriceLimits["+ j +"].PriceLimit"));

				spotPriceLimits.add(spotPriceLimit);
			}
			group.setSpotPriceLimits(spotPriceLimits);

			groupList.add(group);
		}
		listScalingTaskGroupResponse.setGroupList(groupList);
	 
	 	return listScalingTaskGroupResponse;
	}
}