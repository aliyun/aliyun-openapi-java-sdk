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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeRiskItemTypeResponse;
import com.aliyuncs.sas.model.v20181203.DescribeRiskItemTypeResponse.ItemType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRiskItemTypeResponseUnmarshaller {

	public static DescribeRiskItemTypeResponse unmarshall(DescribeRiskItemTypeResponse describeRiskItemTypeResponse, UnmarshallerContext context) {
		
		describeRiskItemTypeResponse.setRequestId(context.stringValue("DescribeRiskItemTypeResponse.RequestId"));

		List<ItemType> list = new ArrayList<ItemType>();
		for (int i = 0; i < context.lengthValue("DescribeRiskItemTypeResponse.List.Length"); i++) {
			ItemType itemType = new ItemType();
			itemType.setId(context.longValue("DescribeRiskItemTypeResponse.List["+ i +"].Id"));
			itemType.setTitle(context.stringValue("DescribeRiskItemTypeResponse.List["+ i +"].Title"));

			list.add(itemType);
		}
		describeRiskItemTypeResponse.setList(list);
	 
	 	return describeRiskItemTypeResponse;
	}
}