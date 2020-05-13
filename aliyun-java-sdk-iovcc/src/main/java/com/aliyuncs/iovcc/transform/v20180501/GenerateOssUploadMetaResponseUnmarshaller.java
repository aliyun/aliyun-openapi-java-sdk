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

package com.aliyuncs.iovcc.transform.v20180501;

import com.aliyuncs.iovcc.model.v20180501.GenerateOssUploadMetaResponse;
import com.aliyuncs.iovcc.model.v20180501.GenerateOssUploadMetaResponse.OssUploadMeta;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateOssUploadMetaResponseUnmarshaller {

	public static GenerateOssUploadMetaResponse unmarshall(GenerateOssUploadMetaResponse generateOssUploadMetaResponse, UnmarshallerContext _ctx) {
		
		generateOssUploadMetaResponse.setRequestId(_ctx.stringValue("GenerateOssUploadMetaResponse.RequestId"));

		OssUploadMeta ossUploadMeta = new OssUploadMeta();
		ossUploadMeta.setAccessKeyId(_ctx.stringValue("GenerateOssUploadMetaResponse.OssUploadMeta.AccessKeyId"));
		ossUploadMeta.setAccessKeySecret(_ctx.stringValue("GenerateOssUploadMetaResponse.OssUploadMeta.AccessKeySecret"));
		ossUploadMeta.setSecurityToken(_ctx.stringValue("GenerateOssUploadMetaResponse.OssUploadMeta.SecurityToken"));
		ossUploadMeta.setBucket(_ctx.stringValue("GenerateOssUploadMetaResponse.OssUploadMeta.Bucket"));
		ossUploadMeta.setObjectKey(_ctx.stringValue("GenerateOssUploadMetaResponse.OssUploadMeta.ObjectKey"));
		generateOssUploadMetaResponse.setOssUploadMeta(ossUploadMeta);
	 
	 	return generateOssUploadMetaResponse;
	}
}