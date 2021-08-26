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
import com.aliyuncs.ecd.model.v20200930.DescribePolicyGroupsResponse.DescribePolicyGroup.AuthorizeAccessPolicyRule;
import com.aliyuncs.ecd.model.v20200930.DescribePolicyGroupsResponse.DescribePolicyGroup.AuthorizeSecurityPolicyRule;
import com.aliyuncs.ecd.model.v20200930.DescribePolicyGroupsResponse.DescribePolicyGroup.ClientType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolicyGroupsResponseUnmarshaller {

	public static DescribePolicyGroupsResponse unmarshall(DescribePolicyGroupsResponse describePolicyGroupsResponse, UnmarshallerContext _ctx) {
		
		describePolicyGroupsResponse.setRequestId(_ctx.stringValue("DescribePolicyGroupsResponse.RequestId"));
		describePolicyGroupsResponse.setNextToken(_ctx.stringValue("DescribePolicyGroupsResponse.NextToken"));

		List<DescribePolicyGroup> describePolicyGroups = new ArrayList<DescribePolicyGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups.Length"); i++) {
			DescribePolicyGroup describePolicyGroup = new DescribePolicyGroup();
			describePolicyGroup.setPolicyStatus(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PolicyStatus"));
			describePolicyGroup.setHtml5Access(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].Html5Access"));
			describePolicyGroup.setWatermarkType(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkType"));
			describePolicyGroup.setPreemptLogin(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PreemptLogin"));
			describePolicyGroup.setWatermarkCustomText(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkCustomText"));
			describePolicyGroup.setClipboard(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].Clipboard"));
			describePolicyGroup.setDomainList(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].DomainList"));
			describePolicyGroup.setPolicyGroupId(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PolicyGroupId"));
			describePolicyGroup.setPrinterRedirection(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PrinterRedirection"));
			describePolicyGroup.setWatermarkTransparency(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkTransparency"));
			describePolicyGroup.setHtml5FileTransfer(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].Html5FileTransfer"));
			describePolicyGroup.setUsbRedirect(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].UsbRedirect"));
			describePolicyGroup.setPolicyGroupType(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PolicyGroupType"));
			describePolicyGroup.setWatermark(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].Watermark"));
			describePolicyGroup.setVisualQuality(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].VisualQuality"));
			describePolicyGroup.setEdsCount(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].EdsCount"));
			describePolicyGroup.setName(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].Name"));
			describePolicyGroup.setLocalDrive(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].LocalDrive"));

			List<String> preemptLoginUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PreemptLoginUsers.Length"); j++) {
				preemptLoginUsers.add(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PreemptLoginUsers["+ j +"]"));
			}
			describePolicyGroup.setPreemptLoginUsers(preemptLoginUsers);

			List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules = new ArrayList<AuthorizeSecurityPolicyRule>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules.Length"); j++) {
				AuthorizeSecurityPolicyRule authorizeSecurityPolicyRule = new AuthorizeSecurityPolicyRule();
				authorizeSecurityPolicyRule.setType(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].Type"));
				authorizeSecurityPolicyRule.setPolicy(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].Policy"));
				authorizeSecurityPolicyRule.setDescription(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].Description"));
				authorizeSecurityPolicyRule.setPortRange(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].PortRange"));
				authorizeSecurityPolicyRule.setIpProtocol(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].IpProtocol"));
				authorizeSecurityPolicyRule.setPriority(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].Priority"));
				authorizeSecurityPolicyRule.setCidrIp(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeSecurityPolicyRules["+ j +"].CidrIp"));

				authorizeSecurityPolicyRules.add(authorizeSecurityPolicyRule);
			}
			describePolicyGroup.setAuthorizeSecurityPolicyRules(authorizeSecurityPolicyRules);

			List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRules = new ArrayList<AuthorizeAccessPolicyRule>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeAccessPolicyRules.Length"); j++) {
				AuthorizeAccessPolicyRule authorizeAccessPolicyRule = new AuthorizeAccessPolicyRule();
				authorizeAccessPolicyRule.setDescription(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeAccessPolicyRules["+ j +"].Description"));
				authorizeAccessPolicyRule.setCidrIp(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AuthorizeAccessPolicyRules["+ j +"].CidrIp"));

				authorizeAccessPolicyRules.add(authorizeAccessPolicyRule);
			}
			describePolicyGroup.setAuthorizeAccessPolicyRules(authorizeAccessPolicyRules);

			List<ClientType> clientTypes = new ArrayList<ClientType>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].ClientTypes.Length"); j++) {
				ClientType clientType = new ClientType();
				clientType.setStatus(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].ClientTypes["+ j +"].Status"));
				clientType.setClientType(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].ClientTypes["+ j +"].ClientType"));

				clientTypes.add(clientType);
			}
			describePolicyGroup.setClientTypes(clientTypes);

			describePolicyGroups.add(describePolicyGroup);
		}
		describePolicyGroupsResponse.setDescribePolicyGroups(describePolicyGroups);
	 
	 	return describePolicyGroupsResponse;
	}
}