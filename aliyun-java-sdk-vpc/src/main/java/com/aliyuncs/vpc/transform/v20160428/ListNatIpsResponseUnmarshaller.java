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

import com.aliyuncs.vpc.model.v20160428.ListNatIpsResponse;
import com.aliyuncs.vpc.model.v20160428.ListNatIpsResponse.NatIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNatIpsResponseUnmarshaller {

	public static ListNatIpsResponse unmarshall(ListNatIpsResponse listNatIpsResponse, UnmarshallerContext _ctx) {
		
		listNatIpsResponse.setRequestId(_ctx.stringValue("ListNatIpsResponse.RequestId"));
		listNatIpsResponse.setNextToken(_ctx.stringValue("ListNatIpsResponse.NextToken"));
		listNatIpsResponse.setTotalCount(_ctx.stringValue("ListNatIpsResponse.TotalCount"));
		listNatIpsResponse.setMaxResults(_ctx.stringValue("ListNatIpsResponse.MaxResults"));

		List<NatIp> natIps = new ArrayList<NatIp>();
		for (int i = 0; i < _ctx.lengthValue("ListNatIpsResponse.NatIps.Length"); i++) {
			NatIp natIp = new NatIp();
			natIp.setIsDefault(_ctx.booleanValue("ListNatIpsResponse.NatIps["+ i +"].IsDefault"));
			natIp.setNatIp(_ctx.stringValue("ListNatIpsResponse.NatIps["+ i +"].NatIp"));
			natIp.setNatIpCidr(_ctx.stringValue("ListNatIpsResponse.NatIps["+ i +"].NatIpCidr"));
			natIp.setNatIpId(_ctx.stringValue("ListNatIpsResponse.NatIps["+ i +"].NatIpId"));
			natIp.setNatIpDescription(_ctx.stringValue("ListNatIpsResponse.NatIps["+ i +"].NatIpDescription"));
			natIp.setNatGatewayId(_ctx.stringValue("ListNatIpsResponse.NatIps["+ i +"].NatGatewayId"));
			natIp.setNatIpName(_ctx.stringValue("ListNatIpsResponse.NatIps["+ i +"].NatIpName"));
			natIp.setNatIpStatus(_ctx.stringValue("ListNatIpsResponse.NatIps["+ i +"].NatIpStatus"));
			natIp.setRegionId(_ctx.stringValue("ListNatIpsResponse.NatIps["+ i +"].RegionId"));

			natIps.add(natIp);
		}
		listNatIpsResponse.setNatIps(natIps);
	 
	 	return listNatIpsResponse;
	}
}