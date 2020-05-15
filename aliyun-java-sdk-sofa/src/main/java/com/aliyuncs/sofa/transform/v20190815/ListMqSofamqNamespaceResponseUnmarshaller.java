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

import com.aliyuncs.sofa.model.v20190815.ListMqSofamqNamespaceResponse;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqNamespaceResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMqSofamqNamespaceResponseUnmarshaller {

	public static ListMqSofamqNamespaceResponse unmarshall(ListMqSofamqNamespaceResponse listMqSofamqNamespaceResponse, UnmarshallerContext _ctx) {
		
		listMqSofamqNamespaceResponse.setRequestId(_ctx.stringValue("ListMqSofamqNamespaceResponse.RequestId"));
		listMqSofamqNamespaceResponse.setResultCode(_ctx.stringValue("ListMqSofamqNamespaceResponse.ResultCode"));
		listMqSofamqNamespaceResponse.setResultMessage(_ctx.stringValue("ListMqSofamqNamespaceResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMqSofamqNamespaceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setGmtCreate(_ctx.stringValue("ListMqSofamqNamespaceResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListMqSofamqNamespaceResponse.Data["+ i +"].GmtModified"));
			dataItem.setId(_ctx.longValue("ListMqSofamqNamespaceResponse.Data["+ i +"].Id"));
			dataItem.setInstanceType(_ctx.stringValue("ListMqSofamqNamespaceResponse.Data["+ i +"].InstanceType"));
			dataItem.setNamespaceName(_ctx.stringValue("ListMqSofamqNamespaceResponse.Data["+ i +"].NamespaceName"));
			dataItem.setWorkspace(_ctx.stringValue("ListMqSofamqNamespaceResponse.Data["+ i +"].Workspace"));
			dataItem.setWorkspaceGroup(_ctx.stringValue("ListMqSofamqNamespaceResponse.Data["+ i +"].WorkspaceGroup"));

			data.add(dataItem);
		}
		listMqSofamqNamespaceResponse.setData(data);
	 
	 	return listMqSofamqNamespaceResponse;
	}
}