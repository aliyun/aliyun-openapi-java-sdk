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

package com.aliyuncs.eais.transform.v20190624;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eais.model.v20190624.DescribeEaisResponse;
import com.aliyuncs.eais.model.v20190624.DescribeEaisResponse.Instance;
import com.aliyuncs.eais.model.v20190624.DescribeEaisResponse.Instance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEaisResponseUnmarshaller {

	public static DescribeEaisResponse unmarshall(DescribeEaisResponse describeEaisResponse, UnmarshallerContext _ctx) {
		
		describeEaisResponse.setRequestId(_ctx.stringValue("DescribeEaisResponse.RequestId"));
		describeEaisResponse.setPageNumber(_ctx.integerValue("DescribeEaisResponse.PageNumber"));
		describeEaisResponse.setTotalCount(_ctx.integerValue("DescribeEaisResponse.TotalCount"));
		describeEaisResponse.setPageSize(_ctx.integerValue("DescribeEaisResponse.PageSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEaisResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setRegionId(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].RegionId"));
			instance.setZoneId(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].ZoneId"));
			instance.setCreationTime(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].CreationTime"));
			instance.setInstanceName(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].InstanceName"));
			instance.setDescription(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].Description"));
			instance.setStatus(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].Status"));
			instance.setElasticAcceleratedInstanceId(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].ElasticAcceleratedInstanceId"));
			instance.setClientInstanceId(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].ClientInstanceId"));
			instance.setInstanceType(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].InstanceType"));
			instance.setClientInstanceType(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].ClientInstanceType"));
			instance.setClientInstanceName(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].ClientInstanceName"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEaisResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeEaisResponse.Instances["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			instance.setTags(tags);

			instances.add(instance);
		}
		describeEaisResponse.setInstances(instances);
	 
	 	return describeEaisResponse;
	}
}