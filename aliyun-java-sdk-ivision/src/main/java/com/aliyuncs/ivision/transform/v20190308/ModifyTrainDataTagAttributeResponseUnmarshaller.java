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

import com.aliyuncs.ivision.model.v20190308.ModifyTrainDataTagAttributeResponse;
import com.aliyuncs.ivision.model.v20190308.ModifyTrainDataTagAttributeResponse.TrainData;
import com.aliyuncs.ivision.model.v20190308.ModifyTrainDataTagAttributeResponse.TrainData.TagItem;
import com.aliyuncs.ivision.model.v20190308.ModifyTrainDataTagAttributeResponse.TrainData.TagItem.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyTrainDataTagAttributeResponseUnmarshaller {

	public static ModifyTrainDataTagAttributeResponse unmarshall(ModifyTrainDataTagAttributeResponse modifyTrainDataTagAttributeResponse, UnmarshallerContext context) {
		
		modifyTrainDataTagAttributeResponse.setRequestId(context.stringValue("ModifyTrainDataTagAttributeResponse.RequestId"));

		TrainData trainData = new TrainData();
		trainData.setProjectId(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.ProjectId"));
		trainData.setIterationId(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.IterationId"));
		trainData.setDataId(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.DataId"));
		trainData.setDataName(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.DataName"));
		trainData.setDataUrl(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.DataUrl"));
		trainData.setCreationTime(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.CreationTime"));
		trainData.setStatus(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.Status"));
		trainData.setTagStatus(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.TagStatus"));

		List<TagItem> tagItems = new ArrayList<TagItem>();
		for (int i = 0; i < context.lengthValue("ModifyTrainDataTagAttributeResponse.TrainData.TagItems.Length"); i++) {
			TagItem tagItem = new TagItem();
			tagItem.setTagId(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.TagItems["+ i +"].TagId"));
			tagItem.setRegionType(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.TagItems["+ i +"].RegionType"));

			Region region = new Region();
			region.setLeft(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.TagItems["+ i +"].Region.Left"));
			region.setTop(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.TagItems["+ i +"].Region.Top"));
			region.setWidth(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.TagItems["+ i +"].Region.Width"));
			region.setHeight(context.stringValue("ModifyTrainDataTagAttributeResponse.TrainData.TagItems["+ i +"].Region.Height"));
			tagItem.setRegion(region);

			tagItems.add(tagItem);
		}
		trainData.setTagItems(tagItems);
		modifyTrainDataTagAttributeResponse.setTrainData(trainData);
	 
	 	return modifyTrainDataTagAttributeResponse;
	}
}