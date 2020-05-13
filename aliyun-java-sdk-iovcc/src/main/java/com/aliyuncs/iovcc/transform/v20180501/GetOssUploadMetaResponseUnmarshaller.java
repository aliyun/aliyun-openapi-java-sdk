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

import com.aliyuncs.iovcc.model.v20180501.GetOssUploadMetaResponse;
import com.aliyuncs.iovcc.model.v20180501.GetOssUploadMetaResponse.OssUploadMeta;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOssUploadMetaResponseUnmarshaller {

	public static GetOssUploadMetaResponse unmarshall(GetOssUploadMetaResponse getOssUploadMetaResponse, UnmarshallerContext _ctx) {
		
		getOssUploadMetaResponse.setRequestId(_ctx.stringValue("GetOssUploadMetaResponse.RequestId"));

		OssUploadMeta ossUploadMeta = new OssUploadMeta();
		ossUploadMeta.setObjectKey(_ctx.stringValue("GetOssUploadMetaResponse.OssUploadMeta.ObjectKey"));
		ossUploadMeta.setAccessKey(_ctx.stringValue("GetOssUploadMetaResponse.OssUploadMeta.AccessKey"));
		ossUploadMeta.setPolicy(_ctx.stringValue("GetOssUploadMetaResponse.OssUploadMeta.Policy"));
		ossUploadMeta.setSignature(_ctx.stringValue("GetOssUploadMetaResponse.OssUploadMeta.Signature"));
		ossUploadMeta.setSecurityToken(_ctx.stringValue("GetOssUploadMetaResponse.OssUploadMeta.SecurityToken"));
		ossUploadMeta.setHost(_ctx.stringValue("GetOssUploadMetaResponse.OssUploadMeta.Host"));
		getOssUploadMetaResponse.setOssUploadMeta(ossUploadMeta);
	 
	 	return getOssUploadMetaResponse;
	}
}