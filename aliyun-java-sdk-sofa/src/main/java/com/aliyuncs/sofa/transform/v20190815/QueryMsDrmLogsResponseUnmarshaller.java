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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMsDrmLogsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsDrmLogsResponse.DrmLogsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsDrmLogsResponseUnmarshaller {

	public static QueryMsDrmLogsResponse unmarshall(QueryMsDrmLogsResponse queryMsDrmLogsResponse, UnmarshallerContext _ctx) {
		
		queryMsDrmLogsResponse.setRequestId(_ctx.stringValue("QueryMsDrmLogsResponse.RequestId"));
		queryMsDrmLogsResponse.setResultCode(_ctx.stringValue("QueryMsDrmLogsResponse.ResultCode"));
		queryMsDrmLogsResponse.setResultMessage(_ctx.stringValue("QueryMsDrmLogsResponse.ResultMessage"));
		queryMsDrmLogsResponse.setCurrentPage(_ctx.longValue("QueryMsDrmLogsResponse.CurrentPage"));
		queryMsDrmLogsResponse.setPageSize(_ctx.longValue("QueryMsDrmLogsResponse.PageSize"));
		queryMsDrmLogsResponse.setStartIndex(_ctx.longValue("QueryMsDrmLogsResponse.StartIndex"));
		queryMsDrmLogsResponse.setTotalSize(_ctx.longValue("QueryMsDrmLogsResponse.TotalSize"));

		List<DrmLogsItem> drmLogs = new ArrayList<DrmLogsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsDrmLogsResponse.DrmLogs.Length"); i++) {
			DrmLogsItem drmLogsItem = new DrmLogsItem();
			drmLogsItem.setClientIp(_ctx.stringValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].ClientIp"));
			drmLogsItem.setDataId(_ctx.stringValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].DataId"));
			drmLogsItem.setFailTarget(_ctx.stringValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].FailTarget"));
			drmLogsItem.setGmtCreate(_ctx.stringValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].GmtCreate"));
			drmLogsItem.setGmtModified(_ctx.stringValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].GmtModified"));
			drmLogsItem.setId(_ctx.longValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].Id"));
			drmLogsItem.setInstanceId(_ctx.stringValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].InstanceId"));
			drmLogsItem.setOperator(_ctx.stringValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].Operator"));
			drmLogsItem.setPushMode(_ctx.stringValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].PushMode"));
			drmLogsItem.setResult(_ctx.stringValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].Result"));
			drmLogsItem.setSourceApp(_ctx.stringValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].SourceApp"));
			drmLogsItem.setTarget(_ctx.stringValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].Target"));
			drmLogsItem.setValue(_ctx.stringValue("QueryMsDrmLogsResponse.DrmLogs["+ i +"].Value"));

			drmLogs.add(drmLogsItem);
		}
		queryMsDrmLogsResponse.setDrmLogs(drmLogs);
	 
	 	return queryMsDrmLogsResponse;
	}
}