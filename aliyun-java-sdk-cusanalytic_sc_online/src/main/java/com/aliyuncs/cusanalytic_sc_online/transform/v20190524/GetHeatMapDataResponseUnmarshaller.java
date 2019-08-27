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

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetHeatMapDataResponse;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetHeatMapDataResponse.HeatMapItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHeatMapDataResponseUnmarshaller {

	public static GetHeatMapDataResponse unmarshall(GetHeatMapDataResponse getHeatMapDataResponse, UnmarshallerContext _ctx) {
		
		getHeatMapDataResponse.setEMapName(_ctx.stringValue("GetHeatMapDataResponse.EMapName"));
		getHeatMapDataResponse.setWidth(_ctx.floatValue("GetHeatMapDataResponse.Width"));
		getHeatMapDataResponse.setEMapUrl(_ctx.stringValue("GetHeatMapDataResponse.EMapUrl"));
		getHeatMapDataResponse.setStoreId(_ctx.longValue("GetHeatMapDataResponse.StoreId"));
		getHeatMapDataResponse.setHeight(_ctx.floatValue("GetHeatMapDataResponse.Height"));

		List<HeatMapItem> heatMapItems = new ArrayList<HeatMapItem>();
		for (int i = 0; i < _ctx.lengthValue("GetHeatMapDataResponse.HeatMapItems.Length"); i++) {
			HeatMapItem heatMapItem = new HeatMapItem();
			heatMapItem.setY(_ctx.floatValue("GetHeatMapDataResponse.HeatMapItems["+ i +"].Y"));
			heatMapItem.setWeight(_ctx.floatValue("GetHeatMapDataResponse.HeatMapItems["+ i +"].Weight"));
			heatMapItem.setX(_ctx.floatValue("GetHeatMapDataResponse.HeatMapItems["+ i +"].X"));

			heatMapItems.add(heatMapItem);
		}
		getHeatMapDataResponse.setHeatMapItems(heatMapItems);
	 
	 	return getHeatMapDataResponse;
	}
}