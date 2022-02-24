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

import com.aliyuncs.dt_oc_info.model.v20200401.GetNearbyCompanyResponse;
import com.aliyuncs.dt_oc_info.model.v20200401.GetNearbyCompanyResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNearbyCompanyResponseUnmarshaller {

	public static GetNearbyCompanyResponse unmarshall(GetNearbyCompanyResponse getNearbyCompanyResponse, UnmarshallerContext _ctx) {
		
		getNearbyCompanyResponse.setRequestId(_ctx.stringValue("GetNearbyCompanyResponse.RequestId"));
		getNearbyCompanyResponse.setCode(_ctx.integerValue("GetNearbyCompanyResponse.Code"));
		getNearbyCompanyResponse.setMessage(_ctx.stringValue("GetNearbyCompanyResponse.Message"));
		getNearbyCompanyResponse.setTotal(_ctx.integerValue("GetNearbyCompanyResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetNearbyCompanyResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setIndustry(_ctx.stringValue("GetNearbyCompanyResponse.Data["+ i +"].Industry"));
			dataItem.setDistance(_ctx.floatValue("GetNearbyCompanyResponse.Data["+ i +"].Distance"));
			dataItem.setRegLon(_ctx.floatValue("GetNearbyCompanyResponse.Data["+ i +"].RegLon"));
			dataItem.setRegCap(_ctx.floatValue("GetNearbyCompanyResponse.Data["+ i +"].RegCap"));
			dataItem.setCorpName(_ctx.stringValue("GetNearbyCompanyResponse.Data["+ i +"].CorpName"));
			dataItem.setRegAddress(_ctx.stringValue("GetNearbyCompanyResponse.Data["+ i +"].RegAddress"));
			dataItem.setRegLat(_ctx.floatValue("GetNearbyCompanyResponse.Data["+ i +"].RegLat"));
			dataItem.setBizStatus(_ctx.stringValue("GetNearbyCompanyResponse.Data["+ i +"].BizStatus"));
			dataItem.setOneCompId(_ctx.stringValue("GetNearbyCompanyResponse.Data["+ i +"].OneCompId"));

			data.add(dataItem);
		}
		getNearbyCompanyResponse.setData(data);
	 
	 	return getNearbyCompanyResponse;
	}
}