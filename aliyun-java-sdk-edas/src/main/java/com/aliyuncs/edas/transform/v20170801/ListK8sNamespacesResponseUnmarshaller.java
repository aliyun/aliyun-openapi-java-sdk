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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListK8sNamespacesResponse;
import com.aliyuncs.edas.model.v20170801.ListK8sNamespacesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListK8sNamespacesResponseUnmarshaller {

	public static ListK8sNamespacesResponse unmarshall(ListK8sNamespacesResponse listK8sNamespacesResponse, UnmarshallerContext _ctx) {
		
		listK8sNamespacesResponse.setRequestId(_ctx.stringValue("ListK8sNamespacesResponse.RequestId"));
		listK8sNamespacesResponse.setCode(_ctx.integerValue("ListK8sNamespacesResponse.Code"));
		listK8sNamespacesResponse.setMessage(_ctx.stringValue("ListK8sNamespacesResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListK8sNamespacesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setNamespace(_ctx.stringValue("ListK8sNamespacesResponse.Data["+ i +"].Namespace"));

			data.add(dataItem);
		}
		listK8sNamespacesResponse.setData(data);
	 
	 	return listK8sNamespacesResponse;
	}
}