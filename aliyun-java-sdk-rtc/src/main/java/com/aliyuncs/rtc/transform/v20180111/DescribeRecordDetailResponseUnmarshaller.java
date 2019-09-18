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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeRecordDetailResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRecordDetailResponse.Duration;
import com.aliyuncs.rtc.model.v20180111.DescribeRecordDetailResponse.RecordDetailInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordDetailResponseUnmarshaller {

	public static DescribeRecordDetailResponse unmarshall(DescribeRecordDetailResponse describeRecordDetailResponse, UnmarshallerContext _ctx) {
		
		describeRecordDetailResponse.setRequestId(_ctx.stringValue("DescribeRecordDetailResponse.RequestId"));

		Duration duration = new Duration();
		duration.setAudio(_ctx.floatValue("DescribeRecordDetailResponse.Duration.Audio"));
		duration.setSd(_ctx.floatValue("DescribeRecordDetailResponse.Duration.Sd"));
		duration.setHd(_ctx.floatValue("DescribeRecordDetailResponse.Duration.Hd"));
		duration.setFhd(_ctx.floatValue("DescribeRecordDetailResponse.Duration.Fhd"));
		duration.setAll(_ctx.floatValue("DescribeRecordDetailResponse.Duration.All"));
		describeRecordDetailResponse.setDuration(duration);

		List<RecordDetailInfo> recordDetailInfos = new ArrayList<RecordDetailInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordDetailResponse.RecordDetailInfos.Length"); i++) {
			RecordDetailInfo recordDetailInfo = new RecordDetailInfo();
			recordDetailInfo.setUid(_ctx.stringValue("DescribeRecordDetailResponse.RecordDetailInfos["+ i +"].Uid"));
			recordDetailInfo.setStartTime(_ctx.stringValue("DescribeRecordDetailResponse.RecordDetailInfos["+ i +"].StartTime"));
			recordDetailInfo.setEndTime(_ctx.stringValue("DescribeRecordDetailResponse.RecordDetailInfos["+ i +"].EndTime"));
			recordDetailInfo.setDeviceType(_ctx.stringValue("DescribeRecordDetailResponse.RecordDetailInfos["+ i +"].DeviceType"));
			recordDetailInfo.setSDKVersion(_ctx.stringValue("DescribeRecordDetailResponse.RecordDetailInfos["+ i +"].SDKVersion"));

			recordDetailInfos.add(recordDetailInfo);
		}
		describeRecordDetailResponse.setRecordDetailInfos(recordDetailInfos);
	 
	 	return describeRecordDetailResponse;
	}
}