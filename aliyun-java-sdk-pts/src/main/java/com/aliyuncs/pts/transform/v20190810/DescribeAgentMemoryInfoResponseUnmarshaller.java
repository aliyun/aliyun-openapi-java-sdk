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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeAgentMemoryInfoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAgentMemoryInfoResponseUnmarshaller {

	public static DescribeAgentMemoryInfoResponse unmarshall(DescribeAgentMemoryInfoResponse describeAgentMemoryInfoResponse, UnmarshallerContext _ctx) {
		
		describeAgentMemoryInfoResponse.setRequestId(_ctx.stringValue("DescribeAgentMemoryInfoResponse.RequestId"));
		describeAgentMemoryInfoResponse.setCode(_ctx.stringValue("DescribeAgentMemoryInfoResponse.Code"));
		describeAgentMemoryInfoResponse.setMessage(_ctx.stringValue("DescribeAgentMemoryInfoResponse.Message"));
		describeAgentMemoryInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeAgentMemoryInfoResponse.HttpStatusCode"));
		describeAgentMemoryInfoResponse.setSuccess(_ctx.booleanValue("DescribeAgentMemoryInfoResponse.Success"));

		List<Map<Object, Object>> memoryInfo = _ctx.listMapValue("DescribeAgentMemoryInfoResponse.MemoryInfo");
		describeAgentMemoryInfoResponse.setMemoryInfo(memoryInfo);
	 
	 	return describeAgentMemoryInfoResponse;
	}
}