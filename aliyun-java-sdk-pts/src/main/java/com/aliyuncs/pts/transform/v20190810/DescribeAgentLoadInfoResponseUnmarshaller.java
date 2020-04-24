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

import com.aliyuncs.pts.model.v20190810.DescribeAgentLoadInfoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAgentLoadInfoResponseUnmarshaller {

	public static DescribeAgentLoadInfoResponse unmarshall(DescribeAgentLoadInfoResponse describeAgentLoadInfoResponse, UnmarshallerContext _ctx) {
		
		describeAgentLoadInfoResponse.setRequestId(_ctx.stringValue("DescribeAgentLoadInfoResponse.RequestId"));
		describeAgentLoadInfoResponse.setCode(_ctx.stringValue("DescribeAgentLoadInfoResponse.Code"));
		describeAgentLoadInfoResponse.setMessage(_ctx.stringValue("DescribeAgentLoadInfoResponse.Message"));
		describeAgentLoadInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeAgentLoadInfoResponse.HttpStatusCode"));
		describeAgentLoadInfoResponse.setSuccess(_ctx.booleanValue("DescribeAgentLoadInfoResponse.Success"));

		List<Map<Object, Object>> loadInfo = _ctx.listMapValue("DescribeAgentLoadInfoResponse.LoadInfo");
		describeAgentLoadInfoResponse.setLoadInfo(loadInfo);
	 
	 	return describeAgentLoadInfoResponse;
	}
}