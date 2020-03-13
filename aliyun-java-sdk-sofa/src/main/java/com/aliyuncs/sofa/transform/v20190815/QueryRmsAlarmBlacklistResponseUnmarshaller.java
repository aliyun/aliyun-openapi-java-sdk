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

import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmBlacklistResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmBlacklistResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmBlacklistResponse.Response.EntitiesItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmBlacklistResponse.Response.EntitiesItem.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmBlacklistResponse.Response.MetaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAlarmBlacklistResponseUnmarshaller {

	public static QueryRmsAlarmBlacklistResponse unmarshall(QueryRmsAlarmBlacklistResponse queryRmsAlarmBlacklistResponse, UnmarshallerContext _ctx) {
		
		queryRmsAlarmBlacklistResponse.setRequestId(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.RequestId"));
		queryRmsAlarmBlacklistResponse.setResultCode(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.ResultCode"));
		queryRmsAlarmBlacklistResponse.setResultMessage(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.ResultMessage"));

		Response response = new Response();

		List<EntitiesItem> entities = new ArrayList<EntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAlarmBlacklistResponse.Response.Entities.Length"); i++) {
			EntitiesItem entitiesItem = new EntitiesItem();
			entitiesItem.setLayer(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Layer"));

			Entity entity = new Entity();
			entity.setApplyTargetId(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.ApplyTargetId"));
			entity.setId(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.Id"));
			entity.setResId(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.ResId"));
			entity.setResName(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.ResName"));
			entity.setResType(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.ResType"));
			entity.setRuleType(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.RuleType"));
			entity.setTenantId(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.TenantId"));
			entity.setUserId(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.UserId"));
			entity.setUserName(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.UserName"));
			entity.setUtcCreated(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.UtcCreated"));
			entity.setUtcModified(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.UtcModified"));
			entity.setValidEndTime(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.ValidEndTime"));
			entity.setValidStartTime(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.ValidStartTime"));
			entity.setWorkspaceId(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Entities["+ i +"].Entity.WorkspaceId"));
			entitiesItem.setEntity(entity);

			entities.add(entitiesItem);
		}
		response.setEntities(entities);

		List<MetaItem> meta = new ArrayList<MetaItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAlarmBlacklistResponse.Response.Meta.Length"); i++) {
			MetaItem metaItem = new MetaItem();
			metaItem.setKey(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Meta["+ i +"].Key"));
			metaItem.setValue(_ctx.stringValue("QueryRmsAlarmBlacklistResponse.Response.Meta["+ i +"].Value"));

			meta.add(metaItem);
		}
		response.setMeta(meta);
		queryRmsAlarmBlacklistResponse.setResponse(response);
	 
	 	return queryRmsAlarmBlacklistResponse;
	}
}