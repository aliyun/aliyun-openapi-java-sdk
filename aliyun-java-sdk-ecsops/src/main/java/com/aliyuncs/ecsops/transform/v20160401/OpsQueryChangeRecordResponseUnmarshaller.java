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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryChangeRecordResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryChangeRecordResponse.ChangeRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryChangeRecordResponseUnmarshaller {

	public static OpsQueryChangeRecordResponse unmarshall(OpsQueryChangeRecordResponse opsQueryChangeRecordResponse, UnmarshallerContext _ctx) {
		
		opsQueryChangeRecordResponse.setRequestId(_ctx.stringValue("OpsQueryChangeRecordResponse.RequestId"));
		opsQueryChangeRecordResponse.setTotalCount(_ctx.integerValue("OpsQueryChangeRecordResponse.TotalCount"));
		opsQueryChangeRecordResponse.setPageNumber(_ctx.integerValue("OpsQueryChangeRecordResponse.PageNumber"));
		opsQueryChangeRecordResponse.setPageSize(_ctx.integerValue("OpsQueryChangeRecordResponse.PageSize"));

		List<ChangeRecord> changeRecords = new ArrayList<ChangeRecord>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryChangeRecordResponse.ChangeRecords.Length"); i++) {
			ChangeRecord changeRecord = new ChangeRecord();
			changeRecord.setId(_ctx.longValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].Id"));
			changeRecord.setGmtCreate(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].GmtCreate"));
			changeRecord.setChangeSummary(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].ChangeSummary"));
			changeRecord.setChangeContent(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].ChangeContent"));
			changeRecord.setChangeResult(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].ChangeResult"));
			changeRecord.setExecutorNo(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].ExecutorNo"));
			changeRecord.setExecutorName(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].ExecutorName"));
			changeRecord.setChangeType(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].ChangeType"));
			changeRecord.setChangeApps(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].ChangeApps"));
			changeRecord.setApp(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].App"));
			changeRecord.setStartTimePlan(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].StartTimePlan"));
			changeRecord.setStartTimeReal(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].StartTimeReal"));
			changeRecord.setEndTimeReal(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].EndTimeReal"));
			changeRecord.setIsEmergency(_ctx.integerValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].isEmergency"));
			changeRecord.setChangefreeUrl(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].ChangefreeUrl"));
			changeRecord.setSourceSystem(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].SourceSystem"));
			changeRecord.setSourceOrderId(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].SourceOrderId"));
			changeRecord.setChangeCollectChannel(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].ChangeCollectChannel"));
			changeRecord.setChangeCategory(_ctx.stringValue("OpsQueryChangeRecordResponse.ChangeRecords["+ i +"].ChangeCategory"));

			changeRecords.add(changeRecord);
		}
		opsQueryChangeRecordResponse.setChangeRecords(changeRecords);
	 
	 	return opsQueryChangeRecordResponse;
	}
}