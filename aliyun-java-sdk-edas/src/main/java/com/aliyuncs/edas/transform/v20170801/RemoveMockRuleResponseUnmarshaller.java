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

import com.aliyuncs.edas.model.v20170801.RemoveMockRuleResponse;
import com.aliyuncs.edas.model.v20170801.RemoveMockRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveMockRuleResponseUnmarshaller {

	public static RemoveMockRuleResponse unmarshall(RemoveMockRuleResponse removeMockRuleResponse, UnmarshallerContext _ctx) {
		
		removeMockRuleResponse.setRequestId(_ctx.stringValue("RemoveMockRuleResponse.RequestId"));
		removeMockRuleResponse.setCode(_ctx.stringValue("RemoveMockRuleResponse.Code"));
		removeMockRuleResponse.setHttpCode(_ctx.stringValue("RemoveMockRuleResponse.HttpCode"));
		removeMockRuleResponse.setMessage(_ctx.stringValue("RemoveMockRuleResponse.Message"));
		removeMockRuleResponse.setSuccess(_ctx.booleanValue("RemoveMockRuleResponse.Success"));

		Data data = new Data();
		data.setAccountId(_ctx.stringValue("RemoveMockRuleResponse.Data.AccountId"));
		data.setName(_ctx.stringValue("RemoveMockRuleResponse.Data.Name"));
		data.setConsumerAppId(_ctx.stringValue("RemoveMockRuleResponse.Data.ConsumerAppId"));
		data.setConsumerAppName(_ctx.stringValue("RemoveMockRuleResponse.Data.ConsumerAppName"));
		data.setEnable(_ctx.booleanValue("RemoveMockRuleResponse.Data.Enable"));
		data.setExtraJson(_ctx.stringValue("RemoveMockRuleResponse.Data.ExtraJson"));
		data.setId(_ctx.longValue("RemoveMockRuleResponse.Data.Id"));
		data.setNamespaceId(_ctx.stringValue("RemoveMockRuleResponse.Data.NamespaceId"));
		data.setProviderAppId(_ctx.stringValue("RemoveMockRuleResponse.Data.ProviderAppId"));
		data.setProviderAppName(_ctx.stringValue("RemoveMockRuleResponse.Data.ProviderAppName"));
		data.setRegion(_ctx.stringValue("RemoveMockRuleResponse.Data.Region"));
		data.setScMockItemJson(_ctx.stringValue("RemoveMockRuleResponse.Data.ScMockItemJson"));
		data.setSource(_ctx.stringValue("RemoveMockRuleResponse.Data.Source"));
		removeMockRuleResponse.setData(data);
	 
	 	return removeMockRuleResponse;
	}
}