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

import com.aliyuncs.sofa.model.v20190815.ListLinkelinkflowLinkflowAttachmentsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkelinkflowLinkflowAttachmentsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkelinkflowLinkflowAttachmentsResponseUnmarshaller {

	public static ListLinkelinkflowLinkflowAttachmentsResponse unmarshall(ListLinkelinkflowLinkflowAttachmentsResponse listLinkelinkflowLinkflowAttachmentsResponse, UnmarshallerContext _ctx) {
		
		listLinkelinkflowLinkflowAttachmentsResponse.setRequestId(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.RequestId"));
		listLinkelinkflowLinkflowAttachmentsResponse.setResultCode(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.ResultCode"));
		listLinkelinkflowLinkflowAttachmentsResponse.setResultMessage(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.ResultMessage"));
		listLinkelinkflowLinkflowAttachmentsResponse.setCurrent(_ctx.longValue("ListLinkelinkflowLinkflowAttachmentsResponse.Current"));
		listLinkelinkflowLinkflowAttachmentsResponse.setErrorCode(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.ErrorCode"));
		listLinkelinkflowLinkflowAttachmentsResponse.setErrorMsg(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.ErrorMsg"));
		listLinkelinkflowLinkflowAttachmentsResponse.setPageSize(_ctx.longValue("ListLinkelinkflowLinkflowAttachmentsResponse.PageSize"));
		listLinkelinkflowLinkflowAttachmentsResponse.setResponseStatusCode(_ctx.longValue("ListLinkelinkflowLinkflowAttachmentsResponse.ResponseStatusCode"));
		listLinkelinkflowLinkflowAttachmentsResponse.setSuccess(_ctx.booleanValue("ListLinkelinkflowLinkflowAttachmentsResponse.Success"));
		listLinkelinkflowLinkflowAttachmentsResponse.setTotal(_ctx.longValue("ListLinkelinkflowLinkflowAttachmentsResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkelinkflowLinkflowAttachmentsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreated(_ctx.longValue("ListLinkelinkflowLinkflowAttachmentsResponse.Data["+ i +"].Created"));
			dataItem.setCreator(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.Data["+ i +"].Creator"));
			dataItem.setDescription(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.Data["+ i +"].Description"));
			dataItem.setId(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.Data["+ i +"].Name"));
			dataItem.setProcessInstanceId(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.Data["+ i +"].ProcessInstanceId"));
			dataItem.setTaskId(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.Data["+ i +"].TaskId"));
			dataItem.setType(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.Data["+ i +"].Type"));
			dataItem.setUrl(_ctx.stringValue("ListLinkelinkflowLinkflowAttachmentsResponse.Data["+ i +"].Url"));

			data.add(dataItem);
		}
		listLinkelinkflowLinkflowAttachmentsResponse.setData(data);
	 
	 	return listLinkelinkflowLinkflowAttachmentsResponse;
	}
}