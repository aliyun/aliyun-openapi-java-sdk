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

package com.aliyuncs.acm.transform.v20200206;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.acm.model.v20200206.DescribeNamespacesResponse;
import com.aliyuncs.acm.model.v20200206.DescribeNamespacesResponse.Namespace;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNamespacesResponseUnmarshaller {

	public static DescribeNamespacesResponse unmarshall(DescribeNamespacesResponse describeNamespacesResponse, UnmarshallerContext _ctx) {
		
		describeNamespacesResponse.setRequestId(_ctx.stringValue("DescribeNamespacesResponse.RequestId"));
		describeNamespacesResponse.setCode(_ctx.stringValue("DescribeNamespacesResponse.Code"));
		describeNamespacesResponse.setMessage(_ctx.stringValue("DescribeNamespacesResponse.Message"));

		List<Namespace> namespaces = new ArrayList<Namespace>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNamespacesResponse.Namespaces.Length"); i++) {
			Namespace namespace = new Namespace();
			namespace.setConfigCount(_ctx.integerValue("DescribeNamespacesResponse.Namespaces["+ i +"].ConfigCount"));
			namespace.setNamespaceId(_ctx.stringValue("DescribeNamespacesResponse.Namespaces["+ i +"].NamespaceId"));
			namespace.setNamespaceName(_ctx.stringValue("DescribeNamespacesResponse.Namespaces["+ i +"].NamespaceName"));
			namespace.setQuota(_ctx.integerValue("DescribeNamespacesResponse.Namespaces["+ i +"].Quota"));
			namespace.setType(_ctx.integerValue("DescribeNamespacesResponse.Namespaces["+ i +"].Type"));

			namespaces.add(namespace);
		}
		describeNamespacesResponse.setNamespaces(namespaces);
	 
	 	return describeNamespacesResponse;
	}
}