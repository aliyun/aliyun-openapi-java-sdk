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

	public static ListInstanceResponse unmarshall(ListInstanceResponse listInstanceResponse, UnmarshallerContext context) {
		
		listInstanceResponse.setRequestId(context.stringValue("ListInstanceResponse.RequestId"));
		listInstanceResponse.setPageIndex(context.integerValue("ListInstanceResponse.PageIndex"));
		listInstanceResponse.setPageSize(context.integerValue("ListInstanceResponse.PageSize"));
		listInstanceResponse.setTotalPage(context.integerValue("ListInstanceResponse.TotalPage"));
		listInstanceResponse.setTotalCount(context.longValue("ListInstanceResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("ListInstanceResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setId(context.longValue("ListInstanceResponse.Instances["+ i +"].Id"));
			instance.setProjectName(context.stringValue("ListInstanceResponse.Instances["+ i +"].ProjectName"));
			instance.setJobName(context.stringValue("ListInstanceResponse.Instances["+ i +"].JobName"));
			instance.setActualState(context.stringValue("ListInstanceResponse.Instances["+ i +"].ActualState"));
			instance.setExpectState(context.stringValue("ListInstanceResponse.Instances["+ i +"].ExpectState"));
			instance.setJobType(context.stringValue("ListInstanceResponse.Instances["+ i +"].JobType"));
			instance.setApiType(context.stringValue("ListInstanceResponse.Instances["+ i +"].ApiType"));
			instance.setCode(context.stringValue("ListInstanceResponse.Instances["+ i +"].Code"));
			instance.setProperties(context.stringValue("ListInstanceResponse.Instances["+ i +"].Properties"));
			instance.setPackages(context.stringValue("ListInstanceResponse.Instances["+ i +"].Packages"));
			instance.setStarter(context.stringValue("ListInstanceResponse.Instances["+ i +"].Starter"));
			instance.setStartTime(context.longValue("ListInstanceResponse.Instances["+ i +"].StartTime"));
			instance.setLastErrorTime(context.longValue("ListInstanceResponse.Instances["+ i +"].LastErrorTime"));
			instance.setLastErrorMessage(context.stringValue("ListInstanceResponse.Instances["+ i +"].LastErrorMessage"));
			instance.setLastOperator(context.stringValue("ListInstanceResponse.Instances["+ i +"].LastOperator"));
			instance.setLastOperateTime(context.longValue("ListInstanceResponse.Instances["+ i +"].LastOperateTime"));
			instance.setPlanJson(context.stringValue("ListInstanceResponse.Instances["+ i +"].PlanJson"));
			instance.setEngineVersion(context.stringValue("ListInstanceResponse.Instances["+ i +"].EngineVersion"));
			instance.setEngineJobHandler(context.stringValue("ListInstanceResponse.Instances["+ i +"].EngineJobHandler"));
			instance.setInputDelay(context.longValue("ListInstanceResponse.Instances["+ i +"].InputDelay"));
			instance.setClusterId(context.stringValue("ListInstanceResponse.Instances["+ i +"].ClusterId"));
			instance.setQueueName(context.stringValue("ListInstanceResponse.Instances["+ i +"].QueueName"));
			instance.setEndTime(context.longValue("ListInstanceResponse.Instances["+ i +"].EndTime"));

			instances.add(instance);
		}
		listInstanceResponse.setInstances(instances);
	 
	 	return listInstanceResponse;
	}
}