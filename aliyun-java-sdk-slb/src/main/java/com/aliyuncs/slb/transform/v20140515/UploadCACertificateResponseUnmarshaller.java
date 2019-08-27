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

package com.aliyuncs.slb.transform.v20140515;

import com.aliyuncs.slb.model.v20140515.UploadCACertificateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadCACertificateResponseUnmarshaller {

	public static UploadCACertificateResponse unmarshall(UploadCACertificateResponse uploadCACertificateResponse, UnmarshallerContext _ctx) {
		
		uploadCACertificateResponse.setRequestId(_ctx.stringValue("UploadCACertificateResponse.RequestId"));
		uploadCACertificateResponse.setCACertificateId(_ctx.stringValue("UploadCACertificateResponse.CACertificateId"));
		uploadCACertificateResponse.setCACertificateName(_ctx.stringValue("UploadCACertificateResponse.CACertificateName"));
		uploadCACertificateResponse.setFingerprint(_ctx.stringValue("UploadCACertificateResponse.Fingerprint"));
		uploadCACertificateResponse.setResourceGroupId(_ctx.stringValue("UploadCACertificateResponse.ResourceGroupId"));
		uploadCACertificateResponse.setCreateTime(_ctx.stringValue("UploadCACertificateResponse.CreateTime"));
		uploadCACertificateResponse.setCreateTimeStamp(_ctx.longValue("UploadCACertificateResponse.CreateTimeStamp"));
		uploadCACertificateResponse.setExpireTime(_ctx.stringValue("UploadCACertificateResponse.ExpireTime"));
		uploadCACertificateResponse.setExpireTimeStamp(_ctx.longValue("UploadCACertificateResponse.ExpireTimeStamp"));
		uploadCACertificateResponse.setCommonName(_ctx.stringValue("UploadCACertificateResponse.CommonName"));
	 
	 	return uploadCACertificateResponse;
	}
}