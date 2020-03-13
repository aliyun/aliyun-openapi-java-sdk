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

import com.aliyuncs.sofa.model.v20190815.ListAKSAcrNamespaceResponse;
import com.aliyuncs.sofa.model.v20190815.ListAKSAcrNamespaceResponse.NamespacesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAKSAcrNamespaceResponseUnmarshaller {

	public static ListAKSAcrNamespaceResponse unmarshall(ListAKSAcrNamespaceResponse listAKSAcrNamespaceResponse, UnmarshallerContext _ctx) {
		
		listAKSAcrNamespaceResponse.setRequestId(_ctx.stringValue("ListAKSAcrNamespaceResponse.RequestId"));
		listAKSAcrNamespaceResponse.setResultCode(_ctx.stringValue("ListAKSAcrNamespaceResponse.ResultCode"));
		listAKSAcrNamespaceResponse.setResultMessage(_ctx.stringValue("ListAKSAcrNamespaceResponse.ResultMessage"));

		List<NamespacesItem> namespaces = new ArrayList<NamespacesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAKSAcrNamespaceResponse.Namespaces.Length"); i++) {
			NamespacesItem namespacesItem = new NamespacesItem();
			namespacesItem.setAuthorizeType(_ctx.stringValue("ListAKSAcrNamespaceResponse.Namespaces["+ i +"].AuthorizeType"));
			namespacesItem.setAutoCreate(_ctx.stringValue("ListAKSAcrNamespaceResponse.Namespaces["+ i +"].AutoCreate"));
			namespacesItem.setDefaultVisibility(_ctx.stringValue("ListAKSAcrNamespaceResponse.Namespaces["+ i +"].DefaultVisibility"));
			namespacesItem.setNamespace(_ctx.stringValue("ListAKSAcrNamespaceResponse.Namespaces["+ i +"].Namespace"));
			namespacesItem.setNamespaceId(_ctx.stringValue("ListAKSAcrNamespaceResponse.Namespaces["+ i +"].NamespaceId"));
			namespacesItem.setNamespaceStatus(_ctx.stringValue("ListAKSAcrNamespaceResponse.Namespaces["+ i +"].NamespaceStatus"));

			namespaces.add(namespacesItem);
		}
		listAKSAcrNamespaceResponse.setNamespaces(namespaces);
	 
	 	return listAKSAcrNamespaceResponse;
	}
}