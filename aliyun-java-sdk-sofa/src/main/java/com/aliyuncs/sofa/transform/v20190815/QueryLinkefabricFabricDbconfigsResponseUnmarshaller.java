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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricDbconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricDbconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricDbconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricDbconfigsResponse unmarshall(QueryLinkefabricFabricDbconfigsResponse queryLinkefabricFabricDbconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricDbconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricDbconfigsResponse.RequestId"));
		queryLinkefabricFabricDbconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricDbconfigsResponse.ResultCode"));
		queryLinkefabricFabricDbconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricDbconfigsResponse.ResultMessage"));
		queryLinkefabricFabricDbconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricDbconfigsResponse.Message"));
		queryLinkefabricFabricDbconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricDbconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricDbconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricDbconfigsResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricDbconfigsResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricDbconfigsResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricDbconfigsResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricDbconfigsResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricDbconfigsResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricDbconfigsResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricDbconfigsResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricDbconfigsResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricDbconfigsResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricDbconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricDbconfigsResponse;
	}
}