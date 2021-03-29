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

import com.aliyuncs.edas.model.v20170801.GetEnvTrafficControlResponse;
import com.aliyuncs.edas.model.v20170801.GetEnvTrafficControlResponse.DataItem;
import com.aliyuncs.edas.model.v20170801.GetEnvTrafficControlResponse.DataItem.Metadata;
import com.aliyuncs.edas.model.v20170801.GetEnvTrafficControlResponse.DataItem.Spec;
import com.aliyuncs.edas.model.v20170801.GetEnvTrafficControlResponse.DataItem.Spec.ConditionsItem;
import com.aliyuncs.edas.model.v20170801.GetEnvTrafficControlResponse.DataItem.Spec.PurposesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEnvTrafficControlResponseUnmarshaller {

	public static GetEnvTrafficControlResponse unmarshall(GetEnvTrafficControlResponse getEnvTrafficControlResponse, UnmarshallerContext _ctx) {
		
		getEnvTrafficControlResponse.setRequestId(_ctx.stringValue("GetEnvTrafficControlResponse.RequestId"));
		getEnvTrafficControlResponse.setCode(_ctx.integerValue("GetEnvTrafficControlResponse.Code"));
		getEnvTrafficControlResponse.setMessage(_ctx.stringValue("GetEnvTrafficControlResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetEnvTrafficControlResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKind(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Kind"));
			dataItem.setAppId(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].AppId"));
			dataItem.setEnvName(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].EnvName"));
			dataItem.setId(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Id"));
			dataItem.setLabelAdviceId(_ctx.longValue("GetEnvTrafficControlResponse.Data["+ i +"].LabelAdviceId"));
			dataItem.setLabelType(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].LabelType"));
			dataItem.setPointcutId(_ctx.longValue("GetEnvTrafficControlResponse.Data["+ i +"].PointcutId"));
			dataItem.setRegionId(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].RegionId"));

			Metadata metadata = new Metadata();
			metadata.setName(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Metadata.Name"));
			metadata.setNamespace(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Metadata.Namespace"));
			metadata.setLabels(_ctx.mapValue("GetEnvTrafficControlResponse.Data["+ i +"].Metadata.Labels"));
			dataItem.setMetadata(metadata);

			Spec spec = new Spec();
			spec.setShowName(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.ShowName"));
			spec.setEnable(_ctx.booleanValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Enable"));
			spec.setConditionType(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.ConditionType"));
			spec.setSelector(_ctx.mapValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Selector"));
			spec.setTriggerPolicy(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.TriggerPolicy"));
			spec.setType(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Type"));
			spec.setUrl(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Url"));
			spec.setServiceName(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.ServiceName"));
			spec.setGroup(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Group"));
			spec.setVersion(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Version"));
			spec.setMethodName(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.MethodName"));
			spec.setClassName(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.ClassName"));
			spec.setTransmitSwitch(_ctx.booleanValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.TransmitSwitch"));
			spec.setTransmitLevel(_ctx.integerValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.TransmitLevel"));
			spec.setPercent(_ctx.integerValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Percent"));
			spec.setOrder(_ctx.longValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Order"));

			List<String> paramTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.ParamTypes.Length"); j++) {
				paramTypes.add(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.ParamTypes["+ j +"]"));
			}
			spec.setParamTypes(paramTypes);

			List<PurposesItem> purposes = new ArrayList<PurposesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Purposes.Length"); j++) {
				PurposesItem purposesItem = new PurposesItem();
				purposesItem.setType(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Purposes["+ j +"].Type"));

				purposes.add(purposesItem);
			}
			spec.setPurposes(purposes);

			List<ConditionsItem> conditions = new ArrayList<ConditionsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Conditions.Length"); j++) {
				ConditionsItem conditionsItem = new ConditionsItem();
				conditionsItem.setId(_ctx.longValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Conditions["+ j +"].Id"));
				conditionsItem.setStrategy(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Conditions["+ j +"].Strategy"));
				conditionsItem.setType(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Conditions["+ j +"].Type"));
				conditionsItem.setIndex(_ctx.integerValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Conditions["+ j +"].Index"));
				conditionsItem.setKey(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Conditions["+ j +"].Key"));
				conditionsItem.setOperator(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Conditions["+ j +"].Operator"));

				List<String> values = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Conditions["+ j +"].Values.Length"); k++) {
					values.add(_ctx.stringValue("GetEnvTrafficControlResponse.Data["+ i +"].Spec.Conditions["+ j +"].Values["+ k +"]"));
				}
				conditionsItem.setValues(values);

				conditions.add(conditionsItem);
			}
			spec.setConditions(conditions);
			dataItem.setSpec(spec);

			data.add(dataItem);
		}
		getEnvTrafficControlResponse.setData(data);
	 
	 	return getEnvTrafficControlResponse;
	}
}