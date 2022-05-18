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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.QuerySlotsResponse;
import com.aliyuncs.retailbot.model.v20210224.QuerySlotsResponse.Data;
import com.aliyuncs.retailbot.model.v20210224.QuerySlotsResponse.Data.ResultDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySlotsResponseUnmarshaller {

	public static QuerySlotsResponse unmarshall(QuerySlotsResponse querySlotsResponse, UnmarshallerContext _ctx) {
		
		querySlotsResponse.setRequestId(_ctx.stringValue("QuerySlotsResponse.RequestId"));
		querySlotsResponse.setSuccess(_ctx.booleanValue("QuerySlotsResponse.Success"));
		querySlotsResponse.setCode(_ctx.stringValue("QuerySlotsResponse.Code"));
		querySlotsResponse.setMessage(_ctx.stringValue("QuerySlotsResponse.Message"));
		querySlotsResponse.setHttpStatusCode(_ctx.integerValue("QuerySlotsResponse.HttpStatusCode"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("QuerySlotsResponse.Data.CurrentPage"));
		data.setTotalCount(_ctx.integerValue("QuerySlotsResponse.Data.TotalCount"));

		List<ResultDataItem> resultData = new ArrayList<ResultDataItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySlotsResponse.Data.ResultData.Length"); i++) {
			ResultDataItem resultDataItem = new ResultDataItem();
			resultDataItem.setId(_ctx.integerValue("QuerySlotsResponse.Data.ResultData["+ i +"].Id"));
			resultDataItem.setAlias(_ctx.stringValue("QuerySlotsResponse.Data.ResultData["+ i +"].Alias"));
			resultDataItem.setCategoryId(_ctx.integerValue("QuerySlotsResponse.Data.ResultData["+ i +"].CategoryId"));
			resultDataItem.setCategoryName(_ctx.stringValue("QuerySlotsResponse.Data.ResultData["+ i +"].CategoryName"));
			resultDataItem.setSource(_ctx.integerValue("QuerySlotsResponse.Data.ResultData["+ i +"].Source"));
			resultDataItem.setSourceName(_ctx.stringValue("QuerySlotsResponse.Data.ResultData["+ i +"].SourceName"));
			resultDataItem.setType(_ctx.integerValue("QuerySlotsResponse.Data.ResultData["+ i +"].Type"));
			resultDataItem.setTypeName(_ctx.stringValue("QuerySlotsResponse.Data.ResultData["+ i +"].TypeName"));
			resultDataItem.setDescription(_ctx.stringValue("QuerySlotsResponse.Data.ResultData["+ i +"].Description"));
			resultDataItem.setOwnStatus(_ctx.integerValue("QuerySlotsResponse.Data.ResultData["+ i +"].OwnStatus"));

			resultData.add(resultDataItem);
		}
		data.setResultData(resultData);
		querySlotsResponse.setData(data);
	 
	 	return querySlotsResponse;
	}
}