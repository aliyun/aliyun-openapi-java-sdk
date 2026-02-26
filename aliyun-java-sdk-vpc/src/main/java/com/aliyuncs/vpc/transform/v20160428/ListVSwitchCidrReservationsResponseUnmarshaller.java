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

import com.aliyuncs.vpc.model.v20160428.ListVSwitchCidrReservationsResponse;
import com.aliyuncs.vpc.model.v20160428.ListVSwitchCidrReservationsResponse.VSwitchCidrReservation;
import com.aliyuncs.vpc.model.v20160428.ListVSwitchCidrReservationsResponse.VSwitchCidrReservation.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVSwitchCidrReservationsResponseUnmarshaller {

	public static ListVSwitchCidrReservationsResponse unmarshall(ListVSwitchCidrReservationsResponse listVSwitchCidrReservationsResponse, UnmarshallerContext _ctx) {
		
		listVSwitchCidrReservationsResponse.setRequestId(_ctx.stringValue("ListVSwitchCidrReservationsResponse.RequestId"));
		listVSwitchCidrReservationsResponse.setNextToken(_ctx.stringValue("ListVSwitchCidrReservationsResponse.NextToken"));
		listVSwitchCidrReservationsResponse.setTotalCount(_ctx.longValue("ListVSwitchCidrReservationsResponse.TotalCount"));
		listVSwitchCidrReservationsResponse.setMaxResults(_ctx.longValue("ListVSwitchCidrReservationsResponse.MaxResults"));

		List<VSwitchCidrReservation> vSwitchCidrReservations = new ArrayList<VSwitchCidrReservation>();
		for (int i = 0; i < _ctx.lengthValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations.Length"); i++) {
			VSwitchCidrReservation vSwitchCidrReservation = new VSwitchCidrReservation();
			vSwitchCidrReservation.setVpcId(_ctx.stringValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].VpcId"));
			vSwitchCidrReservation.setVSwitchId(_ctx.stringValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].VSwitchId"));
			vSwitchCidrReservation.setVSwitchCidrReservationId(_ctx.stringValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].VSwitchCidrReservationId"));
			vSwitchCidrReservation.setVSwitchCidrReservationCidr(_ctx.stringValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].VSwitchCidrReservationCidr"));
			vSwitchCidrReservation.setVSwitchCidrReservationName(_ctx.stringValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].VSwitchCidrReservationName"));
			vSwitchCidrReservation.setVSwitchCidrReservationDescription(_ctx.stringValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].VSwitchCidrReservationDescription"));
			vSwitchCidrReservation.setIpVersion(_ctx.stringValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].IpVersion"));
			vSwitchCidrReservation.setCreationTime(_ctx.stringValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].CreationTime"));
			vSwitchCidrReservation.setType(_ctx.stringValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].Type"));
			vSwitchCidrReservation.setAvailableCidrCount(_ctx.integerValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].AvailableCidrCount"));
			vSwitchCidrReservation.setAssignedCidrCount(_ctx.integerValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].AssignedCidrCount"));
			vSwitchCidrReservation.setStatus(_ctx.stringValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].Status"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListVSwitchCidrReservationsResponse.VSwitchCidrReservations["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			vSwitchCidrReservation.setTags(tags);

			vSwitchCidrReservations.add(vSwitchCidrReservation);
		}
		listVSwitchCidrReservationsResponse.setVSwitchCidrReservations(vSwitchCidrReservations);
	 
	 	return listVSwitchCidrReservationsResponse;
	}
}