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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryClientIdsResponse;
import com.aliyuncs.iot.model.v20180120.QueryClientIdsResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryClientIdsResponse.Data.DynamicRegClientId;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryClientIdsResponseUnmarshaller {

	public static QueryClientIdsResponse unmarshall(QueryClientIdsResponse queryClientIdsResponse, UnmarshallerContext _ctx) {
		
		queryClientIdsResponse.setRequestId(_ctx.stringValue("QueryClientIdsResponse.RequestId"));
		queryClientIdsResponse.setSuccess(_ctx.booleanValue("QueryClientIdsResponse.Success"));
		queryClientIdsResponse.setCode(_ctx.stringValue("QueryClientIdsResponse.Code"));
		queryClientIdsResponse.setErrorMessage(_ctx.stringValue("QueryClientIdsResponse.ErrorMessage"));

		Data data = new Data();
		data.setIotId(_ctx.stringValue("QueryClientIdsResponse.Data.IotId"));

		List<DynamicRegClientId> dynamicRegClientIds = new ArrayList<DynamicRegClientId>();
		for (int i = 0; i < _ctx.lengthValue("QueryClientIdsResponse.Data.DynamicRegClientIds.Length"); i++) {
			DynamicRegClientId dynamicRegClientId = new DynamicRegClientId();
			dynamicRegClientId.setClientId(_ctx.stringValue("QueryClientIdsResponse.Data.DynamicRegClientIds["+ i +"].ClientId"));
			dynamicRegClientId.setCreateTime(_ctx.longValue("QueryClientIdsResponse.Data.DynamicRegClientIds["+ i +"].CreateTime"));

			dynamicRegClientIds.add(dynamicRegClientId);
		}
		data.setDynamicRegClientIds(dynamicRegClientIds);
		queryClientIdsResponse.setData(data);
	 
	 	return queryClientIdsResponse;
	}
}