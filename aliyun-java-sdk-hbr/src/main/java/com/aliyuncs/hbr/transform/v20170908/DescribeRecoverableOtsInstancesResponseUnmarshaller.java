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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeRecoverableOtsInstancesResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeRecoverableOtsInstancesResponse.OtsInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecoverableOtsInstancesResponseUnmarshaller {

	public static DescribeRecoverableOtsInstancesResponse unmarshall(DescribeRecoverableOtsInstancesResponse describeRecoverableOtsInstancesResponse, UnmarshallerContext _ctx) {
		
		describeRecoverableOtsInstancesResponse.setRequestId(_ctx.stringValue("DescribeRecoverableOtsInstancesResponse.RequestId"));
		describeRecoverableOtsInstancesResponse.setSuccess(_ctx.booleanValue("DescribeRecoverableOtsInstancesResponse.Success"));
		describeRecoverableOtsInstancesResponse.setCode(_ctx.stringValue("DescribeRecoverableOtsInstancesResponse.Code"));
		describeRecoverableOtsInstancesResponse.setMessage(_ctx.stringValue("DescribeRecoverableOtsInstancesResponse.Message"));

		List<OtsInstance> otsInstances = new ArrayList<OtsInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecoverableOtsInstancesResponse.OtsInstances.Length"); i++) {
			OtsInstance otsInstance = new OtsInstance();
			otsInstance.setInstanceName(_ctx.stringValue("DescribeRecoverableOtsInstancesResponse.OtsInstances["+ i +"].InstanceName"));

			List<String> tableNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecoverableOtsInstancesResponse.OtsInstances["+ i +"].TableNames.Length"); j++) {
				tableNames.add(_ctx.stringValue("DescribeRecoverableOtsInstancesResponse.OtsInstances["+ i +"].TableNames["+ j +"]"));
			}
			otsInstance.setTableNames(tableNames);

			otsInstances.add(otsInstance);
		}
		describeRecoverableOtsInstancesResponse.setOtsInstances(otsInstances);
	 
	 	return describeRecoverableOtsInstancesResponse;
	}
}