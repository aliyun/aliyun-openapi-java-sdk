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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeReplicaPerformanceResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeReplicaPerformanceResponse.PerformanceKeys;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeReplicaPerformanceResponse.PerformanceKeys.PerformanceKeyItem;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeReplicaPerformanceResponse.PerformanceKeys.PerformanceKeyItem.PerformanceValues;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeReplicaPerformanceResponse.PerformanceKeys.PerformanceKeyItem.PerformanceValues.PerformanceValueItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicaPerformanceResponseUnmarshaller {

	public static DescribeReplicaPerformanceResponse unmarshall(DescribeReplicaPerformanceResponse describeReplicaPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeReplicaPerformanceResponse.setRequestId(_ctx.stringValue("DescribeReplicaPerformanceResponse.RequestId"));
		describeReplicaPerformanceResponse.setStartTime(_ctx.stringValue("DescribeReplicaPerformanceResponse.StartTime"));
		describeReplicaPerformanceResponse.setEndTime(_ctx.stringValue("DescribeReplicaPerformanceResponse.EndTime"));
		describeReplicaPerformanceResponse.setReplicaId(_ctx.stringValue("DescribeReplicaPerformanceResponse.ReplicaId"));

		PerformanceKeys performanceKeys = new PerformanceKeys();

		List<PerformanceKeyItem> performanceKey = new ArrayList<PerformanceKeyItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReplicaPerformanceResponse.PerformanceKeys.PerformanceKey.Length"); i++) {
			PerformanceKeyItem performanceKeyItem = new PerformanceKeyItem();
			performanceKeyItem.setKey(_ctx.stringValue("DescribeReplicaPerformanceResponse.PerformanceKeys.PerformanceKey["+ i +"].Key"));
			performanceKeyItem.setUnit(_ctx.stringValue("DescribeReplicaPerformanceResponse.PerformanceKeys.PerformanceKey["+ i +"].Unit"));
			performanceKeyItem.setValueFormat(_ctx.stringValue("DescribeReplicaPerformanceResponse.PerformanceKeys.PerformanceKey["+ i +"].ValueFormat"));

			PerformanceValues performanceValues = new PerformanceValues();

			List<PerformanceValueItem> performanceValue = new ArrayList<PerformanceValueItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReplicaPerformanceResponse.PerformanceKeys.PerformanceKey["+ i +"].PerformanceValues.PerformanceValue.Length"); j++) {
				PerformanceValueItem performanceValueItem = new PerformanceValueItem();
				performanceValueItem.setValue(_ctx.stringValue("DescribeReplicaPerformanceResponse.PerformanceKeys.PerformanceKey["+ i +"].PerformanceValues.PerformanceValue["+ j +"].Value"));
				performanceValueItem.setDate(_ctx.stringValue("DescribeReplicaPerformanceResponse.PerformanceKeys.PerformanceKey["+ i +"].PerformanceValues.PerformanceValue["+ j +"].Date"));

				performanceValue.add(performanceValueItem);
			}
			performanceValues.setPerformanceValue(performanceValue);
			performanceKeyItem.setPerformanceValues(performanceValues);

			performanceKey.add(performanceKeyItem);
		}
		performanceKeys.setPerformanceKey(performanceKey);
		describeReplicaPerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeReplicaPerformanceResponse;
	}
}