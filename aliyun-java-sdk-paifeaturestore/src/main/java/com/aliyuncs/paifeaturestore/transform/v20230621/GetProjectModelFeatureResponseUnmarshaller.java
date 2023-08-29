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

import com.aliyuncs.paifeaturestore.model.v20230621.GetProjectModelFeatureResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.GetProjectModelFeatureResponse.FeaturesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectModelFeatureResponseUnmarshaller {

	public static GetProjectModelFeatureResponse unmarshall(GetProjectModelFeatureResponse getProjectModelFeatureResponse, UnmarshallerContext _ctx) {
		
		getProjectModelFeatureResponse.setRequestId(_ctx.stringValue("GetProjectModelFeatureResponse.RequestId"));
		getProjectModelFeatureResponse.setModelFeatureId(_ctx.stringValue("GetProjectModelFeatureResponse.ModelFeatureId"));
		getProjectModelFeatureResponse.setProjectId(_ctx.stringValue("GetProjectModelFeatureResponse.ProjectId"));
		getProjectModelFeatureResponse.setProjectName(_ctx.stringValue("GetProjectModelFeatureResponse.ProjectName"));
		getProjectModelFeatureResponse.setName(_ctx.stringValue("GetProjectModelFeatureResponse.Name"));
		getProjectModelFeatureResponse.setOwner(_ctx.stringValue("GetProjectModelFeatureResponse.Owner"));
		getProjectModelFeatureResponse.setLabelTableId(_ctx.stringValue("GetProjectModelFeatureResponse.LabelTableId"));
		getProjectModelFeatureResponse.setLabelDatasourceId(_ctx.stringValue("GetProjectModelFeatureResponse.LabelDatasourceId"));
		getProjectModelFeatureResponse.setLabelDatasourceTable(_ctx.stringValue("GetProjectModelFeatureResponse.LabelDatasourceTable"));
		getProjectModelFeatureResponse.setLabelEventTime(_ctx.stringValue("GetProjectModelFeatureResponse.LabelEventTime"));
		getProjectModelFeatureResponse.setTrainingSetTable(_ctx.stringValue("GetProjectModelFeatureResponse.TrainingSetTable"));
		getProjectModelFeatureResponse.setTrainingSetFGTable(_ctx.stringValue("GetProjectModelFeatureResponse.TrainingSetFGTable"));
		getProjectModelFeatureResponse.setGmtCreateTime(_ctx.stringValue("GetProjectModelFeatureResponse.GmtCreateTime"));
		getProjectModelFeatureResponse.setGmtModifiedTime(_ctx.stringValue("GetProjectModelFeatureResponse.GmtModifiedTime"));

		List<FeaturesItem> features = new ArrayList<FeaturesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectModelFeatureResponse.Features.Length"); i++) {
			FeaturesItem featuresItem = new FeaturesItem();
			featuresItem.setFeatureViewId(_ctx.stringValue("GetProjectModelFeatureResponse.Features["+ i +"].FeatureViewId"));
			featuresItem.setFeatureViewName(_ctx.stringValue("GetProjectModelFeatureResponse.Features["+ i +"].FeatureViewName"));
			featuresItem.setName(_ctx.stringValue("GetProjectModelFeatureResponse.Features["+ i +"].Name"));
			featuresItem.setType(_ctx.stringValue("GetProjectModelFeatureResponse.Features["+ i +"].Type"));
			featuresItem.setAliasName(_ctx.stringValue("GetProjectModelFeatureResponse.Features["+ i +"].AliasName"));

			features.add(featuresItem);
		}
		getProjectModelFeatureResponse.setFeatures(features);
	 
	 	return getProjectModelFeatureResponse;
	}
}