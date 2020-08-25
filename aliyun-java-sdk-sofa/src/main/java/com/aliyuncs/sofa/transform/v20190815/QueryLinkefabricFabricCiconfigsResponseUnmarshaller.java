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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCiconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCiconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricCiconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricCiconfigsResponse unmarshall(QueryLinkefabricFabricCiconfigsResponse queryLinkefabricFabricCiconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricCiconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricCiconfigsResponse.RequestId"));
		queryLinkefabricFabricCiconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricCiconfigsResponse.ResultCode"));
		queryLinkefabricFabricCiconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricCiconfigsResponse.ResultMessage"));
		queryLinkefabricFabricCiconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricCiconfigsResponse.Message"));
		queryLinkefabricFabricCiconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricCiconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricCiconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricCiconfigsResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricCiconfigsResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricCiconfigsResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricCiconfigsResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCiconfigsResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricCiconfigsResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCiconfigsResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricCiconfigsResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCiconfigsResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricCiconfigsResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricCiconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricCiconfigsResponse;
	}
}