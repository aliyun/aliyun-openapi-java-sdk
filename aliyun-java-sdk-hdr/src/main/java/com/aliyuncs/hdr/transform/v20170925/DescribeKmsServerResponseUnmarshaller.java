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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.DescribeKmsServerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKmsServerResponseUnmarshaller {

	public static DescribeKmsServerResponse unmarshall(DescribeKmsServerResponse describeKmsServerResponse, UnmarshallerContext _ctx) {
		
		describeKmsServerResponse.setRequestId(_ctx.stringValue("DescribeKmsServerResponse.RequestId"));
		describeKmsServerResponse.setSuccess(_ctx.booleanValue("DescribeKmsServerResponse.Success"));
		describeKmsServerResponse.setCode(_ctx.stringValue("DescribeKmsServerResponse.Code"));
		describeKmsServerResponse.setMessage(_ctx.stringValue("DescribeKmsServerResponse.Message"));
		describeKmsServerResponse.setIpAddress(_ctx.stringValue("DescribeKmsServerResponse.IpAddress"));
		describeKmsServerResponse.setPort(_ctx.integerValue("DescribeKmsServerResponse.Port"));
	 
	 	return describeKmsServerResponse;
	}
}