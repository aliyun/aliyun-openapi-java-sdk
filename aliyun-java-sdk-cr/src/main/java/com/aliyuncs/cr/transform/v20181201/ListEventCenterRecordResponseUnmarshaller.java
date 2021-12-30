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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListEventCenterRecordResponse;
import com.aliyuncs.cr.model.v20181201.ListEventCenterRecordResponse.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventCenterRecordResponseUnmarshaller {

	public static ListEventCenterRecordResponse unmarshall(ListEventCenterRecordResponse listEventCenterRecordResponse, UnmarshallerContext _ctx) {
		
		listEventCenterRecordResponse.setRequestId(_ctx.stringValue("ListEventCenterRecordResponse.RequestId"));
		listEventCenterRecordResponse.setCode(_ctx.stringValue("ListEventCenterRecordResponse.Code"));
		listEventCenterRecordResponse.setPageNo(_ctx.integerValue("ListEventCenterRecordResponse.PageNo"));
		listEventCenterRecordResponse.setIsSuccess(_ctx.booleanValue("ListEventCenterRecordResponse.IsSuccess"));
		listEventCenterRecordResponse.setPageSize(_ctx.integerValue("ListEventCenterRecordResponse.PageSize"));
		listEventCenterRecordResponse.setTotalCount(_ctx.integerValue("ListEventCenterRecordResponse.TotalCount"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEventCenterRecordResponse.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setRecordId(_ctx.stringValue("ListEventCenterRecordResponse.Records["+ i +"].RecordId"));
			recordsItem.setRuleId(_ctx.stringValue("ListEventCenterRecordResponse.Records["+ i +"].RuleId"));
			recordsItem.setInstanceId(_ctx.stringValue("ListEventCenterRecordResponse.Records["+ i +"].InstanceId"));
			recordsItem.setRuleName(_ctx.stringValue("ListEventCenterRecordResponse.Records["+ i +"].RuleName"));
			recordsItem.setNamespace(_ctx.stringValue("ListEventCenterRecordResponse.Records["+ i +"].Namespace"));
			recordsItem.setRepoName(_ctx.stringValue("ListEventCenterRecordResponse.Records["+ i +"].RepoName"));
			recordsItem.setTag(_ctx.stringValue("ListEventCenterRecordResponse.Records["+ i +"].Tag"));
			recordsItem.setEventChannel(_ctx.stringValue("ListEventCenterRecordResponse.Records["+ i +"].EventChannel"));
			recordsItem.setEventType(_ctx.stringValue("ListEventCenterRecordResponse.Records["+ i +"].EventType"));
			recordsItem.setEventNotifyMethod(_ctx.stringValue("ListEventCenterRecordResponse.Records["+ i +"].EventNotifyMethod"));
			recordsItem.setEventNotifyId(_ctx.stringValue("ListEventCenterRecordResponse.Records["+ i +"].EventNotifyId"));
			recordsItem.setCreateTime(_ctx.longValue("ListEventCenterRecordResponse.Records["+ i +"].CreateTime"));
			recordsItem.setUpdateTime(_ctx.longValue("ListEventCenterRecordResponse.Records["+ i +"].UpdateTime"));

			records.add(recordsItem);
		}
		listEventCenterRecordResponse.setRecords(records);
	 
	 	return listEventCenterRecordResponse;
	}
}