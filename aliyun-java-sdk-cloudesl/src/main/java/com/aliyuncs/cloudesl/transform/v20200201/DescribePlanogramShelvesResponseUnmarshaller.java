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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribePlanogramShelvesResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribePlanogramShelvesResponse.ShelfInfo;
import com.aliyuncs.cloudesl.model.v20200201.DescribePlanogramShelvesResponse.ShelfInfo.LayerInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlanogramShelvesResponseUnmarshaller {

	public static DescribePlanogramShelvesResponse unmarshall(DescribePlanogramShelvesResponse describePlanogramShelvesResponse, UnmarshallerContext _ctx) {
		
		describePlanogramShelvesResponse.setRequestId(_ctx.stringValue("DescribePlanogramShelvesResponse.RequestId"));
		describePlanogramShelvesResponse.setCode(_ctx.stringValue("DescribePlanogramShelvesResponse.Code"));
		describePlanogramShelvesResponse.setDynamicCode(_ctx.stringValue("DescribePlanogramShelvesResponse.DynamicCode"));
		describePlanogramShelvesResponse.setDynamicMessage(_ctx.stringValue("DescribePlanogramShelvesResponse.DynamicMessage"));
		describePlanogramShelvesResponse.setErrorCode(_ctx.stringValue("DescribePlanogramShelvesResponse.ErrorCode"));
		describePlanogramShelvesResponse.setErrorMessage(_ctx.stringValue("DescribePlanogramShelvesResponse.ErrorMessage"));
		describePlanogramShelvesResponse.setMessage(_ctx.stringValue("DescribePlanogramShelvesResponse.Message"));
		describePlanogramShelvesResponse.setStoreId(_ctx.stringValue("DescribePlanogramShelvesResponse.StoreId"));
		describePlanogramShelvesResponse.setSuccess(_ctx.booleanValue("DescribePlanogramShelvesResponse.Success"));

		List<ShelfInfo> shelfInfos = new ArrayList<ShelfInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribePlanogramShelvesResponse.ShelfInfos.Length"); i++) {
			ShelfInfo shelfInfo = new ShelfInfo();
			shelfInfo.setShelf(_ctx.stringValue("DescribePlanogramShelvesResponse.ShelfInfos["+ i +"].Shelf"));

			List<LayerInfo> layerInfos = new ArrayList<LayerInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribePlanogramShelvesResponse.ShelfInfos["+ i +"].LayerInfos.Length"); j++) {
				LayerInfo layerInfo = new LayerInfo();
				layerInfo.setLayer(_ctx.integerValue("DescribePlanogramShelvesResponse.ShelfInfos["+ i +"].LayerInfos["+ j +"].Layer"));

				layerInfos.add(layerInfo);
			}
			shelfInfo.setLayerInfos(layerInfos);

			shelfInfos.add(shelfInfo);
		}
		describePlanogramShelvesResponse.setShelfInfos(shelfInfos);
	 
	 	return describePlanogramShelvesResponse;
	}
}