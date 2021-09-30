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

import com.aliyuncs.vpc.model.v20160428.ListNatIpCidrsResponse;
import com.aliyuncs.vpc.model.v20160428.ListNatIpCidrsResponse.NatIpCidr;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNatIpCidrsResponseUnmarshaller {

	public static ListNatIpCidrsResponse unmarshall(ListNatIpCidrsResponse listNatIpCidrsResponse, UnmarshallerContext _ctx) {
		
		listNatIpCidrsResponse.setRequestId(_ctx.stringValue("ListNatIpCidrsResponse.RequestId"));
		listNatIpCidrsResponse.setNextToken(_ctx.stringValue("ListNatIpCidrsResponse.NextToken"));
		listNatIpCidrsResponse.setTotalCount(_ctx.stringValue("ListNatIpCidrsResponse.TotalCount"));
		listNatIpCidrsResponse.setMaxResults(_ctx.stringValue("ListNatIpCidrsResponse.MaxResults"));

		List<NatIpCidr> natIpCidrs = new ArrayList<NatIpCidr>();
		for (int i = 0; i < _ctx.lengthValue("ListNatIpCidrsResponse.NatIpCidrs.Length"); i++) {
			NatIpCidr natIpCidr = new NatIpCidr();
			natIpCidr.setCreationTime(_ctx.stringValue("ListNatIpCidrsResponse.NatIpCidrs["+ i +"].CreationTime"));
			natIpCidr.setNatIpCidrId(_ctx.stringValue("ListNatIpCidrsResponse.NatIpCidrs["+ i +"].NatIpCidrId"));
			natIpCidr.setIsDefault(_ctx.booleanValue("ListNatIpCidrsResponse.NatIpCidrs["+ i +"].IsDefault"));
			natIpCidr.setNatIpCidrStatus(_ctx.stringValue("ListNatIpCidrsResponse.NatIpCidrs["+ i +"].NatIpCidrStatus"));
			natIpCidr.setNatIpCidrName(_ctx.stringValue("ListNatIpCidrsResponse.NatIpCidrs["+ i +"].NatIpCidrName"));
			natIpCidr.setNatIpCidr(_ctx.stringValue("ListNatIpCidrsResponse.NatIpCidrs["+ i +"].NatIpCidr"));
			natIpCidr.setNatGatewayId(_ctx.stringValue("ListNatIpCidrsResponse.NatIpCidrs["+ i +"].NatGatewayId"));
			natIpCidr.setNatIpCidrDescription(_ctx.stringValue("ListNatIpCidrsResponse.NatIpCidrs["+ i +"].NatIpCidrDescription"));
			natIpCidr.setRegionId(_ctx.stringValue("ListNatIpCidrsResponse.NatIpCidrs["+ i +"].RegionId"));

			natIpCidrs.add(natIpCidr);
		}
		listNatIpCidrsResponse.setNatIpCidrs(natIpCidrs);
	 
	 	return listNatIpCidrsResponse;
	}
}