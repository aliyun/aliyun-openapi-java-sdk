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

import com.aliyuncs.rtc.model.v20180111.DescribeRecordListResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRecordListResponse.CommunicationRecordInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordListResponseUnmarshaller {

	public static DescribeRecordListResponse unmarshall(DescribeRecordListResponse describeRecordListResponse, UnmarshallerContext context) {
		
		describeRecordListResponse.setRequestId(context.stringValue("DescribeRecordListResponse.RequestId"));
		describeRecordListResponse.setPageSize(context.longValue("DescribeRecordListResponse.PageSize"));
		describeRecordListResponse.setPageNo(context.longValue("DescribeRecordListResponse.PageNo"));
		describeRecordListResponse.setTotalCnt(context.longValue("DescribeRecordListResponse.TotalCnt"));

		List<CommunicationRecordInfo> communicationRecordInfos = new ArrayList<CommunicationRecordInfo>();
		for (int i = 0; i < context.lengthValue("DescribeRecordListResponse.CommunicationRecordInfos.Length"); i++) {
			CommunicationRecordInfo communicationRecordInfo = new CommunicationRecordInfo();
			communicationRecordInfo.setChannelId(context.stringValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].ChannelId"));
			communicationRecordInfo.setStartTime(context.stringValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].StartTime"));
			communicationRecordInfo.setEndTime(context.stringValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].EndTime"));
			communicationRecordInfo.setTotalUserCnt(context.longValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].TotalUserCnt"));
			communicationRecordInfo.setStatus(context.booleanValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].Status"));
			communicationRecordInfo.setRecordId(context.stringValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].RecordId"));

			List<String> callAreas = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].CallAreas.Length"); j++) {
				callAreas.add(context.stringValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].CallAreas["+ j +"]"));
			}
			communicationRecordInfo.setCallAreas(callAreas);

			communicationRecordInfos.add(communicationRecordInfo);
		}
		describeRecordListResponse.setCommunicationRecordInfos(communicationRecordInfos);
	 
	 	return describeRecordListResponse;
	}
}