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

package com.aliyuncs.ivision.transform.v20190308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivision.model.v20190308.CreateTrainDatasTagResponse;
import com.aliyuncs.ivision.model.v20190308.CreateTrainDatasTagResponse.TrainData;
import com.aliyuncs.ivision.model.v20190308.CreateTrainDatasTagResponse.TrainData.TagItem;
import com.aliyuncs.ivision.model.v20190308.CreateTrainDatasTagResponse.TrainData.TagItem.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTrainDatasTagResponseUnmarshaller {

	public static CreateTrainDatasTagResponse unmarshall(CreateTrainDatasTagResponse createTrainDatasTagResponse, UnmarshallerContext context) {
		
		createTrainDatasTagResponse.setRequestId(context.stringValue("CreateTrainDatasTagResponse.RequestId"));

		TrainData trainData = new TrainData();
		trainData.setProjectId(context.stringValue("CreateTrainDatasTagResponse.TrainData.ProjectId"));
		trainData.setIterationId(context.stringValue("CreateTrainDatasTagResponse.TrainData.IterationId"));
		trainData.setDataId(context.stringValue("CreateTrainDatasTagResponse.TrainData.DataId"));
		trainData.setDataName(context.stringValue("CreateTrainDatasTagResponse.TrainData.DataName"));
		trainData.setDataUrl(context.stringValue("CreateTrainDatasTagResponse.TrainData.DataUrl"));
		trainData.setCreationTime(context.stringValue("CreateTrainDatasTagResponse.TrainData.CreationTime"));
		trainData.setStatus(context.stringValue("CreateTrainDatasTagResponse.TrainData.Status"));
		trainData.setTagStatus(context.stringValue("CreateTrainDatasTagResponse.TrainData.TagStatus"));

		List<TagItem> tagItems = new ArrayList<TagItem>();
		for (int i = 0; i < context.lengthValue("CreateTrainDatasTagResponse.TrainData.TagItems.Length"); i++) {
			TagItem tagItem = new TagItem();
			tagItem.setTagId(context.stringValue("CreateTrainDatasTagResponse.TrainData.TagItems["+ i +"].TagId"));
			tagItem.setRegionType(context.stringValue("CreateTrainDatasTagResponse.TrainData.TagItems["+ i +"].RegionType"));

			Region region = new Region();
			region.setLeft(context.stringValue("CreateTrainDatasTagResponse.TrainData.TagItems["+ i +"].Region.Left"));
			region.setTop(context.stringValue("CreateTrainDatasTagResponse.TrainData.TagItems["+ i +"].Region.Top"));
			region.setWidth(context.stringValue("CreateTrainDatasTagResponse.TrainData.TagItems["+ i +"].Region.Width"));
			region.setHeight(context.stringValue("CreateTrainDatasTagResponse.TrainData.TagItems["+ i +"].Region.Height"));
			tagItem.setRegion(region);

			tagItems.add(tagItem);
		}
		trainData.setTagItems(tagItems);
		createTrainDatasTagResponse.setTrainData(trainData);
	 
	 	return createTrainDatasTagResponse;
	}
}