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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsUpPeakPublishStreamDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsUpPeakPublishStreamDataResponse.DescribeVsUpPeakPublishStreamData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsUpPeakPublishStreamDataResponseUnmarshaller {

	public static DescribeVsUpPeakPublishStreamDataResponse unmarshall(DescribeVsUpPeakPublishStreamDataResponse describeVsUpPeakPublishStreamDataResponse, UnmarshallerContext _ctx) {
		
		describeVsUpPeakPublishStreamDataResponse.setRequestId(_ctx.stringValue("DescribeVsUpPeakPublishStreamDataResponse.RequestId"));

		List<DescribeVsUpPeakPublishStreamData> describeVsUpPeakPublishStreamDatas = new ArrayList<DescribeVsUpPeakPublishStreamData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsUpPeakPublishStreamDataResponse.DescribeVsUpPeakPublishStreamDatas.Length"); i++) {
			DescribeVsUpPeakPublishStreamData describeVsUpPeakPublishStreamData = new DescribeVsUpPeakPublishStreamData();
			describeVsUpPeakPublishStreamData.setPublishStreamNum(_ctx.integerValue("DescribeVsUpPeakPublishStreamDataResponse.DescribeVsUpPeakPublishStreamDatas["+ i +"].PublishStreamNum"));
			describeVsUpPeakPublishStreamData.setPeakTime(_ctx.stringValue("DescribeVsUpPeakPublishStreamDataResponse.DescribeVsUpPeakPublishStreamDatas["+ i +"].PeakTime"));
			describeVsUpPeakPublishStreamData.setQueryTime(_ctx.stringValue("DescribeVsUpPeakPublishStreamDataResponse.DescribeVsUpPeakPublishStreamDatas["+ i +"].QueryTime"));
			describeVsUpPeakPublishStreamData.setStatName(_ctx.stringValue("DescribeVsUpPeakPublishStreamDataResponse.DescribeVsUpPeakPublishStreamDatas["+ i +"].StatName"));
			describeVsUpPeakPublishStreamData.setBandWidth(_ctx.stringValue("DescribeVsUpPeakPublishStreamDataResponse.DescribeVsUpPeakPublishStreamDatas["+ i +"].BandWidth"));

			describeVsUpPeakPublishStreamDatas.add(describeVsUpPeakPublishStreamData);
		}
		describeVsUpPeakPublishStreamDataResponse.setDescribeVsUpPeakPublishStreamDatas(describeVsUpPeakPublishStreamDatas);
	 
	 	return describeVsUpPeakPublishStreamDataResponse;
	}
}