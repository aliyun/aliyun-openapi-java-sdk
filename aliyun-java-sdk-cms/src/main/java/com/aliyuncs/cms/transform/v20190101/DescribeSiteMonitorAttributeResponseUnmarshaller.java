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
		siteMonitors.setEndTime(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.EndTime"));
		siteMonitors.setTaskType(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.TaskType"));
		siteMonitors.setInterval(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.Interval"));
		siteMonitors.setTaskState(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.TaskState"));
		siteMonitors.setTaskName(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.TaskName"));
		siteMonitors.setAddress(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.Address"));
		siteMonitors.setTaskId(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.TaskId"));

		OptionJson optionJson = new OptionJson();
		optionJson.setRequest_format(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.request_format"));
		optionJson.setResponse_content(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.response_content"));
		optionJson.setPort(_ctx.integerValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.port"));
		optionJson.setProxy_protocol(_ctx.booleanValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.proxy_protocol"));
		optionJson.setAuthentication(_ctx.integerValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.authentication"));
		optionJson.setMatch_rule(_ctx.integerValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.match_rule"));
		optionJson.setDns_match_rule(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.dns_match_rule"));
		optionJson.setIpv6_task(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.ipv6_task"));
		optionJson.setRequest_content(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.request_content"));
		optionJson.setAcceptable_response_code(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.acceptable_response_code"));
		optionJson.setUsername(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.username"));
		optionJson.setTraceroute(_ctx.longValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.traceroute"));
		optionJson.setDns_type(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.dns_type"));
		optionJson.setResponse_format(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.response_format"));
		optionJson.setPassword(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.password"));
		optionJson.setExpect_value(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.expect_value"));
		optionJson.setTime_out(_ctx.longValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.time_out"));
		optionJson.setFailure_rate(_ctx.floatValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.failure_rate"));
		optionJson.setHeader(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.header"));
		optionJson.setCookie(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.cookie"));
		optionJson.setPing_num(_ctx.integerValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.ping_num"));
		optionJson.setHttp_method(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.http_method"));
		optionJson.setUnfollow_redirect(_ctx.booleanValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.unfollow_redirect"));
		optionJson.setCert_verify(_ctx.booleanValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.cert_verify"));
		optionJson.setDns_server(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.dns_server"));
		optionJson.setEnable_operator_dns(_ctx.booleanValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.enable_operator_dns"));
		optionJson.setAttempts(_ctx.longValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.attempts"));
		optionJson.setBizProtocol(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.protocol"));
		optionJson.setIsBase64Encode(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.isBase64Encode"));
		optionJson.setDiagnosis_mtr(_ctx.booleanValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.diagnosis_mtr"));
		optionJson.setDiagnosis_ping(_ctx.booleanValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.diagnosis_ping"));
		optionJson.setRetry_delay(_ctx.integerValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.OptionJson.retry_delay"));
		siteMonitors.setOptionJson(optionJson);

		List<IspCity> ispCities = new ArrayList<IspCity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities.Length"); i++) {
			IspCity ispCity = new IspCity();
			ispCity.setCity(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities["+ i +"].City"));
			ispCity.setIspName(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities["+ i +"].IspName"));
			ispCity.setIsp(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities["+ i +"].Isp"));
			ispCity.setCityName(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.SiteMonitors.IspCities["+ i +"].CityName"));

			ispCities.add(ispCity);
		}
		siteMonitors.setIspCities(ispCities);
		describeSiteMonitorAttributeResponse.setSiteMonitors(siteMonitors);

		List<MetricRule> metricRules = new ArrayList<MetricRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSiteMonitorAttributeResponse.MetricRules.Length"); i++) {
			MetricRule metricRule = new MetricRule();
			metricRule.setMetricName(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].MetricName"));
			metricRule.setEvaluationCount(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].EvaluationCount"));
			metricRule.setNamespace(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Namespace"));
			metricRule.setOkActions(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].OkActions"));
			metricRule.setAlarmActions(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].AlarmActions"));
			metricRule.setRuleId(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].RuleId"));
			metricRule.setRuleName(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].RuleName"));
			metricRule.setPeriod(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Period"));
			metricRule.setComparisonOperator(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].ComparisonOperator"));
			metricRule.setExpression(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Expression"));
			metricRule.setDimensions(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Dimensions"));
			metricRule.setStateValue(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].StateValue"));
			metricRule.setActionEnable(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].ActionEnable"));
			metricRule.setLevel(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Level"));
			metricRule.setThreshold(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Threshold"));
			metricRule.setStatistics(_ctx.stringValue("DescribeSiteMonitorAttributeResponse.MetricRules["+ i +"].Statistics"));

			metricRules.add(metricRule);
		}
		describeSiteMonitorAttributeResponse.setMetricRules(metricRules);
	 
	 	return describeSiteMonitorAttributeResponse;
	}
}