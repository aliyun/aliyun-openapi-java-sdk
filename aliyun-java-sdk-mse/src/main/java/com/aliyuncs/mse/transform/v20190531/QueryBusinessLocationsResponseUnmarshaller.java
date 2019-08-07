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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.QueryBusinessLocationsResponse;
import com.aliyuncs.mse.model.v20190531.QueryBusinessLocationsResponse.LocationData;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBusinessLocationsResponseUnmarshaller {

	public static QueryBusinessLocationsResponse unmarshall(QueryBusinessLocationsResponse queryBusinessLocationsResponse, UnmarshallerContext _ctx) {
		
		queryBusinessLocationsResponse.setRequestId(_ctx.stringValue("QueryBusinessLocationsResponse.RequestId"));
		queryBusinessLocationsResponse.setSuccess(_ctx.stringValue("QueryBusinessLocationsResponse.Success"));
		queryBusinessLocationsResponse.setMessage(_ctx.stringValue("QueryBusinessLocationsResponse.Message"));
		queryBusinessLocationsResponse.setErrorCode(_ctx.stringValue("QueryBusinessLocationsResponse.ErrorCode"));

		List<LocationData> data = new ArrayList<LocationData>();
		for (int i = 0; i < _ctx.lengthValue("QueryBusinessLocationsResponse.Data.Length"); i++) {
			LocationData locationData = new LocationData();
			locationData.setType(_ctx.stringValue("QueryBusinessLocationsResponse.Data["+ i +"].Type"));
			locationData.setName(_ctx.stringValue("QueryBusinessLocationsResponse.Data["+ i +"].Name"));
			locationData.setCnName(_ctx.stringValue("QueryBusinessLocationsResponse.Data["+ i +"].CnName"));
			locationData.setEnName(_ctx.stringValue("QueryBusinessLocationsResponse.Data["+ i +"].EnName"));
			locationData.setShowName(_ctx.stringValue("QueryBusinessLocationsResponse.Data["+ i +"].ShowName"));
			locationData.setDescription(_ctx.stringValue("QueryBusinessLocationsResponse.Data["+ i +"].Description"));
			locationData.setEnDescription(_ctx.stringValue("QueryBusinessLocationsResponse.Data["+ i +"].EnDescription"));
			locationData.setOrdering(_ctx.integerValue("QueryBusinessLocationsResponse.Data["+ i +"].Ordering"));
			locationData.setDistrictId(_ctx.stringValue("QueryBusinessLocationsResponse.Data["+ i +"].DistrictId"));
			locationData.setDistrictCnName(_ctx.stringValue("QueryBusinessLocationsResponse.Data["+ i +"].DistrictCnName"));
			locationData.setDistrictEnName(_ctx.stringValue("QueryBusinessLocationsResponse.Data["+ i +"].DistrictEnName"));
			locationData.setDistrictShowName(_ctx.stringValue("QueryBusinessLocationsResponse.Data["+ i +"].DistrictShowName"));
			locationData.setDistrictOrdering(_ctx.integerValue("QueryBusinessLocationsResponse.Data["+ i +"].DistrictOrdering"));

			data.add(locationData);
		}
		queryBusinessLocationsResponse.setData(data);
	 
	 	return queryBusinessLocationsResponse;
	}
}