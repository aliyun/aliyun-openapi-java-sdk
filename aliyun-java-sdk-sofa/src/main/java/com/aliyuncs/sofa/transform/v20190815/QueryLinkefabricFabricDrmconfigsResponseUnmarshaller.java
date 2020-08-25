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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricDrmconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricDrmconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricDrmconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricDrmconfigsResponse unmarshall(QueryLinkefabricFabricDrmconfigsResponse queryLinkefabricFabricDrmconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricDrmconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricDrmconfigsResponse.RequestId"));
		queryLinkefabricFabricDrmconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricDrmconfigsResponse.ResultCode"));
		queryLinkefabricFabricDrmconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricDrmconfigsResponse.ResultMessage"));
		queryLinkefabricFabricDrmconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricDrmconfigsResponse.Message"));
		queryLinkefabricFabricDrmconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricDrmconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricDrmconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricDrmconfigsResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricDrmconfigsResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricDrmconfigsResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricDrmconfigsResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricDrmconfigsResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricDrmconfigsResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricDrmconfigsResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricDrmconfigsResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricDrmconfigsResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricDrmconfigsResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricDrmconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricDrmconfigsResponse;
	}
}