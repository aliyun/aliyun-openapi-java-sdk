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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeTransferEventCountsResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeTransferEventCountsResponse.Transfer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTransferEventCountsResponseUnmarshaller {

	public static DescribeTransferEventCountsResponse unmarshall(DescribeTransferEventCountsResponse describeTransferEventCountsResponse, UnmarshallerContext context) {
		
		describeTransferEventCountsResponse.setRequestId(context.stringValue("DescribeTransferEventCountsResponse.RequestId"));

		List<Transfer> transferEventCountList = new ArrayList<Transfer>();
		for (int i = 0; i < context.lengthValue("DescribeTransferEventCountsResponse.TransferEventCountList.Length"); i++) {
			Transfer transfer = new Transfer();
			transfer.setTotalCount(context.longValue("DescribeTransferEventCountsResponse.TransferEventCountList["+ i +"].TotalCount"));
			transfer.setProductCode(context.stringValue("DescribeTransferEventCountsResponse.TransferEventCountList["+ i +"].ProductCode"));
			transfer.setTargetProductCode(context.stringValue("DescribeTransferEventCountsResponse.TransferEventCountList["+ i +"].TargetProductCode"));

			transferEventCountList.add(transfer);
		}
		describeTransferEventCountsResponse.setTransferEventCountList(transferEventCountList);
	 
	 	return describeTransferEventCountsResponse;
	}
}