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

import com.aliyuncs.paifeaturestore.model.v20230621.ListFeatureViewFieldRelationshipsResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListFeatureViewFieldRelationshipsResponse.RelationshipsItem;
import com.aliyuncs.paifeaturestore.model.v20230621.ListFeatureViewFieldRelationshipsResponse.RelationshipsItem.ModelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFeatureViewFieldRelationshipsResponseUnmarshaller {

	public static ListFeatureViewFieldRelationshipsResponse unmarshall(ListFeatureViewFieldRelationshipsResponse listFeatureViewFieldRelationshipsResponse, UnmarshallerContext _ctx) {
		
		listFeatureViewFieldRelationshipsResponse.setRequestId(_ctx.stringValue("ListFeatureViewFieldRelationshipsResponse.RequestId"));

		List<RelationshipsItem> relationships = new ArrayList<RelationshipsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFeatureViewFieldRelationshipsResponse.Relationships.Length"); i++) {
			RelationshipsItem relationshipsItem = new RelationshipsItem();
			relationshipsItem.setFeatureName(_ctx.stringValue("ListFeatureViewFieldRelationshipsResponse.Relationships["+ i +"].FeatureName"));
			relationshipsItem.setOnlineTableName(_ctx.stringValue("ListFeatureViewFieldRelationshipsResponse.Relationships["+ i +"].OnlineTableName"));
			relationshipsItem.setOfflineTableName(_ctx.stringValue("ListFeatureViewFieldRelationshipsResponse.Relationships["+ i +"].OfflineTableName"));

			List<ModelsItem> models = new ArrayList<ModelsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListFeatureViewFieldRelationshipsResponse.Relationships["+ i +"].Models.Length"); j++) {
				ModelsItem modelsItem = new ModelsItem();
				modelsItem.setModelId(_ctx.stringValue("ListFeatureViewFieldRelationshipsResponse.Relationships["+ i +"].Models["+ j +"].ModelId"));
				modelsItem.setModelName(_ctx.stringValue("ListFeatureViewFieldRelationshipsResponse.Relationships["+ i +"].Models["+ j +"].ModelName"));

				models.add(modelsItem);
			}
			relationshipsItem.setModels(models);

			relationships.add(relationshipsItem);
		}
		listFeatureViewFieldRelationshipsResponse.setRelationships(relationships);
	 
	 	return listFeatureViewFieldRelationshipsResponse;
	}
}