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

import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorAttributeResponse;
import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorAttributeResponse.MetricRule;
import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorAttributeResponse.SiteMonitors;
import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSiteMonitorAttributeResponseUnmarshaller {

	public static DescribeSiteMonitorAttributeResponse unmarshall(DescribeSiteMonitorAttributeResponse describeSiteMonitorAttributeResponse, UnmarshallerContext context) {
		
		describeSiteMonitorAttributeResponse.setRequestId(context.stringValue("DescribeSiteMonitorAttributeResponse.RequestId"));
		describeSiteMonitorAttributeResponse.setCode(context.stringValue("DescribeSiteMonitorAttributeResponse.Code"));
		describeSiteMonitorAttributeResponse.setMessage(context.stringValue("DescribeSiteMonitorAttributeResponse.Message"));
		describeSiteMonitorAttributeResponse.setSuccess(context.booleanValue("DescribeSiteMonitorAttributeResponse.Success"));

		SiteMonitors siteMonitors = new SiteMonitors();
		siteMonitors.setTaskType(context.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.TaskType"));
		siteMonitors.setAddress(context.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.Address"));
		siteMonitors.setTaskState(context.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.TaskState"));
		siteMonitors.setTaskName(context.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.TaskName"));
		siteMonitors.setInterval(context.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.Interval"));
		siteMonitors.setTaskId(context.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.TaskId"));
		siteMonitors.setOptionJson(context.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson"));

		List<IspCity> ispCities = new ArrayList<IspCity>();
		for (int i = 0; i < context.lengthValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities.Length"); i++) {
			IspCity ispCity = new IspCity();
			ispCity.setCityName(context.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities["+ i +"].CityName"));
			ispCity.setIspName(context.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities["+ i +"].IspName"));
			ispCity.setCity(context.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities["+ i +"].City"));
			ispCity.setIsp(context.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities["+ i +"].Isp"));

			ispCities.add(ispCity);
		}
		siteMonitors.setIspCities(ispCities);
		describeSiteMonitorAttributeResponse.setSiteMonitors(siteMonitors);

		List<MetricRule> metricRules = new ArrayList<MetricRule>();
		for (int i = 0; i < context.lengthValue("DescribeSiteMonitorAttributeResponse.MetricRules.Length"); i++) {
			MetricRule metricRule = new MetricRule();
			metricRule.setRuleId(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].RuleId"));
			metricRule.setRuleName(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].RuleName"));
			metricRule.setNamespace(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Namespace"));
			metricRule.setMetricName(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].MetricName"));
			metricRule.setOkActions(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].OkActions"));
			metricRule.setAlarmActions(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].AlarmActions"));
			metricRule.setStatistics(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Statistics"));
			metricRule.setActionEnable(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].ActionEnable"));
			metricRule.setPeriod(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Period"));
			metricRule.setComparisonOperator(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].ComparisonOperator"));
			metricRule.setThreshold(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Threshold"));
			metricRule.setEvaluationCount(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].EvaluationCount"));
			metricRule.setLevel(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Level"));
			metricRule.setExpression(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Expression"));
			metricRule.setStateValue(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].StateValue"));
			metricRule.setDimensions(context.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Dimensions"));

			metricRules.add(metricRule);
		}
		describeSiteMonitorAttributeResponse.setMetricRules(metricRules);
	 
	 	return describeSiteMonitorAttributeResponse;
	}
}