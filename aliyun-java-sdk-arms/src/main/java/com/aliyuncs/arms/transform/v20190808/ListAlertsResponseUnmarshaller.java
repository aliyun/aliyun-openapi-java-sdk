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

import com.aliyuncs.arms.model.v20190808.ListAlertsResponse;
import com.aliyuncs.arms.model.v20190808.ListAlertsResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.ListAlertsResponse.PageBean.ListAlertsItem;
import com.aliyuncs.arms.model.v20190808.ListAlertsResponse.PageBean.ListAlertsItem.ActivitiesItem;
import com.aliyuncs.arms.model.v20190808.ListAlertsResponse.PageBean.ListAlertsItem.AlertEventsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlertsResponseUnmarshaller {

	public static ListAlertsResponse unmarshall(ListAlertsResponse listAlertsResponse, UnmarshallerContext _ctx) {
		
		listAlertsResponse.setRequestId(_ctx.stringValue("ListAlertsResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.longValue("ListAlertsResponse.PageBean.Total"));
		pageBean.setPage(_ctx.longValue("ListAlertsResponse.PageBean.Page"));
		pageBean.setSize(_ctx.longValue("ListAlertsResponse.PageBean.Size"));

		List<ListAlertsItem> listAlerts = new ArrayList<ListAlertsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAlertsResponse.PageBean.ListAlerts.Length"); i++) {
			ListAlertsItem listAlertsItem = new ListAlertsItem();
			listAlertsItem.setAlertName(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertName"));
			listAlertsItem.setSeverity(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].Severity"));
			listAlertsItem.setState(_ctx.longValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].State"));
			listAlertsItem.setDispatchRuleId(_ctx.floatValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].DispatchRuleId"));
			listAlertsItem.setDispatchRuleName(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].DispatchRuleName"));
			listAlertsItem.setCreateTime(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].CreateTime"));
			listAlertsItem.setAlertId(_ctx.longValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertId"));

			List<ActivitiesItem> activities = new ArrayList<ActivitiesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].Activities.Length"); j++) {
				ActivitiesItem activitiesItem = new ActivitiesItem();
				activitiesItem.setTime(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].Activities["+ j +"].Time"));
				activitiesItem.setType(_ctx.longValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].Activities["+ j +"].Type"));
				activitiesItem.setHandlerName(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].Activities["+ j +"].HandlerName"));
				activitiesItem.setDescription(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].Activities["+ j +"].Description"));
				activitiesItem.setContent(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].Activities["+ j +"].Content"));

				activities.add(activitiesItem);
			}
			listAlertsItem.setActivities(activities);

			List<AlertEventsItem> alertEvents = new ArrayList<AlertEventsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents.Length"); j++) {
				AlertEventsItem alertEventsItem = new AlertEventsItem();
				alertEventsItem.setAlertName(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents["+ j +"].AlertName"));
				alertEventsItem.setSeverity(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents["+ j +"].Severity"));
				alertEventsItem.setState(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents["+ j +"].State"));
				alertEventsItem.setStartTime(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents["+ j +"].StartTime"));
				alertEventsItem.setEndTime(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents["+ j +"].EndTime"));
				alertEventsItem.setReceiveTime(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents["+ j +"].ReceiveTime"));
				alertEventsItem.setIntegrationName(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents["+ j +"].IntegrationName"));
				alertEventsItem.setIntegrationType(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents["+ j +"].IntegrationType"));
				alertEventsItem.setGeneratorURL(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents["+ j +"].GeneratorURL"));
				alertEventsItem.setDescription(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents["+ j +"].Description"));
				alertEventsItem.setAnnotations(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents["+ j +"].Annotations"));
				alertEventsItem.setLabels(_ctx.stringValue("ListAlertsResponse.PageBean.ListAlerts["+ i +"].AlertEvents["+ j +"].Labels"));

				alertEvents.add(alertEventsItem);
			}
			listAlertsItem.setAlertEvents(alertEvents);

			listAlerts.add(listAlertsItem);
		}
		pageBean.setListAlerts(listAlerts);
		listAlertsResponse.setPageBean(pageBean);
	 
	 	return listAlertsResponse;
	}
}