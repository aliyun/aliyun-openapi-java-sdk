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

package com.aliyuncs.trademark.transform.v20190902;

import com.aliyuncs.trademark.model.v20190902.DescribeQualificationStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeQualificationStatusResponseUnmarshaller {

	public static DescribeQualificationStatusResponse unmarshall(DescribeQualificationStatusResponse describeQualificationStatusResponse, UnmarshallerContext _ctx) {
		
		describeQualificationStatusResponse.setRequestId(_ctx.stringValue("DescribeQualificationStatusResponse.RequestId"));
		describeQualificationStatusResponse.setStatus(_ctx.stringValue("DescribeQualificationStatusResponse.Status"));
		describeQualificationStatusResponse.setCode(_ctx.stringValue("DescribeQualificationStatusResponse.Code"));
		describeQualificationStatusResponse.setMessage(_ctx.stringValue("DescribeQualificationStatusResponse.Message"));
		describeQualificationStatusResponse.setSuccess(_ctx.booleanValue("DescribeQualificationStatusResponse.Success"));
	 
	 	return describeQualificationStatusResponse;
	}
}