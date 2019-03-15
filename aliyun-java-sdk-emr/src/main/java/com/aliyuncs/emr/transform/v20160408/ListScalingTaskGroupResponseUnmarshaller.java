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
import com.aliyuncs.emr.model.v20160408.ListScalingTaskGroupResponse.Group.ScalingConfig;
import com.aliyuncs.emr.model.v20160408.ListScalingTaskGroupResponse.Group.ScalingConfig.SpotPriceLimit3;
import com.aliyuncs.emr.model.v20160408.ListScalingTaskGroupResponse.Group.ScalingRule;
import com.aliyuncs.emr.model.v20160408.ListScalingTaskGroupResponse.Group.ScalingRule.CloudWatchTrigger;
import com.aliyuncs.emr.model.v20160408.ListScalingTaskGroupResponse.Group.ScalingRule.SchedulerTrigger;
import com.aliyuncs.emr.model.v20160408.ListScalingTaskGroupResponse.Group.SpotPriceLimit;
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
			group.setActiveRuleCategory(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ActiveRuleCategory"));
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

			ScalingConfig scalingConfig = new ScalingConfig();
			scalingConfig.setPayType(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.PayType"));
			scalingConfig.setDataDiskCategory(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.DataDiskCategory"));
			scalingConfig.setDataDiskSize(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.DataDiskSize"));
			scalingConfig.setDataDiskCount(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.DataDiskCount"));
			scalingConfig.setSysDiskCategory(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.SysDiskCategory"));
			scalingConfig.setSysDiskSize(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.SysDiskSize"));
			scalingConfig.setCpuCount(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.CpuCount"));
			scalingConfig.setMemSize(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.MemSize"));
			scalingConfig.setSpotStrategy(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.SpotStrategy"));

			List<String> instanceTypeList1 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.InstanceTypeList.Length"); j++) {
				instanceTypeList1.add(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.InstanceTypeList["+ j +"]"));
			}
			scalingConfig.setInstanceTypeList1(instanceTypeList1);

			List<SpotPriceLimit3> spotPriceLimits2 = new ArrayList<SpotPriceLimit3>();
			for (int j = 0; j < context.lengthValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.SpotPriceLimits.Length"); j++) {
				SpotPriceLimit3 spotPriceLimit3 = new SpotPriceLimit3();
				spotPriceLimit3.setInstanceType(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.SpotPriceLimits["+ j +"].InstanceType"));
				spotPriceLimit3.setPriceLimit(context.floatValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingConfig.SpotPriceLimits["+ j +"].PriceLimit"));

				spotPriceLimits2.add(spotPriceLimit3);
			}
			scalingConfig.setSpotPriceLimits2(spotPriceLimits2);
			group.setScalingConfig(scalingConfig);

			List<SpotPriceLimit> spotPriceLimits = new ArrayList<SpotPriceLimit>();
			for (int j = 0; j < context.lengthValue("ListScalingTaskGroupResponse.GroupList["+ i +"].SpotPriceLimits.Length"); j++) {
				SpotPriceLimit spotPriceLimit = new SpotPriceLimit();
				spotPriceLimit.setInstanceType(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].SpotPriceLimits["+ j +"].InstanceType"));
				spotPriceLimit.setPriceLimit(context.floatValue("ListScalingTaskGroupResponse.GroupList["+ i +"].SpotPriceLimits["+ j +"].PriceLimit"));

				spotPriceLimits.add(spotPriceLimit);
			}
			group.setSpotPriceLimits(spotPriceLimits);

			List<ScalingRule> scalingRuleList = new ArrayList<ScalingRule>();
			for (int j = 0; j < context.lengthValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList.Length"); j++) {
				ScalingRule scalingRule = new ScalingRule();
				scalingRule.setId(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].Id"));
				scalingRule.setRuleCategory(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].RuleCategory"));
				scalingRule.setRuleName(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].RuleName"));
				scalingRule.setAdjustmentType(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].AdjustmentType"));
				scalingRule.setAdjustmentValue(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].AdjustmentValue"));
				scalingRule.setCooldown(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].Cooldown"));
				scalingRule.setStatus(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].Status"));
				scalingRule.setLaunchTime(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].LaunchTime"));
				scalingRule.setLaunchExpirationTime(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].LaunchExpirationTime"));
				scalingRule.setRecurrenceType(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].RecurrenceType"));
				scalingRule.setRecurrenceValue(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].RecurrenceValue"));
				scalingRule.setRecurrenceEndTime(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].RecurrenceEndTime"));

				SchedulerTrigger schedulerTrigger = new SchedulerTrigger();
				schedulerTrigger.setLaunchTime(context.longValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].SchedulerTrigger.LaunchTime"));
				schedulerTrigger.setLaunchExpirationTime(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].SchedulerTrigger.LaunchExpirationTime"));
				schedulerTrigger.setRecurrenceType(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].SchedulerTrigger.RecurrenceType"));
				schedulerTrigger.setRecurrenceValue(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].SchedulerTrigger.RecurrenceValue"));
				schedulerTrigger.setRecurrenceEndTime(context.longValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].SchedulerTrigger.RecurrenceEndTime"));
				scalingRule.setSchedulerTrigger(schedulerTrigger);

				CloudWatchTrigger cloudWatchTrigger = new CloudWatchTrigger();
				cloudWatchTrigger.setMetricName(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].CloudWatchTrigger.MetricName"));
				cloudWatchTrigger.setPeriod(context.integerValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].CloudWatchTrigger.Period"));
				cloudWatchTrigger.setStatistics(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].CloudWatchTrigger.Statistics"));
				cloudWatchTrigger.setComparisonOperator(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].CloudWatchTrigger.ComparisonOperator"));
				cloudWatchTrigger.setThreshold(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].CloudWatchTrigger.Threshold"));
				cloudWatchTrigger.setEvaluationCount(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].CloudWatchTrigger.EvaluationCount"));
				cloudWatchTrigger.setUnit(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].CloudWatchTrigger.Unit"));
				cloudWatchTrigger.setMetricDisplayName(context.stringValue("ListScalingTaskGroupResponse.GroupList["+ i +"].ScalingRuleList["+ j +"].CloudWatchTrigger.MetricDisplayName"));
				scalingRule.setCloudWatchTrigger(cloudWatchTrigger);

				scalingRuleList.add(scalingRule);
			}
			group.setScalingRuleList(scalingRuleList);

			groupList.add(group);
		}
		listScalingTaskGroupResponse.setGroupList(groupList);
	 
	 	return listScalingTaskGroupResponse;
	}
}