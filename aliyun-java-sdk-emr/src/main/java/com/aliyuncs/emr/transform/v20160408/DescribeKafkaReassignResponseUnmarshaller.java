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

import com.aliyuncs.emr.model.v20160408.DescribeKafkaReassignResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKafkaReassignResponseUnmarshaller {

	public static DescribeKafkaReassignResponse unmarshall(DescribeKafkaReassignResponse describeKafkaReassignResponse, UnmarshallerContext _ctx) {
		
		describeKafkaReassignResponse.setRequestId(_ctx.stringValue("DescribeKafkaReassignResponse.RequestId"));
		describeKafkaReassignResponse.setId(_ctx.stringValue("DescribeKafkaReassignResponse.Id"));
		describeKafkaReassignResponse.setStatus(_ctx.stringValue("DescribeKafkaReassignResponse.Status"));
		describeKafkaReassignResponse.setAssignProcess(_ctx.integerValue("DescribeKafkaReassignResponse.AssignProcess"));
		describeKafkaReassignResponse.setStartTime(_ctx.longValue("DescribeKafkaReassignResponse.StartTime"));
		describeKafkaReassignResponse.setEndTime(_ctx.longValue("DescribeKafkaReassignResponse.EndTime"));
		describeKafkaReassignResponse.setTopicCount(_ctx.integerValue("DescribeKafkaReassignResponse.TopicCount"));
		describeKafkaReassignResponse.setPartitionCount(_ctx.integerValue("DescribeKafkaReassignResponse.PartitionCount"));
		describeKafkaReassignResponse.setThrottle(_ctx.longValue("DescribeKafkaReassignResponse.Throttle"));
	 
	 	return describeKafkaReassignResponse;
	}
}