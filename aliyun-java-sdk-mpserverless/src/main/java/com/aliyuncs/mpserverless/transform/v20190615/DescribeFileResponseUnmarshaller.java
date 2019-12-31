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

package com.aliyuncs.mpserverless.transform.v20190615;

import com.aliyuncs.mpserverless.model.v20190615.DescribeFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFileResponseUnmarshaller {

	public static DescribeFileResponse unmarshall(DescribeFileResponse describeFileResponse, UnmarshallerContext _ctx) {
		
		describeFileResponse.setRequestId(_ctx.stringValue("DescribeFileResponse.RequestId"));
		describeFileResponse.setHttpStatusCode(_ctx.stringValue("DescribeFileResponse.HttpStatusCode"));
		describeFileResponse.setSuccess(_ctx.booleanValue("DescribeFileResponse.Success"));
		describeFileResponse.setCode(_ctx.stringValue("DescribeFileResponse.Code"));
		describeFileResponse.setMessage(_ctx.stringValue("DescribeFileResponse.Message"));
		describeFileResponse.setId(_ctx.stringValue("DescribeFileResponse.Id"));
		describeFileResponse.setName(_ctx.stringValue("DescribeFileResponse.Name"));
		describeFileResponse.setSize(_ctx.floatValue("DescribeFileResponse.Size"));
		describeFileResponse.setType(_ctx.stringValue("DescribeFileResponse.Type"));
		describeFileResponse.setUrl(_ctx.stringValue("DescribeFileResponse.Url"));
		describeFileResponse.setGmtCreate(_ctx.stringValue("DescribeFileResponse.GmtCreate"));
		describeFileResponse.setGmtModified(_ctx.stringValue("DescribeFileResponse.GmtModified"));
	 
	 	return describeFileResponse;
	}
}