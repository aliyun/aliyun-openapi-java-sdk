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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.ListUserCustomLogConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserCustomLogConfigResponseUnmarshaller {

	public static ListUserCustomLogConfigResponse unmarshall(ListUserCustomLogConfigResponse listUserCustomLogConfigResponse, UnmarshallerContext _ctx) {
		
		listUserCustomLogConfigResponse.setRequestId(_ctx.stringValue("ListUserCustomLogConfigResponse.RequestId"));

		List<String> configIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListUserCustomLogConfigResponse.ConfigIds.Length"); i++) {
			configIds.add(_ctx.stringValue("ListUserCustomLogConfigResponse.ConfigIds["+ i +"]"));
		}
		listUserCustomLogConfigResponse.setConfigIds(configIds);
	 
	 	return listUserCustomLogConfigResponse;
	}
}