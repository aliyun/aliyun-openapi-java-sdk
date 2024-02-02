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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.ListModelFeatureAvailableFeaturesResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListModelFeatureAvailableFeaturesResponse.AvailableFeatures;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModelFeatureAvailableFeaturesResponseUnmarshaller {

	public static ListModelFeatureAvailableFeaturesResponse unmarshall(ListModelFeatureAvailableFeaturesResponse listModelFeatureAvailableFeaturesResponse, UnmarshallerContext _ctx) {
		
		listModelFeatureAvailableFeaturesResponse.setRequestId(_ctx.stringValue("ListModelFeatureAvailableFeaturesResponse.requestId"));
		listModelFeatureAvailableFeaturesResponse.setTotalCount(_ctx.longValue("ListModelFeatureAvailableFeaturesResponse.TotalCount"));

		List<AvailableFeatures> avaliableFeatures = new ArrayList<AvailableFeatures>();
		for (int i = 0; i < _ctx.lengthValue("ListModelFeatureAvailableFeaturesResponse.AvaliableFeatures.Length"); i++) {
			AvailableFeatures availableFeatures = new AvailableFeatures();
			availableFeatures.setName(_ctx.stringValue("ListModelFeatureAvailableFeaturesResponse.AvaliableFeatures["+ i +"].Name"));
			availableFeatures.setType(_ctx.stringValue("ListModelFeatureAvailableFeaturesResponse.AvaliableFeatures["+ i +"].Type"));
			availableFeatures.setSourceType(_ctx.stringValue("ListModelFeatureAvailableFeaturesResponse.AvaliableFeatures["+ i +"].SourceType"));
			availableFeatures.setSourceName(_ctx.stringValue("ListModelFeatureAvailableFeaturesResponse.AvaliableFeatures["+ i +"].SourceName"));

			avaliableFeatures.add(availableFeatures);
		}
		listModelFeatureAvailableFeaturesResponse.setAvaliableFeatures(avaliableFeatures);
	 
	 	return listModelFeatureAvailableFeaturesResponse;
	}
}