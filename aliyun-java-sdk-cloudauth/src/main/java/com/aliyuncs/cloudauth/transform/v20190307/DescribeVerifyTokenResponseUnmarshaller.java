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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.DescribeVerifyTokenResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeVerifyTokenResponse.OssUploadToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVerifyTokenResponseUnmarshaller {

	public static DescribeVerifyTokenResponse unmarshall(DescribeVerifyTokenResponse describeVerifyTokenResponse, UnmarshallerContext _ctx) {
		
		describeVerifyTokenResponse.setRequestId(_ctx.stringValue("DescribeVerifyTokenResponse.RequestId"));
		describeVerifyTokenResponse.setVerifyPageUrl(_ctx.stringValue("DescribeVerifyTokenResponse.VerifyPageUrl"));
		describeVerifyTokenResponse.setVerifyToken(_ctx.stringValue("DescribeVerifyTokenResponse.VerifyToken"));

		OssUploadToken ossUploadToken = new OssUploadToken();
		ossUploadToken.setBucket(_ctx.stringValue("DescribeVerifyTokenResponse.OssUploadToken.Bucket"));
		ossUploadToken.setEndPoint(_ctx.stringValue("DescribeVerifyTokenResponse.OssUploadToken.EndPoint"));
		ossUploadToken.setPath(_ctx.stringValue("DescribeVerifyTokenResponse.OssUploadToken.Path"));
		ossUploadToken.setExpired(_ctx.longValue("DescribeVerifyTokenResponse.OssUploadToken.Expired"));
		ossUploadToken.setSecret(_ctx.stringValue("DescribeVerifyTokenResponse.OssUploadToken.Secret"));
		ossUploadToken.setKey(_ctx.stringValue("DescribeVerifyTokenResponse.OssUploadToken.Key"));
		ossUploadToken.setToken(_ctx.stringValue("DescribeVerifyTokenResponse.OssUploadToken.Token"));
		describeVerifyTokenResponse.setOssUploadToken(ossUploadToken);
	 
	 	return describeVerifyTokenResponse;
	}
}