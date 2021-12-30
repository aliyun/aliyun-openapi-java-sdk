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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListRepoBuildRuleResponse;
import com.aliyuncs.cr.model.v20181201.ListRepoBuildRuleResponse.BuildRulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepoBuildRuleResponseUnmarshaller {

	public static ListRepoBuildRuleResponse unmarshall(ListRepoBuildRuleResponse listRepoBuildRuleResponse, UnmarshallerContext _ctx) {
		
		listRepoBuildRuleResponse.setRequestId(_ctx.stringValue("ListRepoBuildRuleResponse.RequestId"));
		listRepoBuildRuleResponse.setCode(_ctx.stringValue("ListRepoBuildRuleResponse.Code"));
		listRepoBuildRuleResponse.setPageNo(_ctx.integerValue("ListRepoBuildRuleResponse.PageNo"));
		listRepoBuildRuleResponse.setIsSuccess(_ctx.booleanValue("ListRepoBuildRuleResponse.IsSuccess"));
		listRepoBuildRuleResponse.setPageSize(_ctx.integerValue("ListRepoBuildRuleResponse.PageSize"));
		listRepoBuildRuleResponse.setTotalCount(_ctx.stringValue("ListRepoBuildRuleResponse.TotalCount"));

		List<BuildRulesItem> buildRules = new ArrayList<BuildRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepoBuildRuleResponse.BuildRules.Length"); i++) {
			BuildRulesItem buildRulesItem = new BuildRulesItem();
			buildRulesItem.setDockerfileLocation(_ctx.stringValue("ListRepoBuildRuleResponse.BuildRules["+ i +"].DockerfileLocation"));
			buildRulesItem.setBuildRuleId(_ctx.stringValue("ListRepoBuildRuleResponse.BuildRules["+ i +"].BuildRuleId"));
			buildRulesItem.setPushType(_ctx.stringValue("ListRepoBuildRuleResponse.BuildRules["+ i +"].PushType"));
			buildRulesItem.setPushName(_ctx.stringValue("ListRepoBuildRuleResponse.BuildRules["+ i +"].PushName"));
			buildRulesItem.setImageTag(_ctx.stringValue("ListRepoBuildRuleResponse.BuildRules["+ i +"].ImageTag"));
			buildRulesItem.setDockerfileName(_ctx.stringValue("ListRepoBuildRuleResponse.BuildRules["+ i +"].DockerfileName"));

			List<String> platforms = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRepoBuildRuleResponse.BuildRules["+ i +"].Platforms.Length"); j++) {
				platforms.add(_ctx.stringValue("ListRepoBuildRuleResponse.BuildRules["+ i +"].Platforms["+ j +"]"));
			}
			buildRulesItem.setPlatforms(platforms);

			List<String> buildArgs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRepoBuildRuleResponse.BuildRules["+ i +"].BuildArgs.Length"); j++) {
				buildArgs.add(_ctx.stringValue("ListRepoBuildRuleResponse.BuildRules["+ i +"].BuildArgs["+ j +"]"));
			}
			buildRulesItem.setBuildArgs(buildArgs);

			buildRules.add(buildRulesItem);
		}
		listRepoBuildRuleResponse.setBuildRules(buildRules);
	 
	 	return listRepoBuildRuleResponse;
	}
}