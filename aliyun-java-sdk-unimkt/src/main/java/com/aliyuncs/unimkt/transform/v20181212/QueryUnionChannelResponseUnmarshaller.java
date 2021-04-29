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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.QueryUnionChannelResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUnionChannelResponseUnmarshaller {

	public static QueryUnionChannelResponse unmarshall(QueryUnionChannelResponse queryUnionChannelResponse, UnmarshallerContext _ctx) {
		
		queryUnionChannelResponse.setRequestId(_ctx.stringValue("QueryUnionChannelResponse.RequestId"));
		queryUnionChannelResponse.setCode(_ctx.integerValue("QueryUnionChannelResponse.Code"));
		queryUnionChannelResponse.setSuccess(_ctx.booleanValue("QueryUnionChannelResponse.Success"));
		queryUnionChannelResponse.setErrorMsg(_ctx.stringValue("QueryUnionChannelResponse.ErrorMsg"));

		List<Map<Object, Object>> data = _ctx.listMapValue("QueryUnionChannelResponse.Data");
		queryUnionChannelResponse.setData(data);
	 
	 	return queryUnionChannelResponse;
	}
}