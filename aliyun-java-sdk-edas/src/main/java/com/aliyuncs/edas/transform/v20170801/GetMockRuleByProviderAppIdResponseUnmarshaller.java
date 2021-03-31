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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.GetMockRuleByProviderAppIdResponse;
import com.aliyuncs.edas.model.v20170801.GetMockRuleByProviderAppIdResponse.RuleItemList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMockRuleByProviderAppIdResponseUnmarshaller {

	public static GetMockRuleByProviderAppIdResponse unmarshall(GetMockRuleByProviderAppIdResponse getMockRuleByProviderAppIdResponse, UnmarshallerContext _ctx) {
		
		getMockRuleByProviderAppIdResponse.setRequestId(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.RequestId"));
		getMockRuleByProviderAppIdResponse.setCode(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Code"));
		getMockRuleByProviderAppIdResponse.setHttpCode(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.HttpCode"));
		getMockRuleByProviderAppIdResponse.setMessage(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Message"));
		getMockRuleByProviderAppIdResponse.setSuccess(_ctx.booleanValue("GetMockRuleByProviderAppIdResponse.Success"));

		List<RuleItemList> data = new ArrayList<RuleItemList>();
		for (int i = 0; i < _ctx.lengthValue("GetMockRuleByProviderAppIdResponse.Data.Length"); i++) {
			RuleItemList ruleItemList = new RuleItemList();
			ruleItemList.setAccountId(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].AccountId"));
			ruleItemList.setName(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].Name"));
			ruleItemList.setConsumerAppId(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].ConsumerAppId"));
			ruleItemList.setConsumerAppName(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].ConsumerAppName"));
			ruleItemList.setEnable(_ctx.booleanValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].Enable"));
			ruleItemList.setExtraJson(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].ExtraJson"));
			ruleItemList.setId(_ctx.longValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].Id"));
			ruleItemList.setNamespaceId(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].NamespaceId"));
			ruleItemList.setProviderAppId(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].ProviderAppId"));
			ruleItemList.setProviderAppName(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].ProviderAppName"));
			ruleItemList.setRegion(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].Region"));
			ruleItemList.setScMockItemJson(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].ScMockItemJson"));
			ruleItemList.setSource(_ctx.stringValue("GetMockRuleByProviderAppIdResponse.Data["+ i +"].Source"));

			data.add(ruleItemList);
		}
		getMockRuleByProviderAppIdResponse.setData(data);
	 
	 	return getMockRuleByProviderAppIdResponse;
	}
}