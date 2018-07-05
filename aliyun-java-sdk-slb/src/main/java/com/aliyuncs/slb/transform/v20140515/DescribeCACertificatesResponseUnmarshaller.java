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

import com.aliyuncs.slb.model.v20140515.DescribeCACertificatesResponse;
import com.aliyuncs.slb.model.v20140515.DescribeCACertificatesResponse.CACertificate;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCACertificatesResponseUnmarshaller {

	public static DescribeCACertificatesResponse unmarshall(DescribeCACertificatesResponse describeCACertificatesResponse, UnmarshallerContext context) {
		
		describeCACertificatesResponse.setRequestId(context.stringValue("DescribeCACertificatesResponse.RequestId"));

		List<CACertificate> cACertificates = new ArrayList<CACertificate>();
		for (int i = 0; i < context.lengthValue("DescribeCACertificatesResponse.CACertificates.Length"); i++) {
			CACertificate cACertificate = new CACertificate();
			cACertificate.setRegionId(context.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].RegionId"));
			cACertificate.setCACertificateId(context.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].CACertificateId"));
			cACertificate.setCACertificateName(context.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].CACertificateName"));
			cACertificate.setFingerprint(context.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].Fingerprint"));
			cACertificate.setResourceGroupId(context.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].ResourceGroupId"));
			cACertificate.setCreateTime(context.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].CreateTime"));
			cACertificate.setCreateTimeStamp(context.longValue("DescribeCACertificatesResponse.CACertificates["+ i +"].CreateTimeStamp"));
			cACertificate.setExpireTime(context.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].ExpireTime"));
			cACertificate.setExpireTimeStamp(context.longValue("DescribeCACertificatesResponse.CACertificates["+ i +"].ExpireTimeStamp"));
			cACertificate.setCommonName(context.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].CommonName"));

			cACertificates.add(cACertificate);
		}
		describeCACertificatesResponse.setCACertificates(cACertificates);
	 
	 	return describeCACertificatesResponse;
	}
}