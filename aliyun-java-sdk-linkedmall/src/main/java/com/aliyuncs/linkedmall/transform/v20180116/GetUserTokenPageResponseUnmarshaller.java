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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.GetUserTokenPageResponse;
import com.aliyuncs.linkedmall.model.v20180116.GetUserTokenPageResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserTokenPageResponseUnmarshaller {

	public static GetUserTokenPageResponse unmarshall(GetUserTokenPageResponse getUserTokenPageResponse, UnmarshallerContext _ctx) {
		
		getUserTokenPageResponse.setRequestId(_ctx.stringValue("GetUserTokenPageResponse.RequestId"));
		getUserTokenPageResponse.setCode(_ctx.stringValue("GetUserTokenPageResponse.Code"));
		getUserTokenPageResponse.setMessage(_ctx.stringValue("GetUserTokenPageResponse.Message"));

		Model model = new Model();
		model.setUrl(_ctx.stringValue("GetUserTokenPageResponse.Model.Url"));
		getUserTokenPageResponse.setModel(model);
	 
	 	return getUserTokenPageResponse;
	}
}