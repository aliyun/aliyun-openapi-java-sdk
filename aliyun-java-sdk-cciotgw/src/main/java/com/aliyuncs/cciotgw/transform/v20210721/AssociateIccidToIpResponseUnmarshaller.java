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

import com.aliyuncs.cciotgw.model.v20210721.AssociateIccidToIpResponse;
import com.aliyuncs.cciotgw.model.v20210721.AssociateIccidToIpResponse.ErrorIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssociateIccidToIpResponseUnmarshaller {

	public static AssociateIccidToIpResponse unmarshall(AssociateIccidToIpResponse associateIccidToIpResponse, UnmarshallerContext _ctx) {
		
		associateIccidToIpResponse.setRequestId(_ctx.stringValue("AssociateIccidToIpResponse.RequestId"));
		associateIccidToIpResponse.setCode(_ctx.stringValue("AssociateIccidToIpResponse.Code"));
		associateIccidToIpResponse.setMessage(_ctx.stringValue("AssociateIccidToIpResponse.Message"));
		associateIccidToIpResponse.setSuccess(_ctx.stringValue("AssociateIccidToIpResponse.Success"));

		List<ErrorIp> errorIpList = new ArrayList<ErrorIp>();
		for (int i = 0; i < _ctx.lengthValue("AssociateIccidToIpResponse.ErrorIpList.Length"); i++) {
			ErrorIp errorIp = new ErrorIp();
			errorIp.setCause(_ctx.stringValue("AssociateIccidToIpResponse.ErrorIpList["+ i +"].Cause"));
			errorIp.setIp(_ctx.stringValue("AssociateIccidToIpResponse.ErrorIpList["+ i +"].Ip"));

			errorIpList.add(errorIp);
		}
		associateIccidToIpResponse.setErrorIpList(errorIpList);
	 
	 	return associateIccidToIpResponse;
	}
}