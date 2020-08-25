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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricTechstackconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricTechstackconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricTechstackconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricTechstackconfigsResponse unmarshall(QueryLinkefabricFabricTechstackconfigsResponse queryLinkefabricFabricTechstackconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricTechstackconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricTechstackconfigsResponse.RequestId"));
		queryLinkefabricFabricTechstackconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricTechstackconfigsResponse.ResultCode"));
		queryLinkefabricFabricTechstackconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricTechstackconfigsResponse.ResultMessage"));
		queryLinkefabricFabricTechstackconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricTechstackconfigsResponse.Message"));
		queryLinkefabricFabricTechstackconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricTechstackconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricTechstackconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricTechstackconfigsResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricTechstackconfigsResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricTechstackconfigsResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricTechstackconfigsResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricTechstackconfigsResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricTechstackconfigsResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricTechstackconfigsResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricTechstackconfigsResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricTechstackconfigsResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricTechstackconfigsResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricTechstackconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricTechstackconfigsResponse;
	}
}