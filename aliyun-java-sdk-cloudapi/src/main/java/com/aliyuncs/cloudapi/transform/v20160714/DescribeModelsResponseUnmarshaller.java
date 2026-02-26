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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeModelsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeModelsResponse.ModelDetail;
import com.aliyuncs.cloudapi.model.v20160714.DescribeModelsResponse.ModelDetail.TagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeModelsResponseUnmarshaller {

	public static DescribeModelsResponse unmarshall(DescribeModelsResponse describeModelsResponse, UnmarshallerContext _ctx) {
		
		describeModelsResponse.setRequestId(_ctx.stringValue("DescribeModelsResponse.RequestId"));
		describeModelsResponse.setPageNumber(_ctx.integerValue("DescribeModelsResponse.PageNumber"));
		describeModelsResponse.setPageSize(_ctx.integerValue("DescribeModelsResponse.PageSize"));
		describeModelsResponse.setTotalCount(_ctx.integerValue("DescribeModelsResponse.TotalCount"));

		List<ModelDetail> modelDetails = new ArrayList<ModelDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeModelsResponse.ModelDetails.Length"); i++) {
			ModelDetail modelDetail = new ModelDetail();
			modelDetail.setModifiedTime(_ctx.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].ModifiedTime"));
			modelDetail.setGroupId(_ctx.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].GroupId"));
			modelDetail.setDescription(_ctx.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].Description"));
			modelDetail.setSchema(_ctx.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].Schema"));
			modelDetail.setModelName(_ctx.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].ModelName"));
			modelDetail.setCreatedTime(_ctx.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].CreatedTime"));
			modelDetail.setModelId(_ctx.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].ModelId"));
			modelDetail.setModelRef(_ctx.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].ModelRef"));

			List<TagInfo> tags = new ArrayList<TagInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeModelsResponse.ModelDetails["+ i +"].Tags.Length"); j++) {
				TagInfo tagInfo = new TagInfo();
				tagInfo.setKey(_ctx.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].Tags["+ j +"].Key"));
				tagInfo.setValue(_ctx.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagInfo);
			}
			modelDetail.setTags(tags);

			modelDetails.add(modelDetail);
		}
		describeModelsResponse.setModelDetails(modelDetails);
	 
	 	return describeModelsResponse;
	}
}