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

import com.aliyuncs.mse.model.v20190531.ListEngineNamespacesResponse;
import com.aliyuncs.mse.model.v20190531.ListEngineNamespacesResponse.Namespace;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEngineNamespacesResponseUnmarshaller {

	public static ListEngineNamespacesResponse unmarshall(ListEngineNamespacesResponse listEngineNamespacesResponse, UnmarshallerContext _ctx) {
		
		listEngineNamespacesResponse.setRequestId(_ctx.stringValue("ListEngineNamespacesResponse.RequestId"));
		listEngineNamespacesResponse.setSuccess(_ctx.booleanValue("ListEngineNamespacesResponse.Success"));
		listEngineNamespacesResponse.setMessage(_ctx.stringValue("ListEngineNamespacesResponse.Message"));
		listEngineNamespacesResponse.setErrorCode(_ctx.stringValue("ListEngineNamespacesResponse.ErrorCode"));
		listEngineNamespacesResponse.setPageNumber(_ctx.integerValue("ListEngineNamespacesResponse.PageNumber"));
		listEngineNamespacesResponse.setPageSize(_ctx.integerValue("ListEngineNamespacesResponse.PageSize"));
		listEngineNamespacesResponse.setTotalCount(_ctx.integerValue("ListEngineNamespacesResponse.TotalCount"));
		listEngineNamespacesResponse.setHttpCode(_ctx.stringValue("ListEngineNamespacesResponse.HttpCode"));

		List<Namespace> data = new ArrayList<Namespace>();
		for (int i = 0; i < _ctx.lengthValue("ListEngineNamespacesResponse.Data.Length"); i++) {
			Namespace namespace = new Namespace();
			namespace.setNamespace(_ctx.stringValue("ListEngineNamespacesResponse.Data["+ i +"].Namespace"));
			namespace.setNamespaceShowName(_ctx.stringValue("ListEngineNamespacesResponse.Data["+ i +"].NamespaceShowName"));
			namespace.setNamespaceDesc(_ctx.stringValue("ListEngineNamespacesResponse.Data["+ i +"].NamespaceDesc"));
			namespace.setQuota(_ctx.integerValue("ListEngineNamespacesResponse.Data["+ i +"].Quota"));
			namespace.setConfigCount(_ctx.integerValue("ListEngineNamespacesResponse.Data["+ i +"].ConfigCount"));
			namespace.setType(_ctx.integerValue("ListEngineNamespacesResponse.Data["+ i +"].Type"));
			namespace.setServiceCount(_ctx.stringValue("ListEngineNamespacesResponse.Data["+ i +"].ServiceCount"));

			data.add(namespace);
		}
		listEngineNamespacesResponse.setData(data);
	 
	 	return listEngineNamespacesResponse;
	}
}