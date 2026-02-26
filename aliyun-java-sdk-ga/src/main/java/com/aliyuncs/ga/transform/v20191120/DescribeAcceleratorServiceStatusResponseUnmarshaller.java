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

package com.aliyuncs.ga.transform.v20191120;

import com.aliyuncs.ga.model.v20191120.DescribeAcceleratorServiceStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAcceleratorServiceStatusResponseUnmarshaller {

	public static DescribeAcceleratorServiceStatusResponse unmarshall(DescribeAcceleratorServiceStatusResponse describeAcceleratorServiceStatusResponse, UnmarshallerContext _ctx) {
		
		describeAcceleratorServiceStatusResponse.setRequestId(_ctx.stringValue("DescribeAcceleratorServiceStatusResponse.RequestId"));
		describeAcceleratorServiceStatusResponse.setStatus(_ctx.stringValue("DescribeAcceleratorServiceStatusResponse.Status"));
		describeAcceleratorServiceStatusResponse.setCode(_ctx.stringValue("DescribeAcceleratorServiceStatusResponse.Code"));
		describeAcceleratorServiceStatusResponse.setSuccess(_ctx.stringValue("DescribeAcceleratorServiceStatusResponse.Success"));
		describeAcceleratorServiceStatusResponse.setMessage(_ctx.stringValue("DescribeAcceleratorServiceStatusResponse.Message"));
	 
	 	return describeAcceleratorServiceStatusResponse;
	}
}