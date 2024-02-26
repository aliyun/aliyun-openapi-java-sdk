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
import com.aliyuncs.ecd.model.v20200930.DescribePolicyGroupsResponse.DescribePolicyGroup.DomainResolveRuleItem;
import com.aliyuncs.ecd.model.v20200930.DescribePolicyGroupsResponse.DescribePolicyGroup.NetRedirectRuleItem;
import com.aliyuncs.ecd.model.v20200930.DescribePolicyGroupsResponse.DescribePolicyGroup.UsbSupplyRedirectRuleItem;
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
			describePolicyGroup.setGpuAcceleration(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].GpuAcceleration"));
			describePolicyGroup.setDomainResolveRuleType(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].DomainResolveRuleType"));
			describePolicyGroup.setRecording(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].Recording"));
			describePolicyGroup.setRecordingStartTime(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].RecordingStartTime"));
			describePolicyGroup.setRecordingEndTime(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].RecordingEndTime"));
			describePolicyGroup.setRecordingFps(_ctx.longValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].RecordingFps"));
			describePolicyGroup.setRecordingExpires(_ctx.longValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].RecordingExpires"));
			describePolicyGroup.setCameraRedirect(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].CameraRedirect"));
			describePolicyGroup.setNetRedirect(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].NetRedirect"));
			describePolicyGroup.setAppContentProtection(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AppContentProtection"));
			describePolicyGroup.setRecordContent(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].RecordContent"));
			describePolicyGroup.setRecordContentExpires(_ctx.longValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].RecordContentExpires"));
			describePolicyGroup.setRemoteCoordinate(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].RemoteCoordinate"));
			describePolicyGroup.setRecordingDuration(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].RecordingDuration"));
			describePolicyGroup.setScope(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].Scope"));
			describePolicyGroup.setRecordingAudio(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].RecordingAudio"));
			describePolicyGroup.setInternetCommunicationProtocol(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].InternetCommunicationProtocol"));
			describePolicyGroup.setVideoRedirect(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].VideoRedirect"));
			describePolicyGroup.setWatermarkTransparencyValue(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkTransparencyValue"));
			describePolicyGroup.setWatermarkColor(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkColor"));
			describePolicyGroup.setWatermarkFontSize(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkFontSize"));
			describePolicyGroup.setWatermarkFontStyle(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkFontStyle"));
			describePolicyGroup.setWatermarkDegree(_ctx.doubleValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkDegree"));
			describePolicyGroup.setWatermarkRowAmount(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkRowAmount"));
			describePolicyGroup.setEndUserApplyAdminCoordinate(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].EndUserApplyAdminCoordinate"));
			describePolicyGroup.setEndUserGroupCoordinate(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].EndUserGroupCoordinate"));
			describePolicyGroup.setCpuProtectedMode(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].CpuProtectedMode"));
			describePolicyGroup.setCpuRateLimit(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].CpuRateLimit"));
			describePolicyGroup.setCpuSampleDuration(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].CpuSampleDuration"));
			describePolicyGroup.setCpuSingleRateLimit(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].CpuSingleRateLimit"));
			describePolicyGroup.setCpuDownGradeDuration(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].CpuDownGradeDuration"));
			describePolicyGroup.setMemoryProtectedMode(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].MemoryProtectedMode"));
			describePolicyGroup.setMemoryRateLimit(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].MemoryRateLimit"));
			describePolicyGroup.setMemorySampleDuration(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].MemorySampleDuration"));
			describePolicyGroup.setMemorySingleRateLimit(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].MemorySingleRateLimit"));
			describePolicyGroup.setMemoryDownGradeDuration(_ctx.integerValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].MemoryDownGradeDuration"));
			describePolicyGroup.setWatermarkSecurity(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkSecurity"));
			describePolicyGroup.setWatermarkAntiCam(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkAntiCam"));
			describePolicyGroup.setCloudHub(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].CloudHub"));
			describePolicyGroup.setWatermarkPower(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].WatermarkPower"));
			describePolicyGroup.setRecordingUserNotify(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].RecordingUserNotify"));
			describePolicyGroup.setRecordingUserNotifyMessage(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].RecordingUserNotifyMessage"));
			describePolicyGroup.setAdminAccess(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].AdminAccess"));

			List<String> preemptLoginUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PreemptLoginUsers.Length"); j++) {
				preemptLoginUsers.add(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].PreemptLoginUsers["+ j +"]"));
			}
			describePolicyGroup.setPreemptLoginUsers(preemptLoginUsers);

			List<String> scopeValue = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].ScopeValue.Length"); j++) {
				scopeValue.add(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].ScopeValue["+ j +"]"));
			}
			describePolicyGroup.setScopeValue(scopeValue);

			List<String> cpuProcessors = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].CpuProcessors.Length"); j++) {
				cpuProcessors.add(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].CpuProcessors["+ j +"]"));
			}
			describePolicyGroup.setCpuProcessors(cpuProcessors);

			List<String> memoryProcessors = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].MemoryProcessors.Length"); j++) {
				memoryProcessors.add(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].MemoryProcessors["+ j +"]"));
			}
			describePolicyGroup.setMemoryProcessors(memoryProcessors);

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

			List<UsbSupplyRedirectRuleItem> usbSupplyRedirectRule = new ArrayList<UsbSupplyRedirectRuleItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].UsbSupplyRedirectRule.Length"); j++) {
				UsbSupplyRedirectRuleItem usbSupplyRedirectRuleItem = new UsbSupplyRedirectRuleItem();
				usbSupplyRedirectRuleItem.setVendorId(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].UsbSupplyRedirectRule["+ j +"].VendorId"));
				usbSupplyRedirectRuleItem.setProductId(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].UsbSupplyRedirectRule["+ j +"].ProductId"));
				usbSupplyRedirectRuleItem.setDescription(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].UsbSupplyRedirectRule["+ j +"].Description"));
				usbSupplyRedirectRuleItem.setUsbRedirectType(_ctx.longValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].UsbSupplyRedirectRule["+ j +"].UsbRedirectType"));
				usbSupplyRedirectRuleItem.setDeviceClass(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].UsbSupplyRedirectRule["+ j +"].DeviceClass"));
				usbSupplyRedirectRuleItem.setDeviceSubclass(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].UsbSupplyRedirectRule["+ j +"].DeviceSubclass"));
				usbSupplyRedirectRuleItem.setUsbRuleType(_ctx.longValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].UsbSupplyRedirectRule["+ j +"].UsbRuleType"));

				usbSupplyRedirectRule.add(usbSupplyRedirectRuleItem);
			}
			describePolicyGroup.setUsbSupplyRedirectRule(usbSupplyRedirectRule);

			List<DomainResolveRuleItem> domainResolveRule = new ArrayList<DomainResolveRuleItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].DomainResolveRule.Length"); j++) {
				DomainResolveRuleItem domainResolveRuleItem = new DomainResolveRuleItem();
				domainResolveRuleItem.setDomain(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].DomainResolveRule["+ j +"].Domain"));
				domainResolveRuleItem.setPolicy(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].DomainResolveRule["+ j +"].Policy"));
				domainResolveRuleItem.setDescription(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].DomainResolveRule["+ j +"].Description"));

				domainResolveRule.add(domainResolveRuleItem);
			}
			describePolicyGroup.setDomainResolveRule(domainResolveRule);

			List<NetRedirectRuleItem> netRedirectRule = new ArrayList<NetRedirectRuleItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].NetRedirectRule.Length"); j++) {
				NetRedirectRuleItem netRedirectRuleItem = new NetRedirectRuleItem();
				netRedirectRuleItem.setDomain(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].NetRedirectRule["+ j +"].Domain"));
				netRedirectRuleItem.setRuleType(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].NetRedirectRule["+ j +"].RuleType"));
				netRedirectRuleItem.setPolicy(_ctx.stringValue("DescribePolicyGroupsResponse.DescribePolicyGroups["+ i +"].NetRedirectRule["+ j +"].Policy"));

				netRedirectRule.add(netRedirectRuleItem);
			}
			describePolicyGroup.setNetRedirectRule(netRedirectRule);

			describePolicyGroups.add(describePolicyGroup);
		}
		describePolicyGroupsResponse.setDescribePolicyGroups(describePolicyGroups);
	 
	 	return describePolicyGroupsResponse;
	}
}