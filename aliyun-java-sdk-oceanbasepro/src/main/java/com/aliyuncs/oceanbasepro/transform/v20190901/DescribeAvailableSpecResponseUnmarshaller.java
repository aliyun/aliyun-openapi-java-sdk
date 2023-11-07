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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableSpecResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableSpecResponse.Data;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableSpecResponse.Data.AvailableSpecificationsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableSpecResponse.Data.AvailableSpecificationsItem.DiskSizeRange;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableSpecResponse.Data.AvailableSpecificationsItem.LogDiskSizeRange;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableSpecResponseUnmarshaller {

	public static DescribeAvailableSpecResponse unmarshall(DescribeAvailableSpecResponse describeAvailableSpecResponse, UnmarshallerContext _ctx) {
		
		describeAvailableSpecResponse.setRequestId(_ctx.stringValue("DescribeAvailableSpecResponse.RequestId"));

		Data data = new Data();

		List<AvailableSpecificationsItem> availableSpecifications = new ArrayList<AvailableSpecificationsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableSpecResponse.Data.AvailableSpecifications.Length"); i++) {
			AvailableSpecificationsItem availableSpecificationsItem = new AvailableSpecificationsItem();
			availableSpecificationsItem.setSpec(_ctx.stringValue("DescribeAvailableSpecResponse.Data.AvailableSpecifications["+ i +"].Spec"));
			availableSpecificationsItem.setInstanceClass(_ctx.stringValue("DescribeAvailableSpecResponse.Data.AvailableSpecifications["+ i +"].InstanceClass"));

			List<Integer> nodeNum = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableSpecResponse.Data.AvailableSpecifications["+ i +"].NodeNum.Length"); j++) {
				nodeNum.add(_ctx.integerValue("DescribeAvailableSpecResponse.Data.AvailableSpecifications["+ i +"].NodeNum["+ j +"]"));
			}
			availableSpecificationsItem.setNodeNum(nodeNum);

			DiskSizeRange diskSizeRange = new DiskSizeRange();
			diskSizeRange.setStep(_ctx.longValue("DescribeAvailableSpecResponse.Data.AvailableSpecifications["+ i +"].DiskSizeRange.Step"));
			diskSizeRange.setMax(_ctx.longValue("DescribeAvailableSpecResponse.Data.AvailableSpecifications["+ i +"].DiskSizeRange.Max"));
			diskSizeRange.setMin(_ctx.longValue("DescribeAvailableSpecResponse.Data.AvailableSpecifications["+ i +"].DiskSizeRange.Min"));
			availableSpecificationsItem.setDiskSizeRange(diskSizeRange);

			LogDiskSizeRange logDiskSizeRange = new LogDiskSizeRange();
			logDiskSizeRange.setStep(_ctx.longValue("DescribeAvailableSpecResponse.Data.AvailableSpecifications["+ i +"].LogDiskSizeRange.Step"));
			logDiskSizeRange.setMax(_ctx.longValue("DescribeAvailableSpecResponse.Data.AvailableSpecifications["+ i +"].LogDiskSizeRange.Max"));
			logDiskSizeRange.setMin(_ctx.longValue("DescribeAvailableSpecResponse.Data.AvailableSpecifications["+ i +"].LogDiskSizeRange.Min"));
			availableSpecificationsItem.setLogDiskSizeRange(logDiskSizeRange);

			availableSpecifications.add(availableSpecificationsItem);
		}
		data.setAvailableSpecifications(availableSpecifications);
		describeAvailableSpecResponse.setData(data);
	 
	 	return describeAvailableSpecResponse;
	}
}