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

import com.aliyuncs.cdt.model.v20210813.ListCdtInternetTrafficResponse;
import com.aliyuncs.cdt.model.v20210813.ListCdtInternetTrafficResponse.TrafficDetailsItem;
import com.aliyuncs.cdt.model.v20210813.ListCdtInternetTrafficResponse.TrafficDetailsItem.ProductTrafficDetailsItem;
import com.aliyuncs.cdt.model.v20210813.ListCdtInternetTrafficResponse.TrafficDetailsItem.TrafficTierDetailsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCdtInternetTrafficResponseUnmarshaller {

	public static ListCdtInternetTrafficResponse unmarshall(ListCdtInternetTrafficResponse listCdtInternetTrafficResponse, UnmarshallerContext _ctx) {
		
		listCdtInternetTrafficResponse.setRequestId(_ctx.stringValue("ListCdtInternetTrafficResponse.RequestId"));

		List<TrafficDetailsItem> trafficDetails = new ArrayList<TrafficDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCdtInternetTrafficResponse.TrafficDetails.Length"); i++) {
			TrafficDetailsItem trafficDetailsItem = new TrafficDetailsItem();
			trafficDetailsItem.setISPType(_ctx.stringValue("ListCdtInternetTrafficResponse.TrafficDetails["+ i +"].ISPType"));
			trafficDetailsItem.setBusinessRegionId(_ctx.stringValue("ListCdtInternetTrafficResponse.TrafficDetails["+ i +"].BusinessRegionId"));
			trafficDetailsItem.setTraffic(_ctx.longValue("ListCdtInternetTrafficResponse.TrafficDetails["+ i +"].Traffic"));

			List<ProductTrafficDetailsItem> productTrafficDetails = new ArrayList<ProductTrafficDetailsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCdtInternetTrafficResponse.TrafficDetails["+ i +"].ProductTrafficDetails.Length"); j++) {
				ProductTrafficDetailsItem productTrafficDetailsItem = new ProductTrafficDetailsItem();
				productTrafficDetailsItem.setProduct(_ctx.stringValue("ListCdtInternetTrafficResponse.TrafficDetails["+ i +"].ProductTrafficDetails["+ j +"].Product"));
				productTrafficDetailsItem.setTraffic(_ctx.longValue("ListCdtInternetTrafficResponse.TrafficDetails["+ i +"].ProductTrafficDetails["+ j +"].Traffic"));

				productTrafficDetails.add(productTrafficDetailsItem);
			}
			trafficDetailsItem.setProductTrafficDetails(productTrafficDetails);

			List<TrafficTierDetailsItem> trafficTierDetails = new ArrayList<TrafficTierDetailsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCdtInternetTrafficResponse.TrafficDetails["+ i +"].TrafficTierDetails.Length"); j++) {
				TrafficTierDetailsItem trafficTierDetailsItem = new TrafficTierDetailsItem();
				trafficTierDetailsItem.setTier(_ctx.longValue("ListCdtInternetTrafficResponse.TrafficDetails["+ i +"].TrafficTierDetails["+ j +"].Tier"));
				trafficTierDetailsItem.setTraffic(_ctx.longValue("ListCdtInternetTrafficResponse.TrafficDetails["+ i +"].TrafficTierDetails["+ j +"].Traffic"));
				trafficTierDetailsItem.setLowestTraffic(_ctx.longValue("ListCdtInternetTrafficResponse.TrafficDetails["+ i +"].TrafficTierDetails["+ j +"].LowestTraffic"));
				trafficTierDetailsItem.setHighestTraffic(_ctx.longValue("ListCdtInternetTrafficResponse.TrafficDetails["+ i +"].TrafficTierDetails["+ j +"].HighestTraffic"));

				trafficTierDetails.add(trafficTierDetailsItem);
			}
			trafficDetailsItem.setTrafficTierDetails(trafficTierDetails);

			trafficDetails.add(trafficDetailsItem);
		}
		listCdtInternetTrafficResponse.setTrafficDetails(trafficDetails);
	 
	 	return listCdtInternetTrafficResponse;
	}
}