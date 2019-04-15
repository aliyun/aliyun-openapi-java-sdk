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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeLogInfoResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeLogInfoResponse.Item;
import com.aliyuncs.aegis.model.v20161111.DescribeLogInfoResponse.Item.Field;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogInfoResponseUnmarshaller {

	public static DescribeLogInfoResponse unmarshall(DescribeLogInfoResponse describeLogInfoResponse, UnmarshallerContext context) {
		
		describeLogInfoResponse.setRequestId(context.stringValue("DescribeLogInfoResponse.RequestId"));
		describeLogInfoResponse.setTotalCount(context.integerValue("DescribeLogInfoResponse.TotalCount"));

		List<Item> logInfoItems = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeLogInfoResponse.LogInfoItems.Length"); i++) {
			Item item = new Item();
			item.setName(context.stringValue("DescribeLogInfoResponse.LogInfoItems["+ i +"].Name"));
			item.setId(context.stringValue("DescribeLogInfoResponse.LogInfoItems["+ i +"].Id"));

			List<Field> fields = new ArrayList<Field>();
			for (int j = 0; j < context.lengthValue("DescribeLogInfoResponse.LogInfoItems["+ i +"].Fields.Length"); j++) {
				Field field = new Field();
				field.setName(context.stringValue("DescribeLogInfoResponse.LogInfoItems["+ i +"].Fields["+ j +"].Name"));
				field.setType(context.stringValue("DescribeLogInfoResponse.LogInfoItems["+ i +"].Fields["+ j +"].Type"));
				field.setDesc(context.stringValue("DescribeLogInfoResponse.LogInfoItems["+ i +"].Fields["+ j +"].Desc"));

				fields.add(field);
			}
			item.setFields(fields);

			logInfoItems.add(item);
		}
		describeLogInfoResponse.setLogInfoItems(logInfoItems);
	 
	 	return describeLogInfoResponse;
	}
}