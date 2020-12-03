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

package com.aliyuncs.netana.transform.v20201016;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.netana.model.v20201016.ListIpGeolocationsResponse;
import com.aliyuncs.netana.model.v20201016.ListIpGeolocationsResponse.IpGeolocationModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIpGeolocationsResponseUnmarshaller {

	public static ListIpGeolocationsResponse unmarshall(ListIpGeolocationsResponse listIpGeolocationsResponse, UnmarshallerContext _ctx) {
		
		listIpGeolocationsResponse.setRequestId(_ctx.stringValue("ListIpGeolocationsResponse.RequestId"));
		listIpGeolocationsResponse.setNextToken(_ctx.stringValue("ListIpGeolocationsResponse.NextToken"));
		listIpGeolocationsResponse.setTotalCount(_ctx.integerValue("ListIpGeolocationsResponse.TotalCount"));
		listIpGeolocationsResponse.setMaxResults(_ctx.integerValue("ListIpGeolocationsResponse.MaxResults"));

		List<IpGeolocationModel> ipGeolocationModels = new ArrayList<IpGeolocationModel>();
		for (int i = 0; i < _ctx.lengthValue("ListIpGeolocationsResponse.IpGeolocationModels.Length"); i++) {
			IpGeolocationModel ipGeolocationModel = new IpGeolocationModel();
			ipGeolocationModel.setIpv4Prefix(_ctx.stringValue("ListIpGeolocationsResponse.IpGeolocationModels["+ i +"].Ipv4Prefix"));
			ipGeolocationModel.setCountryCode(_ctx.stringValue("ListIpGeolocationsResponse.IpGeolocationModels["+ i +"].CountryCode"));
			ipGeolocationModel.setCityCode(_ctx.stringValue("ListIpGeolocationsResponse.IpGeolocationModels["+ i +"].CityCode"));
			ipGeolocationModel.setResourcePoolName(_ctx.stringValue("ListIpGeolocationsResponse.IpGeolocationModels["+ i +"].ResourcePoolName"));

			ipGeolocationModels.add(ipGeolocationModel);
		}
		listIpGeolocationsResponse.setIpGeolocationModels(ipGeolocationModels);
	 
	 	return listIpGeolocationsResponse;
	}
}