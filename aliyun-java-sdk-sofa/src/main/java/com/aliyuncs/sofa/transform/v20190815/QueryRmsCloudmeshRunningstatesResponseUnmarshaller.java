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

import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshRunningstatesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshRunningstatesResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshRunningstatesResponse.Response.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsCloudmeshRunningstatesResponseUnmarshaller {

	public static QueryRmsCloudmeshRunningstatesResponse unmarshall(QueryRmsCloudmeshRunningstatesResponse queryRmsCloudmeshRunningstatesResponse, UnmarshallerContext _ctx) {
		
		queryRmsCloudmeshRunningstatesResponse.setRequestId(_ctx.stringValue("QueryRmsCloudmeshRunningstatesResponse.RequestId"));
		queryRmsCloudmeshRunningstatesResponse.setResultCode(_ctx.stringValue("QueryRmsCloudmeshRunningstatesResponse.ResultCode"));
		queryRmsCloudmeshRunningstatesResponse.setResultMessage(_ctx.stringValue("QueryRmsCloudmeshRunningstatesResponse.ResultMessage"));

		Response response = new Response();
		response.setErrMsg(_ctx.stringValue("QueryRmsCloudmeshRunningstatesResponse.Response.ErrMsg"));
		response.setSuccess(_ctx.booleanValue("QueryRmsCloudmeshRunningstatesResponse.Response.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshRunningstatesResponse.Response.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRunningCount(_ctx.stringValue("QueryRmsCloudmeshRunningstatesResponse.Response.Data["+ i +"].RunningCount"));
			dataItem.setStatus(_ctx.stringValue("QueryRmsCloudmeshRunningstatesResponse.Response.Data["+ i +"].Status"));
			dataItem.setTimer(_ctx.longValue("QueryRmsCloudmeshRunningstatesResponse.Response.Data["+ i +"].Timer"));

			data.add(dataItem);
		}
		response.setData(data);
		queryRmsCloudmeshRunningstatesResponse.setResponse(response);
	 
	 	return queryRmsCloudmeshRunningstatesResponse;
	}
}