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

import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.AttributeWithValue;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.AttributeWithValue.Attribute;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.AttributeWithValue.Attribute.MonitorConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.AttributeWithValue.Attribute.RefAttribute;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.AttributeWithValue.Attribute.RefAttribute.AttributeFromInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.AttributeWithValue.Attribute.RefAttribute.AttributeFromInfo.StandardReference;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.AttributeWithValue.Attribute.ValueConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.AttributeWithValue.Attribute.ValueConfig.ValueRange;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.AttributeWithValue.Attribute.ValueConfig.ValueRange.LookupTableReference;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.AttributeWithValue.Attribute.ValueConfig.ValueRange.MinMaxValueConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.Creator;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.EffectiveTimeConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.LastModifier;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.LookupTableRelation;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.Owner;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfig.AttributeMonitorConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfig.QualityRuleTemplate;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfig.RuleConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfig.RuleValidateConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.StandardRelation;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.StandardSet;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardResponse.StandardInfo.StandardTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStandardResponseUnmarshaller {

	public static GetStandardResponse unmarshall(GetStandardResponse getStandardResponse, UnmarshallerContext _ctx) {
		
		getStandardResponse.setRequestId(_ctx.stringValue("GetStandardResponse.RequestId"));
		getStandardResponse.setSuccess(_ctx.booleanValue("GetStandardResponse.Success"));
		getStandardResponse.setHttpStatusCode(_ctx.integerValue("GetStandardResponse.HttpStatusCode"));
		getStandardResponse.setCode(_ctx.stringValue("GetStandardResponse.Code"));
		getStandardResponse.setMessage(_ctx.stringValue("GetStandardResponse.Message"));

		StandardInfo standardInfo = new StandardInfo();
		standardInfo.setId(_ctx.longValue("GetStandardResponse.StandardInfo.Id"));
		standardInfo.setVersion(_ctx.integerValue("GetStandardResponse.StandardInfo.Version"));
		standardInfo.setStatus(_ctx.stringValue("GetStandardResponse.StandardInfo.Status"));
		standardInfo.setStage(_ctx.stringValue("GetStandardResponse.StandardInfo.Stage"));
		standardInfo.setDescription(_ctx.stringValue("GetStandardResponse.StandardInfo.Description"));
		standardInfo.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.Name"));
		standardInfo.setEnglishName(_ctx.stringValue("GetStandardResponse.StandardInfo.EnglishName"));
		standardInfo.setCode(_ctx.stringValue("GetStandardResponse.StandardInfo.Code"));
		standardInfo.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.Type"));
		standardInfo.setModifyTime(_ctx.stringValue("GetStandardResponse.StandardInfo.ModifyTime"));

		StandardTemplate standardTemplate = new StandardTemplate();
		standardTemplate.setId(_ctx.longValue("GetStandardResponse.StandardInfo.StandardTemplate.Id"));
		standardTemplate.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardTemplate.Name"));
		standardTemplate.setCode(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardTemplate.Code"));
		standardTemplate.setTemplateFrom(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardTemplate.TemplateFrom"));
		standardTemplate.setVersion(_ctx.integerValue("GetStandardResponse.StandardInfo.StandardTemplate.Version"));
		standardInfo.setStandardTemplate(standardTemplate);

		StandardSet standardSet = new StandardSet();
		standardSet.setId(_ctx.longValue("GetStandardResponse.StandardInfo.StandardSet.Id"));
		standardSet.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardSet.Name"));
		standardSet.setCode(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardSet.Code"));
		standardSet.setDirectory(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardSet.Directory"));
		standardInfo.setStandardSet(standardSet);

		EffectiveTimeConfig effectiveTimeConfig = new EffectiveTimeConfig();
		effectiveTimeConfig.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.EffectiveTimeConfig.Type"));
		effectiveTimeConfig.setStartTime(_ctx.stringValue("GetStandardResponse.StandardInfo.EffectiveTimeConfig.StartTime"));
		effectiveTimeConfig.setEndTime(_ctx.stringValue("GetStandardResponse.StandardInfo.EffectiveTimeConfig.EndTime"));
		standardInfo.setEffectiveTimeConfig(effectiveTimeConfig);

		Owner owner = new Owner();
		owner.setId(_ctx.stringValue("GetStandardResponse.StandardInfo.Owner.Id"));
		owner.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.Owner.Name"));
		standardInfo.setOwner(owner);

		LastModifier lastModifier = new LastModifier();
		lastModifier.setId(_ctx.stringValue("GetStandardResponse.StandardInfo.LastModifier.Id"));
		lastModifier.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.LastModifier.Name"));
		standardInfo.setLastModifier(lastModifier);

		Creator creator = new Creator();
		creator.setId(_ctx.stringValue("GetStandardResponse.StandardInfo.Creator.Id"));
		creator.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.Creator.Name"));
		standardInfo.setCreator(creator);

		StandardGeneralMonitorConfig standardGeneralMonitorConfig = new StandardGeneralMonitorConfig();

		List<StandardMonitorConfig> standardMonitorConfigList = new ArrayList<StandardMonitorConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList.Length"); i++) {
			StandardMonitorConfig standardMonitorConfig = new StandardMonitorConfig();
			standardMonitorConfig.setId(_ctx.longValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].Id"));
			standardMonitorConfig.setRuleName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleName"));
			standardMonitorConfig.setDescription(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].Description"));
			standardMonitorConfig.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].Type"));
			standardMonitorConfig.setMonitorFrom(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].MonitorFrom"));
			standardMonitorConfig.setAttributeId(_ctx.longValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].AttributeId"));
			standardMonitorConfig.setAttributeName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].AttributeName"));
			standardMonitorConfig.setRuleSubType(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleSubType"));

			AttributeMonitorConfig attributeMonitorConfig = new AttributeMonitorConfig();
			attributeMonitorConfig.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].AttributeMonitorConfig.Type"));
			attributeMonitorConfig.setColumnName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].AttributeMonitorConfig.ColumnName"));
			attributeMonitorConfig.setIsCaseSensitive(_ctx.booleanValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].AttributeMonitorConfig.IsCaseSensitive"));
			standardMonitorConfig.setAttributeMonitorConfig(attributeMonitorConfig);

			QualityRuleTemplate qualityRuleTemplate = new QualityRuleTemplate();
			qualityRuleTemplate.setId(_ctx.longValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].QualityRuleTemplate.Id"));
			qualityRuleTemplate.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].QualityRuleTemplate.Type"));
			qualityRuleTemplate.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].QualityRuleTemplate.Name"));
			standardMonitorConfig.setQualityRuleTemplate(qualityRuleTemplate);

			List<RuleConfig> ruleConfigList = new ArrayList<RuleConfig>();
			for (int j = 0; j < _ctx.lengthValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleConfigList.Length"); j++) {
				RuleConfig ruleConfig = new RuleConfig();
				ruleConfig.setKey(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleConfigList["+ j +"].Key"));
				ruleConfig.setValue(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleConfigList["+ j +"].Value"));

				ruleConfigList.add(ruleConfig);
			}
			standardMonitorConfig.setRuleConfigList(ruleConfigList);

			List<RuleValidateConfig> ruleValidateConfigList = new ArrayList<RuleValidateConfig>();
			for (int j = 0; j < _ctx.lengthValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList.Length"); j++) {
				RuleValidateConfig ruleValidateConfig = new RuleValidateConfig();
				ruleValidateConfig.setId(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].Id"));
				ruleValidateConfig.setParentId(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].ParentId"));
				ruleValidateConfig.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].Type"));
				ruleValidateConfig.setOperator(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].Operator"));
				ruleValidateConfig.setMetric(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].Metric"));
				ruleValidateConfig.setMetricName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].MetricName"));
				ruleValidateConfig.setValue(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].Value"));

				ruleValidateConfigList.add(ruleValidateConfig);
			}
			standardMonitorConfig.setRuleValidateConfigList(ruleValidateConfigList);

			standardMonitorConfigList.add(standardMonitorConfig);
		}
		standardGeneralMonitorConfig.setStandardMonitorConfigList(standardMonitorConfigList);
		standardInfo.setStandardGeneralMonitorConfig(standardGeneralMonitorConfig);

		List<AttributeWithValue> attributeWithValueList = new ArrayList<AttributeWithValue>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardResponse.StandardInfo.AttributeWithValueList.Length"); i++) {
			AttributeWithValue attributeWithValue = new AttributeWithValue();
			attributeWithValue.setValue(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Value"));

			Attribute attribute = new Attribute();
			attribute.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.Name"));
			attribute.setCode(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.Code"));
			attribute.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.Type"));
			attribute.setRequired(_ctx.booleanValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.Required"));
			attribute.setEnableMonitorConfig(_ctx.booleanValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.EnableMonitorConfig"));
			attribute.setDescription(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.Description"));
			attribute.setId(_ctx.longValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.Id"));

			ValueConfig valueConfig = new ValueConfig();
			valueConfig.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.Type"));
			valueConfig.setDataType(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.DataType"));
			valueConfig.setLength(_ctx.integerValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.Length"));
			valueConfig.setDefaultValue(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.DefaultValue"));

			ValueRange valueRange = new ValueRange();
			valueRange.setValueConstraint(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.ValueConstraint"));
			valueRange.setDataphinAttributeType(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.DataphinAttributeType"));

			List<String> valueList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.ValueList.Length"); j++) {
				valueList.add(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.ValueList["+ j +"]"));
			}
			valueRange.setValueList(valueList);

			MinMaxValueConfig minMaxValueConfig = new MinMaxValueConfig();
			minMaxValueConfig.setMinValue(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.MinValue"));
			minMaxValueConfig.setIncludeMinValue(_ctx.booleanValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.IncludeMinValue"));
			minMaxValueConfig.setMaxValue(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.MaxValue"));
			minMaxValueConfig.setIncludeMaxValue(_ctx.booleanValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.IncludeMaxValue"));
			valueRange.setMinMaxValueConfig(minMaxValueConfig);

			LookupTableReference lookupTableReference = new LookupTableReference();
			lookupTableReference.setLookupTableId(_ctx.longValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.LookupTableReference.LookupTableId"));
			lookupTableReference.setColumn(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.LookupTableReference.Column"));
			valueRange.setLookupTableReference(lookupTableReference);
			valueConfig.setValueRange(valueRange);
			attribute.setValueConfig(valueConfig);

			MonitorConfig monitorConfig = new MonitorConfig();
			monitorConfig.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.MonitorConfig.Type"));
			monitorConfig.setColumnName(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.MonitorConfig.ColumnName"));
			monitorConfig.setIsCaseSensitive(_ctx.booleanValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.MonitorConfig.IsCaseSensitive"));
			attribute.setMonitorConfig(monitorConfig);

			RefAttribute refAttribute = new RefAttribute();
			refAttribute.setAttributeId(_ctx.longValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.RefAttribute.AttributeId"));

			AttributeFromInfo attributeFromInfo = new AttributeFromInfo();
			attributeFromInfo.setAttributeFrom(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.RefAttribute.AttributeFromInfo.AttributeFrom"));

			StandardReference standardReference = new StandardReference();
			standardReference.setStandardId(_ctx.longValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.RefAttribute.AttributeFromInfo.StandardReference.StandardId"));
			standardReference.setVersion(_ctx.integerValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.RefAttribute.AttributeFromInfo.StandardReference.Version"));
			attributeFromInfo.setStandardReference(standardReference);
			refAttribute.setAttributeFromInfo(attributeFromInfo);
			attribute.setRefAttribute(refAttribute);
			attributeWithValue.setAttribute(attribute);

			attributeWithValueList.add(attributeWithValue);
		}
		standardInfo.setAttributeWithValueList(attributeWithValueList);

		List<StandardRelation> standardRelations = new ArrayList<StandardRelation>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardResponse.StandardInfo.StandardRelations.Length"); i++) {
			StandardRelation standardRelation = new StandardRelation();
			standardRelation.setStandardId(_ctx.longValue("GetStandardResponse.StandardInfo.StandardRelations["+ i +"].StandardId"));
			standardRelation.setVersion(_ctx.integerValue("GetStandardResponse.StandardInfo.StandardRelations["+ i +"].Version"));
			standardRelation.setStandardStage(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardRelations["+ i +"].StandardStage"));
			standardRelation.setStandardStatus(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardRelations["+ i +"].StandardStatus"));
			standardRelation.setRelationType(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardRelations["+ i +"].RelationType"));

			standardRelations.add(standardRelation);
		}
		standardInfo.setStandardRelations(standardRelations);

		List<LookupTableRelation> lookupTableRelations = new ArrayList<LookupTableRelation>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardResponse.StandardInfo.LookupTableRelations.Length"); i++) {
			LookupTableRelation lookupTableRelation = new LookupTableRelation();
			lookupTableRelation.setLookupTableId(_ctx.longValue("GetStandardResponse.StandardInfo.LookupTableRelations["+ i +"].LookupTableId"));
			lookupTableRelation.setLookupTableCode(_ctx.stringValue("GetStandardResponse.StandardInfo.LookupTableRelations["+ i +"].LookupTableCode"));
			lookupTableRelation.setAttributeId(_ctx.longValue("GetStandardResponse.StandardInfo.LookupTableRelations["+ i +"].AttributeId"));
			lookupTableRelation.setAttributeName(_ctx.stringValue("GetStandardResponse.StandardInfo.LookupTableRelations["+ i +"].AttributeName"));
			lookupTableRelation.setAttributeCode(_ctx.stringValue("GetStandardResponse.StandardInfo.LookupTableRelations["+ i +"].AttributeCode"));

			lookupTableRelations.add(lookupTableRelation);
		}
		standardInfo.setLookupTableRelations(lookupTableRelations);
		getStandardResponse.setStandardInfo(standardInfo);
	 
	 	return getStandardResponse;
	}
}