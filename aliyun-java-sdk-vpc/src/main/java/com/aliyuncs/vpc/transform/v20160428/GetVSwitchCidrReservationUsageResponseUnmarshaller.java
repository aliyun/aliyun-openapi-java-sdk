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

import com.aliyuncs.vpc.model.v20160428.GetVSwitchCidrReservationUsageResponse;
import com.aliyuncs.vpc.model.v20160428.GetVSwitchCidrReservationUsageResponse.VSwitchCidrReservationUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVSwitchCidrReservationUsageResponseUnmarshaller {

	public static GetVSwitchCidrReservationUsageResponse unmarshall(GetVSwitchCidrReservationUsageResponse getVSwitchCidrReservationUsageResponse, UnmarshallerContext _ctx) {
		
		getVSwitchCidrReservationUsageResponse.setRequestId(_ctx.stringValue("GetVSwitchCidrReservationUsageResponse.RequestId"));
		getVSwitchCidrReservationUsageResponse.setNextToken(_ctx.stringValue("GetVSwitchCidrReservationUsageResponse.NextToken"));
		getVSwitchCidrReservationUsageResponse.setTotalCount(_ctx.longValue("GetVSwitchCidrReservationUsageResponse.TotalCount"));
		getVSwitchCidrReservationUsageResponse.setMaxResults(_ctx.longValue("GetVSwitchCidrReservationUsageResponse.MaxResults"));

		List<VSwitchCidrReservationUsage> cidrReservationUsages = new ArrayList<VSwitchCidrReservationUsage>();
		for (int i = 0; i < _ctx.lengthValue("GetVSwitchCidrReservationUsageResponse.CidrReservationUsages.Length"); i++) {
			VSwitchCidrReservationUsage vSwitchCidrReservationUsage = new VSwitchCidrReservationUsage();
			vSwitchCidrReservationUsage.setVSwitchCidrReservationId(_ctx.stringValue("GetVSwitchCidrReservationUsageResponse.CidrReservationUsages["+ i +"].VSwitchCidrReservationId"));
			vSwitchCidrReservationUsage.setVSwitchId(_ctx.stringValue("GetVSwitchCidrReservationUsageResponse.CidrReservationUsages["+ i +"].VSwitchId"));
			vSwitchCidrReservationUsage.setResourceId(_ctx.stringValue("GetVSwitchCidrReservationUsageResponse.CidrReservationUsages["+ i +"].ResourceId"));
			vSwitchCidrReservationUsage.setResourceType(_ctx.stringValue("GetVSwitchCidrReservationUsageResponse.CidrReservationUsages["+ i +"].ResourceType"));
			vSwitchCidrReservationUsage.setIpPrefixId(_ctx.stringValue("GetVSwitchCidrReservationUsageResponse.CidrReservationUsages["+ i +"].IpPrefixId"));
			vSwitchCidrReservationUsage.setIpPrefixCidr(_ctx.stringValue("GetVSwitchCidrReservationUsageResponse.CidrReservationUsages["+ i +"].IpPrefixCidr"));

			cidrReservationUsages.add(vSwitchCidrReservationUsage);
		}
		getVSwitchCidrReservationUsageResponse.setCidrReservationUsages(cidrReservationUsages);
	 
	 	return getVSwitchCidrReservationUsageResponse;
	}
}