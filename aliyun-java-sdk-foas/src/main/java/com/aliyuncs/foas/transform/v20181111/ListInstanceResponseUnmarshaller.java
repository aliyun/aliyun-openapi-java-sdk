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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.ListInstanceResponse;
import com.aliyuncs.foas.model.v20181111.ListInstanceResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceResponseUnmarshaller {

	public static ListInstanceResponse unmarshall(ListInstanceResponse listInstanceResponse, UnmarshallerContext _ctx) {
		
		listInstanceResponse.setRequestId(_ctx.stringValue("ListInstanceResponse.RequestId"));
		listInstanceResponse.setPageIndex(_ctx.integerValue("ListInstanceResponse.PageIndex"));
		listInstanceResponse.setPageSize(_ctx.integerValue("ListInstanceResponse.PageSize"));
		listInstanceResponse.setTotalPage(_ctx.integerValue("ListInstanceResponse.TotalPage"));
		listInstanceResponse.setTotalCount(_ctx.longValue("ListInstanceResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setId(_ctx.longValue("ListInstanceResponse.Instances["+ i +"].Id"));
			instance.setProjectName(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].ProjectName"));
			instance.setJobName(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].JobName"));
			instance.setActualState(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].ActualState"));
			instance.setExpectState(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].ExpectState"));
			instance.setJobType(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].JobType"));
			instance.setApiType(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].ApiType"));
			instance.setCode(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].Code"));
			instance.setProperties(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].Properties"));
			instance.setPackages(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].Packages"));
			instance.setStarter(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].Starter"));
			instance.setStartTime(_ctx.longValue("ListInstanceResponse.Instances["+ i +"].StartTime"));
			instance.setLastErrorTime(_ctx.longValue("ListInstanceResponse.Instances["+ i +"].LastErrorTime"));
			instance.setLastErrorMessage(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].LastErrorMessage"));
			instance.setLastOperator(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].LastOperator"));
			instance.setLastOperateTime(_ctx.longValue("ListInstanceResponse.Instances["+ i +"].LastOperateTime"));
			instance.setPlanJson(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].PlanJson"));
			instance.setEngineVersion(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].EngineVersion"));
			instance.setEngineJobHandler(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].EngineJobHandler"));
			instance.setInputDelay(_ctx.longValue("ListInstanceResponse.Instances["+ i +"].InputDelay"));
			instance.setClusterId(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].ClusterId"));
			instance.setQueueName(_ctx.stringValue("ListInstanceResponse.Instances["+ i +"].QueueName"));
			instance.setEndTime(_ctx.longValue("ListInstanceResponse.Instances["+ i +"].EndTime"));

			instances.add(instance);
		}
		listInstanceResponse.setInstances(instances);
	 
	 	return listInstanceResponse;
	}
}