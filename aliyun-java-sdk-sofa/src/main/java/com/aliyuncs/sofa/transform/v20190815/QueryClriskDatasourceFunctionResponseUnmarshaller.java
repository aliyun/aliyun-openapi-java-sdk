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

import com.aliyuncs.sofa.model.v20190815.QueryClriskDatasourceFunctionResponse;
import com.aliyuncs.sofa.model.v20190815.QueryClriskDatasourceFunctionResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryClriskDatasourceFunctionResponseUnmarshaller {

	public static QueryClriskDatasourceFunctionResponse unmarshall(QueryClriskDatasourceFunctionResponse queryClriskDatasourceFunctionResponse, UnmarshallerContext _ctx) {
		
		queryClriskDatasourceFunctionResponse.setRequestId(_ctx.stringValue("QueryClriskDatasourceFunctionResponse.RequestId"));
		queryClriskDatasourceFunctionResponse.setResultCode(_ctx.stringValue("QueryClriskDatasourceFunctionResponse.ResultCode"));
		queryClriskDatasourceFunctionResponse.setResultMessage(_ctx.stringValue("QueryClriskDatasourceFunctionResponse.ResultMessage"));
		queryClriskDatasourceFunctionResponse.setPageNumber(_ctx.longValue("QueryClriskDatasourceFunctionResponse.PageNumber"));
		queryClriskDatasourceFunctionResponse.setPageSize(_ctx.longValue("QueryClriskDatasourceFunctionResponse.PageSize"));
		queryClriskDatasourceFunctionResponse.setPageCount(_ctx.longValue("QueryClriskDatasourceFunctionResponse.PageCount"));
		queryClriskDatasourceFunctionResponse.setTotalCount(_ctx.longValue("QueryClriskDatasourceFunctionResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryClriskDatasourceFunctionResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.stringValue("QueryClriskDatasourceFunctionResponse.Data["+ i +"].Id"));
			dataItem.setGmtCreate(_ctx.stringValue("QueryClriskDatasourceFunctionResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("QueryClriskDatasourceFunctionResponse.Data["+ i +"].GmtModified"));
			dataItem.setFunctionName(_ctx.stringValue("QueryClriskDatasourceFunctionResponse.Data["+ i +"].FunctionName"));
			dataItem.setFunctionSample(_ctx.stringValue("QueryClriskDatasourceFunctionResponse.Data["+ i +"].FunctionSample"));
			dataItem.setFunctionDesc(_ctx.stringValue("QueryClriskDatasourceFunctionResponse.Data["+ i +"].FunctionDesc"));

			data.add(dataItem);
		}
		queryClriskDatasourceFunctionResponse.setData(data);
	 
	 	return queryClriskDatasourceFunctionResponse;
	}
}