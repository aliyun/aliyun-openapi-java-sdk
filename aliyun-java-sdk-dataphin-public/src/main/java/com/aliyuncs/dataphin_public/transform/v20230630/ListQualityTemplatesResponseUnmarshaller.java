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

import com.aliyuncs.dataphin_public.model.v20230630.ListQualityTemplatesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityTemplatesResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityTemplatesResponse.PageResult.QualityTemplate;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityTemplatesResponse.PageResult.QualityTemplate.FormProperty;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQualityTemplatesResponseUnmarshaller {

	public static ListQualityTemplatesResponse unmarshall(ListQualityTemplatesResponse listQualityTemplatesResponse, UnmarshallerContext _ctx) {
		
		listQualityTemplatesResponse.setRequestId(_ctx.stringValue("ListQualityTemplatesResponse.RequestId"));
		listQualityTemplatesResponse.setSuccess(_ctx.booleanValue("ListQualityTemplatesResponse.Success"));
		listQualityTemplatesResponse.setHttpStatusCode(_ctx.integerValue("ListQualityTemplatesResponse.HttpStatusCode"));
		listQualityTemplatesResponse.setCode(_ctx.stringValue("ListQualityTemplatesResponse.Code"));
		listQualityTemplatesResponse.setMessage(_ctx.stringValue("ListQualityTemplatesResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListQualityTemplatesResponse.PageResult.TotalCount"));

		List<QualityTemplate> qualityTemplateList = new ArrayList<QualityTemplate>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList.Length"); i++) {
			QualityTemplate qualityTemplate = new QualityTemplate();
			qualityTemplate.setId(_ctx.longValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].Id"));
			qualityTemplate.setName(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].Name"));
			qualityTemplate.setType(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].Type"));
			qualityTemplate.setTypeName(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].TypeName"));
			qualityTemplate.setDescription(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].Description"));
			qualityTemplate.setOwner(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].Owner"));
			qualityTemplate.setOwnerName(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].OwnerName"));
			qualityTemplate.setCatalog(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].Catalog"));
			qualityTemplate.setCatalogName(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].CatalogName"));
			qualityTemplate.setSupportAllDataSourceType(_ctx.booleanValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].SupportAllDataSourceType"));
			qualityTemplate.setIsSystemTemplate(_ctx.booleanValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].IsSystemTemplate"));
			qualityTemplate.setCreator(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].Creator"));
			qualityTemplate.setCreatorName(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].CreatorName"));
			qualityTemplate.setCreateTime(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].CreateTime"));
			qualityTemplate.setModifyTime(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].ModifyTime"));
			qualityTemplate.setModifier(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].Modifier"));
			qualityTemplate.setModifierName(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].ModifierName"));

			List<String> supportDataSourceTypeList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].SupportDataSourceTypeList.Length"); j++) {
				supportDataSourceTypeList.add(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].SupportDataSourceTypeList["+ j +"]"));
			}
			qualityTemplate.setSupportDataSourceTypeList(supportDataSourceTypeList);

			List<FormProperty> formPropertyList = new ArrayList<FormProperty>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].FormPropertyList.Length"); j++) {
				FormProperty formProperty = new FormProperty();
				formProperty.setComponentType(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].FormPropertyList["+ j +"].ComponentType"));
				formProperty.setName(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].FormPropertyList["+ j +"].Name"));
				formProperty.setValue(_ctx.stringValue("ListQualityTemplatesResponse.PageResult.QualityTemplateList["+ i +"].FormPropertyList["+ j +"].Value"));

				formPropertyList.add(formProperty);
			}
			qualityTemplate.setFormPropertyList(formPropertyList);

			qualityTemplateList.add(qualityTemplate);
		}
		pageResult.setQualityTemplateList(qualityTemplateList);
		listQualityTemplatesResponse.setPageResult(pageResult);
	 
	 	return listQualityTemplatesResponse;
	}
}