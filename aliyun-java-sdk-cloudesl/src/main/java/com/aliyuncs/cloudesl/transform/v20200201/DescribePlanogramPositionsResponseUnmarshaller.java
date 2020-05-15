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

import com.aliyuncs.cloudesl.model.v20200201.DescribePlanogramPositionsResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribePlanogramPositionsResponse.LayerInfo;
import com.aliyuncs.cloudesl.model.v20200201.DescribePlanogramPositionsResponse.LayerInfo.ShelfPositionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlanogramPositionsResponseUnmarshaller {

	public static DescribePlanogramPositionsResponse unmarshall(DescribePlanogramPositionsResponse describePlanogramPositionsResponse, UnmarshallerContext _ctx) {
		
		describePlanogramPositionsResponse.setRequestId(_ctx.stringValue("DescribePlanogramPositionsResponse.RequestId"));
		describePlanogramPositionsResponse.setCode(_ctx.stringValue("DescribePlanogramPositionsResponse.Code"));
		describePlanogramPositionsResponse.setDynamicCode(_ctx.stringValue("DescribePlanogramPositionsResponse.DynamicCode"));
		describePlanogramPositionsResponse.setDynamicMessage(_ctx.stringValue("DescribePlanogramPositionsResponse.DynamicMessage"));
		describePlanogramPositionsResponse.setErrorCode(_ctx.stringValue("DescribePlanogramPositionsResponse.ErrorCode"));
		describePlanogramPositionsResponse.setErrorMessage(_ctx.stringValue("DescribePlanogramPositionsResponse.ErrorMessage"));
		describePlanogramPositionsResponse.setMessage(_ctx.stringValue("DescribePlanogramPositionsResponse.Message"));
		describePlanogramPositionsResponse.setShelf(_ctx.stringValue("DescribePlanogramPositionsResponse.Shelf"));
		describePlanogramPositionsResponse.setStoreId(_ctx.stringValue("DescribePlanogramPositionsResponse.StoreId"));
		describePlanogramPositionsResponse.setSuccess(_ctx.booleanValue("DescribePlanogramPositionsResponse.Success"));

		List<LayerInfo> layerInfos = new ArrayList<LayerInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribePlanogramPositionsResponse.LayerInfos.Length"); i++) {
			LayerInfo layerInfo = new LayerInfo();
			layerInfo.setLayer(_ctx.integerValue("DescribePlanogramPositionsResponse.LayerInfos["+ i +"].Layer"));
			layerInfo.setLayerOrigin(_ctx.stringValue("DescribePlanogramPositionsResponse.LayerInfos["+ i +"].LayerOrigin"));

			List<ShelfPositionInfo> shelfPositionInfos = new ArrayList<ShelfPositionInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribePlanogramPositionsResponse.LayerInfos["+ i +"].ShelfPositionInfos.Length"); j++) {
				ShelfPositionInfo shelfPositionInfo = new ShelfPositionInfo();
				shelfPositionInfo.setColumn(_ctx.stringValue("DescribePlanogramPositionsResponse.LayerInfos["+ i +"].ShelfPositionInfos["+ j +"].Column"));
				shelfPositionInfo.setDepth(_ctx.floatValue("DescribePlanogramPositionsResponse.LayerInfos["+ i +"].ShelfPositionInfos["+ j +"].Depth"));
				shelfPositionInfo.setFacing(_ctx.integerValue("DescribePlanogramPositionsResponse.LayerInfos["+ i +"].ShelfPositionInfos["+ j +"].Facing"));
				shelfPositionInfo.setItemBarCode(_ctx.stringValue("DescribePlanogramPositionsResponse.LayerInfos["+ i +"].ShelfPositionInfos["+ j +"].ItemBarCode"));
				shelfPositionInfo.setItemTitle(_ctx.stringValue("DescribePlanogramPositionsResponse.LayerInfos["+ i +"].ShelfPositionInfos["+ j +"].ItemTitle"));
				shelfPositionInfo.setOffsetFrom(_ctx.floatValue("DescribePlanogramPositionsResponse.LayerInfos["+ i +"].ShelfPositionInfos["+ j +"].OffsetFrom"));
				shelfPositionInfo.setOffsetTo(_ctx.floatValue("DescribePlanogramPositionsResponse.LayerInfos["+ i +"].ShelfPositionInfos["+ j +"].OffsetTo"));

				shelfPositionInfos.add(shelfPositionInfo);
			}
			layerInfo.setShelfPositionInfos(shelfPositionInfos);

			layerInfos.add(layerInfo);
		}
		describePlanogramPositionsResponse.setLayerInfos(layerInfos);
	 
	 	return describePlanogramPositionsResponse;
	}
}