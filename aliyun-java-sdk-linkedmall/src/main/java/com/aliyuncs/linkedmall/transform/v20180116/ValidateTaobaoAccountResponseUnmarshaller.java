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

import com.aliyuncs.linkedmall.model.v20180116.ValidateTaobaoAccountResponse;
import com.aliyuncs.linkedmall.model.v20180116.ValidateTaobaoAccountResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateTaobaoAccountResponseUnmarshaller {

	public static ValidateTaobaoAccountResponse unmarshall(ValidateTaobaoAccountResponse validateTaobaoAccountResponse, UnmarshallerContext _ctx) {
		
		validateTaobaoAccountResponse.setRequestId(_ctx.stringValue("ValidateTaobaoAccountResponse.RequestId"));
		validateTaobaoAccountResponse.setCode(_ctx.stringValue("ValidateTaobaoAccountResponse.Code"));
		validateTaobaoAccountResponse.setMessage(_ctx.stringValue("ValidateTaobaoAccountResponse.Message"));
		validateTaobaoAccountResponse.setSubCode(_ctx.stringValue("ValidateTaobaoAccountResponse.SubCode"));
		validateTaobaoAccountResponse.setSubMessage(_ctx.stringValue("ValidateTaobaoAccountResponse.SubMessage"));
		validateTaobaoAccountResponse.setLogsId(_ctx.stringValue("ValidateTaobaoAccountResponse.LogsId"));
		validateTaobaoAccountResponse.setSuccess(_ctx.booleanValue("ValidateTaobaoAccountResponse.Success"));
		validateTaobaoAccountResponse.setTotalCount(_ctx.longValue("ValidateTaobaoAccountResponse.TotalCount"));

		Model model = new Model();
		model.setMatch(_ctx.booleanValue("ValidateTaobaoAccountResponse.Model.Match"));
		validateTaobaoAccountResponse.setModel(model);
	 
	 	return validateTaobaoAccountResponse;
	}
}