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

package com.aliyuncs.aigen.transform.v20240111;

import com.aliyuncs.aigen.model.v20240111.InteractiveFullSegmentationResponse;
import com.aliyuncs.aigen.model.v20240111.InteractiveFullSegmentationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InteractiveFullSegmentationResponseUnmarshaller {

	public static InteractiveFullSegmentationResponse unmarshall(InteractiveFullSegmentationResponse interactiveFullSegmentationResponse, UnmarshallerContext _ctx) {
		
		interactiveFullSegmentationResponse.setRequestId(_ctx.stringValue("InteractiveFullSegmentationResponse.RequestId"));
		interactiveFullSegmentationResponse.setCode(_ctx.stringValue("InteractiveFullSegmentationResponse.Code"));
		interactiveFullSegmentationResponse.setMessage(_ctx.stringValue("InteractiveFullSegmentationResponse.Message"));

		Data data = new Data();
		data.setResultUrl(_ctx.stringValue("InteractiveFullSegmentationResponse.Data.ResultUrl"));
		interactiveFullSegmentationResponse.setData(data);
	 
	 	return interactiveFullSegmentationResponse;
	}
}