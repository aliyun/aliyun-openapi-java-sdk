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

import com.aliyuncs.sofa.model.v20190815.QueryCASUserResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCASUserResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCASUserResponseUnmarshaller {

	public static QueryCASUserResponse unmarshall(QueryCASUserResponse queryCASUserResponse, UnmarshallerContext _ctx) {
		
		queryCASUserResponse.setRequestId(_ctx.stringValue("QueryCASUserResponse.RequestId"));
		queryCASUserResponse.setResultCode(_ctx.stringValue("QueryCASUserResponse.ResultCode"));
		queryCASUserResponse.setResultMessage(_ctx.stringValue("QueryCASUserResponse.ResultMessage"));
		queryCASUserResponse.setPageNum(_ctx.longValue("QueryCASUserResponse.PageNum"));
		queryCASUserResponse.setPageSize(_ctx.longValue("QueryCASUserResponse.PageSize"));
		queryCASUserResponse.setTotalCount(_ctx.longValue("QueryCASUserResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCASUserResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCustomerId(_ctx.stringValue("QueryCASUserResponse.Data["+ i +"].CustomerId"));
			dataItem.setId(_ctx.stringValue("QueryCASUserResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("QueryCASUserResponse.Data["+ i +"].Name"));
			dataItem.setRealName(_ctx.stringValue("QueryCASUserResponse.Data["+ i +"].RealName"));
			dataItem.setType(_ctx.stringValue("QueryCASUserResponse.Data["+ i +"].Type"));
			dataItem.setUtcCreate(_ctx.stringValue("QueryCASUserResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("QueryCASUserResponse.Data["+ i +"].UtcModified"));

			data.add(dataItem);
		}
		queryCASUserResponse.setData(data);
	 
	 	return queryCASUserResponse;
	}
}