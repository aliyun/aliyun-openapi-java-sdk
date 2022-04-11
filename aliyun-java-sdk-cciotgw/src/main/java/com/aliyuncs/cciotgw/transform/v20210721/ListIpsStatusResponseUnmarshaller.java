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

import com.aliyuncs.cciotgw.model.v20210721.ListIpsStatusResponse;
import com.aliyuncs.cciotgw.model.v20210721.ListIpsStatusResponse.IpAddress;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIpsStatusResponseUnmarshaller {

	public static ListIpsStatusResponse unmarshall(ListIpsStatusResponse listIpsStatusResponse, UnmarshallerContext _ctx) {
		
		listIpsStatusResponse.setRequestId(_ctx.stringValue("ListIpsStatusResponse.RequestId"));
		listIpsStatusResponse.setCode(_ctx.stringValue("ListIpsStatusResponse.Code"));
		listIpsStatusResponse.setMessage(_ctx.stringValue("ListIpsStatusResponse.Message"));
		listIpsStatusResponse.setSuccess(_ctx.stringValue("ListIpsStatusResponse.Success"));

		List<IpAddress> ips = new ArrayList<IpAddress>();
		for (int i = 0; i < _ctx.lengthValue("ListIpsStatusResponse.Ips.Length"); i++) {
			IpAddress ipAddress = new IpAddress();
			ipAddress.setStatus(_ctx.stringValue("ListIpsStatusResponse.Ips["+ i +"].Status"));
			ipAddress.setIp(_ctx.stringValue("ListIpsStatusResponse.Ips["+ i +"].Ip"));

			ips.add(ipAddress);
		}
		listIpsStatusResponse.setIps(ips);
	 
	 	return listIpsStatusResponse;
	}
}