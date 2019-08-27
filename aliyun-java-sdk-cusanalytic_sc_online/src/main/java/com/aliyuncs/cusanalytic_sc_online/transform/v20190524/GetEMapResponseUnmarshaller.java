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

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetEMapResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEMapResponseUnmarshaller {

	public static GetEMapResponse unmarshall(GetEMapResponse getEMapResponse, UnmarshallerContext _ctx) {
		
		getEMapResponse.setStoreId(_ctx.longValue("GetEMapResponse.StoreId"));
		getEMapResponse.setName(_ctx.stringValue("GetEMapResponse.Name"));
		getEMapResponse.setScale(_ctx.floatValue("GetEMapResponse.Scale"));
		getEMapResponse.setLocationId(_ctx.longValue("GetEMapResponse.LocationId"));
		getEMapResponse.setEMapId(_ctx.longValue("GetEMapResponse.EMapId"));
		getEMapResponse.setImageUrl(_ctx.stringValue("GetEMapResponse.ImageUrl"));
	 
	 	return getEMapResponse;
	}
}