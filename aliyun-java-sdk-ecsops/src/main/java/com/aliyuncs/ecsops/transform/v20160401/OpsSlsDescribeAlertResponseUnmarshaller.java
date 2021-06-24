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

import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeAlertResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeAlertResponse.Alerts;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeAlertResponse.Alerts.Configuration;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeAlertResponse.Alerts.Configuration.NotificationListItem;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeAlertResponse.Alerts.Configuration.QueryListItem;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeAlertResponse.Alerts.Schedule;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSlsDescribeAlertResponseUnmarshaller {

	public static OpsSlsDescribeAlertResponse unmarshall(OpsSlsDescribeAlertResponse opsSlsDescribeAlertResponse, UnmarshallerContext _ctx) {
		
		opsSlsDescribeAlertResponse.setRequestId(_ctx.stringValue("OpsSlsDescribeAlertResponse.RequestId"));
		opsSlsDescribeAlertResponse.setMessage(_ctx.stringValue("OpsSlsDescribeAlertResponse.Message"));
		opsSlsDescribeAlertResponse.setCode(_ctx.stringValue("OpsSlsDescribeAlertResponse.Code"));
		opsSlsDescribeAlertResponse.setSuccess(_ctx.stringValue("OpsSlsDescribeAlertResponse.Success"));
		opsSlsDescribeAlertResponse.setPageSize(_ctx.longValue("OpsSlsDescribeAlertResponse.PageSize"));
		opsSlsDescribeAlertResponse.setTotal(_ctx.longValue("OpsSlsDescribeAlertResponse.Total"));
		opsSlsDescribeAlertResponse.setPageNo(_ctx.longValue("OpsSlsDescribeAlertResponse.PageNo"));

		List<Alerts> data = new ArrayList<Alerts>();
		for (int i = 0; i < _ctx.lengthValue("OpsSlsDescribeAlertResponse.Data.Length"); i++) {
			Alerts alerts = new Alerts();
			alerts.setDisplayName(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].DisplayName"));
			alerts.setCreateTime(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].CreateTime"));
			alerts.setLastModifiedTime(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].LastModifiedTime"));
			alerts.setState(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].State"));
			alerts.setType(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Type"));
			alerts.setDescription(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Description"));
			alerts.setName(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Name"));
			alerts.setRecyclable(_ctx.booleanValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Recyclable"));

			Configuration configuration = new Configuration();
			configuration.setDashboard(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.Dashboard"));
			configuration.setNotifyThreshold(_ctx.longValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.NotifyThreshold"));
			configuration.setSendRecoveryMessage(_ctx.booleanValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.SendRecoveryMessage"));
			configuration.setThrottling(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.Throttling"));

			List<QueryListItem> queryList = new ArrayList<QueryListItem>();
			for (int j = 0; j < _ctx.lengthValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.QueryList.Length"); j++) {
				QueryListItem queryListItem = new QueryListItem();
				queryListItem.setChartTitle(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.QueryList["+ j +"].ChartTitle"));
				queryListItem.setEnd(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.QueryList["+ j +"].End"));
				queryListItem.setQuery(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.QueryList["+ j +"].Query"));
				queryListItem.setStart(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.QueryList["+ j +"].Start"));
				queryListItem.setTimeSpanType(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.QueryList["+ j +"].TimeSpanType"));

				queryList.add(queryListItem);
			}
			configuration.setQueryList(queryList);

			List<NotificationListItem> notificationList = new ArrayList<NotificationListItem>();
			for (int j = 0; j < _ctx.lengthValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.NotificationList.Length"); j++) {
				NotificationListItem notificationListItem = new NotificationListItem();
				notificationListItem.setAtAll(_ctx.booleanValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.NotificationList["+ j +"].AtAll"));
				notificationListItem.setContent(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.NotificationList["+ j +"].Content"));
				notificationListItem.setBizMethod(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.NotificationList["+ j +"].Method"));
				notificationListItem.setServiceUri(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.NotificationList["+ j +"].ServiceUri"));
				notificationListItem.setTitle(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.NotificationList["+ j +"].Title"));
				notificationListItem.setType(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Configuration.NotificationList["+ j +"].Type"));

				notificationList.add(notificationListItem);
			}
			configuration.setNotificationList(notificationList);
			alerts.setConfiguration(configuration);

			Schedule schedule = new Schedule();
			schedule.setDelay(_ctx.longValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Schedule.Delay"));
			schedule.setInterval(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Schedule.Interval"));
			schedule.setRunImmediately(_ctx.booleanValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Schedule.RunImmediately"));
			schedule.setType(_ctx.stringValue("OpsSlsDescribeAlertResponse.Data["+ i +"].Schedule.Type"));
			alerts.setSchedule(schedule);

			data.add(alerts);
		}
		opsSlsDescribeAlertResponse.setData(data);
	 
	 	return opsSlsDescribeAlertResponse;
	}
}