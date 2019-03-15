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

import com.aliyuncs.jarvis.model.v20180206.DescribeAccessWhiteListSlbListResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeAccessWhiteListSlbListResponse.Ecs;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessWhiteListSlbListResponseUnmarshaller {

	public static DescribeAccessWhiteListSlbListResponse unmarshall(DescribeAccessWhiteListSlbListResponse describeAccessWhiteListSlbListResponse, UnmarshallerContext context) {
		
		describeAccessWhiteListSlbListResponse.setRequestId(context.stringValue("DescribeAccessWhiteListSlbListResponse.RequestId"));
		describeAccessWhiteListSlbListResponse.setTotalCount(context.integerValue("DescribeAccessWhiteListSlbListResponse.TotalCount"));
		describeAccessWhiteListSlbListResponse.setModule(context.stringValue("DescribeAccessWhiteListSlbListResponse.module"));

		List<Ecs> slbList = new ArrayList<Ecs>();
		for (int i = 0; i < context.lengthValue("DescribeAccessWhiteListSlbListResponse.SlbList.Length"); i++) {
			Ecs ecs = new Ecs();
			ecs.setInstanceName(context.stringValue("DescribeAccessWhiteListSlbListResponse.SlbList["+ i +"].InstanceName"));
			ecs.setInstanceId(context.stringValue("DescribeAccessWhiteListSlbListResponse.SlbList["+ i +"].InstanceId"));
			ecs.setIP(context.stringValue("DescribeAccessWhiteListSlbListResponse.SlbList["+ i +"].IP"));
			ecs.setRegion(context.stringValue("DescribeAccessWhiteListSlbListResponse.SlbList["+ i +"].Region"));
			ecs.setItemSign(context.stringValue("DescribeAccessWhiteListSlbListResponse.SlbList["+ i +"].ItemSign"));

			slbList.add(ecs);
		}
		describeAccessWhiteListSlbListResponse.setSlbList(slbList);
	 
	 	return describeAccessWhiteListSlbListResponse;
	}
}