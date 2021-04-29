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

import com.aliyuncs.smartag.model.v20180313.DescribeSagLanListResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagLanListResponse.Lan;
import com.aliyuncs.smartag.model.v20180313.DescribeSagLanListResponse.TaskState;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagLanListResponseUnmarshaller {

	public static DescribeSagLanListResponse unmarshall(DescribeSagLanListResponse describeSagLanListResponse, UnmarshallerContext _ctx) {
		
		describeSagLanListResponse.setRequestId(_ctx.stringValue("DescribeSagLanListResponse.RequestId"));

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagLanListResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setState(_ctx.stringValue("DescribeSagLanListResponse.TaskStates["+ i +"].State"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagLanListResponse.TaskStates["+ i +"].CreateTime"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagLanListResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagLanListResponse.TaskStates["+ i +"].ErrorMessage"));

			taskStates.add(taskState);
		}
		describeSagLanListResponse.setTaskStates(taskStates);

		List<Lan> lans = new ArrayList<Lan>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagLanListResponse.Lans.Length"); i++) {
			Lan lan = new Lan();
			lan.setIPType(_ctx.stringValue("DescribeSagLanListResponse.Lans["+ i +"].IPType"));
			lan.setLease(_ctx.stringValue("DescribeSagLanListResponse.Lans["+ i +"].Lease"));
			lan.setIP(_ctx.stringValue("DescribeSagLanListResponse.Lans["+ i +"].IP"));
			lan.setMask(_ctx.stringValue("DescribeSagLanListResponse.Lans["+ i +"].Mask"));
			lan.setStartIp(_ctx.stringValue("DescribeSagLanListResponse.Lans["+ i +"].StartIp"));
			lan.setPortName(_ctx.stringValue("DescribeSagLanListResponse.Lans["+ i +"].PortName"));
			lan.setEndIp(_ctx.stringValue("DescribeSagLanListResponse.Lans["+ i +"].EndIp"));

			lans.add(lan);
		}
		describeSagLanListResponse.setLans(lans);
	 
	 	return describeSagLanListResponse;
	}
}