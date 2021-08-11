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
		describeSiteMonitorListResponse.setCode(_ctx.stringValue("DescribeSiteMonitorListResponse.Code"));
		describeSiteMonitorListResponse.setMessage(_ctx.stringValue("DescribeSiteMonitorListResponse.Message"));
		describeSiteMonitorListResponse.setSuccess(_ctx.stringValue("DescribeSiteMonitorListResponse.Success"));
		describeSiteMonitorListResponse.setPageNumber(_ctx.integerValue("DescribeSiteMonitorListResponse.PageNumber"));
		describeSiteMonitorListResponse.setPageSize(_ctx.integerValue("DescribeSiteMonitorListResponse.PageSize"));
		describeSiteMonitorListResponse.setTotalCount(_ctx.integerValue("DescribeSiteMonitorListResponse.TotalCount"));

		List<SiteMonitor> siteMonitors = new ArrayList<SiteMonitor>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSiteMonitorListResponse.SiteMonitors.Length"); i++) {
			SiteMonitor siteMonitor = new SiteMonitor();
			siteMonitor.setTaskId(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].TaskId"));
			siteMonitor.setTaskType(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].TaskType"));
			siteMonitor.setAddress(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].Address"));
			siteMonitor.setTaskState(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].TaskState"));
			siteMonitor.setCreateTime(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].CreateTime"));
			siteMonitor.setTaskName(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].TaskName"));
			siteMonitor.setInterval(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].Interval"));
			siteMonitor.setUpdateTime(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].UpdateTime"));
			siteMonitor.setEndTime(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].EndTime"));

			OptionsJson optionsJson = new OptionsJson();
			optionsJson.setDns_type(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.dns_type"));
			optionsJson.setDns_server(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.dns_server"));
			optionsJson.setGroup_id(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.group_id"));
			optionsJson.setExpect_value(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.expect_value"));
			optionsJson.setHttp_method(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.http_method"));
			optionsJson.setResponse_content(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.response_content"));
			optionsJson.setMatch_rule(_ctx.integerValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.match_rule"));
			optionsJson.setRequest_content(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.request_content"));
			optionsJson.setCookie(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.cookie"));
			optionsJson.setHeader(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.header"));
			optionsJson.setUsername(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.username"));
			optionsJson.setPassword(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.password"));
			optionsJson.setTime_out(_ctx.longValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.time_out"));
			optionsJson.setPing_num(_ctx.integerValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.ping_num"));
			optionsJson.setFailure_rate(_ctx.floatValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.failure_rate"));
			optionsJson.setRequest_format(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.request_format"));
			optionsJson.setResponse_format(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.response_format"));
			optionsJson.setPort(_ctx.integerValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.port"));
			optionsJson.setAuthentication(_ctx.integerValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.authentication"));
			optionsJson.setTraceroute(_ctx.longValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson.traceroute"));
			siteMonitor.setOptionsJson(optionsJson);

			siteMonitors.add(siteMonitor);
		}
		describeSiteMonitorListResponse.setSiteMonitors(siteMonitors);
	 
	 	return describeSiteMonitorListResponse;
	}
}