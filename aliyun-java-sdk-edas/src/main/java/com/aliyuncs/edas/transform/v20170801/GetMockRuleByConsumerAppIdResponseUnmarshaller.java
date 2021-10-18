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

import com.aliyuncs.edas.model.v20170801.GetMockRuleByConsumerAppIdResponse;
import com.aliyuncs.edas.model.v20170801.GetMockRuleByConsumerAppIdResponse.RuleItemList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMockRuleByConsumerAppIdResponseUnmarshaller {

	public static GetMockRuleByConsumerAppIdResponse unmarshall(GetMockRuleByConsumerAppIdResponse getMockRuleByConsumerAppIdResponse, UnmarshallerContext _ctx) {
		
		getMockRuleByConsumerAppIdResponse.setRequestId(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.RequestId"));
		getMockRuleByConsumerAppIdResponse.setCode(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Code"));
		getMockRuleByConsumerAppIdResponse.setMessage(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Message"));
		getMockRuleByConsumerAppIdResponse.setHttpCode(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.HttpCode"));
		getMockRuleByConsumerAppIdResponse.setSuccess(_ctx.booleanValue("GetMockRuleByConsumerAppIdResponse.Success"));

		List<RuleItemList> data = new ArrayList<RuleItemList>();
		for (int i = 0; i < _ctx.lengthValue("GetMockRuleByConsumerAppIdResponse.Data.Length"); i++) {
			RuleItemList ruleItemList = new RuleItemList();
			ruleItemList.setNamespaceId(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].NamespaceId"));
			ruleItemList.setScMockItemJson(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].ScMockItemJson"));
			ruleItemList.setConsumerAppName(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].ConsumerAppName"));
			ruleItemList.setAccountId(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].AccountId"));
			ruleItemList.setConsumerAppId(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].ConsumerAppId"));
			ruleItemList.setExtraJson(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].ExtraJson"));
			ruleItemList.setSource(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].Source"));
			ruleItemList.setRegion(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].Region"));
			ruleItemList.setProviderAppId(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].ProviderAppId"));
			ruleItemList.setName(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].Name"));
			ruleItemList.setProviderAppName(_ctx.stringValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].ProviderAppName"));
			ruleItemList.setId(_ctx.longValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].Id"));
			ruleItemList.setEnable(_ctx.booleanValue("GetMockRuleByConsumerAppIdResponse.Data["+ i +"].Enable"));

			data.add(ruleItemList);
		}
		getMockRuleByConsumerAppIdResponse.setData(data);
	 
	 	return getMockRuleByConsumerAppIdResponse;
	}
}