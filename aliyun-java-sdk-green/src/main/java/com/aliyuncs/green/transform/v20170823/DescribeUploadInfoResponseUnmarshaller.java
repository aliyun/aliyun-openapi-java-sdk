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

package com.aliyuncs.green.transform.v20170823;

import com.aliyuncs.green.model.v20170823.DescribeUploadInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUploadInfoResponseUnmarshaller {

	public static DescribeUploadInfoResponse unmarshall(DescribeUploadInfoResponse describeUploadInfoResponse, UnmarshallerContext _ctx) {
		
		describeUploadInfoResponse.setRequestId(_ctx.stringValue("DescribeUploadInfoResponse.RequestId"));
		describeUploadInfoResponse.setAccessid(_ctx.stringValue("DescribeUploadInfoResponse.Accessid"));
		describeUploadInfoResponse.setPolicy(_ctx.stringValue("DescribeUploadInfoResponse.Policy"));
		describeUploadInfoResponse.setSignature(_ctx.stringValue("DescribeUploadInfoResponse.Signature"));
		describeUploadInfoResponse.setFolder(_ctx.stringValue("DescribeUploadInfoResponse.Folder"));
		describeUploadInfoResponse.setHost(_ctx.stringValue("DescribeUploadInfoResponse.Host"));
		describeUploadInfoResponse.setExpire(_ctx.integerValue("DescribeUploadInfoResponse.Expire"));
	 
	 	return describeUploadInfoResponse;
	}
}