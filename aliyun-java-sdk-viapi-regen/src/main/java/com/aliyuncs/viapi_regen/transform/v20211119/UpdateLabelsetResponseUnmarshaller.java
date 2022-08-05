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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.UpdateLabelsetResponse;
import com.aliyuncs.viapi_regen.model.v20211119.UpdateLabelsetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLabelsetResponseUnmarshaller {

	public static UpdateLabelsetResponse unmarshall(UpdateLabelsetResponse updateLabelsetResponse, UnmarshallerContext _ctx) {
		
		updateLabelsetResponse.setRequestId(_ctx.stringValue("UpdateLabelsetResponse.RequestId"));
		updateLabelsetResponse.setMessage(_ctx.stringValue("UpdateLabelsetResponse.Message"));
		updateLabelsetResponse.setCode(_ctx.stringValue("UpdateLabelsetResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("UpdateLabelsetResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("UpdateLabelsetResponse.Data.GmtCreate"));
		data.setName(_ctx.longValue("UpdateLabelsetResponse.Data.Name"));
		data.setDescription(_ctx.longValue("UpdateLabelsetResponse.Data.Description"));
		updateLabelsetResponse.setData(data);
	 
	 	return updateLabelsetResponse;
	}
}