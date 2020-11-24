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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeBlockStatusResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeBlockStatusResponse.StatusItem;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeBlockStatusResponse.StatusItem.BlockStatusItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBlockStatusResponseUnmarshaller {

	public static DescribeBlockStatusResponse unmarshall(DescribeBlockStatusResponse describeBlockStatusResponse, UnmarshallerContext _ctx) {
		
		describeBlockStatusResponse.setRequestId(_ctx.stringValue("DescribeBlockStatusResponse.RequestId"));

		List<StatusItem> statusList = new ArrayList<StatusItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBlockStatusResponse.StatusList.Length"); i++) {
			StatusItem statusItem = new StatusItem();
			statusItem.setIp(_ctx.stringValue("DescribeBlockStatusResponse.StatusList["+ i +"].Ip"));

			List<BlockStatusItem> blockStatusList = new ArrayList<BlockStatusItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBlockStatusResponse.StatusList["+ i +"].BlockStatusList.Length"); j++) {
				BlockStatusItem blockStatusItem = new BlockStatusItem();
				blockStatusItem.setStartTime(_ctx.longValue("DescribeBlockStatusResponse.StatusList["+ i +"].BlockStatusList["+ j +"].StartTime"));
				blockStatusItem.setLine(_ctx.stringValue("DescribeBlockStatusResponse.StatusList["+ i +"].BlockStatusList["+ j +"].Line"));
				blockStatusItem.setEndTime(_ctx.longValue("DescribeBlockStatusResponse.StatusList["+ i +"].BlockStatusList["+ j +"].EndTime"));
				blockStatusItem.setBlockStatus(_ctx.stringValue("DescribeBlockStatusResponse.StatusList["+ i +"].BlockStatusList["+ j +"].BlockStatus"));

				blockStatusList.add(blockStatusItem);
			}
			statusItem.setBlockStatusList(blockStatusList);

			statusList.add(statusItem);
		}
		describeBlockStatusResponse.setStatusList(statusList);
	 
	 	return describeBlockStatusResponse;
	}
}