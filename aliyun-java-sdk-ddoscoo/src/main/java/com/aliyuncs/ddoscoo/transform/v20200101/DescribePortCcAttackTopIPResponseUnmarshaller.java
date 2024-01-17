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

import com.aliyuncs.ddoscoo.model.v20200101.DescribePortCcAttackTopIPResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribePortCcAttackTopIPResponse.TopIpItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePortCcAttackTopIPResponseUnmarshaller {

	public static DescribePortCcAttackTopIPResponse unmarshall(DescribePortCcAttackTopIPResponse describePortCcAttackTopIPResponse, UnmarshallerContext _ctx) {
		
		describePortCcAttackTopIPResponse.setRequestId(_ctx.stringValue("DescribePortCcAttackTopIPResponse.RequestId"));

		List<TopIpItem> topIp = new ArrayList<TopIpItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePortCcAttackTopIPResponse.TopIp.Length"); i++) {
			TopIpItem topIpItem = new TopIpItem();
			topIpItem.setSrcIp(_ctx.stringValue("DescribePortCcAttackTopIPResponse.TopIp["+ i +"].SrcIp"));
			topIpItem.setPv(_ctx.longValue("DescribePortCcAttackTopIPResponse.TopIp["+ i +"].Pv"));
			topIpItem.setAreaId(_ctx.stringValue("DescribePortCcAttackTopIPResponse.TopIp["+ i +"].AreaId"));

			topIp.add(topIpItem);
		}
		describePortCcAttackTopIPResponse.setTopIp(topIp);
	 
	 	return describePortCcAttackTopIPResponse;
	}
}