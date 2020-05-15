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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListNamespacesResponse;
import com.aliyuncs.iovcc.model.v20180501.ListNamespacesResponse.Namespace;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNamespacesResponseUnmarshaller {

	public static ListNamespacesResponse unmarshall(ListNamespacesResponse listNamespacesResponse, UnmarshallerContext _ctx) {
		
		listNamespacesResponse.setRequestId(_ctx.stringValue("ListNamespacesResponse.RequestId"));

		List<Namespace> namespaces = new ArrayList<Namespace>();
		for (int i = 0; i < _ctx.lengthValue("ListNamespacesResponse.Namespaces.Length"); i++) {
			Namespace namespace = new Namespace();
			namespace.setNamespace(_ctx.stringValue("ListNamespacesResponse.Namespaces["+ i +"].Namespace"));
			namespace.setName(_ctx.stringValue("ListNamespacesResponse.Namespaces["+ i +"].Name"));
			namespace.setUserId(_ctx.stringValue("ListNamespacesResponse.Namespaces["+ i +"].UserId"));
			namespace.setProjectId(_ctx.stringValue("ListNamespacesResponse.Namespaces["+ i +"].ProjectId"));
			namespace.setDescription(_ctx.stringValue("ListNamespacesResponse.Namespaces["+ i +"].Description"));
			namespace.setGmtCreate(_ctx.longValue("ListNamespacesResponse.Namespaces["+ i +"].GmtCreate"));
			namespace.setGmtModified(_ctx.longValue("ListNamespacesResponse.Namespaces["+ i +"].GmtModified"));
			namespace.setAuthType(_ctx.integerValue("ListNamespacesResponse.Namespaces["+ i +"].AuthType"));

			namespaces.add(namespace);
		}
		listNamespacesResponse.setNamespaces(namespaces);
	 
	 	return listNamespacesResponse;
	}
}