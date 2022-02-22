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

package com.aliyuncs.cdt.transform.v20210813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdt.model.v20210813.ListCdtTrafficTiersResponse;
import com.aliyuncs.cdt.model.v20210813.ListCdtTrafficTiersResponse.TrafficTiersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCdtTrafficTiersResponseUnmarshaller {

	public static ListCdtTrafficTiersResponse unmarshall(ListCdtTrafficTiersResponse listCdtTrafficTiersResponse, UnmarshallerContext _ctx) {
		
		listCdtTrafficTiersResponse.setRequestId(_ctx.stringValue("ListCdtTrafficTiersResponse.RequestId"));

		List<TrafficTiersItem> trafficTiers = new ArrayList<TrafficTiersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCdtTrafficTiersResponse.TrafficTiers.Length"); i++) {
			TrafficTiersItem trafficTiersItem = new TrafficTiersItem();
			trafficTiersItem.setLowestTraffic(_ctx.longValue("ListCdtTrafficTiersResponse.TrafficTiers["+ i +"].LowestTraffic"));
			trafficTiersItem.setHighestTraffic(_ctx.longValue("ListCdtTrafficTiersResponse.TrafficTiers["+ i +"].HighestTraffic"));
			trafficTiersItem.setTier(_ctx.longValue("ListCdtTrafficTiersResponse.TrafficTiers["+ i +"].Tier"));

			trafficTiers.add(trafficTiersItem);
		}
		listCdtTrafficTiersResponse.setTrafficTiers(trafficTiers);
	 
	 	return listCdtTrafficTiersResponse;
	}
}