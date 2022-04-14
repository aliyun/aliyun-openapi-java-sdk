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

import com.aliyuncs.edas.model.v20170801.DisableMockRuleResponse;
import com.aliyuncs.edas.model.v20170801.DisableMockRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableMockRuleResponseUnmarshaller {

	public static DisableMockRuleResponse unmarshall(DisableMockRuleResponse disableMockRuleResponse, UnmarshallerContext _ctx) {
		
		disableMockRuleResponse.setRequestId(_ctx.stringValue("DisableMockRuleResponse.RequestId"));
		disableMockRuleResponse.setCode(_ctx.integerValue("DisableMockRuleResponse.Code"));
		disableMockRuleResponse.setMessage(_ctx.stringValue("DisableMockRuleResponse.Message"));
		disableMockRuleResponse.setSuccess(_ctx.booleanValue("DisableMockRuleResponse.Success"));

		Data data = new Data();
		data.setNamespaceId(_ctx.stringValue("DisableMockRuleResponse.Data.NamespaceId"));
		data.setScMockItemJson(_ctx.stringValue("DisableMockRuleResponse.Data.ScMockItemJson"));
		data.setConsumerAppName(_ctx.stringValue("DisableMockRuleResponse.Data.ConsumerAppName"));
		data.setAccountId(_ctx.stringValue("DisableMockRuleResponse.Data.AccountId"));
		data.setConsumerAppId(_ctx.stringValue("DisableMockRuleResponse.Data.ConsumerAppId"));
		data.setExtraJson(_ctx.stringValue("DisableMockRuleResponse.Data.ExtraJson"));
		data.setSource(_ctx.stringValue("DisableMockRuleResponse.Data.Source"));
		data.setRegion(_ctx.stringValue("DisableMockRuleResponse.Data.Region"));
		data.setProviderAppId(_ctx.stringValue("DisableMockRuleResponse.Data.ProviderAppId"));
		data.setName(_ctx.stringValue("DisableMockRuleResponse.Data.Name"));
		data.setProviderAppName(_ctx.stringValue("DisableMockRuleResponse.Data.ProviderAppName"));
		data.setId(_ctx.longValue("DisableMockRuleResponse.Data.Id"));
		data.setEnable(_ctx.booleanValue("DisableMockRuleResponse.Data.Enable"));
		disableMockRuleResponse.setData(data);
	 
	 	return disableMockRuleResponse;
	}
}