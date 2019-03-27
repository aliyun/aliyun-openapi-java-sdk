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

import com.aliyuncs.ivision.model.v20190308.CreateTrainDataRegionTagResponse;
import com.aliyuncs.ivision.model.v20190308.CreateTrainDataRegionTagResponse.TrainData;
import com.aliyuncs.ivision.model.v20190308.CreateTrainDataRegionTagResponse.TrainData.TagItem;
import com.aliyuncs.ivision.model.v20190308.CreateTrainDataRegionTagResponse.TrainData.TagItem.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTrainDataRegionTagResponseUnmarshaller {

	public static CreateTrainDataRegionTagResponse unmarshall(CreateTrainDataRegionTagResponse createTrainDataRegionTagResponse, UnmarshallerContext context) {
		
		createTrainDataRegionTagResponse.setRequestId(context.stringValue("CreateTrainDataRegionTagResponse.RequestId"));

		TrainData trainData = new TrainData();
		trainData.setProjectId(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.ProjectId"));
		trainData.setIterationId(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.IterationId"));
		trainData.setDataId(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.DataId"));
		trainData.setDataName(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.DataName"));
		trainData.setDataUrl(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.DataUrl"));
		trainData.setCreationTime(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.CreationTime"));
		trainData.setStatus(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.Status"));
		trainData.setTagStatus(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.TagStatus"));

		List<TagItem> tagItems = new ArrayList<TagItem>();
		for (int i = 0; i < context.lengthValue("CreateTrainDataRegionTagResponse.TrainData.TagItems.Length"); i++) {
			TagItem tagItem = new TagItem();
			tagItem.setTagId(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.TagItems["+ i +"].TagId"));
			tagItem.setRegionType(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.TagItems["+ i +"].RegionType"));

			Region region = new Region();
			region.setLeft(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.TagItems["+ i +"].Region.Left"));
			region.setTop(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.TagItems["+ i +"].Region.Top"));
			region.setWidth(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.TagItems["+ i +"].Region.Width"));
			region.setHeight(context.stringValue("CreateTrainDataRegionTagResponse.TrainData.TagItems["+ i +"].Region.Height"));
			tagItem.setRegion(region);

			tagItems.add(tagItem);
		}
		trainData.setTagItems(tagItems);
		createTrainDataRegionTagResponse.setTrainData(trainData);
	 
	 	return createTrainDataRegionTagResponse;
	}
}