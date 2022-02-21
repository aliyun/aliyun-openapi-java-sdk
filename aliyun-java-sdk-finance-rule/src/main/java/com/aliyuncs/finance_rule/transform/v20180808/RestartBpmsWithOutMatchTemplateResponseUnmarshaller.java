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

package com.aliyuncs.finance_rule.transform.v20180808;

import com.aliyuncs.finance_rule.model.v20180808.RestartBpmsWithOutMatchTemplateResponse;
import com.aliyuncs.finance_rule.model.v20180808.RestartBpmsWithOutMatchTemplateResponse.ExtendInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestartBpmsWithOutMatchTemplateResponseUnmarshaller {

	public static RestartBpmsWithOutMatchTemplateResponse unmarshall(RestartBpmsWithOutMatchTemplateResponse restartBpmsWithOutMatchTemplateResponse, UnmarshallerContext _ctx) {
		
		restartBpmsWithOutMatchTemplateResponse.setResultMessage(_ctx.stringValue("RestartBpmsWithOutMatchTemplateResponse.ResultMessage"));
		restartBpmsWithOutMatchTemplateResponse.setResultCode(_ctx.stringValue("RestartBpmsWithOutMatchTemplateResponse.ResultCode"));
		restartBpmsWithOutMatchTemplateResponse.setRemark(_ctx.stringValue("RestartBpmsWithOutMatchTemplateResponse.Remark"));
		restartBpmsWithOutMatchTemplateResponse.setSuccess(_ctx.booleanValue("RestartBpmsWithOutMatchTemplateResponse.Success"));
		restartBpmsWithOutMatchTemplateResponse.setResultObj(_ctx.stringValue("RestartBpmsWithOutMatchTemplateResponse.ResultObj"));

		ExtendInfo extendInfo = new ExtendInfo();
		extendInfo.setPlaceHolder1(_ctx.stringValue("RestartBpmsWithOutMatchTemplateResponse.ExtendInfo.PlaceHolder1"));
		restartBpmsWithOutMatchTemplateResponse.setExtendInfo(extendInfo);
	 
	 	return restartBpmsWithOutMatchTemplateResponse;
	}
}