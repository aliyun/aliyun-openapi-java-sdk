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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.QueryAreaMapResponse;
import com.aliyuncs.xrengine.model.v20221111.QueryAreaMapResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAreaMapResponseUnmarshaller {

	public static QueryAreaMapResponse unmarshall(QueryAreaMapResponse queryAreaMapResponse, UnmarshallerContext _ctx) {
		
		queryAreaMapResponse.setRequestId(_ctx.stringValue("QueryAreaMapResponse.RequestId"));
		queryAreaMapResponse.setSuccess(_ctx.booleanValue("QueryAreaMapResponse.Success"));
		queryAreaMapResponse.setCode(_ctx.stringValue("QueryAreaMapResponse.Code"));
		queryAreaMapResponse.setMessage(_ctx.stringValue("QueryAreaMapResponse.Message"));
		queryAreaMapResponse.setErrorName(_ctx.stringValue("QueryAreaMapResponse.ErrorName"));
		queryAreaMapResponse.setHttpCode(_ctx.integerValue("QueryAreaMapResponse.HttpCode"));

		Data data = new Data();
		data.setId(_ctx.longValue("QueryAreaMapResponse.Data.Id"));
		data.setName(_ctx.stringValue("QueryAreaMapResponse.Data.Name"));
		data.setMapType(_ctx.stringValue("QueryAreaMapResponse.Data.MapType"));
		data.setExtInfo(_ctx.stringValue("QueryAreaMapResponse.Data.ExtInfo"));
		data.setStatus(_ctx.stringValue("QueryAreaMapResponse.Data.Status"));
		data.setNote(_ctx.stringValue("QueryAreaMapResponse.Data.Note"));
		data.setD3Oss(_ctx.stringValue("QueryAreaMapResponse.Data.D3Oss"));
		data.setLocationOss(_ctx.stringValue("QueryAreaMapResponse.Data.LocationOss"));
		queryAreaMapResponse.setData(data);
	 
	 	return queryAreaMapResponse;
	}
}