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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktGlobaltemplatedetailResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktGlobaltemplatedetailResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktGlobaltemplatedetailResponseUnmarshaller {

	public static ListLinkeLinktGlobaltemplatedetailResponse unmarshall(ListLinkeLinktGlobaltemplatedetailResponse listLinkeLinktGlobaltemplatedetailResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktGlobaltemplatedetailResponse.setRequestId(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.RequestId"));
		listLinkeLinktGlobaltemplatedetailResponse.setResultCode(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.ResultCode"));
		listLinkeLinktGlobaltemplatedetailResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.ResultMessage"));
		listLinkeLinktGlobaltemplatedetailResponse.setErrorCode(_ctx.longValue("ListLinkeLinktGlobaltemplatedetailResponse.ErrorCode"));
		listLinkeLinktGlobaltemplatedetailResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.ErrorMessage"));
		listLinkeLinktGlobaltemplatedetailResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktGlobaltemplatedetailResponse.ResponseStatusCode"));
		listLinkeLinktGlobaltemplatedetailResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktGlobaltemplatedetailResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktGlobaltemplatedetailResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.longValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].Creator"));
			dataItem.setDefaultContent(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].DefaultContent"));
			dataItem.setDeleted(_ctx.booleanValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].Description"));
			dataItem.setId(_ctx.longValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].Name"));
			dataItem.setPriority(_ctx.longValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].Priority"));
			dataItem.setProjectSign(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].ProjectSign"));
			dataItem.setStamp(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].Stamp"));
			dataItem.setTemplateLabel(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].TemplateLabel"));
			dataItem.setType(_ctx.longValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].Type"));
			dataItem.setUpdatedAt(_ctx.longValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].UpdatedAt"));
			dataItem.setWorkflow(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].Workflow"));
			dataItem.setWorkflowId(_ctx.longValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].WorkflowId"));

			List<String> customFieldsList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].CustomFieldsList.Length"); j++) {
				customFieldsList.add(_ctx.stringValue("ListLinkeLinktGlobaltemplatedetailResponse.Data["+ i +"].CustomFieldsList["+ j +"]"));
			}
			dataItem.setCustomFieldsList(customFieldsList);

			data.add(dataItem);
		}
		listLinkeLinktGlobaltemplatedetailResponse.setData(data);
	 
	 	return listLinkeLinktGlobaltemplatedetailResponse;
	}
}