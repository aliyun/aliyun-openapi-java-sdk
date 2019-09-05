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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.PreModifyMediaResponse;
import com.aliyuncs.ccc.model.v20170705.PreModifyMediaResponse.PreModifyMediaParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreModifyMediaResponseUnmarshaller {

	public static PreModifyMediaResponse unmarshall(PreModifyMediaResponse preModifyMediaResponse, UnmarshallerContext _ctx) {
		
		preModifyMediaResponse.setRequestId(_ctx.stringValue("PreModifyMediaResponse.RequestId"));
		preModifyMediaResponse.setSuccess(_ctx.booleanValue("PreModifyMediaResponse.Success"));
		preModifyMediaResponse.setCode(_ctx.stringValue("PreModifyMediaResponse.Code"));
		preModifyMediaResponse.setMessage(_ctx.stringValue("PreModifyMediaResponse.Message"));
		preModifyMediaResponse.setHttpStatusCode(_ctx.integerValue("PreModifyMediaResponse.HttpStatusCode"));

		PreModifyMediaParam preModifyMediaParam = new PreModifyMediaParam();
		preModifyMediaParam.setOssFile(_ctx.stringValue("PreModifyMediaResponse.PreModifyMediaParam.OssFile"));
		preModifyMediaParam.setOssFilePath(_ctx.stringValue("PreModifyMediaResponse.PreModifyMediaParam.OssFilePath"));
		preModifyMediaParam.setOssBucket(_ctx.stringValue("PreModifyMediaResponse.PreModifyMediaParam.OssBucket"));
		preModifyMediaParam.setSignatureUrl(_ctx.stringValue("PreModifyMediaResponse.PreModifyMediaParam.SignatureUrl"));
		preModifyMediaResponse.setPreModifyMediaParam(preModifyMediaParam);
	 
	 	return preModifyMediaResponse;
	}
}