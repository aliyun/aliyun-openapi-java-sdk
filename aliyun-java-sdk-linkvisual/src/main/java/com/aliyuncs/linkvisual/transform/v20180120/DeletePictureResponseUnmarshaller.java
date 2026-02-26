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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.DeletePictureResponse;
import com.aliyuncs.linkvisual.model.v20180120.DeletePictureResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeletePictureResponseUnmarshaller {

	public static DeletePictureResponse unmarshall(DeletePictureResponse deletePictureResponse, UnmarshallerContext _ctx) {
		
		deletePictureResponse.setRequestId(_ctx.stringValue("DeletePictureResponse.RequestId"));
		deletePictureResponse.setCode(_ctx.stringValue("DeletePictureResponse.Code"));
		deletePictureResponse.setErrorMessage(_ctx.stringValue("DeletePictureResponse.ErrorMessage"));
		deletePictureResponse.setSuccess(_ctx.booleanValue("DeletePictureResponse.Success"));

		Data data = new Data();
		data.setDeletedCount(_ctx.integerValue("DeletePictureResponse.Data.DeletedCount"));
		deletePictureResponse.setData(data);
	 
	 	return deletePictureResponse;
	}
}