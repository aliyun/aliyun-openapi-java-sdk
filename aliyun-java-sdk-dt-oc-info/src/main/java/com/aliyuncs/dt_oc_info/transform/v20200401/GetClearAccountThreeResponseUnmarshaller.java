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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20200401.GetClearAccountThreeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClearAccountThreeResponseUnmarshaller {

	public static GetClearAccountThreeResponse unmarshall(GetClearAccountThreeResponse getClearAccountThreeResponse, UnmarshallerContext _ctx) {
		
		getClearAccountThreeResponse.setRequestId(_ctx.stringValue("GetClearAccountThreeResponse.RequestId"));
		getClearAccountThreeResponse.setCode(_ctx.integerValue("GetClearAccountThreeResponse.Code"));
		getClearAccountThreeResponse.setMessage(_ctx.stringValue("GetClearAccountThreeResponse.Message"));
		getClearAccountThreeResponse.setTotal(_ctx.integerValue("GetClearAccountThreeResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetClearAccountThreeResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetClearAccountThreeResponse.Data["+ i +"]"));
		}
		getClearAccountThreeResponse.setData(data);
	 
	 	return getClearAccountThreeResponse;
	}
}