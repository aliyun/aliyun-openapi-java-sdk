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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListCasesResponse;
import com.aliyuncs.ccc.model.v20200701.ListCasesResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListCasesResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCasesResponseUnmarshaller {

	public static ListCasesResponse unmarshall(ListCasesResponse listCasesResponse, UnmarshallerContext _ctx) {
		
		listCasesResponse.setRequestId(_ctx.stringValue("ListCasesResponse.RequestId"));
		listCasesResponse.setMessage(_ctx.stringValue("ListCasesResponse.Message"));
		listCasesResponse.setHttpStatusCode(_ctx.longValue("ListCasesResponse.HttpStatusCode"));
		listCasesResponse.setCode(_ctx.stringValue("ListCasesResponse.Code"));
		listCasesResponse.setSuccess(_ctx.booleanValue("ListCasesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.longValue("ListCasesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("ListCasesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("ListCasesResponse.Data.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCasesResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setAbandonType(_ctx.stringValue("ListCasesResponse.Data.List["+ i +"].AbandonType"));
			listItem.setAttemptCount(_ctx.longValue("ListCasesResponse.Data.List["+ i +"].AttemptCount"));
			listItem.setExpandInfo(_ctx.stringValue("ListCasesResponse.Data.List["+ i +"].ExpandInfo"));
			listItem.setFailureReason(_ctx.stringValue("ListCasesResponse.Data.List["+ i +"].FailureReason"));
			listItem.setPhoneNumber(_ctx.stringValue("ListCasesResponse.Data.List["+ i +"].PhoneNumber"));
			listItem.setState(_ctx.stringValue("ListCasesResponse.Data.List["+ i +"].State"));
			listItem.setCaseId(_ctx.stringValue("ListCasesResponse.Data.List["+ i +"].CaseId"));
			listItem.setCustomVariables(_ctx.stringValue("ListCasesResponse.Data.List["+ i +"].CustomVariables"));

			list.add(listItem);
		}
		data.setList(list);
		listCasesResponse.setData(data);
	 
	 	return listCasesResponse;
	}
}