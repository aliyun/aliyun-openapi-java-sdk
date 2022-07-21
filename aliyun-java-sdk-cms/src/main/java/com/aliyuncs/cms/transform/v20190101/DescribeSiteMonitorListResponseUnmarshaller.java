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

import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorListResponse.SiteMonitor;
import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorListResponse.SiteMonitor.OptionsJson;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSiteMonitorListResponseUnmarshaller {

	public static DescribeSiteMonitorListResponse unmarshall(DescribeSiteMonitorListResponse describeSiteMonitorListResponse, UnmarshallerContext _ctx) {
		
		describeSiteMonitorListResponse.setRequestId(_ctx.stringValue("DescribeSiteMonitorListResponse.RequestId"));
		describeSiteMonitorListResponse.setSuccess(_ctx.stringValue("DescribeSiteMonitorListResponse.Success"));
		describeSiteMonitorListResponse.setCode(_ctx.stringValue("DescribeSiteMonitorListResponse.Code"));
		describeSiteMonitorListResponse.setMessage(_ctx.stringValue("DescribeSiteMonitorListResponse.Message"));
		describeSiteMonitorListResponse.setPageNumber(_ctx.integerValue("DescribeSiteMonitorListResponse.PageNumber"));
		describeSiteMonitorListResponse.setPageSize(_ctx.integerValue("DescribeSiteMonitorListResponse.PageSize"));
		describeSiteMonitorListResponse.setTotalCount(_ctx.integerValue("DescribeSiteMonitorListResponse.TotalCount"));

		List<SiteMonitor> siteMonitors = new ArrayList<SiteMonitor>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSiteMonitorListResponse.SiteMonitors.Length"); i++) {
			SiteMonitor siteMonitor = new SiteMonitor();
			siteMonitor.setEndTime(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].EndTime"));
			siteMonitor.setTaskType(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].TaskType"));
			siteMonitor.setUpdateTime(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].UpdateTime"));
			siteMonitor.setInterval(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].Interval"));
			siteMonitor.setTaskState(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].TaskState"));
			siteMonitor.setCreateTime(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].CreateTime"));
			siteMonitor.setTaskName(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].TaskName"));
			siteMonitor.setAddress(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].Address"));
			siteMonitor.setTaskId(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].TaskId"));

			OptionsJson optionsJson = new OptionsJson();
			optionsJson.setPassword(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.password"));
			optionsJson.setRequest_format(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.request_format"));
			optionsJson.setExpect_value(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.expect_value"));
			optionsJson.setResponse_content(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.response_content"));
			optionsJson.setFailure_rate(_ctx.floatValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.failure_rate"));
			optionsJson.setTime_out(_ctx.longValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.time_out"));
			optionsJson.setHeader(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.header"));
			optionsJson.setCookie(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.cookie"));
			optionsJson.setPort(_ctx.integerValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.port"));
			optionsJson.setPing_num(_ctx.integerValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.ping_num"));
			optionsJson.setAuthentication(_ctx.integerValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.authentication"));
			optionsJson.setHttp_method(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.http_method"));
			optionsJson.setMatch_rule(_ctx.integerValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.match_rule"));
			optionsJson.setDns_match_rule(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.dns_match_rule"));
			optionsJson.setRequest_content(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.request_content"));
			optionsJson.setUsername(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.username"));
			optionsJson.setTraceroute(_ctx.longValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.traceroute"));
			optionsJson.setResponse_format(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.response_format"));
			optionsJson.setDns_type(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.dns_type"));
			optionsJson.setGroup_id(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.group_id"));
			optionsJson.setDns_server(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.dns_server"));
			optionsJson.setEnable_operator_dns(_ctx.booleanValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.enable_operator_dns"));
			optionsJson.setAttempts(_ctx.longValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.attempts"));
			optionsJson.setBizProtocol(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.protocol"));
			optionsJson.setProxy_protocol(_ctx.booleanValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.proxy_protocol"));
			optionsJson.setAcceptable_response_code(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.acceptable_response_code"));
			optionsJson.setIsBase64Encode(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.isBase64Encode"));
			optionsJson.setCert_verify(_ctx.booleanValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.cert_verify"));
			optionsJson.setUnfollow_redirect(_ctx.booleanValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.unfollow_redirect"));
			optionsJson.setDiagnosis_mtr(_ctx.booleanValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.diagnosis_mtr"));
			optionsJson.setDiagnosis_ping(_ctx.booleanValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.diagnosis_ping"));
			optionsJson.setRetry_delay(_ctx.integerValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.retry_delay"));
			siteMonitor.setOptionsJson(optionsJson);

			siteMonitors.add(siteMonitor);
		}
		describeSiteMonitorListResponse.setSiteMonitors(siteMonitors);
	 
	 	return describeSiteMonitorListResponse;
	}
}