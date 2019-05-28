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

import com.aliyuncs.ccc.model.v20170705.PreCreateMediaResponse;
import com.aliyuncs.ccc.model.v20170705.PreCreateMediaResponse.PreCreateMediaParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreCreateMediaResponseUnmarshaller {

	public static PreCreateMediaResponse unmarshall(PreCreateMediaResponse preCreateMediaResponse, UnmarshallerContext context) {
		
		preCreateMediaResponse.setRequestId(context.stringValue("PreCreateMediaResponse.RequestId"));
		preCreateMediaResponse.setSuccess(context.booleanValue("PreCreateMediaResponse.Success"));
		preCreateMediaResponse.setCode(context.stringValue("PreCreateMediaResponse.Code"));
		preCreateMediaResponse.setMessage(context.stringValue("PreCreateMediaResponse.Message"));
		preCreateMediaResponse.setHttpStatusCode(context.integerValue("PreCreateMediaResponse.HttpStatusCode"));

		PreCreateMediaParam preCreateMediaParam = new PreCreateMediaParam();
		preCreateMediaParam.setOssFile(context.stringValue("PreCreateMediaResponse.PreCreateMediaParam.OssFile"));
		preCreateMediaParam.setOssFilePath(context.stringValue("PreCreateMediaResponse.PreCreateMediaParam.OssFilePath"));
		preCreateMediaParam.setOssBucket(context.stringValue("PreCreateMediaResponse.PreCreateMediaParam.OssBucket"));
		preCreateMediaParam.setSignatureUrl(context.stringValue("PreCreateMediaResponse.PreCreateMediaParam.SignatureUrl"));
		preCreateMediaResponse.setPreCreateMediaParam(preCreateMediaParam);
	 
	 	return preCreateMediaResponse;
	}
}