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

import com.aliyuncs.edas.model.v20170801.GetAccountMockRuleResponse;
import com.aliyuncs.edas.model.v20170801.GetAccountMockRuleResponse.Data;
import com.aliyuncs.edas.model.v20170801.GetAccountMockRuleResponse.Data.MseMockRules;
import com.aliyuncs.edas.model.v20170801.GetAccountMockRuleResponse.Data.MseMockRules.DubboMockItem;
import com.aliyuncs.edas.model.v20170801.GetAccountMockRuleResponse.Data.MseMockRules.SpringCloudMockItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountMockRuleResponseUnmarshaller {

	public static GetAccountMockRuleResponse unmarshall(GetAccountMockRuleResponse getAccountMockRuleResponse, UnmarshallerContext _ctx) {
		
		getAccountMockRuleResponse.setCode(_ctx.stringValue("GetAccountMockRuleResponse.Code"));
		getAccountMockRuleResponse.setMessage(_ctx.stringValue("GetAccountMockRuleResponse.Message"));
		getAccountMockRuleResponse.setSuccess(_ctx.booleanValue("GetAccountMockRuleResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("GetAccountMockRuleResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("GetAccountMockRuleResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("GetAccountMockRuleResponse.Data.TotalSize"));

		List<MseMockRules> result = new ArrayList<MseMockRules>();
		for (int i = 0; i < _ctx.lengthValue("GetAccountMockRuleResponse.Data.Result.Length"); i++) {
			MseMockRules mseMockRules = new MseMockRules();
			mseMockRules.setId(_ctx.integerValue("GetAccountMockRuleResponse.Data.Result["+ i +"].Id"));
			mseMockRules.setName(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].Name"));
			mseMockRules.setRegion(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].Region"));
			mseMockRules.setEnable(_ctx.booleanValue("GetAccountMockRuleResponse.Data.Result["+ i +"].Enable"));
			mseMockRules.setStatus(_ctx.integerValue("GetAccountMockRuleResponse.Data.Result["+ i +"].Status"));
			mseMockRules.setProviderAppId(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].ProviderAppId"));
			mseMockRules.setProviderAppName(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].ProviderAppName"));
			mseMockRules.setConsumerAppId(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].ConsumerAppId"));
			mseMockRules.setConsumerAppName(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].ConsumerAppName"));
			mseMockRules.setGmtCreate(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].GmtCreate"));
			mseMockRules.setGmtModified(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].GmtModified"));

			List<DubboMockItem> dubboMockItems = new ArrayList<DubboMockItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAccountMockRuleResponse.Data.Result["+ i +"].DubboMockItems.Length"); j++) {
				DubboMockItem dubboMockItem = new DubboMockItem();
				dubboMockItem.setMethodName(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].DubboMockItems["+ j +"].MethodName"));
				dubboMockItem.setOper(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].DubboMockItems["+ j +"].Oper"));
				dubboMockItem.setExceptionClassName(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].DubboMockItems["+ j +"].ExceptionClassName"));
				dubboMockItem.setServiceName(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].DubboMockItems["+ j +"].ServiceName"));
				dubboMockItem.setValue(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].DubboMockItems["+ j +"].Value"));
				dubboMockItem.setVersion(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].DubboMockItems["+ j +"].Version"));
				dubboMockItem.setExecuteCondition(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].DubboMockItems["+ j +"].ExecuteCondition"));
				dubboMockItem.setGroup(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].DubboMockItems["+ j +"].Group"));

				List<String> paramTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetAccountMockRuleResponse.Data.Result["+ i +"].DubboMockItems["+ j +"].ParamTypes.Length"); k++) {
					paramTypes.add(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].DubboMockItems["+ j +"].ParamTypes["+ k +"]"));
				}
				dubboMockItem.setParamTypes(paramTypes);

				dubboMockItems.add(dubboMockItem);
			}
			mseMockRules.setDubboMockItems(dubboMockItems);

			List<SpringCloudMockItem> scMockItems = new ArrayList<SpringCloudMockItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAccountMockRuleResponse.Data.Result["+ i +"].ScMockItems.Length"); j++) {
				SpringCloudMockItem springCloudMockItem = new SpringCloudMockItem();
				springCloudMockItem.setExceptionClassName(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].ScMockItems["+ j +"].ExceptionClassName"));
				springCloudMockItem.setExecuteCondition(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].ScMockItems["+ j +"].ExecuteCondition"));
				springCloudMockItem.setBizMethod(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].ScMockItems["+ j +"].Method"));
				springCloudMockItem.setOper(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].ScMockItems["+ j +"].Oper"));
				springCloudMockItem.setPath(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].ScMockItems["+ j +"].Path"));
				springCloudMockItem.setServiceName(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].ScMockItems["+ j +"].ServiceName"));
				springCloudMockItem.setValue(_ctx.stringValue("GetAccountMockRuleResponse.Data.Result["+ i +"].ScMockItems["+ j +"].Value"));

				scMockItems.add(springCloudMockItem);
			}
			mseMockRules.setScMockItems(scMockItems);

			result.add(mseMockRules);
		}
		data.setResult(result);
		getAccountMockRuleResponse.setData(data);
	 
	 	return getAccountMockRuleResponse;
	}
}