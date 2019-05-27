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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeCloudInstancesResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeCloudInstancesResponse.CloudInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudInstancesResponseUnmarshaller {

	public static DescribeCloudInstancesResponse unmarshall(DescribeCloudInstancesResponse describeCloudInstancesResponse, UnmarshallerContext context) {
		
		describeCloudInstancesResponse.setRequestId(context.stringValue("DescribeCloudInstancesResponse.RequestId"));

		List<CloudInstance> cloudInstanceList = new ArrayList<CloudInstance>();
		for (int i = 0; i < context.lengthValue("DescribeCloudInstancesResponse.CloudInstanceList.Length"); i++) {
			CloudInstance cloudInstance = new CloudInstance();
			cloudInstance.setEngine(context.stringValue("DescribeCloudInstancesResponse.CloudInstanceList["+ i +"].Engine"));
			cloudInstance.setName(context.stringValue("DescribeCloudInstancesResponse.CloudInstanceList["+ i +"].Name"));
			cloudInstance.setInstanceId(context.stringValue("DescribeCloudInstancesResponse.CloudInstanceList["+ i +"].InstanceId"));

			cloudInstanceList.add(cloudInstance);
		}
		describeCloudInstancesResponse.setCloudInstanceList(cloudInstanceList);
	 
	 	return describeCloudInstancesResponse;
	}
}