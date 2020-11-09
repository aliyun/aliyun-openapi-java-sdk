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

package com.aliyuncs.gts_smart_call.transform.v20201021;

import com.aliyuncs.gts_smart_call.model.v20201021.InteractVoiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InteractVoiceResponseUnmarshaller {

	public static InteractVoiceResponse unmarshall(InteractVoiceResponse interactVoiceResponse, UnmarshallerContext _ctx) {
		
		interactVoiceResponse.setRequestId(_ctx.stringValue("InteractVoiceResponse.RequestId"));
		interactVoiceResponse.setCallId(_ctx.stringValue("InteractVoiceResponse.CallId"));
		interactVoiceResponse.setAction(_ctx.stringValue("InteractVoiceResponse.Action"));
		interactVoiceResponse.setActionBreak(_ctx.booleanValue("InteractVoiceResponse.ActionBreak"));
		interactVoiceResponse.setActionCode(_ctx.stringValue("InteractVoiceResponse.ActionCode"));
		interactVoiceResponse.setActionCodeBreak(_ctx.booleanValue("InteractVoiceResponse.ActionCodeBreak"));
		interactVoiceResponse.setMuteTime(_ctx.integerValue("InteractVoiceResponse.MuteTime"));
		interactVoiceResponse.setDynamicId(_ctx.stringValue("InteractVoiceResponse.DynamicId"));
		interactVoiceResponse.setActionCodeParam(_ctx.stringValue("InteractVoiceResponse.ActionCodeParam"));
		interactVoiceResponse.setNumber(_ctx.stringValue("InteractVoiceResponse.Number"));
		interactVoiceResponse.setActionCodeTimeBreak(_ctx.integerValue("InteractVoiceResponse.ActionCodeTimeBreak"));
		interactVoiceResponse.setDtmfNoninOvertime(_ctx.integerValue("InteractVoiceResponse.DtmfNoninOvertime"));
		interactVoiceResponse.setDtmfMaxNumbers(_ctx.integerValue("InteractVoiceResponse.DtmfMaxNumbers"));
		interactVoiceResponse.setDtmfEndCharacter(_ctx.stringValue("InteractVoiceResponse.DtmfEndCharacter"));
		interactVoiceResponse.setTransferPlayfile(_ctx.stringValue("InteractVoiceResponse.TransferPlayfile"));
		interactVoiceResponse.setIsMonitor(_ctx.booleanValue("InteractVoiceResponse.IsMonitor"));
		interactVoiceResponse.setCcName(_ctx.stringValue("InteractVoiceResponse.CcName"));
		interactVoiceResponse.setErrorMessage(_ctx.stringValue("InteractVoiceResponse.ErrorMessage"));
		interactVoiceResponse.setSessionTimeout(_ctx.stringValue("InteractVoiceResponse.SessionTimeout"));
		interactVoiceResponse.setTtsVolume(_ctx.integerValue("InteractVoiceResponse.TtsVolume"));
		interactVoiceResponse.setRecordFlag(_ctx.booleanValue("InteractVoiceResponse.RecordFlag"));
		interactVoiceResponse.setPauseTime(_ctx.integerValue("InteractVoiceResponse.PauseTime"));
		interactVoiceResponse.setTtsConf(_ctx.booleanValue("InteractVoiceResponse.TtsConf"));
		interactVoiceResponse.setTtsStyle(_ctx.stringValue("InteractVoiceResponse.TtsStyle"));
		interactVoiceResponse.setTtsSpeed(_ctx.integerValue("InteractVoiceResponse.TtsSpeed"));
		interactVoiceResponse.setDtmfNoinOvertime(_ctx.integerValue("InteractVoiceResponse.DtmfNoinOvertime"));
	 
	 	return interactVoiceResponse;
	}
}