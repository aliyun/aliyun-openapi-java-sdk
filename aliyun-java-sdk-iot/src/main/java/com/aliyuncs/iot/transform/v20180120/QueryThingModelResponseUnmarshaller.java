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

import com.aliyuncs.iot.model.v20180120.QueryThingModelResponse;
import com.aliyuncs.iot.model.v20180120.QueryThingModelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryThingModelResponseUnmarshaller {

	public static QueryThingModelResponse unmarshall(QueryThingModelResponse queryThingModelResponse, UnmarshallerContext _ctx) {
		
		queryThingModelResponse.setRequestId(_ctx.stringValue("QueryThingModelResponse.RequestId"));
		queryThingModelResponse.setSuccess(_ctx.booleanValue("QueryThingModelResponse.Success"));
		queryThingModelResponse.setCode(_ctx.stringValue("QueryThingModelResponse.Code"));
		queryThingModelResponse.setErrorMessage(_ctx.stringValue("QueryThingModelResponse.ErrorMessage"));
		queryThingModelResponse.setProductKey(_ctx.stringValue("QueryThingModelResponse.ProductKey"));

		Data data = new Data();
		data.setThingModelJson(_ctx.stringValue("QueryThingModelResponse.Data.ThingModelJson"));
		queryThingModelResponse.setData(data);
	 
	 	return queryThingModelResponse;
	}
}