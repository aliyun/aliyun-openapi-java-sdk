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

	public static DescribeServerCertificatesResponse unmarshall(DescribeServerCertificatesResponse describeServerCertificatesResponse, UnmarshallerContext context) {
		
		describeServerCertificatesResponse.setRequestId(context.stringValue("DescribeServerCertificatesResponse.RequestId"));

		List<ServerCertificate> serverCertificates = new ArrayList<ServerCertificate>();
		for (int i = 0; i < context.lengthValue("DescribeServerCertificatesResponse.ServerCertificates.Length"); i++) {
			ServerCertificate serverCertificate = new ServerCertificate();
			serverCertificate.setServerCertificateId(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].ServerCertificateId"));
			serverCertificate.setFingerprint(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].Fingerprint"));
			serverCertificate.setServerCertificateName(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].ServerCertificateName"));
			serverCertificate.setRegionId(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].RegionId"));
			serverCertificate.setRegionIdAlias(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].RegionIdAlias"));
			serverCertificate.setAliCloudCertificateId(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].AliCloudCertificateId"));
			serverCertificate.setAliCloudCertificateName(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].AliCloudCertificateName"));
			serverCertificate.setIsAliCloudCertificate(context.integerValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].IsAliCloudCertificate"));
			serverCertificate.setResourceGroupId(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].ResourceGroupId"));
			serverCertificate.setCreateTime(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].CreateTime"));
			serverCertificate.setCreateTimeStamp(context.longValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].CreateTimeStamp"));
			serverCertificate.setExpireTime(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].ExpireTime"));
			serverCertificate.setExpireTimeStamp(context.longValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].ExpireTimeStamp"));
			serverCertificate.setCommonName(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].CommonName"));

			List<String> subjectAlternativeNames = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].SubjectAlternativeNames.Length"); j++) {
				subjectAlternativeNames.add(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].SubjectAlternativeNames["+ j +"]"));
			}
			serverCertificate.setSubjectAlternativeNames(subjectAlternativeNames);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("DescribeServerCertificatesResponse.ServerCertificates["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			serverCertificate.setTags(tags);

			serverCertificates.add(serverCertificate);
		}
		describeServerCertificatesResponse.setServerCertificates(serverCertificates);
	 
	 	return describeServerCertificatesResponse;
	}
}