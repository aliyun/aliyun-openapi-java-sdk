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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mindlive_biz.model.v20210214.AddGlobalSellingPointsResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.AddGlobalSellingPointsResponse.ItemFeatureDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddGlobalSellingPointsResponseUnmarshaller {

	public static AddGlobalSellingPointsResponse unmarshall(AddGlobalSellingPointsResponse addGlobalSellingPointsResponse, UnmarshallerContext _ctx) {
		
		addGlobalSellingPointsResponse.setRequestId(_ctx.stringValue("AddGlobalSellingPointsResponse.RequestId"));
		addGlobalSellingPointsResponse.setErrorMessage(_ctx.stringValue("AddGlobalSellingPointsResponse.ErrorMessage"));
		addGlobalSellingPointsResponse.setSuccess(_ctx.booleanValue("AddGlobalSellingPointsResponse.Success"));
		addGlobalSellingPointsResponse.setErrorCode(_ctx.stringValue("AddGlobalSellingPointsResponse.ErrorCode"));

		List<ItemFeatureDTO> data = new ArrayList<ItemFeatureDTO>();
		for (int i = 0; i < _ctx.lengthValue("AddGlobalSellingPointsResponse.Data.Length"); i++) {
			ItemFeatureDTO itemFeatureDTO = new ItemFeatureDTO();
			itemFeatureDTO.setContent(_ctx.stringValue("AddGlobalSellingPointsResponse.Data["+ i +"].Content"));
			itemFeatureDTO.setUuid(_ctx.stringValue("AddGlobalSellingPointsResponse.Data["+ i +"].Uuid"));

			data.add(itemFeatureDTO);
		}
		addGlobalSellingPointsResponse.setData(data);
	 
	 	return addGlobalSellingPointsResponse;
	}
}