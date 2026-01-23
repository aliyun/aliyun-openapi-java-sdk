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

import com.aliyuncs.dataphin_public.model.v20230630.CreateStandardRelationsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreateStandardRelationsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStandardRelationsResponseUnmarshaller {

	public static CreateStandardRelationsResponse unmarshall(CreateStandardRelationsResponse createStandardRelationsResponse, UnmarshallerContext _ctx) {
		
		createStandardRelationsResponse.setRequestId(_ctx.stringValue("CreateStandardRelationsResponse.RequestId"));
		createStandardRelationsResponse.setSuccess(_ctx.booleanValue("CreateStandardRelationsResponse.Success"));
		createStandardRelationsResponse.setHttpStatusCode(_ctx.integerValue("CreateStandardRelationsResponse.HttpStatusCode"));
		createStandardRelationsResponse.setCode(_ctx.stringValue("CreateStandardRelationsResponse.Code"));
		createStandardRelationsResponse.setMessage(_ctx.stringValue("CreateStandardRelationsResponse.Message"));

		Data data = new Data();
		data.setSuccessCount(_ctx.integerValue("CreateStandardRelationsResponse.Data.SuccessCount"));

		List<Long> notExistStandardIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateStandardRelationsResponse.Data.NotExistStandardIdList.Length"); i++) {
			notExistStandardIdList.add(_ctx.longValue("CreateStandardRelationsResponse.Data.NotExistStandardIdList["+ i +"]"));
		}
		data.setNotExistStandardIdList(notExistStandardIdList);
		createStandardRelationsResponse.setData(data);
	 
	 	return createStandardRelationsResponse;
	}
}