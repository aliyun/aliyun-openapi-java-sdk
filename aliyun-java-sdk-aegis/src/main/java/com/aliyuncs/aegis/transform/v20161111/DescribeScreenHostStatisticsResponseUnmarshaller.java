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

import com.aliyuncs.aegis.model.v20161111.DescribeScreenHostStatisticsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeScreenHostStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScreenHostStatisticsResponseUnmarshaller {

	public static DescribeScreenHostStatisticsResponse unmarshall(DescribeScreenHostStatisticsResponse describeScreenHostStatisticsResponse, UnmarshallerContext context) {
		
		describeScreenHostStatisticsResponse.setRequestId(context.stringValue("DescribeScreenHostStatisticsResponse.RequestId"));

		Data data = new Data();

		List<String> weaknessUuids = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenHostStatisticsResponse.Data.WeaknessUuids.Length"); i++) {
			weaknessUuids.add(context.stringValue("DescribeScreenHostStatisticsResponse.Data.WeaknessUuids["+ i +"]"));
		}
		data.setWeaknessUuids(weaknessUuids);

		List<String> suspEventUuids = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenHostStatisticsResponse.Data.SuspEventUuids.Length"); i++) {
			suspEventUuids.add(context.stringValue("DescribeScreenHostStatisticsResponse.Data.SuspEventUuids["+ i +"]"));
		}
		data.setSuspEventUuids(suspEventUuids);

		List<String> suspEventMachineNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenHostStatisticsResponse.Data.SuspEventMachineNames.Length"); i++) {
			suspEventMachineNames.add(context.stringValue("DescribeScreenHostStatisticsResponse.Data.SuspEventMachineNames["+ i +"]"));
		}
		data.setSuspEventMachineNames(suspEventMachineNames);

		List<String> weaknessMachineNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenHostStatisticsResponse.Data.WeaknessMachineNames.Length"); i++) {
			weaknessMachineNames.add(context.stringValue("DescribeScreenHostStatisticsResponse.Data.WeaknessMachineNames["+ i +"]"));
		}
		data.setWeaknessMachineNames(weaknessMachineNames);
		describeScreenHostStatisticsResponse.setData(data);
	 
	 	return describeScreenHostStatisticsResponse;
	}
}