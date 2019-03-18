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

package com.aliyuncs.ccs.transform.v20171001;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccs.model.v20171001.QueryHotlineRecordResponse;
import com.aliyuncs.ccs.model.v20171001.QueryHotlineRecordResponse.HotlineRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryHotlineRecordResponseUnmarshaller {

	public static QueryHotlineRecordResponse unmarshall(QueryHotlineRecordResponse queryHotlineRecordResponse, UnmarshallerContext context) {
		
		queryHotlineRecordResponse.setRequestId(context.stringValue("QueryHotlineRecordResponse.RequestId"));
		queryHotlineRecordResponse.setTotalCount(context.longValue("QueryHotlineRecordResponse.TotalCount"));
		queryHotlineRecordResponse.setPageNum(context.integerValue("QueryHotlineRecordResponse.PageNum"));
		queryHotlineRecordResponse.setPageSize(context.integerValue("QueryHotlineRecordResponse.PageSize"));

		List<HotlineRecord> records = new ArrayList<HotlineRecord>();
		for (int i = 0; i < context.lengthValue("QueryHotlineRecordResponse.Records.Length"); i++) {
			HotlineRecord hotlineRecord = new HotlineRecord();
			hotlineRecord.setId(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].Id"));
			hotlineRecord.setVisitorId(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].VisitorId"));
			hotlineRecord.setVisitorPhone(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].VisitorPhone"));
			hotlineRecord.setVisitorProvince(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].VisitorProvince"));
			hotlineRecord.setCallType(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].CallType"));
			hotlineRecord.setAgentId(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].AgentId"));
			hotlineRecord.setAgentName(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].AgentName"));
			hotlineRecord.setGroupId(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].GroupId"));
			hotlineRecord.setGroupName(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].GroupName"));
			hotlineRecord.setCreateTime(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].CreateTime"));
			hotlineRecord.setFinishTime(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].FinishTime"));
			hotlineRecord.setStatus(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].Status"));
			hotlineRecord.setMemo(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].Memo"));
			hotlineRecord.setHangupType(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].HangupType"));
			hotlineRecord.setSatisfaction(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].Satisfaction"));
			hotlineRecord.setOutboundTaskId(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].OutboundTaskId"));
			hotlineRecord.setCategories(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].Categories"));
			hotlineRecord.setCcsInstanceId(context.stringValue("QueryHotlineRecordResponse.Records["+ i +"].CcsInstanceId"));
			hotlineRecord.setTalkDuration(context.longValue("QueryHotlineRecordResponse.Records["+ i +"].TalkDuration"));

			records.add(hotlineRecord);
		}
		queryHotlineRecordResponse.setRecords(records);
	 
	 	return queryHotlineRecordResponse;
	}
}