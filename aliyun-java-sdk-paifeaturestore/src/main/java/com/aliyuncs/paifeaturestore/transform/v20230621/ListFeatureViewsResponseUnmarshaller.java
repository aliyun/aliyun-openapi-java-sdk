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

import com.aliyuncs.paifeaturestore.model.v20230621.ListFeatureViewsResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListFeatureViewsResponse.FeatureViewsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFeatureViewsResponseUnmarshaller {

	public static ListFeatureViewsResponse unmarshall(ListFeatureViewsResponse listFeatureViewsResponse, UnmarshallerContext _ctx) {
		
		listFeatureViewsResponse.setRequestId(_ctx.stringValue("ListFeatureViewsResponse.RequestId"));
		listFeatureViewsResponse.setTotalCount(_ctx.longValue("ListFeatureViewsResponse.TotalCount"));

		List<FeatureViewsItem> featureViews = new ArrayList<FeatureViewsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFeatureViewsResponse.FeatureViews.Length"); i++) {
			FeatureViewsItem featureViewsItem = new FeatureViewsItem();
			featureViewsItem.setFeatureViewId(_ctx.stringValue("ListFeatureViewsResponse.FeatureViews["+ i +"].FeatureViewId"));
			featureViewsItem.setProjectId(_ctx.stringValue("ListFeatureViewsResponse.FeatureViews["+ i +"].ProjectId"));
			featureViewsItem.setProjectName(_ctx.stringValue("ListFeatureViewsResponse.FeatureViews["+ i +"].ProjectName"));
			featureViewsItem.setFeatureEntityName(_ctx.stringValue("ListFeatureViewsResponse.FeatureViews["+ i +"].FeatureEntityName"));
			featureViewsItem.setName(_ctx.stringValue("ListFeatureViewsResponse.FeatureViews["+ i +"].Name"));
			featureViewsItem.setOwner(_ctx.stringValue("ListFeatureViewsResponse.FeatureViews["+ i +"].Owner"));
			featureViewsItem.setType(_ctx.stringValue("ListFeatureViewsResponse.FeatureViews["+ i +"].Type"));
			featureViewsItem.setGmtCreateTime(_ctx.stringValue("ListFeatureViewsResponse.FeatureViews["+ i +"].GmtCreateTime"));
			featureViewsItem.setGmtModifiedTime(_ctx.stringValue("ListFeatureViewsResponse.FeatureViews["+ i +"].GmtModifiedTime"));
			featureViewsItem.setRegisterTable(_ctx.stringValue("ListFeatureViewsResponse.FeatureViews["+ i +"].RegisterTable"));
			featureViewsItem.setRegisterDatasourceName(_ctx.stringValue("ListFeatureViewsResponse.FeatureViews["+ i +"].RegisterDatasourceName"));
			featureViewsItem.setTTL(_ctx.integerValue("ListFeatureViewsResponse.FeatureViews["+ i +"].TTL"));
			featureViewsItem.setRegisterDatasourceId(_ctx.stringValue("ListFeatureViewsResponse.FeatureViews["+ i +"].RegisterDatasourceId"));

			featureViews.add(featureViewsItem);
		}
		listFeatureViewsResponse.setFeatureViews(featureViews);
	 
	 	return listFeatureViewsResponse;
	}
}