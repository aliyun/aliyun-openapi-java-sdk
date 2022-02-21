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

import com.aliyuncs.mse.model.v20190531.AddSSLCertResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddSSLCertResponseUnmarshaller {

	public static AddSSLCertResponse unmarshall(AddSSLCertResponse addSSLCertResponse, UnmarshallerContext _ctx) {
		
		addSSLCertResponse.setRequestId(_ctx.stringValue("AddSSLCertResponse.RequestId"));
		addSSLCertResponse.setHttpStatusCode(_ctx.integerValue("AddSSLCertResponse.HttpStatusCode"));
		addSSLCertResponse.setMessage(_ctx.stringValue("AddSSLCertResponse.Message"));
		addSSLCertResponse.setCode(_ctx.integerValue("AddSSLCertResponse.Code"));
		addSSLCertResponse.setSuccess(_ctx.booleanValue("AddSSLCertResponse.Success"));
		addSSLCertResponse.setData(_ctx.booleanValue("AddSSLCertResponse.Data"));
	 
	 	return addSSLCertResponse;
	}
}