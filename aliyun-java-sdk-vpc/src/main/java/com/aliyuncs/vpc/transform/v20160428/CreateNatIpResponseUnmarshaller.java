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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.CreateNatIpResponse;
import com.aliyuncs.vpc.model.v20160428.CreateNatIpResponse.NatIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNatIpResponseUnmarshaller {

	public static CreateNatIpResponse unmarshall(CreateNatIpResponse createNatIpResponse, UnmarshallerContext _ctx) {
		
		createNatIpResponse.setRequestId(_ctx.stringValue("CreateNatIpResponse.RequestId"));
		createNatIpResponse.setNatIp(_ctx.stringValue("CreateNatIpResponse.NatIp"));
		createNatIpResponse.setNatIpId(_ctx.stringValue("CreateNatIpResponse.NatIpId"));
		createNatIpResponse.setIpv4Prefix(_ctx.stringValue("CreateNatIpResponse.Ipv4Prefix"));

		List<NatIp> natIps = new ArrayList<NatIp>();
		for (int i = 0; i < _ctx.lengthValue("CreateNatIpResponse.NatIps.Length"); i++) {
			NatIp natIp = new NatIp();
			natIp.setNatIp(_ctx.stringValue("CreateNatIpResponse.NatIps["+ i +"].NatIp"));
			natIp.setNatIpId(_ctx.stringValue("CreateNatIpResponse.NatIps["+ i +"].NatIpId"));
			natIp.setIpv4Prefix(_ctx.stringValue("CreateNatIpResponse.NatIps["+ i +"].Ipv4Prefix"));

			natIps.add(natIp);
		}
		createNatIpResponse.setNatIps(natIps);
	 
	 	return createNatIpResponse;
	}
}