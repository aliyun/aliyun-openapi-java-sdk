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

package com.aliyuncs.quickbi_public.transform.v20200804;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200804.QuerySharesToUserListResponse;
import com.aliyuncs.quickbi_public.model.v20200804.QuerySharesToUserListResponse.Data;
import com.aliyuncs.quickbi_public.model.v20200804.QuerySharesToUserListResponse.Data.Directory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySharesToUserListResponseUnmarshaller {

	public static QuerySharesToUserListResponse unmarshall(QuerySharesToUserListResponse querySharesToUserListResponse, UnmarshallerContext _ctx) {
		
		querySharesToUserListResponse.setRequestId(_ctx.stringValue("QuerySharesToUserListResponse.RequestId"));
		querySharesToUserListResponse.setSuccess(_ctx.booleanValue("QuerySharesToUserListResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QuerySharesToUserListResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setWorksId(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].WorksId"));
			data.setWorkType(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].WorkType"));
			data.setWorkName(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].WorkName"));
			data.setWorkspaceId(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].WorkspaceId"));
			data.setWorkspaceName(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].WorkspaceName"));
			data.setSecurityLevel(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].SecurityLevel"));
			data.setDescription(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].Description"));
			data.setOwnerId(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].OwnerId"));
			data.setOwnerName(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].OwnerName"));
			data.setModifyName(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].ModifyName"));
			data.setCreateTime(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].CreateTime"));
			data.setModifyTime(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].ModifyTime"));
			data.setThirdPartAuthFlag(_ctx.integerValue("QuerySharesToUserListResponse.Result["+ i +"].ThirdPartAuthFlag"));
			data.setStatus(_ctx.integerValue("QuerySharesToUserListResponse.Result["+ i +"].Status"));

			Directory directory = new Directory();
			directory.setId(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].Directory.Id"));
			directory.setName(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].Directory.Name"));
			directory.setPathId(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].Directory.PathId"));
			directory.setPathName(_ctx.stringValue("QuerySharesToUserListResponse.Result["+ i +"].Directory.PathName"));
			data.setDirectory(directory);

			result.add(data);
		}
		querySharesToUserListResponse.setResult(result);
	 
	 	return querySharesToUserListResponse;
	}
}