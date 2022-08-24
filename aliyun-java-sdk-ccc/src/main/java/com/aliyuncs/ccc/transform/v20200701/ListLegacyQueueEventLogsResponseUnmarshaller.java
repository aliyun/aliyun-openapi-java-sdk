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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListLegacyQueueEventLogsResponse;
import com.aliyuncs.ccc.model.v20200701.ListLegacyQueueEventLogsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListLegacyQueueEventLogsResponse.Data.QueueEventLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLegacyQueueEventLogsResponseUnmarshaller {

	public static ListLegacyQueueEventLogsResponse unmarshall(ListLegacyQueueEventLogsResponse listLegacyQueueEventLogsResponse, UnmarshallerContext _ctx) {
		
		listLegacyQueueEventLogsResponse.setRequestId(_ctx.stringValue("ListLegacyQueueEventLogsResponse.RequestId"));
		listLegacyQueueEventLogsResponse.setHttpStatusCode(_ctx.integerValue("ListLegacyQueueEventLogsResponse.HttpStatusCode"));
		listLegacyQueueEventLogsResponse.setCode(_ctx.stringValue("ListLegacyQueueEventLogsResponse.Code"));
		listLegacyQueueEventLogsResponse.setMessage(_ctx.stringValue("ListLegacyQueueEventLogsResponse.Message"));
		listLegacyQueueEventLogsResponse.setSuccess(_ctx.booleanValue("ListLegacyQueueEventLogsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListLegacyQueueEventLogsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListLegacyQueueEventLogsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListLegacyQueueEventLogsResponse.Data.TotalCount"));

		List<QueueEventLog> list = new ArrayList<QueueEventLog>();
		for (int i = 0; i < _ctx.lengthValue("ListLegacyQueueEventLogsResponse.Data.List.Length"); i++) {
			QueueEventLog queueEventLog = new QueueEventLog();
			queueEventLog.setVq(_ctx.stringValue("ListLegacyQueueEventLogsResponse.Data.List["+ i +"].Vq"));
			queueEventLog.setStatisticDate(_ctx.stringValue("ListLegacyQueueEventLogsResponse.Data.List["+ i +"].StatisticDate"));
			queueEventLog.setQueueTime(_ctx.longValue("ListLegacyQueueEventLogsResponse.Data.List["+ i +"].QueueTime"));
			queueEventLog.setAni(_ctx.stringValue("ListLegacyQueueEventLogsResponse.Data.List["+ i +"].Ani"));
			queueEventLog.setDnis(_ctx.stringValue("ListLegacyQueueEventLogsResponse.Data.List["+ i +"].Dnis"));
			queueEventLog.setCause(_ctx.stringValue("ListLegacyQueueEventLogsResponse.Data.List["+ i +"].Cause"));
			queueEventLog.setAnswerTime(_ctx.longValue("ListLegacyQueueEventLogsResponse.Data.List["+ i +"].AnswerTime"));
			queueEventLog.setAnswerPhone(_ctx.stringValue("ListLegacyQueueEventLogsResponse.Data.List["+ i +"].AnswerPhone"));
			queueEventLog.setAcid(_ctx.stringValue("ListLegacyQueueEventLogsResponse.Data.List["+ i +"].Acid"));
			queueEventLog.setTenantId(_ctx.stringValue("ListLegacyQueueEventLogsResponse.Data.List["+ i +"].TenantId"));

			list.add(queueEventLog);
		}
		data.setList(list);
		listLegacyQueueEventLogsResponse.setData(data);
	 
	 	return listLegacyQueueEventLogsResponse;
	}
}