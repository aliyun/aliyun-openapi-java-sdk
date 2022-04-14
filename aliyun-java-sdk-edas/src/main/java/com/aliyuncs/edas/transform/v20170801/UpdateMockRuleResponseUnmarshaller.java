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

import com.aliyuncs.edas.model.v20170801.UpdateMockRuleResponse;
import com.aliyuncs.edas.model.v20170801.UpdateMockRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMockRuleResponseUnmarshaller {

	public static UpdateMockRuleResponse unmarshall(UpdateMockRuleResponse updateMockRuleResponse, UnmarshallerContext _ctx) {
		
		updateMockRuleResponse.setRequestId(_ctx.stringValue("UpdateMockRuleResponse.RequestId"));
		updateMockRuleResponse.setCode(_ctx.stringValue("UpdateMockRuleResponse.Code"));
		updateMockRuleResponse.setMessage(_ctx.stringValue("UpdateMockRuleResponse.Message"));
		updateMockRuleResponse.setHttpCode(_ctx.stringValue("UpdateMockRuleResponse.HttpCode"));
		updateMockRuleResponse.setSuccess(_ctx.booleanValue("UpdateMockRuleResponse.Success"));

		Data data = new Data();
		data.setNamespaceId(_ctx.stringValue("UpdateMockRuleResponse.Data.NamespaceId"));
		data.setScMockItemJson(_ctx.stringValue("UpdateMockRuleResponse.Data.ScMockItemJson"));
		data.setConsumerAppName(_ctx.stringValue("UpdateMockRuleResponse.Data.ConsumerAppName"));
		data.setAccountId(_ctx.stringValue("UpdateMockRuleResponse.Data.AccountId"));
		data.setConsumerAppId(_ctx.stringValue("UpdateMockRuleResponse.Data.ConsumerAppId"));
		data.setExtraJson(_ctx.stringValue("UpdateMockRuleResponse.Data.ExtraJson"));
		data.setSource(_ctx.stringValue("UpdateMockRuleResponse.Data.Source"));
		data.setRegion(_ctx.stringValue("UpdateMockRuleResponse.Data.Region"));
		data.setDubboMockItemJson(_ctx.stringValue("UpdateMockRuleResponse.Data.DubboMockItemJson"));
		data.setProviderAppId(_ctx.stringValue("UpdateMockRuleResponse.Data.ProviderAppId"));
		data.setName(_ctx.stringValue("UpdateMockRuleResponse.Data.Name"));
		data.setProviderAppName(_ctx.stringValue("UpdateMockRuleResponse.Data.ProviderAppName"));
		data.setId(_ctx.longValue("UpdateMockRuleResponse.Data.Id"));
		data.setEnable(_ctx.booleanValue("UpdateMockRuleResponse.Data.Enable"));
		updateMockRuleResponse.setData(data);
	 
	 	return updateMockRuleResponse;
	}
}