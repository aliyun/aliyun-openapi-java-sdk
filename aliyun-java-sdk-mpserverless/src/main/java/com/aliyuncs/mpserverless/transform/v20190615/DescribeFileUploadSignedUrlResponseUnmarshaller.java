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

import com.aliyuncs.mpserverless.model.v20190615.DescribeFileUploadSignedUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFileUploadSignedUrlResponseUnmarshaller {

	public static DescribeFileUploadSignedUrlResponse unmarshall(DescribeFileUploadSignedUrlResponse describeFileUploadSignedUrlResponse, UnmarshallerContext _ctx) {
		
		describeFileUploadSignedUrlResponse.setRequestId(_ctx.stringValue("DescribeFileUploadSignedUrlResponse.RequestId"));
		describeFileUploadSignedUrlResponse.setHttpStatusCode(_ctx.stringValue("DescribeFileUploadSignedUrlResponse.HttpStatusCode"));
		describeFileUploadSignedUrlResponse.setSuccess(_ctx.booleanValue("DescribeFileUploadSignedUrlResponse.Success"));
		describeFileUploadSignedUrlResponse.setCode(_ctx.stringValue("DescribeFileUploadSignedUrlResponse.Code"));
		describeFileUploadSignedUrlResponse.setMessage(_ctx.stringValue("DescribeFileUploadSignedUrlResponse.Message"));
		describeFileUploadSignedUrlResponse.setId(_ctx.stringValue("DescribeFileUploadSignedUrlResponse.Id"));
		describeFileUploadSignedUrlResponse.setSignUrl(_ctx.stringValue("DescribeFileUploadSignedUrlResponse.SignUrl"));
	 
	 	return describeFileUploadSignedUrlResponse;
	}
}