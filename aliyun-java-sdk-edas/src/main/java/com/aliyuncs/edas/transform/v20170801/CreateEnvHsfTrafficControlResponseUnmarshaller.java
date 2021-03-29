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

import com.aliyuncs.edas.model.v20170801.CreateEnvHsfTrafficControlResponse;
import com.aliyuncs.edas.model.v20170801.CreateEnvHsfTrafficControlResponse.Data;
import com.aliyuncs.edas.model.v20170801.CreateEnvHsfTrafficControlResponse.Data.Metadata;
import com.aliyuncs.edas.model.v20170801.CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec;
import com.aliyuncs.edas.model.v20170801.CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.ConditionsItem;
import com.aliyuncs.edas.model.v20170801.CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.PurposesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEnvHsfTrafficControlResponseUnmarshaller {

	public static CreateEnvHsfTrafficControlResponse unmarshall(CreateEnvHsfTrafficControlResponse createEnvHsfTrafficControlResponse, UnmarshallerContext _ctx) {
		
		createEnvHsfTrafficControlResponse.setRequestId(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.RequestId"));
		createEnvHsfTrafficControlResponse.setCode(_ctx.integerValue("CreateEnvHsfTrafficControlResponse.Code"));
		createEnvHsfTrafficControlResponse.setMessage(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Message"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.AppId"));
		data.setLabelAdviceId(_ctx.longValue("CreateEnvHsfTrafficControlResponse.Data.LabelAdviceId"));
		data.setKind(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Kind"));
		data.setLabelType(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.LabelType"));
		data.setPointcutId(_ctx.longValue("CreateEnvHsfTrafficControlResponse.Data.PointcutId"));
		data.setRegionId(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.RegionId"));

		Metadata metadata = new Metadata();
		metadata.setName(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Name"));
		metadata.setNamespace(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Namespace"));
		metadata.setLabels(_ctx.mapValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Labels"));

		Spec spec = new Spec();
		spec.setConditionType(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.ConditionType"));
		spec.setEnable(_ctx.booleanValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Enable"));
		spec.setGroup(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Group"));
		spec.setMethodName(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.MethodName"));
		spec.setOrder(_ctx.longValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Order"));
		spec.setPercent(_ctx.integerValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Percent"));
		spec.setServiceName(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.ServiceName"));
		spec.setTriggerPolicy(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.TriggerPolicy"));
		spec.setType(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Type"));
		spec.setSelector(_ctx.mapValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Selector"));

		List<String> paramTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.ParamTypes.Length"); i++) {
			paramTypes.add(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.ParamTypes["+ i +"]"));
		}
		spec.setParamTypes(paramTypes);

		List<PurposesItem> purposes = new ArrayList<PurposesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Purposes.Length"); i++) {
			PurposesItem purposesItem = new PurposesItem();
			purposesItem.setType(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Purposes["+ i +"].Type"));

			purposes.add(purposesItem);
		}
		spec.setPurposes(purposes);

		List<ConditionsItem> conditions = new ArrayList<ConditionsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Conditions.Length"); i++) {
			ConditionsItem conditionsItem = new ConditionsItem();
			conditionsItem.setId(_ctx.longValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Conditions["+ i +"].Id"));
			conditionsItem.setStrategy(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Conditions["+ i +"].Strategy"));
			conditionsItem.setType(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Conditions["+ i +"].Type"));
			conditionsItem.setIndex(_ctx.integerValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Conditions["+ i +"].Index"));
			conditionsItem.setKey(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Conditions["+ i +"].Key"));
			conditionsItem.setOperator(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Conditions["+ i +"].Operator"));

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Conditions["+ i +"].Values.Length"); j++) {
				values.add(_ctx.stringValue("CreateEnvHsfTrafficControlResponse.Data.Metadata.Spec.Conditions["+ i +"].Values["+ j +"]"));
			}
			conditionsItem.setValues(values);

			conditions.add(conditionsItem);
		}
		spec.setConditions(conditions);
		metadata.setSpec(spec);
		data.setMetadata(metadata);
		createEnvHsfTrafficControlResponse.setData(data);
	 
	 	return createEnvHsfTrafficControlResponse;
	}
}