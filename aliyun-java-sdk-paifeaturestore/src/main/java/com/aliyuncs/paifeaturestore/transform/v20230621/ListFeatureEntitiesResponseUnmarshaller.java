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

import com.aliyuncs.paifeaturestore.model.v20230621.ListFeatureEntitiesResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListFeatureEntitiesResponse.FeatureEntitiesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFeatureEntitiesResponseUnmarshaller {

	public static ListFeatureEntitiesResponse unmarshall(ListFeatureEntitiesResponse listFeatureEntitiesResponse, UnmarshallerContext _ctx) {
		
		listFeatureEntitiesResponse.setRequestId(_ctx.stringValue("ListFeatureEntitiesResponse.RequestId"));
		listFeatureEntitiesResponse.setTotalCount(_ctx.integerValue("ListFeatureEntitiesResponse.TotalCount"));

		List<FeatureEntitiesItem> featureEntities = new ArrayList<FeatureEntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFeatureEntitiesResponse.FeatureEntities.Length"); i++) {
			FeatureEntitiesItem featureEntitiesItem = new FeatureEntitiesItem();
			featureEntitiesItem.setFeatureEntityId(_ctx.stringValue("ListFeatureEntitiesResponse.FeatureEntities["+ i +"].FeatureEntityId"));
			featureEntitiesItem.setGmtCreateTime(_ctx.stringValue("ListFeatureEntitiesResponse.FeatureEntities["+ i +"].GmtCreateTime"));
			featureEntitiesItem.setJoinId(_ctx.stringValue("ListFeatureEntitiesResponse.FeatureEntities["+ i +"].JoinId"));
			featureEntitiesItem.setName(_ctx.stringValue("ListFeatureEntitiesResponse.FeatureEntities["+ i +"].Name"));
			featureEntitiesItem.setOwner(_ctx.stringValue("ListFeatureEntitiesResponse.FeatureEntities["+ i +"].Owner"));
			featureEntitiesItem.setProjectId(_ctx.stringValue("ListFeatureEntitiesResponse.FeatureEntities["+ i +"].ProjectId"));
			featureEntitiesItem.setProjectName(_ctx.stringValue("ListFeatureEntitiesResponse.FeatureEntities["+ i +"].ProjectName"));
			featureEntitiesItem.setParentFeatureEntityId(_ctx.stringValue("ListFeatureEntitiesResponse.FeatureEntities["+ i +"].ParentFeatureEntityId"));
			featureEntitiesItem.setParentFeatureEntityName(_ctx.stringValue("ListFeatureEntitiesResponse.FeatureEntities["+ i +"].ParentFeatureEntityName"));
			featureEntitiesItem.setParentJoinId(_ctx.stringValue("ListFeatureEntitiesResponse.FeatureEntities["+ i +"].ParentJoinId"));

			featureEntities.add(featureEntitiesItem);
		}
		listFeatureEntitiesResponse.setFeatureEntities(featureEntities);
	 
	 	return listFeatureEntitiesResponse;
	}
}