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

import com.aliyuncs.dt_oc_info.model.v20200401.GetCheckupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCheckupResponseUnmarshaller {

	public static GetCheckupResponse unmarshall(GetCheckupResponse getCheckupResponse, UnmarshallerContext _ctx) {
		
		getCheckupResponse.setRequestId(_ctx.stringValue("GetCheckupResponse.RequestId"));
		getCheckupResponse.setCode(_ctx.integerValue("GetCheckupResponse.Code"));
		getCheckupResponse.setMessage(_ctx.stringValue("GetCheckupResponse.Message"));
		getCheckupResponse.setTotal(_ctx.integerValue("GetCheckupResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckupResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetCheckupResponse.Data["+ i +"]"));
		}
		getCheckupResponse.setData(data);
	 
	 	return getCheckupResponse;
	}
}