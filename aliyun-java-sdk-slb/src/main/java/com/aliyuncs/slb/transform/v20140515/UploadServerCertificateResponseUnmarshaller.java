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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.UploadServerCertificateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadServerCertificateResponseUnmarshaller {

	public static UploadServerCertificateResponse unmarshall(UploadServerCertificateResponse uploadServerCertificateResponse, UnmarshallerContext _ctx) {
		
		uploadServerCertificateResponse.setRequestId(_ctx.stringValue("UploadServerCertificateResponse.RequestId"));
		uploadServerCertificateResponse.setServerCertificateId(_ctx.stringValue("UploadServerCertificateResponse.ServerCertificateId"));
		uploadServerCertificateResponse.setFingerprint(_ctx.stringValue("UploadServerCertificateResponse.Fingerprint"));
		uploadServerCertificateResponse.setServerCertificateName(_ctx.stringValue("UploadServerCertificateResponse.ServerCertificateName"));
		uploadServerCertificateResponse.setRegionId(_ctx.stringValue("UploadServerCertificateResponse.RegionId"));
		uploadServerCertificateResponse.setRegionIdAlias(_ctx.stringValue("UploadServerCertificateResponse.RegionIdAlias"));
		uploadServerCertificateResponse.setAliCloudCertificateId(_ctx.stringValue("UploadServerCertificateResponse.AliCloudCertificateId"));
		uploadServerCertificateResponse.setAliCloudCertificateName(_ctx.stringValue("UploadServerCertificateResponse.AliCloudCertificateName"));
		uploadServerCertificateResponse.setIsAliCloudCertificate(_ctx.integerValue("UploadServerCertificateResponse.IsAliCloudCertificate"));
		uploadServerCertificateResponse.setResourceGroupId(_ctx.stringValue("UploadServerCertificateResponse.ResourceGroupId"));
		uploadServerCertificateResponse.setCreateTime(_ctx.stringValue("UploadServerCertificateResponse.CreateTime"));
		uploadServerCertificateResponse.setCreateTimeStamp(_ctx.longValue("UploadServerCertificateResponse.CreateTimeStamp"));
		uploadServerCertificateResponse.setExpireTime(_ctx.stringValue("UploadServerCertificateResponse.ExpireTime"));
		uploadServerCertificateResponse.setExpireTimeStamp(_ctx.longValue("UploadServerCertificateResponse.ExpireTimeStamp"));
		uploadServerCertificateResponse.setCommonName(_ctx.stringValue("UploadServerCertificateResponse.CommonName"));

		List<String> subjectAlternativeNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UploadServerCertificateResponse.SubjectAlternativeNames.Length"); i++) {
			subjectAlternativeNames.add(_ctx.stringValue("UploadServerCertificateResponse.SubjectAlternativeNames["+ i +"]"));
		}
		uploadServerCertificateResponse.setSubjectAlternativeNames(subjectAlternativeNames);
	 
	 	return uploadServerCertificateResponse;
	}
}