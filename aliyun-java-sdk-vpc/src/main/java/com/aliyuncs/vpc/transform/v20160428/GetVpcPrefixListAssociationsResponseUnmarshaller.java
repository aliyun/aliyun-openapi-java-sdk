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

import com.aliyuncs.vpc.model.v20160428.GetVpcPrefixListAssociationsResponse;
import com.aliyuncs.vpc.model.v20160428.GetVpcPrefixListAssociationsResponse.PrefixListAssociations;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVpcPrefixListAssociationsResponseUnmarshaller {

	public static GetVpcPrefixListAssociationsResponse unmarshall(GetVpcPrefixListAssociationsResponse getVpcPrefixListAssociationsResponse, UnmarshallerContext _ctx) {
		
		getVpcPrefixListAssociationsResponse.setRequestId(_ctx.stringValue("GetVpcPrefixListAssociationsResponse.RequestId"));
		getVpcPrefixListAssociationsResponse.setNextToken(_ctx.stringValue("GetVpcPrefixListAssociationsResponse.NextToken"));
		getVpcPrefixListAssociationsResponse.setTotalCount(_ctx.longValue("GetVpcPrefixListAssociationsResponse.TotalCount"));
		getVpcPrefixListAssociationsResponse.setCount(_ctx.longValue("GetVpcPrefixListAssociationsResponse.Count"));

		List<PrefixListAssociations> prefixListAssociation = new ArrayList<PrefixListAssociations>();
		for (int i = 0; i < _ctx.lengthValue("GetVpcPrefixListAssociationsResponse.PrefixListAssociation.Length"); i++) {
			PrefixListAssociations prefixListAssociations = new PrefixListAssociations();
			prefixListAssociations.setPrefixListId(_ctx.stringValue("GetVpcPrefixListAssociationsResponse.PrefixListAssociation["+ i +"].PrefixListId"));
			prefixListAssociations.setResourceId(_ctx.stringValue("GetVpcPrefixListAssociationsResponse.PrefixListAssociation["+ i +"].ResourceId"));
			prefixListAssociations.setResourceType(_ctx.stringValue("GetVpcPrefixListAssociationsResponse.PrefixListAssociation["+ i +"].ResourceType"));
			prefixListAssociations.setOwnerId(_ctx.stringValue("GetVpcPrefixListAssociationsResponse.PrefixListAssociation["+ i +"].OwnerId"));
			prefixListAssociations.setStatus(_ctx.stringValue("GetVpcPrefixListAssociationsResponse.PrefixListAssociation["+ i +"].Status"));
			prefixListAssociations.setReason(_ctx.stringValue("GetVpcPrefixListAssociationsResponse.PrefixListAssociation["+ i +"].Reason"));
			prefixListAssociations.setRegionId(_ctx.stringValue("GetVpcPrefixListAssociationsResponse.PrefixListAssociation["+ i +"].RegionId"));
			prefixListAssociations.setResourceUid(_ctx.stringValue("GetVpcPrefixListAssociationsResponse.PrefixListAssociation["+ i +"].ResourceUid"));
			prefixListAssociations.setCidrList(_ctx.stringValue("GetVpcPrefixListAssociationsResponse.PrefixListAssociation["+ i +"].CidrList"));

			prefixListAssociation.add(prefixListAssociations);
		}
		getVpcPrefixListAssociationsResponse.setPrefixListAssociation(prefixListAssociation);
	 
	 	return getVpcPrefixListAssociationsResponse;
	}
}