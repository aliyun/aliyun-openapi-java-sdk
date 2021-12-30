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

package com.aliyuncs.schedulerx2.transform.v20190430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx2.model.v20190430.GetWorkerListResponse;
import com.aliyuncs.schedulerx2.model.v20190430.GetWorkerListResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.GetWorkerListResponse.Data.WorkerInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkerListResponseUnmarshaller {

	public static GetWorkerListResponse unmarshall(GetWorkerListResponse getWorkerListResponse, UnmarshallerContext _ctx) {
		
		getWorkerListResponse.setRequestId(_ctx.stringValue("GetWorkerListResponse.RequestId"));
		getWorkerListResponse.setCode(_ctx.integerValue("GetWorkerListResponse.Code"));
		getWorkerListResponse.setMessage(_ctx.stringValue("GetWorkerListResponse.Message"));
		getWorkerListResponse.setSuccess(_ctx.booleanValue("GetWorkerListResponse.Success"));

		Data data = new Data();

		List<WorkerInfo> workerInfos = new ArrayList<WorkerInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkerListResponse.Data.WorkerInfos.Length"); i++) {
			WorkerInfo workerInfo = new WorkerInfo();
			workerInfo.setIp(_ctx.stringValue("GetWorkerListResponse.Data.WorkerInfos["+ i +"].Ip"));
			workerInfo.setPort(_ctx.integerValue("GetWorkerListResponse.Data.WorkerInfos["+ i +"].Port"));
			workerInfo.setWorkerAddress(_ctx.stringValue("GetWorkerListResponse.Data.WorkerInfos["+ i +"].WorkerAddress"));
			workerInfo.setLabel(_ctx.stringValue("GetWorkerListResponse.Data.WorkerInfos["+ i +"].Label"));
			workerInfo.setVersion(_ctx.stringValue("GetWorkerListResponse.Data.WorkerInfos["+ i +"].Version"));
			workerInfo.setStarter(_ctx.stringValue("GetWorkerListResponse.Data.WorkerInfos["+ i +"].Starter"));

			workerInfos.add(workerInfo);
		}
		data.setWorkerInfos(workerInfos);
		getWorkerListResponse.setData(data);
	 
	 	return getWorkerListResponse;
	}
}