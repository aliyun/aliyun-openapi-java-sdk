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

package com.aliyuncs.arms.transform.v20190219;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190219.GetIpOrHostsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIpOrHostsResponseUnmarshaller {

	public static GetIpOrHostsResponse unmarshall(GetIpOrHostsResponse getIpOrHostsResponse, UnmarshallerContext _ctx) {
		
		getIpOrHostsResponse.setRequestId(_ctx.stringValue("GetIpOrHostsResponse.RequestId"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetIpOrHostsResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetIpOrHostsResponse.Data["+ i +"]"));
		}
		getIpOrHostsResponse.setData(data);
	 
	 	return getIpOrHostsResponse;
	}
}