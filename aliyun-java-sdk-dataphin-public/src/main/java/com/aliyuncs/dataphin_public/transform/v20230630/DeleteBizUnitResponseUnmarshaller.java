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

import com.aliyuncs.dataphin_public.model.v20230630.DeleteBizUnitResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteBizUnitResponseUnmarshaller {

	public static DeleteBizUnitResponse unmarshall(DeleteBizUnitResponse deleteBizUnitResponse, UnmarshallerContext _ctx) {
		
		deleteBizUnitResponse.setRequestId(_ctx.stringValue("DeleteBizUnitResponse.RequestId"));
		deleteBizUnitResponse.setSuccess(_ctx.booleanValue("DeleteBizUnitResponse.Success"));
		deleteBizUnitResponse.setHttpStatusCode(_ctx.integerValue("DeleteBizUnitResponse.HttpStatusCode"));
		deleteBizUnitResponse.setCode(_ctx.stringValue("DeleteBizUnitResponse.Code"));
		deleteBizUnitResponse.setMessage(_ctx.stringValue("DeleteBizUnitResponse.Message"));
	 
	 	return deleteBizUnitResponse;
	}
}