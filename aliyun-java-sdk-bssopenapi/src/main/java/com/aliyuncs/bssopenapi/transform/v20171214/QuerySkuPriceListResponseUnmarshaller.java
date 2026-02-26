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

import com.aliyuncs.bssopenapi.model.v20171214.QuerySkuPriceListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySkuPriceListResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySkuPriceListResponse.Data.SkuPricePage;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySkuPriceListResponse.Data.SkuPricePage.SkuPricePageDTO;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySkuPriceListResponse.Data.SkuPricePage.SkuPricePageDTO.CSkuPriceDTO;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySkuPriceListResponse.Data.SkuPricePage.SkuPricePageDTO.CSkuPriceDTO.RangeDTO;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySkuPriceListResponseUnmarshaller {

	public static QuerySkuPriceListResponse unmarshall(QuerySkuPriceListResponse querySkuPriceListResponse, UnmarshallerContext _ctx) {
		
		querySkuPriceListResponse.setRequestId(_ctx.stringValue("QuerySkuPriceListResponse.RequestId"));
		querySkuPriceListResponse.setCode(_ctx.stringValue("QuerySkuPriceListResponse.Code"));
		querySkuPriceListResponse.setMessage(_ctx.stringValue("QuerySkuPriceListResponse.Message"));
		querySkuPriceListResponse.setSuccess(_ctx.booleanValue("QuerySkuPriceListResponse.Success"));

		Data data = new Data();

		SkuPricePage skuPricePage = new SkuPricePage();
		skuPricePage.setTotalCount(_ctx.integerValue("QuerySkuPriceListResponse.Data.SkuPricePage.TotalCount"));
		skuPricePage.setNextPageToken(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.NextPageToken"));

		List<SkuPricePageDTO> skuPriceList = new ArrayList<SkuPricePageDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList.Length"); i++) {
			SkuPricePageDTO skuPricePageDTO = new SkuPricePageDTO();
			skuPricePageDTO.setSkuCode(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].SkuCode"));
			skuPricePageDTO.setSkuFactorMap(_ctx.mapValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].SkuFactorMap"));

			List<CSkuPriceDTO> cskuPriceList = new ArrayList<CSkuPriceDTO>();
			for (int j = 0; j < _ctx.lengthValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList.Length"); j++) {
				CSkuPriceDTO cSkuPriceDTO = new CSkuPriceDTO();
				cSkuPriceDTO.setCskuCode(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList["+ j +"].CskuCode"));
				cSkuPriceDTO.setCurrency(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList["+ j +"].Currency"));
				cSkuPriceDTO.setUsageUnit(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList["+ j +"].UsageUnit"));
				cSkuPriceDTO.setPriceType(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList["+ j +"].PriceType"));
				cSkuPriceDTO.setPriceMode(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList["+ j +"].PriceMode"));
				cSkuPriceDTO.setPrice(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList["+ j +"].Price"));
				cSkuPriceDTO.setPriceUnit(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList["+ j +"].PriceUnit"));

				List<RangeDTO> rangeList = new ArrayList<RangeDTO>();
				for (int k = 0; k < _ctx.lengthValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList["+ j +"].RangeList.Length"); k++) {
					RangeDTO rangeDTO = new RangeDTO();
					rangeDTO.setFactorCode(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList["+ j +"].RangeList["+ k +"].FactorCode"));
					rangeDTO.setMin(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList["+ j +"].RangeList["+ k +"].Min"));
					rangeDTO.setMax(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList["+ j +"].RangeList["+ k +"].Max"));
					rangeDTO.setType(_ctx.stringValue("QuerySkuPriceListResponse.Data.SkuPricePage.SkuPriceList["+ i +"].CskuPriceList["+ j +"].RangeList["+ k +"].Type"));

					rangeList.add(rangeDTO);
				}
				cSkuPriceDTO.setRangeList(rangeList);

				cskuPriceList.add(cSkuPriceDTO);
			}
			skuPricePageDTO.setCskuPriceList(cskuPriceList);

			skuPriceList.add(skuPricePageDTO);
		}
		skuPricePage.setSkuPriceList(skuPriceList);
		data.setSkuPricePage(skuPricePage);
		querySkuPriceListResponse.setData(data);
	 
	 	return querySkuPriceListResponse;
	}
}