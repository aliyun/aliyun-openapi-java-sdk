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
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplate.Escalations;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplate.Escalations.Critical;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplate.Escalations.Info;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplate.Escalations.Warn;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricRuleTemplateAttributeResponseUnmarshaller {

	public static DescribeMetricRuleTemplateAttributeResponse unmarshall(DescribeMetricRuleTemplateAttributeResponse describeMetricRuleTemplateAttributeResponse, UnmarshallerContext _ctx) {
		
		describeMetricRuleTemplateAttributeResponse.setRequestId(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.RequestId"));
		describeMetricRuleTemplateAttributeResponse.setSuccess(_ctx.booleanValue("DescribeMetricRuleTemplateAttributeResponse.Success"));
		describeMetricRuleTemplateAttributeResponse.setCode(_ctx.integerValue("DescribeMetricRuleTemplateAttributeResponse.Code"));
		describeMetricRuleTemplateAttributeResponse.setMessage(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Message"));

		Resource resource = new Resource();
		resource.setName(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.Name"));
		resource.setTemplateId(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.TemplateId"));
		resource.setRestVersion(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.RestVersion"));
		resource.setDescription(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.Description"));

		List<AlertTemplate> alertTemplates = new ArrayList<AlertTemplate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates.Length"); i++) {
			AlertTemplate alertTemplate = new AlertTemplate();
			alertTemplate.setRuleName(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].RuleName"));
			alertTemplate.setCategory(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Category"));
			alertTemplate.setNamespace(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Namespace"));
			alertTemplate.setMetricName(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].MetricName"));
			alertTemplate.setSelector(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Selector"));
			alertTemplate.setWebhook(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Webhook"));

			Escalations escalations = new Escalations();

			Info info = new Info();
			info.setStatistics(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.Statistics"));
			info.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.ComparisonOperator"));
			info.setThreshold(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.Threshold"));
			info.setTimes(_ctx.integerValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.Times"));
			escalations.setInfo(info);

			Warn warn = new Warn();
			warn.setStatistics(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.Statistics"));
			warn.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.ComparisonOperator"));
			warn.setThreshold(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.Threshold"));
			warn.setTimes(_ctx.integerValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.Times"));
			escalations.setWarn(warn);

			Critical critical = new Critical();
			critical.setStatistics(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.Statistics"));
			critical.setComparisonOperator(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.ComparisonOperator"));
			critical.setThreshold(_ctx.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.Threshold"));
			critical.setTimes(_ctx.integerValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.Times"));
			escalations.setCritical(critical);
			alertTemplate.setEscalations(escalations);

			alertTemplates.add(alertTemplate);
		}
		resource.setAlertTemplates(alertTemplates);
		describeMetricRuleTemplateAttributeResponse.setResource(resource);
	 
	 	return describeMetricRuleTemplateAttributeResponse;
	}
}