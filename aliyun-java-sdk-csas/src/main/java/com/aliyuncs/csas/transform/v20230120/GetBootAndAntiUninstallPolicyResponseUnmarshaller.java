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

import com.aliyuncs.csas.model.v20230120.GetBootAndAntiUninstallPolicyResponse;
import com.aliyuncs.csas.model.v20230120.GetBootAndAntiUninstallPolicyResponse.Strategy;
import com.aliyuncs.csas.model.v20230120.GetBootAndAntiUninstallPolicyResponse.Strategy.BlockContent;
import com.aliyuncs.csas.model.v20230120.GetBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextEn;
import com.aliyuncs.csas.model.v20230120.GetBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextZh;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBootAndAntiUninstallPolicyResponseUnmarshaller {

	public static GetBootAndAntiUninstallPolicyResponse unmarshall(GetBootAndAntiUninstallPolicyResponse getBootAndAntiUninstallPolicyResponse, UnmarshallerContext _ctx) {
		
		getBootAndAntiUninstallPolicyResponse.setRequestId(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.RequestId"));

		Strategy strategy = new Strategy();
		strategy.setCreateTime(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.CreateTime"));
		strategy.setUpdateTime(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.UpdateTime"));
		strategy.setIsBoot(_ctx.booleanValue("GetBootAndAntiUninstallPolicyResponse.Strategy.IsBoot"));
		strategy.setIsAntiUninstall(_ctx.booleanValue("GetBootAndAntiUninstallPolicyResponse.Strategy.IsAntiUninstall"));
		strategy.setAllowReport(_ctx.booleanValue("GetBootAndAntiUninstallPolicyResponse.Strategy.AllowReport"));
		strategy.setPolicyId(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.PolicyId"));
		strategy.setReportProcessId(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.ReportProcessId"));

		List<String> whitelistUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBootAndAntiUninstallPolicyResponse.Strategy.WhitelistUsers.Length"); i++) {
			whitelistUsers.add(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.WhitelistUsers["+ i +"]"));
		}
		strategy.setWhitelistUsers(whitelistUsers);

		List<String> userGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBootAndAntiUninstallPolicyResponse.Strategy.UserGroupIds.Length"); i++) {
			userGroupIds.add(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.UserGroupIds["+ i +"]"));
		}
		strategy.setUserGroupIds(userGroupIds);

		BlockContent blockContent = new BlockContent();

		BlockTextZh blockTextZh = new BlockTextZh();
		blockTextZh.setTitle(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextZh.Title"));
		blockTextZh.setContent(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextZh.Content"));
		blockTextZh.setMainButtonText(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextZh.MainButtonText"));
		blockTextZh.setMinorButtonText(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextZh.MinorButtonText"));
		blockContent.setBlockTextZh(blockTextZh);

		BlockTextEn blockTextEn = new BlockTextEn();
		blockTextEn.setTitle(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextEn.Title"));
		blockTextEn.setContent(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextEn.Content"));
		blockTextEn.setMainButtonText(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextEn.MainButtonText"));
		blockTextEn.setMinorButtonText(_ctx.stringValue("GetBootAndAntiUninstallPolicyResponse.Strategy.BlockContent.BlockTextEn.MinorButtonText"));
		blockContent.setBlockTextEn(blockTextEn);
		strategy.setBlockContent(blockContent);
		getBootAndAntiUninstallPolicyResponse.setStrategy(strategy);
	 
	 	return getBootAndAntiUninstallPolicyResponse;
	}
}