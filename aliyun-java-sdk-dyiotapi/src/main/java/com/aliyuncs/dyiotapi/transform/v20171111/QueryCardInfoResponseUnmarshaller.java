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

import com.aliyuncs.dyiotapi.model.v20171111.QueryCardInfoResponse;
import com.aliyuncs.dyiotapi.model.v20171111.QueryCardInfoResponse.CardInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCardInfoResponseUnmarshaller {

	public static QueryCardInfoResponse unmarshall(QueryCardInfoResponse queryCardInfoResponse, UnmarshallerContext _ctx) {
		
		queryCardInfoResponse.setRequestId(_ctx.stringValue("QueryCardInfoResponse.RequestId"));
		queryCardInfoResponse.setCode(_ctx.stringValue("QueryCardInfoResponse.Code"));
		queryCardInfoResponse.setMessage(_ctx.stringValue("QueryCardInfoResponse.Message"));

		CardInfo cardInfo = new CardInfo();
		cardInfo.setIccid(_ctx.stringValue("QueryCardInfoResponse.CardInfo.Iccid"));
		cardInfo.setOpenTime(_ctx.stringValue("QueryCardInfoResponse.CardInfo.OpenTime"));
		cardInfo.setFirstActiveTime(_ctx.stringValue("QueryCardInfoResponse.CardInfo.FirstActiveTime"));
		cardInfo.setImsi(_ctx.stringValue("QueryCardInfoResponse.CardInfo.Imsi"));
		cardInfo.setMsisdn(_ctx.stringValue("QueryCardInfoResponse.CardInfo.Msisdn"));
		cardInfo.setGprsStatus(_ctx.stringValue("QueryCardInfoResponse.CardInfo.GprsStatus"));
		cardInfo.setVoiceStatus(_ctx.stringValue("QueryCardInfoResponse.CardInfo.VoiceStatus"));
		cardInfo.setSmsStatus(_ctx.stringValue("QueryCardInfoResponse.CardInfo.SmsStatus"));
		queryCardInfoResponse.setCardInfo(cardInfo);
	 
	 	return queryCardInfoResponse;
	}
}