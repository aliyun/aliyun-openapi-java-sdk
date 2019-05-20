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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.PreCreateMediaExResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.PreCreateMediaExResponse.PreCreateMediaParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreCreateMediaExResponseUnmarshaller {

	public static PreCreateMediaExResponse unmarshall(PreCreateMediaExResponse preCreateMediaExResponse, UnmarshallerContext context) {
		
		preCreateMediaExResponse.setRequestId(context.stringValue("PreCreateMediaExResponse.RequestId"));
		preCreateMediaExResponse.setSuccess(context.booleanValue("PreCreateMediaExResponse.Success"));
		preCreateMediaExResponse.setCode(context.stringValue("PreCreateMediaExResponse.Code"));
		preCreateMediaExResponse.setMessage(context.stringValue("PreCreateMediaExResponse.Message"));
		preCreateMediaExResponse.setHttpStatusCode(context.integerValue("PreCreateMediaExResponse.HttpStatusCode"));

		PreCreateMediaParam preCreateMediaParam = new PreCreateMediaParam();
		preCreateMediaParam.setOssFile(context.stringValue("PreCreateMediaExResponse.PreCreateMediaParam.OssFile"));
		preCreateMediaParam.setOssFilePath(context.stringValue("PreCreateMediaExResponse.PreCreateMediaParam.OssFilePath"));
		preCreateMediaParam.setOssBucket(context.stringValue("PreCreateMediaExResponse.PreCreateMediaParam.OssBucket"));
		preCreateMediaParam.setSignatureUrl(context.stringValue("PreCreateMediaExResponse.PreCreateMediaParam.SignatureUrl"));
		preCreateMediaExResponse.setPreCreateMediaParam(preCreateMediaParam);
	 
	 	return preCreateMediaExResponse;
	}
}