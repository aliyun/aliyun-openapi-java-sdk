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

import com.aliyuncs.sofa.model.v20190815.QueryRmsUsersResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsUsersResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsUsersResponse.Response.EntitieTestsItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsUsersResponse.Response.EntitiesItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsUsersResponse.Response.EntitiesItem.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsUsersResponse.Response.MetaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsUsersResponseUnmarshaller {

	public static QueryRmsUsersResponse unmarshall(QueryRmsUsersResponse queryRmsUsersResponse, UnmarshallerContext _ctx) {
		
		queryRmsUsersResponse.setRequestId(_ctx.stringValue("QueryRmsUsersResponse.RequestId"));
		queryRmsUsersResponse.setResultCode(_ctx.stringValue("QueryRmsUsersResponse.ResultCode"));
		queryRmsUsersResponse.setResultMessage(_ctx.stringValue("QueryRmsUsersResponse.ResultMessage"));

		Response response = new Response();

		List<EntitiesItem> entities = new ArrayList<EntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsUsersResponse.Response.Entities.Length"); i++) {
			EntitiesItem entitiesItem = new EntitiesItem();
			entitiesItem.setLayer(_ctx.stringValue("QueryRmsUsersResponse.Response.Entities["+ i +"].Layer"));

			Entity entity = new Entity();
			entity.setId(_ctx.stringValue("QueryRmsUsersResponse.Response.Entities["+ i +"].Entity.Id"));
			entity.setLoginName(_ctx.stringValue("QueryRmsUsersResponse.Response.Entities["+ i +"].Entity.LoginName"));
			entity.setMsgType(_ctx.stringValue("QueryRmsUsersResponse.Response.Entities["+ i +"].Entity.MsgType"));
			entity.setNickName(_ctx.stringValue("QueryRmsUsersResponse.Response.Entities["+ i +"].Entity.NickName"));
			entity.setRealName(_ctx.stringValue("QueryRmsUsersResponse.Response.Entities["+ i +"].Entity.RealName"));
			entity.setUserNumber(_ctx.stringValue("QueryRmsUsersResponse.Response.Entities["+ i +"].Entity.UserNumber"));
			entitiesItem.setEntity(entity);

			entities.add(entitiesItem);
		}
		response.setEntities(entities);

		List<EntitieTestsItem> entitieTests = new ArrayList<EntitieTestsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsUsersResponse.Response.EntitieTests.Length"); i++) {
			EntitieTestsItem entitieTestsItem = new EntitieTestsItem();
			entitieTestsItem.setId(_ctx.stringValue("QueryRmsUsersResponse.Response.EntitieTests["+ i +"].Id"));
			entitieTestsItem.setLoginName(_ctx.stringValue("QueryRmsUsersResponse.Response.EntitieTests["+ i +"].LoginName"));
			entitieTestsItem.setMsgType(_ctx.stringValue("QueryRmsUsersResponse.Response.EntitieTests["+ i +"].MsgType"));
			entitieTestsItem.setNickName(_ctx.stringValue("QueryRmsUsersResponse.Response.EntitieTests["+ i +"].NickName"));
			entitieTestsItem.setRealName(_ctx.stringValue("QueryRmsUsersResponse.Response.EntitieTests["+ i +"].RealName"));
			entitieTestsItem.setUserNumber(_ctx.stringValue("QueryRmsUsersResponse.Response.EntitieTests["+ i +"].UserNumber"));

			entitieTests.add(entitieTestsItem);
		}
		response.setEntitieTests(entitieTests);

		List<MetaItem> meta = new ArrayList<MetaItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsUsersResponse.Response.Meta.Length"); i++) {
			MetaItem metaItem = new MetaItem();
			metaItem.setKey(_ctx.stringValue("QueryRmsUsersResponse.Response.Meta["+ i +"].Key"));
			metaItem.setValue(_ctx.stringValue("QueryRmsUsersResponse.Response.Meta["+ i +"].Value"));

			meta.add(metaItem);
		}
		response.setMeta(meta);
		queryRmsUsersResponse.setResponse(response);
	 
	 	return queryRmsUsersResponse;
	}
}