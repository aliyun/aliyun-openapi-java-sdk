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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.DescribeDispatchRuleResponse;
import com.aliyuncs.arms.model.v20190808.DescribeDispatchRuleResponse.DispatchRule;
import com.aliyuncs.arms.model.v20190808.DescribeDispatchRuleResponse.DispatchRule.GroupRule;
import com.aliyuncs.arms.model.v20190808.DescribeDispatchRuleResponse.DispatchRule.LabelMatchExpressionGrid;
import com.aliyuncs.arms.model.v20190808.DescribeDispatchRuleResponse.DispatchRule.LabelMatchExpressionGrid.LabelMatchExpressionGroup;
import com.aliyuncs.arms.model.v20190808.DescribeDispatchRuleResponse.DispatchRule.LabelMatchExpressionGrid.LabelMatchExpressionGroup.LabelMatchExpression;
import com.aliyuncs.arms.model.v20190808.DescribeDispatchRuleResponse.DispatchRule.NotifyRule;
import com.aliyuncs.arms.model.v20190808.DescribeDispatchRuleResponse.DispatchRule.NotifyRule.NotifyObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDispatchRuleResponseUnmarshaller {

	public static DescribeDispatchRuleResponse unmarshall(DescribeDispatchRuleResponse describeDispatchRuleResponse, UnmarshallerContext _ctx) {
		
		describeDispatchRuleResponse.setRequestId(_ctx.stringValue("DescribeDispatchRuleResponse.RequestId"));

		DispatchRule dispatchRule = new DispatchRule();
		dispatchRule.setRuleId(_ctx.longValue("DescribeDispatchRuleResponse.DispatchRule.RuleId"));
		dispatchRule.setName(_ctx.stringValue("DescribeDispatchRuleResponse.DispatchRule.Name"));
		dispatchRule.setState(_ctx.stringValue("DescribeDispatchRuleResponse.DispatchRule.State"));
		dispatchRule.setDispatchType(_ctx.stringValue("DescribeDispatchRuleResponse.DispatchRule.DispatchType"));
		dispatchRule.setIsRecover(_ctx.booleanValue("DescribeDispatchRuleResponse.DispatchRule.IsRecover"));

		LabelMatchExpressionGrid labelMatchExpressionGrid = new LabelMatchExpressionGrid();

		List<LabelMatchExpressionGroup> labelMatchExpressionGroups = new ArrayList<LabelMatchExpressionGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDispatchRuleResponse.DispatchRule.LabelMatchExpressionGrid.LabelMatchExpressionGroups.Length"); i++) {
			LabelMatchExpressionGroup labelMatchExpressionGroup = new LabelMatchExpressionGroup();

			List<LabelMatchExpression> labelMatchExpressions = new ArrayList<LabelMatchExpression>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDispatchRuleResponse.DispatchRule.LabelMatchExpressionGrid.LabelMatchExpressionGroups["+ i +"].LabelMatchExpressions.Length"); j++) {
				LabelMatchExpression labelMatchExpression = new LabelMatchExpression();
				labelMatchExpression.setKey(_ctx.stringValue("DescribeDispatchRuleResponse.DispatchRule.LabelMatchExpressionGrid.LabelMatchExpressionGroups["+ i +"].LabelMatchExpressions["+ j +"].Key"));
				labelMatchExpression.setValue(_ctx.stringValue("DescribeDispatchRuleResponse.DispatchRule.LabelMatchExpressionGrid.LabelMatchExpressionGroups["+ i +"].LabelMatchExpressions["+ j +"].Value"));
				labelMatchExpression.setOperator(_ctx.stringValue("DescribeDispatchRuleResponse.DispatchRule.LabelMatchExpressionGrid.LabelMatchExpressionGroups["+ i +"].LabelMatchExpressions["+ j +"].Operator"));

				labelMatchExpressions.add(labelMatchExpression);
			}
			labelMatchExpressionGroup.setLabelMatchExpressions(labelMatchExpressions);

			labelMatchExpressionGroups.add(labelMatchExpressionGroup);
		}
		labelMatchExpressionGrid.setLabelMatchExpressionGroups(labelMatchExpressionGroups);
		dispatchRule.setLabelMatchExpressionGrid(labelMatchExpressionGrid);

		List<GroupRule> groupRules = new ArrayList<GroupRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDispatchRuleResponse.DispatchRule.GroupRules.Length"); i++) {
			GroupRule groupRule = new GroupRule();
			groupRule.setGroupId(_ctx.longValue("DescribeDispatchRuleResponse.DispatchRule.GroupRules["+ i +"].GroupId"));
			groupRule.setGroupWaitTime(_ctx.longValue("DescribeDispatchRuleResponse.DispatchRule.GroupRules["+ i +"].GroupWaitTime"));
			groupRule.setGroupInterval(_ctx.longValue("DescribeDispatchRuleResponse.DispatchRule.GroupRules["+ i +"].GroupInterval"));
			groupRule.setRepeatInterval(_ctx.longValue("DescribeDispatchRuleResponse.DispatchRule.GroupRules["+ i +"].RepeatInterval"));

			List<String> groupingFields = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDispatchRuleResponse.DispatchRule.GroupRules["+ i +"].GroupingFields.Length"); j++) {
				groupingFields.add(_ctx.stringValue("DescribeDispatchRuleResponse.DispatchRule.GroupRules["+ i +"].GroupingFields["+ j +"]"));
			}
			groupRule.setGroupingFields(groupingFields);

			groupRules.add(groupRule);
		}
		dispatchRule.setGroupRules(groupRules);

		List<NotifyRule> notifyRules = new ArrayList<NotifyRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDispatchRuleResponse.DispatchRule.NotifyRules.Length"); i++) {
			NotifyRule notifyRule = new NotifyRule();

			List<String> notifyChannels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDispatchRuleResponse.DispatchRule.NotifyRules["+ i +"].NotifyChannels.Length"); j++) {
				notifyChannels.add(_ctx.stringValue("DescribeDispatchRuleResponse.DispatchRule.NotifyRules["+ i +"].NotifyChannels["+ j +"]"));
			}
			notifyRule.setNotifyChannels(notifyChannels);

			List<NotifyObject> notifyObjects = new ArrayList<NotifyObject>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDispatchRuleResponse.DispatchRule.NotifyRules["+ i +"].NotifyObjects.Length"); j++) {
				NotifyObject notifyObject = new NotifyObject();
				notifyObject.setNotifyType(_ctx.stringValue("DescribeDispatchRuleResponse.DispatchRule.NotifyRules["+ i +"].NotifyObjects["+ j +"].NotifyType"));
				notifyObject.setName(_ctx.stringValue("DescribeDispatchRuleResponse.DispatchRule.NotifyRules["+ i +"].NotifyObjects["+ j +"].Name"));
				notifyObject.setNotifyObjectId(_ctx.stringValue("DescribeDispatchRuleResponse.DispatchRule.NotifyRules["+ i +"].NotifyObjects["+ j +"].NotifyObjectId"));

				notifyObjects.add(notifyObject);
			}
			notifyRule.setNotifyObjects(notifyObjects);

			notifyRules.add(notifyRule);
		}
		dispatchRule.setNotifyRules(notifyRules);
		describeDispatchRuleResponse.setDispatchRule(dispatchRule);
	 
	 	return describeDispatchRuleResponse;
	}
}