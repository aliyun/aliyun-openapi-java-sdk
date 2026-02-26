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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.CheckResourceStockResponse;
import com.aliyuncs.eds_aic.model.v20230930.CheckResourceStockResponse.ResourceStockModelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckResourceStockResponseUnmarshaller {

	public static CheckResourceStockResponse unmarshall(CheckResourceStockResponse checkResourceStockResponse, UnmarshallerContext _ctx) {
		
		checkResourceStockResponse.setRequestId(_ctx.stringValue("CheckResourceStockResponse.RequestId"));

		List<ResourceStockModelsItem> resourceStockModels = new ArrayList<ResourceStockModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckResourceStockResponse.ResourceStockModels.Length"); i++) {
			ResourceStockModelsItem resourceStockModelsItem = new ResourceStockModelsItem();
			resourceStockModelsItem.setRegionId(_ctx.stringValue("CheckResourceStockResponse.ResourceStockModels["+ i +"].RegionId"));
			resourceStockModelsItem.setZoneId(_ctx.stringValue("CheckResourceStockResponse.ResourceStockModels["+ i +"].ZoneId"));
			resourceStockModelsItem.setStockStatus(_ctx.stringValue("CheckResourceStockResponse.ResourceStockModels["+ i +"].StockStatus"));

			resourceStockModels.add(resourceStockModelsItem);
		}
		checkResourceStockResponse.setResourceStockModels(resourceStockModels);
	 
	 	return checkResourceStockResponse;
	}
}