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

package com.aliyuncs.agency.transform.v20180703;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20180703.CreateNormalAccountResponse;
import com.aliyuncs.agency.model.v20180703.CreateNormalAccountResponse.Result;
import com.aliyuncs.agency.model.v20180703.CreateNormalAccountResponse.Result.EachData;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNormalAccountResponseUnmarshaller {

	public static CreateNormalAccountResponse unmarshall(CreateNormalAccountResponse createNormalAccountResponse, UnmarshallerContext _ctx) {
		
		createNormalAccountResponse.setCode(_ctx.stringValue("CreateNormalAccountResponse.Code"));
		createNormalAccountResponse.setMessage(_ctx.stringValue("CreateNormalAccountResponse.Message"));
		createNormalAccountResponse.setSuccess(_ctx.booleanValue("CreateNormalAccountResponse.Success"));

		List<Result> data = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("CreateNormalAccountResponse.Data.Length"); i++) {
			Result result = new Result();
			result.setCode(_ctx.stringValue("CreateNormalAccountResponse.Data["+ i +"].Code"));
			result.setMessage(_ctx.stringValue("CreateNormalAccountResponse.Data["+ i +"].Message"));
			result.setSuccess(_ctx.booleanValue("CreateNormalAccountResponse.Data["+ i +"].Success"));

			EachData eachData = new EachData();
			eachData.setRegUrl(_ctx.stringValue("CreateNormalAccountResponse.Data["+ i +"].EachData.RegUrl"));
			eachData.setDays(_ctx.integerValue("CreateNormalAccountResponse.Data["+ i +"].EachData.Days"));
			eachData.setId(_ctx.longValue("CreateNormalAccountResponse.Data["+ i +"].EachData.Id"));
			result.setEachData(eachData);

			data.add(result);
		}
		createNormalAccountResponse.setData(data);
	 
	 	return createNormalAccountResponse;
	}
}