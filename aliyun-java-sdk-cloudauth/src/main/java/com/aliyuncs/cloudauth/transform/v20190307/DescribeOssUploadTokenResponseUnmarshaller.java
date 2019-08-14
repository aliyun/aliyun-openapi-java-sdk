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

import com.aliyuncs.cloudauth.model.v20190307.DescribeOssUploadTokenResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeOssUploadTokenResponse.OssUploadToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssUploadTokenResponseUnmarshaller {

	public static DescribeOssUploadTokenResponse unmarshall(DescribeOssUploadTokenResponse describeOssUploadTokenResponse, UnmarshallerContext _ctx) {
		
		describeOssUploadTokenResponse.setRequestId(_ctx.stringValue("DescribeOssUploadTokenResponse.RequestId"));

		OssUploadToken ossUploadToken = new OssUploadToken();
		ossUploadToken.setBucket(_ctx.stringValue("DescribeOssUploadTokenResponse.OssUploadToken.Bucket"));
		ossUploadToken.setEndPoint(_ctx.stringValue("DescribeOssUploadTokenResponse.OssUploadToken.EndPoint"));
		ossUploadToken.setPath(_ctx.stringValue("DescribeOssUploadTokenResponse.OssUploadToken.Path"));
		ossUploadToken.setExpired(_ctx.longValue("DescribeOssUploadTokenResponse.OssUploadToken.Expired"));
		ossUploadToken.setSecret(_ctx.stringValue("DescribeOssUploadTokenResponse.OssUploadToken.Secret"));
		ossUploadToken.setKey(_ctx.stringValue("DescribeOssUploadTokenResponse.OssUploadToken.Key"));
		ossUploadToken.setToken(_ctx.stringValue("DescribeOssUploadTokenResponse.OssUploadToken.Token"));
		describeOssUploadTokenResponse.setOssUploadToken(ossUploadToken);
	 
	 	return describeOssUploadTokenResponse;
	}
}