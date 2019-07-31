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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryUserOmsDataResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryUserOmsDataResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserOmsDataResponseUnmarshaller {

	public static QueryUserOmsDataResponse unmarshall(QueryUserOmsDataResponse queryUserOmsDataResponse, UnmarshallerContext _ctx) {
		
		queryUserOmsDataResponse.setRequestId(_ctx.stringValue("QueryUserOmsDataResponse.RequestId"));
		queryUserOmsDataResponse.setSuccess(_ctx.booleanValue("QueryUserOmsDataResponse.Success"));
		queryUserOmsDataResponse.setCode(_ctx.stringValue("QueryUserOmsDataResponse.Code"));
		queryUserOmsDataResponse.setMessage(_ctx.stringValue("QueryUserOmsDataResponse.Message"));

		Data data = new Data();
		data.setMarker(_ctx.stringValue("QueryUserOmsDataResponse.Data.Marker"));
		data.setHostId(_ctx.stringValue("QueryUserOmsDataResponse.Data.HostId"));

		List<Map<Object, Object>> omsData = _ctx.listMapValue("QueryUserOmsDataResponse.Data.OmsData");
		data.setOmsData(omsData);
		queryUserOmsDataResponse.setData(data);
	 
	 	return queryUserOmsDataResponse;
	}
}