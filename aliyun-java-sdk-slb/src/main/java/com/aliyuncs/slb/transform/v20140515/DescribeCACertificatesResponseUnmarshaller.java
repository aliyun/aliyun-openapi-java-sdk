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
import com.aliyuncs.slb.model.v20140515.DescribeCACertificatesResponse.CACertificate.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCACertificatesResponseUnmarshaller {

	public static DescribeCACertificatesResponse unmarshall(DescribeCACertificatesResponse describeCACertificatesResponse, UnmarshallerContext _ctx) {
		
		describeCACertificatesResponse.setRequestId(_ctx.stringValue("DescribeCACertificatesResponse.RequestId"));

		List<CACertificate> cACertificates = new ArrayList<CACertificate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCACertificatesResponse.CACertificates.Length"); i++) {
			CACertificate cACertificate = new CACertificate();
			cACertificate.setRegionId(_ctx.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].RegionId"));
			cACertificate.setCACertificateId(_ctx.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].CACertificateId"));
			cACertificate.setCACertificateName(_ctx.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].CACertificateName"));
			cACertificate.setFingerprint(_ctx.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].Fingerprint"));
			cACertificate.setResourceGroupId(_ctx.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].ResourceGroupId"));
			cACertificate.setCreateTime(_ctx.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].CreateTime"));
			cACertificate.setCreateTimeStamp(_ctx.longValue("DescribeCACertificatesResponse.CACertificates["+ i +"].CreateTimeStamp"));
			cACertificate.setExpireTime(_ctx.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].ExpireTime"));
			cACertificate.setExpireTimeStamp(_ctx.longValue("DescribeCACertificatesResponse.CACertificates["+ i +"].ExpireTimeStamp"));
			cACertificate.setCommonName(_ctx.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].CommonName"));
			cACertificate.setEncryptionAlgorithm(_ctx.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].EncryptionAlgorithm"));
			cACertificate.setEncryptionKeyLength(_ctx.integerValue("DescribeCACertificatesResponse.CACertificates["+ i +"].EncryptionKeyLength"));
			cACertificate.setStandardType(_ctx.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].StandardType"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCACertificatesResponse.CACertificates["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeCACertificatesResponse.CACertificates["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			cACertificate.setTags(tags);

			cACertificates.add(cACertificate);
		}
		describeCACertificatesResponse.setCACertificates(cACertificates);
	 
	 	return describeCACertificatesResponse;
	}
}