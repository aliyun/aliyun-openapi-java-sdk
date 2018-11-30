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

import com.aliyuncs.vod.model.v20170321.DescribePlayTopVideosResponse;
import com.aliyuncs.vod.model.v20170321.DescribePlayTopVideosResponse.TopPlayVideoStatis;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlayTopVideosResponseUnmarshaller {

	public static DescribePlayTopVideosResponse unmarshall(DescribePlayTopVideosResponse describePlayTopVideosResponse, UnmarshallerContext context) {
		
		describePlayTopVideosResponse.setRequestId(context.stringValue("DescribePlayTopVideosResponse.RequestId"));
		describePlayTopVideosResponse.setPageNo(context.longValue("DescribePlayTopVideosResponse.PageNo"));
		describePlayTopVideosResponse.setPageSize(context.longValue("DescribePlayTopVideosResponse.PageSize"));
		describePlayTopVideosResponse.setTotalNum(context.longValue("DescribePlayTopVideosResponse.TotalNum"));

		List<TopPlayVideoStatis> topPlayVideos = new ArrayList<TopPlayVideoStatis>();
		for (int i = 0; i < context.lengthValue("DescribePlayTopVideosResponse.TopPlayVideos.Length"); i++) {
			TopPlayVideoStatis topPlayVideoStatis = new TopPlayVideoStatis();
			topPlayVideoStatis.setPlayDuration(context.stringValue("DescribePlayTopVideosResponse.TopPlayVideos["+ i +"].PlayDuration"));
			topPlayVideoStatis.setVV(context.stringValue("DescribePlayTopVideosResponse.TopPlayVideos["+ i +"].VV"));
			topPlayVideoStatis.setUV(context.stringValue("DescribePlayTopVideosResponse.TopPlayVideos["+ i +"].UV"));
			topPlayVideoStatis.setVideoId(context.stringValue("DescribePlayTopVideosResponse.TopPlayVideos["+ i +"].VideoId"));
			topPlayVideoStatis.setTitle(context.stringValue("DescribePlayTopVideosResponse.TopPlayVideos["+ i +"].Title"));

			topPlayVideos.add(topPlayVideoStatis);
		}
		describePlayTopVideosResponse.setTopPlayVideos(topPlayVideos);
	 
	 	return describePlayTopVideosResponse;
	}
}