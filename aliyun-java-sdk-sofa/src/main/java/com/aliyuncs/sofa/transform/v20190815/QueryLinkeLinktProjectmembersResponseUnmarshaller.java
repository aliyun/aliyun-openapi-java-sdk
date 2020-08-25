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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectmembersResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectmembersResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktProjectmembersResponseUnmarshaller {

	public static QueryLinkeLinktProjectmembersResponse unmarshall(QueryLinkeLinktProjectmembersResponse queryLinkeLinktProjectmembersResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktProjectmembersResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktProjectmembersResponse.RequestId"));
		queryLinkeLinktProjectmembersResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktProjectmembersResponse.ResultCode"));
		queryLinkeLinktProjectmembersResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktProjectmembersResponse.ResultMessage"));
		queryLinkeLinktProjectmembersResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktProjectmembersResponse.ErrorCode"));
		queryLinkeLinktProjectmembersResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktProjectmembersResponse.ErrorMessage"));
		queryLinkeLinktProjectmembersResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktProjectmembersResponse.ResponseStatusCode"));
		queryLinkeLinktProjectmembersResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktProjectmembersResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktProjectmembersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRoleType(_ctx.stringValue("QueryLinkeLinktProjectmembersResponse.Data["+ i +"].RoleType"));

			List<String> users = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktProjectmembersResponse.Data["+ i +"].Users.Length"); j++) {
				users.add(_ctx.stringValue("QueryLinkeLinktProjectmembersResponse.Data["+ i +"].Users["+ j +"]"));
			}
			dataItem.setUsers(users);

			data.add(dataItem);
		}
		queryLinkeLinktProjectmembersResponse.setData(data);
	 
	 	return queryLinkeLinktProjectmembersResponse;
	}
}