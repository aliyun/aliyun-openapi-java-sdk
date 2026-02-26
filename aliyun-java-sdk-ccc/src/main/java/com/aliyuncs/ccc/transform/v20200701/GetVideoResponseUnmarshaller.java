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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.GetVideoResponse;
import com.aliyuncs.ccc.model.v20200701.GetVideoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoResponseUnmarshaller {

	public static GetVideoResponse unmarshall(GetVideoResponse getVideoResponse, UnmarshallerContext _ctx) {
		
		getVideoResponse.setRequestId(_ctx.stringValue("GetVideoResponse.RequestId"));
		getVideoResponse.setCode(_ctx.stringValue("GetVideoResponse.Code"));
		getVideoResponse.setHttpStatusCode(_ctx.integerValue("GetVideoResponse.HttpStatusCode"));
		getVideoResponse.setMessage(_ctx.stringValue("GetVideoResponse.Message"));

		Data data = new Data();
		data.setFileUrl(_ctx.stringValue("GetVideoResponse.Data.FileUrl"));
		data.setFileName(_ctx.stringValue("GetVideoResponse.Data.FileName"));
		getVideoResponse.setData(data);
	 
	 	return getVideoResponse;
	}
}