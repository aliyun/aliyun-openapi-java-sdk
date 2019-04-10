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

package com.aliyuncs.ehpc.transform.v20180412;

import com.aliyuncs.ehpc.model.v20180412.DescribeJobResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribeJobResponse.Message;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobResponseUnmarshaller {

	public static DescribeJobResponse unmarshall(DescribeJobResponse describeJobResponse, UnmarshallerContext context) {
		
		describeJobResponse.setRequestId(context.stringValue("DescribeJobResponse.RequestId"));

		Message message = new Message();
		message.setJobInfo(context.stringValue("DescribeJobResponse.Message.JobInfo"));
		describeJobResponse.setMessage(message);
	 
	 	return describeJobResponse;
	}
}