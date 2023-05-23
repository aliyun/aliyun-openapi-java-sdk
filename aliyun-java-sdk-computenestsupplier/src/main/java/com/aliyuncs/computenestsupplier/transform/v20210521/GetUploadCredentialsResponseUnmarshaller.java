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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import com.aliyuncs.computenestsupplier.model.v20210521.GetUploadCredentialsResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.GetUploadCredentialsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUploadCredentialsResponseUnmarshaller {

	public static GetUploadCredentialsResponse unmarshall(GetUploadCredentialsResponse getUploadCredentialsResponse, UnmarshallerContext _ctx) {
		
		getUploadCredentialsResponse.setRequestId(_ctx.stringValue("GetUploadCredentialsResponse.RequestId"));
		getUploadCredentialsResponse.setSuccess(_ctx.booleanValue("GetUploadCredentialsResponse.Success"));
		getUploadCredentialsResponse.setCode(_ctx.stringValue("GetUploadCredentialsResponse.Code"));
		getUploadCredentialsResponse.setMessage(_ctx.stringValue("GetUploadCredentialsResponse.Message"));
		getUploadCredentialsResponse.setHttpStatusCode(_ctx.integerValue("GetUploadCredentialsResponse.HttpStatusCode"));

		Data data = new Data();
		data.setAccessKeyId(_ctx.stringValue("GetUploadCredentialsResponse.Data.AccessKeyId"));
		data.setAccessKeySecret(_ctx.stringValue("GetUploadCredentialsResponse.Data.AccessKeySecret"));
		data.setSecurityToken(_ctx.stringValue("GetUploadCredentialsResponse.Data.SecurityToken"));
		data.setExpireDate(_ctx.stringValue("GetUploadCredentialsResponse.Data.ExpireDate"));
		data.setRegionId(_ctx.stringValue("GetUploadCredentialsResponse.Data.RegionId"));
		data.setBucketName(_ctx.stringValue("GetUploadCredentialsResponse.Data.BucketName"));
		data.setKey(_ctx.stringValue("GetUploadCredentialsResponse.Data.Key"));
		getUploadCredentialsResponse.setData(data);
	 
	 	return getUploadCredentialsResponse;
	}
}