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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeEslDeviceResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeEslDeviceResponse.EslDetailsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEslDeviceResponseUnmarshaller {

	public static DescribeEslDeviceResponse unmarshall(DescribeEslDeviceResponse describeEslDeviceResponse, UnmarshallerContext _ctx) {
		
		describeEslDeviceResponse.setRequestId(_ctx.stringValue("DescribeEslDeviceResponse.RequestId"));
		describeEslDeviceResponse.setTotalCount(_ctx.longValue("DescribeEslDeviceResponse.TotalCount"));
		describeEslDeviceResponse.setPageSize(_ctx.longValue("DescribeEslDeviceResponse.PageSize"));
		describeEslDeviceResponse.setPageNumber(_ctx.longValue("DescribeEslDeviceResponse.PageNumber"));
		describeEslDeviceResponse.setSuccess(_ctx.booleanValue("DescribeEslDeviceResponse.Success"));

		List<EslDetailsItem> eslDetails = new ArrayList<EslDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEslDeviceResponse.EslDetails.Length"); i++) {
			EslDetailsItem eslDetailsItem = new EslDetailsItem();
			eslDetailsItem.setEslBarCode(_ctx.stringValue("DescribeEslDeviceResponse.EslDetails["+ i +"].EslBarCode"));
			eslDetailsItem.setLastUpdateTime(_ctx.stringValue("DescribeEslDeviceResponse.EslDetails["+ i +"].LastUpdateTime"));
			eslDetailsItem.setItemBarCode(_ctx.longValue("DescribeEslDeviceResponse.EslDetails["+ i +"].ItemBarCode"));
			eslDetailsItem.setItemId(_ctx.longValue("DescribeEslDeviceResponse.EslDetails["+ i +"].ItemId"));
			eslDetailsItem.setItemShortTitle(_ctx.stringValue("DescribeEslDeviceResponse.EslDetails["+ i +"].ItemShortTitle"));
			eslDetailsItem.setStatus(_ctx.stringValue("DescribeEslDeviceResponse.EslDetails["+ i +"].Status"));
			eslDetailsItem.setStoreId(_ctx.stringValue("DescribeEslDeviceResponse.EslDetails["+ i +"].StoreId"));

			eslDetails.add(eslDetailsItem);
		}
		describeEslDeviceResponse.setEslDetails(eslDetails);
	 
	 	return describeEslDeviceResponse;
	}
}