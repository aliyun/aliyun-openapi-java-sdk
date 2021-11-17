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

import com.aliyuncs.mindlive_biz.model.v20210214.QueryGlobalSellingPointsResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryGlobalSellingPointsResponse.ItemFeatureDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGlobalSellingPointsResponseUnmarshaller {

	public static QueryGlobalSellingPointsResponse unmarshall(QueryGlobalSellingPointsResponse queryGlobalSellingPointsResponse, UnmarshallerContext _ctx) {
		
		queryGlobalSellingPointsResponse.setRequestId(_ctx.stringValue("QueryGlobalSellingPointsResponse.RequestId"));
		queryGlobalSellingPointsResponse.setErrorMessage(_ctx.stringValue("QueryGlobalSellingPointsResponse.ErrorMessage"));
		queryGlobalSellingPointsResponse.setSuccess(_ctx.booleanValue("QueryGlobalSellingPointsResponse.Success"));
		queryGlobalSellingPointsResponse.setErrorCode(_ctx.stringValue("QueryGlobalSellingPointsResponse.ErrorCode"));

		List<ItemFeatureDTO> data = new ArrayList<ItemFeatureDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryGlobalSellingPointsResponse.Data.Length"); i++) {
			ItemFeatureDTO itemFeatureDTO = new ItemFeatureDTO();
			itemFeatureDTO.setContent(_ctx.stringValue("QueryGlobalSellingPointsResponse.Data["+ i +"].Content"));
			itemFeatureDTO.setUuid(_ctx.stringValue("QueryGlobalSellingPointsResponse.Data["+ i +"].Uuid"));

			data.add(itemFeatureDTO);
		}
		queryGlobalSellingPointsResponse.setData(data);
	 
	 	return queryGlobalSellingPointsResponse;
	}
}