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

	public static UploadServerCertificateResponse unmarshall(UploadServerCertificateResponse uploadServerCertificateResponse, UnmarshallerContext context) {
		
		uploadServerCertificateResponse.setRequestId(context.stringValue("UploadServerCertificateResponse.RequestId"));
		uploadServerCertificateResponse.setServerCertificateId(context.stringValue("UploadServerCertificateResponse.ServerCertificateId"));
		uploadServerCertificateResponse.setFingerprint(context.stringValue("UploadServerCertificateResponse.Fingerprint"));
		uploadServerCertificateResponse.setServerCertificateName(context.stringValue("UploadServerCertificateResponse.ServerCertificateName"));
		uploadServerCertificateResponse.setRegionId(context.stringValue("UploadServerCertificateResponse.RegionId"));
		uploadServerCertificateResponse.setRegionIdAlias(context.stringValue("UploadServerCertificateResponse.RegionIdAlias"));
		uploadServerCertificateResponse.setAliCloudCertificateId(context.stringValue("UploadServerCertificateResponse.AliCloudCertificateId"));
		uploadServerCertificateResponse.setAliCloudCertificateName(context.stringValue("UploadServerCertificateResponse.AliCloudCertificateName"));
		uploadServerCertificateResponse.setIsAliCloudCertificate(context.integerValue("UploadServerCertificateResponse.IsAliCloudCertificate"));
		uploadServerCertificateResponse.setResourceGroupId(context.stringValue("UploadServerCertificateResponse.ResourceGroupId"));
		uploadServerCertificateResponse.setCreateTime(context.stringValue("UploadServerCertificateResponse.CreateTime"));
		uploadServerCertificateResponse.setCreateTimeStamp(context.longValue("UploadServerCertificateResponse.CreateTimeStamp"));
		uploadServerCertificateResponse.setExpireTime(context.stringValue("UploadServerCertificateResponse.ExpireTime"));
		uploadServerCertificateResponse.setExpireTimeStamp(context.longValue("UploadServerCertificateResponse.ExpireTimeStamp"));
		uploadServerCertificateResponse.setCommonName(context.stringValue("UploadServerCertificateResponse.CommonName"));

		List<String> subjectAlternativeNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("UploadServerCertificateResponse.SubjectAlternativeNames.Length"); i++) {
			subjectAlternativeNames.add(context.stringValue("UploadServerCertificateResponse.SubjectAlternativeNames["+ i +"]"));
		}
		uploadServerCertificateResponse.setSubjectAlternativeNames(subjectAlternativeNames);
	 
	 	return uploadServerCertificateResponse;
	}
}