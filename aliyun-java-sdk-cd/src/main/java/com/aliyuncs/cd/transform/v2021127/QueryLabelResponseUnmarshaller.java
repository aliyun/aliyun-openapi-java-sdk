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

package com.aliyuncs.cd.transform.v2021127;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cd.model.v2021127.QueryLabelResponse;
import com.aliyuncs.cd.model.v2021127.QueryLabelResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLabelResponseUnmarshaller {

	public static QueryLabelResponse unmarshall(QueryLabelResponse queryLabelResponse, UnmarshallerContext _ctx) {
		
		queryLabelResponse.setRequestId(_ctx.stringValue("QueryLabelResponse.RequestId"));
		queryLabelResponse.setSuccess(_ctx.booleanValue("QueryLabelResponse.Success"));
		queryLabelResponse.setMessage(_ctx.stringValue("QueryLabelResponse.Message"));
		queryLabelResponse.setCode(_ctx.stringValue("QueryLabelResponse.Code"));
		queryLabelResponse.setHttpStatusCode(_ctx.integerValue("QueryLabelResponse.HttpStatusCode"));
		queryLabelResponse.setPageSize(_ctx.integerValue("QueryLabelResponse.PageSize"));
		queryLabelResponse.setPageNo(_ctx.integerValue("QueryLabelResponse.PageNo"));
		queryLabelResponse.setTotal(_ctx.integerValue("QueryLabelResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLabelResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCategory(_ctx.stringValue("QueryLabelResponse.Data["+ i +"].Category"));
			dataItem.setLabelId(_ctx.stringValue("QueryLabelResponse.Data["+ i +"].LabelId"));
			dataItem.setTitle(_ctx.stringValue("QueryLabelResponse.Data["+ i +"].Title"));
			dataItem.setLabel(_ctx.stringValue("QueryLabelResponse.Data["+ i +"].Label"));

			data.add(dataItem);
		}
		queryLabelResponse.setData(data);
	 
	 	return queryLabelResponse;
	}
}