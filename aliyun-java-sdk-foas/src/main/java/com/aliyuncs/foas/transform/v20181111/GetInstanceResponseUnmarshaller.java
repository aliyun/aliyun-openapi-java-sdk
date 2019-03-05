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

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext context) {
		
		getInstanceResponse.setRequestId(context.stringValue("GetInstanceResponse.RequestId"));

		Instance instance = new Instance();
		instance.setId(context.longValue("GetInstanceResponse.Instance.Id"));
		instance.setProjectName(context.stringValue("GetInstanceResponse.Instance.ProjectName"));
		instance.setJobName(context.stringValue("GetInstanceResponse.Instance.JobName"));
		instance.setActualState(context.stringValue("GetInstanceResponse.Instance.ActualState"));
		instance.setExpectState(context.stringValue("GetInstanceResponse.Instance.ExpectState"));
		instance.setJobType(context.stringValue("GetInstanceResponse.Instance.JobType"));
		instance.setApiType(context.stringValue("GetInstanceResponse.Instance.ApiType"));
		instance.setCode(context.stringValue("GetInstanceResponse.Instance.Code"));
		instance.setProperties(context.stringValue("GetInstanceResponse.Instance.Properties"));
		instance.setPackages(context.stringValue("GetInstanceResponse.Instance.Packages"));
		instance.setStarter(context.stringValue("GetInstanceResponse.Instance.Starter"));
		instance.setStartTime(context.longValue("GetInstanceResponse.Instance.StartTime"));
		instance.setLastErrorTime(context.longValue("GetInstanceResponse.Instance.LastErrorTime"));
		instance.setLastErrorMessage(context.stringValue("GetInstanceResponse.Instance.LastErrorMessage"));
		instance.setLastOperator(context.stringValue("GetInstanceResponse.Instance.LastOperator"));
		instance.setLastOperateTime(context.longValue("GetInstanceResponse.Instance.LastOperateTime"));
		instance.setPlanJson(context.stringValue("GetInstanceResponse.Instance.PlanJson"));
		instance.setEngineVersion(context.stringValue("GetInstanceResponse.Instance.EngineVersion"));
		instance.setEngineJobHandler(context.stringValue("GetInstanceResponse.Instance.EngineJobHandler"));
		instance.setInputDelay(context.longValue("GetInstanceResponse.Instance.InputDelay"));
		instance.setClusterId(context.stringValue("GetInstanceResponse.Instance.ClusterId"));
		instance.setQueueName(context.stringValue("GetInstanceResponse.Instance.QueueName"));
		instance.setEndTime(context.longValue("GetInstanceResponse.Instance.EndTime"));
		getInstanceResponse.setInstance(instance);
	 
	 	return getInstanceResponse;
	}
}