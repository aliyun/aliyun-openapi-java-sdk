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

package com.aliyuncs.scdn.transform.v20171115;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnIpInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnIpInfoResponseUnmarshaller {

	public static DescribeScdnIpInfoResponse unmarshall(DescribeScdnIpInfoResponse describeScdnIpInfoResponse, UnmarshallerContext context) {
		
		describeScdnIpInfoResponse.setRequestId(context.stringValue("DescribeScdnIpInfoResponse.RequestId"));
		describeScdnIpInfoResponse.setIp(context.stringValue("DescribeScdnIpInfoResponse.Ip"));
		describeScdnIpInfoResponse.setISP(context.stringValue("DescribeScdnIpInfoResponse.ISP"));
		describeScdnIpInfoResponse.setIspEname(context.stringValue("DescribeScdnIpInfoResponse.IspEname"));
		describeScdnIpInfoResponse.setRegion(context.stringValue("DescribeScdnIpInfoResponse.Region"));
		describeScdnIpInfoResponse.setRegionEname(context.stringValue("DescribeScdnIpInfoResponse.RegionEname"));
	 
	 	return describeScdnIpInfoResponse;
	}
}