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

import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsinfoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsinfoResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsinfoResponse.Response.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsinfoResponse.Response.Entity.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAppviewAppsinfoResponseUnmarshaller {

	public static QueryRmsAppviewAppsinfoResponse unmarshall(QueryRmsAppviewAppsinfoResponse queryRmsAppviewAppsinfoResponse, UnmarshallerContext _ctx) {
		
		queryRmsAppviewAppsinfoResponse.setRequestId(_ctx.stringValue("QueryRmsAppviewAppsinfoResponse.RequestId"));
		queryRmsAppviewAppsinfoResponse.setResultCode(_ctx.stringValue("QueryRmsAppviewAppsinfoResponse.ResultCode"));
		queryRmsAppviewAppsinfoResponse.setResultMessage(_ctx.stringValue("QueryRmsAppviewAppsinfoResponse.ResultMessage"));

		Response response = new Response();

		Entity entity = new Entity();

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAppviewAppsinfoResponse.Response.Entity.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.stringValue("QueryRmsAppviewAppsinfoResponse.Response.Entity.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("QueryRmsAppviewAppsinfoResponse.Response.Entity.Data["+ i +"].Name"));
			dataItem.setUtcCreated(_ctx.stringValue("QueryRmsAppviewAppsinfoResponse.Response.Entity.Data["+ i +"].UtcCreated"));
			dataItem.setUtcModified(_ctx.stringValue("QueryRmsAppviewAppsinfoResponse.Response.Entity.Data["+ i +"].UtcModified"));

			data.add(dataItem);
		}
		entity.setData(data);
		response.setEntity(entity);
		queryRmsAppviewAppsinfoResponse.setResponse(response);
	 
	 	return queryRmsAppviewAppsinfoResponse;
	}
}