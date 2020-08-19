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

package com.aliyuncs.foas.transform.v20181111;

import com.aliyuncs.foas.model.v20181111.GetInstanceResponse;
import com.aliyuncs.foas.model.v20181111.GetInstanceResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext _ctx) {
		
		getInstanceResponse.setRequestId(_ctx.stringValue("GetInstanceResponse.RequestId"));

		Instance instance = new Instance();
		instance.setId(_ctx.longValue("GetInstanceResponse.Instance.Id"));
		instance.setProjectName(_ctx.stringValue("GetInstanceResponse.Instance.ProjectName"));
		instance.setJobName(_ctx.stringValue("GetInstanceResponse.Instance.JobName"));
		instance.setActualState(_ctx.stringValue("GetInstanceResponse.Instance.ActualState"));
		instance.setExpectState(_ctx.stringValue("GetInstanceResponse.Instance.ExpectState"));
		instance.setJobType(_ctx.stringValue("GetInstanceResponse.Instance.JobType"));
		instance.setApiType(_ctx.stringValue("GetInstanceResponse.Instance.ApiType"));
		instance.setCode(_ctx.stringValue("GetInstanceResponse.Instance.Code"));
		instance.setProperties(_ctx.stringValue("GetInstanceResponse.Instance.Properties"));
		instance.setPackages(_ctx.stringValue("GetInstanceResponse.Instance.Packages"));
		instance.setStarter(_ctx.stringValue("GetInstanceResponse.Instance.Starter"));
		instance.setStartTime(_ctx.longValue("GetInstanceResponse.Instance.StartTime"));
		instance.setLastErrorTime(_ctx.longValue("GetInstanceResponse.Instance.LastErrorTime"));
		instance.setLastErrorMessage(_ctx.stringValue("GetInstanceResponse.Instance.LastErrorMessage"));
		instance.setLastOperator(_ctx.stringValue("GetInstanceResponse.Instance.LastOperator"));
		instance.setLastOperateTime(_ctx.longValue("GetInstanceResponse.Instance.LastOperateTime"));
		instance.setPlanJson(_ctx.stringValue("GetInstanceResponse.Instance.PlanJson"));
		instance.setEngineVersion(_ctx.stringValue("GetInstanceResponse.Instance.EngineVersion"));
		instance.setEngineJobHandler(_ctx.stringValue("GetInstanceResponse.Instance.EngineJobHandler"));
		instance.setInputDelay(_ctx.longValue("GetInstanceResponse.Instance.InputDelay"));
		instance.setClusterId(_ctx.stringValue("GetInstanceResponse.Instance.ClusterId"));
		instance.setQueueName(_ctx.stringValue("GetInstanceResponse.Instance.QueueName"));
		instance.setEndTime(_ctx.longValue("GetInstanceResponse.Instance.EndTime"));
		instance.setAutoScaleParams(_ctx.stringValue("GetInstanceResponse.Instance.AutoScaleParams"));
		getInstanceResponse.setInstance(instance);
	 
	 	return getInstanceResponse;
	}
}