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

package com.aliyuncs.acms_open.transform.v20200206;

import com.aliyuncs.acms_open.model.v20200206.DescribeNamespaceResponse;
import com.aliyuncs.acms_open.model.v20200206.DescribeNamespaceResponse.Namespace;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNamespaceResponseUnmarshaller {

	public static DescribeNamespaceResponse unmarshall(DescribeNamespaceResponse describeNamespaceResponse, UnmarshallerContext _ctx) {
		
		describeNamespaceResponse.setRequestId(_ctx.stringValue("DescribeNamespaceResponse.RequestId"));
		describeNamespaceResponse.setCode(_ctx.stringValue("DescribeNamespaceResponse.Code"));
		describeNamespaceResponse.setMessage(_ctx.stringValue("DescribeNamespaceResponse.Message"));

		Namespace namespace = new Namespace();
		namespace.setRegionId(_ctx.stringValue("DescribeNamespaceResponse.Namespace.RegionId"));
		namespace.setEndpoint(_ctx.stringValue("DescribeNamespaceResponse.Namespace.Endpoint"));
		namespace.setAccessKey(_ctx.stringValue("DescribeNamespaceResponse.Namespace.AccessKey"));
		namespace.setSecretKey(_ctx.stringValue("DescribeNamespaceResponse.Namespace.SecretKey"));
		namespace.setName(_ctx.stringValue("DescribeNamespaceResponse.Namespace.Name"));
		describeNamespaceResponse.setNamespace(namespace);
	 
	 	return describeNamespaceResponse;
	}
}