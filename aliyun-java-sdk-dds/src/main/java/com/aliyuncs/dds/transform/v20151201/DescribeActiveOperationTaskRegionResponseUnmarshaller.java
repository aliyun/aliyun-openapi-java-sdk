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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeActiveOperationTaskRegionResponse;
import com.aliyuncs.dds.model.v20151201.DescribeActiveOperationTaskRegionResponse.Items;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActiveOperationTaskRegionResponseUnmarshaller {

	public static DescribeActiveOperationTaskRegionResponse unmarshall(DescribeActiveOperationTaskRegionResponse describeActiveOperationTaskRegionResponse, UnmarshallerContext context) {
		
		describeActiveOperationTaskRegionResponse.setRequestId(context.stringValue("DescribeActiveOperationTaskRegionResponse.RequestId"));

		List<Items> regionList = new ArrayList<Items>();
		for (int i = 0; i < context.lengthValue("DescribeActiveOperationTaskRegionResponse.RegionList.Length"); i++) {
			Items items = new Items();
			items.setRegion(context.stringValue("DescribeActiveOperationTaskRegionResponse.RegionList["+ i +"].Region"));
			items.setCount(context.integerValue("DescribeActiveOperationTaskRegionResponse.RegionList["+ i +"].Count"));

			regionList.add(items);
		}
		describeActiveOperationTaskRegionResponse.setRegionList(regionList);
	 
	 	return describeActiveOperationTaskRegionResponse;
	}
}