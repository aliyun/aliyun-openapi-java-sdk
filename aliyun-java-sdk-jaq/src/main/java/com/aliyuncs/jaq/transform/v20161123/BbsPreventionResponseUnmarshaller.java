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
package com.aliyuncs.jaq.transform.v20161123;

import com.aliyuncs.jaq.model.v20161123.BbsPreventionResponse;
import com.aliyuncs.jaq.model.v20161123.BbsPreventionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BbsPreventionResponseUnmarshaller {

	public static BbsPreventionResponse unmarshall(BbsPreventionResponse bbsPreventionResponse, UnmarshallerContext context) {
		
		bbsPreventionResponse.setErrorCode(context.integerValue("BbsPreventionResponse.ErrorCode"));
		bbsPreventionResponse.setErrorMsg(context.stringValue("BbsPreventionResponse.ErrorMsg"));

		Data data = new Data();
		data.setFnalDecision(context.integerValue("BbsPreventionResponse.Data.FnalDecision"));
		data.setEventId(context.stringValue("BbsPreventionResponse.Data.EventId"));
		data.setUserId(context.stringValue("BbsPreventionResponse.Data.UserId"));
		data.setFinalScore(context.integerValue("BbsPreventionResponse.Data.FinalScore"));
		data.setFinalDesc(context.stringValue("BbsPreventionResponse.Data.FinalDesc"));
		data.setDetail(context.stringValue("BbsPreventionResponse.Data.Detail"));
		data.setCaptchaCheckData(context.stringValue("BbsPreventionResponse.Data.CaptchaCheckData"));
		bbsPreventionResponse.setData(data);
	 
	 	return bbsPreventionResponse;
	}
}