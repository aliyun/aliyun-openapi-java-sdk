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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.DescribeInstanceDasProResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceDasProResponseUnmarshaller {

	public static DescribeInstanceDasProResponse unmarshall(DescribeInstanceDasProResponse describeInstanceDasProResponse, UnmarshallerContext _ctx) {
		
		describeInstanceDasProResponse.setRequestId(_ctx.stringValue("DescribeInstanceDasProResponse.RequestId"));
		describeInstanceDasProResponse.setMessage(_ctx.stringValue("DescribeInstanceDasProResponse.Message"));
		describeInstanceDasProResponse.setData(_ctx.booleanValue("DescribeInstanceDasProResponse.Data"));
		describeInstanceDasProResponse.setCode(_ctx.stringValue("DescribeInstanceDasProResponse.Code"));
		describeInstanceDasProResponse.setSuccess(_ctx.stringValue("DescribeInstanceDasProResponse.Success"));
	 
	 	return describeInstanceDasProResponse;
	}
}