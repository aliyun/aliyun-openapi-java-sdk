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

package com.aliyuncs.objectdet.transform.v20191230;

import com.aliyuncs.objectdet.model.v20191230.DetectVideoFrameResponse;
import com.aliyuncs.objectdet.model.v20191230.DetectVideoFrameResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectVideoFrameResponseUnmarshaller {

	public static DetectVideoFrameResponse unmarshall(DetectVideoFrameResponse detectVideoFrameResponse, UnmarshallerContext _ctx) {
		
		detectVideoFrameResponse.setRequestId(_ctx.stringValue("DetectVideoFrameResponse.RequestId"));
		detectVideoFrameResponse.setCode(_ctx.stringValue("DetectVideoFrameResponse.Code"));
		detectVideoFrameResponse.setMessage(_ctx.stringValue("DetectVideoFrameResponse.Message"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("DetectVideoFrameResponse.Data.RequestId"));
		detectVideoFrameResponse.setData(data);
	 
	 	return detectVideoFrameResponse;
	}
}