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

import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshListappserviceversionsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshListappserviceversionsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshListappserviceversionsResponse.Response.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsCloudmeshListappserviceversionsResponseUnmarshaller {

	public static QueryRmsCloudmeshListappserviceversionsResponse unmarshall(QueryRmsCloudmeshListappserviceversionsResponse queryRmsCloudmeshListappserviceversionsResponse, UnmarshallerContext _ctx) {
		
		queryRmsCloudmeshListappserviceversionsResponse.setRequestId(_ctx.stringValue("QueryRmsCloudmeshListappserviceversionsResponse.RequestId"));
		queryRmsCloudmeshListappserviceversionsResponse.setResultCode(_ctx.stringValue("QueryRmsCloudmeshListappserviceversionsResponse.ResultCode"));
		queryRmsCloudmeshListappserviceversionsResponse.setResultMessage(_ctx.stringValue("QueryRmsCloudmeshListappserviceversionsResponse.ResultMessage"));

		Response response = new Response();
		response.setErrMsg(_ctx.stringValue("QueryRmsCloudmeshListappserviceversionsResponse.Response.ErrMsg"));
		response.setSuccess(_ctx.booleanValue("QueryRmsCloudmeshListappserviceversionsResponse.Response.Success"));

		Data data = new Data();
		data.setTotalCnt(_ctx.stringValue("QueryRmsCloudmeshListappserviceversionsResponse.Response.Data.TotalCnt"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshListappserviceversionsResponse.Response.Data.Items.Length"); i++) {
			items.add(_ctx.stringValue("QueryRmsCloudmeshListappserviceversionsResponse.Response.Data.Items["+ i +"]"));
		}
		data.setItems(items);
		response.setData(data);
		queryRmsCloudmeshListappserviceversionsResponse.setResponse(response);
	 
	 	return queryRmsCloudmeshListappserviceversionsResponse;
	}
}