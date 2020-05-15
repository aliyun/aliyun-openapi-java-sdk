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

import com.aliyuncs.sofa.model.v20190815.QueryRmsAllResourceGroupsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAllResourceGroupsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAllResourceGroupsResponse.Response.EntitiesItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAllResourceGroupsResponse.Response.EntitiesItem.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAllResourceGroupsResponse.Response.MetaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAllResourceGroupsResponseUnmarshaller {

	public static QueryRmsAllResourceGroupsResponse unmarshall(QueryRmsAllResourceGroupsResponse queryRmsAllResourceGroupsResponse, UnmarshallerContext _ctx) {
		
		queryRmsAllResourceGroupsResponse.setRequestId(_ctx.stringValue("QueryRmsAllResourceGroupsResponse.RequestId"));
		queryRmsAllResourceGroupsResponse.setResultCode(_ctx.stringValue("QueryRmsAllResourceGroupsResponse.ResultCode"));
		queryRmsAllResourceGroupsResponse.setResultMessage(_ctx.stringValue("QueryRmsAllResourceGroupsResponse.ResultMessage"));

		Response response = new Response();
		response.setErrCode(_ctx.stringValue("QueryRmsAllResourceGroupsResponse.Response.ErrCode"));
		response.setErrMsg(_ctx.stringValue("QueryRmsAllResourceGroupsResponse.Response.ErrMsg"));
		response.setErrResolution(_ctx.stringValue("QueryRmsAllResourceGroupsResponse.Response.ErrResolution"));

		List<EntitiesItem> entities = new ArrayList<EntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAllResourceGroupsResponse.Response.Entities.Length"); i++) {
			EntitiesItem entitiesItem = new EntitiesItem();

			Entity entity = new Entity();
			entity.setResId(_ctx.stringValue("QueryRmsAllResourceGroupsResponse.Response.Entities["+ i +"].Entity.ResId"));
			entity.setResName(_ctx.stringValue("QueryRmsAllResourceGroupsResponse.Response.Entities["+ i +"].Entity.ResName"));
			entitiesItem.setEntity(entity);

			entities.add(entitiesItem);
		}
		response.setEntities(entities);

		List<MetaItem> meta = new ArrayList<MetaItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAllResourceGroupsResponse.Response.Meta.Length"); i++) {
			MetaItem metaItem = new MetaItem();
			metaItem.setKey(_ctx.stringValue("QueryRmsAllResourceGroupsResponse.Response.Meta["+ i +"].Key"));
			metaItem.setValue(_ctx.stringValue("QueryRmsAllResourceGroupsResponse.Response.Meta["+ i +"].Value"));

			meta.add(metaItem);
		}
		response.setMeta(meta);
		queryRmsAllResourceGroupsResponse.setResponse(response);
	 
	 	return queryRmsAllResourceGroupsResponse;
	}
}