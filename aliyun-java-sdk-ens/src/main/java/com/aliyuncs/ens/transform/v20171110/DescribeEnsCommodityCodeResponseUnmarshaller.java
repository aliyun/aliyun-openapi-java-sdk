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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeEnsCommodityCodeResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsCommodityCodeResponse.CommodityCodeInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsCommodityCodeResponseUnmarshaller {

	public static DescribeEnsCommodityCodeResponse unmarshall(DescribeEnsCommodityCodeResponse describeEnsCommodityCodeResponse, UnmarshallerContext _ctx) {
		
		describeEnsCommodityCodeResponse.setRequestId(_ctx.stringValue("DescribeEnsCommodityCodeResponse.RequestId"));

		List<CommodityCodeInfoItem> commodityCodeInfo = new ArrayList<CommodityCodeInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsCommodityCodeResponse.CommodityCodeInfo.Length"); i++) {
			CommodityCodeInfoItem commodityCodeInfoItem = new CommodityCodeInfoItem();
			commodityCodeInfoItem.setCommodityCode(_ctx.stringValue("DescribeEnsCommodityCodeResponse.CommodityCodeInfo["+ i +"].CommodityCode"));
			commodityCodeInfoItem.setCommodityName(_ctx.stringValue("DescribeEnsCommodityCodeResponse.CommodityCodeInfo["+ i +"].CommodityName"));

			commodityCodeInfo.add(commodityCodeInfoItem);
		}
		describeEnsCommodityCodeResponse.setCommodityCodeInfo(commodityCodeInfo);
	 
	 	return describeEnsCommodityCodeResponse;
	}
}