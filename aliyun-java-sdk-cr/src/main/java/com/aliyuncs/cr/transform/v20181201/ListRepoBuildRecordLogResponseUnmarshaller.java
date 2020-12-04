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

import com.aliyuncs.cr.model.v20181201.ListRepoBuildRecordLogResponse;
import com.aliyuncs.cr.model.v20181201.ListRepoBuildRecordLogResponse.BuildRecordLogsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepoBuildRecordLogResponseUnmarshaller {

	public static ListRepoBuildRecordLogResponse unmarshall(ListRepoBuildRecordLogResponse listRepoBuildRecordLogResponse, UnmarshallerContext _ctx) {
		
		listRepoBuildRecordLogResponse.setRequestId(_ctx.stringValue("ListRepoBuildRecordLogResponse.RequestId"));
		listRepoBuildRecordLogResponse.setIsSuccess(_ctx.booleanValue("ListRepoBuildRecordLogResponse.IsSuccess"));
		listRepoBuildRecordLogResponse.setCode(_ctx.stringValue("ListRepoBuildRecordLogResponse.Code"));
		listRepoBuildRecordLogResponse.setPageNo(_ctx.integerValue("ListRepoBuildRecordLogResponse.PageNo"));
		listRepoBuildRecordLogResponse.setPageSize(_ctx.integerValue("ListRepoBuildRecordLogResponse.PageSize"));
		listRepoBuildRecordLogResponse.setTotalCount(_ctx.stringValue("ListRepoBuildRecordLogResponse.TotalCount"));

		List<BuildRecordLogsItem> buildRecordLogs = new ArrayList<BuildRecordLogsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepoBuildRecordLogResponse.BuildRecordLogs.Length"); i++) {
			BuildRecordLogsItem buildRecordLogsItem = new BuildRecordLogsItem();
			buildRecordLogsItem.setLineNumber(_ctx.integerValue("ListRepoBuildRecordLogResponse.BuildRecordLogs["+ i +"].LineNumber"));
			buildRecordLogsItem.setMessage(_ctx.stringValue("ListRepoBuildRecordLogResponse.BuildRecordLogs["+ i +"].Message"));
			buildRecordLogsItem.setBuildStage(_ctx.stringValue("ListRepoBuildRecordLogResponse.BuildRecordLogs["+ i +"].BuildStage"));

			buildRecordLogs.add(buildRecordLogsItem);
		}
		listRepoBuildRecordLogResponse.setBuildRecordLogs(buildRecordLogs);
	 
	 	return listRepoBuildRecordLogResponse;
	}
}