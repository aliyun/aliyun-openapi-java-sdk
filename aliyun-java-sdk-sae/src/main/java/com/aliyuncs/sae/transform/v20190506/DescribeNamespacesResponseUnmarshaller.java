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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeNamespacesResponse;
import com.aliyuncs.sae.model.v20190506.DescribeNamespacesResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeNamespacesResponse.Data.Namespace;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNamespacesResponseUnmarshaller {

	public static DescribeNamespacesResponse unmarshall(DescribeNamespacesResponse describeNamespacesResponse, UnmarshallerContext _ctx) {
		
		describeNamespacesResponse.setRequestId(_ctx.stringValue("DescribeNamespacesResponse.RequestId"));
		describeNamespacesResponse.setCode(_ctx.stringValue("DescribeNamespacesResponse.Code"));
		describeNamespacesResponse.setErrorCode(_ctx.stringValue("DescribeNamespacesResponse.ErrorCode"));
		describeNamespacesResponse.setMessage(_ctx.stringValue("DescribeNamespacesResponse.Message"));
		describeNamespacesResponse.setSuccess(_ctx.booleanValue("DescribeNamespacesResponse.Success"));
		describeNamespacesResponse.setTraceId(_ctx.stringValue("DescribeNamespacesResponse.TraceId"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("DescribeNamespacesResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("DescribeNamespacesResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("DescribeNamespacesResponse.Data.TotalSize"));

		List<Namespace> namespaces = new ArrayList<Namespace>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNamespacesResponse.Data.Namespaces.Length"); i++) {
			Namespace namespace = new Namespace();
			namespace.setAccessKey(_ctx.stringValue("DescribeNamespacesResponse.Data.Namespaces["+ i +"].AccessKey"));
			namespace.setAddressServerHost(_ctx.stringValue("DescribeNamespacesResponse.Data.Namespaces["+ i +"].AddressServerHost"));
			namespace.setSecretKey(_ctx.stringValue("DescribeNamespacesResponse.Data.Namespaces["+ i +"].SecretKey"));
			namespace.setTenantId(_ctx.stringValue("DescribeNamespacesResponse.Data.Namespaces["+ i +"].TenantId"));
			namespace.setRegionId(_ctx.stringValue("DescribeNamespacesResponse.Data.Namespaces["+ i +"].RegionId"));
			namespace.setNamespaceId(_ctx.stringValue("DescribeNamespacesResponse.Data.Namespaces["+ i +"].NamespaceId"));
			namespace.setNamespaceName(_ctx.stringValue("DescribeNamespacesResponse.Data.Namespaces["+ i +"].NamespaceName"));
			namespace.setNamespaceDescription(_ctx.stringValue("DescribeNamespacesResponse.Data.Namespaces["+ i +"].NamespaceDescription"));

			namespaces.add(namespace);
		}
		data.setNamespaces(namespaces);
		describeNamespacesResponse.setData(data);
	 
	 	return describeNamespacesResponse;
	}
}