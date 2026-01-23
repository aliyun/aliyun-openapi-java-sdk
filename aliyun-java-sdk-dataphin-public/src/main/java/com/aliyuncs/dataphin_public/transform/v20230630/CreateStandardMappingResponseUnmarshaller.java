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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.CreateStandardMappingResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreateStandardMappingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStandardMappingResponseUnmarshaller {

	public static CreateStandardMappingResponse unmarshall(CreateStandardMappingResponse createStandardMappingResponse, UnmarshallerContext _ctx) {
		
		createStandardMappingResponse.setRequestId(_ctx.stringValue("CreateStandardMappingResponse.RequestId"));
		createStandardMappingResponse.setSuccess(_ctx.booleanValue("CreateStandardMappingResponse.Success"));
		createStandardMappingResponse.setHttpStatusCode(_ctx.integerValue("CreateStandardMappingResponse.HttpStatusCode"));
		createStandardMappingResponse.setCode(_ctx.stringValue("CreateStandardMappingResponse.Code"));
		createStandardMappingResponse.setMessage(_ctx.stringValue("CreateStandardMappingResponse.Message"));

		Data data = new Data();
		data.setSuccessCount(_ctx.longValue("CreateStandardMappingResponse.Data.SuccessCount"));

		List<String> failedGuidList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateStandardMappingResponse.Data.FailedGuidList.Length"); i++) {
			failedGuidList.add(_ctx.stringValue("CreateStandardMappingResponse.Data.FailedGuidList["+ i +"]"));
		}
		data.setFailedGuidList(failedGuidList);
		createStandardMappingResponse.setData(data);
	 
	 	return createStandardMappingResponse;
	}
}