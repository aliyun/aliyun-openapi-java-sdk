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

import com.aliyuncs.sofa.model.v20190815.CountLinkeLinktWorkitemgroupResponse;
import com.aliyuncs.sofa.model.v20190815.CountLinkeLinktWorkitemgroupResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountLinkeLinktWorkitemgroupResponseUnmarshaller {

	public static CountLinkeLinktWorkitemgroupResponse unmarshall(CountLinkeLinktWorkitemgroupResponse countLinkeLinktWorkitemgroupResponse, UnmarshallerContext _ctx) {
		
		countLinkeLinktWorkitemgroupResponse.setRequestId(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.RequestId"));
		countLinkeLinktWorkitemgroupResponse.setResultCode(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.ResultCode"));
		countLinkeLinktWorkitemgroupResponse.setResultMessage(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.ResultMessage"));
		countLinkeLinktWorkitemgroupResponse.setErrorCode(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.ErrorCode"));
		countLinkeLinktWorkitemgroupResponse.setErrorMessage(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.ErrorMessage"));
		countLinkeLinktWorkitemgroupResponse.setResponseStatusCode(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.ResponseStatusCode"));
		countLinkeLinktWorkitemgroupResponse.setSuccess(_ctx.booleanValue("CountLinkeLinktWorkitemgroupResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("CountLinkeLinktWorkitemgroupResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAssignedToIds(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].AssignedToIds"));
			dataItem.setAsRootLevel(_ctx.booleanValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].AsRootLevel"));
			dataItem.setChildrenCount(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].ChildrenCount"));
			dataItem.setCount(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Count"));
			dataItem.setCreatedAt(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Description"));
			dataItem.setExpectedAt(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].ExpectedAt"));
			dataItem.setFilteredChildrenCount(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].FilteredChildrenCount"));
			dataItem.setFinishedChildrenCount(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].FinishedChildrenCount"));
			dataItem.setId(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Id"));
			dataItem.setIteration(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Iteration"));
			dataItem.setIterationSign(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].IterationSign"));
			dataItem.setKey(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Key"));
			dataItem.setLink(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Link"));
			dataItem.setModifier(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Modifier"));
			dataItem.setParentSign(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].ParentSign"));
			dataItem.setParentWorkItem(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].ParentWorkItem"));
			dataItem.setPriority(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Priority"));
			dataItem.setPriorityEntity(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].PriorityEntity"));
			dataItem.setProject(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Project"));
			dataItem.setProjectName(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].ProjectName"));
			dataItem.setProjectSign(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Region"));
			dataItem.setSign(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Sign"));
			dataItem.setSignPath(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].SignPath"));
			dataItem.setStamp(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Stamp"));
			dataItem.setStatus(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Status"));
			dataItem.setStatusId(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].StatusId"));
			dataItem.setStatusStage(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].StatusStage"));
			dataItem.setSubject(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Subject"));
			dataItem.setTemplate(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Template"));
			dataItem.setTemplateId(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].TemplateId"));
			dataItem.setUpdatedAt(_ctx.longValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].UpdatedAt"));

			List<String> attachmentVOs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].AttachmentVOs.Length"); j++) {
				attachmentVOs.add(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].AttachmentVOs["+ j +"]"));
			}
			dataItem.setAttachmentVOs(attachmentVOs);

			List<String> ccs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Ccs.Length"); j++) {
				ccs.add(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Ccs["+ j +"]"));
			}
			dataItem.setCcs(ccs);

			List<String> customFields = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].CustomFields.Length"); j++) {
				customFields.add(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].CustomFields["+ j +"]"));
			}
			dataItem.setCustomFields(customFields);

			List<String> customFieldsValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].CustomFieldsValues.Length"); j++) {
				customFieldsValues.add(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].CustomFieldsValues["+ j +"]"));
			}
			dataItem.setCustomFieldsValues(customFieldsValues);

			List<String> modules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Modules.Length"); j++) {
				modules.add(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Modules["+ j +"]"));
			}
			dataItem.setModules(modules);

			List<String> relatedProjects = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].RelatedProjects.Length"); j++) {
				relatedProjects.add(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].RelatedProjects["+ j +"]"));
			}
			dataItem.setRelatedProjects(relatedProjects);

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].Tags["+ j +"]"));
			}
			dataItem.setTags(tags);

			List<String> templateList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].TemplateList.Length"); j++) {
				templateList.add(_ctx.stringValue("CountLinkeLinktWorkitemgroupResponse.Data["+ i +"].TemplateList["+ j +"]"));
			}
			dataItem.setTemplateList(templateList);

			data.add(dataItem);
		}
		countLinkeLinktWorkitemgroupResponse.setData(data);
	 
	 	return countLinkeLinktWorkitemgroupResponse;
	}
}