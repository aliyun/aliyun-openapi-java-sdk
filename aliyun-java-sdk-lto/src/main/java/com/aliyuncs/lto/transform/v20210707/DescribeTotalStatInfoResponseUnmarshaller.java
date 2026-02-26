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

import com.aliyuncs.lto.model.v20210707.DescribeTotalStatInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeTotalStatInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTotalStatInfoResponseUnmarshaller {

	public static DescribeTotalStatInfoResponse unmarshall(DescribeTotalStatInfoResponse describeTotalStatInfoResponse, UnmarshallerContext _ctx) {
		
		describeTotalStatInfoResponse.setRequestId(_ctx.stringValue("DescribeTotalStatInfoResponse.RequestId"));
		describeTotalStatInfoResponse.setCode(_ctx.stringValue("DescribeTotalStatInfoResponse.Code"));
		describeTotalStatInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeTotalStatInfoResponse.HttpStatusCode"));
		describeTotalStatInfoResponse.setMessage(_ctx.stringValue("DescribeTotalStatInfoResponse.Message"));
		describeTotalStatInfoResponse.setSuccess(_ctx.booleanValue("DescribeTotalStatInfoResponse.Success"));

		Data data = new Data();
		data.setAuthorizedCount(_ctx.longValue("DescribeTotalStatInfoResponse.Data.AuthorizedCount"));
		data.setTotalCount(_ctx.longValue("DescribeTotalStatInfoResponse.Data.TotalCount"));
		data.setUsedCount(_ctx.longValue("DescribeTotalStatInfoResponse.Data.UsedCount"));
		describeTotalStatInfoResponse.setData(data);
	 
	 	return describeTotalStatInfoResponse;
	}
}