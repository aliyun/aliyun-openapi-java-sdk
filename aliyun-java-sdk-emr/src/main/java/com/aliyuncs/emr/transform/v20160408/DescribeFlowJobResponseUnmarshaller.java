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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeFlowJobResponse;
import com.aliyuncs.emr.model.v20160408.DescribeFlowJobResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowJobResponseUnmarshaller {

	public static DescribeFlowJobResponse unmarshall(DescribeFlowJobResponse describeFlowJobResponse, UnmarshallerContext _ctx) {
		
		describeFlowJobResponse.setRequestId(_ctx.stringValue("DescribeFlowJobResponse.RequestId"));
		describeFlowJobResponse.setId(_ctx.stringValue("DescribeFlowJobResponse.Id"));
		describeFlowJobResponse.setGmtCreate(_ctx.longValue("DescribeFlowJobResponse.GmtCreate"));
		describeFlowJobResponse.setGmtModified(_ctx.longValue("DescribeFlowJobResponse.GmtModified"));
		describeFlowJobResponse.setName(_ctx.stringValue("DescribeFlowJobResponse.Name"));
		describeFlowJobResponse.setType(_ctx.stringValue("DescribeFlowJobResponse.Type"));
		describeFlowJobResponse.setDescription(_ctx.stringValue("DescribeFlowJobResponse.Description"));
		describeFlowJobResponse.setFailAct(_ctx.stringValue("DescribeFlowJobResponse.FailAct"));
		describeFlowJobResponse.setMaxRetry(_ctx.integerValue("DescribeFlowJobResponse.MaxRetry"));
		describeFlowJobResponse.setRetryInterval(_ctx.longValue("DescribeFlowJobResponse.RetryInterval"));
		describeFlowJobResponse.setParams(_ctx.stringValue("DescribeFlowJobResponse.Params"));
		describeFlowJobResponse.setParamConf(_ctx.stringValue("DescribeFlowJobResponse.ParamConf"));
		describeFlowJobResponse.setCustomVariables(_ctx.stringValue("DescribeFlowJobResponse.CustomVariables"));
		describeFlowJobResponse.setEnvConf(_ctx.stringValue("DescribeFlowJobResponse.EnvConf"));
		describeFlowJobResponse.setRunConf(_ctx.stringValue("DescribeFlowJobResponse.RunConf"));
		describeFlowJobResponse.setMonitorConf(_ctx.stringValue("DescribeFlowJobResponse.MonitorConf"));
		describeFlowJobResponse.setCategoryId(_ctx.stringValue("DescribeFlowJobResponse.CategoryId"));
		describeFlowJobResponse.setMode(_ctx.stringValue("DescribeFlowJobResponse.mode"));
		describeFlowJobResponse.setLastInstanceId(_ctx.stringValue("DescribeFlowJobResponse.LastInstanceId"));
		describeFlowJobResponse.setAdhoc(_ctx.stringValue("DescribeFlowJobResponse.Adhoc"));
		describeFlowJobResponse.setAlertConf(_ctx.stringValue("DescribeFlowJobResponse.AlertConf"));

		List<Resource> resourceList = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowJobResponse.ResourceList.Length"); i++) {
			Resource resource = new Resource();
			resource.setPath(_ctx.stringValue("DescribeFlowJobResponse.ResourceList["+ i +"].Path"));
			resource.setAlias(_ctx.stringValue("DescribeFlowJobResponse.ResourceList["+ i +"].Alias"));

			resourceList.add(resource);
		}
		describeFlowJobResponse.setResourceList(resourceList);
	 
	 	return describeFlowJobResponse;
	}
}