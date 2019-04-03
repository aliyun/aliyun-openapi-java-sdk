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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeCanExpandInstanceDetailListResponse;
import com.aliyuncs.drds.model.v20190123.DescribeCanExpandInstanceDetailListResponse.ItemData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCanExpandInstanceDetailListResponseUnmarshaller {

	public static DescribeCanExpandInstanceDetailListResponse unmarshall(DescribeCanExpandInstanceDetailListResponse describeCanExpandInstanceDetailListResponse, UnmarshallerContext context) {
		
		describeCanExpandInstanceDetailListResponse.setRequestId(context.stringValue("DescribeCanExpandInstanceDetailListResponse.RequestId"));
		describeCanExpandInstanceDetailListResponse.setSuccess(context.booleanValue("DescribeCanExpandInstanceDetailListResponse.Success"));

		List<ItemData> data = new ArrayList<ItemData>();
		for (int i = 0; i < context.lengthValue("DescribeCanExpandInstanceDetailListResponse.Data.Length"); i++) {
			ItemData itemData = new ItemData();
			itemData.setSrcInstance(context.stringValue("DescribeCanExpandInstanceDetailListResponse.Data["+ i +"].SrcInstance"));

			List<String> dbList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeCanExpandInstanceDetailListResponse.Data["+ i +"].DbList.Length"); j++) {
				dbList.add(context.stringValue("DescribeCanExpandInstanceDetailListResponse.Data["+ i +"].DbList["+ j +"]"));
			}
			itemData.setDbList(dbList);

			data.add(itemData);
		}
		describeCanExpandInstanceDetailListResponse.setData(data);
	 
	 	return describeCanExpandInstanceDetailListResponse;
	}
}