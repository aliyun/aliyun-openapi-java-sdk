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

import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelineExecutionsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelineExecutionsResponse.ImagePipelineExecutionSet;
import com.aliyuncs.ecs.model.v20140526.DescribeImagePipelineExecutionsResponse.ImagePipelineExecutionSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImagePipelineExecutionsResponseUnmarshaller {

	public static DescribeImagePipelineExecutionsResponse unmarshall(DescribeImagePipelineExecutionsResponse describeImagePipelineExecutionsResponse, UnmarshallerContext _ctx) {
		
		describeImagePipelineExecutionsResponse.setRequestId(_ctx.stringValue("DescribeImagePipelineExecutionsResponse.RequestId"));
		describeImagePipelineExecutionsResponse.setNextToken(_ctx.stringValue("DescribeImagePipelineExecutionsResponse.NextToken"));
		describeImagePipelineExecutionsResponse.setTotalCount(_ctx.integerValue("DescribeImagePipelineExecutionsResponse.TotalCount"));
		describeImagePipelineExecutionsResponse.setMaxResults(_ctx.integerValue("DescribeImagePipelineExecutionsResponse.MaxResults"));

		List<ImagePipelineExecutionSet> imagePipelineExecution = new ArrayList<ImagePipelineExecutionSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImagePipelineExecutionsResponse.ImagePipelineExecution.Length"); i++) {
			ImagePipelineExecutionSet imagePipelineExecutionSet = new ImagePipelineExecutionSet();
			imagePipelineExecutionSet.setCreationTime(_ctx.stringValue("DescribeImagePipelineExecutionsResponse.ImagePipelineExecution["+ i +"].CreationTime"));
			imagePipelineExecutionSet.setImagePipelineId(_ctx.stringValue("DescribeImagePipelineExecutionsResponse.ImagePipelineExecution["+ i +"].ImagePipelineId"));
			imagePipelineExecutionSet.setStatus(_ctx.stringValue("DescribeImagePipelineExecutionsResponse.ImagePipelineExecution["+ i +"].Status"));
			imagePipelineExecutionSet.setModifiedTime(_ctx.stringValue("DescribeImagePipelineExecutionsResponse.ImagePipelineExecution["+ i +"].ModifiedTime"));
			imagePipelineExecutionSet.setResourceGroupId(_ctx.stringValue("DescribeImagePipelineExecutionsResponse.ImagePipelineExecution["+ i +"].ResourceGroupId"));
			imagePipelineExecutionSet.setMessage(_ctx.stringValue("DescribeImagePipelineExecutionsResponse.ImagePipelineExecution["+ i +"].Message"));
			imagePipelineExecutionSet.setImageId(_ctx.stringValue("DescribeImagePipelineExecutionsResponse.ImagePipelineExecution["+ i +"].ImageId"));
			imagePipelineExecutionSet.setExecutionId(_ctx.stringValue("DescribeImagePipelineExecutionsResponse.ImagePipelineExecution["+ i +"].ExecutionId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImagePipelineExecutionsResponse.ImagePipelineExecution["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeImagePipelineExecutionsResponse.ImagePipelineExecution["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeImagePipelineExecutionsResponse.ImagePipelineExecution["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			imagePipelineExecutionSet.setTags(tags);

			imagePipelineExecution.add(imagePipelineExecutionSet);
		}
		describeImagePipelineExecutionsResponse.setImagePipelineExecution(imagePipelineExecution);
	 
	 	return describeImagePipelineExecutionsResponse;
	}
}