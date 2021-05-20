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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.DeleteDataSourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDataSourceResponseUnmarshaller {

	public static DeleteDataSourceResponse unmarshall(DeleteDataSourceResponse deleteDataSourceResponse, UnmarshallerContext _ctx) {
		
		deleteDataSourceResponse.setMessage(_ctx.stringValue("DeleteDataSourceResponse.Message"));
		deleteDataSourceResponse.setData(_ctx.stringValue("DeleteDataSourceResponse.Data"));
		deleteDataSourceResponse.setCode(_ctx.stringValue("DeleteDataSourceResponse.Code"));
	 
	 	return deleteDataSourceResponse;
	}
}