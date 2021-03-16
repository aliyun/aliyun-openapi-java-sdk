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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsListManagedRacksResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedRacksResponse.ManagedRacksSet;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedRacksResponse.ManagedRacksSet.ManagedHostSet;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedRacksResponse.ManagedRacksSet.ManagedHostSet.HostAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListManagedRacksResponseUnmarshaller {

	public static OpsListManagedRacksResponse unmarshall(OpsListManagedRacksResponse opsListManagedRacksResponse, UnmarshallerContext _ctx) {
		
		opsListManagedRacksResponse.setRequestId(_ctx.stringValue("OpsListManagedRacksResponse.RequestId"));
		opsListManagedRacksResponse.setTotalCount(_ctx.integerValue("OpsListManagedRacksResponse.TotalCount"));
		opsListManagedRacksResponse.setNextToken(_ctx.stringValue("OpsListManagedRacksResponse.NextToken"));

		List<ManagedRacksSet> managedRacksSets = new ArrayList<ManagedRacksSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsListManagedRacksResponse.ManagedRacksSets.Length"); i++) {
			ManagedRacksSet managedRacksSet = new ManagedRacksSet();
			managedRacksSet.setZoneId(_ctx.stringValue("OpsListManagedRacksResponse.ManagedRacksSets["+ i +"].ZoneId"));
			managedRacksSet.setManagedRackId(_ctx.stringValue("OpsListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedRackId"));

			List<ManagedHostSet> managedHostSets = new ArrayList<ManagedHostSet>();
			for (int j = 0; j < _ctx.lengthValue("OpsListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedHostSets.Length"); j++) {
				ManagedHostSet managedHostSet = new ManagedHostSet();
				managedHostSet.setManagedHostId(_ctx.stringValue("OpsListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedHostSets["+ j +"].ManagedHostId"));
				managedHostSet.setStatus(_ctx.stringValue("OpsListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedHostSets["+ j +"].Status"));
				managedHostSet.setDescription(_ctx.stringValue("OpsListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedHostSets["+ j +"].Description"));

				HostAttribute hostAttribute = new HostAttribute();
				hostAttribute.setCpuModelName(_ctx.stringValue("OpsListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedHostSets["+ j +"].HostAttribute.CpuModelName"));
				hostAttribute.setHostType(_ctx.stringValue("OpsListManagedRacksResponse.ManagedRacksSets["+ i +"].ManagedHostSets["+ j +"].HostAttribute.HostType"));
				managedHostSet.setHostAttribute(hostAttribute);

				managedHostSets.add(managedHostSet);
			}
			managedRacksSet.setManagedHostSets(managedHostSets);

			managedRacksSets.add(managedRacksSet);
		}
		opsListManagedRacksResponse.setManagedRacksSets(managedRacksSets);
	 
	 	return opsListManagedRacksResponse;
	}
}