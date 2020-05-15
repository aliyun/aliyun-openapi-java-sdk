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

import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertRuleSubscribesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertRuleSubscribesResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertRuleSubscribesResponse.Response.EntitiesItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertRuleSubscribesResponse.Response.EntitiesItem.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertRuleSubscribesResponse.Response.Meta;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertRuleSubscribesResponse.Response.Meta.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAlertRuleSubscribesResponseUnmarshaller {

	public static QueryRmsAlertRuleSubscribesResponse unmarshall(QueryRmsAlertRuleSubscribesResponse queryRmsAlertRuleSubscribesResponse, UnmarshallerContext _ctx) {
		
		queryRmsAlertRuleSubscribesResponse.setRequestId(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.RequestId"));
		queryRmsAlertRuleSubscribesResponse.setResultCode(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.ResultCode"));
		queryRmsAlertRuleSubscribesResponse.setResultMessage(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.ResultMessage"));

		Response response = new Response();

		Meta meta = new Meta();

		Page page = new Page();
		page.setLimit(_ctx.longValue("QueryRmsAlertRuleSubscribesResponse.Response.Meta.Page.Limit"));
		page.setOffset(_ctx.longValue("QueryRmsAlertRuleSubscribesResponse.Response.Meta.Page.Offset"));
		page.setTotalSize(_ctx.longValue("QueryRmsAlertRuleSubscribesResponse.Response.Meta.Page.TotalSize"));
		meta.setPage(page);
		response.setMeta(meta);

		List<EntitiesItem> entities = new ArrayList<EntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAlertRuleSubscribesResponse.Response.Entities.Length"); i++) {
			EntitiesItem entitiesItem = new EntitiesItem();

			Entity entity = new Entity();
			entity.setId(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.Response.Entities["+ i +"].Entity.Id"));
			entity.setMonitorTargetType(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.Response.Entities["+ i +"].Entity.MonitorTargetType"));
			entity.setProjectId(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.Response.Entities["+ i +"].Entity.ProjectId"));
			entity.setSubscriberId(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.Response.Entities["+ i +"].Entity.SubscriberId"));
			entity.setSubscriberLoginName(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.Response.Entities["+ i +"].Entity.SubscriberLoginName"));
			entity.setSubscriberType(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.Response.Entities["+ i +"].Entity.SubscriberType"));
			entity.setSubscriptionTargetId(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.Response.Entities["+ i +"].Entity.SubscriptionTargetId"));
			entity.setSubscriptionTargetType(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.Response.Entities["+ i +"].Entity.SubscriptionTargetType"));
			entity.setTenantId(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.Response.Entities["+ i +"].Entity.TenantId"));
			entity.setWorkspaceId(_ctx.stringValue("QueryRmsAlertRuleSubscribesResponse.Response.Entities["+ i +"].Entity.WorkspaceId"));
			entitiesItem.setEntity(entity);

			entities.add(entitiesItem);
		}
		response.setEntities(entities);
		queryRmsAlertRuleSubscribesResponse.setResponse(response);
	 
	 	return queryRmsAlertRuleSubscribesResponse;
	}
}