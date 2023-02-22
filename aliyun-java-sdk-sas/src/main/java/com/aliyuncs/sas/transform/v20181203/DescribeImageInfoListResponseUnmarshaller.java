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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeImageInfoListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageInfoListResponse.ImageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageInfoListResponseUnmarshaller {

	public static DescribeImageInfoListResponse unmarshall(DescribeImageInfoListResponse describeImageInfoListResponse, UnmarshallerContext _ctx) {
		
		describeImageInfoListResponse.setRequestId(_ctx.stringValue("DescribeImageInfoListResponse.RequestId"));

		List<ImageInfo> imageInfos = new ArrayList<ImageInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageInfoListResponse.ImageInfos.Length"); i++) {
			ImageInfo imageInfo = new ImageInfo();
			imageInfo.setStatus(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].Status"));
			imageInfo.setEndpoints(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].Endpoints"));
			imageInfo.setRiskStatus(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].RiskStatus"));
			imageInfo.setVulStatus(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].VulStatus"));
			imageInfo.setImageCreate(_ctx.longValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].ImageCreate"));
			imageInfo.setAlarmStatus(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].AlarmStatus"));
			imageInfo.setDigest(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].Digest"));
			imageInfo.setRegistryType(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].RegistryType"));
			imageInfo.setImageUpdate(_ctx.longValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].ImageUpdate"));
			imageInfo.setTag(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].Tag"));
			imageInfo.setInstanceId(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].InstanceId"));
			imageInfo.setRepoType(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].RepoType"));
			imageInfo.setRegionId(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].RegionId"));
			imageInfo.setUuid(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].Uuid"));
			imageInfo.setImageSize(_ctx.longValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].ImageSize"));
			imageInfo.setRepoId(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].RepoId"));
			imageInfo.setTagImmutable(_ctx.integerValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].TagImmutable"));
			imageInfo.setVulCount(_ctx.integerValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].VulCount"));
			imageInfo.setAlarmCount(_ctx.integerValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].AlarmCount"));
			imageInfo.setImageId(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].ImageId"));
			imageInfo.setRepoName(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].RepoName"));
			imageInfo.setRepoNamespace(_ctx.stringValue("DescribeImageInfoListResponse.ImageInfos["+ i +"].RepoNamespace"));

			imageInfos.add(imageInfo);
		}
		describeImageInfoListResponse.setImageInfos(imageInfos);
	 
	 	return describeImageInfoListResponse;
	}
}