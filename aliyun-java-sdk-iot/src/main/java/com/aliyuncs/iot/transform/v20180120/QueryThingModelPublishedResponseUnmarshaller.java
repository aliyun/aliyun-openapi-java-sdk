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

import com.aliyuncs.iot.model.v20180120.QueryThingModelPublishedResponse;
import com.aliyuncs.iot.model.v20180120.QueryThingModelPublishedResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryThingModelPublishedResponseUnmarshaller {

	public static QueryThingModelPublishedResponse unmarshall(QueryThingModelPublishedResponse queryThingModelPublishedResponse, UnmarshallerContext _ctx) {
		
		queryThingModelPublishedResponse.setRequestId(_ctx.stringValue("QueryThingModelPublishedResponse.RequestId"));
		queryThingModelPublishedResponse.setSuccess(_ctx.booleanValue("QueryThingModelPublishedResponse.Success"));
		queryThingModelPublishedResponse.setCode(_ctx.stringValue("QueryThingModelPublishedResponse.Code"));
		queryThingModelPublishedResponse.setErrorMessage(_ctx.stringValue("QueryThingModelPublishedResponse.ErrorMessage"));
		queryThingModelPublishedResponse.setProductKey(_ctx.stringValue("QueryThingModelPublishedResponse.ProductKey"));

		Data data = new Data();
		data.setThingModelJson(_ctx.stringValue("QueryThingModelPublishedResponse.Data.ThingModelJson"));
		queryThingModelPublishedResponse.setData(data);
	 
	 	return queryThingModelPublishedResponse;
	}
}