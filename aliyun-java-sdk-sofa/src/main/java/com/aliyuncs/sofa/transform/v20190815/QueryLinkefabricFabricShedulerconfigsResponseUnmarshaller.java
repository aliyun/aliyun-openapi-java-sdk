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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricShedulerconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricShedulerconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricShedulerconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricShedulerconfigsResponse unmarshall(QueryLinkefabricFabricShedulerconfigsResponse queryLinkefabricFabricShedulerconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricShedulerconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricShedulerconfigsResponse.RequestId"));
		queryLinkefabricFabricShedulerconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricShedulerconfigsResponse.ResultCode"));
		queryLinkefabricFabricShedulerconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricShedulerconfigsResponse.ResultMessage"));
		queryLinkefabricFabricShedulerconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricShedulerconfigsResponse.Message"));
		queryLinkefabricFabricShedulerconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricShedulerconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricShedulerconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricShedulerconfigsResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricShedulerconfigsResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricShedulerconfigsResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricShedulerconfigsResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricShedulerconfigsResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricShedulerconfigsResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricShedulerconfigsResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricShedulerconfigsResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricShedulerconfigsResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricShedulerconfigsResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricShedulerconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricShedulerconfigsResponse;
	}
}