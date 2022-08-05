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

import com.aliyuncs.viapi_regen.model.v20211119.CreateLabelsetResponse;
import com.aliyuncs.viapi_regen.model.v20211119.CreateLabelsetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLabelsetResponseUnmarshaller {

	public static CreateLabelsetResponse unmarshall(CreateLabelsetResponse createLabelsetResponse, UnmarshallerContext _ctx) {
		
		createLabelsetResponse.setRequestId(_ctx.stringValue("CreateLabelsetResponse.RequestId"));
		createLabelsetResponse.setMessage(_ctx.stringValue("CreateLabelsetResponse.Message"));
		createLabelsetResponse.setCode(_ctx.stringValue("CreateLabelsetResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("CreateLabelsetResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("CreateLabelsetResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("CreateLabelsetResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("CreateLabelsetResponse.Data.Description"));
		data.setLabelType(_ctx.stringValue("CreateLabelsetResponse.Data.LabelType"));
		data.setStatus(_ctx.stringValue("CreateLabelsetResponse.Data.Status"));
		createLabelsetResponse.setData(data);
	 
	 	return createLabelsetResponse;
	}
}