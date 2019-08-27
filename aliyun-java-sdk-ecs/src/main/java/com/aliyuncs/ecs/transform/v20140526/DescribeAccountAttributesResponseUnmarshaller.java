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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeAccountAttributesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeAccountAttributesResponse.AccountAttributeItem;
import com.aliyuncs.ecs.model.v20140526.DescribeAccountAttributesResponse.AccountAttributeItem.ValueItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountAttributesResponseUnmarshaller {

	public static DescribeAccountAttributesResponse unmarshall(DescribeAccountAttributesResponse describeAccountAttributesResponse, UnmarshallerContext _ctx) {
		
		describeAccountAttributesResponse.setRequestId(_ctx.stringValue("DescribeAccountAttributesResponse.RequestId"));

		List<AccountAttributeItem> accountAttributeItems = new ArrayList<AccountAttributeItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountAttributesResponse.AccountAttributeItems.Length"); i++) {
			AccountAttributeItem accountAttributeItem = new AccountAttributeItem();
			accountAttributeItem.setAttributeName(_ctx.stringValue("DescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeName"));

			List<ValueItem> attributeValues = new ArrayList<ValueItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues.Length"); j++) {
				ValueItem valueItem = new ValueItem();
				valueItem.setValue(_ctx.stringValue("DescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues["+ j +"].Value"));
				valueItem.setExpiredTime(_ctx.stringValue("DescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues["+ j +"].ExpiredTime"));
				valueItem.setZoneId(_ctx.stringValue("DescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues["+ j +"].ZoneId"));
				valueItem.setInstanceChargeType(_ctx.stringValue("DescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues["+ j +"].InstanceChargeType"));
				valueItem.setInstanceType(_ctx.stringValue("DescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues["+ j +"].InstanceType"));
				valueItem.setCount(_ctx.integerValue("DescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues["+ j +"].Count"));

				attributeValues.add(valueItem);
			}
			accountAttributeItem.setAttributeValues(attributeValues);

			accountAttributeItems.add(accountAttributeItem);
		}
		describeAccountAttributesResponse.setAccountAttributeItems(accountAttributeItems);
	 
	 	return describeAccountAttributesResponse;
	}
}