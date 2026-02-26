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

import com.aliyuncs.advisor_share.model.v20180608.GetAdviceConfProjectOwnerListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAdviceConfProjectOwnerListResponseUnmarshaller {

	public static GetAdviceConfProjectOwnerListResponse unmarshall(GetAdviceConfProjectOwnerListResponse getAdviceConfProjectOwnerListResponse, UnmarshallerContext _ctx) {
		
		getAdviceConfProjectOwnerListResponse.setRequestId(_ctx.stringValue("GetAdviceConfProjectOwnerListResponse.RequestId"));
		getAdviceConfProjectOwnerListResponse.setMessage(_ctx.stringValue("GetAdviceConfProjectOwnerListResponse.Message"));
		getAdviceConfProjectOwnerListResponse.setSuccess(_ctx.booleanValue("GetAdviceConfProjectOwnerListResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAdviceConfProjectOwnerListResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetAdviceConfProjectOwnerListResponse.Data["+ i +"]"));
		}
		getAdviceConfProjectOwnerListResponse.setData(data);
	 
	 	return getAdviceConfProjectOwnerListResponse;
	}
}