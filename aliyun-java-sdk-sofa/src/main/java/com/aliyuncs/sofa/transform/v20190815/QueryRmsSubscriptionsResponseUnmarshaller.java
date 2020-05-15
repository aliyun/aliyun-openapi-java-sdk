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

import com.aliyuncs.sofa.model.v20190815.QueryRmsSubscriptionsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsSubscriptionsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsSubscriptionsResponse.Response.EntitiesItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsSubscriptionsResponse.Response.EntitiesItem.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsSubscriptionsResponse.Response.MetaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsSubscriptionsResponseUnmarshaller {

	public static QueryRmsSubscriptionsResponse unmarshall(QueryRmsSubscriptionsResponse queryRmsSubscriptionsResponse, UnmarshallerContext _ctx) {
		
		queryRmsSubscriptionsResponse.setRequestId(_ctx.stringValue("QueryRmsSubscriptionsResponse.RequestId"));
		queryRmsSubscriptionsResponse.setResultCode(_ctx.stringValue("QueryRmsSubscriptionsResponse.ResultCode"));
		queryRmsSubscriptionsResponse.setResultMessage(_ctx.stringValue("QueryRmsSubscriptionsResponse.ResultMessage"));

		Response response = new Response();
		response.setErrCode(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.ErrCode"));
		response.setErrMsg(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.ErrMsg"));
		response.setErrResolution(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.ErrResolution"));

		List<EntitiesItem> entities = new ArrayList<EntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsSubscriptionsResponse.Response.Entities.Length"); i++) {
			EntitiesItem entitiesItem = new EntitiesItem();

			Entity entity = new Entity();
			entity.setId(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.Entities["+ i +"].Entity.Id"));
			entity.setMonitorTargetType(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.Entities["+ i +"].Entity.MonitorTargetType"));
			entity.setProjectId(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.Entities["+ i +"].Entity.ProjectId"));
			entity.setSubscriberId(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.Entities["+ i +"].Entity.SubscriberId"));
			entity.setSubscriberLoginName(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.Entities["+ i +"].Entity.SubscriberLoginName"));
			entity.setSubscriberType(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.Entities["+ i +"].Entity.SubscriberType"));
			entity.setSubscriptionTargetId(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.Entities["+ i +"].Entity.SubscriptionTargetId"));
			entity.setSubscriptionTargetType(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.Entities["+ i +"].Entity.SubscriptionTargetType"));
			entity.setTenantId(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.Entities["+ i +"].Entity.TenantId"));
			entity.setWorkspaceId(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.Entities["+ i +"].Entity.WorkspaceId"));
			entitiesItem.setEntity(entity);

			entities.add(entitiesItem);
		}
		response.setEntities(entities);

		List<MetaItem> meta = new ArrayList<MetaItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsSubscriptionsResponse.Response.Meta.Length"); i++) {
			MetaItem metaItem = new MetaItem();
			metaItem.setKey(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.Meta["+ i +"].Key"));
			metaItem.setValue(_ctx.stringValue("QueryRmsSubscriptionsResponse.Response.Meta["+ i +"].Value"));

			meta.add(metaItem);
		}
		response.setMeta(meta);
		queryRmsSubscriptionsResponse.setResponse(response);
	 
	 	return queryRmsSubscriptionsResponse;
	}
}