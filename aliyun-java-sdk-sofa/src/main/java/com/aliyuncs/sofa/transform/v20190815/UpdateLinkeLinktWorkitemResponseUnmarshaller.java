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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktWorkitemResponseUnmarshaller {

	public static UpdateLinkeLinktWorkitemResponse unmarshall(UpdateLinkeLinktWorkitemResponse updateLinkeLinktWorkitemResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktWorkitemResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.RequestId"));
		updateLinkeLinktWorkitemResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.ResultCode"));
		updateLinkeLinktWorkitemResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.ResultMessage"));
		updateLinkeLinktWorkitemResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.ErrorCode"));
		updateLinkeLinktWorkitemResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.ErrorMessage"));
		updateLinkeLinktWorkitemResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.ResponseStatusCode"));
		updateLinkeLinktWorkitemResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktWorkitemResponse.Success"));

		Data data = new Data();
		data.setAssignedToIds(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.AssignedToIds"));
		data.setAsRootLevel(_ctx.booleanValue("UpdateLinkeLinktWorkitemResponse.Data.AsRootLevel"));
		data.setChildrenCount(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.Data.ChildrenCount"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Description"));
		data.setExpectedAt(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.Data.ExpectedAt"));
		data.setFilteredChildrenCount(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.Data.FilteredChildrenCount"));
		data.setFinishedChildrenCount(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.Data.FinishedChildrenCount"));
		data.setId(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.Data.Id"));
		data.setIteration(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Iteration"));
		data.setIterationSign(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.IterationSign"));
		data.setLink(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Link"));
		data.setModifier(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Modifier"));
		data.setParentSign(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.ParentSign"));
		data.setParentWorkItem(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.ParentWorkItem"));
		data.setPriority(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.Data.Priority"));
		data.setPriorityEntity(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.PriorityEntity"));
		data.setProject(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Project"));
		data.setProjectName(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.ProjectName"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Region"));
		data.setSign(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Sign"));
		data.setSignPath(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.SignPath"));
		data.setStamp(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Stamp"));
		data.setStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Status"));
		data.setStatusId(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.Data.StatusId"));
		data.setStatusStage(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.Data.StatusStage"));
		data.setSubject(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Subject"));
		data.setTemplate(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Template"));
		data.setTemplateId(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.Data.TemplateId"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemResponse.Data.UpdatedAt"));

		List<String> attachmentVOs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemResponse.Data.AttachmentVOs.Length"); i++) {
			attachmentVOs.add(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.AttachmentVOs["+ i +"]"));
		}
		data.setAttachmentVOs(attachmentVOs);

		List<String> ccs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemResponse.Data.Ccs.Length"); i++) {
			ccs.add(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Ccs["+ i +"]"));
		}
		data.setCcs(ccs);

		List<String> customFields = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemResponse.Data.CustomFields.Length"); i++) {
			customFields.add(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.CustomFields["+ i +"]"));
		}
		data.setCustomFields(customFields);

		List<String> customFieldsValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemResponse.Data.CustomFieldsValues.Length"); i++) {
			customFieldsValues.add(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.CustomFieldsValues["+ i +"]"));
		}
		data.setCustomFieldsValues(customFieldsValues);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemResponse.Data.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Modules["+ i +"]"));
		}
		data.setModules(modules);

		List<String> relatedProjects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemResponse.Data.RelatedProjects.Length"); i++) {
			relatedProjects.add(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.RelatedProjects["+ i +"]"));
		}
		data.setRelatedProjects(relatedProjects);

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemResponse.Data.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.Tags["+ i +"]"));
		}
		data.setTags(tags);

		List<String> templateList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemResponse.Data.TemplateList.Length"); i++) {
			templateList.add(_ctx.stringValue("UpdateLinkeLinktWorkitemResponse.Data.TemplateList["+ i +"]"));
		}
		data.setTemplateList(templateList);
		updateLinkeLinktWorkitemResponse.setData(data);
	 
	 	return updateLinkeLinktWorkitemResponse;
	}
}