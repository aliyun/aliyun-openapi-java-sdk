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

package com.aliyuncs.cloudauth_console.transform.v20190219;

import com.aliyuncs.cloudauth_console.model.v20190219.DescribeUploadPreSignResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUploadPreSignResponseUnmarshaller {

	public static DescribeUploadPreSignResponse unmarshall(DescribeUploadPreSignResponse describeUploadPreSignResponse, UnmarshallerContext _ctx) {
		
		describeUploadPreSignResponse.setRequestId(_ctx.stringValue("DescribeUploadPreSignResponse.RequestId"));
		describeUploadPreSignResponse.setAccessId(_ctx.stringValue("DescribeUploadPreSignResponse.AccessId"));
		describeUploadPreSignResponse.setSignature(_ctx.stringValue("DescribeUploadPreSignResponse.Signature"));
		describeUploadPreSignResponse.setExpire(_ctx.stringValue("DescribeUploadPreSignResponse.Expire"));
		describeUploadPreSignResponse.setHost(_ctx.stringValue("DescribeUploadPreSignResponse.Host"));
		describeUploadPreSignResponse.setKey(_ctx.stringValue("DescribeUploadPreSignResponse.Key"));
		describeUploadPreSignResponse.setPolicy(_ctx.stringValue("DescribeUploadPreSignResponse.Policy"));
		describeUploadPreSignResponse.setSuccess(_ctx.booleanValue("DescribeUploadPreSignResponse.Success"));
		describeUploadPreSignResponse.setCode(_ctx.integerValue("DescribeUploadPreSignResponse.Code"));
	 
	 	return describeUploadPreSignResponse;
	}
}