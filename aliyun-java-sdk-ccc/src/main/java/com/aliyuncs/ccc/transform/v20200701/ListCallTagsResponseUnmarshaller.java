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

import com.aliyuncs.ccc.model.v20200701.ListCallTagsResponse;
import com.aliyuncs.ccc.model.v20200701.ListCallTagsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListCallTagsResponse.Data.CallTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCallTagsResponseUnmarshaller {

	public static ListCallTagsResponse unmarshall(ListCallTagsResponse listCallTagsResponse, UnmarshallerContext _ctx) {
		
		listCallTagsResponse.setRequestId(_ctx.stringValue("ListCallTagsResponse.RequestId"));
		listCallTagsResponse.setHttpStatusCode(_ctx.integerValue("ListCallTagsResponse.HttpStatusCode"));
		listCallTagsResponse.setCode(_ctx.stringValue("ListCallTagsResponse.Code"));
		listCallTagsResponse.setMessage(_ctx.stringValue("ListCallTagsResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListCallTagsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListCallTagsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListCallTagsResponse.Data.TotalCount"));

		List<CallTag> list = new ArrayList<CallTag>();
		for (int i = 0; i < _ctx.lengthValue("ListCallTagsResponse.Data.List.Length"); i++) {
			CallTag callTag = new CallTag();
			callTag.setInstanceId(_ctx.stringValue("ListCallTagsResponse.Data.List["+ i +"].InstanceId"));
			callTag.setTagName(_ctx.stringValue("ListCallTagsResponse.Data.List["+ i +"].TagName"));

			list.add(callTag);
		}
		data.setList(list);
		listCallTagsResponse.setData(data);
	 
	 	return listCallTagsResponse;
	}
}