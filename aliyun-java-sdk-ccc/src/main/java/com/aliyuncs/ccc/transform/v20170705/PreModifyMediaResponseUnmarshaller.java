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

	public static PreModifyMediaResponse unmarshall(PreModifyMediaResponse preModifyMediaResponse, UnmarshallerContext context) {
		
		preModifyMediaResponse.setRequestId(context.stringValue("PreModifyMediaResponse.RequestId"));
		preModifyMediaResponse.setSuccess(context.booleanValue("PreModifyMediaResponse.Success"));
		preModifyMediaResponse.setCode(context.stringValue("PreModifyMediaResponse.Code"));
		preModifyMediaResponse.setMessage(context.stringValue("PreModifyMediaResponse.Message"));
		preModifyMediaResponse.setHttpStatusCode(context.integerValue("PreModifyMediaResponse.HttpStatusCode"));

		PreModifyMediaParam preModifyMediaParam = new PreModifyMediaParam();
		preModifyMediaParam.setOssFile(context.stringValue("PreModifyMediaResponse.PreModifyMediaParam.OssFile"));
		preModifyMediaParam.setOssFilePath(context.stringValue("PreModifyMediaResponse.PreModifyMediaParam.OssFilePath"));
		preModifyMediaParam.setOssBucket(context.stringValue("PreModifyMediaResponse.PreModifyMediaParam.OssBucket"));
		preModifyMediaParam.setSignatureUrl(context.stringValue("PreModifyMediaResponse.PreModifyMediaParam.SignatureUrl"));
		preModifyMediaResponse.setPreModifyMediaParam(preModifyMediaParam);
	 
	 	return preModifyMediaResponse;
	}
}