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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.ListPolicyGroupsResponse;
import com.aliyuncs.eds_aic.model.v20230930.ListPolicyGroupsResponse.Data;
import com.aliyuncs.eds_aic.model.v20230930.ListPolicyGroupsResponse.Data.NetRedirectPolicy;
import com.aliyuncs.eds_aic.model.v20230930.ListPolicyGroupsResponse.Data.NetRedirectPolicy.RulesItem;
import com.aliyuncs.eds_aic.model.v20230930.ListPolicyGroupsResponse.Data.PolicyConfigList;
import com.aliyuncs.eds_aic.model.v20230930.ListPolicyGroupsResponse.Data.PolicyRelatedResources;
import com.aliyuncs.eds_aic.model.v20230930.ListPolicyGroupsResponse.Data.Watermark;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPolicyGroupsResponseUnmarshaller {

	public static ListPolicyGroupsResponse unmarshall(ListPolicyGroupsResponse listPolicyGroupsResponse, UnmarshallerContext _ctx) {
		
		listPolicyGroupsResponse.setRequestId(_ctx.stringValue("ListPolicyGroupsResponse.RequestId"));
		listPolicyGroupsResponse.setTotalCount(_ctx.integerValue("ListPolicyGroupsResponse.TotalCount"));
		listPolicyGroupsResponse.setNextToken(_ctx.stringValue("ListPolicyGroupsResponse.NextToken"));

		List<Data> policyGroupModel = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListPolicyGroupsResponse.PolicyGroupModel.Length"); i++) {
			Data data = new Data();
			data.setPolicyGroupId(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].PolicyGroupId"));
			data.setPolicyGroupName(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].PolicyGroupName"));
			data.setGmtCreate(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].GmtCreate"));
			data.setClipboard(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].Clipboard"));
			data.setHtml5FileTransfer(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].Html5FileTransfer"));
			data.setCameraRedirect(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].CameraRedirect"));
			data.setLocalDrive(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].LocalDrive"));
			data.setLockResolution(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].LockResolution"));
			data.setSessionResolutionHeight(_ctx.integerValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].SessionResolutionHeight"));
			data.setSessionResolutionWidth(_ctx.integerValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].SessionResolutionWidth"));

			NetRedirectPolicy netRedirectPolicy = new NetRedirectPolicy();
			netRedirectPolicy.setNetRedirect(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].NetRedirectPolicy.NetRedirect"));
			netRedirectPolicy.setCustomProxy(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].NetRedirectPolicy.CustomProxy"));
			netRedirectPolicy.setProxyType(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].NetRedirectPolicy.ProxyType"));
			netRedirectPolicy.setHostAddr(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].NetRedirectPolicy.HostAddr"));
			netRedirectPolicy.setPort(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].NetRedirectPolicy.Port"));
			netRedirectPolicy.setProxyUserName(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].NetRedirectPolicy.ProxyUserName"));
			netRedirectPolicy.setProxyPassword(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].NetRedirectPolicy.ProxyPassword"));

			List<RulesItem> rules = new ArrayList<RulesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].NetRedirectPolicy.Rules.Length"); j++) {
				RulesItem rulesItem = new RulesItem();
				rulesItem.setTarget(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].NetRedirectPolicy.Rules["+ j +"].Target"));
				rulesItem.setRuleType(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].NetRedirectPolicy.Rules["+ j +"].RuleType"));

				rules.add(rulesItem);
			}
			netRedirectPolicy.setRules(rules);
			data.setNetRedirectPolicy(netRedirectPolicy);

			PolicyRelatedResources policyRelatedResources = new PolicyRelatedResources();

			List<String> androidInstanceGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].PolicyRelatedResources.AndroidInstanceGroupIds.Length"); j++) {
				androidInstanceGroupIds.add(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].PolicyRelatedResources.AndroidInstanceGroupIds["+ j +"]"));
			}
			policyRelatedResources.setAndroidInstanceGroupIds(androidInstanceGroupIds);

			List<String> cloudPhoneMatrixIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].PolicyRelatedResources.CloudPhoneMatrixIds.Length"); j++) {
				cloudPhoneMatrixIds.add(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].PolicyRelatedResources.CloudPhoneMatrixIds["+ j +"]"));
			}
			policyRelatedResources.setCloudPhoneMatrixIds(cloudPhoneMatrixIds);
			data.setPolicyRelatedResources(policyRelatedResources);

			Watermark watermark = new Watermark();
			watermark.setWatermarkSwitch(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].Watermark.WatermarkSwitch"));
			watermark.setWatermarkCustomText(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].Watermark.WatermarkCustomText"));
			watermark.setWatermarkFontSize(_ctx.integerValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].Watermark.WatermarkFontSize"));
			watermark.setWatermarkColor(_ctx.integerValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].Watermark.WatermarkColor"));
			watermark.setWatermarkTransparencyValue(_ctx.integerValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].Watermark.WatermarkTransparencyValue"));

			List<String> watermarkTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].Watermark.WatermarkTypes.Length"); j++) {
				watermarkTypes.add(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].Watermark.WatermarkTypes["+ j +"]"));
			}
			watermark.setWatermarkTypes(watermarkTypes);
			data.setWatermark(watermark);

			List<PolicyConfigList> policyConfigs = new ArrayList<PolicyConfigList>();
			for (int j = 0; j < _ctx.lengthValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].PolicyConfigs.Length"); j++) {
				PolicyConfigList policyConfigList = new PolicyConfigList();
				policyConfigList.setConfigKey(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].PolicyConfigs["+ j +"].ConfigKey"));
				policyConfigList.setConfigValue(_ctx.stringValue("ListPolicyGroupsResponse.PolicyGroupModel["+ i +"].PolicyConfigs["+ j +"].ConfigValue"));

				policyConfigs.add(policyConfigList);
			}
			data.setPolicyConfigs(policyConfigs);

			policyGroupModel.add(data);
		}
		listPolicyGroupsResponse.setPolicyGroupModel(policyGroupModel);
	 
	 	return listPolicyGroupsResponse;
	}
}