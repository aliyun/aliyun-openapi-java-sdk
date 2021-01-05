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

import com.aliyuncs.multimediaai.model.v20190810.ProcessFaceAlgorithmResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ProcessFaceAlgorithmResponseUnmarshaller {

	public static ProcessFaceAlgorithmResponse unmarshall(ProcessFaceAlgorithmResponse processFaceAlgorithmResponse, UnmarshallerContext _ctx) {
		
		processFaceAlgorithmResponse.setRequestId(_ctx.stringValue("ProcessFaceAlgorithmResponse.RequestId"));
		processFaceAlgorithmResponse.setData(_ctx.stringValue("ProcessFaceAlgorithmResponse.Data"));
		processFaceAlgorithmResponse.setCode(_ctx.integerValue("ProcessFaceAlgorithmResponse.Code"));
		processFaceAlgorithmResponse.setMessage(_ctx.stringValue("ProcessFaceAlgorithmResponse.Message"));
	 
	 	return processFaceAlgorithmResponse;
	}
}