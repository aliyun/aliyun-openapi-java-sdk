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

	public static DescribeRecordListResponse unmarshall(DescribeRecordListResponse describeRecordListResponse, UnmarshallerContext _ctx) {
		
		describeRecordListResponse.setRequestId(_ctx.stringValue("DescribeRecordListResponse.RequestId"));
		describeRecordListResponse.setPageSize(_ctx.longValue("DescribeRecordListResponse.PageSize"));
		describeRecordListResponse.setPageNo(_ctx.longValue("DescribeRecordListResponse.PageNo"));
		describeRecordListResponse.setTotalCnt(_ctx.longValue("DescribeRecordListResponse.TotalCnt"));

		List<CommunicationRecordInfo> communicationRecordInfos = new ArrayList<CommunicationRecordInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordListResponse.CommunicationRecordInfos.Length"); i++) {
			CommunicationRecordInfo communicationRecordInfo = new CommunicationRecordInfo();
			communicationRecordInfo.setChannelId(_ctx.stringValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].ChannelId"));
			communicationRecordInfo.setStartTime(_ctx.stringValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].StartTime"));
			communicationRecordInfo.setEndTime(_ctx.stringValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].EndTime"));
			communicationRecordInfo.setTotalUserCnt(_ctx.longValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].TotalUserCnt"));
			communicationRecordInfo.setStatus(_ctx.booleanValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].Status"));
			communicationRecordInfo.setRecordId(_ctx.stringValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].RecordId"));

			List<String> callAreas = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].CallAreas.Length"); j++) {
				callAreas.add(_ctx.stringValue("DescribeRecordListResponse.CommunicationRecordInfos["+ i +"].CallAreas["+ j +"]"));
			}
			communicationRecordInfo.setCallAreas(callAreas);

			communicationRecordInfos.add(communicationRecordInfo);
		}
		describeRecordListResponse.setCommunicationRecordInfos(communicationRecordInfos);
	 
	 	return describeRecordListResponse;
	}
}