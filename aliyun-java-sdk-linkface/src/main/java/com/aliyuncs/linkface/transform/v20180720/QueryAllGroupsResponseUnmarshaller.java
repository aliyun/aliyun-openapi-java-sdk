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

package com.aliyuncs.linkface.transform.v20180720;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkface.model.v20180720.QueryAllGroupsResponse;
import com.aliyuncs.linkface.model.v20180720.QueryAllGroupsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAllGroupsResponseUnmarshaller {

	public static QueryAllGroupsResponse unmarshall(QueryAllGroupsResponse queryAllGroupsResponse, UnmarshallerContext context) {
		
		queryAllGroupsResponse.setRequestId(context.stringValue("QueryAllGroupsResponse.RequestId"));
		queryAllGroupsResponse.setCode(context.integerValue("QueryAllGroupsResponse.Code"));
		queryAllGroupsResponse.setMessage(context.stringValue("QueryAllGroupsResponse.Message"));
		queryAllGroupsResponse.setPageCount(context.integerValue("QueryAllGroupsResponse.PageCount"));
		queryAllGroupsResponse.setPageSize(context.integerValue("QueryAllGroupsResponse.PageSize"));
		queryAllGroupsResponse.setPage(context.integerValue("QueryAllGroupsResponse.Page"));
		queryAllGroupsResponse.setTotal(context.integerValue("QueryAllGroupsResponse.Total"));
		queryAllGroupsResponse.setSuccess(context.booleanValue("QueryAllGroupsResponse.Success"));

		Data data = new Data();

		List<String> groups = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryAllGroupsResponse.Data.Groups.Length"); i++) {
			groups.add(context.stringValue("QueryAllGroupsResponse.Data.Groups["+ i +"]"));
		}
		data.setGroups(groups);
		queryAllGroupsResponse.setData(data);
	 
	 	return queryAllGroupsResponse;
	}
}