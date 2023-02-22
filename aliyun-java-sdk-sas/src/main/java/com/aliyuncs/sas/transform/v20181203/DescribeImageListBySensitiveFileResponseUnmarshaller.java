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

import com.aliyuncs.sas.model.v20181203.DescribeImageListBySensitiveFileResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageListBySensitiveFileResponse.ImageInfoList;
import com.aliyuncs.sas.model.v20181203.DescribeImageListBySensitiveFileResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageListBySensitiveFileResponseUnmarshaller {

	public static DescribeImageListBySensitiveFileResponse unmarshall(DescribeImageListBySensitiveFileResponse describeImageListBySensitiveFileResponse, UnmarshallerContext _ctx) {
		
		describeImageListBySensitiveFileResponse.setRequestId(_ctx.stringValue("DescribeImageListBySensitiveFileResponse.RequestId"));
		describeImageListBySensitiveFileResponse.setSuccess(_ctx.booleanValue("DescribeImageListBySensitiveFileResponse.Success"));
		describeImageListBySensitiveFileResponse.setCode(_ctx.stringValue("DescribeImageListBySensitiveFileResponse.Code"));
		describeImageListBySensitiveFileResponse.setMessage(_ctx.stringValue("DescribeImageListBySensitiveFileResponse.Message"));
		describeImageListBySensitiveFileResponse.setHttpStatusCode(_ctx.integerValue("DescribeImageListBySensitiveFileResponse.HttpStatusCode"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeImageListBySensitiveFileResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeImageListBySensitiveFileResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeImageListBySensitiveFileResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeImageListBySensitiveFileResponse.PageInfo.Count"));
		pageInfo.setLastRowKey(_ctx.stringValue("DescribeImageListBySensitiveFileResponse.PageInfo.LastRowKey"));
		describeImageListBySensitiveFileResponse.setPageInfo(pageInfo);

		List<ImageInfoList> imageInfos = new ArrayList<ImageInfoList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageListBySensitiveFileResponse.ImageInfos.Length"); i++) {
			ImageInfoList imageInfoList = new ImageInfoList();
			imageInfoList.setUuid(_ctx.stringValue("DescribeImageListBySensitiveFileResponse.ImageInfos["+ i +"].Uuid"));
			imageInfoList.setRegionId(_ctx.stringValue("DescribeImageListBySensitiveFileResponse.ImageInfos["+ i +"].RegionId"));
			imageInfoList.setInstanceId(_ctx.stringValue("DescribeImageListBySensitiveFileResponse.ImageInfos["+ i +"].InstanceId"));
			imageInfoList.setRepoNamespace(_ctx.stringValue("DescribeImageListBySensitiveFileResponse.ImageInfos["+ i +"].RepoNamespace"));
			imageInfoList.setRepoName(_ctx.stringValue("DescribeImageListBySensitiveFileResponse.ImageInfos["+ i +"].RepoName"));
			imageInfoList.setDigest(_ctx.stringValue("DescribeImageListBySensitiveFileResponse.ImageInfos["+ i +"].Digest"));
			imageInfoList.setTag(_ctx.stringValue("DescribeImageListBySensitiveFileResponse.ImageInfos["+ i +"].Tag"));
			imageInfoList.setFirstScanTime(_ctx.longValue("DescribeImageListBySensitiveFileResponse.ImageInfos["+ i +"].FirstScanTime"));
			imageInfoList.setLastScanTime(_ctx.longValue("DescribeImageListBySensitiveFileResponse.ImageInfos["+ i +"].LastScanTime"));
			imageInfoList.setRiskLevel(_ctx.stringValue("DescribeImageListBySensitiveFileResponse.ImageInfos["+ i +"].RiskLevel"));

			imageInfos.add(imageInfoList);
		}
		describeImageListBySensitiveFileResponse.setImageInfos(imageInfos);
	 
	 	return describeImageListBySensitiveFileResponse;
	}
}