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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.ListAccessPointNetworkQualitiesResponse;
import com.aliyuncs.smartag.model.v20180313.ListAccessPointNetworkQualitiesResponse.AccessPointNetworkQuality;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccessPointNetworkQualitiesResponseUnmarshaller {

	public static ListAccessPointNetworkQualitiesResponse unmarshall(ListAccessPointNetworkQualitiesResponse listAccessPointNetworkQualitiesResponse, UnmarshallerContext _ctx) {
		
		listAccessPointNetworkQualitiesResponse.setRequestId(_ctx.stringValue("ListAccessPointNetworkQualitiesResponse.RequestId"));

		List<AccessPointNetworkQuality> accessPointNetworkQualities = new ArrayList<AccessPointNetworkQuality>();
		for (int i = 0; i < _ctx.lengthValue("ListAccessPointNetworkQualitiesResponse.AccessPointNetworkQualities.Length"); i++) {
			AccessPointNetworkQuality accessPointNetworkQuality = new AccessPointNetworkQuality();
			accessPointNetworkQuality.setLoss(_ctx.stringValue("ListAccessPointNetworkQualitiesResponse.AccessPointNetworkQualities["+ i +"].Loss"));
			accessPointNetworkQuality.setRtt(_ctx.stringValue("ListAccessPointNetworkQualitiesResponse.AccessPointNetworkQualities["+ i +"].Rtt"));
			accessPointNetworkQuality.setId(_ctx.integerValue("ListAccessPointNetworkQualitiesResponse.AccessPointNetworkQualities["+ i +"].Id"));

			accessPointNetworkQualities.add(accessPointNetworkQuality);
		}
		listAccessPointNetworkQualitiesResponse.setAccessPointNetworkQualities(accessPointNetworkQualities);
	 
	 	return listAccessPointNetworkQualitiesResponse;
	}
}