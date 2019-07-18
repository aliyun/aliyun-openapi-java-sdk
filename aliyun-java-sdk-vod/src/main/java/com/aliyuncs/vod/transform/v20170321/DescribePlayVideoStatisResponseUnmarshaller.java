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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlayVideoStatisResponseUnmarshaller {

	public static DescribePlayVideoStatisResponse unmarshall(DescribePlayVideoStatisResponse describePlayVideoStatisResponse, UnmarshallerContext _ctx) {
		
		describePlayVideoStatisResponse.setRequestId(_ctx.stringValue("DescribePlayVideoStatisResponse.RequestId"));

		List<VideoPlayStatisDetail> videoPlayStatisDetails = new ArrayList<VideoPlayStatisDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails.Length"); i++) {
			VideoPlayStatisDetail videoPlayStatisDetail = new VideoPlayStatisDetail();
			videoPlayStatisDetail.setDate(_ctx.stringValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails["+ i +"].Date"));
			videoPlayStatisDetail.setPlayDuration(_ctx.stringValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails["+ i +"].PlayDuration"));
			videoPlayStatisDetail.setVV(_ctx.stringValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails["+ i +"].VV"));
			videoPlayStatisDetail.setUV(_ctx.stringValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails["+ i +"].UV"));
			videoPlayStatisDetail.setPlayRange(_ctx.stringValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails["+ i +"].PlayRange"));
			videoPlayStatisDetail.setTitle(_ctx.stringValue("DescribePlayVideoStatisResponse.VideoPlayStatisDetails["+ i +"].Title"));

			videoPlayStatisDetails.add(videoPlayStatisDetail);
		}
		describePlayVideoStatisResponse.setVideoPlayStatisDetails(videoPlayStatisDetails);
	 
	 	return describePlayVideoStatisResponse;
	}
}