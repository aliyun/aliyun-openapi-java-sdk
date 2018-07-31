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

import com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplatesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplatesResponse.LaunchTemplateSet;
import com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplatesResponse.LaunchTemplateSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLaunchTemplatesResponseUnmarshaller {

	public static DescribeLaunchTemplatesResponse unmarshall(DescribeLaunchTemplatesResponse describeLaunchTemplatesResponse, UnmarshallerContext context) {
		
		describeLaunchTemplatesResponse.setRequestId(context.stringValue("DescribeLaunchTemplatesResponse.RequestId"));
		describeLaunchTemplatesResponse.setTotalCount(context.integerValue("DescribeLaunchTemplatesResponse.TotalCount"));
		describeLaunchTemplatesResponse.setPageNumber(context.integerValue("DescribeLaunchTemplatesResponse.PageNumber"));
		describeLaunchTemplatesResponse.setPageSize(context.integerValue("DescribeLaunchTemplatesResponse.PageSize"));

		List<LaunchTemplateSet> launchTemplateSets = new ArrayList<LaunchTemplateSet>();
		for (int i = 0; i < context.lengthValue("DescribeLaunchTemplatesResponse.LaunchTemplateSets.Length"); i++) {
			LaunchTemplateSet launchTemplateSet = new LaunchTemplateSet();
			launchTemplateSet.setCreateTime(context.stringValue("DescribeLaunchTemplatesResponse.LaunchTemplateSets["+ i +"].CreateTime"));
			launchTemplateSet.setModifiedTime(context.stringValue("DescribeLaunchTemplatesResponse.LaunchTemplateSets["+ i +"].ModifiedTime"));
			launchTemplateSet.setLaunchTemplateId(context.stringValue("DescribeLaunchTemplatesResponse.LaunchTemplateSets["+ i +"].LaunchTemplateId"));
			launchTemplateSet.setLaunchTemplateName(context.stringValue("DescribeLaunchTemplatesResponse.LaunchTemplateSets["+ i +"].LaunchTemplateName"));
			launchTemplateSet.setDefaultVersionNumber(context.longValue("DescribeLaunchTemplatesResponse.LaunchTemplateSets["+ i +"].DefaultVersionNumber"));
			launchTemplateSet.setLatestVersionNumber(context.longValue("DescribeLaunchTemplatesResponse.LaunchTemplateSets["+ i +"].LatestVersionNumber"));
			launchTemplateSet.setCreatedBy(context.stringValue("DescribeLaunchTemplatesResponse.LaunchTemplateSets["+ i +"].CreatedBy"));
			launchTemplateSet.setResourceGroupId(context.stringValue("DescribeLaunchTemplatesResponse.LaunchTemplateSets["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeLaunchTemplatesResponse.LaunchTemplateSets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("DescribeLaunchTemplatesResponse.LaunchTemplateSets["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("DescribeLaunchTemplatesResponse.LaunchTemplateSets["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			launchTemplateSet.setTags(tags);

			launchTemplateSets.add(launchTemplateSet);
		}
		describeLaunchTemplatesResponse.setLaunchTemplateSets(launchTemplateSets);
	 
	 	return describeLaunchTemplatesResponse;
	}
}