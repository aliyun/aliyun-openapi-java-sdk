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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricWebapidbconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricWebapidbconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricWebapidbconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricWebapidbconfigsResponse unmarshall(QueryLinkefabricFabricWebapidbconfigsResponse queryLinkefabricFabricWebapidbconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricWebapidbconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricWebapidbconfigsResponse.RequestId"));
		queryLinkefabricFabricWebapidbconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricWebapidbconfigsResponse.ResultCode"));
		queryLinkefabricFabricWebapidbconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricWebapidbconfigsResponse.ResultMessage"));
		queryLinkefabricFabricWebapidbconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricWebapidbconfigsResponse.Message"));
		queryLinkefabricFabricWebapidbconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricWebapidbconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricWebapidbconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricWebapidbconfigsResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricWebapidbconfigsResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricWebapidbconfigsResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricWebapidbconfigsResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricWebapidbconfigsResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricWebapidbconfigsResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricWebapidbconfigsResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricWebapidbconfigsResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricWebapidbconfigsResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricWebapidbconfigsResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricWebapidbconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricWebapidbconfigsResponse;
	}
}