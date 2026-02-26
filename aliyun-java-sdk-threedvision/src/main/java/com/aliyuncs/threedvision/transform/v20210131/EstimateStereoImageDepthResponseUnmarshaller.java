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

package com.aliyuncs.threedvision.transform.v20210131;

import com.aliyuncs.threedvision.model.v20210131.EstimateStereoImageDepthResponse;
import com.aliyuncs.threedvision.model.v20210131.EstimateStereoImageDepthResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EstimateStereoImageDepthResponseUnmarshaller {

	public static EstimateStereoImageDepthResponse unmarshall(EstimateStereoImageDepthResponse estimateStereoImageDepthResponse, UnmarshallerContext _ctx) {
		
		estimateStereoImageDepthResponse.setRequestId(_ctx.stringValue("EstimateStereoImageDepthResponse.RequestId"));
		estimateStereoImageDepthResponse.setCode(_ctx.stringValue("EstimateStereoImageDepthResponse.Code"));
		estimateStereoImageDepthResponse.setMessage(_ctx.stringValue("EstimateStereoImageDepthResponse.Message"));

		Data data = new Data();
		data.setDisparityMapURL(_ctx.stringValue("EstimateStereoImageDepthResponse.Data.DisparityMapURL"));
		data.setDisparityVisURL(_ctx.stringValue("EstimateStereoImageDepthResponse.Data.DisparityVisURL"));
		estimateStereoImageDepthResponse.setData(data);
	 
	 	return estimateStereoImageDepthResponse;
	}
}