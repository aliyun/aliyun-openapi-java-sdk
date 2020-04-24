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

import com.aliyuncs.pts.model.v20190810.DescribeArmsStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeArmsStatusResponseUnmarshaller {

	public static DescribeArmsStatusResponse unmarshall(DescribeArmsStatusResponse describeArmsStatusResponse, UnmarshallerContext _ctx) {
		
		describeArmsStatusResponse.setRequestId(_ctx.stringValue("DescribeArmsStatusResponse.RequestId"));
		describeArmsStatusResponse.setCode(_ctx.stringValue("DescribeArmsStatusResponse.Code"));
		describeArmsStatusResponse.setMessage(_ctx.stringValue("DescribeArmsStatusResponse.Message"));
		describeArmsStatusResponse.setSuccess(_ctx.booleanValue("DescribeArmsStatusResponse.Success"));
		describeArmsStatusResponse.setHttpStatusCode(_ctx.integerValue("DescribeArmsStatusResponse.HttpStatusCode"));
		describeArmsStatusResponse.setEnabled(_ctx.booleanValue("DescribeArmsStatusResponse.Enabled"));
		describeArmsStatusResponse.setIsSubAccount(_ctx.booleanValue("DescribeArmsStatusResponse.IsSubAccount"));
	 
	 	return describeArmsStatusResponse;
	}
}