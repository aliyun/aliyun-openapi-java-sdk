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

import com.aliyuncs.lto.model.v20210707.DescribeMemberTotalStatInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeMemberTotalStatInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMemberTotalStatInfoResponseUnmarshaller {

	public static DescribeMemberTotalStatInfoResponse unmarshall(DescribeMemberTotalStatInfoResponse describeMemberTotalStatInfoResponse, UnmarshallerContext _ctx) {
		
		describeMemberTotalStatInfoResponse.setRequestId(_ctx.stringValue("DescribeMemberTotalStatInfoResponse.RequestId"));
		describeMemberTotalStatInfoResponse.setCode(_ctx.stringValue("DescribeMemberTotalStatInfoResponse.Code"));
		describeMemberTotalStatInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeMemberTotalStatInfoResponse.HttpStatusCode"));
		describeMemberTotalStatInfoResponse.setMessage(_ctx.stringValue("DescribeMemberTotalStatInfoResponse.Message"));
		describeMemberTotalStatInfoResponse.setSuccess(_ctx.booleanValue("DescribeMemberTotalStatInfoResponse.Success"));

		Data data = new Data();
		data.setAuthorizedCount(_ctx.longValue("DescribeMemberTotalStatInfoResponse.Data.AuthorizedCount"));
		data.setUsedCount(_ctx.longValue("DescribeMemberTotalStatInfoResponse.Data.UsedCount"));
		describeMemberTotalStatInfoResponse.setData(data);
	 
	 	return describeMemberTotalStatInfoResponse;
	}
}