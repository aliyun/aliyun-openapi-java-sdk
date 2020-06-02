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

import com.aliyuncs.cr.model.v20181201.ListChartNamespaceResponse;
import com.aliyuncs.cr.model.v20181201.ListChartNamespaceResponse.NamespacesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChartNamespaceResponseUnmarshaller {

	public static ListChartNamespaceResponse unmarshall(ListChartNamespaceResponse listChartNamespaceResponse, UnmarshallerContext _ctx) {
		
		listChartNamespaceResponse.setRequestId(_ctx.stringValue("ListChartNamespaceResponse.RequestId"));
		listChartNamespaceResponse.setIsSuccess(_ctx.booleanValue("ListChartNamespaceResponse.IsSuccess"));
		listChartNamespaceResponse.setCode(_ctx.stringValue("ListChartNamespaceResponse.Code"));
		listChartNamespaceResponse.setPageNo(_ctx.integerValue("ListChartNamespaceResponse.PageNo"));
		listChartNamespaceResponse.setPageSize(_ctx.integerValue("ListChartNamespaceResponse.PageSize"));
		listChartNamespaceResponse.setTotalCount(_ctx.stringValue("ListChartNamespaceResponse.TotalCount"));

		List<NamespacesItem> namespaces = new ArrayList<NamespacesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListChartNamespaceResponse.Namespaces.Length"); i++) {
			NamespacesItem namespacesItem = new NamespacesItem();
			namespacesItem.setNamespaceName(_ctx.stringValue("ListChartNamespaceResponse.Namespaces["+ i +"].NamespaceName"));
			namespacesItem.setNamespaceStatus(_ctx.stringValue("ListChartNamespaceResponse.Namespaces["+ i +"].NamespaceStatus"));
			namespacesItem.setAutoCreateRepo(_ctx.booleanValue("ListChartNamespaceResponse.Namespaces["+ i +"].AutoCreateRepo"));
			namespacesItem.setDefaultRepoType(_ctx.stringValue("ListChartNamespaceResponse.Namespaces["+ i +"].DefaultRepoType"));
			namespacesItem.setInstanceId(_ctx.stringValue("ListChartNamespaceResponse.Namespaces["+ i +"].InstanceId"));
			namespacesItem.setNamespaceId(_ctx.stringValue("ListChartNamespaceResponse.Namespaces["+ i +"].NamespaceId"));

			namespaces.add(namespacesItem);
		}
		listChartNamespaceResponse.setNamespaces(namespaces);
	 
	 	return listChartNamespaceResponse;
	}
}