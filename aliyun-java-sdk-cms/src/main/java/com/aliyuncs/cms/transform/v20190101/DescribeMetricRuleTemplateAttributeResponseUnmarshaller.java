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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse.Resource;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplate;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplate.CompositeExpression;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplate.CompositeExpression.ExpressionListItem;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplate.Escalations;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplate.Escalations.Critical;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplate.Escalations.Info;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplate.Escalations.Warn;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricRuleTemplateAttributeResponseUnmarshaller {

	public static DescribeMetricRuleTemplateAttributeResponse unmarshall(DescribeMetricRuleTemplateAttributeResponse describeMetricRuleTemplateAttributeResponse, UnmarshallerContext _ctx) {
		
		describeMetricRuleTemplateAttributeResponse.setRequestId(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.RequestId"));
		describeMetricRuleTemplateAttributeResponse.setCode(_ctx.integerValue("DescribeMetricRuleTemplateAttributeResponse.Code"));
		describeMetricRuleTemplateAttributeResponse.setMessage(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Message"));
		describeMetricRuleTemplateAttributeResponse.setSuccess(_ctx.booleanValue("DescribeMetricRuleTemplateAttributeResponse.Success"));

		Resource resource = new Resource();
		resource.setDescription(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.Description"));
		resource.setSystemEventTemplates(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.SystemEventTemplates"));
		resource.setProcessMonitorTemplates(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.ProcessMonitorTemplates"));
		resource.setName(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.Name"));
		resource.setRestVersion(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.RestVersion"));
		resource.setHostAvailabilityTemplates(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.HostAvailabilityTemplates"));
		resource.setTemplateId(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.TemplateId"));

		List<AlertTemplate> alertTemplates = new ArrayList<AlertTemplate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates.Length"); i++) {
			AlertTemplate alertTemplate = new AlertTemplate();
			alertTemplate.setMetricName(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].MetricName"));
			alertTemplate.setSelector(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Selector"));
			alertTemplate.setWebhook(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Webhook"));
			alertTemplate.setNamespace(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Namespace"));
			alertTemplate.setCategory(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Category"));
			alertTemplate.setRuleName(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].RuleName"));
			alertTemplate.setNoDataPolicy(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].NoDataPolicy"));

			CompositeExpression compositeExpression = new CompositeExpression();
			compositeExpression.setLevel(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].CompositeExpression.Level"));
			compositeExpression.setExpressionListJoin(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].CompositeExpression.ExpressionListJoin"));
			compositeExpression.setExpressionRaw(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].CompositeExpression.ExpressionRaw"));
			compositeExpression.setTimes(_ctx.integerValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].CompositeExpression.Times"));

			List<ExpressionListItem> expressionList = new ArrayList<ExpressionListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].CompositeExpression.ExpressionList.Length"); j++) {
				ExpressionListItem expressionListItem = new ExpressionListItem();
				expressionListItem.setMetricName(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].CompositeExpression.ExpressionList["+ j +"].MetricName"));
				expressionListItem.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].CompositeExpression.ExpressionList["+ j +"].ComparisonOperator"));
				expressionListItem.setStatistics(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].CompositeExpression.ExpressionList["+ j +"].Statistics"));
				expressionListItem.setThreshold(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].CompositeExpression.ExpressionList["+ j +"].Threshold"));
				expressionListItem.setPeriod(_ctx.integerValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].CompositeExpression.ExpressionList["+ j +"].Period"));
				expressionListItem.setId(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].CompositeExpression.ExpressionList["+ j +"].Id"));

				expressionList.add(expressionListItem);
			}
			compositeExpression.setExpressionList(expressionList);
			alertTemplate.setCompositeExpression(compositeExpression);

			Escalations escalations = new Escalations();

			Info info = new Info();
			info.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.ComparisonOperator"));
			info.setTimes(_ctx.integerValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.Times"));
			info.setThreshold(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.Threshold"));
			info.setStatistics(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.Statistics"));
			info.setPreCondition(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.PreCondition"));
			escalations.setInfo(info);

			Warn warn = new Warn();
			warn.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.ComparisonOperator"));
			warn.setTimes(_ctx.integerValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.Times"));
			warn.setThreshold(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.Threshold"));
			warn.setStatistics(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.Statistics"));
			warn.setPreCondition(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.PreCondition"));
			escalations.setWarn(warn);

			Critical critical = new Critical();
			critical.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.ComparisonOperator"));
			critical.setTimes(_ctx.integerValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.Times"));
			critical.setThreshold(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.Threshold"));
			critical.setStatistics(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.Statistics"));
			critical.setPreCondition(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.PreCondition"));
			escalations.setCritical(critical);
			alertTemplate.setEscalations(escalations);

			alertTemplates.add(alertTemplate);
		}
		resource.setAlertTemplates(alertTemplates);
		describeMetricRuleTemplateAttributeResponse.setResource(resource);
	 
	 	return describeMetricRuleTemplateAttributeResponse;
	}
}