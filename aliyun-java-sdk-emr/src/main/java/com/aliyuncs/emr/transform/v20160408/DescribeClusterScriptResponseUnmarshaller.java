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

import com.aliyuncs.emr.model.v20160408.DescribeClusterScriptResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterScriptResponse.ScriptNodeInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterScriptResponseUnmarshaller {

	public static DescribeClusterScriptResponse unmarshall(DescribeClusterScriptResponse describeClusterScriptResponse, UnmarshallerContext _ctx) {
		
		describeClusterScriptResponse.setRequestId(_ctx.stringValue("DescribeClusterScriptResponse.RequestId"));

		List<ScriptNodeInstance> scriptNodeInstances = new ArrayList<ScriptNodeInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterScriptResponse.ScriptNodeInstances.Length"); i++) {
			ScriptNodeInstance scriptNodeInstance = new ScriptNodeInstance();
			scriptNodeInstance.setNodeId(_ctx.stringValue("DescribeClusterScriptResponse.ScriptNodeInstances["+ i +"].NodeId"));
			scriptNodeInstance.setNodeIp(_ctx.stringValue("DescribeClusterScriptResponse.ScriptNodeInstances["+ i +"].NodeIp"));
			scriptNodeInstance.setStartTime(_ctx.longValue("DescribeClusterScriptResponse.ScriptNodeInstances["+ i +"].StartTime"));
			scriptNodeInstance.setEndTime(_ctx.longValue("DescribeClusterScriptResponse.ScriptNodeInstances["+ i +"].EndTime"));
			scriptNodeInstance.setStatus(_ctx.stringValue("DescribeClusterScriptResponse.ScriptNodeInstances["+ i +"].Status"));

			scriptNodeInstances.add(scriptNodeInstance);
		}
		describeClusterScriptResponse.setScriptNodeInstances(scriptNodeInstances);
	 
	 	return describeClusterScriptResponse;
	}
}