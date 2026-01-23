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

import com.aliyuncs.dataphin_public.model.v20230630.DeleteStandardRelationsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.DeleteStandardRelationsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteStandardRelationsResponseUnmarshaller {

	public static DeleteStandardRelationsResponse unmarshall(DeleteStandardRelationsResponse deleteStandardRelationsResponse, UnmarshallerContext _ctx) {
		
		deleteStandardRelationsResponse.setRequestId(_ctx.stringValue("DeleteStandardRelationsResponse.RequestId"));
		deleteStandardRelationsResponse.setSuccess(_ctx.booleanValue("DeleteStandardRelationsResponse.Success"));
		deleteStandardRelationsResponse.setHttpStatusCode(_ctx.integerValue("DeleteStandardRelationsResponse.HttpStatusCode"));
		deleteStandardRelationsResponse.setCode(_ctx.stringValue("DeleteStandardRelationsResponse.Code"));
		deleteStandardRelationsResponse.setMessage(_ctx.stringValue("DeleteStandardRelationsResponse.Message"));

		Data data = new Data();
		data.setSuccessCount(_ctx.integerValue("DeleteStandardRelationsResponse.Data.SuccessCount"));

		List<Long> notExistStandardIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DeleteStandardRelationsResponse.Data.NotExistStandardIdList.Length"); i++) {
			notExistStandardIdList.add(_ctx.longValue("DeleteStandardRelationsResponse.Data.NotExistStandardIdList["+ i +"]"));
		}
		data.setNotExistStandardIdList(notExistStandardIdList);
		deleteStandardRelationsResponse.setData(data);
	 
	 	return deleteStandardRelationsResponse;
	}
}