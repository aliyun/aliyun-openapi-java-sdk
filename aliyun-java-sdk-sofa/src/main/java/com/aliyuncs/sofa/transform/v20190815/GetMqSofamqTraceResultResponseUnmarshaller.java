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

import com.aliyuncs.sofa.model.v20190815.GetMqSofamqTraceResultResponse;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqTraceResultResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqTraceResultResponse.Data.TraceListItem;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqTraceResultResponse.Data.TraceListItem.SubListItem;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqTraceResultResponse.Data.TraceListItem.SubListItem.ClientListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMqSofamqTraceResultResponseUnmarshaller {

	public static GetMqSofamqTraceResultResponse unmarshall(GetMqSofamqTraceResultResponse getMqSofamqTraceResultResponse, UnmarshallerContext _ctx) {
		
		getMqSofamqTraceResultResponse.setRequestId(_ctx.stringValue("GetMqSofamqTraceResultResponse.RequestId"));
		getMqSofamqTraceResultResponse.setResultCode(_ctx.stringValue("GetMqSofamqTraceResultResponse.ResultCode"));
		getMqSofamqTraceResultResponse.setResultMessage(_ctx.stringValue("GetMqSofamqTraceResultResponse.ResultMessage"));

		Data data = new Data();
		data.setCreateTime(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.CreateTime"));
		data.setInstanceId(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.InstanceId"));
		data.setMsgId(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.MsgId"));
		data.setMsgKey(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.MsgKey"));
		data.setQueryId(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.QueryId"));
		data.setStatus(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.Status"));
		data.setTopic(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.Topic"));
		data.setUpdateTime(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.UpdateTime"));
		data.setUserId(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.UserId"));

		List<TraceListItem> traceList = new ArrayList<TraceListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMqSofamqTraceResultResponse.Data.TraceList.Length"); i++) {
			TraceListItem traceListItem = new TraceListItem();
			traceListItem.setBornHost(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].BornHost"));
			traceListItem.setCostTime(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].CostTime"));
			traceListItem.setMsgId(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].MsgId"));
			traceListItem.setMsgKey(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].MsgKey"));
			traceListItem.setPubGroupName(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].PubGroupName"));
			traceListItem.setPubTime(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].PubTime"));
			traceListItem.setStatus(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].Status"));
			traceListItem.setTag(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].Tag"));
			traceListItem.setTopic(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].Topic"));

			List<SubListItem> subList = new ArrayList<SubListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList.Length"); j++) {
				SubListItem subListItem = new SubListItem();
				subListItem.setFailCount(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].FailCount"));
				subListItem.setSubGroupName(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].SubGroupName"));
				subListItem.setSuccessCount(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].SuccessCount"));

				List<ClientListItem> clientList = new ArrayList<ClientListItem>();
				for (int k = 0; k < _ctx.lengthValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList.Length"); k++) {
					ClientListItem clientListItem = new ClientListItem();
					clientListItem.setClientHost(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].ClientHost"));
					clientListItem.setCostTime(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].CostTime"));
					clientListItem.setReconsumeTimes(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].ReconsumeTimes"));
					clientListItem.setStatus(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].Status"));
					clientListItem.setSubGroupName(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].SubGroupName"));
					clientListItem.setSubTime(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].SubTime"));

					clientList.add(clientListItem);
				}
				subListItem.setClientList(clientList);

				subList.add(subListItem);
			}
			traceListItem.setSubList(subList);

			traceList.add(traceListItem);
		}
		data.setTraceList(traceList);
		getMqSofamqTraceResultResponse.setData(data);
	 
	 	return getMqSofamqTraceResultResponse;
	}
}