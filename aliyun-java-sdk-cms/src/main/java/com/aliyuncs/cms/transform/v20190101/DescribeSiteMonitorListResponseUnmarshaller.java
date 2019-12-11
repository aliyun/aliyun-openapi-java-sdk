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
			siteMonitor.setOptionsJson(_ctx.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson"));

			siteMonitors.add(siteMonitor);
		}
		describeSiteMonitorListResponse.setSiteMonitors(siteMonitors);
	 
	 	return describeSiteMonitorListResponse;
	}
}