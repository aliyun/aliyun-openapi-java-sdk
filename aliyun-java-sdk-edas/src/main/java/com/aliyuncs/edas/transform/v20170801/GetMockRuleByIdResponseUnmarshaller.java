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

import com.aliyuncs.edas.model.v20170801.GetMockRuleByIdResponse;
import com.aliyuncs.edas.model.v20170801.GetMockRuleByIdResponse.Data;
import com.aliyuncs.edas.model.v20170801.GetMockRuleByIdResponse.Data.DubboMockItem;
import com.aliyuncs.edas.model.v20170801.GetMockRuleByIdResponse.Data.SpringCloudMockItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMockRuleByIdResponseUnmarshaller {

	public static GetMockRuleByIdResponse unmarshall(GetMockRuleByIdResponse getMockRuleByIdResponse, UnmarshallerContext _ctx) {
		
		getMockRuleByIdResponse.setRequestId(_ctx.stringValue("GetMockRuleByIdResponse.RequestId"));
		getMockRuleByIdResponse.setCode(_ctx.stringValue("GetMockRuleByIdResponse.Code"));
		getMockRuleByIdResponse.setMessage(_ctx.stringValue("GetMockRuleByIdResponse.Message"));
		getMockRuleByIdResponse.setSuccess(_ctx.booleanValue("GetMockRuleByIdResponse.Success"));

		Data data = new Data();
		data.setAccountId(_ctx.stringValue("GetMockRuleByIdResponse.Data.AccountId"));
		data.setName(_ctx.stringValue("GetMockRuleByIdResponse.Data.Name"));
		data.setConsumerAppId(_ctx.stringValue("GetMockRuleByIdResponse.Data.ConsumerAppId"));
		data.setConsumerAppName(_ctx.stringValue("GetMockRuleByIdResponse.Data.ConsumerAppName"));
		data.setEnable(_ctx.booleanValue("GetMockRuleByIdResponse.Data.Enable"));
		data.setExtraJson(_ctx.stringValue("GetMockRuleByIdResponse.Data.ExtraJson"));
		data.setId(_ctx.longValue("GetMockRuleByIdResponse.Data.Id"));
		data.setProviderAppId(_ctx.stringValue("GetMockRuleByIdResponse.Data.ProviderAppId"));
		data.setProviderAppName(_ctx.stringValue("GetMockRuleByIdResponse.Data.ProviderAppName"));
		data.setRegion(_ctx.stringValue("GetMockRuleByIdResponse.Data.Region"));
		data.setSource(_ctx.stringValue("GetMockRuleByIdResponse.Data.Source"));

		List<SpringCloudMockItem> scMockItems = new ArrayList<SpringCloudMockItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMockRuleByIdResponse.Data.ScMockItems.Length"); i++) {
			SpringCloudMockItem springCloudMockItem = new SpringCloudMockItem();
			springCloudMockItem.setExceptionClassName(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].ExceptionClassName"));
			springCloudMockItem.setExecuteCondition(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].ExecuteCondition"));
			springCloudMockItem.setBizMethod(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].Method"));
			springCloudMockItem.setOper(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].Oper"));
			springCloudMockItem.setPath(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].Path"));
			springCloudMockItem.setServiceName(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].ServiceName"));
			springCloudMockItem.setValue(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].Value"));

			scMockItems.add(springCloudMockItem);
		}
		data.setScMockItems(scMockItems);

		List<DubboMockItem> dubboMockItems = new ArrayList<DubboMockItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMockRuleByIdResponse.Data.DubboMockItems.Length"); i++) {
			DubboMockItem dubboMockItem = new DubboMockItem();
			dubboMockItem.setExceptionClassName(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ExceptionClassName"));
			dubboMockItem.setExecuteCondition(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ExecuteCondition"));
			dubboMockItem.setMethodName(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].MethodName"));
			dubboMockItem.setOper(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].Oper"));
			dubboMockItem.setPath(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].Path"));
			dubboMockItem.setServiceName(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ServiceName"));
			dubboMockItem.setValue(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].Value"));
			dubboMockItem.setVersion(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].Version"));
			dubboMockItem.setGroup(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].Group"));
			dubboMockItem.setParamTypes(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ParamTypes"));
			dubboMockItem.setExceptionMessage(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ExceptionMessage"));

			dubboMockItems.add(dubboMockItem);
		}
		data.setDubboMockItems(dubboMockItems);
		getMockRuleByIdResponse.setData(data);
	 
	 	return getMockRuleByIdResponse;
	}
}