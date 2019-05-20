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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.DeleteCabInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCabInstanceResponseUnmarshaller {

	public static DeleteCabInstanceResponse unmarshall(DeleteCabInstanceResponse deleteCabInstanceResponse, UnmarshallerContext context) {
		
		deleteCabInstanceResponse.setRequestId(context.stringValue("DeleteCabInstanceResponse.RequestId"));
		deleteCabInstanceResponse.setSuccess(context.booleanValue("DeleteCabInstanceResponse.Success"));
		deleteCabInstanceResponse.setCode(context.stringValue("DeleteCabInstanceResponse.Code"));
		deleteCabInstanceResponse.setMessage(context.stringValue("DeleteCabInstanceResponse.Message"));
		deleteCabInstanceResponse.setHttpStatusCode(context.integerValue("DeleteCabInstanceResponse.HttpStatusCode"));
	 
	 	return deleteCabInstanceResponse;
	}
}