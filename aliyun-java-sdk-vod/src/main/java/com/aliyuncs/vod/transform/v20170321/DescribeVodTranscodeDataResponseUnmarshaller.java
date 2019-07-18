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

import com.aliyuncs.vod.model.v20170321.DescribeVodTranscodeDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodTranscodeDataResponse.TranscodeDataItem;
import com.aliyuncs.vod.model.v20170321.DescribeVodTranscodeDataResponse.TranscodeDataItem.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodTranscodeDataResponseUnmarshaller {

	public static DescribeVodTranscodeDataResponse unmarshall(DescribeVodTranscodeDataResponse describeVodTranscodeDataResponse, UnmarshallerContext _ctx) {
		
		describeVodTranscodeDataResponse.setRequestId(_ctx.stringValue("DescribeVodTranscodeDataResponse.RequestId"));
		describeVodTranscodeDataResponse.setDataInterval(_ctx.stringValue("DescribeVodTranscodeDataResponse.DataInterval"));

		List<TranscodeDataItem> transcodeData = new ArrayList<TranscodeDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodTranscodeDataResponse.TranscodeData.Length"); i++) {
			TranscodeDataItem transcodeDataItem = new TranscodeDataItem();
			transcodeDataItem.setTimeStamp(_ctx.stringValue("DescribeVodTranscodeDataResponse.TranscodeData["+ i +"].TimeStamp"));

			List<DataItem> data = new ArrayList<DataItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVodTranscodeDataResponse.TranscodeData["+ i +"].Data.Length"); j++) {
				DataItem dataItem = new DataItem();
				dataItem.setName(_ctx.stringValue("DescribeVodTranscodeDataResponse.TranscodeData["+ i +"].Data["+ j +"].Name"));
				dataItem.setValue(_ctx.stringValue("DescribeVodTranscodeDataResponse.TranscodeData["+ i +"].Data["+ j +"].Value"));

				data.add(dataItem);
			}
			transcodeDataItem.setData(data);

			transcodeData.add(transcodeDataItem);
		}
		describeVodTranscodeDataResponse.setTranscodeData(transcodeData);
	 
	 	return describeVodTranscodeDataResponse;
	}
}