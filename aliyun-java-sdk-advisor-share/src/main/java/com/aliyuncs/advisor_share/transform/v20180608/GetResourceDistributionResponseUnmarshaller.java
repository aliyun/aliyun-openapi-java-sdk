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

import com.aliyuncs.advisor_share.model.v20180608.GetResourceDistributionResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetResourceDistributionResponse.ProductDistributionDTO;
import com.aliyuncs.advisor_share.model.v20180608.GetResourceDistributionResponse.ProductDistributionDTO.ResourceDistributionDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceDistributionResponseUnmarshaller {

	public static GetResourceDistributionResponse unmarshall(GetResourceDistributionResponse getResourceDistributionResponse, UnmarshallerContext _ctx) {
		
		getResourceDistributionResponse.setRequestId(_ctx.stringValue("GetResourceDistributionResponse.RequestId"));

		List<ProductDistributionDTO> data = new ArrayList<ProductDistributionDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceDistributionResponse.Data.Length"); i++) {
			ProductDistributionDTO productDistributionDTO = new ProductDistributionDTO();
			productDistributionDTO.setProduct(_ctx.stringValue("GetResourceDistributionResponse.Data["+ i +"].Product"));

			List<ResourceDistributionDTO> regionDistribution = new ArrayList<ResourceDistributionDTO>();
			for (int j = 0; j < _ctx.lengthValue("GetResourceDistributionResponse.Data["+ i +"].RegionDistribution.Length"); j++) {
				ResourceDistributionDTO resourceDistributionDTO = new ResourceDistributionDTO();
				resourceDistributionDTO.setRegionId(_ctx.stringValue("GetResourceDistributionResponse.Data["+ i +"].RegionDistribution["+ j +"].RegionId"));
				resourceDistributionDTO.setResourceCount(_ctx.integerValue("GetResourceDistributionResponse.Data["+ i +"].RegionDistribution["+ j +"].ResourceCount"));

				regionDistribution.add(resourceDistributionDTO);
			}
			productDistributionDTO.setRegionDistribution(regionDistribution);

			data.add(productDistributionDTO);
		}
		getResourceDistributionResponse.setData(data);
	 
	 	return getResourceDistributionResponse;
	}
}