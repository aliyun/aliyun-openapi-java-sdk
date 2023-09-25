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

import com.aliyuncs.dataworks_public.model.v20200518.CheckMetaPartitionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckMetaPartitionResponseUnmarshaller {

	public static CheckMetaPartitionResponse unmarshall(CheckMetaPartitionResponse checkMetaPartitionResponse, UnmarshallerContext _ctx) {
		
		checkMetaPartitionResponse.setRequestId(_ctx.stringValue("CheckMetaPartitionResponse.RequestId"));
		checkMetaPartitionResponse.setHttpStatusCode(_ctx.integerValue("CheckMetaPartitionResponse.HttpStatusCode"));
		checkMetaPartitionResponse.setData(_ctx.booleanValue("CheckMetaPartitionResponse.Data"));
		checkMetaPartitionResponse.setErrorMessage(_ctx.stringValue("CheckMetaPartitionResponse.ErrorMessage"));
		checkMetaPartitionResponse.setErrorCode(_ctx.stringValue("CheckMetaPartitionResponse.ErrorCode"));
		checkMetaPartitionResponse.setSuccess(_ctx.booleanValue("CheckMetaPartitionResponse.Success"));
	 
	 	return checkMetaPartitionResponse;
	}
}