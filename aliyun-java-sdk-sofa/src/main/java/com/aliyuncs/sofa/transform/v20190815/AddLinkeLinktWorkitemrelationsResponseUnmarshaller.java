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

import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeLinktWorkitemrelationsResponseUnmarshaller {

	public static AddLinkeLinktWorkitemrelationsResponse unmarshall(AddLinkeLinktWorkitemrelationsResponse addLinkeLinktWorkitemrelationsResponse, UnmarshallerContext _ctx) {
		
		addLinkeLinktWorkitemrelationsResponse.setRequestId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.RequestId"));
		addLinkeLinktWorkitemrelationsResponse.setResultCode(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.ResultCode"));
		addLinkeLinktWorkitemrelationsResponse.setResultMessage(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.ResultMessage"));
		addLinkeLinktWorkitemrelationsResponse.setErrorCode(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.ErrorCode"));
		addLinkeLinktWorkitemrelationsResponse.setErrorMessage(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.ErrorMessage"));
		addLinkeLinktWorkitemrelationsResponse.setResponseStatusCode(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.ResponseStatusCode"));
		addLinkeLinktWorkitemrelationsResponse.setSuccess(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAssignedToIds(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds"));
			dataItem.setAsRootLevel(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AsRootLevel"));
			dataItem.setChildrenCount(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ChildrenCount"));
			dataItem.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Description"));
			dataItem.setExpectedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ExpectedAt"));
			dataItem.setFilteredChildrenCount(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].FilteredChildrenCount"));
			dataItem.setFinishedChildrenCount(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].FinishedChildrenCount"));
			dataItem.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Id"));
			dataItem.setIteration(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Iteration"));
			dataItem.setIterationSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].IterationSign"));
			dataItem.setLink(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Link"));
			dataItem.setModifier(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier"));
			dataItem.setParentSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentSign"));
			dataItem.setParentWorkItem(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem"));
			dataItem.setPriority(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Priority"));
			dataItem.setPriorityEntity(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].PriorityEntity"));
			dataItem.setProject(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project"));
			dataItem.setProjectName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ProjectName"));
			dataItem.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Region"));
			dataItem.setSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Sign"));
			dataItem.setSignPath(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].SignPath"));
			dataItem.setStamp(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Stamp"));
			dataItem.setStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Status"));
			dataItem.setStatusId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].StatusId"));
			dataItem.setStatusStage(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].StatusStage"));
			dataItem.setSubject(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Subject"));
			dataItem.setTemplate(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template"));
			dataItem.setTemplateId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateId"));
			dataItem.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].UpdatedAt"));

			List<String> attachmentVOs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AttachmentVOs.Length"); j++) {
				attachmentVOs.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AttachmentVOs["+ j +"]"));
			}
			dataItem.setAttachmentVOs(attachmentVOs);

			List<String> ccs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs.Length"); j++) {
				ccs.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"]"));
			}
			dataItem.setCcs(ccs);

			List<String> customFields = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields.Length"); j++) {
				customFields.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"]"));
			}
			dataItem.setCustomFields(customFields);

			List<String> customFieldsValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues.Length"); j++) {
				customFieldsValues.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"]"));
			}
			dataItem.setCustomFieldsValues(customFieldsValues);

			List<String> modules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules.Length"); j++) {
				modules.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"]"));
			}
			dataItem.setModules(modules);

			List<String> relatedProjects = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects.Length"); j++) {
				relatedProjects.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"]"));
			}
			dataItem.setRelatedProjects(relatedProjects);

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"]"));
			}
			dataItem.setTags(tags);

			List<String> templateList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList.Length"); j++) {
				templateList.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"]"));
			}
			dataItem.setTemplateList(templateList);

			data.add(dataItem);
		}
		addLinkeLinktWorkitemrelationsResponse.setData(data);
	 
	 	return addLinkeLinktWorkitemrelationsResponse;
	}
}