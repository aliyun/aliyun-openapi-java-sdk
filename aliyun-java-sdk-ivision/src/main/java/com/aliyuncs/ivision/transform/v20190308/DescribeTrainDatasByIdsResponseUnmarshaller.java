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

import com.aliyuncs.ivision.model.v20190308.DescribeTrainDatasByIdsResponse;
import com.aliyuncs.ivision.model.v20190308.DescribeTrainDatasByIdsResponse.TrainData;
import com.aliyuncs.ivision.model.v20190308.DescribeTrainDatasByIdsResponse.TrainData.TagItem;
import com.aliyuncs.ivision.model.v20190308.DescribeTrainDatasByIdsResponse.TrainData.TagItem.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTrainDatasByIdsResponseUnmarshaller {

	public static DescribeTrainDatasByIdsResponse unmarshall(DescribeTrainDatasByIdsResponse describeTrainDatasByIdsResponse, UnmarshallerContext context) {
		
		describeTrainDatasByIdsResponse.setRequestId(context.stringValue("DescribeTrainDatasByIdsResponse.RequestId"));

		List<TrainData> trainDatas = new ArrayList<TrainData>();
		for (int i = 0; i < context.lengthValue("DescribeTrainDatasByIdsResponse.TrainDatas.Length"); i++) {
			TrainData trainData = new TrainData();
			trainData.setProjectId(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].ProjectId"));
			trainData.setIterationId(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].IterationId"));
			trainData.setDataId(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].DataId"));
			trainData.setDataName(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].DataName"));
			trainData.setDataUrl(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].DataUrl"));
			trainData.setCreationTime(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].CreationTime"));
			trainData.setStatus(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].Status"));
			trainData.setTagStatus(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].TagStatus"));

			List<TagItem> tagItems = new ArrayList<TagItem>();
			for (int j = 0; j < context.lengthValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].TagItems.Length"); j++) {
				TagItem tagItem = new TagItem();
				tagItem.setTagId(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].TagItems["+ j +"].TagId"));
				tagItem.setRegionType(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].TagItems["+ j +"].RegionType"));

				Region region = new Region();
				region.setLeft(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].TagItems["+ j +"].Region.Left"));
				region.setTop(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].TagItems["+ j +"].Region.Top"));
				region.setWidth(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].TagItems["+ j +"].Region.Width"));
				region.setHeight(context.stringValue("DescribeTrainDatasByIdsResponse.TrainDatas["+ i +"].TagItems["+ j +"].Region.Height"));
				tagItem.setRegion(region);

				tagItems.add(tagItem);
			}
			trainData.setTagItems(tagItems);

			trainDatas.add(trainData);
		}
		describeTrainDatasByIdsResponse.setTrainDatas(trainDatas);
	 
	 	return describeTrainDatasByIdsResponse;
	}
}