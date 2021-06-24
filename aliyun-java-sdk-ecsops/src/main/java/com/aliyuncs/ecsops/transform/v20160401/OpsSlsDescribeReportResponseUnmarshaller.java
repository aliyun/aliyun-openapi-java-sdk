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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeReportResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeReportResponse.Reports;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeReportResponse.Reports.Configuration;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeReportResponse.Reports.Configuration.NotificationListItem;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeReportResponse.Reports.Schedule;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSlsDescribeReportResponseUnmarshaller {

	public static OpsSlsDescribeReportResponse unmarshall(OpsSlsDescribeReportResponse opsSlsDescribeReportResponse, UnmarshallerContext _ctx) {
		
		opsSlsDescribeReportResponse.setRequestId(_ctx.stringValue("OpsSlsDescribeReportResponse.RequestId"));
		opsSlsDescribeReportResponse.setMessage(_ctx.stringValue("OpsSlsDescribeReportResponse.Message"));
		opsSlsDescribeReportResponse.setCode(_ctx.stringValue("OpsSlsDescribeReportResponse.Code"));
		opsSlsDescribeReportResponse.setSuccess(_ctx.stringValue("OpsSlsDescribeReportResponse.Success"));
		opsSlsDescribeReportResponse.setPageSize(_ctx.longValue("OpsSlsDescribeReportResponse.PageSize"));
		opsSlsDescribeReportResponse.setTotal(_ctx.longValue("OpsSlsDescribeReportResponse.Total"));
		opsSlsDescribeReportResponse.setPageNo(_ctx.longValue("OpsSlsDescribeReportResponse.PageNo"));

		List<Reports> data = new ArrayList<Reports>();
		for (int i = 0; i < _ctx.lengthValue("OpsSlsDescribeReportResponse.Data.Length"); i++) {
			Reports reports = new Reports();
			reports.setCreateTime(_ctx.longValue("OpsSlsDescribeReportResponse.Data["+ i +"].CreateTime"));
			reports.setDescription(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].Description"));
			reports.setDisplayName(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].DisplayName"));
			reports.setLastModifiedTime(_ctx.longValue("OpsSlsDescribeReportResponse.Data["+ i +"].LastModifiedTime"));
			reports.setName(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].Name"));
			reports.setRecyclable(_ctx.booleanValue("OpsSlsDescribeReportResponse.Data["+ i +"].Recyclable"));
			reports.setState(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].State"));
			reports.setType(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].Type"));

			Configuration configuration = new Configuration();
			configuration.setAllowAnonymousAccess(_ctx.booleanValue("OpsSlsDescribeReportResponse.Data["+ i +"].Configuration.AllowAnonymousAccess"));
			configuration.setCustomizePeriod(_ctx.booleanValue("OpsSlsDescribeReportResponse.Data["+ i +"].Configuration.CustomizePeriod"));
			configuration.setDashboard(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].Configuration.Dashboard"));
			configuration.setEnableWatermark(_ctx.booleanValue("OpsSlsDescribeReportResponse.Data["+ i +"].Configuration.EnableWatermark"));
			configuration.setLanguage(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].Configuration.Language"));

			List<NotificationListItem> notificationList = new ArrayList<NotificationListItem>();
			for (int j = 0; j < _ctx.lengthValue("OpsSlsDescribeReportResponse.Data["+ i +"].Configuration.NotificationList.Length"); j++) {
				NotificationListItem notificationListItem = new NotificationListItem();
				notificationListItem.setServiceUri(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].Configuration.NotificationList["+ j +"].ServiceUri"));
				notificationListItem.setAtAll(_ctx.booleanValue("OpsSlsDescribeReportResponse.Data["+ i +"].Configuration.NotificationList["+ j +"].AtAll"));
				notificationListItem.setContent(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].Configuration.NotificationList["+ j +"].Content"));
				notificationListItem.setBizMethod(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].Configuration.NotificationList["+ j +"].Method"));
				notificationListItem.setTitle(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].Configuration.NotificationList["+ j +"].Title"));
				notificationListItem.setType(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].Configuration.NotificationList["+ j +"].Type"));

				notificationList.add(notificationListItem);
			}
			configuration.setNotificationList(notificationList);
			reports.setConfiguration(configuration);

			Schedule schedule = new Schedule();
			schedule.setDayOfWeek(_ctx.longValue("OpsSlsDescribeReportResponse.Data["+ i +"].Schedule.DayOfWeek"));
			schedule.setDelay(_ctx.longValue("OpsSlsDescribeReportResponse.Data["+ i +"].Schedule.Delay"));
			schedule.setHour(_ctx.longValue("OpsSlsDescribeReportResponse.Data["+ i +"].Schedule.Hour"));
			schedule.setRunImmediately(_ctx.booleanValue("OpsSlsDescribeReportResponse.Data["+ i +"].Schedule.RunImmediately"));
			schedule.setType(_ctx.stringValue("OpsSlsDescribeReportResponse.Data["+ i +"].Schedule.Type"));
			reports.setSchedule(schedule);

			data.add(reports);
		}
		opsSlsDescribeReportResponse.setData(data);
	 
	 	return opsSlsDescribeReportResponse;
	}
}