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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleResponse.QualityRuleInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleResponse.QualityRuleInfo.AttributeWithValue;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleResponse.QualityRuleInfo.AttributeWithValue.AttributeInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleResponse.QualityRuleInfo.AttributeWithValue.AttributeInfo.ValueConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleResponse.QualityRuleInfo.AttributeWithValue.AttributeInfo.ValueConfig.DefaultValue;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleResponse.QualityRuleInfo.AttributeWithValue.AttributeValue;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleResponse.QualityRuleInfo.FormProperty;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleResponse.QualityRuleInfo.ScheduleBind;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleResponse.QualityRuleInfo.ValidateCondition;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleResponse.QualityRuleInfo.ValidateObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityRuleResponseUnmarshaller {

	public static GetQualityRuleResponse unmarshall(GetQualityRuleResponse getQualityRuleResponse, UnmarshallerContext _ctx) {
		
		getQualityRuleResponse.setRequestId(_ctx.stringValue("GetQualityRuleResponse.RequestId"));
		getQualityRuleResponse.setMessage(_ctx.stringValue("GetQualityRuleResponse.Message"));
		getQualityRuleResponse.setHttpStatusCode(_ctx.integerValue("GetQualityRuleResponse.HttpStatusCode"));
		getQualityRuleResponse.setCode(_ctx.stringValue("GetQualityRuleResponse.Code"));
		getQualityRuleResponse.setSuccess(_ctx.booleanValue("GetQualityRuleResponse.Success"));

		QualityRuleInfo qualityRuleInfo = new QualityRuleInfo();
		qualityRuleInfo.setModifyTime(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ModifyTime"));
		qualityRuleInfo.setDescription(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.Description"));
		qualityRuleInfo.setTestRunRuleValidateResult(_ctx.booleanValue("GetQualityRuleResponse.QualityRuleInfo.TestRunRuleValidateResult"));
		qualityRuleInfo.setEnableErrorArchive(_ctx.booleanValue("GetQualityRuleResponse.QualityRuleInfo.EnableErrorArchive"));
		qualityRuleInfo.setCreator(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.Creator"));
		qualityRuleInfo.setName(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.Name"));
		qualityRuleInfo.setTemplateName(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.TemplateName"));
		qualityRuleInfo.setModifier(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.Modifier"));
		qualityRuleInfo.setTemplateId(_ctx.longValue("GetQualityRuleResponse.QualityRuleInfo.TemplateId"));
		qualityRuleInfo.setStatus(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.Status"));
		qualityRuleInfo.setModifierName(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ModifierName"));
		qualityRuleInfo.setCreateTime(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.CreateTime"));
		qualityRuleInfo.setTemplateScope(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.TemplateScope"));
		qualityRuleInfo.setTemplateType(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.TemplateType"));
		qualityRuleInfo.setTestRunRuleTaskStatus(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.TestRunRuleTaskStatus"));
		qualityRuleInfo.setTestRunRuleTaskId(_ctx.longValue("GetQualityRuleResponse.QualityRuleInfo.TestRunRuleTaskId"));
		qualityRuleInfo.setId(_ctx.longValue("GetQualityRuleResponse.QualityRuleInfo.Id"));
		qualityRuleInfo.setStrength(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.Strength"));
		qualityRuleInfo.setCreatorName(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.CreatorName"));
		qualityRuleInfo.setWatchId(_ctx.longValue("GetQualityRuleResponse.QualityRuleInfo.WatchId"));

		List<String> catalogList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityRuleResponse.QualityRuleInfo.CatalogList.Length"); i++) {
			catalogList.add(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.CatalogList["+ i +"]"));
		}
		qualityRuleInfo.setCatalogList(catalogList);

		ValidateObject validateObject = new ValidateObject();
		validateObject.setType(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ValidateObject.Type"));
		validateObject.setName(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ValidateObject.Name"));
		qualityRuleInfo.setValidateObject(validateObject);

		List<FormProperty> formPropertyList = new ArrayList<FormProperty>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityRuleResponse.QualityRuleInfo.FormPropertyList.Length"); i++) {
			FormProperty formProperty = new FormProperty();
			formProperty.setComponentType(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.FormPropertyList["+ i +"].ComponentType"));
			formProperty.setValue(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.FormPropertyList["+ i +"].Value"));
			formProperty.setName(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.FormPropertyList["+ i +"].Name"));

			formPropertyList.add(formProperty);
		}
		qualityRuleInfo.setFormPropertyList(formPropertyList);

		List<ValidateCondition> validateConditionList = new ArrayList<ValidateCondition>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityRuleResponse.QualityRuleInfo.ValidateConditionList.Length"); i++) {
			ValidateCondition validateCondition = new ValidateCondition();
			validateCondition.setOperator(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ValidateConditionList["+ i +"].Operator"));
			validateCondition.setParentId(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ValidateConditionList["+ i +"].ParentId"));
			validateCondition.setMetricName(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ValidateConditionList["+ i +"].MetricName"));
			validateCondition.setType(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ValidateConditionList["+ i +"].Type"));
			validateCondition.setOperatorName(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ValidateConditionList["+ i +"].OperatorName"));
			validateCondition.setValue(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ValidateConditionList["+ i +"].Value"));
			validateCondition.setMetric(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ValidateConditionList["+ i +"].Metric"));
			validateCondition.setId(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ValidateConditionList["+ i +"].Id"));

			validateConditionList.add(validateCondition);
		}
		qualityRuleInfo.setValidateConditionList(validateConditionList);

		List<AttributeWithValue> attributeWithValueList = new ArrayList<AttributeWithValue>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList.Length"); i++) {
			AttributeWithValue attributeWithValue = new AttributeWithValue();

			AttributeInfo attributeInfo = new AttributeInfo();
			attributeInfo.setDescription(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.Description"));
			attributeInfo.setRequired(_ctx.booleanValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.Required"));
			attributeInfo.setEnabled(_ctx.booleanValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.Enabled"));
			attributeInfo.setId(_ctx.longValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.Id"));
			attributeInfo.setSearchable(_ctx.booleanValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.Searchable"));
			attributeInfo.setName(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.Name"));

			ValueConfig valueConfig = new ValueConfig();
			valueConfig.setType(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.ValueConfig.Type"));
			valueConfig.setLength(_ctx.integerValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.ValueConfig.Length"));
			valueConfig.setDataType(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.ValueConfig.DataType"));

			List<String> valueEnumList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.ValueConfig.ValueEnumList.Length"); j++) {
				valueEnumList.add(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.ValueConfig.ValueEnumList["+ j +"]"));
			}
			valueConfig.setValueEnumList(valueEnumList);

			DefaultValue defaultValue = new DefaultValue();
			defaultValue.setIncludeMaxValue(_ctx.booleanValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.ValueConfig.DefaultValue.IncludeMaxValue"));
			defaultValue.setMinValue(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.ValueConfig.DefaultValue.MinValue"));
			defaultValue.setMaxValue(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.ValueConfig.DefaultValue.MaxValue"));
			defaultValue.setIncludeMinValue(_ctx.booleanValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.ValueConfig.DefaultValue.IncludeMinValue"));

			List<String> valueList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.ValueConfig.DefaultValue.ValueList.Length"); j++) {
				valueList.add(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeInfo.ValueConfig.DefaultValue.ValueList["+ j +"]"));
			}
			defaultValue.setValueList(valueList);
			valueConfig.setDefaultValue(defaultValue);
			attributeInfo.setValueConfig(valueConfig);
			attributeWithValue.setAttributeInfo(attributeInfo);

			AttributeValue attributeValue = new AttributeValue();
			attributeValue.setIncludeMaxValue(_ctx.booleanValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeValue.IncludeMaxValue"));
			attributeValue.setMinValue(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeValue.MinValue"));
			attributeValue.setMaxValue(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeValue.MaxValue"));
			attributeValue.setIncludeMinValue(_ctx.booleanValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeValue.IncludeMinValue"));

			List<String> valueList1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeValue.ValueList.Length"); j++) {
				valueList1.add(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.AttributeWithValueList["+ i +"].AttributeValue.ValueList["+ j +"]"));
			}
			attributeValue.setValueList1(valueList1);
			attributeWithValue.setAttributeValue(attributeValue);

			attributeWithValueList.add(attributeWithValue);
		}
		qualityRuleInfo.setAttributeWithValueList(attributeWithValueList);

		List<ScheduleBind> scheduleBindList = new ArrayList<ScheduleBind>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityRuleResponse.QualityRuleInfo.ScheduleBindList.Length"); i++) {
			ScheduleBind scheduleBind = new ScheduleBind();
			scheduleBind.setScheduleId(_ctx.longValue("GetQualityRuleResponse.QualityRuleInfo.ScheduleBindList["+ i +"].ScheduleId"));
			scheduleBind.setScheduleName(_ctx.stringValue("GetQualityRuleResponse.QualityRuleInfo.ScheduleBindList["+ i +"].ScheduleName"));

			scheduleBindList.add(scheduleBind);
		}
		qualityRuleInfo.setScheduleBindList(scheduleBindList);
		getQualityRuleResponse.setQualityRuleInfo(qualityRuleInfo);
	 
	 	return getQualityRuleResponse;
	}
}