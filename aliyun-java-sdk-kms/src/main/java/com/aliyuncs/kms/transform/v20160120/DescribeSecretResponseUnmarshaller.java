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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.DescribeSecretResponse;
import com.aliyuncs.kms.model.v20160120.DescribeSecretResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecretResponseUnmarshaller {

	public static DescribeSecretResponse unmarshall(DescribeSecretResponse describeSecretResponse, UnmarshallerContext _ctx) {
		
		describeSecretResponse.setRequestId(_ctx.stringValue("DescribeSecretResponse.RequestId"));
		describeSecretResponse.setArn(_ctx.stringValue("DescribeSecretResponse.Arn"));
		describeSecretResponse.setSecretName(_ctx.stringValue("DescribeSecretResponse.SecretName"));
		describeSecretResponse.setEncryptionKeyId(_ctx.stringValue("DescribeSecretResponse.EncryptionKeyId"));
		describeSecretResponse.setDescription(_ctx.stringValue("DescribeSecretResponse.Description"));
		describeSecretResponse.setCreateTime(_ctx.stringValue("DescribeSecretResponse.CreateTime"));
		describeSecretResponse.setUpdateTime(_ctx.stringValue("DescribeSecretResponse.UpdateTime"));
		describeSecretResponse.setPlannedDeleteTime(_ctx.stringValue("DescribeSecretResponse.PlannedDeleteTime"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecretResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("DescribeSecretResponse.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("DescribeSecretResponse.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		describeSecretResponse.setTags(tags);
	 
	 	return describeSecretResponse;
	}
}