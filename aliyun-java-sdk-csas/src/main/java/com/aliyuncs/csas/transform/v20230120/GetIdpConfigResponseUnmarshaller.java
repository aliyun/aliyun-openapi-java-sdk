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

package com.aliyuncs.csas.transform.v20230120;

import com.aliyuncs.csas.model.v20230120.GetIdpConfigResponse;
import com.aliyuncs.csas.model.v20230120.GetIdpConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIdpConfigResponseUnmarshaller {

	public static GetIdpConfigResponse unmarshall(GetIdpConfigResponse getIdpConfigResponse, UnmarshallerContext _ctx) {
		
		getIdpConfigResponse.setRequestId(_ctx.stringValue("GetIdpConfigResponse.RequestId"));

		Data data = new Data();
		data.setId(_ctx.stringValue("GetIdpConfigResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetIdpConfigResponse.Data.Name"));
		data.setType(_ctx.stringValue("GetIdpConfigResponse.Data.Type"));
		data.setIdpMetadata(_ctx.stringValue("GetIdpConfigResponse.Data.IdpMetadata"));
		data.setAccessKey(_ctx.stringValue("GetIdpConfigResponse.Data.AccessKey"));
		data.setAccessKeySecret(_ctx.stringValue("GetIdpConfigResponse.Data.AccessKeySecret"));
		data.setStatus(_ctx.stringValue("GetIdpConfigResponse.Data.Status"));
		data.setMfaConfigType(_ctx.stringValue("GetIdpConfigResponse.Data.MfaConfigType"));
		data.setUpdateTime(_ctx.stringValue("GetIdpConfigResponse.Data.UpdateTime"));
		data.setGetGroupUrl(_ctx.stringValue("GetIdpConfigResponse.Data.GetGroupUrl"));
		data.setDescription(_ctx.stringValue("GetIdpConfigResponse.Data.Description"));
		data.setMultiIdpInfo(_ctx.stringValue("GetIdpConfigResponse.Data.MultiIdpInfo"));
		data.setPcLoginType(_ctx.stringValue("GetIdpConfigResponse.Data.PcLoginType"));
		data.setMobileLoginType(_ctx.stringValue("GetIdpConfigResponse.Data.MobileLoginType"));
		data.setMobileMfaConfigType(_ctx.stringValue("GetIdpConfigResponse.Data.MobileMfaConfigType"));
		data.setVerifyToken(_ctx.stringValue("GetIdpConfigResponse.Data.VerifyToken"));
		data.setVerifyAesKey(_ctx.stringValue("GetIdpConfigResponse.Data.VerifyAesKey"));
		data.setVerifyUrl(_ctx.stringValue("GetIdpConfigResponse.Data.VerifyUrl"));
		getIdpConfigResponse.setData(data);
	 
	 	return getIdpConfigResponse;
	}
}