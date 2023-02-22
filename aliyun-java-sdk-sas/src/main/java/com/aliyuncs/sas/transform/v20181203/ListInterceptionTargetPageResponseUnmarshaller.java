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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListInterceptionTargetPageResponse;
import com.aliyuncs.sas.model.v20181203.ListInterceptionTargetPageResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.ListInterceptionTargetPageResponse.RuleTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInterceptionTargetPageResponseUnmarshaller {

	public static ListInterceptionTargetPageResponse unmarshall(ListInterceptionTargetPageResponse listInterceptionTargetPageResponse, UnmarshallerContext _ctx) {
		
		listInterceptionTargetPageResponse.setRequestId(_ctx.stringValue("ListInterceptionTargetPageResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListInterceptionTargetPageResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListInterceptionTargetPageResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListInterceptionTargetPageResponse.PageInfo.TotalCount"));
		listInterceptionTargetPageResponse.setPageInfo(pageInfo);

		List<RuleTarget> ruleTargetList = new ArrayList<RuleTarget>();
		for (int i = 0; i < _ctx.lengthValue("ListInterceptionTargetPageResponse.RuleTargetList.Length"); i++) {
			RuleTarget ruleTarget = new RuleTarget();
			ruleTarget.setAppName(_ctx.stringValue("ListInterceptionTargetPageResponse.RuleTargetList["+ i +"].AppName"));
			ruleTarget.setTargetId(_ctx.longValue("ListInterceptionTargetPageResponse.RuleTargetList["+ i +"].TargetId"));
			ruleTarget.setTargetName(_ctx.stringValue("ListInterceptionTargetPageResponse.RuleTargetList["+ i +"].TargetName"));
			ruleTarget.setNamespace(_ctx.stringValue("ListInterceptionTargetPageResponse.RuleTargetList["+ i +"].Namespace"));
			ruleTarget.setTargetType(_ctx.stringValue("ListInterceptionTargetPageResponse.RuleTargetList["+ i +"].TargetType"));
			ruleTarget.setClusterId(_ctx.stringValue("ListInterceptionTargetPageResponse.RuleTargetList["+ i +"].ClusterId"));
			ruleTarget.setClusterName(_ctx.stringValue("ListInterceptionTargetPageResponse.RuleTargetList["+ i +"].ClusterName"));
			ruleTarget.setRuleType(_ctx.stringValue("ListInterceptionTargetPageResponse.RuleTargetList["+ i +"].RuleType"));

			List<String> imageList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInterceptionTargetPageResponse.RuleTargetList["+ i +"].ImageList.Length"); j++) {
				imageList.add(_ctx.stringValue("ListInterceptionTargetPageResponse.RuleTargetList["+ i +"].ImageList["+ j +"]"));
			}
			ruleTarget.setImageList(imageList);

			List<String> tagList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInterceptionTargetPageResponse.RuleTargetList["+ i +"].TagList.Length"); j++) {
				tagList.add(_ctx.stringValue("ListInterceptionTargetPageResponse.RuleTargetList["+ i +"].TagList["+ j +"]"));
			}
			ruleTarget.setTagList(tagList);

			ruleTargetList.add(ruleTarget);
		}
		listInterceptionTargetPageResponse.setRuleTargetList(ruleTargetList);
	 
	 	return listInterceptionTargetPageResponse;
	}
}