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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListNamespaceResponse;
import com.aliyuncs.cr.model.v20181201.ListNamespaceResponse.NamespacesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNamespaceResponseUnmarshaller {

	public static ListNamespaceResponse unmarshall(ListNamespaceResponse listNamespaceResponse, UnmarshallerContext _ctx) {
		
		listNamespaceResponse.setRequestId(_ctx.stringValue("ListNamespaceResponse.RequestId"));
		listNamespaceResponse.setIsSuccess(_ctx.booleanValue("ListNamespaceResponse.IsSuccess"));
		listNamespaceResponse.setCode(_ctx.stringValue("ListNamespaceResponse.Code"));
		listNamespaceResponse.setPageNo(_ctx.integerValue("ListNamespaceResponse.PageNo"));
		listNamespaceResponse.setPageSize(_ctx.integerValue("ListNamespaceResponse.PageSize"));
		listNamespaceResponse.setTotalCount(_ctx.stringValue("ListNamespaceResponse.TotalCount"));

		List<NamespacesItem> namespaces = new ArrayList<NamespacesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListNamespaceResponse.Namespaces.Length"); i++) {
			NamespacesItem namespacesItem = new NamespacesItem();
			namespacesItem.setNamespaceName(_ctx.stringValue("ListNamespaceResponse.Namespaces["+ i +"].NamespaceName"));
			namespacesItem.setNamespaceStatus(_ctx.stringValue("ListNamespaceResponse.Namespaces["+ i +"].NamespaceStatus"));
			namespacesItem.setAutoCreateRepo(_ctx.booleanValue("ListNamespaceResponse.Namespaces["+ i +"].AutoCreateRepo"));
			namespacesItem.setDefaultRepoType(_ctx.stringValue("ListNamespaceResponse.Namespaces["+ i +"].DefaultRepoType"));
			namespacesItem.setInstanceId(_ctx.stringValue("ListNamespaceResponse.Namespaces["+ i +"].InstanceId"));
			namespacesItem.setNamespaceId(_ctx.stringValue("ListNamespaceResponse.Namespaces["+ i +"].NamespaceId"));

			namespaces.add(namespacesItem);
		}
		listNamespaceResponse.setNamespaces(namespaces);
	 
	 	return listNamespaceResponse;
	}
}