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

import com.aliyuncs.rtc.model.v20180111.DescribeRealTimeRecordListResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRealTimeRecordListResponse.CommunicationRecordInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRealTimeRecordListResponseUnmarshaller {

	public static DescribeRealTimeRecordListResponse unmarshall(DescribeRealTimeRecordListResponse describeRealTimeRecordListResponse, UnmarshallerContext _ctx) {
		
		describeRealTimeRecordListResponse.setRequestId(_ctx.stringValue("DescribeRealTimeRecordListResponse.RequestId"));

		List<CommunicationRecordInfo> communicationRecordInfos = new ArrayList<CommunicationRecordInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRealTimeRecordListResponse.CommunicationRecordInfos.Length"); i++) {
			CommunicationRecordInfo communicationRecordInfo = new CommunicationRecordInfo();
			communicationRecordInfo.setChannelId(_ctx.stringValue("DescribeRealTimeRecordListResponse.CommunicationRecordInfos["+ i +"].ChannelId"));
			communicationRecordInfo.setStartTime(_ctx.stringValue("DescribeRealTimeRecordListResponse.CommunicationRecordInfos["+ i +"].StartTime"));
			communicationRecordInfo.setEndTime(_ctx.stringValue("DescribeRealTimeRecordListResponse.CommunicationRecordInfos["+ i +"].EndTime"));
			communicationRecordInfo.setOnlineUserCnt(_ctx.longValue("DescribeRealTimeRecordListResponse.CommunicationRecordInfos["+ i +"].OnlineUserCnt"));
			communicationRecordInfo.setStatus(_ctx.booleanValue("DescribeRealTimeRecordListResponse.CommunicationRecordInfos["+ i +"].Status"));
			communicationRecordInfo.setRecordId(_ctx.stringValue("DescribeRealTimeRecordListResponse.CommunicationRecordInfos["+ i +"].RecordId"));

			List<String> callAreas = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRealTimeRecordListResponse.CommunicationRecordInfos["+ i +"].CallAreas.Length"); j++) {
				callAreas.add(_ctx.stringValue("DescribeRealTimeRecordListResponse.CommunicationRecordInfos["+ i +"].CallAreas["+ j +"]"));
			}
			communicationRecordInfo.setCallAreas(callAreas);

			communicationRecordInfos.add(communicationRecordInfo);
		}
		describeRealTimeRecordListResponse.setCommunicationRecordInfos(communicationRecordInfos);
	 
	 	return describeRealTimeRecordListResponse;
	}
}