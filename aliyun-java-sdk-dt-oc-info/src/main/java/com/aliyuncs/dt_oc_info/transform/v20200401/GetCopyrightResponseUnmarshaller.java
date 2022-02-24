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

import com.aliyuncs.dt_oc_info.model.v20200401.GetCopyrightResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCopyrightResponseUnmarshaller {

	public static GetCopyrightResponse unmarshall(GetCopyrightResponse getCopyrightResponse, UnmarshallerContext _ctx) {
		
		getCopyrightResponse.setRequestId(_ctx.stringValue("GetCopyrightResponse.RequestId"));
		getCopyrightResponse.setCode(_ctx.integerValue("GetCopyrightResponse.Code"));
		getCopyrightResponse.setMessage(_ctx.stringValue("GetCopyrightResponse.Message"));
		getCopyrightResponse.setTotal(_ctx.integerValue("GetCopyrightResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCopyrightResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetCopyrightResponse.Data["+ i +"]"));
		}
		getCopyrightResponse.setData(data);
	 
	 	return getCopyrightResponse;
	}
}