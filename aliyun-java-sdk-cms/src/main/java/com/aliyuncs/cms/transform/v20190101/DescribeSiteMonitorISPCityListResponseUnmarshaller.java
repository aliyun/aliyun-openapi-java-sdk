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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorISPCityListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorISPCityListResponse.IspCity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSiteMonitorISPCityListResponseUnmarshaller {

	public static DescribeSiteMonitorISPCityListResponse unmarshall(DescribeSiteMonitorISPCityListResponse describeSiteMonitorISPCityListResponse, UnmarshallerContext _ctx) {
		
		describeSiteMonitorISPCityListResponse.setRequestId(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.RequestId"));
		describeSiteMonitorISPCityListResponse.setCode(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.Code"));
		describeSiteMonitorISPCityListResponse.setMessage(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.Message"));
		describeSiteMonitorISPCityListResponse.setSuccess(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.Success"));

		List<IspCity> ispCityList = new ArrayList<IspCity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSiteMonitorISPCityListResponse.IspCityList.Length"); i++) {
			IspCity ispCity = new IspCity();
			ispCity.setIsp(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].Isp"));
			ispCity.setCity(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].City"));
			ispCity.setRegion(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].Region"));
			ispCity.setCountry(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].Country"));
			ispCity.setIspNameen(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].IspName.en"));
			ispCity.setIspNamezh_CN(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].IspName.zh_CN"));
			ispCity.setCityNameen(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].CityName.en"));
			ispCity.setCityNamezh_CN(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].CityName.zh_CN"));
			ispCity.setRegionen(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].Region.en"));
			ispCity.setRegionzh_CN(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].Region.zh_CN"));
			ispCity.setCountryen(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].Country.en"));
			ispCity.setCountryzh_CN(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].Country.zh_CN"));
			ispCity.setIPV4ProbeCount(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].IPV4ProbeCount"));
			ispCity.setIPV6ProbeCount(_ctx.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].IPV6ProbeCount"));

			ispCityList.add(ispCity);
		}
		describeSiteMonitorISPCityListResponse.setIspCityList(ispCityList);
	 
	 	return describeSiteMonitorISPCityListResponse;
	}
}