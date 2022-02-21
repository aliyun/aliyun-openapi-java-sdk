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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.UpdateSSLCertResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSSLCertResponseUnmarshaller {

	public static UpdateSSLCertResponse unmarshall(UpdateSSLCertResponse updateSSLCertResponse, UnmarshallerContext _ctx) {
		
		updateSSLCertResponse.setRequestId(_ctx.stringValue("UpdateSSLCertResponse.RequestId"));
		updateSSLCertResponse.setHttpStatusCode(_ctx.integerValue("UpdateSSLCertResponse.HttpStatusCode"));
		updateSSLCertResponse.setMessage(_ctx.stringValue("UpdateSSLCertResponse.Message"));
		updateSSLCertResponse.setCode(_ctx.integerValue("UpdateSSLCertResponse.Code"));
		updateSSLCertResponse.setSuccess(_ctx.booleanValue("UpdateSSLCertResponse.Success"));
		updateSSLCertResponse.setData(_ctx.booleanValue("UpdateSSLCertResponse.Data"));
	 
	 	return updateSSLCertResponse;
	}
}