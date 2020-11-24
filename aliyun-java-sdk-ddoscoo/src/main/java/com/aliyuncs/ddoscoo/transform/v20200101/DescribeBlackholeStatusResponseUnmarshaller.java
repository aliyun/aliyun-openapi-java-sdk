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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeBlackholeStatusResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeBlackholeStatusResponse.BlackholeStatusItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBlackholeStatusResponseUnmarshaller {

	public static DescribeBlackholeStatusResponse unmarshall(DescribeBlackholeStatusResponse describeBlackholeStatusResponse, UnmarshallerContext _ctx) {
		
		describeBlackholeStatusResponse.setRequestId(_ctx.stringValue("DescribeBlackholeStatusResponse.RequestId"));

		List<BlackholeStatusItem> blackholeStatus = new ArrayList<BlackholeStatusItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBlackholeStatusResponse.BlackholeStatus.Length"); i++) {
			BlackholeStatusItem blackholeStatusItem = new BlackholeStatusItem();
			blackholeStatusItem.setStartTime(_ctx.longValue("DescribeBlackholeStatusResponse.BlackholeStatus["+ i +"].StartTime"));
			blackholeStatusItem.setEndTime(_ctx.longValue("DescribeBlackholeStatusResponse.BlackholeStatus["+ i +"].EndTime"));
			blackholeStatusItem.setIp(_ctx.stringValue("DescribeBlackholeStatusResponse.BlackholeStatus["+ i +"].Ip"));
			blackholeStatusItem.setBlackStatus(_ctx.stringValue("DescribeBlackholeStatusResponse.BlackholeStatus["+ i +"].BlackStatus"));

			blackholeStatus.add(blackholeStatusItem);
		}
		describeBlackholeStatusResponse.setBlackholeStatus(blackholeStatus);
	 
	 	return describeBlackholeStatusResponse;
	}
}