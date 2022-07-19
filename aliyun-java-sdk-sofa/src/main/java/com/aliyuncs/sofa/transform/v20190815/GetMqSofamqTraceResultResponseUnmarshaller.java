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
		getMqSofamqTraceResultResponse.setResultMessage(_ctx.stringValue("GetMqSofamqTraceResultResponse.ResultMessage"));
		getMqSofamqTraceResultResponse.setResultCode(_ctx.stringValue("GetMqSofamqTraceResultResponse.ResultCode"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.Status"));
		data.setMsgKey(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.MsgKey"));
		data.setUpdateTime(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.UpdateTime"));
		data.setCreateTime(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.CreateTime"));
		data.setUserId(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.UserId"));
		data.setTopic(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.Topic"));
		data.setInstanceId(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.InstanceId"));
		data.setMsgId(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.MsgId"));
		data.setQueryId(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.QueryId"));

		List<TraceListItem> traceList = new ArrayList<TraceListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMqSofamqTraceResultResponse.Data.TraceList.Length"); i++) {
			TraceListItem traceListItem = new TraceListItem();
			traceListItem.setStatus(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].Status"));
			traceListItem.setMsgKey(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].MsgKey"));
			traceListItem.setPubTime(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].PubTime"));
			traceListItem.setTopic(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].Topic"));
			traceListItem.setCostTime(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].CostTime"));
			traceListItem.setTag(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].Tag"));
			traceListItem.setMsgId(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].MsgId"));
			traceListItem.setPubGroupName(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].PubGroupName"));
			traceListItem.setCell(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].Cell"));
			traceListItem.setBornHost(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].BornHost"));

			List<SubListItem> subList = new ArrayList<SubListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList.Length"); j++) {
				SubListItem subListItem = new SubListItem();
				subListItem.setSubGroupName(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].SubGroupName"));
				subListItem.setSuccessCount(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].SuccessCount"));
				subListItem.setFailCount(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].FailCount"));
				subListItem.setCell(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].Cell"));

				List<ClientListItem> clientList = new ArrayList<ClientListItem>();
				for (int k = 0; k < _ctx.lengthValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList.Length"); k++) {
					ClientListItem clientListItem = new ClientListItem();
					clientListItem.setStatus(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].Status"));
					clientListItem.setSubTime(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].SubTime"));
					clientListItem.setReconsumeTimes(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].ReconsumeTimes"));
					clientListItem.setClientHost(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].ClientHost"));
					clientListItem.setSubGroupName(_ctx.stringValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].SubGroupName"));
					clientListItem.setCostTime(_ctx.longValue("GetMqSofamqTraceResultResponse.Data.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].CostTime"));

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