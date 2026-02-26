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

import com.aliyuncs.bssopenapi.model.v20171214.QueryPriceEntityListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryPriceEntityListResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryPriceEntityListResponse.Data.PriceEntityInfoDTO;
import com.aliyuncs.bssopenapi.model.v20171214.QueryPriceEntityListResponse.Data.PriceEntityInfoDTO.PriceFactorDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPriceEntityListResponseUnmarshaller {

	public static QueryPriceEntityListResponse unmarshall(QueryPriceEntityListResponse queryPriceEntityListResponse, UnmarshallerContext _ctx) {
		
		queryPriceEntityListResponse.setRequestId(_ctx.stringValue("QueryPriceEntityListResponse.RequestId"));
		queryPriceEntityListResponse.setCode(_ctx.stringValue("QueryPriceEntityListResponse.Code"));
		queryPriceEntityListResponse.setMessage(_ctx.stringValue("QueryPriceEntityListResponse.Message"));
		queryPriceEntityListResponse.setSuccess(_ctx.booleanValue("QueryPriceEntityListResponse.Success"));

		Data data = new Data();

		List<PriceEntityInfoDTO> priceEntityInfoList = new ArrayList<PriceEntityInfoDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryPriceEntityListResponse.Data.PriceEntityInfoList.Length"); i++) {
			PriceEntityInfoDTO priceEntityInfoDTO = new PriceEntityInfoDTO();
			priceEntityInfoDTO.setPriceEntityCode(_ctx.stringValue("QueryPriceEntityListResponse.Data.PriceEntityInfoList["+ i +"].PriceEntityCode"));
			priceEntityInfoDTO.setPriceEntityName(_ctx.stringValue("QueryPriceEntityListResponse.Data.PriceEntityInfoList["+ i +"].PriceEntityName"));

			List<PriceFactorDTO> priceFactorList = new ArrayList<PriceFactorDTO>();
			for (int j = 0; j < _ctx.lengthValue("QueryPriceEntityListResponse.Data.PriceEntityInfoList["+ i +"].PriceFactorList.Length"); j++) {
				PriceFactorDTO priceFactorDTO = new PriceFactorDTO();
				priceFactorDTO.setPriceFactorCode(_ctx.stringValue("QueryPriceEntityListResponse.Data.PriceEntityInfoList["+ i +"].PriceFactorList["+ j +"].PriceFactorCode"));
				priceFactorDTO.setPriceFactorName(_ctx.stringValue("QueryPriceEntityListResponse.Data.PriceEntityInfoList["+ i +"].PriceFactorList["+ j +"].PriceFactorName"));

				List<String> priceFactorValueList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryPriceEntityListResponse.Data.PriceEntityInfoList["+ i +"].PriceFactorList["+ j +"].PriceFactorValueList.Length"); k++) {
					priceFactorValueList.add(_ctx.stringValue("QueryPriceEntityListResponse.Data.PriceEntityInfoList["+ i +"].PriceFactorList["+ j +"].PriceFactorValueList["+ k +"]"));
				}
				priceFactorDTO.setPriceFactorValueList(priceFactorValueList);

				priceFactorList.add(priceFactorDTO);
			}
			priceEntityInfoDTO.setPriceFactorList(priceFactorList);

			priceEntityInfoList.add(priceEntityInfoDTO);
		}
		data.setPriceEntityInfoList(priceEntityInfoList);
		queryPriceEntityListResponse.setData(data);
	 
	 	return queryPriceEntityListResponse;
	}
}