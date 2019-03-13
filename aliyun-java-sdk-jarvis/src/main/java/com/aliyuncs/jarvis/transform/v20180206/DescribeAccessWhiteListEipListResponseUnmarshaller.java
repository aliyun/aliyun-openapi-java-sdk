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

import com.aliyuncs.jarvis.model.v20180206.DescribeAccessWhiteListEipListResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeAccessWhiteListEipListResponse.Ecs;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessWhiteListEipListResponseUnmarshaller {

	public static DescribeAccessWhiteListEipListResponse unmarshall(DescribeAccessWhiteListEipListResponse describeAccessWhiteListEipListResponse, UnmarshallerContext context) {
		
		describeAccessWhiteListEipListResponse.setRequestId(context.stringValue("DescribeAccessWhiteListEipListResponse.RequestId"));
		describeAccessWhiteListEipListResponse.setTotalCount(context.integerValue("DescribeAccessWhiteListEipListResponse.TotalCount"));
		describeAccessWhiteListEipListResponse.setModule(context.stringValue("DescribeAccessWhiteListEipListResponse.module"));

		List<Ecs> eipList = new ArrayList<Ecs>();
		for (int i = 0; i < context.lengthValue("DescribeAccessWhiteListEipListResponse.EipList.Length"); i++) {
			Ecs ecs = new Ecs();
			ecs.setInstanceName(context.stringValue("DescribeAccessWhiteListEipListResponse.EipList["+ i +"].InstanceName"));
			ecs.setInstanceId(context.stringValue("DescribeAccessWhiteListEipListResponse.EipList["+ i +"].InstanceId"));
			ecs.setIP(context.stringValue("DescribeAccessWhiteListEipListResponse.EipList["+ i +"].IP"));
			ecs.setRegion(context.stringValue("DescribeAccessWhiteListEipListResponse.EipList["+ i +"].Region"));
			ecs.setItemSign(context.stringValue("DescribeAccessWhiteListEipListResponse.EipList["+ i +"].ItemSign"));

			eipList.add(ecs);
		}
		describeAccessWhiteListEipListResponse.setEipList(eipList);
	 
	 	return describeAccessWhiteListEipListResponse;
	}
}