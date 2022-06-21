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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.DescribeCommodityInfosForAbcResponse;
import com.aliyuncs.swas.model.v20170810.DescribeCommodityInfosForAbcResponse.CommodityInfosItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommodityInfosForAbcResponseUnmarshaller {

	public static DescribeCommodityInfosForAbcResponse unmarshall(DescribeCommodityInfosForAbcResponse describeCommodityInfosForAbcResponse, UnmarshallerContext _ctx) {
		
		describeCommodityInfosForAbcResponse.setRequestId(_ctx.stringValue("DescribeCommodityInfosForAbcResponse.RequestId"));
		describeCommodityInfosForAbcResponse.setSuccess(_ctx.booleanValue("DescribeCommodityInfosForAbcResponse.Success"));
		describeCommodityInfosForAbcResponse.setCode(_ctx.stringValue("DescribeCommodityInfosForAbcResponse.Code"));
		describeCommodityInfosForAbcResponse.setPageNo(_ctx.integerValue("DescribeCommodityInfosForAbcResponse.PageNo"));
		describeCommodityInfosForAbcResponse.setMessage(_ctx.stringValue("DescribeCommodityInfosForAbcResponse.Message"));
		describeCommodityInfosForAbcResponse.setPageSize(_ctx.integerValue("DescribeCommodityInfosForAbcResponse.PageSize"));
		describeCommodityInfosForAbcResponse.setTotalCount(_ctx.integerValue("DescribeCommodityInfosForAbcResponse.TotalCount"));

		List<CommodityInfosItem> commodityInfos = new ArrayList<CommodityInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommodityInfosForAbcResponse.CommodityInfos.Length"); i++) {
			CommodityInfosItem commodityInfosItem = new CommodityInfosItem();
			commodityInfosItem.setCommodityCode(_ctx.stringValue("DescribeCommodityInfosForAbcResponse.CommodityInfos["+ i +"].CommodityCode"));
			commodityInfosItem.setGmtCreate(_ctx.longValue("DescribeCommodityInfosForAbcResponse.CommodityInfos["+ i +"].GmtCreate"));
			commodityInfosItem.setCommodityType(_ctx.stringValue("DescribeCommodityInfosForAbcResponse.CommodityInfos["+ i +"].CommodityType"));
			commodityInfosItem.setGmtModified(_ctx.longValue("DescribeCommodityInfosForAbcResponse.CommodityInfos["+ i +"].GmtModified"));
			commodityInfosItem.setId(_ctx.longValue("DescribeCommodityInfosForAbcResponse.CommodityInfos["+ i +"].Id"));
			commodityInfosItem.setCommodityVersion(_ctx.stringValue("DescribeCommodityInfosForAbcResponse.CommodityInfos["+ i +"].CommodityVersion"));
			commodityInfosItem.setRegionId(_ctx.stringValue("DescribeCommodityInfosForAbcResponse.CommodityInfos["+ i +"].RegionId"));
			commodityInfosItem.setCommodityContent(_ctx.mapValue("DescribeCommodityInfosForAbcResponse.CommodityInfos["+ i +"].CommodityContent"));

			commodityInfos.add(commodityInfosItem);
		}
		describeCommodityInfosForAbcResponse.setCommodityInfos(commodityInfos);
	 
	 	return describeCommodityInfosForAbcResponse;
	}
}