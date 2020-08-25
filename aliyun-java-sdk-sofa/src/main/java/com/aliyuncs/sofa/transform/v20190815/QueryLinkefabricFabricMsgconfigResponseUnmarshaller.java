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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricMsgconfigResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricMsgconfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricMsgconfigResponseUnmarshaller {

	public static QueryLinkefabricFabricMsgconfigResponse unmarshall(QueryLinkefabricFabricMsgconfigResponse queryLinkefabricFabricMsgconfigResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricMsgconfigResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricMsgconfigResponse.RequestId"));
		queryLinkefabricFabricMsgconfigResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricMsgconfigResponse.ResultCode"));
		queryLinkefabricFabricMsgconfigResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricMsgconfigResponse.ResultMessage"));
		queryLinkefabricFabricMsgconfigResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricMsgconfigResponse.Message"));
		queryLinkefabricFabricMsgconfigResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricMsgconfigResponse.ResponseStatusCode"));
		queryLinkefabricFabricMsgconfigResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricMsgconfigResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricMsgconfigResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricMsgconfigResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricMsgconfigResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricMsgconfigResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricMsgconfigResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricMsgconfigResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricMsgconfigResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricMsgconfigResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricMsgconfigResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricMsgconfigResponse.setData(data);
	 
	 	return queryLinkefabricFabricMsgconfigResponse;
	}
}