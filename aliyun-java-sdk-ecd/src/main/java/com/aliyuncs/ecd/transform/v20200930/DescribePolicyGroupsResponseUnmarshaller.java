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

import com.aliyuncs.ecd.model.v20200930.DescribePolicyGroupsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribePolicyGroupsResponse.DescribePolicyGroup;
import com.aliyuncs.ecd.model.v20200930.DescribePolicyGroupsResponse.DescribePolicyGroup.AuthorizeSecurityPolicyRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolicyGroupsResponseUnmarshaller {

	public static DescribePolicyGroupsResponse unmarshall(DescribePolicyGroupsResponse describePolicyGroupsResponse, UnmarshallerContext _ctx) {
		
		describePolicyGroupsResponse.setRequestId(_ctx.stringValue("DescribePolicyGroupsResponse.RequestId"));
		describePolicyGroupsResponse.setNextToken(_ctx.stringValue("DescribePolicyGroupsResponse.NextToken"));

		List<DescribePolicyGroup> describePolicyGroups = new ArrayList<DescribePolicyGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups.Length"); i++) {
			DescribePolicyGroup describePolicyGroup = new DescribePolicyGroup();
			describePolicyGroup.setPolicyGroupId(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PolicyGroupId"));
			describePolicyGroup.setPolicyGroupType(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PolicyGroupType"));
			describePolicyGroup.setClipboard(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].Clipboard"));
			describePolicyGroup.setLocalDrive(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].LocalDrive"));
			describePolicyGroup.setUsbRedirect(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].UsbRedirect"));
			describePolicyGroup.setVisualQuality(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].VisualQuality"));
			describePolicyGroup.setWatermark(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].Watermark"));
			describePolicyGroup.setName(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].Name"));
			describePolicyGroup.setWatermarkType(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkType"));
			describePolicyGroup.setWatermarkCustomText(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkCustomText"));
			describePolicyGroup.setWatermarkTransparency(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkTransparency"));
			describePolicyGroup.setPolicyStatus(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PolicyStatus"));
			describePolicyGroup.setEdsCount(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].EdsCount"));
			describePolicyGroup.setPreemptLogin(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PreemptLogin"));

			List<String> preemptLoginUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PreemptLoginUsers.Length"); j++) {
				preemptLoginUsers.add(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PreemptLoginUsers["+ j +"]"));
			}
			describePolicyGroup.setPreemptLoginUsers(preemptLoginUsers);

			List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules = new ArrayList<AuthorizeSecurityPolicyRule>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules.Length"); j++) {
				AuthorizeSecurityPolicyRule authorizeSecurityPolicyRule = new AuthorizeSecurityPolicyRule();
				authorizeSecurityPolicyRule.setType(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].Type"));
				authorizeSecurityPolicyRule.setIpProtocol(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].IpProtocol"));
				authorizeSecurityPolicyRule.setPortRange(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].PortRange"));
				authorizeSecurityPolicyRule.setCidrIp(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].CidrIp"));
				authorizeSecurityPolicyRule.setPolicy(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].Policy"));
				authorizeSecurityPolicyRule.setPriority(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].Priority"));
				authorizeSecurityPolicyRule.setDescription(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].Description"));

				authorizeSecurityPolicyRules.add(authorizeSecurityPolicyRule);
			}
			describePolicyGroup.setAuthorizeSecurityPolicyRules(authorizeSecurityPolicyRules);

			describePolicyGroups.add(describePolicyGroup);
		}
		describePolicyGroupsResponse.setDescribePolicyGroups(describePolicyGroups);
	 
	 	return describePolicyGroupsResponse;
	}
}