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

	public static DescribeSiteMonitorAttributeResponse unmarshall(DescribeSiteMonitorAttributeResponse describeSiteMonitorAttributeResponse, UnmarshallerContext _ctx) {
		
		describeSiteMonitorAttributeResponse.setRequestId(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.RequestId"));
		describeSiteMonitorAttributeResponse.setCode(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.Code"));
		describeSiteMonitorAttributeResponse.setMessage(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.Message"));
		describeSiteMonitorAttributeResponse.setSuccess(_ctx.booleanValue("DescribeSiteMonitorAttributeResponse.Success"));

		SiteMonitors siteMonitors = new SiteMonitors();
		siteMonitors.setTaskType(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.TaskType"));
		siteMonitors.setAddress(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.Address"));
		siteMonitors.setTaskState(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.TaskState"));
		siteMonitors.setTaskName(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.TaskName"));
		siteMonitors.setInterval(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.Interval"));
		siteMonitors.setTaskId(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.TaskId"));
		siteMonitors.setOptionJson(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson"));

		List<IspCity> ispCities = new ArrayList<IspCity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities.Length"); i++) {
			IspCity ispCity = new IspCity();
			ispCity.setCityName(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities["+ i +"].CityName"));
			ispCity.setIspName(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities["+ i +"].IspName"));
			ispCity.setCity(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities["+ i +"].City"));
			ispCity.setIsp(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities["+ i +"].Isp"));

			ispCities.add(ispCity);
		}
		siteMonitors.setIspCities(ispCities);
		describeSiteMonitorAttributeResponse.setSiteMonitors(siteMonitors);

		List<MetricRule> metricRules = new ArrayList<MetricRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSiteMonitorAttributeResponse.MetricRules.Length"); i++) {
			MetricRule metricRule = new MetricRule();
			metricRule.setRuleId(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].RuleId"));
			metricRule.setRuleName(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].RuleName"));
			metricRule.setNamespace(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Namespace"));
			metricRule.setMetricName(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].MetricName"));
			metricRule.setOkActions(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].OkActions"));
			metricRule.setAlarmActions(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].AlarmActions"));
			metricRule.setStatistics(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Statistics"));
			metricRule.setActionEnable(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].ActionEnable"));
			metricRule.setPeriod(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Period"));
			metricRule.setComparisonOperator(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].ComparisonOperator"));
			metricRule.setThreshold(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Threshold"));
			metricRule.setEvaluationCount(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].EvaluationCount"));
			metricRule.setLevel(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Level"));
			metricRule.setExpression(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Expression"));
			metricRule.setStateValue(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].StateValue"));
			metricRule.setDimensions(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Dimensions"));

			metricRules.add(metricRule);
		}
		describeSiteMonitorAttributeResponse.setMetricRules(metricRules);
	 
	 	return describeSiteMonitorAttributeResponse;
	}
}