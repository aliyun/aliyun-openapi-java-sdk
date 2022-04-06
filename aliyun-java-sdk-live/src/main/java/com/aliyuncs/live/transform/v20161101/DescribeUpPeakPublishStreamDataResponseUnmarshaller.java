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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeUpPeakPublishStreamDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUpPeakPublishStreamDataResponseUnmarshaller {

	public static DescribeUpPeakPublishStreamDataResponse unmarshall(DescribeUpPeakPublishStreamDataResponse describeUpPeakPublishStreamDataResponse, UnmarshallerContext _ctx) {
		
		describeUpPeakPublishStreamDataResponse.setRequestId(_ctx.stringValue("DescribeUpPeakPublishStreamDataResponse.RequestId"));

		List<DescribeUpPeakPublishStreamData> describeUpPeakPublishStreamDatas = new ArrayList<DescribeUpPeakPublishStreamData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamDatas.Length"); i++) {
			DescribeUpPeakPublishStreamData describeUpPeakPublishStreamData = new DescribeUpPeakPublishStreamData();
			describeUpPeakPublishStreamData.setQueryTime(_ctx.stringValue("DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamDatas["+ i +"].QueryTime"));
			describeUpPeakPublishStreamData.setBandWidth(_ctx.stringValue("DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamDatas["+ i +"].BandWidth"));
			describeUpPeakPublishStreamData.setStatName(_ctx.stringValue("DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamDatas["+ i +"].StatName"));
			describeUpPeakPublishStreamData.setPeakTime(_ctx.stringValue("DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamDatas["+ i +"].PeakTime"));
			describeUpPeakPublishStreamData.setPublishStreamNum(_ctx.integerValue("DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamDatas["+ i +"].PublishStreamNum"));

			describeUpPeakPublishStreamDatas.add(describeUpPeakPublishStreamData);
		}
		describeUpPeakPublishStreamDataResponse.setDescribeUpPeakPublishStreamDatas(describeUpPeakPublishStreamDatas);
	 
	 	return describeUpPeakPublishStreamDataResponse;
	}
}