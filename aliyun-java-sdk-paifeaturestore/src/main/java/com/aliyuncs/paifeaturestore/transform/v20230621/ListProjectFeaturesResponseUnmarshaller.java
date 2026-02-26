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

import com.aliyuncs.paifeaturestore.model.v20230621.ListProjectFeaturesResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListProjectFeaturesResponse.FeaturesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectFeaturesResponseUnmarshaller {

	public static ListProjectFeaturesResponse unmarshall(ListProjectFeaturesResponse listProjectFeaturesResponse, UnmarshallerContext _ctx) {
		
		listProjectFeaturesResponse.setTotalCount(_ctx.integerValue("ListProjectFeaturesResponse.TotalCount"));
		listProjectFeaturesResponse.setRequestId(_ctx.stringValue("ListProjectFeaturesResponse.requestId"));

		List<FeaturesItem> features = new ArrayList<FeaturesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectFeaturesResponse.Features.Length"); i++) {
			FeaturesItem featuresItem = new FeaturesItem();
			featuresItem.setName(_ctx.stringValue("ListProjectFeaturesResponse.Features["+ i +"].Name"));
			featuresItem.setType(_ctx.stringValue("ListProjectFeaturesResponse.Features["+ i +"].Type"));
			featuresItem.setFeatureViewId(_ctx.stringValue("ListProjectFeaturesResponse.Features["+ i +"].FeatureViewId"));
			featuresItem.setFeatureViewName(_ctx.stringValue("ListProjectFeaturesResponse.Features["+ i +"].FeatureViewName"));
			featuresItem.setOwner(_ctx.stringValue("ListProjectFeaturesResponse.Features["+ i +"].Owner"));
			featuresItem.setModelFeatureCount(_ctx.integerValue("ListProjectFeaturesResponse.Features["+ i +"].ModelFeatureCount"));
			featuresItem.setAliasNames(_ctx.stringValue("ListProjectFeaturesResponse.Features["+ i +"].AliasNames"));
			featuresItem.setGmtCreateTime(_ctx.stringValue("ListProjectFeaturesResponse.Features["+ i +"].GmtCreateTime"));

			features.add(featuresItem);
		}
		listProjectFeaturesResponse.setFeatures(features);
	 
	 	return listProjectFeaturesResponse;
	}
}