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

import com.aliyuncs.dataphin_public.model.v20230630.GetQualityTemplateResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityTemplateResponse.QualityTemplateInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityTemplateResponse.QualityTemplateInfo.FormProperty;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityTemplateResponseUnmarshaller {

	public static GetQualityTemplateResponse unmarshall(GetQualityTemplateResponse getQualityTemplateResponse, UnmarshallerContext _ctx) {
		
		getQualityTemplateResponse.setRequestId(_ctx.stringValue("GetQualityTemplateResponse.RequestId"));
		getQualityTemplateResponse.setSuccess(_ctx.booleanValue("GetQualityTemplateResponse.Success"));
		getQualityTemplateResponse.setHttpStatusCode(_ctx.integerValue("GetQualityTemplateResponse.HttpStatusCode"));
		getQualityTemplateResponse.setCode(_ctx.stringValue("GetQualityTemplateResponse.Code"));
		getQualityTemplateResponse.setMessage(_ctx.stringValue("GetQualityTemplateResponse.Message"));

		QualityTemplateInfo qualityTemplateInfo = new QualityTemplateInfo();
		qualityTemplateInfo.setId(_ctx.longValue("GetQualityTemplateResponse.QualityTemplateInfo.Id"));
		qualityTemplateInfo.setName(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.Name"));
		qualityTemplateInfo.setType(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.Type"));
		qualityTemplateInfo.setTypeName(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.TypeName"));
		qualityTemplateInfo.setDescription(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.Description"));
		qualityTemplateInfo.setOwner(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.Owner"));
		qualityTemplateInfo.setOwnerName(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.OwnerName"));
		qualityTemplateInfo.setCatalog(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.Catalog"));
		qualityTemplateInfo.setCatalogName(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.CatalogName"));
		qualityTemplateInfo.setSupportAllDataSourceType(_ctx.booleanValue("GetQualityTemplateResponse.QualityTemplateInfo.SupportAllDataSourceType"));
		qualityTemplateInfo.setIsSystemTemplate(_ctx.booleanValue("GetQualityTemplateResponse.QualityTemplateInfo.IsSystemTemplate"));
		qualityTemplateInfo.setCreator(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.Creator"));
		qualityTemplateInfo.setCreatorName(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.CreatorName"));
		qualityTemplateInfo.setCreateTime(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.CreateTime"));
		qualityTemplateInfo.setModifyTime(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.ModifyTime"));
		qualityTemplateInfo.setModifier(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.Modifier"));
		qualityTemplateInfo.setModifierName(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.ModifierName"));

		List<String> supportDataSourceTypeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityTemplateResponse.QualityTemplateInfo.SupportDataSourceTypeList.Length"); i++) {
			supportDataSourceTypeList.add(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.SupportDataSourceTypeList["+ i +"]"));
		}
		qualityTemplateInfo.setSupportDataSourceTypeList(supportDataSourceTypeList);

		List<FormProperty> formPropertyList = new ArrayList<FormProperty>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityTemplateResponse.QualityTemplateInfo.FormPropertyList.Length"); i++) {
			FormProperty formProperty = new FormProperty();
			formProperty.setComponentType(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.FormPropertyList["+ i +"].ComponentType"));
			formProperty.setName(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.FormPropertyList["+ i +"].Name"));
			formProperty.setValue(_ctx.stringValue("GetQualityTemplateResponse.QualityTemplateInfo.FormPropertyList["+ i +"].Value"));

			formPropertyList.add(formProperty);
		}
		qualityTemplateInfo.setFormPropertyList(formPropertyList);
		getQualityTemplateResponse.setQualityTemplateInfo(qualityTemplateInfo);
	 
	 	return getQualityTemplateResponse;
	}
}