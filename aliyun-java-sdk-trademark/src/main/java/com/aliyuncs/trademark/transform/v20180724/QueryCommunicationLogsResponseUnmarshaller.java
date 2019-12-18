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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryCommunicationLogsResponse;
import com.aliyuncs.trademark.model.v20180724.QueryCommunicationLogsResponse.TaskList;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCommunicationLogsResponseUnmarshaller {

	public static QueryCommunicationLogsResponse unmarshall(QueryCommunicationLogsResponse queryCommunicationLogsResponse, UnmarshallerContext _ctx) {
		
		queryCommunicationLogsResponse.setRequestId(_ctx.stringValue("QueryCommunicationLogsResponse.RequestId"));

		List<TaskList> data = new ArrayList<TaskList>();
		for (int i = 0; i < _ctx.lengthValue("QueryCommunicationLogsResponse.Data.Length"); i++) {
			TaskList taskList = new TaskList();
			taskList.setBizId(_ctx.stringValue("QueryCommunicationLogsResponse.Data["+ i +"].BizId"));
			taskList.setNote(_ctx.stringValue("QueryCommunicationLogsResponse.Data["+ i +"].Note"));
			taskList.setPartnerCode(_ctx.stringValue("QueryCommunicationLogsResponse.Data["+ i +"].PartnerCode"));
			taskList.setUpdateTime(_ctx.longValue("QueryCommunicationLogsResponse.Data["+ i +"].UpdateTime"));
			taskList.setCreateTime(_ctx.longValue("QueryCommunicationLogsResponse.Data["+ i +"].CreateTime"));

			data.add(taskList);
		}
		queryCommunicationLogsResponse.setData(data);
	 
	 	return queryCommunicationLogsResponse;
	}
}