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

package com.aliyuncs.bpstudio.transform.v20210931;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bpstudio.model.v20210931.GetPotentialFailZonesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPotentialFailZonesResponseUnmarshaller {

	public static GetPotentialFailZonesResponse unmarshall(GetPotentialFailZonesResponse getPotentialFailZonesResponse, UnmarshallerContext _ctx) {
		
		getPotentialFailZonesResponse.setRequestId(_ctx.stringValue("GetPotentialFailZonesResponse.RequestId"));
		getPotentialFailZonesResponse.setMessage(_ctx.stringValue("GetPotentialFailZonesResponse.Message"));
		getPotentialFailZonesResponse.setCode(_ctx.stringValue("GetPotentialFailZonesResponse.Code"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPotentialFailZonesResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetPotentialFailZonesResponse.Data["+ i +"]"));
		}
		getPotentialFailZonesResponse.setData(data);
	 
	 	return getPotentialFailZonesResponse;
	}
}