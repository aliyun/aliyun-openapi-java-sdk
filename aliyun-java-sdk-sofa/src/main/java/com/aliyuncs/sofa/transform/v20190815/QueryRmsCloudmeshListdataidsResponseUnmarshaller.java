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

import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshListdataidsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshListdataidsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshListdataidsResponse.Response.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsCloudmeshListdataidsResponseUnmarshaller {

	public static QueryRmsCloudmeshListdataidsResponse unmarshall(QueryRmsCloudmeshListdataidsResponse queryRmsCloudmeshListdataidsResponse, UnmarshallerContext _ctx) {
		
		queryRmsCloudmeshListdataidsResponse.setRequestId(_ctx.stringValue("QueryRmsCloudmeshListdataidsResponse.RequestId"));
		queryRmsCloudmeshListdataidsResponse.setResultCode(_ctx.stringValue("QueryRmsCloudmeshListdataidsResponse.ResultCode"));
		queryRmsCloudmeshListdataidsResponse.setResultMessage(_ctx.stringValue("QueryRmsCloudmeshListdataidsResponse.ResultMessage"));

		Response response = new Response();
		response.setErrMsg(_ctx.stringValue("QueryRmsCloudmeshListdataidsResponse.Response.ErrMsg"));
		response.setSuccess(_ctx.booleanValue("QueryRmsCloudmeshListdataidsResponse.Response.Success"));

		Data data = new Data();
		data.setTotalCnt(_ctx.stringValue("QueryRmsCloudmeshListdataidsResponse.Response.Data.TotalCnt"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshListdataidsResponse.Response.Data.Items.Length"); i++) {
			items.add(_ctx.stringValue("QueryRmsCloudmeshListdataidsResponse.Response.Data.Items["+ i +"]"));
		}
		data.setItems(items);
		response.setData(data);
		queryRmsCloudmeshListdataidsResponse.setResponse(response);
	 
	 	return queryRmsCloudmeshListdataidsResponse;
	}
}