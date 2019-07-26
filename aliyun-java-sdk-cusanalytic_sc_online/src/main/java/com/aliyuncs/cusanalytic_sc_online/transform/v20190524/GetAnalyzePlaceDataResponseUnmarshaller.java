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

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetAnalyzePlaceDataResponse;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetAnalyzePlaceDataResponse.AnalyzePlaceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAnalyzePlaceDataResponseUnmarshaller {

	public static GetAnalyzePlaceDataResponse unmarshall(GetAnalyzePlaceDataResponse getAnalyzePlaceDataResponse, UnmarshallerContext _ctx) {
		
		getAnalyzePlaceDataResponse.setCount(_ctx.longValue("GetAnalyzePlaceDataResponse.Count"));
		getAnalyzePlaceDataResponse.setStoreId(_ctx.longValue("GetAnalyzePlaceDataResponse.StoreId"));
		getAnalyzePlaceDataResponse.setPercent(_ctx.floatValue("GetAnalyzePlaceDataResponse.Percent"));
		getAnalyzePlaceDataResponse.setLocationName(_ctx.stringValue("GetAnalyzePlaceDataResponse.LocationName"));
		getAnalyzePlaceDataResponse.setParentLocationIds(_ctx.stringValue("GetAnalyzePlaceDataResponse.ParentLocationIds"));
		getAnalyzePlaceDataResponse.setLocationId(_ctx.longValue("GetAnalyzePlaceDataResponse.LocationId"));

		List<AnalyzePlaceItem> analyzePlaceItems = new ArrayList<AnalyzePlaceItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAnalyzePlaceDataResponse.AnalyzePlaceItems.Length"); i++) {
			AnalyzePlaceItem analyzePlaceItem = new AnalyzePlaceItem();
			analyzePlaceItem.setLocationName(_ctx.stringValue("GetAnalyzePlaceDataResponse.AnalyzePlaceItems["+ i +"].LocationName"));
			analyzePlaceItem.setLocationId(_ctx.longValue("GetAnalyzePlaceDataResponse.AnalyzePlaceItems["+ i +"].LocationId"));
			analyzePlaceItem.setParentLocationIds(_ctx.stringValue("GetAnalyzePlaceDataResponse.AnalyzePlaceItems["+ i +"].ParentLocationIds"));
			analyzePlaceItem.setCount(_ctx.longValue("GetAnalyzePlaceDataResponse.AnalyzePlaceItems["+ i +"].Count"));
			analyzePlaceItem.setStoreId(_ctx.longValue("GetAnalyzePlaceDataResponse.AnalyzePlaceItems["+ i +"].StoreId"));
			analyzePlaceItem.setPercent(_ctx.floatValue("GetAnalyzePlaceDataResponse.AnalyzePlaceItems["+ i +"].Percent"));

			analyzePlaceItems.add(analyzePlaceItem);
		}
		getAnalyzePlaceDataResponse.setAnalyzePlaceItems(analyzePlaceItems);
	 
	 	return getAnalyzePlaceDataResponse;
	}
}