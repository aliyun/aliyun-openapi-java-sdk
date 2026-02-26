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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListGeographicSubRegionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGeographicSubRegionsResponseUnmarshaller {

	public static ListGeographicSubRegionsResponse unmarshall(ListGeographicSubRegionsResponse listGeographicSubRegionsResponse, UnmarshallerContext _ctx) {
		
		listGeographicSubRegionsResponse.setRequestId(_ctx.stringValue("ListGeographicSubRegionsResponse.RequestId"));
		listGeographicSubRegionsResponse.setCount(_ctx.longValue("ListGeographicSubRegionsResponse.Count"));

		List<String> geographicSubRegions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListGeographicSubRegionsResponse.GeographicSubRegions.Length"); i++) {
			geographicSubRegions.add(_ctx.stringValue("ListGeographicSubRegionsResponse.GeographicSubRegions["+ i +"]"));
		}
		listGeographicSubRegionsResponse.setGeographicSubRegions(geographicSubRegions);
	 
	 	return listGeographicSubRegionsResponse;
	}
}