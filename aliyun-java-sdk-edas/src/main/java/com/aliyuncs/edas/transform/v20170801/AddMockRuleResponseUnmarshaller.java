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

import com.aliyuncs.edas.model.v20170801.AddMockRuleResponse;
import com.aliyuncs.edas.model.v20170801.AddMockRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMockRuleResponseUnmarshaller {

	public static AddMockRuleResponse unmarshall(AddMockRuleResponse addMockRuleResponse, UnmarshallerContext _ctx) {
		
		addMockRuleResponse.setRequestId(_ctx.stringValue("AddMockRuleResponse.RequestId"));
		addMockRuleResponse.setCode(_ctx.integerValue("AddMockRuleResponse.Code"));
		addMockRuleResponse.setMessage(_ctx.stringValue("AddMockRuleResponse.Message"));
		addMockRuleResponse.setSuccess(_ctx.booleanValue("AddMockRuleResponse.Success"));

		Data data = new Data();
		data.setAccountId(_ctx.stringValue("AddMockRuleResponse.Data.AccountId"));
		data.setName(_ctx.stringValue("AddMockRuleResponse.Data.Name"));
		data.setConsumerAppId(_ctx.stringValue("AddMockRuleResponse.Data.ConsumerAppId"));
		data.setConsumerAppName(_ctx.stringValue("AddMockRuleResponse.Data.ConsumerAppName"));
		data.setEnable(_ctx.booleanValue("AddMockRuleResponse.Data.Enable"));
		data.setExtraJson(_ctx.stringValue("AddMockRuleResponse.Data.ExtraJson"));
		data.setId(_ctx.longValue("AddMockRuleResponse.Data.Id"));
		data.setNamespaceId(_ctx.stringValue("AddMockRuleResponse.Data.NamespaceId"));
		data.setProviderAppId(_ctx.stringValue("AddMockRuleResponse.Data.ProviderAppId"));
		data.setProviderAppName(_ctx.stringValue("AddMockRuleResponse.Data.ProviderAppName"));
		data.setRegion(_ctx.stringValue("AddMockRuleResponse.Data.Region"));
		data.setScMockItemJson(_ctx.stringValue("AddMockRuleResponse.Data.ScMockItemJson"));
		data.setSource(_ctx.stringValue("AddMockRuleResponse.Data.Source"));
		addMockRuleResponse.setData(data);
	 
	 	return addMockRuleResponse;
	}
}