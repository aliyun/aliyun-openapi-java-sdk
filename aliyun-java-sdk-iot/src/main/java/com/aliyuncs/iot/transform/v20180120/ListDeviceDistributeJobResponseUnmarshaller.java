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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListDeviceDistributeJobResponse;
import com.aliyuncs.iot.model.v20180120.ListDeviceDistributeJobResponse.Data;
import com.aliyuncs.iot.model.v20180120.ListDeviceDistributeJobResponse.Data.Items;
import com.aliyuncs.iot.model.v20180120.ListDeviceDistributeJobResponse.Data.Items.TargetInstanceConfigsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceDistributeJobResponseUnmarshaller {

	public static ListDeviceDistributeJobResponse unmarshall(ListDeviceDistributeJobResponse listDeviceDistributeJobResponse, UnmarshallerContext _ctx) {
		
		listDeviceDistributeJobResponse.setRequestId(_ctx.stringValue("ListDeviceDistributeJobResponse.RequestId"));
		listDeviceDistributeJobResponse.setSuccess(_ctx.booleanValue("ListDeviceDistributeJobResponse.Success"));
		listDeviceDistributeJobResponse.setCode(_ctx.stringValue("ListDeviceDistributeJobResponse.Code"));
		listDeviceDistributeJobResponse.setErrorMessage(_ctx.stringValue("ListDeviceDistributeJobResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListDeviceDistributeJobResponse.Data.Total"));

		List<Items> jobInfo = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceDistributeJobResponse.Data.JobInfo.Length"); i++) {
			Items items = new Items();
			items.setGmtCreate(_ctx.longValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].GmtCreate"));
			items.setSourceUid(_ctx.stringValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].SourceUid"));
			items.setTargetUid(_ctx.stringValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].TargetUid"));
			items.setJobId(_ctx.stringValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].JobId"));
			items.setSourceInstanceId(_ctx.stringValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].SourceInstanceId"));
			items.setProductKey(_ctx.stringValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].ProductKey"));
			items.setTotal(_ctx.integerValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].Total"));
			items.setStatus(_ctx.integerValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].Status"));
			items.setStrategy(_ctx.integerValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].Strategy"));
			items.setSourceRegion(_ctx.stringValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].SourceRegion"));
			items.setSourceInstanceName(_ctx.stringValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].SourceInstanceName"));

			List<TargetInstanceConfigsItem> targetInstanceConfigs = new ArrayList<TargetInstanceConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].TargetInstanceConfigs.Length"); j++) {
				TargetInstanceConfigsItem targetInstanceConfigsItem = new TargetInstanceConfigsItem();
				targetInstanceConfigsItem.setTargetInstanceId(_ctx.stringValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].TargetInstanceConfigs["+ j +"].TargetInstanceId"));
				targetInstanceConfigsItem.setTargetRegion(_ctx.stringValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].TargetInstanceConfigs["+ j +"].TargetRegion"));
				targetInstanceConfigsItem.setTargetInstanceName(_ctx.stringValue("ListDeviceDistributeJobResponse.Data.JobInfo["+ i +"].TargetInstanceConfigs["+ j +"].TargetInstanceName"));

				targetInstanceConfigs.add(targetInstanceConfigsItem);
			}
			items.setTargetInstanceConfigs(targetInstanceConfigs);

			jobInfo.add(items);
		}
		data.setJobInfo(jobInfo);
		listDeviceDistributeJobResponse.setData(data);
	 
	 	return listDeviceDistributeJobResponse;
	}
}