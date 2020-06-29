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

package com.aliyuncs.vs.transform.v20181212;

import com.aliyuncs.vs.model.v20181212.DescribeParentPlatformResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParentPlatformResponseUnmarshaller {

	public static DescribeParentPlatformResponse unmarshall(DescribeParentPlatformResponse describeParentPlatformResponse, UnmarshallerContext _ctx) {
		
		describeParentPlatformResponse.setRequestId(_ctx.stringValue("DescribeParentPlatformResponse.RequestId"));
		describeParentPlatformResponse.setId(_ctx.stringValue("DescribeParentPlatformResponse.Id"));
		describeParentPlatformResponse.setName(_ctx.stringValue("DescribeParentPlatformResponse.Name"));
		describeParentPlatformResponse.setDescription(_ctx.stringValue("DescribeParentPlatformResponse.Description"));
		describeParentPlatformResponse.setBizProtocol(_ctx.stringValue("DescribeParentPlatformResponse.Protocol"));
		describeParentPlatformResponse.setStatus(_ctx.stringValue("DescribeParentPlatformResponse.Status"));
		describeParentPlatformResponse.setGbId(_ctx.stringValue("DescribeParentPlatformResponse.GbId"));
		describeParentPlatformResponse.setIp(_ctx.stringValue("DescribeParentPlatformResponse.Ip"));
		describeParentPlatformResponse.setPort(_ctx.longValue("DescribeParentPlatformResponse.Port"));
		describeParentPlatformResponse.setClientGbId(_ctx.stringValue("DescribeParentPlatformResponse.ClientGbId"));
		describeParentPlatformResponse.setClientAuth(_ctx.booleanValue("DescribeParentPlatformResponse.ClientAuth"));
		describeParentPlatformResponse.setClientUsername(_ctx.stringValue("DescribeParentPlatformResponse.ClientUsername"));
		describeParentPlatformResponse.setClientPassword(_ctx.stringValue("DescribeParentPlatformResponse.ClientPassword"));
		describeParentPlatformResponse.setClientIp(_ctx.stringValue("DescribeParentPlatformResponse.ClientIp"));
		describeParentPlatformResponse.setClientPort(_ctx.longValue("DescribeParentPlatformResponse.ClientPort"));
		describeParentPlatformResponse.setAutoStart(_ctx.booleanValue("DescribeParentPlatformResponse.AutoStart"));
		describeParentPlatformResponse.setCreatedTime(_ctx.stringValue("DescribeParentPlatformResponse.CreatedTime"));
	 
	 	return describeParentPlatformResponse;
	}
}