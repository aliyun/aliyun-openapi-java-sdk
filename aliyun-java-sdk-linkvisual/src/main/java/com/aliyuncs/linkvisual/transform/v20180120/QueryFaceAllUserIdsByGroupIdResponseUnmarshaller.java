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

import com.aliyuncs.linkvisual.model.v20180120.QueryFaceAllUserIdsByGroupIdResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceAllUserIdsByGroupIdResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceAllUserIdsByGroupIdResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceAllUserIdsByGroupIdResponseUnmarshaller {

	public static QueryFaceAllUserIdsByGroupIdResponse unmarshall(QueryFaceAllUserIdsByGroupIdResponse queryFaceAllUserIdsByGroupIdResponse, UnmarshallerContext _ctx) {
		
		queryFaceAllUserIdsByGroupIdResponse.setRequestId(_ctx.stringValue("QueryFaceAllUserIdsByGroupIdResponse.RequestId"));
		queryFaceAllUserIdsByGroupIdResponse.setSuccess(_ctx.booleanValue("QueryFaceAllUserIdsByGroupIdResponse.Success"));
		queryFaceAllUserIdsByGroupIdResponse.setErrorMessage(_ctx.stringValue("QueryFaceAllUserIdsByGroupIdResponse.ErrorMessage"));
		queryFaceAllUserIdsByGroupIdResponse.setCode(_ctx.stringValue("QueryFaceAllUserIdsByGroupIdResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryFaceAllUserIdsByGroupIdResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryFaceAllUserIdsByGroupIdResponse.Data.PageSize"));
		data.setPage(_ctx.integerValue("QueryFaceAllUserIdsByGroupIdResponse.Data.Page"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaceAllUserIdsByGroupIdResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setUserId(_ctx.stringValue("QueryFaceAllUserIdsByGroupIdResponse.Data.List["+ i +"].UserId"));
			listItem.setCustomUserId(_ctx.stringValue("QueryFaceAllUserIdsByGroupIdResponse.Data.List["+ i +"].CustomUserId"));
			listItem.setName(_ctx.stringValue("QueryFaceAllUserIdsByGroupIdResponse.Data.List["+ i +"].Name"));
			listItem.setParams(_ctx.stringValue("QueryFaceAllUserIdsByGroupIdResponse.Data.List["+ i +"].Params"));

			list.add(listItem);
		}
		data.setList(list);
		queryFaceAllUserIdsByGroupIdResponse.setData(data);
	 
	 	return queryFaceAllUserIdsByGroupIdResponse;
	}
}