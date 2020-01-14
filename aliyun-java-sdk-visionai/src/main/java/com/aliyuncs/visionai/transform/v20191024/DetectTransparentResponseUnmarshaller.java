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

package com.aliyuncs.visionai.transform.v20191024;

import com.aliyuncs.visionai.model.v20191024.DetectTransparentResponse;
import com.aliyuncs.visionai.model.v20191024.DetectTransparentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectTransparentResponseUnmarshaller {

	public static DetectTransparentResponse unmarshall(DetectTransparentResponse detectTransparentResponse, UnmarshallerContext _ctx) {
		
		detectTransparentResponse.setRequestId(_ctx.stringValue("DetectTransparentResponse.RequestId"));

		Data data = new Data();
		data.setIsTransparent(_ctx.integerValue("DetectTransparentResponse.Data.IsTransparent"));
		detectTransparentResponse.setData(data);
	 
	 	return detectTransparentResponse;
	}
}