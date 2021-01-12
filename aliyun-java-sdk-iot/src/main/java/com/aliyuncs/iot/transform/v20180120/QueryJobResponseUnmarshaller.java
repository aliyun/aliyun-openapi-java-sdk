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

import com.aliyuncs.iot.model.v20180120.QueryJobResponse;
import com.aliyuncs.iot.model.v20180120.QueryJobResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryJobResponse.Data.JobFile;
import com.aliyuncs.iot.model.v20180120.QueryJobResponse.Data.RolloutConfig;
import com.aliyuncs.iot.model.v20180120.QueryJobResponse.Data.TargetConfig;
import com.aliyuncs.iot.model.v20180120.QueryJobResponse.Data.TargetConfig.TargetDevicesItem;
import com.aliyuncs.iot.model.v20180120.QueryJobResponse.Data.TimeoutConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryJobResponseUnmarshaller {

	public static QueryJobResponse unmarshall(QueryJobResponse queryJobResponse, UnmarshallerContext _ctx) {
		
		queryJobResponse.setRequestId(_ctx.stringValue("QueryJobResponse.RequestId"));
		queryJobResponse.setSuccess(_ctx.booleanValue("QueryJobResponse.Success"));
		queryJobResponse.setCode(_ctx.stringValue("QueryJobResponse.Code"));
		queryJobResponse.setErrorMessage(_ctx.stringValue("QueryJobResponse.ErrorMessage"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("QueryJobResponse.Data.JobId"));
		data.setJobName(_ctx.stringValue("QueryJobResponse.Data.JobName"));
		data.setUtcCreate(_ctx.stringValue("QueryJobResponse.Data.UtcCreate"));
		data.setStatus(_ctx.stringValue("QueryJobResponse.Data.Status"));
		data.setDescription(_ctx.stringValue("QueryJobResponse.Data.Description"));
		data.setType(_ctx.stringValue("QueryJobResponse.Data.Type"));
		data.setJobDocument(_ctx.stringValue("QueryJobResponse.Data.JobDocument"));
		data.setUtcModified(_ctx.stringValue("QueryJobResponse.Data.UtcModified"));

		RolloutConfig rolloutConfig = new RolloutConfig();
		rolloutConfig.setMaximumPerMinute(_ctx.integerValue("QueryJobResponse.Data.RolloutConfig.MaximumPerMinute"));
		data.setRolloutConfig(rolloutConfig);

		TimeoutConfig timeoutConfig = new TimeoutConfig();
		timeoutConfig.setInProgressTimeoutInMinutes(_ctx.integerValue("QueryJobResponse.Data.TimeoutConfig.InProgressTimeoutInMinutes"));
		data.setTimeoutConfig(timeoutConfig);

		JobFile jobFile = new JobFile();
		jobFile.setFileUrl(_ctx.stringValue("QueryJobResponse.Data.JobFile.FileUrl"));
		jobFile.setSignMethod(_ctx.stringValue("QueryJobResponse.Data.JobFile.SignMethod"));
		jobFile.setSign(_ctx.stringValue("QueryJobResponse.Data.JobFile.Sign"));
		data.setJobFile(jobFile);

		TargetConfig targetConfig = new TargetConfig();
		targetConfig.setTargetGroup(_ctx.stringValue("QueryJobResponse.Data.TargetConfig.TargetGroup"));
		targetConfig.setTargetProduct(_ctx.stringValue("QueryJobResponse.Data.TargetConfig.TargetProduct"));
		targetConfig.setTargetType(_ctx.stringValue("QueryJobResponse.Data.TargetConfig.TargetType"));

		List<TargetDevicesItem> targetDevices = new ArrayList<TargetDevicesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryJobResponse.Data.TargetConfig.TargetDevices.Length"); i++) {
			TargetDevicesItem targetDevicesItem = new TargetDevicesItem();
			targetDevicesItem.setProductKey(_ctx.stringValue("QueryJobResponse.Data.TargetConfig.TargetDevices["+ i +"].ProductKey"));
			targetDevicesItem.setDeviceName(_ctx.stringValue("QueryJobResponse.Data.TargetConfig.TargetDevices["+ i +"].DeviceName"));

			targetDevices.add(targetDevicesItem);
		}
		targetConfig.setTargetDevices(targetDevices);
		data.setTargetConfig(targetConfig);
		queryJobResponse.setData(data);
	 
	 	return queryJobResponse;
	}
}