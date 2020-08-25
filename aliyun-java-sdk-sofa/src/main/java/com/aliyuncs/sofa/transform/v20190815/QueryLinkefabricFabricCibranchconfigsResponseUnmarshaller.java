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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCibranchconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCibranchconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricCibranchconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricCibranchconfigsResponse unmarshall(QueryLinkefabricFabricCibranchconfigsResponse queryLinkefabricFabricCibranchconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricCibranchconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricCibranchconfigsResponse.RequestId"));
		queryLinkefabricFabricCibranchconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricCibranchconfigsResponse.ResultCode"));
		queryLinkefabricFabricCibranchconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricCibranchconfigsResponse.ResultMessage"));
		queryLinkefabricFabricCibranchconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricCibranchconfigsResponse.Message"));
		queryLinkefabricFabricCibranchconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricCibranchconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricCibranchconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricCibranchconfigsResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricCibranchconfigsResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricCibranchconfigsResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricCibranchconfigsResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCibranchconfigsResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricCibranchconfigsResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCibranchconfigsResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricCibranchconfigsResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCibranchconfigsResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricCibranchconfigsResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricCibranchconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricCibranchconfigsResponse;
	}
}