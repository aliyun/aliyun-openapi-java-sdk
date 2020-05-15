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

package com.aliyuncs.voicenavigator.transform.v20180612;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.DescribeInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceResponse.setRequestId(_ctx.stringValue("DescribeInstanceResponse.RequestId"));
		describeInstanceResponse.setInstanceId(_ctx.stringValue("DescribeInstanceResponse.InstanceId"));
		describeInstanceResponse.setName(_ctx.stringValue("DescribeInstanceResponse.Name"));
		describeInstanceResponse.setDescription(_ctx.stringValue("DescribeInstanceResponse.Description"));
		describeInstanceResponse.setStatus(_ctx.stringValue("DescribeInstanceResponse.Status"));
		describeInstanceResponse.setConcurrency(_ctx.longValue("DescribeInstanceResponse.Concurrency"));
		describeInstanceResponse.setModifyTime(_ctx.longValue("DescribeInstanceResponse.ModifyTime"));
		describeInstanceResponse.setModifyUserName(_ctx.stringValue("DescribeInstanceResponse.ModifyUserName"));
		describeInstanceResponse.setNluServiceType(_ctx.stringValue("DescribeInstanceResponse.NluServiceType"));

		List<String> applicableOperations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.ApplicableOperations.Length"); i++) {
			applicableOperations.add(_ctx.stringValue("DescribeInstanceResponse.ApplicableOperations["+ i +"]"));
		}
		describeInstanceResponse.setApplicableOperations(applicableOperations);
	 
	 	return describeInstanceResponse;
	}
}