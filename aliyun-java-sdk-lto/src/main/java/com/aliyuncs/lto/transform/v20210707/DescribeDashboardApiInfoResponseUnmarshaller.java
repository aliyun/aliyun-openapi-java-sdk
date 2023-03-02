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

import com.aliyuncs.lto.model.v20210707.DescribeDashboardApiInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeDashboardApiInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDashboardApiInfoResponseUnmarshaller {

	public static DescribeDashboardApiInfoResponse unmarshall(DescribeDashboardApiInfoResponse describeDashboardApiInfoResponse, UnmarshallerContext _ctx) {
		
		describeDashboardApiInfoResponse.setRequestId(_ctx.stringValue("DescribeDashboardApiInfoResponse.RequestId"));
		describeDashboardApiInfoResponse.setCode(_ctx.stringValue("DescribeDashboardApiInfoResponse.Code"));
		describeDashboardApiInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeDashboardApiInfoResponse.HttpStatusCode"));
		describeDashboardApiInfoResponse.setMessage(_ctx.stringValue("DescribeDashboardApiInfoResponse.Message"));
		describeDashboardApiInfoResponse.setSuccess(_ctx.booleanValue("DescribeDashboardApiInfoResponse.Success"));

		Data data = new Data();
		data.setAuthorizedCount(_ctx.longValue("DescribeDashboardApiInfoResponse.Data.AuthorizedCount"));
		data.setUsedCount(_ctx.longValue("DescribeDashboardApiInfoResponse.Data.UsedCount"));
		describeDashboardApiInfoResponse.setData(data);
	 
	 	return describeDashboardApiInfoResponse;
	}
}