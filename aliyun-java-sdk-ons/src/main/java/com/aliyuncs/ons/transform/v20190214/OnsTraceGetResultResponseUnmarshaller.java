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

	public static OnsTraceGetResultResponse unmarshall(OnsTraceGetResultResponse onsTraceGetResultResponse, UnmarshallerContext context) {
		
		onsTraceGetResultResponse.setRequestId(context.stringValue("OnsTraceGetResultResponse.RequestId"));
		onsTraceGetResultResponse.setHelpUrl(context.stringValue("OnsTraceGetResultResponse.HelpUrl"));

		TraceData traceData = new TraceData();
		traceData.setQueryId(context.stringValue("OnsTraceGetResultResponse.TraceData.QueryId"));
		traceData.setUserId(context.stringValue("OnsTraceGetResultResponse.TraceData.UserId"));
		traceData.setTopic(context.stringValue("OnsTraceGetResultResponse.TraceData.Topic"));
		traceData.setMsgId(context.stringValue("OnsTraceGetResultResponse.TraceData.MsgId"));
		traceData.setMsgKey(context.stringValue("OnsTraceGetResultResponse.TraceData.MsgKey"));
		traceData.setStatus(context.stringValue("OnsTraceGetResultResponse.TraceData.Status"));
		traceData.setCreateTime(context.longValue("OnsTraceGetResultResponse.TraceData.CreateTime"));
		traceData.setUpdateTime(context.longValue("OnsTraceGetResultResponse.TraceData.UpdateTime"));
		traceData.setInstanceId(context.stringValue("OnsTraceGetResultResponse.TraceData.InstanceId"));

		List<TraceMapDo> traceList = new ArrayList<TraceMapDo>();
		for (int i = 0; i < context.lengthValue("OnsTraceGetResultResponse.TraceData.TraceList.Length"); i++) {
			TraceMapDo traceMapDo = new TraceMapDo();
			traceMapDo.setPubTime(context.longValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].PubTime"));
			traceMapDo.setTopic(context.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].Topic"));
			traceMapDo.setPubGroupName(context.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].PubGroupName"));
			traceMapDo.setMsgId(context.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].MsgId"));
			traceMapDo.setTag(context.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].Tag"));
			traceMapDo.setMsgKey(context.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].MsgKey"));
			traceMapDo.setBornHost(context.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].BornHost"));
			traceMapDo.setCostTime(context.integerValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].CostTime"));
			traceMapDo.setStatus(context.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].Status"));

			List<SubMapDo> subList = new ArrayList<SubMapDo>();
			for (int j = 0; j < context.lengthValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList.Length"); j++) {
				SubMapDo subMapDo = new SubMapDo();
				subMapDo.setSubGroupName(context.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].SubGroupName"));
				subMapDo.setSuccessCount(context.integerValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].SuccessCount"));
				subMapDo.setFailCount(context.integerValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].FailCount"));

				List<SubClientInfoDo> clientList = new ArrayList<SubClientInfoDo>();
				for (int k = 0; k < context.lengthValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList.Length"); k++) {
					SubClientInfoDo subClientInfoDo = new SubClientInfoDo();
					subClientInfoDo.setSubGroupName(context.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].SubGroupName"));
					subClientInfoDo.setSubTime(context.longValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].SubTime"));
					subClientInfoDo.setClientHost(context.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].ClientHost"));
					subClientInfoDo.setReconsumeTimes(context.integerValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].ReconsumeTimes"));
					subClientInfoDo.setCostTime(context.integerValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].CostTime"));
					subClientInfoDo.setStatus(context.stringValue("OnsTraceGetResultResponse.TraceData.TraceList["+ i +"].SubList["+ j +"].ClientList["+ k +"].Status"));

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