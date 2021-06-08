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
import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson;
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
		siteMonitors.setEndTime(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.EndTime"));

		OptionJson optionJson = new OptionJson();
		optionJson.setDns_type(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.dns_type"));
		optionJson.setDns_server(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.dns_server"));
		optionJson.setExpect_value(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.expect_value"));
		optionJson.setHttp_method(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.http_method"));
		optionJson.setResponse_content(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.response_content"));
		optionJson.setMatch_rule(_ctx.integerValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.match_rule"));
		optionJson.setRequest_content(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.request_content"));
		optionJson.setCookie(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.cookie"));
		optionJson.setHeader(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.header"));
		optionJson.setUsername(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.username"));
		optionJson.setPassword(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.password"));
		optionJson.setTime_out(_ctx.longValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.time_out"));
		optionJson.setPing_num(_ctx.integerValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.ping_num"));
		optionJson.setFailure_rate(_ctx.floatValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.failure_rate"));
		optionJson.setRequest_format(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.request_format"));
		optionJson.setResponse_format(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.response_format"));
		optionJson.setPort(_ctx.integerValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.port"));
		optionJson.setAuthentication(_ctx.integerValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.authentication"));
		optionJson.setTraceroute(_ctx.longValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.traceroute"));
		siteMonitors.setOptionJson(optionJson);

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