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

import com.aliyuncs.quickbi_public.model.v20220101.QueryWorksResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryWorksResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryWorksResponse.Result.Directory;
import com.aliyuncs.quickbi_public.model.v20220101.QueryWorksResponse.Result.GlobalParamVoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWorksResponseUnmarshaller {

	public static QueryWorksResponse unmarshall(QueryWorksResponse queryWorksResponse, UnmarshallerContext _ctx) {
		
		queryWorksResponse.setRequestId(_ctx.stringValue("QueryWorksResponse.RequestId"));
		queryWorksResponse.setSuccess(_ctx.booleanValue("QueryWorksResponse.Success"));

		Result result = new Result();
		result.setStatus(_ctx.integerValue("QueryWorksResponse.Result.Status"));
		result.setOwnerName(_ctx.stringValue("QueryWorksResponse.Result.OwnerName"));
		result.setPublicInvalidTime(_ctx.longValue("QueryWorksResponse.Result.PublicInvalidTime"));
		result.setDescription(_ctx.stringValue("QueryWorksResponse.Result.Description"));
		result.setWorkType(_ctx.stringValue("QueryWorksResponse.Result.WorkType"));
		result.setModifyName(_ctx.stringValue("QueryWorksResponse.Result.ModifyName"));
		result.setWorkspaceId(_ctx.stringValue("QueryWorksResponse.Result.WorkspaceId"));
		result.setAuth3rdFlag(_ctx.integerValue("QueryWorksResponse.Result.Auth3rdFlag"));
		result.setGmtCreate(_ctx.stringValue("QueryWorksResponse.Result.GmtCreate"));
		result.setOwnerId(_ctx.stringValue("QueryWorksResponse.Result.OwnerId"));
		result.setGmtModify(_ctx.stringValue("QueryWorksResponse.Result.GmtModify"));
		result.setSecurityLevel(_ctx.stringValue("QueryWorksResponse.Result.SecurityLevel"));
		result.setWorkName(_ctx.stringValue("QueryWorksResponse.Result.WorkName"));
		result.setWorkspaceName(_ctx.stringValue("QueryWorksResponse.Result.WorkspaceName"));
		result.setPublicFlag(_ctx.booleanValue("QueryWorksResponse.Result.PublicFlag"));
		result.setWorksId(_ctx.stringValue("QueryWorksResponse.Result.WorksId"));

		Directory directory = new Directory();
		directory.setPathId(_ctx.stringValue("QueryWorksResponse.Result.Directory.PathId"));
		directory.setId(_ctx.stringValue("QueryWorksResponse.Result.Directory.Id"));
		directory.setPathName(_ctx.stringValue("QueryWorksResponse.Result.Directory.PathName"));
		directory.setName(_ctx.stringValue("QueryWorksResponse.Result.Directory.Name"));
		result.setDirectory(directory);

		List<GlobalParamVoListItem> globalParamVoList = new ArrayList<GlobalParamVoListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryWorksResponse.Result.GlobalParamVoList.Length"); i++) {
			GlobalParamVoListItem globalParamVoListItem = new GlobalParamVoListItem();
			globalParamVoListItem.setRequired(_ctx.booleanValue("QueryWorksResponse.Result.GlobalParamVoList["+ i +"].Required"));
			globalParamVoListItem.setDataType(_ctx.stringValue("QueryWorksResponse.Result.GlobalParamVoList["+ i +"].DataType"));
			globalParamVoListItem.setParamAlias(_ctx.stringValue("QueryWorksResponse.Result.GlobalParamVoList["+ i +"].ParamAlias"));
			globalParamVoListItem.setParamName(_ctx.stringValue("QueryWorksResponse.Result.GlobalParamVoList["+ i +"].ParamName"));

			globalParamVoList.add(globalParamVoListItem);
		}
		result.setGlobalParamVoList(globalParamVoList);
		queryWorksResponse.setResult(result);
	 
	 	return queryWorksResponse;
	}
}