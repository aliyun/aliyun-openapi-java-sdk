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

package com.aliyuncs.onsmqtt.transform.v20200420;

import com.aliyuncs.onsmqtt.model.v20200420.InactivateDeviceCertificateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InactivateDeviceCertificateResponseUnmarshaller {

	public static InactivateDeviceCertificateResponse unmarshall(InactivateDeviceCertificateResponse inactivateDeviceCertificateResponse, UnmarshallerContext _ctx) {
		
		inactivateDeviceCertificateResponse.setRequestId(_ctx.stringValue("InactivateDeviceCertificateResponse.RequestId"));
		inactivateDeviceCertificateResponse.setDeviceSn(_ctx.stringValue("InactivateDeviceCertificateResponse.DeviceSn"));
	 
	 	return inactivateDeviceCertificateResponse;
	}
}