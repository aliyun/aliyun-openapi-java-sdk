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

import com.aliyuncs.waf_openapi.model.v20190910.DescribeRealProtectSummaryResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeRealProtectSummaryResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRealProtectSummaryResponseUnmarshaller {

	public static DescribeRealProtectSummaryResponse unmarshall(DescribeRealProtectSummaryResponse describeRealProtectSummaryResponse, UnmarshallerContext _ctx) {
		
		describeRealProtectSummaryResponse.setRequestId(_ctx.stringValue("DescribeRealProtectSummaryResponse.RequestId"));

		List<Item> realProtectSummarys = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRealProtectSummaryResponse.RealProtectSummarys.Length"); i++) {
			Item item = new Item();
			item.setAlgorithmPv(_ctx.longValue("DescribeRealProtectSummaryResponse.RealProtectSummarys["+ i +"].AlgorithmPv"));
			item.setJsinjectPv(_ctx.longValue("DescribeRealProtectSummaryResponse.RealProtectSummarys["+ i +"].JsinjectPv"));
			item.setIntelligencePv(_ctx.longValue("DescribeRealProtectSummaryResponse.RealProtectSummarys["+ i +"].IntelligencePv"));
			item.setSdkPv(_ctx.longValue("DescribeRealProtectSummaryResponse.RealProtectSummarys["+ i +"].SdkPv"));
			item.setIndex(_ctx.longValue("DescribeRealProtectSummaryResponse.RealProtectSummarys["+ i +"].Index"));
			item.setQps(_ctx.longValue("DescribeRealProtectSummaryResponse.RealProtectSummarys["+ i +"].Qps"));

			realProtectSummarys.add(item);
		}
		describeRealProtectSummaryResponse.setRealProtectSummarys(realProtectSummarys);
	 
	 	return describeRealProtectSummaryResponse;
	}
}