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

package com.aliyuncs.ipam.transform.v20201023;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ipam.model.v20201023.GetIpLocationResponse;
import com.aliyuncs.ipam.model.v20201023.GetIpLocationResponse.Content;
import com.aliyuncs.ipam.model.v20201023.GetIpLocationResponse.Content.LocationInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIpLocationResponseUnmarshaller {

	public static GetIpLocationResponse unmarshall(GetIpLocationResponse getIpLocationResponse, UnmarshallerContext _ctx) {
		
		getIpLocationResponse.setCode(_ctx.integerValue("GetIpLocationResponse.code"));
		getIpLocationResponse.setMessage(_ctx.stringValue("GetIpLocationResponse.message"));

		Content content = new Content();
		content.setCount(_ctx.integerValue("GetIpLocationResponse.content.count"));

		List<LocationInfo> data = new ArrayList<LocationInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetIpLocationResponse.content.data.Length"); i++) {
			LocationInfo locationInfo = new LocationInfo();
			locationInfo.setPrefix(_ctx.stringValue("GetIpLocationResponse.content.data["+ i +"].prefix"));
			locationInfo.setCountry(_ctx.stringValue("GetIpLocationResponse.content.data["+ i +"].country"));
			locationInfo.setCity(_ctx.stringValue("GetIpLocationResponse.content.data["+ i +"].city"));
			locationInfo.setResourcePoolName(_ctx.stringValue("GetIpLocationResponse.content.data["+ i +"].resourcePoolName"));

			data.add(locationInfo);
		}
		content.setData(data);
		getIpLocationResponse.setContent(content);
	 
	 	return getIpLocationResponse;
	}
}