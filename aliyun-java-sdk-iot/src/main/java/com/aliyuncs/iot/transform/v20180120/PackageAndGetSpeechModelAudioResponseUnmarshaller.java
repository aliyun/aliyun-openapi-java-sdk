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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.PackageAndGetSpeechModelAudioResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PackageAndGetSpeechModelAudioResponseUnmarshaller {

	public static PackageAndGetSpeechModelAudioResponse unmarshall(PackageAndGetSpeechModelAudioResponse packageAndGetSpeechModelAudioResponse, UnmarshallerContext _ctx) {
		
		packageAndGetSpeechModelAudioResponse.setRequestId(_ctx.stringValue("PackageAndGetSpeechModelAudioResponse.RequestId"));
		packageAndGetSpeechModelAudioResponse.setSuccess(_ctx.booleanValue("PackageAndGetSpeechModelAudioResponse.Success"));
		packageAndGetSpeechModelAudioResponse.setCode(_ctx.stringValue("PackageAndGetSpeechModelAudioResponse.Code"));
		packageAndGetSpeechModelAudioResponse.setErrorMessage(_ctx.stringValue("PackageAndGetSpeechModelAudioResponse.ErrorMessage"));
		packageAndGetSpeechModelAudioResponse.setData(_ctx.stringValue("PackageAndGetSpeechModelAudioResponse.Data"));
	 
	 	return packageAndGetSpeechModelAudioResponse;
	}
}