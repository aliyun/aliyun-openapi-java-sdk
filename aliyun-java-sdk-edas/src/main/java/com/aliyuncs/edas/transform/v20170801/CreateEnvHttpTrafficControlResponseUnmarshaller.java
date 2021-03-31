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

import com.aliyuncs.edas.model.v20170801.CreateEnvHttpTrafficControlResponse;
import com.aliyuncs.edas.model.v20170801.CreateEnvHttpTrafficControlResponse.Data;
import com.aliyuncs.edas.model.v20170801.CreateEnvHttpTrafficControlResponse.Data.Spec;
import com.aliyuncs.edas.model.v20170801.CreateEnvHttpTrafficControlResponse.Data.Spec.ConditionsItem;
import com.aliyuncs.edas.model.v20170801.CreateEnvHttpTrafficControlResponse.Data.Spec.PurposesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEnvHttpTrafficControlResponseUnmarshaller {

	public static CreateEnvHttpTrafficControlResponse unmarshall(CreateEnvHttpTrafficControlResponse createEnvHttpTrafficControlResponse, UnmarshallerContext _ctx) {
		
		createEnvHttpTrafficControlResponse.setRequestId(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.RequestId"));
		createEnvHttpTrafficControlResponse.setCode(_ctx.integerValue("CreateEnvHttpTrafficControlResponse.Code"));
		createEnvHttpTrafficControlResponse.setMessage(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Message"));

		Data data = new Data();
		data.setAccountId(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.AccountId"));
		data.setAppId(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.AppId"));
		data.setEnvName(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.EnvName"));
		data.setLabelAdviceId(_ctx.longValue("CreateEnvHttpTrafficControlResponse.Data.LabelAdviceId"));
		data.setLabelType(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.LabelType"));
		data.setPointcutId(_ctx.longValue("CreateEnvHttpTrafficControlResponse.Data.PointcutId"));
		data.setRegionId(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.RegionId"));
		data.setTenantId(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.TenantId"));

		Spec spec = new Spec();
		spec.setConditionType(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.ConditionType"));
		spec.setOrder(_ctx.longValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Order"));
		spec.setPercent(_ctx.integerValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Percent"));
		spec.setTriggerPolicy(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.TriggerPolicy"));
		spec.setType(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Type"));
		spec.setUrl(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Url"));
		spec.setSelector(_ctx.mapValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Selector"));
		spec.setServiceName(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.ServiceName"));
		spec.setGroup(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Group"));
		spec.setVersion(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Version"));
		spec.setMethodName(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.MethodName"));
		spec.setClassName(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.ClassName"));
		spec.setTransmitSwitch(_ctx.booleanValue("CreateEnvHttpTrafficControlResponse.Data.Spec.TransmitSwitch"));
		spec.setTransmitLevel(_ctx.integerValue("CreateEnvHttpTrafficControlResponse.Data.Spec.TransmitLevel"));

		List<String> paramTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateEnvHttpTrafficControlResponse.Data.Spec.ParamTypes.Length"); i++) {
			paramTypes.add(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.ParamTypes["+ i +"]"));
		}
		spec.setParamTypes(paramTypes);

		List<ConditionsItem> conditions = new ArrayList<ConditionsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Conditions.Length"); i++) {
			ConditionsItem conditionsItem = new ConditionsItem();
			conditionsItem.setId(_ctx.longValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Conditions["+ i +"].Id"));
			conditionsItem.setStrategy(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Conditions["+ i +"].Strategy"));
			conditionsItem.setType(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Conditions["+ i +"].Type"));
			conditionsItem.setIndex(_ctx.integerValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Conditions["+ i +"].Index"));
			conditionsItem.setKey(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Conditions["+ i +"].Key"));
			conditionsItem.setOperator(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Conditions["+ i +"].Operator"));

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Conditions["+ i +"].Values.Length"); j++) {
				values.add(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Conditions["+ i +"].Values["+ j +"]"));
			}
			conditionsItem.setValues(values);

			conditions.add(conditionsItem);
		}
		spec.setConditions(conditions);

		List<PurposesItem> purposes = new ArrayList<PurposesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Purposes.Length"); i++) {
			PurposesItem purposesItem = new PurposesItem();
			purposesItem.setType(_ctx.stringValue("CreateEnvHttpTrafficControlResponse.Data.Spec.Purposes["+ i +"].Type"));

			purposes.add(purposesItem);
		}
		spec.setPurposes(purposes);
		data.setSpec(spec);
		createEnvHttpTrafficControlResponse.setData(data);
	 
	 	return createEnvHttpTrafficControlResponse;
	}
}