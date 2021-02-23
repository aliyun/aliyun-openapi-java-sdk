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

package com.aliyuncs.schedulerx2.transform.v20190430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx2.model.v20190430.ListNamespacesResponse;
import com.aliyuncs.schedulerx2.model.v20190430.ListNamespacesResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.ListNamespacesResponse.Data.Namespace;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNamespacesResponseUnmarshaller {

	public static ListNamespacesResponse unmarshall(ListNamespacesResponse listNamespacesResponse, UnmarshallerContext _ctx) {
		
		listNamespacesResponse.setRequestId(_ctx.stringValue("ListNamespacesResponse.RequestId"));
		listNamespacesResponse.setCode(_ctx.integerValue("ListNamespacesResponse.Code"));
		listNamespacesResponse.setSuccess(_ctx.booleanValue("ListNamespacesResponse.Success"));
		listNamespacesResponse.setMessage(_ctx.stringValue("ListNamespacesResponse.Message"));

		Data data = new Data();

		List<Namespace> namespaces = new ArrayList<Namespace>();
		for (int i = 0; i < _ctx.lengthValue("ListNamespacesResponse.Data.Namespaces.Length"); i++) {
			Namespace namespace = new Namespace();
			namespace.setName(_ctx.stringValue("ListNamespacesResponse.Data.Namespaces["+ i +"].Name"));
			namespace.setUId(_ctx.stringValue("ListNamespacesResponse.Data.Namespaces["+ i +"].UId"));
			namespace.setDescription(_ctx.stringValue("ListNamespacesResponse.Data.Namespaces["+ i +"].Description"));

			namespaces.add(namespace);
		}
		data.setNamespaces(namespaces);
		listNamespacesResponse.setData(data);
	 
	 	return listNamespacesResponse;
	}
}