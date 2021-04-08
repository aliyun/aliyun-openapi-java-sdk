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

import com.aliyuncs.aiccs.model.v20191015.QueryTaskDetailResponse;
import com.aliyuncs.aiccs.model.v20191015.QueryTaskDetailResponse.Data;
import com.aliyuncs.aiccs.model.v20191015.QueryTaskDetailResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskDetailResponseUnmarshaller {

	public static QueryTaskDetailResponse unmarshall(QueryTaskDetailResponse queryTaskDetailResponse, UnmarshallerContext _ctx) {
		
		queryTaskDetailResponse.setRequestId(_ctx.stringValue("QueryTaskDetailResponse.RequestId"));
		queryTaskDetailResponse.setMessage(_ctx.stringValue("QueryTaskDetailResponse.Message"));
		queryTaskDetailResponse.setHttpStatusCode(_ctx.stringValue("QueryTaskDetailResponse.HttpStatusCode"));
		queryTaskDetailResponse.setCode(_ctx.stringValue("QueryTaskDetailResponse.Code"));
		queryTaskDetailResponse.setSuccess(_ctx.stringValue("QueryTaskDetailResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.stringValue("QueryTaskDetailResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.stringValue("QueryTaskDetailResponse.Data.CurrentPage"));
		data.setTotalResults(_ctx.stringValue("QueryTaskDetailResponse.Data.TotalResults"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTaskDetailResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setStatus(_ctx.integerValue("QueryTaskDetailResponse.Data.List["+ i +"].Status"));
			listItem.setSkillGroup(_ctx.integerValue("QueryTaskDetailResponse.Data.List["+ i +"].SkillGroup"));
			listItem.setOutboundTaskId(_ctx.longValue("QueryTaskDetailResponse.Data.List["+ i +"].OutboundTaskId"));
			listItem.setPriority(_ctx.integerValue("QueryTaskDetailResponse.Data.List["+ i +"].Priority"));
			listItem.setOutboundNum(_ctx.integerValue("QueryTaskDetailResponse.Data.List["+ i +"].OutboundNum"));
			listItem.setGmtModified(_ctx.longValue("QueryTaskDetailResponse.Data.List["+ i +"].GmtModified"));
			listItem.setMemberId(_ctx.longValue("QueryTaskDetailResponse.Data.List["+ i +"].MemberId"));
			listItem.setBuId(_ctx.longValue("QueryTaskDetailResponse.Data.List["+ i +"].BuId"));
			listItem.setGmtCreate(_ctx.longValue("QueryTaskDetailResponse.Data.List["+ i +"].GmtCreate"));
			listItem.setEndReason(_ctx.integerValue("QueryTaskDetailResponse.Data.List["+ i +"].EndReason"));
			listItem.setServicerName(_ctx.stringValue("QueryTaskDetailResponse.Data.List["+ i +"].ServicerName"));
			listItem.setDnis(_ctx.stringValue("QueryTaskDetailResponse.Data.List["+ i +"].Dnis"));
			listItem.setExtAttrs(_ctx.stringValue("QueryTaskDetailResponse.Data.List["+ i +"].ExtAttrs"));
			listItem.setId(_ctx.integerValue("QueryTaskDetailResponse.Data.List["+ i +"].Id"));
			listItem.setDepartmentId(_ctx.longValue("QueryTaskDetailResponse.Data.List["+ i +"].DepartmentId"));
			listItem.setRetryTime(_ctx.stringValue("QueryTaskDetailResponse.Data.List["+ i +"].RetryTime"));
			listItem.setMemberName(_ctx.stringValue("QueryTaskDetailResponse.Data.List["+ i +"].MemberName"));
			listItem.setServicerId(_ctx.longValue("QueryTaskDetailResponse.Data.List["+ i +"].ServicerId"));
			listItem.setAni(_ctx.stringValue("QueryTaskDetailResponse.Data.List["+ i +"].Ani"));

			list.add(listItem);
		}
		data.setList(list);
		queryTaskDetailResponse.setData(data);
	 
	 	return queryTaskDetailResponse;
	}
}