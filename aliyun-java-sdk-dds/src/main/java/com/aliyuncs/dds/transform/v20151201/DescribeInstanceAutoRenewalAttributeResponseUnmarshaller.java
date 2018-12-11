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

import com.aliyuncs.dds.model.v20151201.DescribeInstanceAutoRenewalAttributeResponse;
import com.aliyuncs.dds.model.v20151201.DescribeInstanceAutoRenewalAttributeResponse.Item;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAutoRenewalAttributeResponseUnmarshaller {

	public static DescribeInstanceAutoRenewalAttributeResponse unmarshall(DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttributeResponse, UnmarshallerContext context) {
		
		describeInstanceAutoRenewalAttributeResponse.setRequestId(context.stringValue("DescribeInstanceAutoRenewalAttributeResponse.RequestId"));
		describeInstanceAutoRenewalAttributeResponse.setPageNumber(context.integerValue("DescribeInstanceAutoRenewalAttributeResponse.PageNumber"));
		describeInstanceAutoRenewalAttributeResponse.setPageRecordCount(context.integerValue("DescribeInstanceAutoRenewalAttributeResponse.PageRecordCount"));
		describeInstanceAutoRenewalAttributeResponse.setItemsNumbers(context.integerValue("DescribeInstanceAutoRenewalAttributeResponse.ItemsNumbers"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceAutoRenewalAttributeResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setDbInstanceId(context.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].DbInstanceId"));
			item.setRegionId(context.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].RegionId"));
			item.setDuration(context.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].Duration"));
			item.setAutoRenew(context.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].AutoRenew"));
			item.setDBInstanceType(context.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].DBInstanceType"));

			items.add(item);
		}
		describeInstanceAutoRenewalAttributeResponse.setItems(items);
	 
	 	return describeInstanceAutoRenewalAttributeResponse;
	}
}