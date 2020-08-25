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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktWorkitemResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktWorkitemResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktWorkitemResponseUnmarshaller {

	public static CreateLinkeLinktWorkitemResponse unmarshall(CreateLinkeLinktWorkitemResponse createLinkeLinktWorkitemResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktWorkitemResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.RequestId"));
		createLinkeLinktWorkitemResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.ResultCode"));
		createLinkeLinktWorkitemResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.ResultMessage"));
		createLinkeLinktWorkitemResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktWorkitemResponse.ErrorCode"));
		createLinkeLinktWorkitemResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.ErrorMessage"));
		createLinkeLinktWorkitemResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinktWorkitemResponse.ResponseStatusCode"));
		createLinkeLinktWorkitemResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktWorkitemResponse.Success"));

		Data data = new Data();
		data.setAssignedToIds(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.AssignedToIds"));
		data.setAsRootLevel(_ctx.booleanValue("CreateLinkeLinktWorkitemResponse.Data.AsRootLevel"));
		data.setChildrenCount(_ctx.longValue("CreateLinkeLinktWorkitemResponse.Data.ChildrenCount"));
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktWorkitemResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktWorkitemResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Description"));
		data.setExpectedAt(_ctx.longValue("CreateLinkeLinktWorkitemResponse.Data.ExpectedAt"));
		data.setFilteredChildrenCount(_ctx.longValue("CreateLinkeLinktWorkitemResponse.Data.FilteredChildrenCount"));
		data.setFinishedChildrenCount(_ctx.longValue("CreateLinkeLinktWorkitemResponse.Data.FinishedChildrenCount"));
		data.setId(_ctx.longValue("CreateLinkeLinktWorkitemResponse.Data.Id"));
		data.setIteration(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Iteration"));
		data.setIterationSign(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.IterationSign"));
		data.setLink(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Link"));
		data.setModifier(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Modifier"));
		data.setParentSign(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.ParentSign"));
		data.setParentWorkItem(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.ParentWorkItem"));
		data.setPriority(_ctx.longValue("CreateLinkeLinktWorkitemResponse.Data.Priority"));
		data.setPriorityEntity(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.PriorityEntity"));
		data.setProject(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Project"));
		data.setProjectName(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.ProjectName"));
		data.setProjectSign(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Region"));
		data.setSign(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Sign"));
		data.setSignPath(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.SignPath"));
		data.setStamp(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Stamp"));
		data.setStatus(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Status"));
		data.setStatusId(_ctx.longValue("CreateLinkeLinktWorkitemResponse.Data.StatusId"));
		data.setStatusStage(_ctx.longValue("CreateLinkeLinktWorkitemResponse.Data.StatusStage"));
		data.setSubject(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Subject"));
		data.setTemplate(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Template"));
		data.setTemplateId(_ctx.longValue("CreateLinkeLinktWorkitemResponse.Data.TemplateId"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktWorkitemResponse.Data.UpdatedAt"));

		List<String> attachmentVOs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktWorkitemResponse.Data.AttachmentVOs.Length"); i++) {
			attachmentVOs.add(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.AttachmentVOs["+ i +"]"));
		}
		data.setAttachmentVOs(attachmentVOs);

		List<String> ccs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktWorkitemResponse.Data.Ccs.Length"); i++) {
			ccs.add(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Ccs["+ i +"]"));
		}
		data.setCcs(ccs);

		List<String> customFields = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktWorkitemResponse.Data.CustomFields.Length"); i++) {
			customFields.add(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.CustomFields["+ i +"]"));
		}
		data.setCustomFields(customFields);

		List<String> customFieldsValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktWorkitemResponse.Data.CustomFieldsValues.Length"); i++) {
			customFieldsValues.add(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.CustomFieldsValues["+ i +"]"));
		}
		data.setCustomFieldsValues(customFieldsValues);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktWorkitemResponse.Data.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Modules["+ i +"]"));
		}
		data.setModules(modules);

		List<String> relatedProjects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktWorkitemResponse.Data.RelatedProjects.Length"); i++) {
			relatedProjects.add(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.RelatedProjects["+ i +"]"));
		}
		data.setRelatedProjects(relatedProjects);

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktWorkitemResponse.Data.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.Tags["+ i +"]"));
		}
		data.setTags(tags);

		List<String> templateList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktWorkitemResponse.Data.TemplateList.Length"); i++) {
			templateList.add(_ctx.stringValue("CreateLinkeLinktWorkitemResponse.Data.TemplateList["+ i +"]"));
		}
		data.setTemplateList(templateList);
		createLinkeLinktWorkitemResponse.setData(data);
	 
	 	return createLinkeLinktWorkitemResponse;
	}
}