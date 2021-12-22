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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cciotgw.model.v20210721.UnAssociateIccidToIpResponse;
import com.aliyuncs.cciotgw.model.v20210721.UnAssociateIccidToIpResponse.ErrorIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnAssociateIccidToIpResponseUnmarshaller {

	public static UnAssociateIccidToIpResponse unmarshall(UnAssociateIccidToIpResponse unAssociateIccidToIpResponse, UnmarshallerContext _ctx) {
		
		unAssociateIccidToIpResponse.setRequestId(_ctx.stringValue("UnAssociateIccidToIpResponse.RequestId"));
		unAssociateIccidToIpResponse.setCode(_ctx.stringValue("UnAssociateIccidToIpResponse.Code"));
		unAssociateIccidToIpResponse.setMessage(_ctx.stringValue("UnAssociateIccidToIpResponse.Message"));
		unAssociateIccidToIpResponse.setSuccess(_ctx.stringValue("UnAssociateIccidToIpResponse.Success"));

		List<ErrorIp> errorIpList = new ArrayList<ErrorIp>();
		for (int i = 0; i < _ctx.lengthValue("UnAssociateIccidToIpResponse.ErrorIpList.Length"); i++) {
			ErrorIp errorIp = new ErrorIp();
			errorIp.setCause(_ctx.stringValue("UnAssociateIccidToIpResponse.ErrorIpList["+ i +"].Cause"));
			errorIp.setIp(_ctx.stringValue("UnAssociateIccidToIpResponse.ErrorIpList["+ i +"].Ip"));

			errorIpList.add(errorIp);
		}
		unAssociateIccidToIpResponse.setErrorIpList(errorIpList);
	 
	 	return unAssociateIccidToIpResponse;
	}
}