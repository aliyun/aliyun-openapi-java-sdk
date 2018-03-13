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
package com.aliyuncs.qualitycheck.transform.v20160801;

import com.aliyuncs.qualitycheck.model.v20160801.UploadAudioDataWithRules4PreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadAudioDataWithRules4PreResponseUnmarshaller {

	public static UploadAudioDataWithRules4PreResponse unmarshall(UploadAudioDataWithRules4PreResponse uploadAudioDataWithRules4PreResponse, UnmarshallerContext context) {
		
		uploadAudioDataWithRules4PreResponse.setRequestId(context.stringValue("UploadAudioDataWithRules4PreResponse.requestId"));
		uploadAudioDataWithRules4PreResponse.setSuccess(context.booleanValue("UploadAudioDataWithRules4PreResponse.success"));
		uploadAudioDataWithRules4PreResponse.setCode(context.stringValue("UploadAudioDataWithRules4PreResponse.code"));
		uploadAudioDataWithRules4PreResponse.setMessage(context.stringValue("UploadAudioDataWithRules4PreResponse.message"));
		uploadAudioDataWithRules4PreResponse.setData(context.stringValue("UploadAudioDataWithRules4PreResponse.data"));
	 
	 	return uploadAudioDataWithRules4PreResponse;
	}
}