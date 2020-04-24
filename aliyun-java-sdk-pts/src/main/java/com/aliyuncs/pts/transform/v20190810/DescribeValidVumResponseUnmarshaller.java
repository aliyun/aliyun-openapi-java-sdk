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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.DescribeValidVumResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeValidVumResponseUnmarshaller {

	public static DescribeValidVumResponse unmarshall(DescribeValidVumResponse describeValidVumResponse, UnmarshallerContext _ctx) {
		
		describeValidVumResponse.setRequestId(_ctx.stringValue("DescribeValidVumResponse.RequestId"));
		describeValidVumResponse.setMessage(_ctx.stringValue("DescribeValidVumResponse.Message"));
		describeValidVumResponse.setCode(_ctx.stringValue("DescribeValidVumResponse.Code"));
		describeValidVumResponse.setSuccess(_ctx.booleanValue("DescribeValidVumResponse.Success"));
		describeValidVumResponse.setHttpStatusCode(_ctx.integerValue("DescribeValidVumResponse.HttpStatusCode"));
		describeValidVumResponse.setVum(_ctx.longValue("DescribeValidVumResponse.Vum"));
	 
	 	return describeValidVumResponse;
	}
}