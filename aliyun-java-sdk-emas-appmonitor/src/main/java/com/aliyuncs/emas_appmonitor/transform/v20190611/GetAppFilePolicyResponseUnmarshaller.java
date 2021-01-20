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

package com.aliyuncs.emas_appmonitor.transform.v20190611;

import com.aliyuncs.emas_appmonitor.model.v20190611.GetAppFilePolicyResponse;
import com.aliyuncs.emas_appmonitor.model.v20190611.GetAppFilePolicyResponse.OSSPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppFilePolicyResponseUnmarshaller {

	public static GetAppFilePolicyResponse unmarshall(GetAppFilePolicyResponse getAppFilePolicyResponse, UnmarshallerContext _ctx) {
		
		getAppFilePolicyResponse.setRequestId(_ctx.stringValue("GetAppFilePolicyResponse.RequestId"));

		OSSPolicy oSSPolicy = new OSSPolicy();
		oSSPolicy.setAccessId(_ctx.stringValue("GetAppFilePolicyResponse.OSSPolicy.AccessId"));
		oSSPolicy.setDirectory(_ctx.stringValue("GetAppFilePolicyResponse.OSSPolicy.Directory"));
		oSSPolicy.setExpireSecond(_ctx.stringValue("GetAppFilePolicyResponse.OSSPolicy.ExpireSecond"));
		oSSPolicy.setFileId(_ctx.stringValue("GetAppFilePolicyResponse.OSSPolicy.FileId"));
		oSSPolicy.setHost(_ctx.stringValue("GetAppFilePolicyResponse.OSSPolicy.Host"));
		oSSPolicy.setPolicy(_ctx.stringValue("GetAppFilePolicyResponse.OSSPolicy.Policy"));
		oSSPolicy.setSignature(_ctx.stringValue("GetAppFilePolicyResponse.OSSPolicy.Signature"));
		getAppFilePolicyResponse.setOSSPolicy(oSSPolicy);
	 
	 	return getAppFilePolicyResponse;
	}
}