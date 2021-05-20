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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.CreateMarkerResponse;
import com.aliyuncs.vcs.model.v20200515.CreateMarkerResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMarkerResponseUnmarshaller {

	public static CreateMarkerResponse unmarshall(CreateMarkerResponse createMarkerResponse, UnmarshallerContext _ctx) {
		
		createMarkerResponse.setRequestId(_ctx.stringValue("CreateMarkerResponse.RequestId"));
		createMarkerResponse.setMessage(_ctx.stringValue("CreateMarkerResponse.Message"));
		createMarkerResponse.setCode(_ctx.stringValue("CreateMarkerResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.stringValue("CreateMarkerResponse.Data.Id"));
		createMarkerResponse.setData(data);
	 
	 	return createMarkerResponse;
	}
}