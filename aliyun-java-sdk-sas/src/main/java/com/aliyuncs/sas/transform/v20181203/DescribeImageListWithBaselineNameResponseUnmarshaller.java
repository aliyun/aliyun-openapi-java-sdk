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

import com.aliyuncs.sas.model.v20181203.DescribeImageListWithBaselineNameResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageListWithBaselineNameResponse.ImageInfosItem;
import com.aliyuncs.sas.model.v20181203.DescribeImageListWithBaselineNameResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageListWithBaselineNameResponseUnmarshaller {

	public static DescribeImageListWithBaselineNameResponse unmarshall(DescribeImageListWithBaselineNameResponse describeImageListWithBaselineNameResponse, UnmarshallerContext _ctx) {
		
		describeImageListWithBaselineNameResponse.setRequestId(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeImageListWithBaselineNameResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeImageListWithBaselineNameResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeImageListWithBaselineNameResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeImageListWithBaselineNameResponse.PageInfo.Count"));
		describeImageListWithBaselineNameResponse.setPageInfo(pageInfo);

		List<ImageInfosItem> imageInfos = new ArrayList<ImageInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageListWithBaselineNameResponse.ImageInfos.Length"); i++) {
			ImageInfosItem imageInfosItem = new ImageInfosItem();
			imageInfosItem.setMiddleRiskImage(_ctx.integerValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].MiddleRiskImage"));
			imageInfosItem.setEndpoints(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].Endpoints"));
			imageInfosItem.setRiskStatus(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].RiskStatus"));
			imageInfosItem.setImageCreate(_ctx.longValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].ImageCreate"));
			imageInfosItem.setDigest(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].Digest"));
			imageInfosItem.setTag(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].Tag"));
			imageInfosItem.setImageUpdate(_ctx.longValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].ImageUpdate"));
			imageInfosItem.setInstanceId(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].InstanceId"));
			imageInfosItem.setLowRiskImage(_ctx.integerValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].LowRiskImage"));
			imageInfosItem.setRepoType(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].RepoType"));
			imageInfosItem.setRegionId(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].RegionId"));
			imageInfosItem.setUuid(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].Uuid"));
			imageInfosItem.setImageSize(_ctx.integerValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].ImageSize"));
			imageInfosItem.setRepoId(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].RepoId"));
			imageInfosItem.setTotalItemCount(_ctx.integerValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].TotalItemCount"));
			imageInfosItem.setHighRiskImage(_ctx.integerValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].HighRiskImage"));
			imageInfosItem.setNoRiskImage(_ctx.integerValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].NoRiskImage"));
			imageInfosItem.setImageId(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].ImageId"));
			imageInfosItem.setRepoName(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].RepoName"));
			imageInfosItem.setRepoNamespace(_ctx.stringValue("DescribeImageListWithBaselineNameResponse.ImageInfos["+ i +"].RepoNamespace"));

			imageInfos.add(imageInfosItem);
		}
		describeImageListWithBaselineNameResponse.setImageInfos(imageInfos);
	 
	 	return describeImageListWithBaselineNameResponse;
	}
}