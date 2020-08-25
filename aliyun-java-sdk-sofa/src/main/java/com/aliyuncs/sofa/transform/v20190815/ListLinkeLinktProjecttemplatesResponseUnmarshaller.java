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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktProjecttemplatesResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktProjecttemplatesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktProjecttemplatesResponseUnmarshaller {

	public static ListLinkeLinktProjecttemplatesResponse unmarshall(ListLinkeLinktProjecttemplatesResponse listLinkeLinktProjecttemplatesResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktProjecttemplatesResponse.setRequestId(_ctx.stringValue("ListLinkeLinktProjecttemplatesResponse.RequestId"));
		listLinkeLinktProjecttemplatesResponse.setResultCode(_ctx.stringValue("ListLinkeLinktProjecttemplatesResponse.ResultCode"));
		listLinkeLinktProjecttemplatesResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktProjecttemplatesResponse.ResultMessage"));
		listLinkeLinktProjecttemplatesResponse.setErrorCode(_ctx.longValue("ListLinkeLinktProjecttemplatesResponse.ErrorCode"));
		listLinkeLinktProjecttemplatesResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktProjecttemplatesResponse.ErrorMessage"));
		listLinkeLinktProjecttemplatesResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktProjecttemplatesResponse.ResponseStatusCode"));
		listLinkeLinktProjecttemplatesResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktProjecttemplatesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktProjecttemplatesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.longValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].Creator"));
			dataItem.setDefaultContent(_ctx.stringValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].DefaultContent"));
			dataItem.setDeleted(_ctx.booleanValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].Description"));
			dataItem.setId(_ctx.longValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].Name"));
			dataItem.setPriority(_ctx.longValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].Priority"));
			dataItem.setProjectSign(_ctx.stringValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].ProjectSign"));
			dataItem.setStamp(_ctx.stringValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].Stamp"));
			dataItem.setTemplateLabel(_ctx.stringValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].TemplateLabel"));
			dataItem.setType(_ctx.longValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].Type"));
			dataItem.setUpdatedAt(_ctx.longValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].UpdatedAt"));
			dataItem.setWorkflowId(_ctx.longValue("ListLinkeLinktProjecttemplatesResponse.Data["+ i +"].WorkflowId"));

			data.add(dataItem);
		}
		listLinkeLinktProjecttemplatesResponse.setData(data);
	 
	 	return listLinkeLinktProjecttemplatesResponse;
	}
}