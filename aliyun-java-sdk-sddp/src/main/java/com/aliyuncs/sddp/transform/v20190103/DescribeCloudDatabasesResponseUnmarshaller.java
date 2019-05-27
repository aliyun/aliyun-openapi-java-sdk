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

import com.aliyuncs.sddp.model.v20190103.DescribeCloudDatabasesResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeCloudDatabasesResponse.CloudDatabase;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudDatabasesResponseUnmarshaller {

	public static DescribeCloudDatabasesResponse unmarshall(DescribeCloudDatabasesResponse describeCloudDatabasesResponse, UnmarshallerContext context) {
		
		describeCloudDatabasesResponse.setRequestId(context.stringValue("DescribeCloudDatabasesResponse.RequestId"));

		List<CloudDatabase> cloudDatabaseList = new ArrayList<CloudDatabase>();
		for (int i = 0; i < context.lengthValue("DescribeCloudDatabasesResponse.CloudDatabaseList.Length"); i++) {
			CloudDatabase cloudDatabase = new CloudDatabase();
			cloudDatabase.setEngine(context.stringValue("DescribeCloudDatabasesResponse.CloudDatabaseList["+ i +"].Engine"));
			cloudDatabase.setName(context.stringValue("DescribeCloudDatabasesResponse.CloudDatabaseList["+ i +"].Name"));
			cloudDatabase.setInstanceId(context.stringValue("DescribeCloudDatabasesResponse.CloudDatabaseList["+ i +"].InstanceId"));

			cloudDatabaseList.add(cloudDatabase);
		}
		describeCloudDatabasesResponse.setCloudDatabaseList(cloudDatabaseList);
	 
	 	return describeCloudDatabasesResponse;
	}
}