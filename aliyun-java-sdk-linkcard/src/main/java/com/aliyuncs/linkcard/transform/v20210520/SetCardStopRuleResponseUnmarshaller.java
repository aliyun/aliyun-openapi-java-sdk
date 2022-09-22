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

package com.aliyuncs.linkcard.transform.v20210520;

import com.aliyuncs.linkcard.model.v20210520.SetCardStopRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetCardStopRuleResponseUnmarshaller {

	public static SetCardStopRuleResponse unmarshall(SetCardStopRuleResponse setCardStopRuleResponse, UnmarshallerContext _ctx) {
		
		setCardStopRuleResponse.setRequestId(_ctx.stringValue("SetCardStopRuleResponse.RequestId"));
		setCardStopRuleResponse.setData(_ctx.booleanValue("SetCardStopRuleResponse.Data"));
		setCardStopRuleResponse.setErrorMessage(_ctx.stringValue("SetCardStopRuleResponse.ErrorMessage"));
		setCardStopRuleResponse.setSuccess(_ctx.booleanValue("SetCardStopRuleResponse.Success"));
		setCardStopRuleResponse.setLocalizedMessage(_ctx.stringValue("SetCardStopRuleResponse.LocalizedMessage"));
		setCardStopRuleResponse.setCode(_ctx.stringValue("SetCardStopRuleResponse.Code"));
	 
	 	return setCardStopRuleResponse;
	}
}