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

package com.aliyuncs.smarthosting.transform.v20200801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smarthosting.model.v20200801.ListManagedRacksResponse;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedRacksResponse.ManagedRacksSet;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedRacksResponse.ManagedRacksSet.ManagedHostSet;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedRacksResponse.ManagedRacksSet.ManagedHostSet.HostAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListManagedRacksResponseUnmarshaller {

	public static ListManagedRacksResponse unmarshall(ListManagedRacksResponse listManagedRacksResponse, UnmarshallerContext _ctx) {
		
		listManagedRacksResponse.setRequestId(_ctx.stringValue("ListManagedRacksResponse.RequestId"));
		listManagedRacksResponse.setNextToken(_ctx.stringValue("ListManagedRacksResponse.NextToken"));
		listManagedRacksResponse.setPageSize(_ctx.integerValue("ListManagedRacksResponse.PageSize"));
		listManagedRacksResponse.setTotalCount(_ctx.integerValue("ListManagedRacksResponse.TotalCount"));

		List<ManagedRacksSet> managedRacksSets = new ArrayList<ManagedRacksSet>();
		for (int i = 0; i < _ctx.lengthValue("ListManagedRacksResponse.ManagedRacksSets.Length"); i++) {
			ManagedRacksSet managedRacksSet = new ManagedRacksSet();
			managedRacksSet.setManagedRackId(_ctx.stringValue("ListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedRackId"));
			managedRacksSet.setZoneId(_ctx.stringValue("ListManagedRacksResponse.ManagedRacksSets["+ i +"].ZoneId"));

			List<ManagedHostSet> managedHostSets = new ArrayList<ManagedHostSet>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedHostSets.Length"); j++) {
				ManagedHostSet managedHostSet = new ManagedHostSet();
				managedHostSet.setDescription(_ctx.stringValue("ListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedHostSets["+ j +"].Description"));
				managedHostSet.setManagedHostId(_ctx.stringValue("ListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedHostSets["+ j +"].ManagedHostId"));
				managedHostSet.setStatus(_ctx.stringValue("ListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedHostSets["+ j +"].Status"));

				HostAttribute hostAttribute = new HostAttribute();
				hostAttribute.setCpuModelName(_ctx.stringValue("ListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedHostSets["+ j +"].HostAttribute.CpuModelName"));
				hostAttribute.setHostType(_ctx.stringValue("ListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedHostSets["+ j +"].HostAttribute.HostType"));
				managedHostSet.setHostAttribute(hostAttribute);

				managedHostSets.add(managedHostSet);
			}
			managedRacksSet.setManagedHostSets(managedHostSets);

			managedRacksSets.add(managedRacksSet);
		}
		listManagedRacksResponse.setManagedRacksSets(managedRacksSets);
	 
	 	return listManagedRacksResponse;
	}
}