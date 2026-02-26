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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvicesIndexResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvicesIndexResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAdvicesIndexResponseUnmarshaller {

	public static DescribeAdvicesIndexResponse unmarshall(DescribeAdvicesIndexResponse describeAdvicesIndexResponse, UnmarshallerContext _ctx) {
		
		describeAdvicesIndexResponse.setRequestId(_ctx.stringValue("DescribeAdvicesIndexResponse.RequestId"));
		describeAdvicesIndexResponse.setProductStatus(_ctx.stringValue("DescribeAdvicesIndexResponse.ProductStatus"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAdvicesIndexResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCode(_ctx.stringValue("DescribeAdvicesIndexResponse.Data["+ i +"].Code"));
			dataItem.setHasMore(_ctx.booleanValue("DescribeAdvicesIndexResponse.Data["+ i +"].HasMore"));
			dataItem.setSize(_ctx.integerValue("DescribeAdvicesIndexResponse.Data["+ i +"].Size"));

			data.add(dataItem);
		}
		describeAdvicesIndexResponse.setData(data);
	 
	 	return describeAdvicesIndexResponse;
	}
}