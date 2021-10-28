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

package com.aliyuncs.cloudauth.transform.v20180916;

import com.aliyuncs.cloudauth.model.v20180916.GetVerifyTokenResponse;
import com.aliyuncs.cloudauth.model.v20180916.GetVerifyTokenResponse.Data;
import com.aliyuncs.cloudauth.model.v20180916.GetVerifyTokenResponse.Data.StsToken;
import com.aliyuncs.cloudauth.model.v20180916.GetVerifyTokenResponse.Data.VerifyToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVerifyTokenResponseUnmarshaller {

	public static GetVerifyTokenResponse unmarshall(GetVerifyTokenResponse getVerifyTokenResponse, UnmarshallerContext _ctx) {
		
		getVerifyTokenResponse.setRequestId(_ctx.stringValue("GetVerifyTokenResponse.RequestId"));
		getVerifyTokenResponse.setCode(_ctx.stringValue("GetVerifyTokenResponse.Code"));
		getVerifyTokenResponse.setMessage(_ctx.stringValue("GetVerifyTokenResponse.Message"));
		getVerifyTokenResponse.setSuccess(_ctx.booleanValue("GetVerifyTokenResponse.Success"));

		Data data = new Data();
		data.setCloudauthPageUrl(_ctx.stringValue("GetVerifyTokenResponse.Data.CloudauthPageUrl"));

		VerifyToken verifyToken = new VerifyToken();
		verifyToken.setDurationSeconds(_ctx.integerValue("GetVerifyTokenResponse.Data.VerifyToken.DurationSeconds"));
		verifyToken.setToken(_ctx.stringValue("GetVerifyTokenResponse.Data.VerifyToken.Token"));
		data.setVerifyToken(verifyToken);

		StsToken stsToken = new StsToken();
		stsToken.setToken(_ctx.stringValue("GetVerifyTokenResponse.Data.StsToken.Token"));
		stsToken.setBucketName(_ctx.stringValue("GetVerifyTokenResponse.Data.StsToken.BucketName"));
		stsToken.setAccessKeySecret(_ctx.stringValue("GetVerifyTokenResponse.Data.StsToken.AccessKeySecret"));
		stsToken.setExpiration(_ctx.stringValue("GetVerifyTokenResponse.Data.StsToken.Expiration"));
		stsToken.setPath(_ctx.stringValue("GetVerifyTokenResponse.Data.StsToken.Path"));
		stsToken.setAccessKeyId(_ctx.stringValue("GetVerifyTokenResponse.Data.StsToken.AccessKeyId"));
		stsToken.setEndPoint(_ctx.stringValue("GetVerifyTokenResponse.Data.StsToken.EndPoint"));
		data.setStsToken(stsToken);
		getVerifyTokenResponse.setData(data);
	 
	 	return getVerifyTokenResponse;
	}
}