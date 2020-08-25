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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricNewappconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricNewappconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricNewappconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricNewappconfigsResponse unmarshall(QueryLinkefabricFabricNewappconfigsResponse queryLinkefabricFabricNewappconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricNewappconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricNewappconfigsResponse.RequestId"));
		queryLinkefabricFabricNewappconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricNewappconfigsResponse.ResultCode"));
		queryLinkefabricFabricNewappconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricNewappconfigsResponse.ResultMessage"));
		queryLinkefabricFabricNewappconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricNewappconfigsResponse.Message"));
		queryLinkefabricFabricNewappconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricNewappconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricNewappconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricNewappconfigsResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricNewappconfigsResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricNewappconfigsResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricNewappconfigsResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricNewappconfigsResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricNewappconfigsResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricNewappconfigsResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricNewappconfigsResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricNewappconfigsResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricNewappconfigsResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricNewappconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricNewappconfigsResponse;
	}
}