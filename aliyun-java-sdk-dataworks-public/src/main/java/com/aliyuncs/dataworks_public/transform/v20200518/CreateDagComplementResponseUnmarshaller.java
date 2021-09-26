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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.CreateDagComplementResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDagComplementResponseUnmarshaller {

	public static CreateDagComplementResponse unmarshall(CreateDagComplementResponse createDagComplementResponse, UnmarshallerContext _ctx) {
		
		createDagComplementResponse.setRequestId(_ctx.stringValue("CreateDagComplementResponse.RequestId"));
		createDagComplementResponse.setErrorCode(_ctx.stringValue("CreateDagComplementResponse.ErrorCode"));
		createDagComplementResponse.setErrorMessage(_ctx.stringValue("CreateDagComplementResponse.ErrorMessage"));
		createDagComplementResponse.setHttpStatusCode(_ctx.integerValue("CreateDagComplementResponse.HttpStatusCode"));
		createDagComplementResponse.setSuccess(_ctx.booleanValue("CreateDagComplementResponse.Success"));

		List<Long> data = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateDagComplementResponse.Data.Length"); i++) {
			data.add(_ctx.longValue("CreateDagComplementResponse.Data["+ i +"]"));
		}
		createDagComplementResponse.setData(data);
	 
	 	return createDagComplementResponse;
	}
}