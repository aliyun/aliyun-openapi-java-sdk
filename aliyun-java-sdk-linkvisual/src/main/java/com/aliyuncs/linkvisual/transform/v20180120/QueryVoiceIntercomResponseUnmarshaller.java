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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.QueryVoiceIntercomResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryVoiceIntercomResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryVoiceIntercomResponse.Data.CryptoKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVoiceIntercomResponseUnmarshaller {

	public static QueryVoiceIntercomResponse unmarshall(QueryVoiceIntercomResponse queryVoiceIntercomResponse, UnmarshallerContext _ctx) {
		
		queryVoiceIntercomResponse.setRequestId(_ctx.stringValue("QueryVoiceIntercomResponse.RequestId"));
		queryVoiceIntercomResponse.setSuccess(_ctx.booleanValue("QueryVoiceIntercomResponse.Success"));
		queryVoiceIntercomResponse.setErrorMessage(_ctx.stringValue("QueryVoiceIntercomResponse.ErrorMessage"));
		queryVoiceIntercomResponse.setCode(_ctx.stringValue("QueryVoiceIntercomResponse.Code"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("QueryVoiceIntercomResponse.Data.Url"));

		CryptoKey cryptoKey = new CryptoKey();
		cryptoKey.setIv(_ctx.stringValue("QueryVoiceIntercomResponse.Data.CryptoKey.Iv"));
		cryptoKey.setKey(_ctx.stringValue("QueryVoiceIntercomResponse.Data.CryptoKey.Key"));
		data.setCryptoKey(cryptoKey);
		queryVoiceIntercomResponse.setData(data);
	 
	 	return queryVoiceIntercomResponse;
	}
}