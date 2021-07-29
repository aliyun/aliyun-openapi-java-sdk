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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.ListTaskDetailResponse;
import com.aliyuncs.aiccs.model.v20191015.ListTaskDetailResponse.Data;
import com.aliyuncs.aiccs.model.v20191015.ListTaskDetailResponse.Data.RecordItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskDetailResponseUnmarshaller {

	public static ListTaskDetailResponse unmarshall(ListTaskDetailResponse listTaskDetailResponse, UnmarshallerContext _ctx) {
		
		listTaskDetailResponse.setRequestId(_ctx.stringValue("ListTaskDetailResponse.RequestId"));
		listTaskDetailResponse.setCode(_ctx.stringValue("ListTaskDetailResponse.Code"));
		listTaskDetailResponse.setMessage(_ctx.stringValue("ListTaskDetailResponse.Message"));
		listTaskDetailResponse.setSuccess(_ctx.booleanValue("ListTaskDetailResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.longValue("ListTaskDetailResponse.Data.PageNo"));
		data.setPageSize(_ctx.longValue("ListTaskDetailResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListTaskDetailResponse.Data.Total"));

		List<RecordItem> record = new ArrayList<RecordItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskDetailResponse.Data.Record.Length"); i++) {
			RecordItem recordItem = new RecordItem();
			recordItem.setStatus(_ctx.stringValue("ListTaskDetailResponse.Data.Record["+ i +"].Status"));
			recordItem.setRetryCurTimes(_ctx.integerValue("ListTaskDetailResponse.Data.Record["+ i +"].RetryCurTimes"));
			recordItem.setCalled(_ctx.stringValue("ListTaskDetailResponse.Data.Record["+ i +"].Called"));
			recordItem.setCaller(_ctx.stringValue("ListTaskDetailResponse.Data.Record["+ i +"].Caller"));
			recordItem.setDuration(_ctx.integerValue("ListTaskDetailResponse.Data.Record["+ i +"].Duration"));
			recordItem.setId(_ctx.longValue("ListTaskDetailResponse.Data.Record["+ i +"].Id"));
			recordItem.setStatusCode(_ctx.stringValue("ListTaskDetailResponse.Data.Record["+ i +"].StatusCode"));
			recordItem.setStatusCodeDesc(_ctx.stringValue("ListTaskDetailResponse.Data.Record["+ i +"].StatusCodeDesc"));
			recordItem.setRetryTimes(_ctx.integerValue("ListTaskDetailResponse.Data.Record["+ i +"].RetryTimes"));
			recordItem.setStartTime(_ctx.stringValue("ListTaskDetailResponse.Data.Record["+ i +"].StartTime"));
			recordItem.setEndTime(_ctx.stringValue("ListTaskDetailResponse.Data.Record["+ i +"].EndTime"));
			recordItem.setDirection(_ctx.stringValue("ListTaskDetailResponse.Data.Record["+ i +"].Direction"));
			recordItem.setTags(_ctx.stringValue("ListTaskDetailResponse.Data.Record["+ i +"].Tags"));

			record.add(recordItem);
		}
		data.setRecord(record);
		listTaskDetailResponse.setData(data);
	 
	 	return listTaskDetailResponse;
	}
}