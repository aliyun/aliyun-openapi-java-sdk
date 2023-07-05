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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.GetProductRiskTrendResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetProductRiskTrendResponse.ProductRisksDateDTO;
import com.aliyuncs.advisor_share.model.v20180608.GetProductRiskTrendResponse.ProductRisksDateDTO.ProductCountDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProductRiskTrendResponseUnmarshaller {

	public static GetProductRiskTrendResponse unmarshall(GetProductRiskTrendResponse getProductRiskTrendResponse, UnmarshallerContext _ctx) {
		
		getProductRiskTrendResponse.setRequestId(_ctx.stringValue("GetProductRiskTrendResponse.RequestId"));

		List<ProductRisksDateDTO> data = new ArrayList<ProductRisksDateDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetProductRiskTrendResponse.Data.Length"); i++) {
			ProductRisksDateDTO productRisksDateDTO = new ProductRisksDateDTO();
			productRisksDateDTO.setDate(_ctx.stringValue("GetProductRiskTrendResponse.Data["+ i +"].Date"));

			List<ProductCountDTO> productCountDTOList = new ArrayList<ProductCountDTO>();
			for (int j = 0; j < _ctx.lengthValue("GetProductRiskTrendResponse.Data["+ i +"].ProductCountDTOList.Length"); j++) {
				ProductCountDTO productCountDTO = new ProductCountDTO();
				productCountDTO.setProduct(_ctx.stringValue("GetProductRiskTrendResponse.Data["+ i +"].ProductCountDTOList["+ j +"].Product"));
				productCountDTO.setRiskNumber(_ctx.longValue("GetProductRiskTrendResponse.Data["+ i +"].ProductCountDTOList["+ j +"].RiskNumber"));

				productCountDTOList.add(productCountDTO);
			}
			productRisksDateDTO.setProductCountDTOList(productCountDTOList);

			data.add(productRisksDateDTO);
		}
		getProductRiskTrendResponse.setData(data);
	 
	 	return getProductRiskTrendResponse;
	}
}