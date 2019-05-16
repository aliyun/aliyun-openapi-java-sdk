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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodAIDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodAIDataResponse.AIDataItem;
import com.aliyuncs.vod.model.v20170321.DescribeVodAIDataResponse.AIDataItem.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodAIDataResponseUnmarshaller {

	public static DescribeVodAIDataResponse unmarshall(DescribeVodAIDataResponse describeVodAIDataResponse, UnmarshallerContext context) {
		
		describeVodAIDataResponse.setRequestId(context.stringValue("DescribeVodAIDataResponse.RequestId"));
		describeVodAIDataResponse.setDataInterval(context.stringValue("DescribeVodAIDataResponse.DataInterval"));

		List<AIDataItem> aIData = new ArrayList<AIDataItem>();
		for (int i = 0; i < context.lengthValue("DescribeVodAIDataResponse.AIData.Length"); i++) {
			AIDataItem aIDataItem = new AIDataItem();
			aIDataItem.setTimeStamp(context.stringValue("DescribeVodAIDataResponse.AIData["+ i +"].TimeStamp"));

			List<DataItem> data = new ArrayList<DataItem>();
			for (int j = 0; j < context.lengthValue("DescribeVodAIDataResponse.AIData["+ i +"].Data.Length"); j++) {
				DataItem dataItem = new DataItem();
				dataItem.setName(context.stringValue("DescribeVodAIDataResponse.AIData["+ i +"].Data["+ j +"].Name"));
				dataItem.setValue(context.stringValue("DescribeVodAIDataResponse.AIData["+ i +"].Data["+ j +"].Value"));

				data.add(dataItem);
			}
			aIDataItem.setData(data);

			aIData.add(aIDataItem);
		}
		describeVodAIDataResponse.setAIData(aIData);
	 
	 	return describeVodAIDataResponse;
	}
}