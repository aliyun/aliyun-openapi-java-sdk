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

import com.aliyuncs.aigen.model.v20240111.InteractiveScribbleSegmentationResponse;
import com.aliyuncs.aigen.model.v20240111.InteractiveScribbleSegmentationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InteractiveScribbleSegmentationResponseUnmarshaller {

	public static InteractiveScribbleSegmentationResponse unmarshall(InteractiveScribbleSegmentationResponse interactiveScribbleSegmentationResponse, UnmarshallerContext _ctx) {
		
		interactiveScribbleSegmentationResponse.setRequestId(_ctx.stringValue("InteractiveScribbleSegmentationResponse.RequestId"));

		Data data = new Data();
		data.setResultUrl(_ctx.stringValue("InteractiveScribbleSegmentationResponse.Data.ResultUrl"));
		interactiveScribbleSegmentationResponse.setData(data);
	 
	 	return interactiveScribbleSegmentationResponse;
	}
}