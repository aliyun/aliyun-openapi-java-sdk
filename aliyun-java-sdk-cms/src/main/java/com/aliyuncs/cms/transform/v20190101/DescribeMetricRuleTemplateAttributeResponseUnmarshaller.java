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

	public static DescribeMetricRuleTemplateAttributeResponse unmarshall(DescribeMetricRuleTemplateAttributeResponse describeMetricRuleTemplateAttributeResponse, UnmarshallerContext context) {
		
		describeMetricRuleTemplateAttributeResponse.setRequestId(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.RequestId"));
		describeMetricRuleTemplateAttributeResponse.setSuccess(context.booleanValue("DescribeMetricRuleTemplateAttributeResponse.Success"));
		describeMetricRuleTemplateAttributeResponse.setCode(context.integerValue("DescribeMetricRuleTemplateAttributeResponse.Code"));
		describeMetricRuleTemplateAttributeResponse.setMessage(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Message"));

		Resource resource = new Resource();
		resource.setName(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.Name"));
		resource.setTemplateId(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.TemplateId"));
		resource.setRestVersion(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.RestVersion"));
		resource.setDescription(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.Description"));

		List<AlertTemplate> alertTemplates = new ArrayList<AlertTemplate>();
		for (int i = 0; i < context.lengthValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates.Length"); i++) {
			AlertTemplate alertTemplate = new AlertTemplate();
			alertTemplate.setRuleName(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].RuleName"));
			alertTemplate.setCategory(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Category"));
			alertTemplate.setNamespace(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Namespace"));
			alertTemplate.setMetricName(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].MetricName"));
			alertTemplate.setSelector(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Selector"));

			Escalations escalations = new Escalations();

			Info info = new Info();
			info.setStatistics(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.Statistics"));
			info.setComparisonOperator(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.ComparisonOperator"));
			info.setThreshold(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.Threshold"));
			info.setTimes(context.integerValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Info.Times"));
			escalations.setInfo(info);

			Warn warn = new Warn();
			warn.setStatistics(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.Statistics"));
			warn.setComparisonOperator(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.ComparisonOperator"));
			warn.setThreshold(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.Threshold"));
			warn.setTimes(context.integerValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Warn.Times"));
			escalations.setWarn(warn);

			Critical critical = new Critical();
			critical.setStatistics(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.Statistics"));
			critical.setComparisonOperator(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.ComparisonOperator"));
			critical.setThreshold(context.stringValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.Threshold"));
			critical.setTimes(context.integerValue("DescribeMetricRuleTemplateAttributeResponse.Resource.AlertTemplates["+ i +"].Escalations.Critical.Times"));
			escalations.setCritical(critical);
			alertTemplate.setEscalations(escalations);

			alertTemplates.add(alertTemplate);
		}
		resource.setAlertTemplates(alertTemplates);
		describeMetricRuleTemplateAttributeResponse.setResource(resource);
	 
	 	return describeMetricRuleTemplateAttributeResponse;
	}
}