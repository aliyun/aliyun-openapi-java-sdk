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

import com.aliyuncs.dataphin_public.model.v20230630.ListBatchTemplatesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListBatchTemplatesResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListBatchTemplatesResponse.PageResult.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBatchTemplatesResponseUnmarshaller {

	public static ListBatchTemplatesResponse unmarshall(ListBatchTemplatesResponse listBatchTemplatesResponse, UnmarshallerContext _ctx) {
		
		listBatchTemplatesResponse.setRequestId(_ctx.stringValue("ListBatchTemplatesResponse.RequestId"));
		listBatchTemplatesResponse.setMessage(_ctx.stringValue("ListBatchTemplatesResponse.Message"));
		listBatchTemplatesResponse.setHttpStatusCode(_ctx.integerValue("ListBatchTemplatesResponse.HttpStatusCode"));
		listBatchTemplatesResponse.setCode(_ctx.stringValue("ListBatchTemplatesResponse.Code"));
		listBatchTemplatesResponse.setSuccess(_ctx.booleanValue("ListBatchTemplatesResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListBatchTemplatesResponse.PageResult.TotalCount"));

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("ListBatchTemplatesResponse.PageResult.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setStatus(_ctx.stringValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].Status"));
			template.setComment(_ctx.stringValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].Comment"));
			template.setOwner(_ctx.stringValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].Owner"));
			template.setDescription(_ctx.stringValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].Description"));
			template.setCurrentVersion(_ctx.longValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].CurrentVersion"));
			template.setProjectId(_ctx.longValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].ProjectId"));
			template.setGmtModified(_ctx.stringValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].GmtModified"));
			template.setOperatorType(_ctx.integerValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].OperatorType"));
			template.setName(_ctx.stringValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].Name"));
			template.setGmtCreate(_ctx.stringValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].GmtCreate"));
			template.setOwnerId(_ctx.stringValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].OwnerId"));
			template.setContent(_ctx.stringValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].Content"));
			template.setId(_ctx.longValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].Id"));
			template.setModifier(_ctx.stringValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].Modifier"));
			template.setEngine(_ctx.stringValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].Engine"));
			template.setModifierId(_ctx.stringValue("ListBatchTemplatesResponse.PageResult.TemplateList["+ i +"].ModifierId"));

			templateList.add(template);
		}
		pageResult.setTemplateList(templateList);
		listBatchTemplatesResponse.setPageResult(pageResult);
	 
	 	return listBatchTemplatesResponse;
	}
}