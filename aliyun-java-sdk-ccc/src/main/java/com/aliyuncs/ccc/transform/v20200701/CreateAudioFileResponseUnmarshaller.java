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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.CreateAudioFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAudioFileResponseUnmarshaller {

	public static CreateAudioFileResponse unmarshall(CreateAudioFileResponse createAudioFileResponse, UnmarshallerContext _ctx) {
		
		createAudioFileResponse.setRequestId(_ctx.stringValue("CreateAudioFileResponse.RequestId"));
		createAudioFileResponse.setHttpStatusCode(_ctx.integerValue("CreateAudioFileResponse.HttpStatusCode"));
		createAudioFileResponse.setCode(_ctx.stringValue("CreateAudioFileResponse.Code"));
		createAudioFileResponse.setMessage(_ctx.stringValue("CreateAudioFileResponse.Message"));
		createAudioFileResponse.setData(_ctx.stringValue("CreateAudioFileResponse.Data"));
	 
	 	return createAudioFileResponse;
	}
}