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
import com.aliyuncs.edas.model.v20170801.GetMockRuleByIdResponse.Data.DubboMockItem.ArgumentMockItem2;
import com.aliyuncs.edas.model.v20170801.GetMockRuleByIdResponse.Data.SpringCloudMockItem;
import com.aliyuncs.edas.model.v20170801.GetMockRuleByIdResponse.Data.SpringCloudMockItem.ArgumentMockItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMockRuleByIdResponseUnmarshaller {

	public static GetMockRuleByIdResponse unmarshall(GetMockRuleByIdResponse getMockRuleByIdResponse, UnmarshallerContext _ctx) {
		
		getMockRuleByIdResponse.setRequestId(_ctx.stringValue("GetMockRuleByIdResponse.RequestId"));
		getMockRuleByIdResponse.setCode(_ctx.stringValue("GetMockRuleByIdResponse.Code"));
		getMockRuleByIdResponse.setMessage(_ctx.stringValue("GetMockRuleByIdResponse.Message"));
		getMockRuleByIdResponse.setSuccess(_ctx.booleanValue("GetMockRuleByIdResponse.Success"));

		Data data = new Data();
		data.setRegion(_ctx.stringValue("GetMockRuleByIdResponse.Data.Region"));
		data.setConsumerAppName(_ctx.stringValue("GetMockRuleByIdResponse.Data.ConsumerAppName"));
		data.setProviderAppId(_ctx.stringValue("GetMockRuleByIdResponse.Data.ProviderAppId"));
		data.setConsumerAppId(_ctx.stringValue("GetMockRuleByIdResponse.Data.ConsumerAppId"));
		data.setAccountId(_ctx.stringValue("GetMockRuleByIdResponse.Data.AccountId"));
		data.setExtraJson(_ctx.stringValue("GetMockRuleByIdResponse.Data.ExtraJson"));
		data.setSource(_ctx.stringValue("GetMockRuleByIdResponse.Data.Source"));
		data.setProviderAppName(_ctx.stringValue("GetMockRuleByIdResponse.Data.ProviderAppName"));
		data.setName(_ctx.stringValue("GetMockRuleByIdResponse.Data.Name"));
		data.setId(_ctx.longValue("GetMockRuleByIdResponse.Data.Id"));
		data.setEnable(_ctx.booleanValue("GetMockRuleByIdResponse.Data.Enable"));

		List<SpringCloudMockItem> scMockItems = new ArrayList<SpringCloudMockItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMockRuleByIdResponse.Data.ScMockItems.Length"); i++) {
			SpringCloudMockItem springCloudMockItem = new SpringCloudMockItem();
			springCloudMockItem.setValue(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].Value"));
			springCloudMockItem.setOper(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].Oper"));
			springCloudMockItem.setExecuteCondition(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].ExecuteCondition"));
			springCloudMockItem.setPath(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].Path"));
			springCloudMockItem.setBizMethod(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].Method"));
			springCloudMockItem.setExceptionClassName(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].ExceptionClassName"));
			springCloudMockItem.setServiceName(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].ServiceName"));
			springCloudMockItem.setCondition(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].Condition"));
			springCloudMockItem.setTimeout(_ctx.longValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].Timeout"));

			List<ArgumentMockItem> argumentMockItems = new ArrayList<ArgumentMockItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].ArgumentMockItems.Length"); j++) {
				ArgumentMockItem argumentMockItem = new ArgumentMockItem();
				argumentMockItem.setType(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].ArgumentMockItems["+ j +"].Type"));
				argumentMockItem.setName(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].ArgumentMockItems["+ j +"].Name"));
				argumentMockItem.setOperator(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].ArgumentMockItems["+ j +"].Operator"));
				argumentMockItem.setDatum(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].ArgumentMockItems["+ j +"].Datum"));
				argumentMockItem.setCond(_ctx.stringValue("GetMockRuleByIdResponse.Data.ScMockItems["+ i +"].ArgumentMockItems["+ j +"].Cond"));

				argumentMockItems.add(argumentMockItem);
			}
			springCloudMockItem.setArgumentMockItems(argumentMockItems);

			scMockItems.add(springCloudMockItem);
		}
		data.setScMockItems(scMockItems);

		List<DubboMockItem> dubboMockItems = new ArrayList<DubboMockItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMockRuleByIdResponse.Data.DubboMockItems.Length"); i++) {
			DubboMockItem dubboMockItem = new DubboMockItem();
			dubboMockItem.setParamTypes(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ParamTypes"));
			dubboMockItem.setMethodName(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].MethodName"));
			dubboMockItem.setValue(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].Value"));
			dubboMockItem.setOper(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].Oper"));
			dubboMockItem.setExceptionMessage(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ExceptionMessage"));
			dubboMockItem.setExecuteCondition(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ExecuteCondition"));
			dubboMockItem.setVersion(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].Version"));
			dubboMockItem.setPath(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].Path"));
			dubboMockItem.setExceptionClassName(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ExceptionClassName"));
			dubboMockItem.setServiceName(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ServiceName"));
			dubboMockItem.setGroup(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].Group"));
			dubboMockItem.setCondition(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].Condition"));
			dubboMockItem.setTimeout(_ctx.longValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].Timeout"));

			List<ArgumentMockItem2> argumentMockItems1 = new ArrayList<ArgumentMockItem2>();
			for (int j = 0; j < _ctx.lengthValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ArgumentMockItems.Length"); j++) {
				ArgumentMockItem2 argumentMockItem2 = new ArgumentMockItem2();
				argumentMockItem2.setType(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ArgumentMockItems["+ j +"].Type"));
				argumentMockItem2.setName(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ArgumentMockItems["+ j +"].Name"));
				argumentMockItem2.setOperator(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ArgumentMockItems["+ j +"].Operator"));
				argumentMockItem2.setDatum(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ArgumentMockItems["+ j +"].Datum"));
				argumentMockItem2.setCond(_ctx.stringValue("GetMockRuleByIdResponse.Data.DubboMockItems["+ i +"].ArgumentMockItems["+ j +"].Cond"));

				argumentMockItems1.add(argumentMockItem2);
			}
			dubboMockItem.setArgumentMockItems1(argumentMockItems1);

			dubboMockItems.add(dubboMockItem);
		}
		data.setDubboMockItems(dubboMockItems);
		getMockRuleByIdResponse.setData(data);
	 
	 	return getMockRuleByIdResponse;
	}
}