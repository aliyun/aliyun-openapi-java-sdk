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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmrecordsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmrecordsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmrecordsResponse.Response.EntitiesItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmrecordsResponse.Response.EntitiesItem.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmrecordsResponse.Response.EntitiesItem.Entity.NotificationResultVosItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmrecordsResponse.Response.Meta;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmrecordsResponse.Response.Meta.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAlarmrecordsResponseUnmarshaller {

	public static QueryRmsAlarmrecordsResponse unmarshall(QueryRmsAlarmrecordsResponse queryRmsAlarmrecordsResponse, UnmarshallerContext _ctx) {
		
		queryRmsAlarmrecordsResponse.setRequestId(_ctx.stringValue("QueryRmsAlarmrecordsResponse.RequestId"));
		queryRmsAlarmrecordsResponse.setResultCode(_ctx.stringValue("QueryRmsAlarmrecordsResponse.ResultCode"));
		queryRmsAlarmrecordsResponse.setResultMessage(_ctx.stringValue("QueryRmsAlarmrecordsResponse.ResultMessage"));

		Response response = new Response();

		Meta meta = new Meta();

		Page page = new Page();
		page.setLimit(_ctx.longValue("QueryRmsAlarmrecordsResponse.Response.Meta.Page.Limit"));
		page.setOffset(_ctx.longValue("QueryRmsAlarmrecordsResponse.Response.Meta.Page.Offset"));
		page.setTotalSize(_ctx.longValue("QueryRmsAlarmrecordsResponse.Response.Meta.Page.TotalSize"));
		meta.setPage(page);
		response.setMeta(meta);

		List<EntitiesItem> entities = new ArrayList<EntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAlarmrecordsResponse.Response.Entities.Length"); i++) {
			EntitiesItem entitiesItem = new EntitiesItem();

			Entity entity = new Entity();
			entity.setAlarmTime(_ctx.stringValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.AlarmTime"));
			entity.setAppName(_ctx.stringValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.AppName"));
			entity.setId(_ctx.longValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.Id"));
			entity.setMonitorItemType(_ctx.stringValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.MonitorItemType"));
			entity.setMonitorPort(_ctx.longValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.MonitorPort"));
			entity.setMonitorTargetType(_ctx.stringValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.MonitorTargetType"));
			entity.setNotificationState(_ctx.stringValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.NotificationState"));
			entity.setResourceName(_ctx.stringValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.ResourceName"));
			entity.setTriggerState(_ctx.stringValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.TriggerState"));
			entity.setTriggerValue(_ctx.longValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.TriggerValue"));

			List<NotificationResultVosItem> notificationResultVos = new ArrayList<NotificationResultVosItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.NotificationResultVos.Length"); j++) {
				NotificationResultVosItem notificationResultVosItem = new NotificationResultVosItem();
				notificationResultVosItem.setErrorMessage(_ctx.stringValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.NotificationResultVos["+ j +"].ErrorMessage"));
				notificationResultVosItem.setRequestId(_ctx.stringValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.NotificationResultVos["+ j +"].RequestId"));
				notificationResultVosItem.setSuccess(_ctx.booleanValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.NotificationResultVos["+ j +"].Success"));
				notificationResultVosItem.setTargetLoginName(_ctx.stringValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.NotificationResultVos["+ j +"].TargetLoginName"));
				notificationResultVosItem.setType(_ctx.stringValue("QueryRmsAlarmrecordsResponse.Response.Entities["+ i +"].Entity.NotificationResultVos["+ j +"].Type"));

				notificationResultVos.add(notificationResultVosItem);
			}
			entity.setNotificationResultVos(notificationResultVos);
			entitiesItem.setEntity(entity);

			entities.add(entitiesItem);
		}
		response.setEntities(entities);
		queryRmsAlarmrecordsResponse.setResponse(response);
	 
	 	return queryRmsAlarmrecordsResponse;
	}
}