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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.QueryOutboundTaskResponse;
import com.aliyuncs.aiccs.model.v20191015.QueryOutboundTaskResponse.Data;
import com.aliyuncs.aiccs.model.v20191015.QueryOutboundTaskResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOutboundTaskResponseUnmarshaller {

	public static QueryOutboundTaskResponse unmarshall(QueryOutboundTaskResponse queryOutboundTaskResponse, UnmarshallerContext _ctx) {
		
		queryOutboundTaskResponse.setRequestId(_ctx.stringValue("QueryOutboundTaskResponse.RequestId"));
		queryOutboundTaskResponse.setCode(_ctx.stringValue("QueryOutboundTaskResponse.Code"));
		queryOutboundTaskResponse.setSuccess(_ctx.stringValue("QueryOutboundTaskResponse.Success"));
		queryOutboundTaskResponse.setMessage(_ctx.stringValue("QueryOutboundTaskResponse.Message"));
		queryOutboundTaskResponse.setHttpStatusCode(_ctx.stringValue("QueryOutboundTaskResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPageSize(_ctx.stringValue("QueryOutboundTaskResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.stringValue("QueryOutboundTaskResponse.Data.CurrentPage"));
		data.setTotalResults(_ctx.stringValue("QueryOutboundTaskResponse.Data.TotalResults"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOutboundTaskResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.longValue("QueryOutboundTaskResponse.Data.List["+ i +"].Id"));
			listItem.setGmtCreate(_ctx.longValue("QueryOutboundTaskResponse.Data.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.longValue("QueryOutboundTaskResponse.Data.List["+ i +"].GmtModified"));
			listItem.setName(_ctx.stringValue("QueryOutboundTaskResponse.Data.List["+ i +"].Name"));
			listItem.setDescription(_ctx.stringValue("QueryOutboundTaskResponse.Data.List["+ i +"].Description"));
			listItem.setStartDate(_ctx.stringValue("QueryOutboundTaskResponse.Data.List["+ i +"].StartDate"));
			listItem.setEndDate(_ctx.stringValue("QueryOutboundTaskResponse.Data.List["+ i +"].EndDate"));
			listItem.setStartTime(_ctx.stringValue("QueryOutboundTaskResponse.Data.List["+ i +"].StartTime"));
			listItem.setEndTime(_ctx.stringValue("QueryOutboundTaskResponse.Data.List["+ i +"].EndTime"));
			listItem.setRetryTime(_ctx.integerValue("QueryOutboundTaskResponse.Data.List["+ i +"].RetryTime"));
			listItem.setRetryInterval(_ctx.integerValue("QueryOutboundTaskResponse.Data.List["+ i +"].RetryInterval"));
			listItem.setSkillGroup(_ctx.longValue("QueryOutboundTaskResponse.Data.List["+ i +"].SkillGroup"));
			listItem.setCallerNum(_ctx.stringValue("QueryOutboundTaskResponse.Data.List["+ i +"].CallerNum"));
			listItem.setStatus(_ctx.integerValue("QueryOutboundTaskResponse.Data.List["+ i +"].Status"));
			listItem.setExtAttrs(_ctx.stringValue("QueryOutboundTaskResponse.Data.List["+ i +"].ExtAttrs"));
			listItem.setGroupName(_ctx.stringValue("QueryOutboundTaskResponse.Data.List["+ i +"].GroupName"));
			listItem.setModel(_ctx.integerValue("QueryOutboundTaskResponse.Data.List["+ i +"].Model"));
			listItem.setCreator(_ctx.stringValue("QueryOutboundTaskResponse.Data.List["+ i +"].Creator"));
			listItem.setModifier(_ctx.stringValue("QueryOutboundTaskResponse.Data.List["+ i +"].Modifier"));
			listItem.setBuId(_ctx.longValue("QueryOutboundTaskResponse.Data.List["+ i +"].BuId"));
			listItem.setType(_ctx.integerValue("QueryOutboundTaskResponse.Data.List["+ i +"].Type"));
			listItem.setDepartmentId(_ctx.longValue("QueryOutboundTaskResponse.Data.List["+ i +"].DepartmentId"));

			list.add(listItem);
		}
		data.setList(list);
		queryOutboundTaskResponse.setData(data);
	 
	 	return queryOutboundTaskResponse;
	}
}