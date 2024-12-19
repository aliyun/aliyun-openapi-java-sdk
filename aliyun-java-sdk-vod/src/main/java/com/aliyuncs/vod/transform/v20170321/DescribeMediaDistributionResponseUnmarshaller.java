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

import com.aliyuncs.vod.model.v20170321.DescribeMediaDistributionResponse;
import com.aliyuncs.vod.model.v20170321.DescribeMediaDistributionResponse.MediaDistribution;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMediaDistributionResponseUnmarshaller {

	public static DescribeMediaDistributionResponse unmarshall(DescribeMediaDistributionResponse describeMediaDistributionResponse, UnmarshallerContext _ctx) {
		
		describeMediaDistributionResponse.setRequestId(_ctx.stringValue("DescribeMediaDistributionResponse.RequestId"));
		describeMediaDistributionResponse.setTotal(_ctx.longValue("DescribeMediaDistributionResponse.Total"));

		List<MediaDistribution> mediaDistributionList = new ArrayList<MediaDistribution>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMediaDistributionResponse.MediaDistributionList.Length"); i++) {
			MediaDistribution mediaDistribution = new MediaDistribution();
			mediaDistribution.setStartTime(_ctx.stringValue("DescribeMediaDistributionResponse.MediaDistributionList["+ i +"].StartTime"));
			mediaDistribution.setEndTime(_ctx.stringValue("DescribeMediaDistributionResponse.MediaDistributionList["+ i +"].EndTime"));
			mediaDistribution.setCount(_ctx.longValue("DescribeMediaDistributionResponse.MediaDistributionList["+ i +"].Count"));

			mediaDistributionList.add(mediaDistribution);
		}
		describeMediaDistributionResponse.setMediaDistributionList(mediaDistributionList);
	 
	 	return describeMediaDistributionResponse;
	}
}