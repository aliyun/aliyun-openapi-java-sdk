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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktWorkitemResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktWorkitemResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktWorkitemResponseUnmarshaller {

	public static QueryLinkeLinktWorkitemResponse unmarshall(QueryLinkeLinktWorkitemResponse queryLinkeLinktWorkitemResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktWorkitemResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.RequestId"));
		queryLinkeLinktWorkitemResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.ResultCode"));
		queryLinkeLinktWorkitemResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.ResultMessage"));
		queryLinkeLinktWorkitemResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktWorkitemResponse.ErrorCode"));
		queryLinkeLinktWorkitemResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.ErrorMessage"));
		queryLinkeLinktWorkitemResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktWorkitemResponse.ResponseStatusCode"));
		queryLinkeLinktWorkitemResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktWorkitemResponse.Success"));

		Data data = new Data();
		data.setAssignedToIds(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.AssignedToIds"));
		data.setAsRootLevel(_ctx.booleanValue("QueryLinkeLinktWorkitemResponse.Data.AsRootLevel"));
		data.setChildrenCount(_ctx.longValue("QueryLinkeLinktWorkitemResponse.Data.ChildrenCount"));
		data.setCreatedAt(_ctx.longValue("QueryLinkeLinktWorkitemResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("QueryLinkeLinktWorkitemResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Description"));
		data.setExpectedAt(_ctx.longValue("QueryLinkeLinktWorkitemResponse.Data.ExpectedAt"));
		data.setFilteredChildrenCount(_ctx.longValue("QueryLinkeLinktWorkitemResponse.Data.FilteredChildrenCount"));
		data.setFinishedChildrenCount(_ctx.longValue("QueryLinkeLinktWorkitemResponse.Data.FinishedChildrenCount"));
		data.setId(_ctx.longValue("QueryLinkeLinktWorkitemResponse.Data.Id"));
		data.setIteration(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Iteration"));
		data.setIterationSign(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.IterationSign"));
		data.setLink(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Link"));
		data.setModifier(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Modifier"));
		data.setParentSign(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.ParentSign"));
		data.setParentWorkItem(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.ParentWorkItem"));
		data.setPriority(_ctx.longValue("QueryLinkeLinktWorkitemResponse.Data.Priority"));
		data.setPriorityEntity(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.PriorityEntity"));
		data.setProject(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Project"));
		data.setProjectName(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.ProjectName"));
		data.setProjectSign(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Region"));
		data.setSign(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Sign"));
		data.setSignPath(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.SignPath"));
		data.setStamp(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Stamp"));
		data.setStatus(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Status"));
		data.setStatusId(_ctx.longValue("QueryLinkeLinktWorkitemResponse.Data.StatusId"));
		data.setStatusStage(_ctx.longValue("QueryLinkeLinktWorkitemResponse.Data.StatusStage"));
		data.setSubject(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Subject"));
		data.setTemplate(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Template"));
		data.setTemplateId(_ctx.longValue("QueryLinkeLinktWorkitemResponse.Data.TemplateId"));
		data.setUpdatedAt(_ctx.longValue("QueryLinkeLinktWorkitemResponse.Data.UpdatedAt"));

		List<String> attachmentVOs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktWorkitemResponse.Data.AttachmentVOs.Length"); i++) {
			attachmentVOs.add(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.AttachmentVOs["+ i +"]"));
		}
		data.setAttachmentVOs(attachmentVOs);

		List<String> ccs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktWorkitemResponse.Data.Ccs.Length"); i++) {
			ccs.add(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Ccs["+ i +"]"));
		}
		data.setCcs(ccs);

		List<String> customFields = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktWorkitemResponse.Data.CustomFields.Length"); i++) {
			customFields.add(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.CustomFields["+ i +"]"));
		}
		data.setCustomFields(customFields);

		List<String> customFieldsValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktWorkitemResponse.Data.CustomFieldsValues.Length"); i++) {
			customFieldsValues.add(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.CustomFieldsValues["+ i +"]"));
		}
		data.setCustomFieldsValues(customFieldsValues);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktWorkitemResponse.Data.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Modules["+ i +"]"));
		}
		data.setModules(modules);

		List<String> relatedProjects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktWorkitemResponse.Data.RelatedProjects.Length"); i++) {
			relatedProjects.add(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.RelatedProjects["+ i +"]"));
		}
		data.setRelatedProjects(relatedProjects);

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktWorkitemResponse.Data.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.Tags["+ i +"]"));
		}
		data.setTags(tags);

		List<String> templateList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktWorkitemResponse.Data.TemplateList.Length"); i++) {
			templateList.add(_ctx.stringValue("QueryLinkeLinktWorkitemResponse.Data.TemplateList["+ i +"]"));
		}
		data.setTemplateList(templateList);
		queryLinkeLinktWorkitemResponse.setData(data);
	 
	 	return queryLinkeLinktWorkitemResponse;
	}
}