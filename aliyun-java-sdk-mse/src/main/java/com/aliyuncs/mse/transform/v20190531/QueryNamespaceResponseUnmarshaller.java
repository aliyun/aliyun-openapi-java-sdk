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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.QueryNamespaceResponse;
import com.aliyuncs.mse.model.v20190531.QueryNamespaceResponse.NamespaceList;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNamespaceResponseUnmarshaller {

	public static QueryNamespaceResponse unmarshall(QueryNamespaceResponse queryNamespaceResponse, UnmarshallerContext _ctx) {
		
		queryNamespaceResponse.setRequestId(_ctx.stringValue("QueryNamespaceResponse.RequestId"));
		queryNamespaceResponse.setHttpStatusCode(_ctx.integerValue("QueryNamespaceResponse.HttpStatusCode"));
		queryNamespaceResponse.setMessage(_ctx.stringValue("QueryNamespaceResponse.Message"));
		queryNamespaceResponse.setSuccess(_ctx.booleanValue("QueryNamespaceResponse.Success"));

		List<NamespaceList> data = new ArrayList<NamespaceList>();
		for (int i = 0; i < _ctx.lengthValue("QueryNamespaceResponse.Data.Length"); i++) {
			NamespaceList namespaceList = new NamespaceList();
			namespaceList.setRegion(_ctx.stringValue("QueryNamespaceResponse.Data["+ i +"].Region"));
			namespaceList.setNamespace(_ctx.stringValue("QueryNamespaceResponse.Data["+ i +"].Namespace"));

			data.add(namespaceList);
		}
		queryNamespaceResponse.setData(data);
	 
	 	return queryNamespaceResponse;
	}
}