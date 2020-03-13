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

import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertRecordsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertRecordsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertRecordsResponse.Response.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertRecordsResponse.Response.Entity.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertRecordsResponse.Response.Entity.DataItem.NotificationResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAlertRecordsResponseUnmarshaller {

	public static QueryRmsAlertRecordsResponse unmarshall(QueryRmsAlertRecordsResponse queryRmsAlertRecordsResponse, UnmarshallerContext _ctx) {
		
		queryRmsAlertRecordsResponse.setRequestId(_ctx.stringValue("QueryRmsAlertRecordsResponse.RequestId"));
		queryRmsAlertRecordsResponse.setResultCode(_ctx.stringValue("QueryRmsAlertRecordsResponse.ResultCode"));
		queryRmsAlertRecordsResponse.setResultMessage(_ctx.stringValue("QueryRmsAlertRecordsResponse.ResultMessage"));

		Response response = new Response();

		Entity entity = new Entity();

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAlertRecordsResponse.Response.Entity.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAlertRuleId(_ctx.longValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].AlertRuleId"));
			dataItem.setId(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].Id"));
			dataItem.setMonitorItemType(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].MonitorItemType"));
			dataItem.setMonitorOpotionKey(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].MonitorOpotionKey"));
			dataItem.setMonitorOptionKey(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].MonitorOptionKey"));
			dataItem.setMonitorPort(_ctx.longValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].MonitorPort"));
			dataItem.setMonitorTargetId(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].MonitorTargetId"));
			dataItem.setMonitorTargetName(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].MonitorTargetName"));
			dataItem.setMonitorTargetType(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].MonitorTargetType"));
			dataItem.setNotificationState(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].NotificationState"));
			dataItem.setProjectId(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].ProjectId"));
			dataItem.setRuleType(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].RuleType"));
			dataItem.setTenantId(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].TenantId"));
			dataItem.setTriggerState(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].TriggerState"));
			dataItem.setTriggerValue(_ctx.longValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].TriggerValue"));
			dataItem.setTriggerValueThreshold(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].TriggerValueThreshold"));
			dataItem.setUtcCreated(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].UtcCreated"));
			dataItem.setUtcModified(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].UtcModified"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].WorkspaceId"));

			List<NotificationResultsItem> notificationResults = new ArrayList<NotificationResultsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].NotificationResults.Length"); j++) {
				NotificationResultsItem notificationResultsItem = new NotificationResultsItem();
				notificationResultsItem.setErrorMessage(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].NotificationResults["+ j +"].ErrorMessage"));
				notificationResultsItem.setRequestId(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].NotificationResults["+ j +"].RequestId"));
				notificationResultsItem.setSuccess(_ctx.booleanValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].NotificationResults["+ j +"].Success"));
				notificationResultsItem.setTargetLoginName(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].NotificationResults["+ j +"].TargetLoginName"));
				notificationResultsItem.setType(_ctx.stringValue("QueryRmsAlertRecordsResponse.Response.Entity.Data["+ i +"].NotificationResults["+ j +"].Type"));

				notificationResults.add(notificationResultsItem);
			}
			dataItem.setNotificationResults(notificationResults);

			data.add(dataItem);
		}
		entity.setData(data);
		response.setEntity(entity);
		queryRmsAlertRecordsResponse.setResponse(response);
	 
	 	return queryRmsAlertRecordsResponse;
	}
}