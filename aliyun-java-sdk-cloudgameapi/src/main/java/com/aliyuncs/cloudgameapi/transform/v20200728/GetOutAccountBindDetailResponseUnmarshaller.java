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

package com.aliyuncs.cloudgameapi.transform.v20200728;

import com.aliyuncs.cloudgameapi.model.v20200728.GetOutAccountBindDetailResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.GetOutAccountBindDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOutAccountBindDetailResponseUnmarshaller {

	public static GetOutAccountBindDetailResponse unmarshall(GetOutAccountBindDetailResponse getOutAccountBindDetailResponse, UnmarshallerContext _ctx) {
		
		getOutAccountBindDetailResponse.setRequestId(_ctx.stringValue("GetOutAccountBindDetailResponse.RequestId"));

		Data data = new Data();
		data.setBindStatus(_ctx.integerValue("GetOutAccountBindDetailResponse.Data.BindStatus"));
		data.setOutAccountType(_ctx.stringValue("GetOutAccountBindDetailResponse.Data.OutAccountType"));
		data.setOutAccountId(_ctx.stringValue("GetOutAccountBindDetailResponse.Data.OutAccountId"));
		data.setToken(_ctx.stringValue("GetOutAccountBindDetailResponse.Data.Token"));
		data.setTokenExpireTime(_ctx.longValue("GetOutAccountBindDetailResponse.Data.TokenExpireTime"));
		getOutAccountBindDetailResponse.setData(data);
	 
	 	return getOutAccountBindDetailResponse;
	}
}