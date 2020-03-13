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

import com.aliyuncs.sofa.model.v20190815.ListMsDrmLogsResponse;
import com.aliyuncs.sofa.model.v20190815.ListMsDrmLogsResponse.DrmLogsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMsDrmLogsResponseUnmarshaller {

	public static ListMsDrmLogsResponse unmarshall(ListMsDrmLogsResponse listMsDrmLogsResponse, UnmarshallerContext _ctx) {
		
		listMsDrmLogsResponse.setRequestId(_ctx.stringValue("ListMsDrmLogsResponse.RequestId"));
		listMsDrmLogsResponse.setResultCode(_ctx.stringValue("ListMsDrmLogsResponse.ResultCode"));
		listMsDrmLogsResponse.setResultMessage(_ctx.stringValue("ListMsDrmLogsResponse.ResultMessage"));
		listMsDrmLogsResponse.setCurrentPage(_ctx.longValue("ListMsDrmLogsResponse.CurrentPage"));
		listMsDrmLogsResponse.setPageSize(_ctx.longValue("ListMsDrmLogsResponse.PageSize"));
		listMsDrmLogsResponse.setStartIndex(_ctx.longValue("ListMsDrmLogsResponse.StartIndex"));
		listMsDrmLogsResponse.setTotalSize(_ctx.longValue("ListMsDrmLogsResponse.TotalSize"));

		List<DrmLogsItem> drmLogs = new ArrayList<DrmLogsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMsDrmLogsResponse.DrmLogs.Length"); i++) {
			DrmLogsItem drmLogsItem = new DrmLogsItem();
			drmLogsItem.setClientIp(_ctx.stringValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].ClientIp"));
			drmLogsItem.setDataId(_ctx.stringValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].DataId"));
			drmLogsItem.setFailTarget(_ctx.stringValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].FailTarget"));
			drmLogsItem.setGmtCreate(_ctx.stringValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].GmtCreate"));
			drmLogsItem.setGmtModified(_ctx.stringValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].GmtModified"));
			drmLogsItem.setId(_ctx.longValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].Id"));
			drmLogsItem.setInstanceId(_ctx.stringValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].InstanceId"));
			drmLogsItem.setOperator(_ctx.stringValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].Operator"));
			drmLogsItem.setPushMode(_ctx.stringValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].PushMode"));
			drmLogsItem.setResult(_ctx.stringValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].Result"));
			drmLogsItem.setSourceApp(_ctx.stringValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].SourceApp"));
			drmLogsItem.setTarget(_ctx.stringValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].Target"));
			drmLogsItem.setValue(_ctx.stringValue("ListMsDrmLogsResponse.DrmLogs["+ i +"].Value"));

			drmLogs.add(drmLogsItem);
		}
		listMsDrmLogsResponse.setDrmLogs(drmLogs);
	 
	 	return listMsDrmLogsResponse;
	}
}