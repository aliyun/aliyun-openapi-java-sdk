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

import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlansResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlansResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlansResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEventRecordPlansResponseUnmarshaller {

	public static QueryEventRecordPlansResponse unmarshall(QueryEventRecordPlansResponse queryEventRecordPlansResponse, UnmarshallerContext _ctx) {
		
		queryEventRecordPlansResponse.setRequestId(_ctx.stringValue("QueryEventRecordPlansResponse.RequestId"));
		queryEventRecordPlansResponse.setSuccess(_ctx.booleanValue("QueryEventRecordPlansResponse.Success"));
		queryEventRecordPlansResponse.setErrorMessage(_ctx.stringValue("QueryEventRecordPlansResponse.ErrorMessage"));
		queryEventRecordPlansResponse.setCode(_ctx.stringValue("QueryEventRecordPlansResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryEventRecordPlansResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryEventRecordPlansResponse.Data.PageSize"));
		data.setPage(_ctx.integerValue("QueryEventRecordPlansResponse.Data.Page"));
		data.setPageCount(_ctx.integerValue("QueryEventRecordPlansResponse.Data.PageCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryEventRecordPlansResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setEventType(_ctx.stringValue("QueryEventRecordPlansResponse.Data.List["+ i +"].EventType"));
			listItem.setPlanId(_ctx.stringValue("QueryEventRecordPlansResponse.Data.List["+ i +"].PlanId"));
			listItem.setName(_ctx.stringValue("QueryEventRecordPlansResponse.Data.List["+ i +"].Name"));
			listItem.setTemplateId(_ctx.stringValue("QueryEventRecordPlansResponse.Data.List["+ i +"].TemplateId"));
			listItem.setPreRecordDuration(_ctx.integerValue("QueryEventRecordPlansResponse.Data.List["+ i +"].PreRecordDuration"));
			listItem.setRecordDuration(_ctx.integerValue("QueryEventRecordPlansResponse.Data.List["+ i +"].RecordDuration"));

			list.add(listItem);
		}
		data.setList(list);
		queryEventRecordPlansResponse.setData(data);
	 
	 	return queryEventRecordPlansResponse;
	}
}