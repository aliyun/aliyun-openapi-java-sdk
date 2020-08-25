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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCloudmsgconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCloudmsgconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricCloudmsgconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricCloudmsgconfigsResponse unmarshall(QueryLinkefabricFabricCloudmsgconfigsResponse queryLinkefabricFabricCloudmsgconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricCloudmsgconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricCloudmsgconfigsResponse.RequestId"));
		queryLinkefabricFabricCloudmsgconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricCloudmsgconfigsResponse.ResultCode"));
		queryLinkefabricFabricCloudmsgconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricCloudmsgconfigsResponse.ResultMessage"));
		queryLinkefabricFabricCloudmsgconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricCloudmsgconfigsResponse.Message"));
		queryLinkefabricFabricCloudmsgconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricCloudmsgconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricCloudmsgconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricCloudmsgconfigsResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricCloudmsgconfigsResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricCloudmsgconfigsResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricCloudmsgconfigsResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCloudmsgconfigsResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricCloudmsgconfigsResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCloudmsgconfigsResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricCloudmsgconfigsResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCloudmsgconfigsResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricCloudmsgconfigsResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricCloudmsgconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricCloudmsgconfigsResponse;
	}
}