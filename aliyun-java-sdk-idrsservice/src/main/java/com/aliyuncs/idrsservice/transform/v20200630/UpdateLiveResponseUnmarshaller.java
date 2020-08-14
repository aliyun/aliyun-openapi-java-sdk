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

package com.aliyuncs.idrsservice.transform.v20200630;

import com.aliyuncs.idrsservice.model.v20200630.UpdateLiveResponse;
import com.aliyuncs.idrsservice.model.v20200630.UpdateLiveResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLiveResponseUnmarshaller {

	public static UpdateLiveResponse unmarshall(UpdateLiveResponse updateLiveResponse, UnmarshallerContext _ctx) {
		
		updateLiveResponse.setRequestId(_ctx.stringValue("UpdateLiveResponse.RequestId"));
		updateLiveResponse.setCode(_ctx.stringValue("UpdateLiveResponse.Code"));
		updateLiveResponse.setMessage(_ctx.stringValue("UpdateLiveResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.stringValue("UpdateLiveResponse.Data.Id"));
		updateLiveResponse.setData(data);
	 
	 	return updateLiveResponse;
	}
}