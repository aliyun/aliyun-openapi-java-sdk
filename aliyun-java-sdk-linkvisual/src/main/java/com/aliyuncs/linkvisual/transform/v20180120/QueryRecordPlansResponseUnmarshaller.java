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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlansResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlansResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlansResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRecordPlansResponseUnmarshaller {

	public static QueryRecordPlansResponse unmarshall(QueryRecordPlansResponse queryRecordPlansResponse, UnmarshallerContext _ctx) {
		
		queryRecordPlansResponse.setRequestId(_ctx.stringValue("QueryRecordPlansResponse.RequestId"));
		queryRecordPlansResponse.setSuccess(_ctx.booleanValue("QueryRecordPlansResponse.Success"));
		queryRecordPlansResponse.setErrorMessage(_ctx.stringValue("QueryRecordPlansResponse.ErrorMessage"));
		queryRecordPlansResponse.setCode(_ctx.stringValue("QueryRecordPlansResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryRecordPlansResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryRecordPlansResponse.Data.PageSize"));
		data.setPage(_ctx.integerValue("QueryRecordPlansResponse.Data.Page"));
		data.setPageCount(_ctx.integerValue("QueryRecordPlansResponse.Data.PageCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRecordPlansResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setPlanId(_ctx.stringValue("QueryRecordPlansResponse.Data.List["+ i +"].PlanId"));
			listItem.setName(_ctx.stringValue("QueryRecordPlansResponse.Data.List["+ i +"].Name"));
			listItem.setTemplateId(_ctx.stringValue("QueryRecordPlansResponse.Data.List["+ i +"].TemplateId"));

			list.add(listItem);
		}
		data.setList(list);
		queryRecordPlansResponse.setData(data);
	 
	 	return queryRecordPlansResponse;
	}
}