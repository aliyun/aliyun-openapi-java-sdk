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

import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSidecarcountResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSidecarcountResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshSidecarcountResponse.Response.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsCloudmeshSidecarcountResponseUnmarshaller {

	public static QueryRmsCloudmeshSidecarcountResponse unmarshall(QueryRmsCloudmeshSidecarcountResponse queryRmsCloudmeshSidecarcountResponse, UnmarshallerContext _ctx) {
		
		queryRmsCloudmeshSidecarcountResponse.setRequestId(_ctx.stringValue("QueryRmsCloudmeshSidecarcountResponse.RequestId"));
		queryRmsCloudmeshSidecarcountResponse.setResultCode(_ctx.stringValue("QueryRmsCloudmeshSidecarcountResponse.ResultCode"));
		queryRmsCloudmeshSidecarcountResponse.setResultMessage(_ctx.stringValue("QueryRmsCloudmeshSidecarcountResponse.ResultMessage"));

		Response response = new Response();
		response.setErrMsg(_ctx.stringValue("QueryRmsCloudmeshSidecarcountResponse.Response.ErrMsg"));
		response.setSuccess(_ctx.booleanValue("QueryRmsCloudmeshSidecarcountResponse.Response.Success"));

		Data data = new Data();
		data.setAllCount(_ctx.stringValue("QueryRmsCloudmeshSidecarcountResponse.Response.Data.AllCount"));
		response.setData(data);
		queryRmsCloudmeshSidecarcountResponse.setResponse(response);
	 
	 	return queryRmsCloudmeshSidecarcountResponse;
	}
}