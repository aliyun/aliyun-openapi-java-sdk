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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.QueryFunctionModuleResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.QueryFunctionModuleResponse.Data;
import com.aliyuncs.retailadvqa_public.model.v20200515.QueryFunctionModuleResponse.Data.FunctionModuleListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFunctionModuleResponseUnmarshaller {

	public static QueryFunctionModuleResponse unmarshall(QueryFunctionModuleResponse queryFunctionModuleResponse, UnmarshallerContext _ctx) {
		
		queryFunctionModuleResponse.setRequestId(_ctx.stringValue("QueryFunctionModuleResponse.RequestId"));
		queryFunctionModuleResponse.setErrorCode(_ctx.stringValue("QueryFunctionModuleResponse.ErrorCode"));
		queryFunctionModuleResponse.setErrorDesc(_ctx.stringValue("QueryFunctionModuleResponse.ErrorDesc"));
		queryFunctionModuleResponse.setSuccess(_ctx.booleanValue("QueryFunctionModuleResponse.Success"));
		queryFunctionModuleResponse.setTraceId(_ctx.stringValue("QueryFunctionModuleResponse.TraceId"));
		queryFunctionModuleResponse.setExStack(_ctx.stringValue("QueryFunctionModuleResponse.ExStack"));

		Data data = new Data();
		data.setOrganizationId(_ctx.stringValue("QueryFunctionModuleResponse.Data.OrganizationId"));
		data.setExpiredDate(_ctx.stringValue("QueryFunctionModuleResponse.Data.ExpiredDate"));

		List<FunctionModuleListItem> functionModuleList = new ArrayList<FunctionModuleListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFunctionModuleResponse.Data.FunctionModuleList.Length"); i++) {
			FunctionModuleListItem functionModuleListItem = new FunctionModuleListItem();
			functionModuleListItem.setModuleCode(_ctx.stringValue("QueryFunctionModuleResponse.Data.FunctionModuleList["+ i +"].ModuleCode"));
			functionModuleListItem.setModuleName(_ctx.stringValue("QueryFunctionModuleResponse.Data.FunctionModuleList["+ i +"].ModuleName"));

			functionModuleList.add(functionModuleListItem);
		}
		data.setFunctionModuleList(functionModuleList);
		queryFunctionModuleResponse.setData(data);
	 
	 	return queryFunctionModuleResponse;
	}
}