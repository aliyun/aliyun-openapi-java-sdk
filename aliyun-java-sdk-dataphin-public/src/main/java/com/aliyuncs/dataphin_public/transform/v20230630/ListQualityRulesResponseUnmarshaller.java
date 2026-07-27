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

import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRulesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRulesResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRulesResponse.PageResult.QualityRule;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRulesResponse.PageResult.QualityRule.AttributeWithValue;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRulesResponse.PageResult.QualityRule.AttributeWithValue.AttributeInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRulesResponse.PageResult.QualityRule.AttributeWithValue.AttributeInfo.ValueConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRulesResponse.PageResult.QualityRule.AttributeWithValue.AttributeInfo.ValueConfig.DefaultValue;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRulesResponse.PageResult.QualityRule.AttributeWithValue.AttributeValue;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRulesResponse.PageResult.QualityRule.FormProperty;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRulesResponse.PageResult.QualityRule.ScheduleBind;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRulesResponse.PageResult.QualityRule.ValidateCondition;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRulesResponse.PageResult.QualityRule.ValidateObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQualityRulesResponseUnmarshaller {

	public static ListQualityRulesResponse unmarshall(ListQualityRulesResponse listQualityRulesResponse, UnmarshallerContext _ctx) {
		
		listQualityRulesResponse.setRequestId(_ctx.stringValue("ListQualityRulesResponse.RequestId"));
		listQualityRulesResponse.setMessage(_ctx.stringValue("ListQualityRulesResponse.Message"));
		listQualityRulesResponse.setHttpStatusCode(_ctx.integerValue("ListQualityRulesResponse.HttpStatusCode"));
		listQualityRulesResponse.setCode(_ctx.stringValue("ListQualityRulesResponse.Code"));
		listQualityRulesResponse.setSuccess(_ctx.booleanValue("ListQualityRulesResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListQualityRulesResponse.PageResult.TotalCount"));

		List<QualityRule> qualityRuleList = new ArrayList<QualityRule>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityRulesResponse.PageResult.QualityRuleList.Length"); i++) {
			QualityRule qualityRule = new QualityRule();
			qualityRule.setModifyTime(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ModifyTime"));
			qualityRule.setDescription(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].Description"));
			qualityRule.setTestRunRuleValidateResult(_ctx.booleanValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].TestRunRuleValidateResult"));
			qualityRule.setEnableErrorArchive(_ctx.booleanValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].EnableErrorArchive"));
			qualityRule.setCreator(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].Creator"));
			qualityRule.setName(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].Name"));
			qualityRule.setTemplateName(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].TemplateName"));
			qualityRule.setModifier(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].Modifier"));
			qualityRule.setTemplateId(_ctx.longValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].TemplateId"));
			qualityRule.setStatus(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].Status"));
			qualityRule.setModifierName(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ModifierName"));
			qualityRule.setCreateTime(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].CreateTime"));
			qualityRule.setTemplateScope(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].TemplateScope"));
			qualityRule.setTemplateType(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].TemplateType"));
			qualityRule.setTestRunRuleTaskStatus(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].TestRunRuleTaskStatus"));
			qualityRule.setTestRunRuleTaskId(_ctx.longValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].TestRunRuleTaskId"));
			qualityRule.setId(_ctx.longValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].Id"));
			qualityRule.setStrength(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].Strength"));
			qualityRule.setCreatorName(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].CreatorName"));
			qualityRule.setWatchId(_ctx.longValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].WatchId"));

			List<String> catalogList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].CatalogList.Length"); j++) {
				catalogList.add(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].CatalogList["+ j +"]"));
			}
			qualityRule.setCatalogList(catalogList);

			ValidateObject validateObject = new ValidateObject();
			validateObject.setType(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ValidateObject.Type"));
			validateObject.setName(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ValidateObject.Name"));
			qualityRule.setValidateObject(validateObject);

			List<FormProperty> formPropertyList = new ArrayList<FormProperty>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].FormPropertyList.Length"); j++) {
				FormProperty formProperty = new FormProperty();
				formProperty.setComponentType(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].FormPropertyList["+ j +"].ComponentType"));
				formProperty.setValue(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].FormPropertyList["+ j +"].Value"));
				formProperty.setName(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].FormPropertyList["+ j +"].Name"));

				formPropertyList.add(formProperty);
			}
			qualityRule.setFormPropertyList(formPropertyList);

			List<ValidateCondition> validateConditionList = new ArrayList<ValidateCondition>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ValidateConditionList.Length"); j++) {
				ValidateCondition validateCondition = new ValidateCondition();
				validateCondition.setOperator(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ValidateConditionList["+ j +"].Operator"));
				validateCondition.setParentId(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ValidateConditionList["+ j +"].ParentId"));
				validateCondition.setMetricName(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ValidateConditionList["+ j +"].MetricName"));
				validateCondition.setType(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ValidateConditionList["+ j +"].Type"));
				validateCondition.setOperatorName(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ValidateConditionList["+ j +"].OperatorName"));
				validateCondition.setValue(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ValidateConditionList["+ j +"].Value"));
				validateCondition.setMetric(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ValidateConditionList["+ j +"].Metric"));
				validateCondition.setId(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ValidateConditionList["+ j +"].Id"));

				validateConditionList.add(validateCondition);
			}
			qualityRule.setValidateConditionList(validateConditionList);

			List<AttributeWithValue> attributeWithValueList = new ArrayList<AttributeWithValue>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList.Length"); j++) {
				AttributeWithValue attributeWithValue = new AttributeWithValue();

				AttributeInfo attributeInfo = new AttributeInfo();
				attributeInfo.setDescription(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.Description"));
				attributeInfo.setRequired(_ctx.booleanValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.Required"));
				attributeInfo.setEnabled(_ctx.booleanValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.Enabled"));
				attributeInfo.setId(_ctx.longValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.Id"));
				attributeInfo.setSearchable(_ctx.booleanValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.Searchable"));
				attributeInfo.setName(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.Name"));

				ValueConfig valueConfig = new ValueConfig();
				valueConfig.setType(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.ValueConfig.Type"));
				valueConfig.setLength(_ctx.integerValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.ValueConfig.Length"));
				valueConfig.setDataType(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.ValueConfig.DataType"));

				List<String> valueEnumList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.ValueConfig.ValueEnumList.Length"); k++) {
					valueEnumList.add(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.ValueConfig.ValueEnumList["+ k +"]"));
				}
				valueConfig.setValueEnumList(valueEnumList);

				DefaultValue defaultValue = new DefaultValue();
				defaultValue.setIncludeMaxValue(_ctx.booleanValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.ValueConfig.DefaultValue.IncludeMaxValue"));
				defaultValue.setMinValue(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.ValueConfig.DefaultValue.MinValue"));
				defaultValue.setMaxValue(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.ValueConfig.DefaultValue.MaxValue"));
				defaultValue.setIncludeMinValue(_ctx.booleanValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.ValueConfig.DefaultValue.IncludeMinValue"));

				List<String> valueList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.ValueConfig.DefaultValue.ValueList.Length"); k++) {
					valueList.add(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeInfo.ValueConfig.DefaultValue.ValueList["+ k +"]"));
				}
				defaultValue.setValueList(valueList);
				valueConfig.setDefaultValue(defaultValue);
				attributeInfo.setValueConfig(valueConfig);
				attributeWithValue.setAttributeInfo(attributeInfo);

				AttributeValue attributeValue = new AttributeValue();
				attributeValue.setIncludeMaxValue(_ctx.booleanValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeValue.IncludeMaxValue"));
				attributeValue.setMinValue(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeValue.MinValue"));
				attributeValue.setMaxValue(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeValue.MaxValue"));
				attributeValue.setIncludeMinValue(_ctx.booleanValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeValue.IncludeMinValue"));

				List<String> valueList1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeValue.ValueList.Length"); k++) {
					valueList1.add(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].AttributeWithValueList["+ j +"].AttributeValue.ValueList["+ k +"]"));
				}
				attributeValue.setValueList1(valueList1);
				attributeWithValue.setAttributeValue(attributeValue);

				attributeWithValueList.add(attributeWithValue);
			}
			qualityRule.setAttributeWithValueList(attributeWithValueList);

			List<ScheduleBind> scheduleBindList = new ArrayList<ScheduleBind>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ScheduleBindList.Length"); j++) {
				ScheduleBind scheduleBind = new ScheduleBind();
				scheduleBind.setScheduleId(_ctx.longValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ScheduleBindList["+ j +"].ScheduleId"));
				scheduleBind.setScheduleName(_ctx.stringValue("ListQualityRulesResponse.PageResult.QualityRuleList["+ i +"].ScheduleBindList["+ j +"].ScheduleName"));

				scheduleBindList.add(scheduleBind);
			}
			qualityRule.setScheduleBindList(scheduleBindList);

			qualityRuleList.add(qualityRule);
		}
		pageResult.setQualityRuleList(qualityRuleList);
		listQualityRulesResponse.setPageResult(pageResult);
	 
	 	return listQualityRulesResponse;
	}
}