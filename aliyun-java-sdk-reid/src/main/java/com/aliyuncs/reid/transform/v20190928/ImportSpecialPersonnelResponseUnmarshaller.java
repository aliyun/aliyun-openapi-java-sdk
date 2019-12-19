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

package com.aliyuncs.reid.transform.v20190928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.ImportSpecialPersonnelResponse;
import com.aliyuncs.reid.model.v20190928.ImportSpecialPersonnelResponse.SpecialPersonnelMap;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportSpecialPersonnelResponseUnmarshaller {

	public static ImportSpecialPersonnelResponse unmarshall(ImportSpecialPersonnelResponse importSpecialPersonnelResponse, UnmarshallerContext _ctx) {
		
		importSpecialPersonnelResponse.setRequestId(_ctx.stringValue("ImportSpecialPersonnelResponse.RequestId"));
		importSpecialPersonnelResponse.setErrorCode(_ctx.stringValue("ImportSpecialPersonnelResponse.ErrorCode"));
		importSpecialPersonnelResponse.setErrorMessage(_ctx.stringValue("ImportSpecialPersonnelResponse.ErrorMessage"));
		importSpecialPersonnelResponse.setSuccess(_ctx.booleanValue("ImportSpecialPersonnelResponse.Success"));

		List<SpecialPersonnelMap> specialPersonnelMaps = new ArrayList<SpecialPersonnelMap>();
		for (int i = 0; i < _ctx.lengthValue("ImportSpecialPersonnelResponse.SpecialPersonnelMaps.Length"); i++) {
			SpecialPersonnelMap specialPersonnelMap = new SpecialPersonnelMap();
			specialPersonnelMap.setUkId(_ctx.longValue("ImportSpecialPersonnelResponse.SpecialPersonnelMaps["+ i +"].UkId"));
			specialPersonnelMap.setStoreId(_ctx.longValue("ImportSpecialPersonnelResponse.SpecialPersonnelMaps["+ i +"].StoreId"));

			specialPersonnelMaps.add(specialPersonnelMap);
		}
		importSpecialPersonnelResponse.setSpecialPersonnelMaps(specialPersonnelMaps);
	 
	 	return importSpecialPersonnelResponse;
	}
}