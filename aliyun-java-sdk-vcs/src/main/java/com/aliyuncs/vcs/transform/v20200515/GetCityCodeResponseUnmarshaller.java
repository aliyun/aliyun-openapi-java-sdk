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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.GetCityCodeResponse;
import com.aliyuncs.vcs.model.v20200515.GetCityCodeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCityCodeResponseUnmarshaller {

	public static GetCityCodeResponse unmarshall(GetCityCodeResponse getCityCodeResponse, UnmarshallerContext _ctx) {
		
		getCityCodeResponse.setRequestId(_ctx.stringValue("GetCityCodeResponse.RequestId"));
		getCityCodeResponse.setMessage(_ctx.stringValue("GetCityCodeResponse.Message"));
		getCityCodeResponse.setCode(_ctx.stringValue("GetCityCodeResponse.Code"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCityCodeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCityCode(_ctx.stringValue("GetCityCodeResponse.Data["+ i +"].CityCode"));
			dataItem.setCityAddress(_ctx.stringValue("GetCityCodeResponse.Data["+ i +"].CityAddress"));

			data.add(dataItem);
		}
		getCityCodeResponse.setData(data);
	 
	 	return getCityCodeResponse;
	}
}