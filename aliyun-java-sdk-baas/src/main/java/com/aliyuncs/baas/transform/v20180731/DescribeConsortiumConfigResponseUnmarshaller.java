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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DescribeConsortiumConfigResponse;
import com.aliyuncs.baas.model.v20180731.DescribeConsortiumConfigResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsortiumConfigResponseUnmarshaller {

	public static DescribeConsortiumConfigResponse unmarshall(DescribeConsortiumConfigResponse describeConsortiumConfigResponse, UnmarshallerContext context) {
		
		describeConsortiumConfigResponse.setRequestId(context.stringValue("DescribeConsortiumConfigResponse.RequestId"));
		describeConsortiumConfigResponse.setSuccess(context.booleanValue("DescribeConsortiumConfigResponse.Success"));
		describeConsortiumConfigResponse.setErrorCode(context.integerValue("DescribeConsortiumConfigResponse.ErrorCode"));

		Result result = new Result();

		List<String> channelPolicy = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeConsortiumConfigResponse.Result.ChannelPolicy.Length"); i++) {
			channelPolicy.add(context.stringValue("DescribeConsortiumConfigResponse.Result.ChannelPolicy["+ i +"]"));
		}
		result.setChannelPolicy(channelPolicy);

		List<String> ordererType = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeConsortiumConfigResponse.Result.OrdererType.Length"); i++) {
			ordererType.add(context.stringValue("DescribeConsortiumConfigResponse.Result.OrdererType["+ i +"]"));
		}
		result.setOrdererType(ordererType);
		describeConsortiumConfigResponse.setResult(result);
	 
	 	return describeConsortiumConfigResponse;
	}
}