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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.DeleteMcdpMaterialResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMcdpMaterialResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMcdpMaterialResponseUnmarshaller {

	public static DeleteMcdpMaterialResponse unmarshall(DeleteMcdpMaterialResponse deleteMcdpMaterialResponse, UnmarshallerContext _ctx) {
		
		deleteMcdpMaterialResponse.setRequestId(_ctx.stringValue("DeleteMcdpMaterialResponse.RequestId"));
		deleteMcdpMaterialResponse.setResultCode(_ctx.stringValue("DeleteMcdpMaterialResponse.ResultCode"));
		deleteMcdpMaterialResponse.setResultMessage(_ctx.stringValue("DeleteMcdpMaterialResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("DeleteMcdpMaterialResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("DeleteMcdpMaterialResponse.ResultContent.Data"));
		resultContent.setMessage(_ctx.stringValue("DeleteMcdpMaterialResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("DeleteMcdpMaterialResponse.ResultContent.Success"));
		deleteMcdpMaterialResponse.setResultContent(resultContent);
	 
	 	return deleteMcdpMaterialResponse;
	}
}