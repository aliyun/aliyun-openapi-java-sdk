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

package com.aliyuncs.videoenhan.transform.v20200320;

import com.aliyuncs.videoenhan.model.v20200320.EraseVideoLogoResponse;
import com.aliyuncs.videoenhan.model.v20200320.EraseVideoLogoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EraseVideoLogoResponseUnmarshaller {

	public static EraseVideoLogoResponse unmarshall(EraseVideoLogoResponse eraseVideoLogoResponse, UnmarshallerContext _ctx) {
		
		eraseVideoLogoResponse.setRequestId(_ctx.stringValue("EraseVideoLogoResponse.RequestId"));
		eraseVideoLogoResponse.setCode(_ctx.stringValue("EraseVideoLogoResponse.Code"));
		eraseVideoLogoResponse.setMessage(_ctx.stringValue("EraseVideoLogoResponse.Message"));

		Data data = new Data();
		data.setVideoUrl(_ctx.stringValue("EraseVideoLogoResponse.Data.VideoUrl"));
		eraseVideoLogoResponse.setData(data);
	 
	 	return eraseVideoLogoResponse;
	}
}