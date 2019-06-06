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

	public static UploadCACertificateResponse unmarshall(UploadCACertificateResponse uploadCACertificateResponse, UnmarshallerContext context) {
		
		uploadCACertificateResponse.setRequestId(context.stringValue("UploadCACertificateResponse.RequestId"));
		uploadCACertificateResponse.setCACertificateId(context.stringValue("UploadCACertificateResponse.CACertificateId"));
		uploadCACertificateResponse.setCACertificateName(context.stringValue("UploadCACertificateResponse.CACertificateName"));
		uploadCACertificateResponse.setFingerprint(context.stringValue("UploadCACertificateResponse.Fingerprint"));
		uploadCACertificateResponse.setResourceGroupId(context.stringValue("UploadCACertificateResponse.ResourceGroupId"));
		uploadCACertificateResponse.setCreateTime(context.stringValue("UploadCACertificateResponse.CreateTime"));
		uploadCACertificateResponse.setCreateTimeStamp(context.longValue("UploadCACertificateResponse.CreateTimeStamp"));
		uploadCACertificateResponse.setExpireTime(context.stringValue("UploadCACertificateResponse.ExpireTime"));
		uploadCACertificateResponse.setExpireTimeStamp(context.longValue("UploadCACertificateResponse.ExpireTimeStamp"));
		uploadCACertificateResponse.setCommonName(context.stringValue("UploadCACertificateResponse.CommonName"));
	 
	 	return uploadCACertificateResponse;
	}
}