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

import com.aliyuncs.pts.model.v20190810.DescribeAgentGCInfoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAgentGCInfoResponseUnmarshaller {

	public static DescribeAgentGCInfoResponse unmarshall(DescribeAgentGCInfoResponse describeAgentGCInfoResponse, UnmarshallerContext _ctx) {
		
		describeAgentGCInfoResponse.setRequestId(_ctx.stringValue("DescribeAgentGCInfoResponse.RequestId"));
		describeAgentGCInfoResponse.setCode(_ctx.stringValue("DescribeAgentGCInfoResponse.Code"));
		describeAgentGCInfoResponse.setMessage(_ctx.stringValue("DescribeAgentGCInfoResponse.Message"));
		describeAgentGCInfoResponse.setSuccess(_ctx.booleanValue("DescribeAgentGCInfoResponse.Success"));
		describeAgentGCInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeAgentGCInfoResponse.HttpStatusCode"));

		List<Map<Object, Object>> gcInfo = _ctx.listMapValue("DescribeAgentGCInfoResponse.GcInfo");
		describeAgentGCInfoResponse.setGcInfo(gcInfo);
	 
	 	return describeAgentGCInfoResponse;
	}
}