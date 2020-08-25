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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricTaskinfoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricTaskinfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricTaskinfoResponseUnmarshaller {

	public static QueryLinkefabricFabricTaskinfoResponse unmarshall(QueryLinkefabricFabricTaskinfoResponse queryLinkefabricFabricTaskinfoResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricTaskinfoResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricTaskinfoResponse.RequestId"));
		queryLinkefabricFabricTaskinfoResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricTaskinfoResponse.ResultCode"));
		queryLinkefabricFabricTaskinfoResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricTaskinfoResponse.ResultMessage"));
		queryLinkefabricFabricTaskinfoResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricTaskinfoResponse.Message"));
		queryLinkefabricFabricTaskinfoResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricTaskinfoResponse.ResponseStatusCode"));
		queryLinkefabricFabricTaskinfoResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricTaskinfoResponse.Success"));

		Data data = new Data();
		data.setCount(_ctx.longValue("QueryLinkefabricFabricTaskinfoResponse.Data.Count"));
		data.setStart(_ctx.longValue("QueryLinkefabricFabricTaskinfoResponse.Data.Start"));
		data.setTotal(_ctx.longValue("QueryLinkefabricFabricTaskinfoResponse.Data.Total"));

		List<String> taskDoList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricTaskinfoResponse.Data.TaskDoList.Length"); i++) {
			taskDoList.add(_ctx.stringValue("QueryLinkefabricFabricTaskinfoResponse.Data.TaskDoList["+ i +"]"));
		}
		data.setTaskDoList(taskDoList);
		queryLinkefabricFabricTaskinfoResponse.setData(data);
	 
	 	return queryLinkefabricFabricTaskinfoResponse;
	}
}