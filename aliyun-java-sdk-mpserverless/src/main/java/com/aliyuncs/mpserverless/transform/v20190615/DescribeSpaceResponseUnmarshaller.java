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

import com.aliyuncs.mpserverless.model.v20190615.DescribeSpaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSpaceResponseUnmarshaller {

	public static DescribeSpaceResponse unmarshall(DescribeSpaceResponse describeSpaceResponse, UnmarshallerContext _ctx) {
		
		describeSpaceResponse.setRequestId(_ctx.stringValue("DescribeSpaceResponse.RequestId"));
		describeSpaceResponse.setHttpStatusCode(_ctx.stringValue("DescribeSpaceResponse.HttpStatusCode"));
		describeSpaceResponse.setSuccess(_ctx.booleanValue("DescribeSpaceResponse.Success"));
		describeSpaceResponse.setCode(_ctx.stringValue("DescribeSpaceResponse.Code"));
		describeSpaceResponse.setMessage(_ctx.stringValue("DescribeSpaceResponse.Message"));
		describeSpaceResponse.setSpaceId(_ctx.stringValue("DescribeSpaceResponse.SpaceId"));
		describeSpaceResponse.setName(_ctx.stringValue("DescribeSpaceResponse.Name"));
		describeSpaceResponse.setDesc(_ctx.stringValue("DescribeSpaceResponse.Desc"));
		describeSpaceResponse.setStatus(_ctx.stringValue("DescribeSpaceResponse.Status"));
		describeSpaceResponse.setGmtCreate(_ctx.stringValue("DescribeSpaceResponse.GmtCreate"));
	 
	 	return describeSpaceResponse;
	}
}