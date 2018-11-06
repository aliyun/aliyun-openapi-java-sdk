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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeInstanceStatisticsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeInstanceStatisticsResponse.Entity;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceStatisticsResponseUnmarshaller {

	public static DescribeInstanceStatisticsResponse unmarshall(DescribeInstanceStatisticsResponse describeInstanceStatisticsResponse, UnmarshallerContext context) {
		
		describeInstanceStatisticsResponse.setRequestId(context.stringValue("DescribeInstanceStatisticsResponse.RequestId"));

		List<Entity> data = new ArrayList<Entity>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceStatisticsResponse.Data.Length"); i++) {
			Entity entity = new Entity();
			entity.setUuid(context.stringValue("DescribeInstanceStatisticsResponse.Data["+ i +"].Uuid"));
			entity.setAccount(context.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].Account"));
			entity.setHealth(context.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].Health"));
			entity.setTrojan(context.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].Trojan"));
			entity.setSuspicious(context.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].Suspicious"));
			entity.setVul(context.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].Vul"));

			data.add(entity);
		}
		describeInstanceStatisticsResponse.setData(data);
	 
	 	return describeInstanceStatisticsResponse;
	}
}