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

	public static DescribeSiteMonitorISPCityListResponse unmarshall(DescribeSiteMonitorISPCityListResponse describeSiteMonitorISPCityListResponse, UnmarshallerContext context) {
		
		describeSiteMonitorISPCityListResponse.setRequestId(context.stringValue("DescribeSiteMonitorISPCityListResponse.RequestId"));
		describeSiteMonitorISPCityListResponse.setCode(context.stringValue("DescribeSiteMonitorISPCityListResponse.Code"));
		describeSiteMonitorISPCityListResponse.setMessage(context.stringValue("DescribeSiteMonitorISPCityListResponse.Message"));
		describeSiteMonitorISPCityListResponse.setSuccess(context.stringValue("DescribeSiteMonitorISPCityListResponse.Success"));

		List<IspCity> ispCityList = new ArrayList<IspCity>();
		for (int i = 0; i < context.lengthValue("DescribeSiteMonitorISPCityListResponse.IspCityList.Length"); i++) {
			IspCity ispCity = new IspCity();
			ispCity.setIsp(context.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].Isp"));
			ispCity.setCity(context.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].City"));
			ispCity.setIspNamezh_CN(context.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].IspName.zh_CN"));
			ispCity.setCityNamezh_CN(context.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].CityName.zh_CN"));
			ispCity.setRegionzh_CN(context.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].Region.zh_CN"));
			ispCity.setCountryzh_CN(context.stringValue("DescribeSiteMonitorISPCityListResponse.IspCityList["+ i +"].Country.zh_CN"));

			ispCityList.add(ispCity);
		}
		describeSiteMonitorISPCityListResponse.setIspCityList(ispCityList);
	 
	 	return describeSiteMonitorISPCityListResponse;
	}
}