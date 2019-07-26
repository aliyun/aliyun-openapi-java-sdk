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

package com.aliyuncs.cusanalytic_sc_online.transform.v20190524;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetSupportStoreResponse;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetSupportStoreResponse.StorePopDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSupportStoreResponseUnmarshaller {

	public static GetSupportStoreResponse unmarshall(GetSupportStoreResponse getSupportStoreResponse, UnmarshallerContext _ctx) {
		

		List<StorePopDTO> storePopDTOs = new ArrayList<StorePopDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetSupportStoreResponse.StorePopDTOs.Length"); i++) {
			StorePopDTO storePopDTO = new StorePopDTO();
			storePopDTO.setStoreId(_ctx.longValue("GetSupportStoreResponse.StorePopDTOs["+ i +"].StoreId"));
			storePopDTO.setName(_ctx.stringValue("GetSupportStoreResponse.StorePopDTOs["+ i +"].Name"));
			storePopDTO.setRegionName(_ctx.stringValue("GetSupportStoreResponse.StorePopDTOs["+ i +"].RegionName"));
			storePopDTO.setOpeningStartTime(_ctx.stringValue("GetSupportStoreResponse.StorePopDTOs["+ i +"].OpeningStartTime"));
			storePopDTO.setOpeningEndTime(_ctx.stringValue("GetSupportStoreResponse.StorePopDTOs["+ i +"].OpeningEndTime"));
			storePopDTO.setRegionId(_ctx.longValue("GetSupportStoreResponse.StorePopDTOs["+ i +"].RegionId"));
			storePopDTO.setStoreType(_ctx.stringValue("GetSupportStoreResponse.StorePopDTOs["+ i +"].StoreType"));
			storePopDTO.setAddress(_ctx.stringValue("GetSupportStoreResponse.StorePopDTOs["+ i +"].Address"));

			storePopDTOs.add(storePopDTO);
		}
		getSupportStoreResponse.setStorePopDTOs(storePopDTOs);
	 
	 	return getSupportStoreResponse;
	}
}