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

import com.aliyuncs.sas.model.v20181203.DescribeImageRepoListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageRepoListResponse.ImageRepo;
import com.aliyuncs.sas.model.v20181203.DescribeImageRepoListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageRepoListResponseUnmarshaller {

	public static DescribeImageRepoListResponse unmarshall(DescribeImageRepoListResponse describeImageRepoListResponse, UnmarshallerContext _ctx) {
		
		describeImageRepoListResponse.setRequestId(_ctx.stringValue("DescribeImageRepoListResponse.RequestId"));
		describeImageRepoListResponse.setAllTargetCount(_ctx.integerValue("DescribeImageRepoListResponse.AllTargetCount"));
		describeImageRepoListResponse.setAddTargetCount(_ctx.integerValue("DescribeImageRepoListResponse.AddTargetCount"));
		describeImageRepoListResponse.setDelTargetCount(_ctx.integerValue("DescribeImageRepoListResponse.DelTargetCount"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeImageRepoListResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeImageRepoListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeImageRepoListResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeImageRepoListResponse.PageInfo.Count"));
		describeImageRepoListResponse.setPageInfo(pageInfo);

		List<ImageRepo> imageRepoList = new ArrayList<ImageRepo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageRepoListResponse.ImageRepoList.Length"); i++) {
			ImageRepo imageRepo = new ImageRepo();
			imageRepo.setFlag(_ctx.stringValue("DescribeImageRepoListResponse.ImageRepoList["+ i +"].Flag"));
			imageRepo.setRepoName(_ctx.stringValue("DescribeImageRepoListResponse.ImageRepoList["+ i +"].RepoName"));
			imageRepo.setRepoNamespace(_ctx.stringValue("DescribeImageRepoListResponse.ImageRepoList["+ i +"].RepoNamespace"));

			imageRepoList.add(imageRepo);
		}
		describeImageRepoListResponse.setImageRepoList(imageRepoList);
	 
	 	return describeImageRepoListResponse;
	}
}