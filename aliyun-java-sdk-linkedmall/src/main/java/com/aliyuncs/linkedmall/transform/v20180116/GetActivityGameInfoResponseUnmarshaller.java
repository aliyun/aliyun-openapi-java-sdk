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

import com.aliyuncs.linkedmall.model.v20180116.GetActivityGameInfoResponse;
import com.aliyuncs.linkedmall.model.v20180116.GetActivityGameInfoResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetActivityGameInfoResponseUnmarshaller {

	public static GetActivityGameInfoResponse unmarshall(GetActivityGameInfoResponse getActivityGameInfoResponse, UnmarshallerContext _ctx) {
		
		getActivityGameInfoResponse.setRequestId(_ctx.stringValue("GetActivityGameInfoResponse.RequestId"));
		getActivityGameInfoResponse.setCode(_ctx.stringValue("GetActivityGameInfoResponse.Code"));
		getActivityGameInfoResponse.setMessage(_ctx.stringValue("GetActivityGameInfoResponse.Message"));

		Model model = new Model();
		model.setUserProcessDTO(_ctx.stringValue("GetActivityGameInfoResponse.Model.UserProcessDTO"));
		model.setGameDTO(_ctx.stringValue("GetActivityGameInfoResponse.Model.GameDTO"));
		model.setUserGameCoinInfos(_ctx.stringValue("GetActivityGameInfoResponse.Model.UserGameCoinInfos"));
		model.setExtInfo(_ctx.stringValue("GetActivityGameInfoResponse.Model.ExtInfo"));
		getActivityGameInfoResponse.setModel(model);
	 
	 	return getActivityGameInfoResponse;
	}
}