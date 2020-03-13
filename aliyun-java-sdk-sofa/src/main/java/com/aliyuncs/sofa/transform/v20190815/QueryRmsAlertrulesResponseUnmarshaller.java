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

import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertrulesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertrulesResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertrulesResponse.Response.EntitiesItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertrulesResponse.Response.EntitiesItem.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertrulesResponse.Response.EntitiesItem.Entity.Definition;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertrulesResponse.Response.EntitiesItem.Entity.MonitorTarget;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertrulesResponse.Response.Meta;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertrulesResponse.Response.Meta.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAlertrulesResponseUnmarshaller {

	public static QueryRmsAlertrulesResponse unmarshall(QueryRmsAlertrulesResponse queryRmsAlertrulesResponse, UnmarshallerContext _ctx) {
		
		queryRmsAlertrulesResponse.setRequestId(_ctx.stringValue("QueryRmsAlertrulesResponse.RequestId"));
		queryRmsAlertrulesResponse.setResultCode(_ctx.stringValue("QueryRmsAlertrulesResponse.ResultCode"));
		queryRmsAlertrulesResponse.setResultMessage(_ctx.stringValue("QueryRmsAlertrulesResponse.ResultMessage"));

		Response response = new Response();

		Meta meta = new Meta();

		Page page = new Page();
		page.setLimit(_ctx.longValue("QueryRmsAlertrulesResponse.Response.Meta.Page.Limit"));
		page.setOffset(_ctx.longValue("QueryRmsAlertrulesResponse.Response.Meta.Page.Offset"));
		page.setTotalSize(_ctx.longValue("QueryRmsAlertrulesResponse.Response.Meta.Page.TotalSize"));
		meta.setPage(page);
		response.setMeta(meta);

		List<EntitiesItem> entities = new ArrayList<EntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAlertrulesResponse.Response.Entities.Length"); i++) {
			EntitiesItem entitiesItem = new EntitiesItem();
			entitiesItem.setLayer(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Layer"));

			Entity entity = new Entity();
			entity.setAlertLevel(_ctx.longValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.AlertLevel"));
			entity.setAlertShutEndDateTime(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.AlertShutEndDateTime"));
			entity.setAlertShutReason(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.AlertShutReason"));
			entity.setAlertShutStartDateTime(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.AlertShutStartDateTime"));
			entity.setAlertValidEndTime(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.AlertValidEndTime"));
			entity.setAlertValidStartTime(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.AlertValidStartTime"));
			entity.setEnabled(_ctx.booleanValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.Enabled"));
			entity.setId(_ctx.longValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.Id"));
			entity.setRuleType(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.RuleType"));
			entity.setSilencePeriodMinute(_ctx.longValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.SilencePeriodMinute"));
			entity.setState(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.State"));
			entity.setUtcCreated(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.UtcCreated"));
			entity.setUtcModified(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.UtcModified"));

			Definition definition = new Definition();
			definition.setMonitorItemType(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.Definition.MonitorItemType"));
			definition.setMonitorOptionKey(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.Definition.MonitorOptionKey"));
			definition.setMonitorPort(_ctx.longValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.Definition.MonitorPort"));
			definition.setStatisticalMethod(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.Definition.StatisticalMethod"));
			definition.setStatisticalPeriod(_ctx.longValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.Definition.StatisticalPeriod"));
			definition.setTriggerCountThreshold(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.Definition.TriggerCountThreshold"));
			definition.setTriggerOperator(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.Definition.TriggerOperator"));
			definition.setTriggerValueThreshold(_ctx.longValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.Definition.TriggerValueThreshold"));
			entity.setDefinition(definition);

			MonitorTarget monitorTarget = new MonitorTarget();
			monitorTarget.setMonitorTargetId(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.MonitorTarget.MonitorTargetId"));
			monitorTarget.setMonitorTargetName(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.MonitorTarget.MonitorTargetName"));
			monitorTarget.setMonitorTargetType(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.MonitorTarget.MonitorTargetType"));
			monitorTarget.setTenantId(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.MonitorTarget.TenantId"));
			monitorTarget.setWorkspaceId(_ctx.stringValue("QueryRmsAlertrulesResponse.Response.Entities["+ i +"].Entity.MonitorTarget.WorkspaceId"));
			entity.setMonitorTarget(monitorTarget);
			entitiesItem.setEntity(entity);

			entities.add(entitiesItem);
		}
		response.setEntities(entities);
		queryRmsAlertrulesResponse.setResponse(response);
	 
	 	return queryRmsAlertrulesResponse;
	}
}