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

import com.aliyuncs.swas.model.v20170810.DescribeCommodityInfoForAbcResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommodityInfoForAbcResponseUnmarshaller {

	public static DescribeCommodityInfoForAbcResponse unmarshall(DescribeCommodityInfoForAbcResponse describeCommodityInfoForAbcResponse, UnmarshallerContext _ctx) {
		
		describeCommodityInfoForAbcResponse.setRequestId(_ctx.stringValue("DescribeCommodityInfoForAbcResponse.RequestId"));
		describeCommodityInfoForAbcResponse.setCommodityCode(_ctx.stringValue("DescribeCommodityInfoForAbcResponse.CommodityCode"));
		describeCommodityInfoForAbcResponse.setSuccess(_ctx.booleanValue("DescribeCommodityInfoForAbcResponse.Success"));
		describeCommodityInfoForAbcResponse.setMessage(_ctx.stringValue("DescribeCommodityInfoForAbcResponse.Message"));
		describeCommodityInfoForAbcResponse.setCommodityContent(_ctx.mapValue("DescribeCommodityInfoForAbcResponse.CommodityContent"));
		describeCommodityInfoForAbcResponse.setGmtModified(_ctx.longValue("DescribeCommodityInfoForAbcResponse.GmtModified"));
		describeCommodityInfoForAbcResponse.setCommodityType(_ctx.stringValue("DescribeCommodityInfoForAbcResponse.CommodityType"));
		describeCommodityInfoForAbcResponse.setCommodityVersion(_ctx.stringValue("DescribeCommodityInfoForAbcResponse.CommodityVersion"));
		describeCommodityInfoForAbcResponse.setRegionId(_ctx.stringValue("DescribeCommodityInfoForAbcResponse.RegionId"));
		describeCommodityInfoForAbcResponse.setCode(_ctx.stringValue("DescribeCommodityInfoForAbcResponse.Code"));
		describeCommodityInfoForAbcResponse.setGmtCreate(_ctx.longValue("DescribeCommodityInfoForAbcResponse.GmtCreate"));
		describeCommodityInfoForAbcResponse.setId(_ctx.longValue("DescribeCommodityInfoForAbcResponse.Id"));
	 
	 	return describeCommodityInfoForAbcResponse;
	}
}