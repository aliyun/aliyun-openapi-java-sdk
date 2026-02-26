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

import com.aliyuncs.gpdb.model.v20160503.DescribeNamespaceResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNamespaceResponseUnmarshaller {

	public static DescribeNamespaceResponse unmarshall(DescribeNamespaceResponse describeNamespaceResponse, UnmarshallerContext _ctx) {
		
		describeNamespaceResponse.setRequestId(_ctx.stringValue("DescribeNamespaceResponse.RequestId"));
		describeNamespaceResponse.setNamespaceInfo(_ctx.mapValue("DescribeNamespaceResponse.NamespaceInfo"));
		describeNamespaceResponse.setNamespace(_ctx.stringValue("DescribeNamespaceResponse.Namespace"));
		describeNamespaceResponse.setDBInstanceId(_ctx.stringValue("DescribeNamespaceResponse.DBInstanceId"));
		describeNamespaceResponse.setRegionId(_ctx.stringValue("DescribeNamespaceResponse.RegionId"));
		describeNamespaceResponse.setStatus(_ctx.stringValue("DescribeNamespaceResponse.Status"));
		describeNamespaceResponse.setMessage(_ctx.stringValue("DescribeNamespaceResponse.Message"));
	 
	 	return describeNamespaceResponse;
	}
}