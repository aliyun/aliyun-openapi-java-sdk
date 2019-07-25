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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.DeleteBusinessCategoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteBusinessCategoryResponseUnmarshaller {

	public static DeleteBusinessCategoryResponse unmarshall(DeleteBusinessCategoryResponse deleteBusinessCategoryResponse, UnmarshallerContext _ctx) {
		
		deleteBusinessCategoryResponse.setRequestId(_ctx.stringValue("DeleteBusinessCategoryResponse.RequestId"));
		deleteBusinessCategoryResponse.setSuccess(_ctx.booleanValue("DeleteBusinessCategoryResponse.Success"));
		deleteBusinessCategoryResponse.setCode(_ctx.stringValue("DeleteBusinessCategoryResponse.Code"));
		deleteBusinessCategoryResponse.setMessage(_ctx.stringValue("DeleteBusinessCategoryResponse.Message"));
		deleteBusinessCategoryResponse.setData(_ctx.stringValue("DeleteBusinessCategoryResponse.Data"));
	 
	 	return deleteBusinessCategoryResponse;
	}
}