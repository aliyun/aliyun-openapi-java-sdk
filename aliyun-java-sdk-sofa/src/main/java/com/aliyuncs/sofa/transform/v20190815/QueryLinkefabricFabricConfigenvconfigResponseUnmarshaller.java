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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricConfigenvconfigResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricConfigenvconfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricConfigenvconfigResponseUnmarshaller {

	public static QueryLinkefabricFabricConfigenvconfigResponse unmarshall(QueryLinkefabricFabricConfigenvconfigResponse queryLinkefabricFabricConfigenvconfigResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricConfigenvconfigResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricConfigenvconfigResponse.RequestId"));
		queryLinkefabricFabricConfigenvconfigResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricConfigenvconfigResponse.ResultCode"));
		queryLinkefabricFabricConfigenvconfigResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricConfigenvconfigResponse.ResultMessage"));
		queryLinkefabricFabricConfigenvconfigResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricConfigenvconfigResponse.Message"));
		queryLinkefabricFabricConfigenvconfigResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricConfigenvconfigResponse.ResponseStatusCode"));
		queryLinkefabricFabricConfigenvconfigResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricConfigenvconfigResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricConfigenvconfigResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricConfigenvconfigResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricConfigenvconfigResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricConfigenvconfigResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricConfigenvconfigResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricConfigenvconfigResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricConfigenvconfigResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricConfigenvconfigResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricConfigenvconfigResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricConfigenvconfigResponse.setData(data);
	 
	 	return queryLinkefabricFabricConfigenvconfigResponse;
	}
}