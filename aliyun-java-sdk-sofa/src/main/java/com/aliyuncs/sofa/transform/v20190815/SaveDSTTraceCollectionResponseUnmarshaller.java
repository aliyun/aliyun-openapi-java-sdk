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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.SaveDSTTraceCollectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveDSTTraceCollectionResponseUnmarshaller {

	public static SaveDSTTraceCollectionResponse unmarshall(SaveDSTTraceCollectionResponse saveDSTTraceCollectionResponse, UnmarshallerContext _ctx) {
		
		saveDSTTraceCollectionResponse.setRequestId(_ctx.stringValue("SaveDSTTraceCollectionResponse.RequestId"));
		saveDSTTraceCollectionResponse.setResultCode(_ctx.stringValue("SaveDSTTraceCollectionResponse.ResultCode"));
		saveDSTTraceCollectionResponse.setResultMessage(_ctx.stringValue("SaveDSTTraceCollectionResponse.ResultMessage"));
	 
	 	return saveDSTTraceCollectionResponse;
	}
}