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

import com.aliyuncs.mpserverless.model.v20190615.DescribeISVFileUploadSignedUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeISVFileUploadSignedUrlResponseUnmarshaller {

	public static DescribeISVFileUploadSignedUrlResponse unmarshall(DescribeISVFileUploadSignedUrlResponse describeISVFileUploadSignedUrlResponse, UnmarshallerContext _ctx) {
		
		describeISVFileUploadSignedUrlResponse.setRequestId(_ctx.stringValue("DescribeISVFileUploadSignedUrlResponse.RequestId"));
		describeISVFileUploadSignedUrlResponse.setHttpStatusCode(_ctx.stringValue("DescribeISVFileUploadSignedUrlResponse.HttpStatusCode"));
		describeISVFileUploadSignedUrlResponse.setSuccess(_ctx.booleanValue("DescribeISVFileUploadSignedUrlResponse.Success"));
		describeISVFileUploadSignedUrlResponse.setCode(_ctx.stringValue("DescribeISVFileUploadSignedUrlResponse.Code"));
		describeISVFileUploadSignedUrlResponse.setMessage(_ctx.stringValue("DescribeISVFileUploadSignedUrlResponse.Message"));
		describeISVFileUploadSignedUrlResponse.setId(_ctx.stringValue("DescribeISVFileUploadSignedUrlResponse.Id"));
		describeISVFileUploadSignedUrlResponse.setSignUrl(_ctx.stringValue("DescribeISVFileUploadSignedUrlResponse.SignUrl"));
	 
	 	return describeISVFileUploadSignedUrlResponse;
	}
}