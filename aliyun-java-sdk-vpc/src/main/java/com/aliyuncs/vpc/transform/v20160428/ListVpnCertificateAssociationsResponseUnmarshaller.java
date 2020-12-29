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

import com.aliyuncs.vpc.model.v20160428.ListVpnCertificateAssociationsResponse;
import com.aliyuncs.vpc.model.v20160428.ListVpnCertificateAssociationsResponse.VpnCertificateRelation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpnCertificateAssociationsResponseUnmarshaller {

	public static ListVpnCertificateAssociationsResponse unmarshall(ListVpnCertificateAssociationsResponse listVpnCertificateAssociationsResponse, UnmarshallerContext _ctx) {
		
		listVpnCertificateAssociationsResponse.setRequestId(_ctx.stringValue("ListVpnCertificateAssociationsResponse.RequestId"));
		listVpnCertificateAssociationsResponse.setNextToken(_ctx.stringValue("ListVpnCertificateAssociationsResponse.NextToken"));
		listVpnCertificateAssociationsResponse.setMaxResults(_ctx.integerValue("ListVpnCertificateAssociationsResponse.MaxResults"));
		listVpnCertificateAssociationsResponse.setTotalCount(_ctx.integerValue("ListVpnCertificateAssociationsResponse.TotalCount"));

		List<VpnCertificateRelation> vpnCertificateRelations = new ArrayList<VpnCertificateRelation>();
		for (int i = 0; i < _ctx.lengthValue("ListVpnCertificateAssociationsResponse.VpnCertificateRelations.Length"); i++) {
			VpnCertificateRelation vpnCertificateRelation = new VpnCertificateRelation();
			vpnCertificateRelation.setRegionId(_ctx.stringValue("ListVpnCertificateAssociationsResponse.VpnCertificateRelations["+ i +"].RegionId"));
			vpnCertificateRelation.setVpnGatewayId(_ctx.stringValue("ListVpnCertificateAssociationsResponse.VpnCertificateRelations["+ i +"].VpnGatewayId"));
			vpnCertificateRelation.setCertificateId(_ctx.stringValue("ListVpnCertificateAssociationsResponse.VpnCertificateRelations["+ i +"].CertificateId"));
			vpnCertificateRelation.setCertificateType(_ctx.stringValue("ListVpnCertificateAssociationsResponse.VpnCertificateRelations["+ i +"].CertificateType"));
			vpnCertificateRelation.setAssociationTime(_ctx.stringValue("ListVpnCertificateAssociationsResponse.VpnCertificateRelations["+ i +"].AssociationTime"));

			vpnCertificateRelations.add(vpnCertificateRelation);
		}
		listVpnCertificateAssociationsResponse.setVpnCertificateRelations(vpnCertificateRelations);
	 
	 	return listVpnCertificateAssociationsResponse;
	}
}