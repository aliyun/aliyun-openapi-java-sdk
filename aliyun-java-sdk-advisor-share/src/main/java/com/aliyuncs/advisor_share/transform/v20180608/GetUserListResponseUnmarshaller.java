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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.GetUserListResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetUserListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserListResponseUnmarshaller {

	public static GetUserListResponse unmarshall(GetUserListResponse getUserListResponse, UnmarshallerContext _ctx) {
		
		getUserListResponse.setRequestId(_ctx.stringValue("GetUserListResponse.RequestId"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("GetUserListResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetUserListResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("GetUserListResponse.Data.Total"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserListResponse.Data.Result.Length"); i++) {
			result.add(_ctx.stringValue("GetUserListResponse.Data.Result["+ i +"]"));
		}
		data.setResult(result);
		getUserListResponse.setData(data);
	 
	 	return getUserListResponse;
	}
}