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
		getStandardResponse.setMessage(_ctx.stringValue("GetStandardResponse.Message"));
		getStandardResponse.setHttpStatusCode(_ctx.integerValue("GetStandardResponse.HttpStatusCode"));
		getStandardResponse.setCode(_ctx.stringValue("GetStandardResponse.Code"));
		getStandardResponse.setSuccess(_ctx.booleanValue("GetStandardResponse.Success"));

		StandardInfo standardInfo = new StandardInfo();
		standardInfo.setStatus(_ctx.stringValue("GetStandardResponse.StandardInfo.Status"));
		standardInfo.setModifyTime(_ctx.stringValue("GetStandardResponse.StandardInfo.ModifyTime"));
		standardInfo.setDescription(_ctx.stringValue("GetStandardResponse.StandardInfo.Description"));
		standardInfo.setCode(_ctx.stringValue("GetStandardResponse.StandardInfo.Code"));
		standardInfo.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.Name"));
		standardInfo.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.Type"));
		standardInfo.setVersion(_ctx.integerValue("GetStandardResponse.StandardInfo.Version"));
		standardInfo.setStage(_ctx.stringValue("GetStandardResponse.StandardInfo.Stage"));
		standardInfo.setId(_ctx.longValue("GetStandardResponse.StandardInfo.Id"));
		standardInfo.setEnglishName(_ctx.stringValue("GetStandardResponse.StandardInfo.EnglishName"));

		Owner owner = new Owner();
		owner.setId(_ctx.stringValue("GetStandardResponse.StandardInfo.Owner.Id"));
		owner.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.Owner.Name"));
		standardInfo.setOwner(owner);

		LastModifier lastModifier = new LastModifier();
		lastModifier.setId(_ctx.stringValue("GetStandardResponse.StandardInfo.LastModifier.Id"));
		lastModifier.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.LastModifier.Name"));
		standardInfo.setLastModifier(lastModifier);

		StandardSet standardSet = new StandardSet();
		standardSet.setId(_ctx.longValue("GetStandardResponse.StandardInfo.StandardSet.Id"));
		standardSet.setCode(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardSet.Code"));
		standardSet.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardSet.Name"));
		standardSet.setDirectory(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardSet.Directory"));
		standardInfo.setStandardSet(standardSet);

		StandardTemplate standardTemplate = new StandardTemplate();
		standardTemplate.setVersion(_ctx.integerValue("GetStandardResponse.StandardInfo.StandardTemplate.Version"));
		standardTemplate.setId(_ctx.longValue("GetStandardResponse.StandardInfo.StandardTemplate.Id"));
		standardTemplate.setTemplateFrom(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardTemplate.TemplateFrom"));
		standardTemplate.setCode(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardTemplate.Code"));
		standardTemplate.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardTemplate.Name"));
		standardInfo.setStandardTemplate(standardTemplate);

		EffectiveTimeConfig effectiveTimeConfig = new EffectiveTimeConfig();
		effectiveTimeConfig.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.EffectiveTimeConfig.Type"));
		effectiveTimeConfig.setEndTime(_ctx.stringValue("GetStandardResponse.StandardInfo.EffectiveTimeConfig.EndTime"));
		effectiveTimeConfig.setStartTime(_ctx.stringValue("GetStandardResponse.StandardInfo.EffectiveTimeConfig.StartTime"));
		standardInfo.setEffectiveTimeConfig(effectiveTimeConfig);

		Creator creator = new Creator();
		creator.setId(_ctx.stringValue("GetStandardResponse.StandardInfo.Creator.Id"));
		creator.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.Creator.Name"));
		standardInfo.setCreator(creator);

		StandardGeneralMonitorConfig standardGeneralMonitorConfig = new StandardGeneralMonitorConfig();

		List<StandardMonitorConfig> standardMonitorConfigList = new ArrayList<StandardMonitorConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList.Length"); i++) {
			StandardMonitorConfig standardMonitorConfig = new StandardMonitorConfig();
			standardMonitorConfig.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].Type"));
			standardMonitorConfig.setDescription(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].Description"));
			standardMonitorConfig.setAttributeId(_ctx.longValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].AttributeId"));
			standardMonitorConfig.setAttributeName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].AttributeName"));
			standardMonitorConfig.setId(_ctx.longValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].Id"));
			standardMonitorConfig.setMonitorFrom(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].MonitorFrom"));
			standardMonitorConfig.setRuleName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleName"));
			standardMonitorConfig.setRuleSubType(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleSubType"));

			QualityRuleTemplate qualityRuleTemplate = new QualityRuleTemplate();
			qualityRuleTemplate.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].QualityRuleTemplate.Type"));
			qualityRuleTemplate.setId(_ctx.longValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].QualityRuleTemplate.Id"));
			qualityRuleTemplate.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].QualityRuleTemplate.Name"));
			standardMonitorConfig.setQualityRuleTemplate(qualityRuleTemplate);

			AttributeMonitorConfig attributeMonitorConfig = new AttributeMonitorConfig();
			attributeMonitorConfig.setColumnName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].AttributeMonitorConfig.ColumnName"));
			attributeMonitorConfig.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].AttributeMonitorConfig.Type"));
			attributeMonitorConfig.setIsCaseSensitive(_ctx.booleanValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].AttributeMonitorConfig.IsCaseSensitive"));
			standardMonitorConfig.setAttributeMonitorConfig(attributeMonitorConfig);

			List<RuleValidateConfig> ruleValidateConfigList = new ArrayList<RuleValidateConfig>();
			for (int j = 0; j < _ctx.lengthValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList.Length"); j++) {
				RuleValidateConfig ruleValidateConfig = new RuleValidateConfig();
				ruleValidateConfig.setParentId(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].ParentId"));
				ruleValidateConfig.setOperator(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].Operator"));
				ruleValidateConfig.setMetricName(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].MetricName"));
				ruleValidateConfig.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].Type"));
				ruleValidateConfig.setValue(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].Value"));
				ruleValidateConfig.setMetric(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].Metric"));
				ruleValidateConfig.setId(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleValidateConfigList["+ j +"].Id"));

				ruleValidateConfigList.add(ruleValidateConfig);
			}
			standardMonitorConfig.setRuleValidateConfigList(ruleValidateConfigList);

			List<RuleConfig> ruleConfigList = new ArrayList<RuleConfig>();
			for (int j = 0; j < _ctx.lengthValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleConfigList.Length"); j++) {
				RuleConfig ruleConfig = new RuleConfig();
				ruleConfig.setValue(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleConfigList["+ j +"].Value"));
				ruleConfig.setKey(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardGeneralMonitorConfig.StandardMonitorConfigList["+ i +"].RuleConfigList["+ j +"].Key"));

				ruleConfigList.add(ruleConfig);
			}
			standardMonitorConfig.setRuleConfigList(ruleConfigList);

			standardMonitorConfigList.add(standardMonitorConfig);
		}
		standardGeneralMonitorConfig.setStandardMonitorConfigList(standardMonitorConfigList);
		standardInfo.setStandardGeneralMonitorConfig(standardGeneralMonitorConfig);

		List<StandardRelation> standardRelations = new ArrayList<StandardRelation>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardResponse.StandardInfo.StandardRelations.Length"); i++) {
			StandardRelation standardRelation = new StandardRelation();
			standardRelation.setStandardStage(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardRelations["+ i +"].StandardStage"));
			standardRelation.setVersion(_ctx.integerValue("GetStandardResponse.StandardInfo.StandardRelations["+ i +"].Version"));
			standardRelation.setRelationType(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardRelations["+ i +"].RelationType"));
			standardRelation.setStandardId(_ctx.longValue("GetStandardResponse.StandardInfo.StandardRelations["+ i +"].StandardId"));
			standardRelation.setStandardStatus(_ctx.stringValue("GetStandardResponse.StandardInfo.StandardRelations["+ i +"].StandardStatus"));

			standardRelations.add(standardRelation);
		}
		standardInfo.setStandardRelations(standardRelations);

		List<LookupTableRelation> lookupTableRelations = new ArrayList<LookupTableRelation>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardResponse.StandardInfo.LookupTableRelations.Length"); i++) {
			LookupTableRelation lookupTableRelation = new LookupTableRelation();
			lookupTableRelation.setAttributeCode(_ctx.stringValue("GetStandardResponse.StandardInfo.LookupTableRelations["+ i +"].AttributeCode"));
			lookupTableRelation.setLookupTableId(_ctx.longValue("GetStandardResponse.StandardInfo.LookupTableRelations["+ i +"].LookupTableId"));
			lookupTableRelation.setAttributeId(_ctx.longValue("GetStandardResponse.StandardInfo.LookupTableRelations["+ i +"].AttributeId"));
			lookupTableRelation.setLookupTableCode(_ctx.stringValue("GetStandardResponse.StandardInfo.LookupTableRelations["+ i +"].LookupTableCode"));
			lookupTableRelation.setAttributeName(_ctx.stringValue("GetStandardResponse.StandardInfo.LookupTableRelations["+ i +"].AttributeName"));

			lookupTableRelations.add(lookupTableRelation);
		}
		standardInfo.setLookupTableRelations(lookupTableRelations);

		List<AttributeWithValue> attributeWithValueList = new ArrayList<AttributeWithValue>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardResponse.StandardInfo.AttributeWithValueList.Length"); i++) {
			AttributeWithValue attributeWithValue = new AttributeWithValue();
			attributeWithValue.setValue(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Value"));

			Attribute attribute = new Attribute();
			attribute.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.Type"));
			attribute.setDescription(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.Description"));
			attribute.setRequired(_ctx.booleanValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.Required"));
			attribute.setId(_ctx.longValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.Id"));
			attribute.setCode(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.Code"));
			attribute.setEnableMonitorConfig(_ctx.booleanValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.EnableMonitorConfig"));
			attribute.setName(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.Name"));

			RefAttribute refAttribute = new RefAttribute();
			refAttribute.setAttributeId(_ctx.longValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.RefAttribute.AttributeId"));

			AttributeFromInfo attributeFromInfo = new AttributeFromInfo();
			attributeFromInfo.setAttributeFrom(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.RefAttribute.AttributeFromInfo.AttributeFrom"));

			StandardReference standardReference = new StandardReference();
			standardReference.setVersion(_ctx.integerValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.RefAttribute.AttributeFromInfo.StandardReference.Version"));
			standardReference.setStandardId(_ctx.longValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.RefAttribute.AttributeFromInfo.StandardReference.StandardId"));
			attributeFromInfo.setStandardReference(standardReference);
			refAttribute.setAttributeFromInfo(attributeFromInfo);
			attribute.setRefAttribute(refAttribute);

			ValueConfig valueConfig = new ValueConfig();
			valueConfig.setDefaultValue(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.DefaultValue"));
			valueConfig.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.Type"));
			valueConfig.setLength(_ctx.integerValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.Length"));
			valueConfig.setDataType(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.DataType"));

			ValueRange valueRange = new ValueRange();
			valueRange.setDataphinAttributeType(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.DataphinAttributeType"));
			valueRange.setValueConstraint(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.ValueConstraint"));

			List<String> valueList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.ValueList.Length"); j++) {
				valueList.add(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.ValueList["+ j +"]"));
			}
			valueRange.setValueList(valueList);

			LookupTableReference lookupTableReference = new LookupTableReference();
			lookupTableReference.setLookupTableId(_ctx.longValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.LookupTableReference.LookupTableId"));
			lookupTableReference.setColumn(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.LookupTableReference.Column"));
			valueRange.setLookupTableReference(lookupTableReference);

			MinMaxValueConfig minMaxValueConfig = new MinMaxValueConfig();
			minMaxValueConfig.setIncludeMaxValue(_ctx.booleanValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.IncludeMaxValue"));
			minMaxValueConfig.setMinValue(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.MinValue"));
			minMaxValueConfig.setMaxValue(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.MaxValue"));
			minMaxValueConfig.setIncludeMinValue(_ctx.booleanValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.IncludeMinValue"));
			valueRange.setMinMaxValueConfig(minMaxValueConfig);
			valueConfig.setValueRange(valueRange);
			attribute.setValueConfig(valueConfig);

			MonitorConfig monitorConfig = new MonitorConfig();
			monitorConfig.setColumnName(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.MonitorConfig.ColumnName"));
			monitorConfig.setType(_ctx.stringValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.MonitorConfig.Type"));
			monitorConfig.setIsCaseSensitive(_ctx.booleanValue("GetStandardResponse.StandardInfo.AttributeWithValueList["+ i +"].Attribute.MonitorConfig.IsCaseSensitive"));
			attribute.setMonitorConfig(monitorConfig);
			attributeWithValue.setAttribute(attribute);

			attributeWithValueList.add(attributeWithValue);
		}
		standardInfo.setAttributeWithValueList(attributeWithValueList);
		getStandardResponse.setStandardInfo(standardInfo);
	 
	 	return getStandardResponse;
	}
}