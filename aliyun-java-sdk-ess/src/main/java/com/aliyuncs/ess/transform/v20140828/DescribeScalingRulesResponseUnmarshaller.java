/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse;
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingRulesResponseUnmarshaller {

	public static DescribeScalingRulesResponse unmarshall(DescribeScalingRulesResponse describeScalingRulesResponse, UnmarshallerContext context) {
		
		describeScalingRulesResponse.setRequestId(context.stringValue("DescribeScalingRulesResponse.RequestId"));
		describeScalingRulesResponse.setTotalCount(context.integerValue("DescribeScalingRulesResponse.TotalCount"));
		describeScalingRulesResponse.setPageNumber(context.integerValue("DescribeScalingRulesResponse.PageNumber"));
		describeScalingRulesResponse.setPageSize(context.integerValue("DescribeScalingRulesResponse.PageSize"));

		List<ScalingRule> scalingRules = new ArrayList<ScalingRule>();
		for (int i = 0; i < context.lengthValue("DescribeScalingRulesResponse.ScalingRules.Length"); i++) {
			ScalingRule scalingRule = new ScalingRule();
			scalingRule.setScalingRuleId(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleId"));
			scalingRule.setScalingGroupId(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingGroupId"));
			scalingRule.setScalingRuleName(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleName"));
			scalingRule.setCooldown(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Cooldown"));
			scalingRule.setAdjustmentType(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AdjustmentType"));
			scalingRule.setAdjustmentValue(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AdjustmentValue"));
			scalingRule.setMinSize(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MinSize"));
			scalingRule.setMaxSize(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MaxSize"));
			scalingRule.setScalingRuleAri(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleAri"));

			scalingRules.add(scalingRule);
		}
		describeScalingRulesResponse.setScalingRules(scalingRules);
	 
	 	return describeScalingRulesResponse;
	}
}