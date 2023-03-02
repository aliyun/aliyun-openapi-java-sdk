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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.DescribeDashboardDeviceInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeDashboardDeviceInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDashboardDeviceInfoResponseUnmarshaller {

	public static DescribeDashboardDeviceInfoResponse unmarshall(DescribeDashboardDeviceInfoResponse describeDashboardDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		describeDashboardDeviceInfoResponse.setRequestId(_ctx.stringValue("DescribeDashboardDeviceInfoResponse.RequestId"));
		describeDashboardDeviceInfoResponse.setCode(_ctx.stringValue("DescribeDashboardDeviceInfoResponse.Code"));
		describeDashboardDeviceInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeDashboardDeviceInfoResponse.HttpStatusCode"));
		describeDashboardDeviceInfoResponse.setMessage(_ctx.stringValue("DescribeDashboardDeviceInfoResponse.Message"));
		describeDashboardDeviceInfoResponse.setSuccess(_ctx.booleanValue("DescribeDashboardDeviceInfoResponse.Success"));

		Data data = new Data();
		data.setAuthorizedCount(_ctx.longValue("DescribeDashboardDeviceInfoResponse.Data.AuthorizedCount"));
		data.setUsedCount(_ctx.longValue("DescribeDashboardDeviceInfoResponse.Data.UsedCount"));
		describeDashboardDeviceInfoResponse.setData(data);
	 
	 	return describeDashboardDeviceInfoResponse;
	}
}