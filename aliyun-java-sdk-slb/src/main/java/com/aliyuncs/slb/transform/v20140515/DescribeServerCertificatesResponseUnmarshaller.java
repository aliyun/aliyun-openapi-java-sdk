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

import com.aliyuncs.slb.model.v20140515.DescribeServerCertificatesResponse;
import com.aliyuncs.slb.model.v20140515.DescribeServerCertificatesResponse.ServerCertificate;
import com.aliyuncs.slb.model.v20140515.DescribeServerCertificatesResponse.ServerCertificate.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServerCertificatesResponseUnmarshaller {

	public static DescribeServerCertificatesResponse unmarshall(DescribeServerCertificatesResponse describeServerCertificatesResponse, UnmarshallerContext _ctx) {
		
		describeServerCertificatesResponse.setRequestId(_ctx.stringValue("DescribeServerCertificatesResponse.RequestId"));

		List<ServerCertificate> serverCertificates = new ArrayList<ServerCertificate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServerCertificatesResponse.ServerCertificates.Length"); i++) {
			ServerCertificate serverCertificate = new ServerCertificate();
			serverCertificate.setServerCertificateId(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].ServerCertificateId"));
			serverCertificate.setFingerprint(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].Fingerprint"));
			serverCertificate.setServerCertificateName(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].ServerCertificateName"));
			serverCertificate.setRegionId(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].RegionId"));
			serverCertificate.setRegionIdAlias(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].RegionIdAlias"));
			serverCertificate.setAliCloudCertificateId(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].AliCloudCertificateId"));
			serverCertificate.setAliCloudCertificateName(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].AliCloudCertificateName"));
			serverCertificate.setIsAliCloudCertificate(_ctx.integerValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].IsAliCloudCertificate"));
			serverCertificate.setResourceGroupId(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].ResourceGroupId"));
			serverCertificate.setCreateTime(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].CreateTime"));
			serverCertificate.setCreateTimeStamp(_ctx.longValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].CreateTimeStamp"));
			serverCertificate.setExpireTime(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].ExpireTime"));
			serverCertificate.setExpireTimeStamp(_ctx.longValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].ExpireTimeStamp"));
			serverCertificate.setCommonName(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].CommonName"));

			List<String> subjectAlternativeNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].SubjectAlternativeNames.Length"); j++) {
				subjectAlternativeNames.add(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].SubjectAlternativeNames["+ j +"]"));
			}
			serverCertificate.setSubjectAlternativeNames(subjectAlternativeNames);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			serverCertificate.setTags(tags);

			serverCertificates.add(serverCertificate);
		}
		describeServerCertificatesResponse.setServerCertificates(serverCertificates);
	 
	 	return describeServerCertificatesResponse;
	}
}