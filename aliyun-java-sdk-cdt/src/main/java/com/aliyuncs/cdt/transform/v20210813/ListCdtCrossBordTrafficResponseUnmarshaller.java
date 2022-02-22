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

import com.aliyuncs.cdt.model.v20210813.ListCdtCrossBordTrafficResponse;
import com.aliyuncs.cdt.model.v20210813.ListCdtCrossBordTrafficResponse.TrafficDetailsItem;
import com.aliyuncs.cdt.model.v20210813.ListCdtCrossBordTrafficResponse.TrafficDetailsItem.ProductTrafficDetailsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCdtCrossBordTrafficResponseUnmarshaller {

	public static ListCdtCrossBordTrafficResponse unmarshall(ListCdtCrossBordTrafficResponse listCdtCrossBordTrafficResponse, UnmarshallerContext _ctx) {
		
		listCdtCrossBordTrafficResponse.setRequestId(_ctx.stringValue("ListCdtCrossBordTrafficResponse.RequestId"));

		List<TrafficDetailsItem> trafficDetails = new ArrayList<TrafficDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCdtCrossBordTrafficResponse.TrafficDetails.Length"); i++) {
			TrafficDetailsItem trafficDetailsItem = new TrafficDetailsItem();
			trafficDetailsItem.setBusinessRegionId(_ctx.stringValue("ListCdtCrossBordTrafficResponse.TrafficDetails["+ i +"].BusinessRegionId"));
			trafficDetailsItem.setTraffic(_ctx.longValue("ListCdtCrossBordTrafficResponse.TrafficDetails["+ i +"].Traffic"));

			List<ProductTrafficDetailsItem> productTrafficDetails = new ArrayList<ProductTrafficDetailsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCdtCrossBordTrafficResponse.TrafficDetails["+ i +"].ProductTrafficDetails.Length"); j++) {
				ProductTrafficDetailsItem productTrafficDetailsItem = new ProductTrafficDetailsItem();
				productTrafficDetailsItem.setProduct(_ctx.stringValue("ListCdtCrossBordTrafficResponse.TrafficDetails["+ i +"].ProductTrafficDetails["+ j +"].Product"));
				productTrafficDetailsItem.setTraffic(_ctx.longValue("ListCdtCrossBordTrafficResponse.TrafficDetails["+ i +"].ProductTrafficDetails["+ j +"].Traffic"));

				productTrafficDetails.add(productTrafficDetailsItem);
			}
			trafficDetailsItem.setProductTrafficDetails(productTrafficDetails);

			trafficDetails.add(trafficDetailsItem);
		}
		listCdtCrossBordTrafficResponse.setTrafficDetails(trafficDetails);
	 
	 	return listCdtCrossBordTrafficResponse;
	}
}