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

package com.aliyuncs.unimkt.transform.v20181207;

import com.aliyuncs.unimkt.model.v20181207.QueryWithPayResponse;
import com.aliyuncs.unimkt.model.v20181207.QueryWithPayResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWithPayResponseUnmarshaller {

	public static QueryWithPayResponse unmarshall(QueryWithPayResponse queryWithPayResponse, UnmarshallerContext _ctx) {
		
		queryWithPayResponse.setRequestId(_ctx.stringValue("QueryWithPayResponse.RequestId"));
		queryWithPayResponse.setStatus(_ctx.booleanValue("QueryWithPayResponse.Status"));
		queryWithPayResponse.setMsg(_ctx.stringValue("QueryWithPayResponse.Msg"));
		queryWithPayResponse.setErrorCode(_ctx.stringValue("QueryWithPayResponse.ErrorCode"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("QueryWithPayResponse.Data.Url"));
		data.setStatus(_ctx.booleanValue("QueryWithPayResponse.Data.Status"));
		data.setUnionAmount(_ctx.stringValue("QueryWithPayResponse.Data.UnionAmount"));
		queryWithPayResponse.setData(data);
	 
	 	return queryWithPayResponse;
	}
}