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

package com.aliyuncs.cc5g.transform.v20220314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cc5g.model.v20220314.ListAPNsResponse;
import com.aliyuncs.cc5g.model.v20220314.ListAPNsResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAPNsResponseUnmarshaller {

	public static ListAPNsResponse unmarshall(ListAPNsResponse listAPNsResponse, UnmarshallerContext _ctx) {
		
		listAPNsResponse.setRequestId(_ctx.stringValue("ListAPNsResponse.RequestId"));
		listAPNsResponse.setNextToken(_ctx.stringValue("ListAPNsResponse.NextToken"));
		listAPNsResponse.setMaxResults(_ctx.stringValue("ListAPNsResponse.MaxResults"));
		listAPNsResponse.setTotalCount(_ctx.stringValue("ListAPNsResponse.TotalCount"));

		List<Region> aPNs = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("ListAPNsResponse.APNs.Length"); i++) {
			Region region = new Region();
			region.setISP(_ctx.stringValue("ListAPNsResponse.APNs["+ i +"].ISP"));
			region.setAPN(_ctx.stringValue("ListAPNsResponse.APNs["+ i +"].APN"));
			region.setName(_ctx.stringValue("ListAPNsResponse.APNs["+ i +"].Name"));
			region.setDescription(_ctx.stringValue("ListAPNsResponse.APNs["+ i +"].Description"));

			List<String> zones = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAPNsResponse.APNs["+ i +"].Zones.Length"); j++) {
				zones.add(_ctx.stringValue("ListAPNsResponse.APNs["+ i +"].Zones["+ j +"]"));
			}
			region.setZones(zones);

			aPNs.add(region);
		}
		listAPNsResponse.setAPNs(aPNs);
	 
	 	return listAPNsResponse;
	}
}