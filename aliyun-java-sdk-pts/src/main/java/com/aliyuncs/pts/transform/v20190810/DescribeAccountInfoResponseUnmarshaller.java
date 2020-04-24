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

import com.aliyuncs.pts.model.v20190810.DescribeAccountInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountInfoResponseUnmarshaller {

	public static DescribeAccountInfoResponse unmarshall(DescribeAccountInfoResponse describeAccountInfoResponse, UnmarshallerContext _ctx) {
		
		describeAccountInfoResponse.setRequestId(_ctx.stringValue("DescribeAccountInfoResponse.RequestId"));
		describeAccountInfoResponse.setMessage(_ctx.stringValue("DescribeAccountInfoResponse.Message"));
		describeAccountInfoResponse.setCode(_ctx.stringValue("DescribeAccountInfoResponse.Code"));
		describeAccountInfoResponse.setSuccess(_ctx.booleanValue("DescribeAccountInfoResponse.Success"));
		describeAccountInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeAccountInfoResponse.HttpStatusCode"));
		describeAccountInfoResponse.setAccountInfo(_ctx.stringValue("DescribeAccountInfoResponse.AccountInfo"));
	 
	 	return describeAccountInfoResponse;
	}
}