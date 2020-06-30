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

package com.aliyuncs.ddi.transform.v20200617;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddi.model.v20200617.DescribeFlowJobResponse;
import com.aliyuncs.ddi.model.v20200617.DescribeFlowJobResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowJobResponseUnmarshaller {

	public static DescribeFlowJobResponse unmarshall(DescribeFlowJobResponse describeFlowJobResponse, UnmarshallerContext _ctx) {
		
		describeFlowJobResponse.setRequestId(_ctx.stringValue("DescribeFlowJobResponse.RequestId"));
		describeFlowJobResponse.setAdhoc(_ctx.stringValue("DescribeFlowJobResponse.Adhoc"));
		describeFlowJobResponse.setAlertConf(_ctx.stringValue("DescribeFlowJobResponse.AlertConf"));
		describeFlowJobResponse.setCategoryId(_ctx.stringValue("DescribeFlowJobResponse.CategoryId"));
		describeFlowJobResponse.setCustomVariables(_ctx.stringValue("DescribeFlowJobResponse.CustomVariables"));
		describeFlowJobResponse.setDescription(_ctx.stringValue("DescribeFlowJobResponse.Description"));
		describeFlowJobResponse.setEditLockDetail(_ctx.stringValue("DescribeFlowJobResponse.EditLockDetail"));
		describeFlowJobResponse.setEnvConf(_ctx.stringValue("DescribeFlowJobResponse.EnvConf"));
		describeFlowJobResponse.setFailAct(_ctx.stringValue("DescribeFlowJobResponse.FailAct"));
		describeFlowJobResponse.setGmtCreate(_ctx.longValue("DescribeFlowJobResponse.GmtCreate"));
		describeFlowJobResponse.setGmtModified(_ctx.longValue("DescribeFlowJobResponse.GmtModified"));
		describeFlowJobResponse.setId(_ctx.stringValue("DescribeFlowJobResponse.Id"));
		describeFlowJobResponse.setLastInstanceId(_ctx.stringValue("DescribeFlowJobResponse.LastInstanceId"));
		describeFlowJobResponse.setMaxRetry(_ctx.integerValue("DescribeFlowJobResponse.MaxRetry"));
		describeFlowJobResponse.setMaxRunningTimeSec(_ctx.longValue("DescribeFlowJobResponse.MaxRunningTimeSec"));
		describeFlowJobResponse.setMonitorConf(_ctx.stringValue("DescribeFlowJobResponse.MonitorConf"));
		describeFlowJobResponse.setName(_ctx.stringValue("DescribeFlowJobResponse.Name"));
		describeFlowJobResponse.setParamConf(_ctx.stringValue("DescribeFlowJobResponse.ParamConf"));
		describeFlowJobResponse.setParams(_ctx.stringValue("DescribeFlowJobResponse.Params"));
		describeFlowJobResponse.setRetryInterval(_ctx.longValue("DescribeFlowJobResponse.RetryInterval"));
		describeFlowJobResponse.setRetryPolicy(_ctx.stringValue("DescribeFlowJobResponse.RetryPolicy"));
		describeFlowJobResponse.setRunConf(_ctx.stringValue("DescribeFlowJobResponse.RunConf"));
		describeFlowJobResponse.setType(_ctx.stringValue("DescribeFlowJobResponse.Type"));
		describeFlowJobResponse.setMode(_ctx.stringValue("DescribeFlowJobResponse.mode"));

		List<Resource> resourceList = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowJobResponse.ResourceList.Length"); i++) {
			Resource resource = new Resource();
			resource.setAlias(_ctx.stringValue("DescribeFlowJobResponse.ResourceList["+ i +"].Alias"));
			resource.setPath(_ctx.stringValue("DescribeFlowJobResponse.ResourceList["+ i +"].Path"));

			resourceList.add(resource);
		}
		describeFlowJobResponse.setResourceList(resourceList);
	 
	 	return describeFlowJobResponse;
	}
}