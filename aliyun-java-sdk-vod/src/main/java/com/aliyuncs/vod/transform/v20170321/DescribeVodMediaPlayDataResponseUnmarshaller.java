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

import com.aliyuncs.vod.model.v20170321.DescribeVodMediaPlayDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodMediaPlayDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodMediaPlayDataResponseUnmarshaller {

	public static DescribeVodMediaPlayDataResponse unmarshall(DescribeVodMediaPlayDataResponse describeVodMediaPlayDataResponse, UnmarshallerContext _ctx) {
		
		describeVodMediaPlayDataResponse.setRequestId(_ctx.stringValue("DescribeVodMediaPlayDataResponse.RequestId"));
		describeVodMediaPlayDataResponse.setTotalCount(_ctx.longValue("DescribeVodMediaPlayDataResponse.TotalCount"));
		describeVodMediaPlayDataResponse.setPageNo(_ctx.longValue("DescribeVodMediaPlayDataResponse.PageNo"));
		describeVodMediaPlayDataResponse.setPageSize(_ctx.longValue("DescribeVodMediaPlayDataResponse.PageSize"));

		List<Data> qoeInfoList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodMediaPlayDataResponse.QoeInfoList.Length"); i++) {
			Data data = new Data();
			data.setVideoTitle(_ctx.floatValue("DescribeVodMediaPlayDataResponse.QoeInfoList["+ i +"].VideoTitle"));
			data.setVideoDuration(_ctx.floatValue("DescribeVodMediaPlayDataResponse.QoeInfoList["+ i +"].VideoDuration"));
			data.setMediaId(_ctx.stringValue("DescribeVodMediaPlayDataResponse.QoeInfoList["+ i +"].MediaId"));
			data.setDAU(_ctx.floatValue("DescribeVodMediaPlayDataResponse.QoeInfoList["+ i +"].DAU"));
			data.setPlaySuccessVv(_ctx.floatValue("DescribeVodMediaPlayDataResponse.QoeInfoList["+ i +"].PlaySuccessVv"));
			data.setPlayDurationPerUv(_ctx.floatValue("DescribeVodMediaPlayDataResponse.QoeInfoList["+ i +"].PlayDurationPerUv"));
			data.setPlayDuration(_ctx.floatValue("DescribeVodMediaPlayDataResponse.QoeInfoList["+ i +"].PlayDuration"));
			data.setPlayPerVv(_ctx.floatValue("DescribeVodMediaPlayDataResponse.QoeInfoList["+ i +"].PlayPerVv"));

			qoeInfoList.add(data);
		}
		describeVodMediaPlayDataResponse.setQoeInfoList(qoeInfoList);
	 
	 	return describeVodMediaPlayDataResponse;
	}
}