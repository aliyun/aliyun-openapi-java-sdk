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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.QueryReadableResourcesListByUserIdResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryReadableResourcesListByUserIdResponse.Data;
import com.aliyuncs.quickbi_public.model.v20220101.QueryReadableResourcesListByUserIdResponse.Data.Directory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryReadableResourcesListByUserIdResponseUnmarshaller {

	public static QueryReadableResourcesListByUserIdResponse unmarshall(QueryReadableResourcesListByUserIdResponse queryReadableResourcesListByUserIdResponse, UnmarshallerContext _ctx) {
		
		queryReadableResourcesListByUserIdResponse.setRequestId(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.RequestId"));
		queryReadableResourcesListByUserIdResponse.setSuccess(_ctx.booleanValue("QueryReadableResourcesListByUserIdResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QueryReadableResourcesListByUserIdResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setStatus(_ctx.integerValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].Status"));
			data.setThirdPartAuthFlag(_ctx.integerValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].ThirdPartAuthFlag"));
			data.setWorksId(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].WorksId"));
			data.setCreateTime(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].CreateTime"));
			data.setWorkType(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].WorkType"));
			data.setOwnerName(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].OwnerName"));
			data.setWorkspaceName(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].WorkspaceName"));
			data.setOwnerId(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].OwnerId"));
			data.setModifyName(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].ModifyName"));
			data.setWorkspaceId(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].WorkspaceId"));
			data.setSecurityLevel(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].SecurityLevel"));
			data.setDescription(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].Description"));
			data.setWorkName(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].WorkName"));
			data.setModifyTime(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].ModifyTime"));

			Directory directory = new Directory();
			directory.setPathId(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].Directory.PathId"));
			directory.setPathName(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].Directory.PathName"));
			directory.setName(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].Directory.Name"));
			directory.setId(_ctx.stringValue("QueryReadableResourcesListByUserIdResponse.Result["+ i +"].Directory.Id"));
			data.setDirectory(directory);

			result.add(data);
		}
		queryReadableResourcesListByUserIdResponse.setResult(result);
	 
	 	return queryReadableResourcesListByUserIdResponse;
	}
}