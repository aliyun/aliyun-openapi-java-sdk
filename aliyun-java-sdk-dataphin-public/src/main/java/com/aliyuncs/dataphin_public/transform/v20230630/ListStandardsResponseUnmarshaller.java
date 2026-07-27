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

import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.AttributeWithValue;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.AttributeWithValue.Attribute;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.AttributeWithValue.Attribute.MonitorConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.AttributeWithValue.Attribute.RefAttribute;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.AttributeWithValue.Attribute.RefAttribute.AttributeFromInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.AttributeWithValue.Attribute.RefAttribute.AttributeFromInfo.StandardReference;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.AttributeWithValue.Attribute.ValueConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.AttributeWithValue.Attribute.ValueConfig.ValueRange;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.AttributeWithValue.Attribute.ValueConfig.ValueRange.LookupTableReference;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.AttributeWithValue.Attribute.ValueConfig.ValueRange.MinMaxValueConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.Creator;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.EffectiveTimeConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.LastModifier;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.Owner;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.StandardSet;
import com.aliyuncs.dataphin_public.model.v20230630.ListStandardsResponse.PageResult.Standard.StandardTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStandardsResponseUnmarshaller {

	public static ListStandardsResponse unmarshall(ListStandardsResponse listStandardsResponse, UnmarshallerContext _ctx) {
		
		listStandardsResponse.setRequestId(_ctx.stringValue("ListStandardsResponse.RequestId"));
		listStandardsResponse.setMessage(_ctx.stringValue("ListStandardsResponse.Message"));
		listStandardsResponse.setHttpStatusCode(_ctx.integerValue("ListStandardsResponse.HttpStatusCode"));
		listStandardsResponse.setCode(_ctx.stringValue("ListStandardsResponse.Code"));
		listStandardsResponse.setSuccess(_ctx.booleanValue("ListStandardsResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListStandardsResponse.PageResult.TotalCount"));

		List<Standard> standardList = new ArrayList<Standard>();
		for (int i = 0; i < _ctx.lengthValue("ListStandardsResponse.PageResult.StandardList.Length"); i++) {
			Standard standard = new Standard();
			standard.setStatus(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Status"));
			standard.setModifyTime(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].ModifyTime"));
			standard.setDescription(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Description"));
			standard.setCode(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Code"));
			standard.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Name"));
			standard.setType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Type"));
			standard.setVersion(_ctx.integerValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Version"));
			standard.setStage(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Stage"));
			standard.setId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Id"));
			standard.setEnglishName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].EnglishName"));

			Owner owner = new Owner();
			owner.setId(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Owner.Id"));
			owner.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Owner.Name"));
			standard.setOwner(owner);

			LastModifier lastModifier = new LastModifier();
			lastModifier.setId(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].LastModifier.Id"));
			lastModifier.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].LastModifier.Name"));
			standard.setLastModifier(lastModifier);

			StandardSet standardSet = new StandardSet();
			standardSet.setId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardSet.Id"));
			standardSet.setCode(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardSet.Code"));
			standardSet.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardSet.Name"));
			standardSet.setDirectory(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardSet.Directory"));
			standard.setStandardSet(standardSet);

			StandardTemplate standardTemplate = new StandardTemplate();
			standardTemplate.setVersion(_ctx.integerValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardTemplate.Version"));
			standardTemplate.setId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardTemplate.Id"));
			standardTemplate.setTemplateFrom(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardTemplate.TemplateFrom"));
			standardTemplate.setCode(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardTemplate.Code"));
			standardTemplate.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardTemplate.Name"));
			standard.setStandardTemplate(standardTemplate);

			EffectiveTimeConfig effectiveTimeConfig = new EffectiveTimeConfig();
			effectiveTimeConfig.setType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].EffectiveTimeConfig.Type"));
			effectiveTimeConfig.setEndTime(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].EffectiveTimeConfig.EndTime"));
			effectiveTimeConfig.setStartTime(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].EffectiveTimeConfig.StartTime"));
			standard.setEffectiveTimeConfig(effectiveTimeConfig);

			Creator creator = new Creator();
			creator.setId(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Creator.Id"));
			creator.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Creator.Name"));
			standard.setCreator(creator);

			List<AttributeWithValue> attributeWithValueList = new ArrayList<AttributeWithValue>();
			for (int j = 0; j < _ctx.lengthValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList.Length"); j++) {
				AttributeWithValue attributeWithValue = new AttributeWithValue();
				attributeWithValue.setValue(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Value"));

				Attribute attribute = new Attribute();
				attribute.setType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.Type"));
				attribute.setDescription(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.Description"));
				attribute.setRequired(_ctx.booleanValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.Required"));
				attribute.setId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.Id"));
				attribute.setCode(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.Code"));
				attribute.setEnableMonitorConfig(_ctx.booleanValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.EnableMonitorConfig"));
				attribute.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.Name"));

				RefAttribute refAttribute = new RefAttribute();
				refAttribute.setAttributeId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.RefAttribute.AttributeId"));

				AttributeFromInfo attributeFromInfo = new AttributeFromInfo();
				attributeFromInfo.setAttributeFrom(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.RefAttribute.AttributeFromInfo.AttributeFrom"));

				StandardReference standardReference = new StandardReference();
				standardReference.setVersion(_ctx.integerValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.RefAttribute.AttributeFromInfo.StandardReference.Version"));
				standardReference.setStandardId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.RefAttribute.AttributeFromInfo.StandardReference.StandardId"));
				attributeFromInfo.setStandardReference(standardReference);
				refAttribute.setAttributeFromInfo(attributeFromInfo);
				attribute.setRefAttribute(refAttribute);

				ValueConfig valueConfig = new ValueConfig();
				valueConfig.setDefaultValue(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.DefaultValue"));
				valueConfig.setType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.Type"));
				valueConfig.setLength(_ctx.integerValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.Length"));
				valueConfig.setDataType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.DataType"));

				ValueRange valueRange = new ValueRange();
				valueRange.setDataphinAttributeType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.DataphinAttributeType"));
				valueRange.setValueConstraint(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.ValueConstraint"));

				List<String> valueList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.ValueList.Length"); k++) {
					valueList.add(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.ValueList["+ k +"]"));
				}
				valueRange.setValueList(valueList);

				LookupTableReference lookupTableReference = new LookupTableReference();
				lookupTableReference.setLookupTableId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.LookupTableReference.LookupTableId"));
				lookupTableReference.setColumn(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.LookupTableReference.Column"));
				valueRange.setLookupTableReference(lookupTableReference);

				MinMaxValueConfig minMaxValueConfig = new MinMaxValueConfig();
				minMaxValueConfig.setIncludeMaxValue(_ctx.booleanValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.IncludeMaxValue"));
				minMaxValueConfig.setMinValue(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.MinValue"));
				minMaxValueConfig.setMaxValue(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.MaxValue"));
				minMaxValueConfig.setIncludeMinValue(_ctx.booleanValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.IncludeMinValue"));
				valueRange.setMinMaxValueConfig(minMaxValueConfig);
				valueConfig.setValueRange(valueRange);
				attribute.setValueConfig(valueConfig);

				MonitorConfig monitorConfig = new MonitorConfig();
				monitorConfig.setColumnName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.MonitorConfig.ColumnName"));
				monitorConfig.setType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.MonitorConfig.Type"));
				monitorConfig.setIsCaseSensitive(_ctx.booleanValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.MonitorConfig.IsCaseSensitive"));
				attribute.setMonitorConfig(monitorConfig);
				attributeWithValue.setAttribute(attribute);

				attributeWithValueList.add(attributeWithValue);
			}
			standard.setAttributeWithValueList(attributeWithValueList);

			standardList.add(standard);
		}
		pageResult.setStandardList(standardList);
		listStandardsResponse.setPageResult(pageResult);
	 
	 	return listStandardsResponse;
	}
}