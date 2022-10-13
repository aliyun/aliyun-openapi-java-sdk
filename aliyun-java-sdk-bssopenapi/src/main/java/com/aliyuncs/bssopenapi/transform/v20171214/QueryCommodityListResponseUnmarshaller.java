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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryCommodityListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryCommodityListResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryCommodityListResponse.Data.CommodityDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCommodityListResponseUnmarshaller {

	public static QueryCommodityListResponse unmarshall(QueryCommodityListResponse queryCommodityListResponse, UnmarshallerContext _ctx) {
		
		queryCommodityListResponse.setRequestId(_ctx.stringValue("QueryCommodityListResponse.RequestId"));
		queryCommodityListResponse.setMessage(_ctx.stringValue("QueryCommodityListResponse.Message"));
		queryCommodityListResponse.setSuccess(_ctx.booleanValue("QueryCommodityListResponse.Success"));
		queryCommodityListResponse.setCode(_ctx.stringValue("QueryCommodityListResponse.Code"));

		Data data = new Data();

		List<CommodityDTO> commodityList = new ArrayList<CommodityDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryCommodityListResponse.Data.CommodityList.Length"); i++) {
			CommodityDTO commodityDTO = new CommodityDTO();
			commodityDTO.setCommodityCode(_ctx.stringValue("QueryCommodityListResponse.Data.CommodityList["+ i +"].CommodityCode"));
			commodityDTO.setCommodityName(_ctx.stringValue("QueryCommodityListResponse.Data.CommodityList["+ i +"].CommodityName"));
			commodityDTO.setChargeType(_ctx.stringValue("QueryCommodityListResponse.Data.CommodityList["+ i +"].ChargeType"));

			commodityList.add(commodityDTO);
		}
		data.setCommodityList(commodityList);
		queryCommodityListResponse.setData(data);
	 
	 	return queryCommodityListResponse;
	}
}