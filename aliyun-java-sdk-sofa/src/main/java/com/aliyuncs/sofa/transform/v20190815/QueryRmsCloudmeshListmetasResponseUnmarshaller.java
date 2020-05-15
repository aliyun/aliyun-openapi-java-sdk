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

import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshListmetasResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshListmetasResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshListmetasResponse.Response.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsCloudmeshListmetasResponseUnmarshaller {

	public static QueryRmsCloudmeshListmetasResponse unmarshall(QueryRmsCloudmeshListmetasResponse queryRmsCloudmeshListmetasResponse, UnmarshallerContext _ctx) {
		
		queryRmsCloudmeshListmetasResponse.setRequestId(_ctx.stringValue("QueryRmsCloudmeshListmetasResponse.RequestId"));
		queryRmsCloudmeshListmetasResponse.setResultCode(_ctx.stringValue("QueryRmsCloudmeshListmetasResponse.ResultCode"));
		queryRmsCloudmeshListmetasResponse.setResultMessage(_ctx.stringValue("QueryRmsCloudmeshListmetasResponse.ResultMessage"));

		Response response = new Response();
		response.setErrMsg(_ctx.stringValue("QueryRmsCloudmeshListmetasResponse.Response.ErrMsg"));
		response.setSuccess(_ctx.booleanValue("QueryRmsCloudmeshListmetasResponse.Response.Success"));

		Data data = new Data();
		data.setTotalCnt(_ctx.stringValue("QueryRmsCloudmeshListmetasResponse.Response.Data.TotalCnt"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshListmetasResponse.Response.Data.Items.Length"); i++) {
			items.add(_ctx.stringValue("QueryRmsCloudmeshListmetasResponse.Response.Data.Items["+ i +"]"));
		}
		data.setItems(items);
		response.setData(data);
		queryRmsCloudmeshListmetasResponse.setResponse(response);
	 
	 	return queryRmsCloudmeshListmetasResponse;
	}
}