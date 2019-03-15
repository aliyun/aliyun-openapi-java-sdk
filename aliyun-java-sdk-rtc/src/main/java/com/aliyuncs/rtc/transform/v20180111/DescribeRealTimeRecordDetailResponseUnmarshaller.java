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

import com.aliyuncs.rtc.model.v20180111.DescribeRealTimeRecordDetailResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRealTimeRecordDetailResponse.RecordDetailInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRealTimeRecordDetailResponseUnmarshaller {

	public static DescribeRealTimeRecordDetailResponse unmarshall(DescribeRealTimeRecordDetailResponse describeRealTimeRecordDetailResponse, UnmarshallerContext context) {
		
		describeRealTimeRecordDetailResponse.setRequestId(context.stringValue("DescribeRealTimeRecordDetailResponse.RequestId"));

		List<RecordDetailInfo> recordDetailInfos = new ArrayList<RecordDetailInfo>();
		for (int i = 0; i < context.lengthValue("DescribeRealTimeRecordDetailResponse.RecordDetailInfos.Length"); i++) {
			RecordDetailInfo recordDetailInfo = new RecordDetailInfo();
			recordDetailInfo.setUid(context.stringValue("DescribeRealTimeRecordDetailResponse.RecordDetailInfos["+ i +"].Uid"));
			recordDetailInfo.setStartTime(context.stringValue("DescribeRealTimeRecordDetailResponse.RecordDetailInfos["+ i +"].StartTime"));
			recordDetailInfo.setDeviceType(context.stringValue("DescribeRealTimeRecordDetailResponse.RecordDetailInfos["+ i +"].DeviceType"));
			recordDetailInfo.setSDKVersion(context.stringValue("DescribeRealTimeRecordDetailResponse.RecordDetailInfos["+ i +"].SDKVersion"));

			recordDetailInfos.add(recordDetailInfo);
		}
		describeRealTimeRecordDetailResponse.setRecordDetailInfos(recordDetailInfos);
	 
	 	return describeRealTimeRecordDetailResponse;
	}
}