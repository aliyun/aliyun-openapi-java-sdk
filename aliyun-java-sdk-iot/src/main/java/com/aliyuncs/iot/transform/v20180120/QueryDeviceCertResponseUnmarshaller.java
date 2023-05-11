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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.QueryDeviceCertResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceCertResponse.DeviceCertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceCertResponseUnmarshaller {

	public static QueryDeviceCertResponse unmarshall(QueryDeviceCertResponse queryDeviceCertResponse, UnmarshallerContext _ctx) {
		
		queryDeviceCertResponse.setRequestId(_ctx.stringValue("QueryDeviceCertResponse.RequestId"));
		queryDeviceCertResponse.setSuccess(_ctx.booleanValue("QueryDeviceCertResponse.Success"));
		queryDeviceCertResponse.setCode(_ctx.stringValue("QueryDeviceCertResponse.Code"));
		queryDeviceCertResponse.setErrorMessage(_ctx.stringValue("QueryDeviceCertResponse.ErrorMessage"));

		DeviceCertInfo deviceCertInfo = new DeviceCertInfo();
		deviceCertInfo.setStatus(_ctx.integerValue("QueryDeviceCertResponse.DeviceCertInfo.Status"));
		deviceCertInfo.setCertificate(_ctx.stringValue("QueryDeviceCertResponse.DeviceCertInfo.Certificate"));
		deviceCertInfo.setPrivateKey(_ctx.stringValue("QueryDeviceCertResponse.DeviceCertInfo.PrivateKey"));
		deviceCertInfo.setCertSN(_ctx.stringValue("QueryDeviceCertResponse.DeviceCertInfo.CertSN"));
		queryDeviceCertResponse.setDeviceCertInfo(deviceCertInfo);
	 
	 	return queryDeviceCertResponse;
	}
}