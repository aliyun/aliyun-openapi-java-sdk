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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricDockerruleconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricDockerruleconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricDockerruleconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricDockerruleconfigsResponse unmarshall(QueryLinkefabricFabricDockerruleconfigsResponse queryLinkefabricFabricDockerruleconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricDockerruleconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricDockerruleconfigsResponse.RequestId"));
		queryLinkefabricFabricDockerruleconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricDockerruleconfigsResponse.ResultCode"));
		queryLinkefabricFabricDockerruleconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricDockerruleconfigsResponse.ResultMessage"));
		queryLinkefabricFabricDockerruleconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricDockerruleconfigsResponse.Message"));
		queryLinkefabricFabricDockerruleconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricDockerruleconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricDockerruleconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricDockerruleconfigsResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricDockerruleconfigsResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricDockerruleconfigsResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricDockerruleconfigsResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricDockerruleconfigsResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricDockerruleconfigsResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricDockerruleconfigsResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricDockerruleconfigsResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricDockerruleconfigsResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricDockerruleconfigsResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricDockerruleconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricDockerruleconfigsResponse;
	}
}