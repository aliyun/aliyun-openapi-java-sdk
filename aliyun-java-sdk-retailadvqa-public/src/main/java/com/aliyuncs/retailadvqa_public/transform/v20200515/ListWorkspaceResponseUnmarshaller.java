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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.ListWorkspaceResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListWorkspaceResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkspaceResponseUnmarshaller {

	public static ListWorkspaceResponse unmarshall(ListWorkspaceResponse listWorkspaceResponse, UnmarshallerContext _ctx) {
		
		listWorkspaceResponse.setRequestId(_ctx.stringValue("ListWorkspaceResponse.RequestId"));
		listWorkspaceResponse.setErrorDesc(_ctx.stringValue("ListWorkspaceResponse.ErrorDesc"));
		listWorkspaceResponse.setTraceId(_ctx.stringValue("ListWorkspaceResponse.TraceId"));
		listWorkspaceResponse.setErrorCode(_ctx.stringValue("ListWorkspaceResponse.ErrorCode"));
		listWorkspaceResponse.setSuccess(_ctx.booleanValue("ListWorkspaceResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkspaceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setWorkspaceId(_ctx.stringValue("ListWorkspaceResponse.Data["+ i +"].WorkspaceId"));
			dataItem.setGmtCreate(_ctx.stringValue("ListWorkspaceResponse.Data["+ i +"].GmtCreate"));
			dataItem.setWorkspaceName(_ctx.stringValue("ListWorkspaceResponse.Data["+ i +"].WorkspaceName"));

			data.add(dataItem);
		}
		listWorkspaceResponse.setData(data);
	 
	 	return listWorkspaceResponse;
	}
}