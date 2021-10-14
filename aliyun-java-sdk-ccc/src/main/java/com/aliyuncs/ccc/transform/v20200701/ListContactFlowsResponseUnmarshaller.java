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

import com.aliyuncs.ccc.model.v20200701.ListContactFlowsResponse;
import com.aliyuncs.ccc.model.v20200701.ListContactFlowsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListContactFlowsResponse.Data.ContactFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListContactFlowsResponseUnmarshaller {

	public static ListContactFlowsResponse unmarshall(ListContactFlowsResponse listContactFlowsResponse, UnmarshallerContext _ctx) {
		
		listContactFlowsResponse.setRequestId(_ctx.stringValue("ListContactFlowsResponse.RequestId"));
		listContactFlowsResponse.setCode(_ctx.stringValue("ListContactFlowsResponse.Code"));
		listContactFlowsResponse.setHttpStatusCode(_ctx.integerValue("ListContactFlowsResponse.HttpStatusCode"));
		listContactFlowsResponse.setMessage(_ctx.stringValue("ListContactFlowsResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListContactFlowsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListContactFlowsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListContactFlowsResponse.Data.TotalCount"));

		List<ContactFlow> list = new ArrayList<ContactFlow>();
		for (int i = 0; i < _ctx.lengthValue("ListContactFlowsResponse.Data.List.Length"); i++) {
			ContactFlow contactFlow = new ContactFlow();
			contactFlow.setContactFlowId(_ctx.stringValue("ListContactFlowsResponse.Data.List["+ i +"].ContactFlowId"));
			contactFlow.setCreatedTime(_ctx.stringValue("ListContactFlowsResponse.Data.List["+ i +"].CreatedTime"));
			contactFlow.setDefinition(_ctx.stringValue("ListContactFlowsResponse.Data.List["+ i +"].Definition"));
			contactFlow.setDescription(_ctx.stringValue("ListContactFlowsResponse.Data.List["+ i +"].Description"));
			contactFlow.setDraftId(_ctx.stringValue("ListContactFlowsResponse.Data.List["+ i +"].DraftId"));
			contactFlow.setEditor(_ctx.stringValue("ListContactFlowsResponse.Data.List["+ i +"].Editor"));
			contactFlow.setInstanceId(_ctx.stringValue("ListContactFlowsResponse.Data.List["+ i +"].InstanceId"));
			contactFlow.setName(_ctx.stringValue("ListContactFlowsResponse.Data.List["+ i +"].Name"));
			contactFlow.setPublished(_ctx.booleanValue("ListContactFlowsResponse.Data.List["+ i +"].Published"));
			contactFlow.setType(_ctx.stringValue("ListContactFlowsResponse.Data.List["+ i +"].Type"));
			contactFlow.setUpdatedTime(_ctx.stringValue("ListContactFlowsResponse.Data.List["+ i +"].UpdatedTime"));

			List<String> numberList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListContactFlowsResponse.Data.List["+ i +"].NumberList.Length"); j++) {
				numberList.add(_ctx.stringValue("ListContactFlowsResponse.Data.List["+ i +"].NumberList["+ j +"]"));
			}
			contactFlow.setNumberList(numberList);

			list.add(contactFlow);
		}
		data.setList(list);
		listContactFlowsResponse.setData(data);
	 
	 	return listContactFlowsResponse;
	}
}