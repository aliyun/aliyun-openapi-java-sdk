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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVnInstanceResponseUnmarshaller {

	public static DescribeVnInstanceResponse unmarshall(DescribeVnInstanceResponse describeVnInstanceResponse, UnmarshallerContext context) {
		
		describeVnInstanceResponse.setRequestId(context.stringValue("DescribeVnInstanceResponse.RequestId"));
		describeVnInstanceResponse.setInstanceId(context.stringValue("DescribeVnInstanceResponse.InstanceId"));
		describeVnInstanceResponse.setName(context.stringValue("DescribeVnInstanceResponse.Name"));
		describeVnInstanceResponse.setDescription(context.stringValue("DescribeVnInstanceResponse.Description"));
		describeVnInstanceResponse.setStatus(context.stringValue("DescribeVnInstanceResponse.Status"));
		describeVnInstanceResponse.setConcurrency(context.longValue("DescribeVnInstanceResponse.Concurrency"));
		describeVnInstanceResponse.setModifyTime(context.longValue("DescribeVnInstanceResponse.ModifyTime"));
		describeVnInstanceResponse.setModifyUserName(context.stringValue("DescribeVnInstanceResponse.ModifyUserName"));
		describeVnInstanceResponse.setNluServiceType(context.stringValue("DescribeVnInstanceResponse.NluServiceType"));

		List<String> applicableOperations = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeVnInstanceResponse.ApplicableOperations.Length"); i++) {
			applicableOperations.add(context.stringValue("DescribeVnInstanceResponse.ApplicableOperations["+ i +"]"));
		}
		describeVnInstanceResponse.setApplicableOperations(applicableOperations);
	 
	 	return describeVnInstanceResponse;
	}
}