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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cccxspaceinner.model.v20191227.QueryServicerByPageResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryServicerByPageResponse.Data;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryServicerByPageResponse.Data.ResultsItem;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryServicerByPageResponse.Data.ResultsItem.GroupsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryServicerByPageResponseUnmarshaller {

	public static QueryServicerByPageResponse unmarshall(QueryServicerByPageResponse queryServicerByPageResponse, UnmarshallerContext _ctx) {
		
		queryServicerByPageResponse.setRequestId(_ctx.stringValue("QueryServicerByPageResponse.RequestId"));
		queryServicerByPageResponse.setMessage(_ctx.stringValue("QueryServicerByPageResponse.Message"));
		queryServicerByPageResponse.setHttpStatusCode(_ctx.integerValue("QueryServicerByPageResponse.HttpStatusCode"));
		queryServicerByPageResponse.setCode(_ctx.stringValue("QueryServicerByPageResponse.Code"));
		queryServicerByPageResponse.setSuccess(_ctx.booleanValue("QueryServicerByPageResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryServicerByPageResponse.Data.Total"));
		data.setCount(_ctx.integerValue("QueryServicerByPageResponse.Data.Count"));
		data.setPageNum(_ctx.integerValue("QueryServicerByPageResponse.Data.PageNum"));
		data.setPage(_ctx.longValue("QueryServicerByPageResponse.Data.Page"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryServicerByPageResponse.Data.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setServicerId(_ctx.longValue("QueryServicerByPageResponse.Data.Results["+ i +"].ServicerId"));
			resultsItem.setServicerType(_ctx.integerValue("QueryServicerByPageResponse.Data.Results["+ i +"].ServicerType"));
			resultsItem.setUserStatus(_ctx.integerValue("QueryServicerByPageResponse.Data.Results["+ i +"].UserStatus"));
			resultsItem.setUserType(_ctx.integerValue("QueryServicerByPageResponse.Data.Results["+ i +"].UserType"));
			resultsItem.setDepartmentId(_ctx.longValue("QueryServicerByPageResponse.Data.Results["+ i +"].DepartmentId"));
			resultsItem.setBuId(_ctx.longValue("QueryServicerByPageResponse.Data.Results["+ i +"].BuId"));
			resultsItem.setRealName(_ctx.stringValue("QueryServicerByPageResponse.Data.Results["+ i +"].RealName"));
			resultsItem.setShowName(_ctx.stringValue("QueryServicerByPageResponse.Data.Results["+ i +"].ShowName"));

			List<GroupsItem> groups = new ArrayList<GroupsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryServicerByPageResponse.Data.Results["+ i +"].Groups.Length"); j++) {
				GroupsItem groupsItem = new GroupsItem();
				groupsItem.setGroupId(_ctx.longValue("QueryServicerByPageResponse.Data.Results["+ i +"].Groups["+ j +"].GroupId"));
				groupsItem.setSkillType(_ctx.integerValue("QueryServicerByPageResponse.Data.Results["+ i +"].Groups["+ j +"].SkillType"));
				groupsItem.setDepartmentId(_ctx.longValue("QueryServicerByPageResponse.Data.Results["+ i +"].Groups["+ j +"].DepartmentId"));
				groupsItem.setDescription(_ctx.stringValue("QueryServicerByPageResponse.Data.Results["+ i +"].Groups["+ j +"].Description"));
				groupsItem.setShowName(_ctx.stringValue("QueryServicerByPageResponse.Data.Results["+ i +"].Groups["+ j +"].ShowName"));
				groupsItem.setGroupName(_ctx.stringValue("QueryServicerByPageResponse.Data.Results["+ i +"].Groups["+ j +"].GroupName"));
				groupsItem.setStatus(_ctx.integerValue("QueryServicerByPageResponse.Data.Results["+ i +"].Groups["+ j +"].Status"));
				groupsItem.setSupportCase(_ctx.booleanValue("QueryServicerByPageResponse.Data.Results["+ i +"].Groups["+ j +"].SupportCase"));
				groupsItem.setSupportPhone(_ctx.booleanValue("QueryServicerByPageResponse.Data.Results["+ i +"].Groups["+ j +"].SupportPhone"));
				groupsItem.setSupportIm(_ctx.booleanValue("QueryServicerByPageResponse.Data.Results["+ i +"].Groups["+ j +"].SupportIm"));

				groups.add(groupsItem);
			}
			resultsItem.setGroups(groups);

			results.add(resultsItem);
		}
		data.setResults(results);
		queryServicerByPageResponse.setData(data);
	 
	 	return queryServicerByPageResponse;
	}
}