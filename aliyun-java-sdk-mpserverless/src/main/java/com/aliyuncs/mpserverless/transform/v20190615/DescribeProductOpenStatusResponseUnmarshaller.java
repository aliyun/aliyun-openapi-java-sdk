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

package com.aliyuncs.mpserverless.transform.v20190615;

import com.aliyuncs.mpserverless.model.v20190615.DescribeProductOpenStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProductOpenStatusResponseUnmarshaller {

	public static DescribeProductOpenStatusResponse unmarshall(DescribeProductOpenStatusResponse describeProductOpenStatusResponse, UnmarshallerContext _ctx) {
		
		describeProductOpenStatusResponse.setRequestId(_ctx.stringValue("DescribeProductOpenStatusResponse.RequestId"));
		describeProductOpenStatusResponse.setHttpStatusCode(_ctx.stringValue("DescribeProductOpenStatusResponse.HttpStatusCode"));
		describeProductOpenStatusResponse.setSuccess(_ctx.booleanValue("DescribeProductOpenStatusResponse.Success"));
		describeProductOpenStatusResponse.setCode(_ctx.stringValue("DescribeProductOpenStatusResponse.Code"));
		describeProductOpenStatusResponse.setMessage(_ctx.stringValue("DescribeProductOpenStatusResponse.Message"));
		describeProductOpenStatusResponse.setSpaceId(_ctx.stringValue("DescribeProductOpenStatusResponse.SpaceId"));
	 
	 	return describeProductOpenStatusResponse;
	}
}