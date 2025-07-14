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

import com.aliyuncs.quickbi_public.model.v20220101.QueryReadableResourcesListByUserIdV2Response;
import com.aliyuncs.quickbi_public.model.v20220101.QueryReadableResourcesListByUserIdV2Response.Data;
import com.aliyuncs.quickbi_public.model.v20220101.QueryReadableResourcesListByUserIdV2Response.Data.Directory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryReadableResourcesListByUserIdV2ResponseUnmarshaller {

	public static QueryReadableResourcesListByUserIdV2Response unmarshall(QueryReadableResourcesListByUserIdV2Response queryReadableResourcesListByUserIdV2Response, UnmarshallerContext _ctx) {
		
		queryReadableResourcesListByUserIdV2Response.setRequestId(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.RequestId"));
		queryReadableResourcesListByUserIdV2Response.setSuccess(_ctx.booleanValue("QueryReadableResourcesListByUserIdV2Response.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QueryReadableResourcesListByUserIdV2Response.Result.Length"); i++) {
			Data data = new Data();
			data.setStatus(_ctx.integerValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].Status"));
			data.setModifyTime(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].ModifyTime"));
			data.setOwnerName(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].OwnerName"));
			data.setDescription(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].Description"));
			data.setWorkType(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].WorkType"));
			data.setModifyName(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].ModifyName"));
			data.setCreateTime(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].CreateTime"));
			data.setWorkspaceId(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].WorkspaceId"));
			data.setThirdPartAuthFlag(_ctx.integerValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].ThirdPartAuthFlag"));
			data.setOwnerId(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].OwnerId"));
			data.setSecurityLevel(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].SecurityLevel"));
			data.setWorkName(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].WorkName"));
			data.setWorkspaceName(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].WorkspaceName"));
			data.setWorksId(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].WorksId"));

			Directory directory = new Directory();
			directory.setPathId(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].Directory.PathId"));
			directory.setId(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].Directory.Id"));
			directory.setPathName(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].Directory.PathName"));
			directory.setName(_ctx.stringValue("QueryReadableResourcesListByUserIdV2Response.Result["+ i +"].Directory.Name"));
			data.setDirectory(directory);

			result.add(data);
		}
		queryReadableResourcesListByUserIdV2Response.setResult(result);
	 
	 	return queryReadableResourcesListByUserIdV2Response;
	}
}