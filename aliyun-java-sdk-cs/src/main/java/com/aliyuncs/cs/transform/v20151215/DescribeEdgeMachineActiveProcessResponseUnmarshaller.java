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

package com.aliyuncs.cs.transform.v20151215;

import com.aliyuncs.cs.model.v20151215.DescribeEdgeMachineActiveProcessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEdgeMachineActiveProcessResponseUnmarshaller {

	public static DescribeEdgeMachineActiveProcessResponse unmarshall(DescribeEdgeMachineActiveProcessResponse describeEdgeMachineActiveProcessResponse, UnmarshallerContext _ctx) {
		
		describeEdgeMachineActiveProcessResponse.setRequest_id(_ctx.stringValue("DescribeEdgeMachineActiveProcessResponse.request_id"));
		describeEdgeMachineActiveProcessResponse.setState(_ctx.stringValue("DescribeEdgeMachineActiveProcessResponse.state"));
		describeEdgeMachineActiveProcessResponse.setStep(_ctx.stringValue("DescribeEdgeMachineActiveProcessResponse.step"));
		describeEdgeMachineActiveProcessResponse.setProgress(_ctx.longValue("DescribeEdgeMachineActiveProcessResponse.progress"));
		describeEdgeMachineActiveProcessResponse.setLogs(_ctx.stringValue("DescribeEdgeMachineActiveProcessResponse.logs"));
	 
	 	return describeEdgeMachineActiveProcessResponse;
	}
}