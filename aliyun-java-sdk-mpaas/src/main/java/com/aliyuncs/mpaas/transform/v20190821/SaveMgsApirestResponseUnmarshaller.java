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

package com.aliyuncs.mpaas.transform.v20190821;

import com.aliyuncs.mpaas.model.v20190821.SaveMgsApirestResponse;
import com.aliyuncs.mpaas.model.v20190821.SaveMgsApirestResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveMgsApirestResponseUnmarshaller {

	public static SaveMgsApirestResponse unmarshall(SaveMgsApirestResponse saveMgsApirestResponse, UnmarshallerContext _ctx) {
		
		saveMgsApirestResponse.setRequestId(_ctx.stringValue("SaveMgsApirestResponse.RequestId"));
		saveMgsApirestResponse.setResultCode(_ctx.stringValue("SaveMgsApirestResponse.ResultCode"));
		saveMgsApirestResponse.setResultMessage(_ctx.stringValue("SaveMgsApirestResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setErrorMessage(_ctx.stringValue("SaveMgsApirestResponse.ResultContent.ErrorMessage"));
		resultContent.setSuccess(_ctx.booleanValue("SaveMgsApirestResponse.ResultContent.Success"));
		resultContent.setValue(_ctx.booleanValue("SaveMgsApirestResponse.ResultContent.Value"));
		saveMgsApirestResponse.setResultContent(resultContent);
	 
	 	return saveMgsApirestResponse;
	}
}