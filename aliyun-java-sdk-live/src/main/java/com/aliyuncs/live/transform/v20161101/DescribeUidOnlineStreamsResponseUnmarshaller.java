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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeUidOnlineStreamsResponse;
import com.aliyuncs.live.model.v20161101.DescribeUidOnlineStreamsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUidOnlineStreamsResponseUnmarshaller {

	public static DescribeUidOnlineStreamsResponse unmarshall(DescribeUidOnlineStreamsResponse describeUidOnlineStreamsResponse, UnmarshallerContext _ctx) {
		
		describeUidOnlineStreamsResponse.setRequestId(_ctx.stringValue("DescribeUidOnlineStreamsResponse.RequestId"));
		describeUidOnlineStreamsResponse.setTotalNum(_ctx.longValue("DescribeUidOnlineStreamsResponse.TotalNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUidOnlineStreamsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDomainName(_ctx.stringValue("DescribeUidOnlineStreamsResponse.Data["+ i +"].DomainName"));
			dataItem.setAppName(_ctx.stringValue("DescribeUidOnlineStreamsResponse.Data["+ i +"].AppName"));
			dataItem.setStreamName(_ctx.stringValue("DescribeUidOnlineStreamsResponse.Data["+ i +"].StreamName"));

			data.add(dataItem);
		}
		describeUidOnlineStreamsResponse.setData(data);
	 
	 	return describeUidOnlineStreamsResponse;
	}
}