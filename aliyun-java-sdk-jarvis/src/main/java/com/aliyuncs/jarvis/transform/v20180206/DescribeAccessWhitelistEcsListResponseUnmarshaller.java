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

package com.aliyuncs.jarvis.transform.v20180206;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.jarvis.model.v20180206.DescribeAccessWhitelistEcsListResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeAccessWhitelistEcsListResponse.Ecs;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessWhitelistEcsListResponseUnmarshaller {

	public static DescribeAccessWhitelistEcsListResponse unmarshall(DescribeAccessWhitelistEcsListResponse describeAccessWhitelistEcsListResponse, UnmarshallerContext context) {
		
		describeAccessWhitelistEcsListResponse.setRequestId(context.stringValue("DescribeAccessWhitelistEcsListResponse.RequestId"));
		describeAccessWhitelistEcsListResponse.setTotalCount(context.integerValue("DescribeAccessWhitelistEcsListResponse.TotalCount"));
		describeAccessWhitelistEcsListResponse.setModule(context.stringValue("DescribeAccessWhitelistEcsListResponse.module"));

		List<Ecs> ecsList = new ArrayList<Ecs>();
		for (int i = 0; i < context.lengthValue("DescribeAccessWhitelistEcsListResponse.EcsList.Length"); i++) {
			Ecs ecs = new Ecs();
			ecs.setInstanceName(context.stringValue("DescribeAccessWhitelistEcsListResponse.EcsList["+ i +"].InstanceName"));
			ecs.setInstanceId(context.stringValue("DescribeAccessWhitelistEcsListResponse.EcsList["+ i +"].InstanceId"));
			ecs.setIP(context.stringValue("DescribeAccessWhitelistEcsListResponse.EcsList["+ i +"].IP"));

			ecsList.add(ecs);
		}
		describeAccessWhitelistEcsListResponse.setEcsList(ecsList);
	 
	 	return describeAccessWhitelistEcsListResponse;
	}
}