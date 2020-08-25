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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.SaveLinkeLinktCommentResponse;
import com.aliyuncs.sofa.model.v20190815.SaveLinkeLinktCommentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeLinktCommentResponseUnmarshaller {

	public static SaveLinkeLinktCommentResponse unmarshall(SaveLinkeLinktCommentResponse saveLinkeLinktCommentResponse, UnmarshallerContext _ctx) {
		
		saveLinkeLinktCommentResponse.setRequestId(_ctx.stringValue("SaveLinkeLinktCommentResponse.RequestId"));
		saveLinkeLinktCommentResponse.setResultCode(_ctx.stringValue("SaveLinkeLinktCommentResponse.ResultCode"));
		saveLinkeLinktCommentResponse.setResultMessage(_ctx.stringValue("SaveLinkeLinktCommentResponse.ResultMessage"));
		saveLinkeLinktCommentResponse.setErrorCode(_ctx.longValue("SaveLinkeLinktCommentResponse.ErrorCode"));
		saveLinkeLinktCommentResponse.setErrorMessage(_ctx.stringValue("SaveLinkeLinktCommentResponse.ErrorMessage"));
		saveLinkeLinktCommentResponse.setResponseStatusCode(_ctx.longValue("SaveLinkeLinktCommentResponse.ResponseStatusCode"));
		saveLinkeLinktCommentResponse.setSuccess(_ctx.booleanValue("SaveLinkeLinktCommentResponse.Success"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Content"));
		data.setCreatedAt(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("SaveLinkeLinktCommentResponse.Data.Deleted"));
		data.setId(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.Id"));
		data.setParentId(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.ParentId"));
		data.setTarget(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Target"));
		data.setTargetType(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.TargetType"));
		data.setUpdatedAt(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.UpdatedAt"));
		saveLinkeLinktCommentResponse.setData(data);
	 
	 	return saveLinkeLinktCommentResponse;
	}
}