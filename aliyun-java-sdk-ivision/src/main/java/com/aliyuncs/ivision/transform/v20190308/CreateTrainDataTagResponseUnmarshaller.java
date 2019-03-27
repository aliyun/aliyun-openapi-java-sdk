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

import com.aliyuncs.ivision.model.v20190308.CreateTrainDataTagResponse;
import com.aliyuncs.ivision.model.v20190308.CreateTrainDataTagResponse.TrainData;
import com.aliyuncs.ivision.model.v20190308.CreateTrainDataTagResponse.TrainData.TagItem;
import com.aliyuncs.ivision.model.v20190308.CreateTrainDataTagResponse.TrainData.TagItem.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTrainDataTagResponseUnmarshaller {

	public static CreateTrainDataTagResponse unmarshall(CreateTrainDataTagResponse createTrainDataTagResponse, UnmarshallerContext context) {
		
		createTrainDataTagResponse.setRequestId(context.stringValue("CreateTrainDataTagResponse.RequestId"));

		TrainData trainData = new TrainData();
		trainData.setProjectId(context.stringValue("CreateTrainDataTagResponse.TrainData.ProjectId"));
		trainData.setIterationId(context.stringValue("CreateTrainDataTagResponse.TrainData.IterationId"));
		trainData.setDataId(context.stringValue("CreateTrainDataTagResponse.TrainData.DataId"));
		trainData.setDataName(context.stringValue("CreateTrainDataTagResponse.TrainData.DataName"));
		trainData.setDataUrl(context.stringValue("CreateTrainDataTagResponse.TrainData.DataUrl"));
		trainData.setCreationTime(context.stringValue("CreateTrainDataTagResponse.TrainData.CreationTime"));
		trainData.setStatus(context.stringValue("CreateTrainDataTagResponse.TrainData.Status"));
		trainData.setTagStatus(context.stringValue("CreateTrainDataTagResponse.TrainData.TagStatus"));

		List<TagItem> tagItems = new ArrayList<TagItem>();
		for (int i = 0; i < context.lengthValue("CreateTrainDataTagResponse.TrainData.TagItems.Length"); i++) {
			TagItem tagItem = new TagItem();
			tagItem.setTagId(context.stringValue("CreateTrainDataTagResponse.TrainData.TagItems["+ i +"].TagId"));
			tagItem.setRegionType(context.stringValue("CreateTrainDataTagResponse.TrainData.TagItems["+ i +"].RegionType"));

			Region region = new Region();
			region.setLeft(context.stringValue("CreateTrainDataTagResponse.TrainData.TagItems["+ i +"].Region.Left"));
			region.setTop(context.stringValue("CreateTrainDataTagResponse.TrainData.TagItems["+ i +"].Region.Top"));
			region.setWidth(context.stringValue("CreateTrainDataTagResponse.TrainData.TagItems["+ i +"].Region.Width"));
			region.setHeight(context.stringValue("CreateTrainDataTagResponse.TrainData.TagItems["+ i +"].Region.Height"));
			tagItem.setRegion(region);

			tagItems.add(tagItem);
		}
		trainData.setTagItems(tagItems);
		createTrainDataTagResponse.setTrainData(trainData);
	 
	 	return createTrainDataTagResponse;
	}
}