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

package com.aliyuncs.ons.transform.v20190214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20190214.OnsTraceGetResultResponse;
import com.aliyuncs.ons.model.v20190214.OnsTraceGetResultResponse.TraceData;
import com.aliyuncs.ons.model.v20190214.OnsTraceGetResultResponse.TraceData.TraceMapDo;
import com.aliyuncs.ons.model.v20190214.OnsTraceGetResultResponse.TraceData.TraceMapDo.SubMapDo;
import com.aliyuncs.ons.model.v20190214.OnsTraceGetResultResponse.TraceData.TraceMapDo.SubMapDo.SubClientInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsTraceGetResultResponseUnmarshaller {

	public static OnsTraceGetResultResponse unmarshall(OnsTraceGetResultResponse onsTraceGetResultResponse, UnmarshallerContext _ctx) {
		
		onsTraceGetResultResponse.setRequestId(_ctx.stringValue("OnsTraceGetResultResponse.RequestId"));
		onsTraceGetResultResponse.setHelpUrl(_ctx.stringValue("OnsTraceGetResultResponse.HelpUrl"));

		TraceData traceData = new TraceData();
		traceData.setQueryId(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.QueryId"));
		traceData.setUserId(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.UserId"));
		traceData.setTopic(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.Topic"));
		traceData.setMsgId(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.MsgId"));
		traceData.setMsgKey(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.MsgKey"));
		traceData.setStatus(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.Status"));
		traceData.setCreateTime(_ctx.longValue("OnsTraceGetResultResponse.TraceData.CreateTime"));
		traceData.setUpdateTime(_ctx.longValue("OnsTraceGetResultResponse.TraceData.UpdateTime"));
		traceData.setInstanceId(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.InstanceId"));

		List<TraceMapDo> traceList = new ArrayList<TraceMapDo>();
		for (int i = 0; i < _ctx.lengthValue("OnsTraceGetResultResponse.TraceData.TraceList.Length"); i++) {
			TraceMapDo traceMapDo = new TraceMapDo();
			traceMapDo.setPubTime(_ctx.longValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].PubTime"));
			traceMapDo.setTopic(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].Topic"));
			traceMapDo.setPubGroupName(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].PubGroupName"));
			traceMapDo.setMsgId(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].MsgId"));
			traceMapDo.setTag(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].Tag"));
			traceMapDo.setMsgKey(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].MsgKey"));
			traceMapDo.setBornHost(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].BornHost"));
			traceMapDo.setCostTime(_ctx.integerValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].CostTime"));
			traceMapDo.setStatus(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].Status"));

			List<SubMapDo> subList = new ArrayList<SubMapDo>();
			for (int j = 0; j < _ctx.lengthValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList.Length"); j++) {
				SubMapDo subMapDo = new SubMapDo();
				subMapDo.setSubGroupName(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].SubGroupName"));
				subMapDo.setSuccessCount(_ctx.integerValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].SuccessCount"));
				subMapDo.setFailCount(_ctx.integerValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].FailCount"));

				List<SubClientInfoDo> clientList = new ArrayList<SubClientInfoDo>();
				for (int k = 0; k < _ctx.lengthValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList.Length"); k++) {
					SubClientInfoDo subClientInfoDo = new SubClientInfoDo();
					subClientInfoDo.setSubGroupName(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].SubGroupName"));
					subClientInfoDo.setSubTime(_ctx.longValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].SubTime"));
					subClientInfoDo.setClientHost(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].ClientHost"));
					subClientInfoDo.setReconsumeTimes(_ctx.integerValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].ReconsumeTimes"));
					subClientInfoDo.setCostTime(_ctx.integerValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].CostTime"));
					subClientInfoDo.setStatus(_ctx.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].Status"));

					clientList.add(subClientInfoDo);
				}
				subMapDo.setClientList(clientList);

				subList.add(subMapDo);
			}
			traceMapDo.setSubList(subList);

			traceList.add(traceMapDo);
		}
		traceData.setTraceList(traceList);
		onsTraceGetResultResponse.setTraceData(traceData);
	 
	 	return onsTraceGetResultResponse;
	}
}