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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListAlertEventsResponse;
import com.aliyuncs.arms.model.v20190808.ListAlertEventsResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.ListAlertEventsResponse.PageBean.EventsItem;
import com.aliyuncs.arms.model.v20190808.ListAlertEventsResponse.PageBean.EventsItem.AlarmsItem;
import com.aliyuncs.arms.model.v20190808.ListAlertEventsResponse.PageBean.EventsItem.NotificationPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlertEventsResponseUnmarshaller {

	public static ListAlertEventsResponse unmarshall(ListAlertEventsResponse listAlertEventsResponse, UnmarshallerContext _ctx) {
		
		listAlertEventsResponse.setRequestId(_ctx.stringValue("ListAlertEventsResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.longValue("ListAlertEventsResponse.PageBean.Total"));
		pageBean.setPage(_ctx.longValue("ListAlertEventsResponse.PageBean.Page"));
		pageBean.setSize(_ctx.longValue("ListAlertEventsResponse.PageBean.Size"));

		List<EventsItem> events = new ArrayList<EventsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAlertEventsResponse.PageBean.Events.Length"); i++) {
			EventsItem eventsItem = new EventsItem();
			eventsItem.setAlertName(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].AlertName"));
			eventsItem.setSeverity(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].Severity"));
			eventsItem.setStatus(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].Status"));
			eventsItem.setStartTime(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].StartTime"));
			eventsItem.setEndTime(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].EndTime"));
			eventsItem.setReceiveTime(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].ReceiveTime"));
			eventsItem.setIntegrationName(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].IntegrationName"));
			eventsItem.setIntegrationType(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].IntegrationType"));
			eventsItem.setGeneratorURL(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].GeneratorURL"));
			eventsItem.setDescription(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].Description"));
			eventsItem.setAnnotations(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].Annotations"));
			eventsItem.setLabels(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].Labels"));
			eventsItem.setHandlerName(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].HandlerName"));
			eventsItem.setTriggerCount(_ctx.longValue("ListAlertEventsResponse.PageBean.Events["+ i +"].TriggerCount"));

			List<AlarmsItem> alarms = new ArrayList<AlarmsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertEventsResponse.PageBean.Events["+ i +"].Alarms.Length"); j++) {
				AlarmsItem alarmsItem = new AlarmsItem();
				alarmsItem.setAlarmId(_ctx.longValue("ListAlertEventsResponse.PageBean.Events["+ i +"].Alarms["+ j +"].AlarmId"));
				alarmsItem.setAlarmName(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].Alarms["+ j +"].AlarmName"));
				alarmsItem.setState(_ctx.integerValue("ListAlertEventsResponse.PageBean.Events["+ i +"].Alarms["+ j +"].State"));
				alarmsItem.setCreateTime(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].Alarms["+ j +"].CreateTime"));

				alarms.add(alarmsItem);
			}
			eventsItem.setAlarms(alarms);

			List<NotificationPolicy> notificationPolicies = new ArrayList<NotificationPolicy>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertEventsResponse.PageBean.Events["+ i +"].NotificationPolicies.Length"); j++) {
				NotificationPolicy notificationPolicy = new NotificationPolicy();
				notificationPolicy.setId(_ctx.longValue("ListAlertEventsResponse.PageBean.Events["+ i +"].NotificationPolicies["+ j +"].Id"));
				notificationPolicy.setName(_ctx.stringValue("ListAlertEventsResponse.PageBean.Events["+ i +"].NotificationPolicies["+ j +"].Name"));

				notificationPolicies.add(notificationPolicy);
			}
			eventsItem.setNotificationPolicies(notificationPolicies);

			events.add(eventsItem);
		}
		pageBean.setEvents(events);
		listAlertEventsResponse.setPageBean(pageBean);
	 
	 	return listAlertEventsResponse;
	}
}