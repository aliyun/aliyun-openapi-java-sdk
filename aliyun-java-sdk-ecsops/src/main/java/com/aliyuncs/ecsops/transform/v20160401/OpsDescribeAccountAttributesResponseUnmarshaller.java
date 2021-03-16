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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAccountAttributesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAccountAttributesResponse.AccountAttributeItem;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAccountAttributesResponse.AccountAttributeItem.ValueItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeAccountAttributesResponseUnmarshaller {

	public static OpsDescribeAccountAttributesResponse unmarshall(OpsDescribeAccountAttributesResponse opsDescribeAccountAttributesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeAccountAttributesResponse.setRequestId(_ctx.stringValue("OpsDescribeAccountAttributesResponse.RequestId"));

		List<AccountAttributeItem> accountAttributeItems = new ArrayList<AccountAttributeItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeAccountAttributesResponse.AccountAttributeItems.Length"); i++) {
			AccountAttributeItem accountAttributeItem = new AccountAttributeItem();
			accountAttributeItem.setAttributeName(_ctx.stringValue("OpsDescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeName"));

			List<ValueItem> attributeValues = new ArrayList<ValueItem>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues.Length"); j++) {
				ValueItem valueItem = new ValueItem();
				valueItem.setValue(_ctx.stringValue("OpsDescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues["+ j +"].Value"));
				valueItem.setZoneId(_ctx.stringValue("OpsDescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues["+ j +"].ZoneId"));
				valueItem.setInstanceChargeType(_ctx.stringValue("OpsDescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues["+ j +"].InstanceChargeType"));
				valueItem.setInstanceType(_ctx.stringValue("OpsDescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues["+ j +"].InstanceType"));
				valueItem.setCount(_ctx.integerValue("OpsDescribeAccountAttributesResponse.AccountAttributeItems["+ i +"].AttributeValues["+ j +"].Count"));

				attributeValues.add(valueItem);
			}
			accountAttributeItem.setAttributeValues(attributeValues);

			accountAttributeItems.add(accountAttributeItem);
		}
		opsDescribeAccountAttributesResponse.setAccountAttributeItems(accountAttributeItems);
	 
	 	return opsDescribeAccountAttributesResponse;
	}
}