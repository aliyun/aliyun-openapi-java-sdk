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

	public static DescribeSiteMonitorListResponse unmarshall(DescribeSiteMonitorListResponse describeSiteMonitorListResponse, UnmarshallerContext context) {
		
		describeSiteMonitorListResponse.setRequestId(context.stringValue("DescribeSiteMonitorListResponse.RequestId"));
		describeSiteMonitorListResponse.setCode(context.stringValue("DescribeSiteMonitorListResponse.Code"));
		describeSiteMonitorListResponse.setMessage(context.stringValue("DescribeSiteMonitorListResponse.Message"));
		describeSiteMonitorListResponse.setSuccess(context.stringValue("DescribeSiteMonitorListResponse.Success"));
		describeSiteMonitorListResponse.setPageNumber(context.integerValue("DescribeSiteMonitorListResponse.PageNumber"));
		describeSiteMonitorListResponse.setPageSize(context.integerValue("DescribeSiteMonitorListResponse.PageSize"));
		describeSiteMonitorListResponse.setTotalCount(context.integerValue("DescribeSiteMonitorListResponse.TotalCount"));

		List<SiteMonitor> siteMonitors = new ArrayList<SiteMonitor>();
		for (int i = 0; i < context.lengthValue("DescribeSiteMonitorListResponse.SiteMonitors.Length"); i++) {
			SiteMonitor siteMonitor = new SiteMonitor();
			siteMonitor.setTaskId(context.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].TaskId"));
			siteMonitor.setTaskType(context.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].TaskType"));
			siteMonitor.setAddress(context.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].Address"));
			siteMonitor.setTaskState(context.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].TaskState"));
			siteMonitor.setCreateTime(context.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].CreateTime"));
			siteMonitor.setTaskName(context.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].TaskName"));
			siteMonitor.setInterval(context.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].Interval"));
			siteMonitor.setUpdateTime(context.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].UpdateTime"));
			siteMonitor.setOptionsJson(context.stringValue("DescribeSiteMonitorListResponse.SiteMonitors["+ i +"].OptionsJson"));

			siteMonitors.add(siteMonitor);
		}
		describeSiteMonitorListResponse.setSiteMonitors(siteMonitors);
	 
	 	return describeSiteMonitorListResponse;
	}
}