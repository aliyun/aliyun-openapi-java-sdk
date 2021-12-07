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

import com.aliyuncs.linkvisual.model.v20180120.DeleteRecordResponse;
import com.aliyuncs.linkvisual.model.v20180120.DeleteRecordResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRecordResponseUnmarshaller {

	public static DeleteRecordResponse unmarshall(DeleteRecordResponse deleteRecordResponse, UnmarshallerContext _ctx) {
		
		deleteRecordResponse.setRequestId(_ctx.stringValue("DeleteRecordResponse.RequestId"));
		deleteRecordResponse.setSuccess(_ctx.booleanValue("DeleteRecordResponse.Success"));
		deleteRecordResponse.setCode(_ctx.stringValue("DeleteRecordResponse.Code"));
		deleteRecordResponse.setErrorMessage(_ctx.stringValue("DeleteRecordResponse.ErrorMessage"));

		Data data = new Data();
		data.setDeletedCount(_ctx.integerValue("DeleteRecordResponse.Data.DeletedCount"));
		deleteRecordResponse.setData(data);
	 
	 	return deleteRecordResponse;
	}
}