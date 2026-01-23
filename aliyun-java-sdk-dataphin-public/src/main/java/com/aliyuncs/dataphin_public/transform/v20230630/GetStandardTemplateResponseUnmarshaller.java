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

import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.AttributesConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.AttributesConfig.Attribute;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.AttributesConfig.Attribute.MonitorConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.AttributesConfig.Attribute.RefAttribute;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.AttributesConfig.Attribute.RefAttribute.AttributeFromInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.AttributesConfig.Attribute.RefAttribute.AttributeFromInfo.StandardReference;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.AttributesConfig.Attribute.ValueConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.AttributesConfig.Attribute.ValueConfig.ValueRange;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.AttributesConfig.Attribute.ValueConfig.ValueRange.LookupTableReference;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.AttributesConfig.Attribute.ValueConfig.ValueRange.MinMaxValueConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.AutoConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.AutoConfig.CodeRule;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.AutoConfig.CodeRule.AutoIncrementSequenceConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.Creator;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.LastModifier;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardTemplateResponse.TemplateInfo.Maintainer;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStandardTemplateResponseUnmarshaller {

	public static GetStandardTemplateResponse unmarshall(GetStandardTemplateResponse getStandardTemplateResponse, UnmarshallerContext _ctx) {
		
		getStandardTemplateResponse.setRequestId(_ctx.stringValue("GetStandardTemplateResponse.RequestId"));
		getStandardTemplateResponse.setSuccess(_ctx.booleanValue("GetStandardTemplateResponse.Success"));
		getStandardTemplateResponse.setHttpStatusCode(_ctx.integerValue("GetStandardTemplateResponse.HttpStatusCode"));
		getStandardTemplateResponse.setCode(_ctx.stringValue("GetStandardTemplateResponse.Code"));
		getStandardTemplateResponse.setMessage(_ctx.stringValue("GetStandardTemplateResponse.Message"));

		TemplateInfo templateInfo = new TemplateInfo();
		templateInfo.setId(_ctx.longValue("GetStandardTemplateResponse.TemplateInfo.Id"));
		templateInfo.setTemplateFrom(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.TemplateFrom"));
		templateInfo.setUniqueId(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.UniqueId"));
		templateInfo.setVersion(_ctx.integerValue("GetStandardTemplateResponse.TemplateInfo.Version"));
		templateInfo.setName(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.Name"));
		templateInfo.setCode(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.Code"));
		templateInfo.setDescription(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.Description"));
		templateInfo.setCreateTime(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.CreateTime"));
		templateInfo.setModifyTime(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.ModifyTime"));

		Creator creator = new Creator();
		creator.setId(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.Creator.Id"));
		creator.setName(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.Creator.Name"));
		templateInfo.setCreator(creator);

		LastModifier lastModifier = new LastModifier();
		lastModifier.setId(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.LastModifier.Id"));
		lastModifier.setName(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.LastModifier.Name"));
		templateInfo.setLastModifier(lastModifier);

		AttributesConfig attributesConfig = new AttributesConfig();

		List<Attribute> attributeList = new ArrayList<Attribute>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList.Length"); i++) {
			Attribute attribute = new Attribute();
			attribute.setName(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].Name"));
			attribute.setCode(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].Code"));
			attribute.setType(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].Type"));
			attribute.setRequired(_ctx.booleanValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].Required"));
			attribute.setEnableMonitorConfig(_ctx.booleanValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].EnableMonitorConfig"));
			attribute.setDescription(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].Description"));
			attribute.setId(_ctx.longValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].Id"));

			ValueConfig valueConfig = new ValueConfig();
			valueConfig.setType(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.Type"));
			valueConfig.setDataType(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.DataType"));
			valueConfig.setLength(_ctx.integerValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.Length"));
			valueConfig.setDefaultValue(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.DefaultValue"));

			ValueRange valueRange = new ValueRange();
			valueRange.setValueConstraint(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.ValueRange.ValueConstraint"));
			valueRange.setDataphinAttributeType(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.ValueRange.DataphinAttributeType"));

			List<String> valueList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.ValueRange.ValueList.Length"); j++) {
				valueList.add(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.ValueRange.ValueList["+ j +"]"));
			}
			valueRange.setValueList(valueList);

			MinMaxValueConfig minMaxValueConfig = new MinMaxValueConfig();
			minMaxValueConfig.setMinValue(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.ValueRange.MinMaxValueConfig.MinValue"));
			minMaxValueConfig.setIncludeMinValue(_ctx.booleanValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.ValueRange.MinMaxValueConfig.IncludeMinValue"));
			minMaxValueConfig.setMaxValue(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.ValueRange.MinMaxValueConfig.MaxValue"));
			minMaxValueConfig.setIncludeMaxValue(_ctx.booleanValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.ValueRange.MinMaxValueConfig.IncludeMaxValue"));
			valueRange.setMinMaxValueConfig(minMaxValueConfig);

			LookupTableReference lookupTableReference = new LookupTableReference();
			lookupTableReference.setLookupTableId(_ctx.longValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.ValueRange.LookupTableReference.LookupTableId"));
			lookupTableReference.setColumn(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].ValueConfig.ValueRange.LookupTableReference.Column"));
			valueRange.setLookupTableReference(lookupTableReference);
			valueConfig.setValueRange(valueRange);
			attribute.setValueConfig(valueConfig);

			MonitorConfig monitorConfig = new MonitorConfig();
			monitorConfig.setType(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].MonitorConfig.Type"));
			monitorConfig.setColumnName(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].MonitorConfig.ColumnName"));
			monitorConfig.setIsCaseSensitive(_ctx.booleanValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].MonitorConfig.IsCaseSensitive"));
			attribute.setMonitorConfig(monitorConfig);

			RefAttribute refAttribute = new RefAttribute();
			refAttribute.setAttributeId(_ctx.longValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].RefAttribute.AttributeId"));

			AttributeFromInfo attributeFromInfo = new AttributeFromInfo();
			attributeFromInfo.setAttributeFrom(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].RefAttribute.AttributeFromInfo.AttributeFrom"));

			StandardReference standardReference = new StandardReference();
			standardReference.setStandardId(_ctx.longValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].RefAttribute.AttributeFromInfo.StandardReference.StandardId"));
			standardReference.setVersion(_ctx.integerValue("GetStandardTemplateResponse.TemplateInfo.AttributesConfig.AttributeList["+ i +"].RefAttribute.AttributeFromInfo.StandardReference.Version"));
			attributeFromInfo.setStandardReference(standardReference);
			refAttribute.setAttributeFromInfo(attributeFromInfo);
			attribute.setRefAttribute(refAttribute);

			attributeList.add(attribute);
		}
		attributesConfig.setAttributeList(attributeList);
		templateInfo.setAttributesConfig(attributesConfig);

		CodeRuleConfig codeRuleConfig = new CodeRuleConfig();
		codeRuleConfig.setGenerateType(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.GenerateType"));

		AutoConfig autoConfig = new AutoConfig();
		autoConfig.setNeedStrongValidate(_ctx.booleanValue("GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.AutoConfig.NeedStrongValidate"));

		List<CodeRule> codeRuleList = new ArrayList<CodeRule>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.AutoConfig.CodeRuleList.Length"); i++) {
			CodeRule codeRule = new CodeRule();
			codeRule.setIndex(_ctx.integerValue("GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.AutoConfig.CodeRuleList["+ i +"].Index"));
			codeRule.setType(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.AutoConfig.CodeRuleList["+ i +"].Type"));
			codeRule.setValue(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.AutoConfig.CodeRuleList["+ i +"].Value"));

			AutoIncrementSequenceConfig autoIncrementSequenceConfig = new AutoIncrementSequenceConfig();
			autoIncrementSequenceConfig.setDigit(_ctx.integerValue("GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.AutoConfig.CodeRuleList["+ i +"].AutoIncrementSequenceConfig.Digit"));
			autoIncrementSequenceConfig.setStartValue(_ctx.longValue("GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.AutoConfig.CodeRuleList["+ i +"].AutoIncrementSequenceConfig.StartValue"));
			autoIncrementSequenceConfig.setStep(_ctx.integerValue("GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.AutoConfig.CodeRuleList["+ i +"].AutoIncrementSequenceConfig.Step"));
			autoIncrementSequenceConfig.setNeedPaddingZero(_ctx.booleanValue("GetStandardTemplateResponse.TemplateInfo.CodeRuleConfig.AutoConfig.CodeRuleList["+ i +"].AutoIncrementSequenceConfig.NeedPaddingZero"));
			codeRule.setAutoIncrementSequenceConfig(autoIncrementSequenceConfig);

			codeRuleList.add(codeRule);
		}
		autoConfig.setCodeRuleList(codeRuleList);
		codeRuleConfig.setAutoConfig(autoConfig);
		templateInfo.setCodeRuleConfig(codeRuleConfig);

		List<Maintainer> maintainerList = new ArrayList<Maintainer>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardTemplateResponse.TemplateInfo.MaintainerList.Length"); i++) {
			Maintainer maintainer = new Maintainer();
			maintainer.setId(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.MaintainerList["+ i +"].Id"));
			maintainer.setName(_ctx.stringValue("GetStandardTemplateResponse.TemplateInfo.MaintainerList["+ i +"].Name"));

			maintainerList.add(maintainer);
		}
		templateInfo.setMaintainerList(maintainerList);
		getStandardTemplateResponse.setTemplateInfo(templateInfo);
	 
	 	return getStandardTemplateResponse;
	}
}