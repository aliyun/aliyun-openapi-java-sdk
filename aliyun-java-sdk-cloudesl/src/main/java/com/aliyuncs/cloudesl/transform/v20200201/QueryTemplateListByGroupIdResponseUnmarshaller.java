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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.QueryTemplateListByGroupIdResponse;
import com.aliyuncs.cloudesl.model.v20200201.QueryTemplateListByGroupIdResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTemplateListByGroupIdResponseUnmarshaller {

	public static QueryTemplateListByGroupIdResponse unmarshall(QueryTemplateListByGroupIdResponse queryTemplateListByGroupIdResponse, UnmarshallerContext _ctx) {
		
		queryTemplateListByGroupIdResponse.setRequestId(_ctx.stringValue("QueryTemplateListByGroupIdResponse.RequestId"));
		queryTemplateListByGroupIdResponse.setErrorMessage(_ctx.stringValue("QueryTemplateListByGroupIdResponse.ErrorMessage"));
		queryTemplateListByGroupIdResponse.setSuccess(_ctx.booleanValue("QueryTemplateListByGroupIdResponse.Success"));
		queryTemplateListByGroupIdResponse.setErrorCode(_ctx.stringValue("QueryTemplateListByGroupIdResponse.ErrorCode"));
		queryTemplateListByGroupIdResponse.setCode(_ctx.stringValue("QueryTemplateListByGroupIdResponse.Code"));
		queryTemplateListByGroupIdResponse.setMessage(_ctx.stringValue("QueryTemplateListByGroupIdResponse.Message"));
		queryTemplateListByGroupIdResponse.setDynamicMessage(_ctx.stringValue("QueryTemplateListByGroupIdResponse.DynamicMessage"));
		queryTemplateListByGroupIdResponse.setDynamicCode(_ctx.stringValue("QueryTemplateListByGroupIdResponse.DynamicCode"));
		queryTemplateListByGroupIdResponse.setTotalCount(_ctx.integerValue("QueryTemplateListByGroupIdResponse.TotalCount"));
		queryTemplateListByGroupIdResponse.setPageSize(_ctx.integerValue("QueryTemplateListByGroupIdResponse.PageSize"));
		queryTemplateListByGroupIdResponse.setPageNumber(_ctx.integerValue("QueryTemplateListByGroupIdResponse.PageNumber"));

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("QueryTemplateListByGroupIdResponse.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setBasePicture(_ctx.stringValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].BasePicture"));
			template.setTemplateId(_ctx.stringValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].TemplateId"));
			template.setTemplateName(_ctx.stringValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].TemplateName"));
			template.setEslSize(_ctx.stringValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].EslSize"));
			template.setEslType(_ctx.stringValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].EslType"));
			template.setWidth(_ctx.longValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].Width"));
			template.setHeight(_ctx.longValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].Height"));
			template.setTemplateVersion(_ctx.stringValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].TemplateVersion"));
			template.setLayout(_ctx.stringValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].Layout"));
			template.setScene(_ctx.stringValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].Scene"));
			template.setBrand(_ctx.stringValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].Brand"));
			template.setGroupId(_ctx.stringValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].GroupId"));
			template.setTemplateSceneId(_ctx.stringValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].TemplateSceneId"));
			template.setRelation(_ctx.booleanValue("QueryTemplateListByGroupIdResponse.TemplateList["+ i +"].Relation"));

			templateList.add(template);
		}
		queryTemplateListByGroupIdResponse.setTemplateList(templateList);
	 
	 	return queryTemplateListByGroupIdResponse;
	}
}