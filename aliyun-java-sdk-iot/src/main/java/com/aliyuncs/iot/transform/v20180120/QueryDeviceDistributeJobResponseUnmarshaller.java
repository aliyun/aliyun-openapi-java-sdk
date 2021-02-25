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

import com.aliyuncs.iot.model.v20180120.QueryDeviceDistributeJobResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceDistributeJobResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDeviceDistributeJobResponse.Data.TargetInstanceConfigsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceDistributeJobResponseUnmarshaller {

	public static QueryDeviceDistributeJobResponse unmarshall(QueryDeviceDistributeJobResponse queryDeviceDistributeJobResponse, UnmarshallerContext _ctx) {
		
		queryDeviceDistributeJobResponse.setRequestId(_ctx.stringValue("QueryDeviceDistributeJobResponse.RequestId"));
		queryDeviceDistributeJobResponse.setSuccess(_ctx.booleanValue("QueryDeviceDistributeJobResponse.Success"));
		queryDeviceDistributeJobResponse.setCode(_ctx.stringValue("QueryDeviceDistributeJobResponse.Code"));
		queryDeviceDistributeJobResponse.setErrorMessage(_ctx.stringValue("QueryDeviceDistributeJobResponse.ErrorMessage"));

		Data data = new Data();
		data.setSourceUid(_ctx.stringValue("QueryDeviceDistributeJobResponse.Data.SourceUid"));
		data.setTargetUid(_ctx.stringValue("QueryDeviceDistributeJobResponse.Data.TargetUid"));
		data.setSourceInstanceId(_ctx.stringValue("QueryDeviceDistributeJobResponse.Data.SourceInstanceId"));
		data.setJobId(_ctx.stringValue("QueryDeviceDistributeJobResponse.Data.JobId"));
		data.setProductKey(_ctx.stringValue("QueryDeviceDistributeJobResponse.Data.ProductKey"));
		data.setTotal(_ctx.integerValue("QueryDeviceDistributeJobResponse.Data.Total"));
		data.setStatus(_ctx.integerValue("QueryDeviceDistributeJobResponse.Data.Status"));
		data.setGmtCreate(_ctx.longValue("QueryDeviceDistributeJobResponse.Data.GmtCreate"));
		data.setStrategy(_ctx.integerValue("QueryDeviceDistributeJobResponse.Data.Strategy"));

		List<TargetInstanceConfigsItem> targetInstanceConfigs = new ArrayList<TargetInstanceConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceDistributeJobResponse.Data.TargetInstanceConfigs.Length"); i++) {
			TargetInstanceConfigsItem targetInstanceConfigsItem = new TargetInstanceConfigsItem();
			targetInstanceConfigsItem.setTargetInstanceId(_ctx.stringValue("QueryDeviceDistributeJobResponse.Data.TargetInstanceConfigs["+ i +"].TargetInstanceId"));

			targetInstanceConfigs.add(targetInstanceConfigsItem);
		}
		data.setTargetInstanceConfigs(targetInstanceConfigs);
		queryDeviceDistributeJobResponse.setData(data);
	 
	 	return queryDeviceDistributeJobResponse;
	}
}