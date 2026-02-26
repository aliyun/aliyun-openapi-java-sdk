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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.UpdateBootAndAntiUninstallPolicyResponse;
import com.aliyuncs.csas.model.v20230120.UpdateBootAndAntiUninstallPolicyResponse.Strategy;
import com.aliyuncs.csas.model.v20230120.UpdateBootAndAntiUninstallPolicyResponse.Strategy.BlockContent;
import com.aliyuncs.csas.model.v20230120.UpdateBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextEn;
import com.aliyuncs.csas.model.v20230120.UpdateBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextZh;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateBootAndAntiUninstallPolicyResponseUnmarshaller {

	public static UpdateBootAndAntiUninstallPolicyResponse unmarshall(UpdateBootAndAntiUninstallPolicyResponse updateBootAndAntiUninstallPolicyResponse, UnmarshallerContext _ctx) {
		
		updateBootAndAntiUninstallPolicyResponse.setRequestId(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.RequestId"));

		Strategy strategy = new Strategy();
		strategy.setCreateTime(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.CreateTime"));
		strategy.setUpdateTime(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.UpdateTime"));
		strategy.setIsBoot(_ctx.booleanValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.IsBoot"));
		strategy.setIsAntiUninstall(_ctx.booleanValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.IsAntiUninstall"));
		strategy.setAllowReport(_ctx.booleanValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.AllowReport"));
		strategy.setPolicyId(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.PolicyId"));
		strategy.setReportProcessId(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.ReportProcessId"));

		List<String> whitelistUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.WhitelistUsers.Length"); i++) {
			whitelistUsers.add(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.WhitelistUsers["+ i +"]"));
		}
		strategy.setWhitelistUsers(whitelistUsers);

		List<String> userGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.UserGroupIds.Length"); i++) {
			userGroupIds.add(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.UserGroupIds["+ i +"]"));
		}
		strategy.setUserGroupIds(userGroupIds);

		BlockContent blockContent = new BlockContent();

		BlockTextZh blockTextZh = new BlockTextZh();
		blockTextZh.setTitle(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextZh.Title"));
		blockTextZh.setContent(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextZh.Content"));
		blockTextZh.setMainButtonText(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextZh.MainButtonText"));
		blockTextZh.setMinorButtonText(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextZh.MinorButtonText"));
		blockContent.setBlockTextZh(blockTextZh);

		BlockTextEn blockTextEn = new BlockTextEn();
		blockTextEn.setTitle(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextEn.Title"));
		blockTextEn.setContent(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextEn.Content"));
		blockTextEn.setMainButtonText(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextEn.MainButtonText"));
		blockTextEn.setMinorButtonText(_ctx.stringValue("UpdateBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextEn.MinorButtonText"));
		blockContent.setBlockTextEn(blockTextEn);
		strategy.setBlockContent(blockContent);
		updateBootAndAntiUninstallPolicyResponse.setStrategy(strategy);
	 
	 	return updateBootAndAntiUninstallPolicyResponse;
	}
}