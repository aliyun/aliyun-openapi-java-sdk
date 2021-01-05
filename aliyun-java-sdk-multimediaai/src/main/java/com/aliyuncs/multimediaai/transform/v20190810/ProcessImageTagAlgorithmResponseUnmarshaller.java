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

package com.aliyuncs.multimediaai.transform.v20190810;

import com.aliyuncs.multimediaai.model.v20190810.ProcessImageTagAlgorithmResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ProcessImageTagAlgorithmResponseUnmarshaller {

	public static ProcessImageTagAlgorithmResponse unmarshall(ProcessImageTagAlgorithmResponse processImageTagAlgorithmResponse, UnmarshallerContext _ctx) {
		
		processImageTagAlgorithmResponse.setRequestId(_ctx.stringValue("ProcessImageTagAlgorithmResponse.RequestId"));
		processImageTagAlgorithmResponse.setCode(_ctx.integerValue("ProcessImageTagAlgorithmResponse.Code"));
		processImageTagAlgorithmResponse.setMessage(_ctx.stringValue("ProcessImageTagAlgorithmResponse.Message"));
		processImageTagAlgorithmResponse.setData(_ctx.stringValue("ProcessImageTagAlgorithmResponse.Data"));
	 
	 	return processImageTagAlgorithmResponse;
	}
}