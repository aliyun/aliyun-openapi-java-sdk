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

package com.aliyuncs.idrsservice.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idrsservice.model.v20200630.DeleteUserResponse;
import com.aliyuncs.idrsservice.model.v20200630.DeleteUserResponse.ErrorsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteUserResponseUnmarshaller {

	public static DeleteUserResponse unmarshall(DeleteUserResponse deleteUserResponse, UnmarshallerContext _ctx) {
		
		deleteUserResponse.setRequestId(_ctx.stringValue("DeleteUserResponse.RequestId"));
		deleteUserResponse.setCode(_ctx.stringValue("DeleteUserResponse.Code"));
		deleteUserResponse.setData(_ctx.mapValue("DeleteUserResponse.Data"));
		deleteUserResponse.setMessage(_ctx.stringValue("DeleteUserResponse.Message"));

		List<ErrorsItem> errors = new ArrayList<ErrorsItem>();
		for (int i = 0; i < _ctx.lengthValue("DeleteUserResponse.Errors.Length"); i++) {
			ErrorsItem errorsItem = new ErrorsItem();
			errorsItem.setField(_ctx.stringValue("DeleteUserResponse.Errors["+ i +"].Field"));
			errorsItem.setMessage(_ctx.stringValue("DeleteUserResponse.Errors["+ i +"].Message"));

			errors.add(errorsItem);
		}
		deleteUserResponse.setErrors(errors);
	 
	 	return deleteUserResponse;
	}
}