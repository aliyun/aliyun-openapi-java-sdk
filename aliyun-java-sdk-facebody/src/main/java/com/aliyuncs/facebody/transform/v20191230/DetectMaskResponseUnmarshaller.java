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

package com.aliyuncs.facebody.transform.v20191230;

import com.aliyuncs.facebody.model.v20191230.DetectMaskResponse;
import com.aliyuncs.facebody.model.v20191230.DetectMaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectMaskResponseUnmarshaller {

	public static DetectMaskResponse unmarshall(DetectMaskResponse detectMaskResponse, UnmarshallerContext _ctx) {
		
		detectMaskResponse.setRequestId(_ctx.stringValue("DetectMaskResponse.RequestId"));

		Data data = new Data();
		data.setMask(_ctx.integerValue("DetectMaskResponse.Data.Mask"));
		data.setFaceProbability(_ctx.floatValue("DetectMaskResponse.Data.FaceProbability"));
		detectMaskResponse.setData(data);
	 
	 	return detectMaskResponse;
	}
}