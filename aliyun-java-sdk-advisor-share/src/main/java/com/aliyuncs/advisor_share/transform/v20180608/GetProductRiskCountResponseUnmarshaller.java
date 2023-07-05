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

import com.aliyuncs.advisor_share.model.v20180608.GetProductRiskCountResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetProductRiskCountResponse.ProductRisksCountDTO;
import com.aliyuncs.advisor_share.model.v20180608.GetProductRiskCountResponse.ProductRisksCountDTO.ProductCountDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProductRiskCountResponseUnmarshaller {

	public static GetProductRiskCountResponse unmarshall(GetProductRiskCountResponse getProductRiskCountResponse, UnmarshallerContext _ctx) {
		
		getProductRiskCountResponse.setRequestId(_ctx.stringValue("GetProductRiskCountResponse.RequestId"));

		List<ProductRisksCountDTO> data = new ArrayList<ProductRisksCountDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetProductRiskCountResponse.Data.Length"); i++) {
			ProductRisksCountDTO productRisksCountDTO = new ProductRisksCountDTO();
			productRisksCountDTO.setRiskTotal(_ctx.longValue("GetProductRiskCountResponse.Data["+ i +"].RiskTotal"));

			List<ProductCountDTO> productCountDTOList = new ArrayList<ProductCountDTO>();
			for (int j = 0; j < _ctx.lengthValue("GetProductRiskCountResponse.Data["+ i +"].ProductCountDTOList.Length"); j++) {
				ProductCountDTO productCountDTO = new ProductCountDTO();
				productCountDTO.setProduct(_ctx.stringValue("GetProductRiskCountResponse.Data["+ i +"].ProductCountDTOList["+ j +"].Product"));
				productCountDTO.setRiskNumber(_ctx.longValue("GetProductRiskCountResponse.Data["+ i +"].ProductCountDTOList["+ j +"].RiskNumber"));

				productCountDTOList.add(productCountDTO);
			}
			productRisksCountDTO.setProductCountDTOList(productCountDTOList);

			data.add(productRisksCountDTO);
		}
		getProductRiskCountResponse.setData(data);
	 
	 	return getProductRiskCountResponse;
	}
}