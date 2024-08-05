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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.QueryCommercialUsageResponse;
import com.aliyuncs.arms.model.v20190808.QueryCommercialUsageResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCommercialUsageResponseUnmarshaller {

	public static QueryCommercialUsageResponse unmarshall(QueryCommercialUsageResponse queryCommercialUsageResponse, UnmarshallerContext _ctx) {
		
		queryCommercialUsageResponse.setRequestId(_ctx.stringValue("QueryCommercialUsageResponse.RequestId"));
		queryCommercialUsageResponse.setCode(_ctx.integerValue("QueryCommercialUsageResponse.Code"));
		queryCommercialUsageResponse.setHttpStatusCode(_ctx.integerValue("QueryCommercialUsageResponse.HttpStatusCode"));
		queryCommercialUsageResponse.setMessage(_ctx.stringValue("QueryCommercialUsageResponse.Message"));
		queryCommercialUsageResponse.setSuccess(_ctx.booleanValue("QueryCommercialUsageResponse.Success"));

		Data data = new Data();
		data.setComplete(_ctx.booleanValue("QueryCommercialUsageResponse.Data.Complete"));

		List<Map<Object, Object>> items = _ctx.listMapValue("QueryCommercialUsageResponse.Data.Items");
		data.setItems(items);
		queryCommercialUsageResponse.setData(data);
	 
	 	return queryCommercialUsageResponse;
	}
}