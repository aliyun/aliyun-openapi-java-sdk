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

package com.aliyuncs.cassandra.transform.v20190101;

import com.aliyuncs.cassandra.model.v20190101.DescribeClusterStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterStatusResponseUnmarshaller {

	public static DescribeClusterStatusResponse unmarshall(DescribeClusterStatusResponse describeClusterStatusResponse, UnmarshallerContext _ctx) {
		
		describeClusterStatusResponse.setRequestId(_ctx.stringValue("DescribeClusterStatusResponse.RequestId"));
		describeClusterStatusResponse.setStatus(_ctx.stringValue("DescribeClusterStatusResponse.Status"));
		describeClusterStatusResponse.setCreatedTime(_ctx.stringValue("DescribeClusterStatusResponse.CreatedTime"));
	 
	 	return describeClusterStatusResponse;
	}
}