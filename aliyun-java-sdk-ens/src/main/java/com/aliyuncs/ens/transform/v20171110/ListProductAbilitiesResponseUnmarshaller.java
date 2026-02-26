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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.ListProductAbilitiesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductAbilitiesResponseUnmarshaller {

	public static ListProductAbilitiesResponse unmarshall(ListProductAbilitiesResponse listProductAbilitiesResponse, UnmarshallerContext _ctx) {
		
		listProductAbilitiesResponse.setRequestId(_ctx.stringValue("ListProductAbilitiesResponse.RequestId"));

		List<String> productAbilities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListProductAbilitiesResponse.ProductAbilities.Length"); i++) {
			productAbilities.add(_ctx.stringValue("ListProductAbilitiesResponse.ProductAbilities["+ i +"]"));
		}
		listProductAbilitiesResponse.setProductAbilities(productAbilities);
	 
	 	return listProductAbilitiesResponse;
	}
}