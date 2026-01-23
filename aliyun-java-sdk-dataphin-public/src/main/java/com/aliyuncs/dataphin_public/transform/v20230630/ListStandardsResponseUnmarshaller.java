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
		listStandardsResponse.setSuccess(_ctx.booleanValue("ListStandardsResponse.Success"));
		listStandardsResponse.setHttpStatusCode(_ctx.integerValue("ListStandardsResponse.HttpStatusCode"));
		listStandardsResponse.setCode(_ctx.stringValue("ListStandardsResponse.Code"));
		listStandardsResponse.setMessage(_ctx.stringValue("ListStandardsResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListStandardsResponse.PageResult.TotalCount"));

		List<Standard> standardList = new ArrayList<Standard>();
		for (int i = 0; i < _ctx.lengthValue("ListStandardsResponse.PageResult.StandardList.Length"); i++) {
			Standard standard = new Standard();
			standard.setId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Id"));
			standard.setVersion(_ctx.integerValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Version"));
			standard.setStatus(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Status"));
			standard.setStage(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Stage"));
			standard.setDescription(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Description"));
			standard.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Name"));
			standard.setEnglishName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].EnglishName"));
			standard.setCode(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Code"));
			standard.setType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Type"));
			standard.setModifyTime(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].ModifyTime"));

			StandardTemplate standardTemplate = new StandardTemplate();
			standardTemplate.setId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardTemplate.Id"));
			standardTemplate.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardTemplate.Name"));
			standardTemplate.setCode(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardTemplate.Code"));
			standardTemplate.setTemplateFrom(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardTemplate.TemplateFrom"));
			standardTemplate.setVersion(_ctx.integerValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardTemplate.Version"));
			standard.setStandardTemplate(standardTemplate);

			StandardSet standardSet = new StandardSet();
			standardSet.setId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardSet.Id"));
			standardSet.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardSet.Name"));
			standardSet.setCode(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardSet.Code"));
			standardSet.setDirectory(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].StandardSet.Directory"));
			standard.setStandardSet(standardSet);

			EffectiveTimeConfig effectiveTimeConfig = new EffectiveTimeConfig();
			effectiveTimeConfig.setType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].EffectiveTimeConfig.Type"));
			effectiveTimeConfig.setStartTime(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].EffectiveTimeConfig.StartTime"));
			effectiveTimeConfig.setEndTime(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].EffectiveTimeConfig.EndTime"));
			standard.setEffectiveTimeConfig(effectiveTimeConfig);

			Owner owner = new Owner();
			owner.setId(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Owner.Id"));
			owner.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Owner.Name"));
			standard.setOwner(owner);

			LastModifier lastModifier = new LastModifier();
			lastModifier.setId(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].LastModifier.Id"));
			lastModifier.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].LastModifier.Name"));
			standard.setLastModifier(lastModifier);

			Creator creator = new Creator();
			creator.setId(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Creator.Id"));
			creator.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].Creator.Name"));
			standard.setCreator(creator);

			List<AttributeWithValue> attributeWithValueList = new ArrayList<AttributeWithValue>();
			for (int j = 0; j < _ctx.lengthValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList.Length"); j++) {
				AttributeWithValue attributeWithValue = new AttributeWithValue();
				attributeWithValue.setValue(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Value"));

				Attribute attribute = new Attribute();
				attribute.setName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.Name"));
				attribute.setCode(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.Code"));
				attribute.setType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.Type"));
				attribute.setRequired(_ctx.booleanValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.Required"));
				attribute.setEnableMonitorConfig(_ctx.booleanValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.EnableMonitorConfig"));
				attribute.setDescription(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.Description"));
				attribute.setId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.Id"));

				ValueConfig valueConfig = new ValueConfig();
				valueConfig.setType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.Type"));
				valueConfig.setDataType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.DataType"));
				valueConfig.setLength(_ctx.integerValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.Length"));
				valueConfig.setDefaultValue(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.DefaultValue"));

				ValueRange valueRange = new ValueRange();
				valueRange.setValueConstraint(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.ValueConstraint"));
				valueRange.setDataphinAttributeType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.DataphinAttributeType"));

				List<String> valueList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.ValueList.Length"); k++) {
					valueList.add(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.ValueList["+ k +"]"));
				}
				valueRange.setValueList(valueList);

				MinMaxValueConfig minMaxValueConfig = new MinMaxValueConfig();
				minMaxValueConfig.setMinValue(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.MinValue"));
				minMaxValueConfig.setIncludeMinValue(_ctx.booleanValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.IncludeMinValue"));
				minMaxValueConfig.setMaxValue(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.MaxValue"));
				minMaxValueConfig.setIncludeMaxValue(_ctx.booleanValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.MinMaxValueConfig.IncludeMaxValue"));
				valueRange.setMinMaxValueConfig(minMaxValueConfig);

				LookupTableReference lookupTableReference = new LookupTableReference();
				lookupTableReference.setLookupTableId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.LookupTableReference.LookupTableId"));
				lookupTableReference.setColumn(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.ValueConfig.ValueRange.LookupTableReference.Column"));
				valueRange.setLookupTableReference(lookupTableReference);
				valueConfig.setValueRange(valueRange);
				attribute.setValueConfig(valueConfig);

				MonitorConfig monitorConfig = new MonitorConfig();
				monitorConfig.setType(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.MonitorConfig.Type"));
				monitorConfig.setColumnName(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.MonitorConfig.ColumnName"));
				monitorConfig.setIsCaseSensitive(_ctx.booleanValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.MonitorConfig.IsCaseSensitive"));
				attribute.setMonitorConfig(monitorConfig);

				RefAttribute refAttribute = new RefAttribute();
				refAttribute.setAttributeId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.RefAttribute.AttributeId"));

				AttributeFromInfo attributeFromInfo = new AttributeFromInfo();
				attributeFromInfo.setAttributeFrom(_ctx.stringValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.RefAttribute.AttributeFromInfo.AttributeFrom"));

				StandardReference standardReference = new StandardReference();
				standardReference.setStandardId(_ctx.longValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.RefAttribute.AttributeFromInfo.StandardReference.StandardId"));
				standardReference.setVersion(_ctx.integerValue("ListStandardsResponse.PageResult.StandardList["+ i +"].AttributeWithValueList["+ j +"].Attribute.RefAttribute.AttributeFromInfo.StandardReference.Version"));
				attributeFromInfo.setStandardReference(standardReference);
				refAttribute.setAttributeFromInfo(attributeFromInfo);
				attribute.setRefAttribute(refAttribute);
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