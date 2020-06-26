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

package com.aliyuncs.ivpd.transform.v20190625;

import com.aliyuncs.ivpd.model.v20190625.EraseLogoInVideoResponse;
import com.aliyuncs.ivpd.model.v20190625.EraseLogoInVideoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EraseLogoInVideoResponseUnmarshaller {

	public static EraseLogoInVideoResponse unmarshall(EraseLogoInVideoResponse eraseLogoInVideoResponse, UnmarshallerContext _ctx) {
		
		eraseLogoInVideoResponse.setRequestId(_ctx.stringValue("EraseLogoInVideoResponse.RequestId"));
		eraseLogoInVideoResponse.setCode(_ctx.stringValue("EraseLogoInVideoResponse.Code"));
		eraseLogoInVideoResponse.setMessage(_ctx.stringValue("EraseLogoInVideoResponse.Message"));

		Data data = new Data();
		data.setVideoUrl(_ctx.stringValue("EraseLogoInVideoResponse.Data.VideoUrl"));
		data.setJobId(_ctx.stringValue("EraseLogoInVideoResponse.Data.JobId"));
		eraseLogoInVideoResponse.setData(data);
	 
	 	return eraseLogoInVideoResponse;
	}
}