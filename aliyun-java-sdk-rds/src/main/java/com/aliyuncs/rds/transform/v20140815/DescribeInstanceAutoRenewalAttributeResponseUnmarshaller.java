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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeInstanceAutoRenewalAttributeResponse;
import com.aliyuncs.rds.model.v20140815.DescribeInstanceAutoRenewalAttributeResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAutoRenewalAttributeResponseUnmarshaller {

	public static DescribeInstanceAutoRenewalAttributeResponse unmarshall(DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttributeResponse, UnmarshallerContext context) {
		
		describeInstanceAutoRenewalAttributeResponse.setRequestId(context.stringValue("DescribeInstanceAutoRenewalAttributeResponse.RequestId"));
		describeInstanceAutoRenewalAttributeResponse.setPageNumber(context.integerValue("DescribeInstanceAutoRenewalAttributeResponse.PageNumber"));
		describeInstanceAutoRenewalAttributeResponse.setTotalRecordCount(context.integerValue("DescribeInstanceAutoRenewalAttributeResponse.TotalRecordCount"));
		describeInstanceAutoRenewalAttributeResponse.setPageRecordCount(context.integerValue("DescribeInstanceAutoRenewalAttributeResponse.PageRecordCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceAutoRenewalAttributeResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setDBInstanceId(context.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].DBInstanceId"));
			item.setRegionId(context.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].RegionId"));
			item.setDuration(context.integerValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].Duration"));
			item.setStatus(context.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].Status"));
			item.setAutoRenew(context.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].AutoRenew"));

			items.add(item);
		}
		describeInstanceAutoRenewalAttributeResponse.setItems(items);
	 
	 	return describeInstanceAutoRenewalAttributeResponse;
	}
}