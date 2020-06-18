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

package com.aliyuncs.dyiotapi.transform.v20171111;

import com.aliyuncs.dyiotapi.model.v20171111.QueryCardStatusResponse;
import com.aliyuncs.dyiotapi.model.v20171111.QueryCardStatusResponse.CardStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCardStatusResponseUnmarshaller {

	public static QueryCardStatusResponse unmarshall(QueryCardStatusResponse queryCardStatusResponse, UnmarshallerContext _ctx) {
		
		queryCardStatusResponse.setRequestId(_ctx.stringValue("QueryCardStatusResponse.RequestId"));
		queryCardStatusResponse.setCode(_ctx.stringValue("QueryCardStatusResponse.Code"));
		queryCardStatusResponse.setMessage(_ctx.stringValue("QueryCardStatusResponse.Message"));

		CardStatus cardStatus = new CardStatus();
		cardStatus.setIccid(_ctx.stringValue("QueryCardStatusResponse.CardStatus.Iccid"));
		cardStatus.setMsisdn(_ctx.stringValue("QueryCardStatusResponse.CardStatus.Msisdn"));
		cardStatus.setUserStatus(_ctx.stringValue("QueryCardStatusResponse.CardStatus.UserStatus"));
		queryCardStatusResponse.setCardStatus(cardStatus);
	 
	 	return queryCardStatusResponse;
	}
}