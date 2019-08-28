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

import com.aliyuncs.sae.model.v20190506.DescribeNamespaceResponse;
import com.aliyuncs.sae.model.v20190506.DescribeNamespaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNamespaceResponseUnmarshaller {

	public static DescribeNamespaceResponse unmarshall(DescribeNamespaceResponse describeNamespaceResponse, UnmarshallerContext _ctx) {
		
		describeNamespaceResponse.setRequestId(_ctx.stringValue("DescribeNamespaceResponse.RequestId"));
		describeNamespaceResponse.setCode(_ctx.stringValue("DescribeNamespaceResponse.Code"));
		describeNamespaceResponse.setErrorCode(_ctx.stringValue("DescribeNamespaceResponse.ErrorCode"));
		describeNamespaceResponse.setMessage(_ctx.stringValue("DescribeNamespaceResponse.Message"));
		describeNamespaceResponse.setSuccess(_ctx.booleanValue("DescribeNamespaceResponse.Success"));
		describeNamespaceResponse.setTraceId(_ctx.stringValue("DescribeNamespaceResponse.TraceId"));

		Data data = new Data();
		data.setRegionId(_ctx.stringValue("DescribeNamespaceResponse.Data.RegionId"));
		data.setNamespaceId(_ctx.stringValue("DescribeNamespaceResponse.Data.NamespaceId"));
		data.setNamespaceName(_ctx.stringValue("DescribeNamespaceResponse.Data.NamespaceName"));
		data.setNamespaceDescription(_ctx.stringValue("DescribeNamespaceResponse.Data.NamespaceDescription"));
		describeNamespaceResponse.setData(data);
	 
	 	return describeNamespaceResponse;
	}
}