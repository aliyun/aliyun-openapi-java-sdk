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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListNamespacesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNamespacesResponseUnmarshaller {

	public static ListNamespacesResponse unmarshall(ListNamespacesResponse listNamespacesResponse, UnmarshallerContext _ctx) {
		
		listNamespacesResponse.setRequestId(_ctx.stringValue("ListNamespacesResponse.RequestId"));
		listNamespacesResponse.setCount(_ctx.integerValue("ListNamespacesResponse.Count"));
		listNamespacesResponse.setRegionId(_ctx.stringValue("ListNamespacesResponse.RegionId"));
		listNamespacesResponse.setDBInstanceId(_ctx.stringValue("ListNamespacesResponse.DBInstanceId"));
		listNamespacesResponse.setMessage(_ctx.stringValue("ListNamespacesResponse.Message"));
		listNamespacesResponse.setStatus(_ctx.stringValue("ListNamespacesResponse.Status"));

		List<String> namespaces = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListNamespacesResponse.Namespaces.Length"); i++) {
			namespaces.add(_ctx.stringValue("ListNamespacesResponse.Namespaces["+ i +"]"));
		}
		listNamespacesResponse.setNamespaces(namespaces);
	 
	 	return listNamespacesResponse;
	}
}