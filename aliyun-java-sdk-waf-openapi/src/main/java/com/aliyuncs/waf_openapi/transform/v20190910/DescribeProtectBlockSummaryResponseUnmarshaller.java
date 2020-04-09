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

package com.aliyuncs.waf_openapi.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.waf_openapi.model.v20190910.DescribeProtectBlockSummaryResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeProtectBlockSummaryResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProtectBlockSummaryResponseUnmarshaller {

	public static DescribeProtectBlockSummaryResponse unmarshall(DescribeProtectBlockSummaryResponse describeProtectBlockSummaryResponse, UnmarshallerContext _ctx) {
		
		describeProtectBlockSummaryResponse.setRequestId(_ctx.stringValue("DescribeProtectBlockSummaryResponse.RequestId"));

		List<Item> protectBlockSummarys = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProtectBlockSummaryResponse.ProtectBlockSummarys.Length"); i++) {
			Item item = new Item();
			item.setBlockPv(_ctx.longValue("DescribeProtectBlockSummaryResponse.ProtectBlockSummarys["+ i +"].BlockPv"));
			item.setIndex(_ctx.longValue("DescribeProtectBlockSummaryResponse.ProtectBlockSummarys["+ i +"].Index"));
			item.setAllPv(_ctx.longValue("DescribeProtectBlockSummaryResponse.ProtectBlockSummarys["+ i +"].AllPv"));

			protectBlockSummarys.add(item);
		}
		describeProtectBlockSummaryResponse.setProtectBlockSummarys(protectBlockSummarys);
	 
	 	return describeProtectBlockSummaryResponse;
	}
}