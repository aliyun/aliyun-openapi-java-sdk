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

import com.aliyuncs.paifeaturestore.model.v20230621.ListFeatureViewRelationshipsResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListFeatureViewRelationshipsResponse.RelationshipsItem;
import com.aliyuncs.paifeaturestore.model.v20230621.ListFeatureViewRelationshipsResponse.RelationshipsItem.ModelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFeatureViewRelationshipsResponseUnmarshaller {

	public static ListFeatureViewRelationshipsResponse unmarshall(ListFeatureViewRelationshipsResponse listFeatureViewRelationshipsResponse, UnmarshallerContext _ctx) {
		
		listFeatureViewRelationshipsResponse.setRequestId(_ctx.stringValue("ListFeatureViewRelationshipsResponse.RequestId"));

		List<RelationshipsItem> relationships = new ArrayList<RelationshipsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFeatureViewRelationshipsResponse.Relationships.Length"); i++) {
			RelationshipsItem relationshipsItem = new RelationshipsItem();
			relationshipsItem.setFeatureViewName(_ctx.stringValue("ListFeatureViewRelationshipsResponse.Relationships["+ i +"].FeatureViewName"));
			relationshipsItem.setProjectName(_ctx.stringValue("ListFeatureViewRelationshipsResponse.Relationships["+ i +"].ProjectName"));

			List<ModelsItem> models = new ArrayList<ModelsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListFeatureViewRelationshipsResponse.Relationships["+ i +"].Models.Length"); j++) {
				ModelsItem modelsItem = new ModelsItem();
				modelsItem.setModelId(_ctx.stringValue("ListFeatureViewRelationshipsResponse.Relationships["+ i +"].Models["+ j +"].ModelId"));
				modelsItem.setModelName(_ctx.stringValue("ListFeatureViewRelationshipsResponse.Relationships["+ i +"].Models["+ j +"].ModelName"));

				models.add(modelsItem);
			}
			relationshipsItem.setModels(models);

			relationships.add(relationshipsItem);
		}
		listFeatureViewRelationshipsResponse.setRelationships(relationships);
	 
	 	return listFeatureViewRelationshipsResponse;
	}
}