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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeUserProfilePathRulesResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeUserProfilePathRulesResponse.UserProfilePathRule;
import com.aliyuncs.ecd.model.v20200930.DescribeUserProfilePathRulesResponse.UserProfilePathRule.UpmPathRules;
import com.aliyuncs.ecd.model.v20200930.DescribeUserProfilePathRulesResponse.UserProfilePathRule.UpmPathRules.BlackPath;
import com.aliyuncs.ecd.model.v20200930.DescribeUserProfilePathRulesResponse.UserProfilePathRule.UpmPathRules.WhiteList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserProfilePathRulesResponseUnmarshaller {

	public static DescribeUserProfilePathRulesResponse unmarshall(DescribeUserProfilePathRulesResponse describeUserProfilePathRulesResponse, UnmarshallerContext _ctx) {
		
		describeUserProfilePathRulesResponse.setRequestId(_ctx.stringValue("DescribeUserProfilePathRulesResponse.RequestId"));

		UserProfilePathRule userProfilePathRule = new UserProfilePathRule();
		userProfilePathRule.setDesktopGroupId(_ctx.stringValue("DescribeUserProfilePathRulesResponse.UserProfilePathRule.DesktopGroupId"));
		userProfilePathRule.setUserProfileRuleType(_ctx.stringValue("DescribeUserProfilePathRulesResponse.UserProfilePathRule.UserProfileRuleType"));

		List<UpmPathRules> rules = new ArrayList<UpmPathRules>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserProfilePathRulesResponse.UserProfilePathRule.Rules.Length"); i++) {
			UpmPathRules upmPathRules = new UpmPathRules();

			BlackPath blackPath = new BlackPath();
			blackPath.setPath(_ctx.stringValue("DescribeUserProfilePathRulesResponse.UserProfilePathRule.Rules["+ i +"].BlackPath.Path"));
			blackPath.setType(_ctx.stringValue("DescribeUserProfilePathRulesResponse.UserProfilePathRule.Rules["+ i +"].BlackPath.Type"));
			upmPathRules.setBlackPath(blackPath);

			List<WhiteList> whitePaths = new ArrayList<WhiteList>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUserProfilePathRulesResponse.UserProfilePathRule.Rules["+ i +"].WhitePaths.Length"); j++) {
				WhiteList whiteList = new WhiteList();
				whiteList.setPath(_ctx.stringValue("DescribeUserProfilePathRulesResponse.UserProfilePathRule.Rules["+ i +"].WhitePaths["+ j +"].Path"));
				whiteList.setType(_ctx.stringValue("DescribeUserProfilePathRulesResponse.UserProfilePathRule.Rules["+ i +"].WhitePaths["+ j +"].Type"));

				whitePaths.add(whiteList);
			}
			upmPathRules.setWhitePaths(whitePaths);

			rules.add(upmPathRules);
		}
		userProfilePathRule.setRules(rules);
		describeUserProfilePathRulesResponse.setUserProfilePathRule(userProfilePathRule);
	 
	 	return describeUserProfilePathRulesResponse;
	}
}