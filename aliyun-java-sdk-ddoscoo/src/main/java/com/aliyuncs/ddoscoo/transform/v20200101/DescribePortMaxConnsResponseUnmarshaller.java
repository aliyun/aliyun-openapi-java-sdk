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

import com.aliyuncs.ddoscoo.model.v20200101.DescribePortMaxConnsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribePortMaxConnsResponse.PortMaxConnsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePortMaxConnsResponseUnmarshaller {

	public static DescribePortMaxConnsResponse unmarshall(DescribePortMaxConnsResponse describePortMaxConnsResponse, UnmarshallerContext _ctx) {
		
		describePortMaxConnsResponse.setRequestId(_ctx.stringValue("DescribePortMaxConnsResponse.RequestId"));

		List<PortMaxConnsItem> portMaxConns = new ArrayList<PortMaxConnsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePortMaxConnsResponse.PortMaxConns.Length"); i++) {
			PortMaxConnsItem portMaxConnsItem = new PortMaxConnsItem();
			portMaxConnsItem.setPort(_ctx.stringValue("DescribePortMaxConnsResponse.PortMaxConns["+ i +"].Port"));
			portMaxConnsItem.setIp(_ctx.stringValue("DescribePortMaxConnsResponse.PortMaxConns["+ i +"].Ip"));
			portMaxConnsItem.setCps(_ctx.longValue("DescribePortMaxConnsResponse.PortMaxConns["+ i +"].Cps"));

			portMaxConns.add(portMaxConnsItem);
		}
		describePortMaxConnsResponse.setPortMaxConns(portMaxConns);
	 
	 	return describePortMaxConnsResponse;
	}
}