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

import com.aliyuncs.vod.model.v20170321.DescribeVodPlayerMetricDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodPlayerMetricDataResponse.Datds;
import com.aliyuncs.vod.model.v20170321.DescribeVodPlayerMetricDataResponse.Extend;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodPlayerMetricDataResponseUnmarshaller {

	public static DescribeVodPlayerMetricDataResponse unmarshall(DescribeVodPlayerMetricDataResponse describeVodPlayerMetricDataResponse, UnmarshallerContext _ctx) {
		
		describeVodPlayerMetricDataResponse.setRequestId(_ctx.stringValue("DescribeVodPlayerMetricDataResponse.RequestId"));
		describeVodPlayerMetricDataResponse.setPageNumber(_ctx.longValue("DescribeVodPlayerMetricDataResponse.PageNumber"));
		describeVodPlayerMetricDataResponse.setPageSize(_ctx.longValue("DescribeVodPlayerMetricDataResponse.PageSize"));
		describeVodPlayerMetricDataResponse.setTotalCnt(_ctx.longValue("DescribeVodPlayerMetricDataResponse.TotalCnt"));

		Extend extend = new Extend();
		extend.setActualStartTime(_ctx.stringValue("DescribeVodPlayerMetricDataResponse.Extend.ActualStartTime"));
		extend.setActualEndTime(_ctx.stringValue("DescribeVodPlayerMetricDataResponse.Extend.ActualEndTime"));
		extend.setIntervalSeconds(_ctx.longValue("DescribeVodPlayerMetricDataResponse.Extend.IntervalSeconds"));
		describeVodPlayerMetricDataResponse.setExtend(extend);

		List<Datds> dataList = new ArrayList<Datds>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodPlayerMetricDataResponse.DataList.Length"); i++) {
			Datds datds = new Datds();
			datds.setTimeStamp(_ctx.stringValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].TimeStamp"));
			datds.setDimension(_ctx.stringValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].Dimension"));
			datds.setUv(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].Uv"));
			datds.setVv(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].Vv"));
			datds.setRealVv(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].RealVv"));
			datds.setFirstFrame(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].FirstFrame"));
			datds.setSecondPlayRate(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].SecondPlayRate"));
			datds.setSlowPlayRate(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].SlowPlayRate"));
			datds.setStuckCountRate(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].StuckCountRate"));
			datds.setSeekDuration(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].SeekDuration"));
			datds.setStuckDuration100s(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].StuckDuration100s"));
			datds.setPlayFailRate(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].PlayFailRate"));
			datds.setSeedFailRate(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].SeedFailRate"));
			datds.setAvgPlayBitrate(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].AvgPlayBitrate"));
			datds.setAvgStartBitrate(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].AvgStartBitrate"));
			datds.setErrorCount100s(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].ErrorCount100s"));
			datds.setAvgPerVv(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].AvgPerVv"));
			datds.setAvgVideoDuration(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].AvgVideoDuration"));
			datds.setAvgPerPlayDuration(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].AvgPerPlayDuration"));
			datds.setAvgPerCompletionVv(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].AvgPerCompletionVv"));
			datds.setCompletionVv(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].CompletionVv"));
			datds.setCompletionRate(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].CompletionRate"));
			datds.setAvgPlayDuration(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].AvgPlayDuration"));
			datds.setJumpRate5s(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].JumpRate5s"));
			datds.setTotalPlayDuration(_ctx.doubleValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].TotalPlayDuration"));
			datds.setStuckCount100s(_ctx.stringValue("DescribeVodPlayerMetricDataResponse.DataList["+ i +"].StuckCount100s"));

			dataList.add(datds);
		}
		describeVodPlayerMetricDataResponse.setDataList(dataList);
	 
	 	return describeVodPlayerMetricDataResponse;
	}
}