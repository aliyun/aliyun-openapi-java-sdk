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

package com.aliyuncs.cciotgw.transform.v20210721;

import com.aliyuncs.cciotgw.model.v20210721.GetIccidAndIpResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIccidAndIpResponseUnmarshaller {

	public static GetIccidAndIpResponse unmarshall(GetIccidAndIpResponse getIccidAndIpResponse, UnmarshallerContext _ctx) {
		
		getIccidAndIpResponse.setRequestId(_ctx.stringValue("GetIccidAndIpResponse.RequestId"));
		getIccidAndIpResponse.setCode(_ctx.stringValue("GetIccidAndIpResponse.Code"));
		getIccidAndIpResponse.setMessage(_ctx.stringValue("GetIccidAndIpResponse.Message"));
		getIccidAndIpResponse.setSuccess(_ctx.stringValue("GetIccidAndIpResponse.Success"));
		getIccidAndIpResponse.setStatus(_ctx.stringValue("GetIccidAndIpResponse.Status"));
		getIccidAndIpResponse.setIp(_ctx.stringValue("GetIccidAndIpResponse.Ip"));
		getIccidAndIpResponse.setCciotId(_ctx.stringValue("GetIccidAndIpResponse.CciotId"));
		getIccidAndIpResponse.setIccid(_ctx.stringValue("GetIccidAndIpResponse.Iccid"));
	 
	 	return getIccidAndIpResponse;
	}
}