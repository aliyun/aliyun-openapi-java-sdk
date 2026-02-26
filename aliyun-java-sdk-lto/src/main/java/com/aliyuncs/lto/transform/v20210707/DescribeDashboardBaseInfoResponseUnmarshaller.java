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

import com.aliyuncs.lto.model.v20210707.DescribeDashboardBaseInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeDashboardBaseInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDashboardBaseInfoResponseUnmarshaller {

	public static DescribeDashboardBaseInfoResponse unmarshall(DescribeDashboardBaseInfoResponse describeDashboardBaseInfoResponse, UnmarshallerContext _ctx) {
		
		describeDashboardBaseInfoResponse.setRequestId(_ctx.stringValue("DescribeDashboardBaseInfoResponse.RequestId"));
		describeDashboardBaseInfoResponse.setCode(_ctx.stringValue("DescribeDashboardBaseInfoResponse.Code"));
		describeDashboardBaseInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeDashboardBaseInfoResponse.HttpStatusCode"));
		describeDashboardBaseInfoResponse.setMessage(_ctx.stringValue("DescribeDashboardBaseInfoResponse.Message"));
		describeDashboardBaseInfoResponse.setSuccess(_ctx.booleanValue("DescribeDashboardBaseInfoResponse.Success"));

		Data data = new Data();
		data.setBizChainCount(_ctx.integerValue("DescribeDashboardBaseInfoResponse.Data.BizChainCount"));
		data.setMemberCount(_ctx.integerValue("DescribeDashboardBaseInfoResponse.Data.MemberCount"));
		data.setDeviceCount(_ctx.integerValue("DescribeDashboardBaseInfoResponse.Data.DeviceCount"));
		data.setApiInvokeCount(_ctx.longValue("DescribeDashboardBaseInfoResponse.Data.ApiInvokeCount"));
		describeDashboardBaseInfoResponse.setData(data);
	 
	 	return describeDashboardBaseInfoResponse;
	}
}