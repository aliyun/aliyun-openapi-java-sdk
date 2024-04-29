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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetSyntheticMonitorsResponse;
import com.aliyuncs.arms.model.v20190808.GetSyntheticMonitorsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSyntheticMonitorsResponseUnmarshaller {

	public static GetSyntheticMonitorsResponse unmarshall(GetSyntheticMonitorsResponse getSyntheticMonitorsResponse, UnmarshallerContext _ctx) {
		
		getSyntheticMonitorsResponse.setRequestId(_ctx.stringValue("GetSyntheticMonitorsResponse.RequestId"));
		getSyntheticMonitorsResponse.setCode(_ctx.longValue("GetSyntheticMonitorsResponse.Code"));
		getSyntheticMonitorsResponse.setMessage(_ctx.stringValue("GetSyntheticMonitorsResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSyntheticMonitorsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCountry(_ctx.stringValue("GetSyntheticMonitorsResponse.Data["+ i +"].Country"));
			dataItem.setRegion(_ctx.stringValue("GetSyntheticMonitorsResponse.Data["+ i +"].Region"));
			dataItem.setCity(_ctx.stringValue("GetSyntheticMonitorsResponse.Data["+ i +"].City"));
			dataItem.setCityCode(_ctx.stringValue("GetSyntheticMonitorsResponse.Data["+ i +"].CityCode"));
			dataItem.setOperator(_ctx.stringValue("GetSyntheticMonitorsResponse.Data["+ i +"].Operator"));
			dataItem.setOperatorCode(_ctx.stringValue("GetSyntheticMonitorsResponse.Data["+ i +"].OperatorCode"));
			dataItem.setClientType(_ctx.integerValue("GetSyntheticMonitorsResponse.Data["+ i +"].ClientType"));
			dataItem.setCanBeSelected(_ctx.booleanValue("GetSyntheticMonitorsResponse.Data["+ i +"].CanBeSelected"));
			dataItem.setAvailable(_ctx.stringValue("GetSyntheticMonitorsResponse.Data["+ i +"].Available"));
			dataItem.setIpv6(_ctx.integerValue("GetSyntheticMonitorsResponse.Data["+ i +"].Ipv6"));

			data.add(dataItem);
		}
		getSyntheticMonitorsResponse.setData(data);
	 
	 	return getSyntheticMonitorsResponse;
	}
}