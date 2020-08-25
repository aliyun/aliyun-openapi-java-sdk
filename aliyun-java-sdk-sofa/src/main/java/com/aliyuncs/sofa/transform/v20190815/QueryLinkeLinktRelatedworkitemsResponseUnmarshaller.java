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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktRelatedworkitemsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktRelatedworkitemsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktRelatedworkitemsResponseUnmarshaller {

	public static QueryLinkeLinktRelatedworkitemsResponse unmarshall(QueryLinkeLinktRelatedworkitemsResponse queryLinkeLinktRelatedworkitemsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktRelatedworkitemsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.RequestId"));
		queryLinkeLinktRelatedworkitemsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.ResultCode"));
		queryLinkeLinktRelatedworkitemsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.ResultMessage"));
		queryLinkeLinktRelatedworkitemsResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.ErrorCode"));
		queryLinkeLinktRelatedworkitemsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.ErrorMessage"));
		queryLinkeLinktRelatedworkitemsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.ResponseStatusCode"));
		queryLinkeLinktRelatedworkitemsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktRelatedworkitemsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktRelatedworkitemsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAssignedToIds(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].AssignedToIds"));
			dataItem.setAsRootLevel(_ctx.booleanValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].AsRootLevel"));
			dataItem.setChildrenCount(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].ChildrenCount"));
			dataItem.setCreatedAt(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Description"));
			dataItem.setExpectedAt(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].ExpectedAt"));
			dataItem.setFilteredChildrenCount(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].FilteredChildrenCount"));
			dataItem.setFinishedChildrenCount(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].FinishedChildrenCount"));
			dataItem.setId(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Id"));
			dataItem.setIteration(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Iteration"));
			dataItem.setIterationSign(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].IterationSign"));
			dataItem.setLink(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Link"));
			dataItem.setModifier(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Modifier"));
			dataItem.setParentSign(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].ParentSign"));
			dataItem.setParentWorkItem(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].ParentWorkItem"));
			dataItem.setPriority(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Priority"));
			dataItem.setPriorityEntity(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].PriorityEntity"));
			dataItem.setProject(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Project"));
			dataItem.setProjectName(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].ProjectName"));
			dataItem.setProjectSign(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Region"));
			dataItem.setSign(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Sign"));
			dataItem.setSignPath(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].SignPath"));
			dataItem.setStamp(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Stamp"));
			dataItem.setStatus(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Status"));
			dataItem.setStatusId(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].StatusId"));
			dataItem.setStatusStage(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].StatusStage"));
			dataItem.setSubject(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Subject"));
			dataItem.setTemplate(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Template"));
			dataItem.setTemplateId(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].TemplateId"));
			dataItem.setUpdatedAt(_ctx.longValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].UpdatedAt"));

			List<String> attachmentVOs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].AttachmentVOs.Length"); j++) {
				attachmentVOs.add(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].AttachmentVOs["+ j +"]"));
			}
			dataItem.setAttachmentVOs(attachmentVOs);

			List<String> ccs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Ccs.Length"); j++) {
				ccs.add(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Ccs["+ j +"]"));
			}
			dataItem.setCcs(ccs);

			List<String> customFields = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].CustomFields.Length"); j++) {
				customFields.add(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].CustomFields["+ j +"]"));
			}
			dataItem.setCustomFields(customFields);

			List<String> customFieldsValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].CustomFieldsValues.Length"); j++) {
				customFieldsValues.add(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].CustomFieldsValues["+ j +"]"));
			}
			dataItem.setCustomFieldsValues(customFieldsValues);

			List<String> modules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Modules.Length"); j++) {
				modules.add(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Modules["+ j +"]"));
			}
			dataItem.setModules(modules);

			List<String> relatedProjects = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].RelatedProjects.Length"); j++) {
				relatedProjects.add(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].RelatedProjects["+ j +"]"));
			}
			dataItem.setRelatedProjects(relatedProjects);

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].Tags["+ j +"]"));
			}
			dataItem.setTags(tags);

			List<String> templateList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].TemplateList.Length"); j++) {
				templateList.add(_ctx.stringValue("QueryLinkeLinktRelatedworkitemsResponse.Data["+ i +"].TemplateList["+ j +"]"));
			}
			dataItem.setTemplateList(templateList);

			data.add(dataItem);
		}
		queryLinkeLinktRelatedworkitemsResponse.setData(data);
	 
	 	return queryLinkeLinktRelatedworkitemsResponse;
	}
}