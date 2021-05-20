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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSagWanListResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagWanListResponse.TaskState;
import com.aliyuncs.smartag.model.v20180313.DescribeSagWanListResponse.Wan;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagWanListResponseUnmarshaller {

	public static DescribeSagWanListResponse unmarshall(DescribeSagWanListResponse describeSagWanListResponse, UnmarshallerContext _ctx) {
		
		describeSagWanListResponse.setRequestId(_ctx.stringValue("DescribeSagWanListResponse.RequestId"));

		List<Wan> wans = new ArrayList<Wan>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagWanListResponse.Wans.Length"); i++) {
			Wan wan = new Wan();
			wan.setIPType(_ctx.stringValue("DescribeSagWanListResponse.Wans["+ i +"].IPType"));
			wan.setTrafficState(_ctx.stringValue("DescribeSagWanListResponse.Wans["+ i +"].TrafficState"));
			wan.setPriority(_ctx.integerValue("DescribeSagWanListResponse.Wans["+ i +"].Priority"));
			wan.setSourceIps(_ctx.stringValue("DescribeSagWanListResponse.Wans["+ i +"].SourceIps"));
			wan.setISP(_ctx.stringValue("DescribeSagWanListResponse.Wans["+ i +"].ISP"));
			wan.setIP(_ctx.stringValue("DescribeSagWanListResponse.Wans["+ i +"].IP"));
			wan.setMask(_ctx.stringValue("DescribeSagWanListResponse.Wans["+ i +"].Mask"));
			wan.setStartIp(_ctx.stringValue("DescribeSagWanListResponse.Wans["+ i +"].StartIp"));
			wan.setVlan(_ctx.stringValue("DescribeSagWanListResponse.Wans["+ i +"].Vlan"));
			wan.setPortName(_ctx.stringValue("DescribeSagWanListResponse.Wans["+ i +"].PortName"));
			wan.setWeight(_ctx.integerValue("DescribeSagWanListResponse.Wans["+ i +"].Weight"));
			wan.setStopIp(_ctx.stringValue("DescribeSagWanListResponse.Wans["+ i +"].StopIp"));
			wan.setBandWidth(_ctx.integerValue("DescribeSagWanListResponse.Wans["+ i +"].BandWidth"));
			wan.setUsername(_ctx.stringValue("DescribeSagWanListResponse.Wans["+ i +"].Username"));
			wan.setGateway(_ctx.stringValue("DescribeSagWanListResponse.Wans["+ i +"].Gateway"));

			wans.add(wan);
		}
		describeSagWanListResponse.setWans(wans);

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagWanListResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setState(_ctx.stringValue("DescribeSagWanListResponse.TaskStates["+ i +"].State"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagWanListResponse.TaskStates["+ i +"].CreateTime"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagWanListResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagWanListResponse.TaskStates["+ i +"].ErrorMessage"));

			taskStates.add(taskState);
		}
		describeSagWanListResponse.setTaskStates(taskStates);
	 
	 	return describeSagWanListResponse;
	}
}