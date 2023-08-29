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

import com.aliyuncs.paifeaturestore.model.v20230621.ListModelFeaturesResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListModelFeaturesResponse.ModelFeaturesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModelFeaturesResponseUnmarshaller {

	public static ListModelFeaturesResponse unmarshall(ListModelFeaturesResponse listModelFeaturesResponse, UnmarshallerContext _ctx) {
		
		listModelFeaturesResponse.setRequestId(_ctx.stringValue("ListModelFeaturesResponse.RequestId"));
		listModelFeaturesResponse.setTotalCount(_ctx.longValue("ListModelFeaturesResponse.TotalCount"));

		List<ModelFeaturesItem> modelFeatures = new ArrayList<ModelFeaturesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListModelFeaturesResponse.ModelFeatures.Length"); i++) {
			ModelFeaturesItem modelFeaturesItem = new ModelFeaturesItem();
			modelFeaturesItem.setModelFeatureId(_ctx.stringValue("ListModelFeaturesResponse.ModelFeatures["+ i +"].ModelFeatureId"));
			modelFeaturesItem.setProjectId(_ctx.stringValue("ListModelFeaturesResponse.ModelFeatures["+ i +"].ProjectId"));
			modelFeaturesItem.setProjectName(_ctx.stringValue("ListModelFeaturesResponse.ModelFeatures["+ i +"].ProjectName"));
			modelFeaturesItem.setName(_ctx.stringValue("ListModelFeaturesResponse.ModelFeatures["+ i +"].Name"));
			modelFeaturesItem.setOwner(_ctx.stringValue("ListModelFeaturesResponse.ModelFeatures["+ i +"].Owner"));
			modelFeaturesItem.setGmtCreateTime(_ctx.stringValue("ListModelFeaturesResponse.ModelFeatures["+ i +"].GmtCreateTime"));
			modelFeaturesItem.setGmtModifiedTime(_ctx.stringValue("ListModelFeaturesResponse.ModelFeatures["+ i +"].GmtModifiedTime"));
			modelFeaturesItem.setLabelTableName(_ctx.stringValue("ListModelFeaturesResponse.ModelFeatures["+ i +"].LabelTableName"));

			modelFeatures.add(modelFeaturesItem);
		}
		listModelFeaturesResponse.setModelFeatures(modelFeatures);
	 
	 	return listModelFeaturesResponse;
	}
}