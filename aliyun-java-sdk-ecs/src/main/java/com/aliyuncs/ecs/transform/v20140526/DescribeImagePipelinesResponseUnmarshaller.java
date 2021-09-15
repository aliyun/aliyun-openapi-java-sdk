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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelinesResponse.ImagePipelineSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImagePipelinesResponseUnmarshaller {

	public static DescribeImagePipelinesResponse unmarshall(DescribeImagePipelinesResponse describeImagePipelinesResponse, UnmarshallerContext _ctx) {
		
		describeImagePipelinesResponse.setRequestId(_ctx.stringValue("DescribeImagePipelinesResponse.RequestId"));
		describeImagePipelinesResponse.setNextToken(_ctx.stringValue("DescribeImagePipelinesResponse.NextToken"));
		describeImagePipelinesResponse.setTotalCount(_ctx.integerValue("DescribeImagePipelinesResponse.TotalCount"));
		describeImagePipelinesResponse.setMaxResults(_ctx.integerValue("DescribeImagePipelinesResponse.MaxResults"));

		List<ImagePipelineSet> imagePipeline = new ArrayList<ImagePipelineSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImagePipelinesResponse.ImagePipeline.Length"); i++) {
			ImagePipelineSet imagePipelineSet = new ImagePipelineSet();
			imagePipelineSet.setCreationTime(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].CreationTime"));
			imagePipelineSet.setDeleteInstanceOnFailure(_ctx.booleanValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].DeleteInstanceOnFailure"));
			imagePipelineSet.setInstanceType(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].InstanceType"));
			imagePipelineSet.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].InternetMaxBandwidthOut"));
			imagePipelineSet.setImagePipelineId(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImagePipelineId"));
			imagePipelineSet.setVSwitchId(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].VSwitchId"));
			imagePipelineSet.setSystemDiskSize(_ctx.integerValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].SystemDiskSize"));
			imagePipelineSet.setDescription(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].Description"));
			imagePipelineSet.setBaseImage(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].BaseImage"));
			imagePipelineSet.setResourceGroupId(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ResourceGroupId"));
			imagePipelineSet.setImageName(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ImageName"));
			imagePipelineSet.setBaseImageType(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].BaseImageType"));
			imagePipelineSet.setName(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].Name"));
			imagePipelineSet.setBuildContent(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].BuildContent"));

			List<String> toRegionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ToRegionIds.Length"); j++) {
				toRegionIds.add(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].ToRegionIds["+ j +"]"));
			}
			imagePipelineSet.setToRegionIds(toRegionIds);

			List<String> addAccounts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].AddAccounts.Length"); j++) {
				addAccounts.add(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].AddAccounts["+ j +"]"));
			}
			imagePipelineSet.setAddAccounts(addAccounts);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeImagePipelinesResponse.ImagePipeline["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			imagePipelineSet.setTags(tags);

			imagePipeline.add(imagePipelineSet);
		}
		describeImagePipelinesResponse.setImagePipeline(imagePipeline);
	 
	 	return describeImagePipelinesResponse;
	}
}