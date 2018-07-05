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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeCapacityHistoryResponse;
import com.aliyuncs.ess.model.v20140828.DescribeCapacityHistoryResponse.CapacityHistoryModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCapacityHistoryResponseUnmarshaller {

	public static DescribeCapacityHistoryResponse unmarshall(DescribeCapacityHistoryResponse describeCapacityHistoryResponse, UnmarshallerContext context) {
		
		describeCapacityHistoryResponse.setRequestId(context.stringValue("DescribeCapacityHistoryResponse.RequestId"));
		describeCapacityHistoryResponse.setTotalCount(context.integerValue("DescribeCapacityHistoryResponse.TotalCount"));
		describeCapacityHistoryResponse.setPageNumber(context.integerValue("DescribeCapacityHistoryResponse.PageNumber"));
		describeCapacityHistoryResponse.setPageSize(context.integerValue("DescribeCapacityHistoryResponse.PageSize"));

		List<CapacityHistoryModel> capacityHistoryItems = new ArrayList<CapacityHistoryModel>();
		for (int i = 0; i < context.lengthValue("DescribeCapacityHistoryResponse.CapacityHistoryItems.Length"); i++) {
			CapacityHistoryModel capacityHistoryModel = new CapacityHistoryModel();
			capacityHistoryModel.setScalingGroupId(context.stringValue("DescribeCapacityHistoryResponse.CapacityHistoryItems["+ i +"].ScalingGroupId"));
			capacityHistoryModel.setTotalCapacity(context.integerValue("DescribeCapacityHistoryResponse.CapacityHistoryItems["+ i +"].TotalCapacity"));
			capacityHistoryModel.setAttachedCapacity(context.integerValue("DescribeCapacityHistoryResponse.CapacityHistoryItems["+ i +"].AttachedCapacity"));
			capacityHistoryModel.setAutoCreatedCapacity(context.integerValue("DescribeCapacityHistoryResponse.CapacityHistoryItems["+ i +"].AutoCreatedCapacity"));
			capacityHistoryModel.setTimestamp(context.stringValue("DescribeCapacityHistoryResponse.CapacityHistoryItems["+ i +"].Timestamp"));

			capacityHistoryItems.add(capacityHistoryModel);
		}
		describeCapacityHistoryResponse.setCapacityHistoryItems(capacityHistoryItems);
	 
	 	return describeCapacityHistoryResponse;
	}
}