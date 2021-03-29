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

import com.aliyuncs.edas.model.v20170801.EnableMockRuleResponse;
import com.aliyuncs.edas.model.v20170801.EnableMockRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableMockRuleResponseUnmarshaller {

	public static EnableMockRuleResponse unmarshall(EnableMockRuleResponse enableMockRuleResponse, UnmarshallerContext _ctx) {
		
		enableMockRuleResponse.setRequestId(_ctx.stringValue("EnableMockRuleResponse.RequestId"));
		enableMockRuleResponse.setCode(_ctx.integerValue("EnableMockRuleResponse.Code"));
		enableMockRuleResponse.setMessage(_ctx.stringValue("EnableMockRuleResponse.Message"));
		enableMockRuleResponse.setSuccess(_ctx.booleanValue("EnableMockRuleResponse.Success"));

		Data data = new Data();
		data.setAccountId(_ctx.stringValue("EnableMockRuleResponse.Data.AccountId"));
		data.setName(_ctx.stringValue("EnableMockRuleResponse.Data.Name"));
		data.setConsumerAppId(_ctx.stringValue("EnableMockRuleResponse.Data.ConsumerAppId"));
		data.setConsumerAppName(_ctx.stringValue("EnableMockRuleResponse.Data.ConsumerAppName"));
		data.setEnable(_ctx.booleanValue("EnableMockRuleResponse.Data.Enable"));
		data.setExtraJson(_ctx.stringValue("EnableMockRuleResponse.Data.ExtraJson"));
		data.setId(_ctx.longValue("EnableMockRuleResponse.Data.Id"));
		data.setNamespaceId(_ctx.stringValue("EnableMockRuleResponse.Data.NamespaceId"));
		data.setProviderAppId(_ctx.stringValue("EnableMockRuleResponse.Data.ProviderAppId"));
		data.setProviderAppName(_ctx.stringValue("EnableMockRuleResponse.Data.ProviderAppName"));
		data.setRegion(_ctx.stringValue("EnableMockRuleResponse.Data.Region"));
		data.setScMockItemJson(_ctx.stringValue("EnableMockRuleResponse.Data.ScMockItemJson"));
		data.setSource(_ctx.stringValue("EnableMockRuleResponse.Data.Source"));
		enableMockRuleResponse.setData(data);
	 
	 	return enableMockRuleResponse;
	}
}