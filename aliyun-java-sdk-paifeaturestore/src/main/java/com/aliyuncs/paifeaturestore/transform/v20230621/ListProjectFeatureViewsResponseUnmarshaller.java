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

import com.aliyuncs.paifeaturestore.model.v20230621.ListProjectFeatureViewsResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListProjectFeatureViewsResponse.FeatureViewsItem;
import com.aliyuncs.paifeaturestore.model.v20230621.ListProjectFeatureViewsResponse.FeatureViewsItem.FeaturesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectFeatureViewsResponseUnmarshaller {

	public static ListProjectFeatureViewsResponse unmarshall(ListProjectFeatureViewsResponse listProjectFeatureViewsResponse, UnmarshallerContext _ctx) {
		
		listProjectFeatureViewsResponse.setRequestId(_ctx.stringValue("ListProjectFeatureViewsResponse.RequestId"));
		listProjectFeatureViewsResponse.setTotalCount(_ctx.longValue("ListProjectFeatureViewsResponse.TotalCount"));

		List<FeatureViewsItem> featureViews = new ArrayList<FeatureViewsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectFeatureViewsResponse.FeatureViews.Length"); i++) {
			FeatureViewsItem featureViewsItem = new FeatureViewsItem();
			featureViewsItem.setName(_ctx.stringValue("ListProjectFeatureViewsResponse.FeatureViews["+ i +"].Name"));
			featureViewsItem.setFeatureViewId(_ctx.stringValue("ListProjectFeatureViewsResponse.FeatureViews["+ i +"].FeatureViewId"));
			featureViewsItem.setType(_ctx.stringValue("ListProjectFeatureViewsResponse.FeatureViews["+ i +"].Type"));
			featureViewsItem.setJoinId(_ctx.stringValue("ListProjectFeatureViewsResponse.FeatureViews["+ i +"].JoinId"));
			featureViewsItem.setParentJoinId(_ctx.stringValue("ListProjectFeatureViewsResponse.FeatureViews["+ i +"].ParentJoinId"));

			List<FeaturesItem> features = new ArrayList<FeaturesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListProjectFeatureViewsResponse.FeatureViews["+ i +"].Features.Length"); j++) {
				FeaturesItem featuresItem = new FeaturesItem();
				featuresItem.setName(_ctx.stringValue("ListProjectFeatureViewsResponse.FeatureViews["+ i +"].Features["+ j +"].Name"));
				featuresItem.setType(_ctx.stringValue("ListProjectFeatureViewsResponse.FeatureViews["+ i +"].Features["+ j +"].Type"));

				List<String> attributes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListProjectFeatureViewsResponse.FeatureViews["+ i +"].Features["+ j +"].Attributes.Length"); k++) {
					attributes.add(_ctx.stringValue("ListProjectFeatureViewsResponse.FeatureViews["+ i +"].Features["+ j +"].Attributes["+ k +"]"));
				}
				featuresItem.setAttributes(attributes);

				features.add(featuresItem);
			}
			featureViewsItem.setFeatures(features);

			featureViews.add(featureViewsItem);
		}
		listProjectFeatureViewsResponse.setFeatureViews(featureViews);
	 
	 	return listProjectFeatureViewsResponse;
	}
}