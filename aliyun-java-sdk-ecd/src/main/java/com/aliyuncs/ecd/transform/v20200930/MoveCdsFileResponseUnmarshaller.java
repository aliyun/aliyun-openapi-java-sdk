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

package com.aliyuncs.ecd.transform.v20200930;

import com.aliyuncs.ecd.model.v20200930.MoveCdsFileResponse;
import com.aliyuncs.ecd.model.v20200930.MoveCdsFileResponse.MoveCdsFileModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class MoveCdsFileResponseUnmarshaller {

	public static MoveCdsFileResponse unmarshall(MoveCdsFileResponse moveCdsFileResponse, UnmarshallerContext _ctx) {
		
		moveCdsFileResponse.setRequestId(_ctx.stringValue("MoveCdsFileResponse.RequestId"));
		moveCdsFileResponse.setSuccess(_ctx.booleanValue("MoveCdsFileResponse.Success"));
		moveCdsFileResponse.setCode(_ctx.stringValue("MoveCdsFileResponse.Code"));
		moveCdsFileResponse.setMessage(_ctx.stringValue("MoveCdsFileResponse.Message"));

		MoveCdsFileModel moveCdsFileModel = new MoveCdsFileModel();
		moveCdsFileModel.setAsyncTaskId(_ctx.stringValue("MoveCdsFileResponse.MoveCdsFileModel.AsyncTaskId"));
		moveCdsFileModel.setExist(_ctx.booleanValue("MoveCdsFileResponse.MoveCdsFileModel.Exist"));
		moveCdsFileModel.setFileId(_ctx.stringValue("MoveCdsFileResponse.MoveCdsFileModel.FileId"));
		moveCdsFileResponse.setMoveCdsFileModel(moveCdsFileModel);
	 
	 	return moveCdsFileResponse;
	}
}