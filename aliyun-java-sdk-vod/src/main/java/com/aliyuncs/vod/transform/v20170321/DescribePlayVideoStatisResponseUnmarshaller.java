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

import com.aliyuncs.vod.model.v20170321.DescribePlayVideoStatisResponse;
import com.aliyuncs.vod.model.v20170321.DescribePlayVideoStatisResponse.VideoPlayStatisDetail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlayVideoStatisResponseUnmarshaller {

	public static DescribePlayVideoStatisResponse unmarshall(DescribePlayVideoStatisResponse describePlayVideoStatisResponse, UnmarshallerContext context) {
		
		describePlayVideoStatisResponse.setRequestId(context.stringValue("DescribePlayVideoStatisResponse.RequestId"));

		List<VideoPlayStatisDetail> videoPlayStatisDetails = new ArrayList<VideoPlayStatisDetail>();
		for (int i = 0; i < context.lengthValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails.Length"); i++) {
			VideoPlayStatisDetail videoPlayStatisDetail = new VideoPlayStatisDetail();
			videoPlayStatisDetail.setDate(context.stringValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails["+ i +"].Date"));
			videoPlayStatisDetail.setPlayDuration(context.stringValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails["+ i +"].PlayDuration"));
			videoPlayStatisDetail.setVV(context.stringValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails["+ i +"].VV"));
			videoPlayStatisDetail.setUV(context.stringValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails["+ i +"].UV"));
			videoPlayStatisDetail.setPlayRange(context.stringValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails["+ i +"].PlayRange"));
			videoPlayStatisDetail.setTitle(context.stringValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails["+ i +"].Title"));

			videoPlayStatisDetails.add(videoPlayStatisDetail);
		}
		describePlayVideoStatisResponse.setVideoPlayStatisDetails(videoPlayStatisDetails);
	 
	 	return describePlayVideoStatisResponse;
	}
}