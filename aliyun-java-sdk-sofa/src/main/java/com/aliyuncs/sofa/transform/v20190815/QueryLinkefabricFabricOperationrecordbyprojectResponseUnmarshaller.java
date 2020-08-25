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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricOperationrecordbyprojectResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricOperationrecordbyprojectResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricOperationrecordbyprojectResponseUnmarshaller {

	public static QueryLinkefabricFabricOperationrecordbyprojectResponse unmarshall(QueryLinkefabricFabricOperationrecordbyprojectResponse queryLinkefabricFabricOperationrecordbyprojectResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricOperationrecordbyprojectResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricOperationrecordbyprojectResponse.RequestId"));
		queryLinkefabricFabricOperationrecordbyprojectResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricOperationrecordbyprojectResponse.ResultCode"));
		queryLinkefabricFabricOperationrecordbyprojectResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricOperationrecordbyprojectResponse.ResultMessage"));
		queryLinkefabricFabricOperationrecordbyprojectResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricOperationrecordbyprojectResponse.Message"));
		queryLinkefabricFabricOperationrecordbyprojectResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricOperationrecordbyprojectResponse.ResponseStatusCode"));
		queryLinkefabricFabricOperationrecordbyprojectResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricOperationrecordbyprojectResponse.Success"));

		Data data = new Data();
		data.setCount(_ctx.longValue("QueryLinkefabricFabricOperationrecordbyprojectResponse.Data.Count"));
		data.setStart(_ctx.longValue("QueryLinkefabricFabricOperationrecordbyprojectResponse.Data.Start"));
		data.setTotal(_ctx.longValue("QueryLinkefabricFabricOperationrecordbyprojectResponse.Data.Total"));

		List<String> operationRecordDoList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricOperationrecordbyprojectResponse.Data.OperationRecordDoList.Length"); i++) {
			operationRecordDoList.add(_ctx.stringValue("QueryLinkefabricFabricOperationrecordbyprojectResponse.Data.OperationRecordDoList["+ i +"]"));
		}
		data.setOperationRecordDoList(operationRecordDoList);
		queryLinkefabricFabricOperationrecordbyprojectResponse.setData(data);
	 
	 	return queryLinkefabricFabricOperationrecordbyprojectResponse;
	}
}