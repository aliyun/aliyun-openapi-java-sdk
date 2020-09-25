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

import com.aliyuncs.sas.model.v20181203.DescribeAffectedMaliciousFileImagesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImage;
import com.aliyuncs.sas.model.v20181203.DescribeAffectedMaliciousFileImagesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAffectedMaliciousFileImagesResponseUnmarshaller {

	public static DescribeAffectedMaliciousFileImagesResponse unmarshall(DescribeAffectedMaliciousFileImagesResponse describeAffectedMaliciousFileImagesResponse, UnmarshallerContext _ctx) {
		
		describeAffectedMaliciousFileImagesResponse.setRequestId(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeAffectedMaliciousFileImagesResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeAffectedMaliciousFileImagesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeAffectedMaliciousFileImagesResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeAffectedMaliciousFileImagesResponse.PageInfo.CurrentPage"));
		describeAffectedMaliciousFileImagesResponse.setPageInfo(pageInfo);

		List<AffectedMaliciousFileImage> affectedMaliciousFileImagesResponse = new ArrayList<AffectedMaliciousFileImage>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse.Length"); i++) {
			AffectedMaliciousFileImage affectedMaliciousFileImage = new AffectedMaliciousFileImage();
			affectedMaliciousFileImage.setLayer(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].Layer"));
			affectedMaliciousFileImage.setFirstScanTimestamp(_ctx.longValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].FirstScanTimestamp"));
			affectedMaliciousFileImage.setLatestScanTimestamp(_ctx.longValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].LatestScanTimestamp"));
			affectedMaliciousFileImage.setLatestVerifyTimestamp(_ctx.longValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].LatestVerifyTimestamp"));
			affectedMaliciousFileImage.setMaliciousMd5(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].MaliciousMd5"));
			affectedMaliciousFileImage.setStatus(_ctx.integerValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].Status"));
			affectedMaliciousFileImage.setLevel(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].Level"));
			affectedMaliciousFileImage.setImageUuid(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].ImageUuid"));
			affectedMaliciousFileImage.setFilePath(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].FilePath"));
			affectedMaliciousFileImage.setDigest(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].Digest"));
			affectedMaliciousFileImage.setRepoRegionId(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].RepoRegionId"));
			affectedMaliciousFileImage.setRepoInstanceId(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].RepoInstanceId"));
			affectedMaliciousFileImage.setRepoId(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].RepoId"));
			affectedMaliciousFileImage.setRepoName(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].RepoName"));
			affectedMaliciousFileImage.setNamespace(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].Namespace"));
			affectedMaliciousFileImage.setTag(_ctx.stringValue("DescribeAffectedMaliciousFileImagesResponse.AffectedMaliciousFileImagesResponse["+ i +"].Tag"));

			affectedMaliciousFileImagesResponse.add(affectedMaliciousFileImage);
		}
		describeAffectedMaliciousFileImagesResponse.setAffectedMaliciousFileImagesResponse(affectedMaliciousFileImagesResponse);
	 
	 	return describeAffectedMaliciousFileImagesResponse;
	}
}