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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktWorkitemstampResponseUnmarshaller {

	public static UpdateLinkeLinktWorkitemstampResponse unmarshall(UpdateLinkeLinktWorkitemstampResponse updateLinkeLinktWorkitemstampResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktWorkitemstampResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.RequestId"));
		updateLinkeLinktWorkitemstampResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.ResultCode"));
		updateLinkeLinktWorkitemstampResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.ResultMessage"));
		updateLinkeLinktWorkitemstampResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.ErrorCode"));
		updateLinkeLinktWorkitemstampResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.ErrorMessage"));
		updateLinkeLinktWorkitemstampResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.ResponseStatusCode"));
		updateLinkeLinktWorkitemstampResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Success"));

		Data data = new Data();
		data.setAssignedToIds(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds"));
		data.setAsRootLevel(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.AsRootLevel"));
		data.setChildrenCount(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ChildrenCount"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Description"));
		data.setExpectedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ExpectedAt"));
		data.setFilteredChildrenCount(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.FilteredChildrenCount"));
		data.setFinishedChildrenCount(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.FinishedChildrenCount"));
		data.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Id"));
		data.setIteration(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Iteration"));
		data.setIterationSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.IterationSign"));
		data.setLink(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Link"));
		data.setModifier(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier"));
		data.setParentSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentSign"));
		data.setParentWorkItem(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem"));
		data.setPriority(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Priority"));
		data.setPriorityEntity(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.PriorityEntity"));
		data.setProject(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project"));
		data.setProjectName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ProjectName"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Region"));
		data.setSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Sign"));
		data.setSignPath(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.SignPath"));
		data.setStamp(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Stamp"));
		data.setStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Status"));
		data.setStatusId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.StatusId"));
		data.setStatusStage(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.StatusStage"));
		data.setSubject(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Subject"));
		data.setTemplate(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template"));
		data.setTemplateId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateId"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.UpdatedAt"));

		List<String> attachmentVOs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOs.Length"); i++) {
			attachmentVOs.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOs["+ i +"]"));
		}
		data.setAttachmentVOs(attachmentVOs);

		List<String> ccs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs.Length"); i++) {
			ccs.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"]"));
		}
		data.setCcs(ccs);

		List<String> customFields = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields.Length"); i++) {
			customFields.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"]"));
		}
		data.setCustomFields(customFields);

		List<String> customFieldsValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues.Length"); i++) {
			customFieldsValues.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"]"));
		}
		data.setCustomFieldsValues(customFieldsValues);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"]"));
		}
		data.setModules(modules);

		List<String> relatedProjects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects.Length"); i++) {
			relatedProjects.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"]"));
		}
		data.setRelatedProjects(relatedProjects);

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"]"));
		}
		data.setTags(tags);

		List<String> templateList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList.Length"); i++) {
			templateList.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"]"));
		}
		data.setTemplateList(templateList);
		updateLinkeLinktWorkitemstampResponse.setData(data);
	 
	 	return updateLinkeLinktWorkitemstampResponse;
	}
}