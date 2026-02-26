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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSessionListResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSessionListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSessionListResponseUnmarshaller {

	public static DescribeSessionListResponse unmarshall(DescribeSessionListResponse describeSessionListResponse, UnmarshallerContext _ctx) {
		
		describeSessionListResponse.setRequestId(_ctx.stringValue("DescribeSessionListResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSessionListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSessionId(_ctx.stringValue("DescribeSessionListResponse.Data["+ i +"].SessionId"));
			dataItem.setHost(_ctx.stringValue("DescribeSessionListResponse.Data["+ i +"].Host"));

			data.add(dataItem);
		}
		describeSessionListResponse.setData(data);
	 
	 	return describeSessionListResponse;
	}
}