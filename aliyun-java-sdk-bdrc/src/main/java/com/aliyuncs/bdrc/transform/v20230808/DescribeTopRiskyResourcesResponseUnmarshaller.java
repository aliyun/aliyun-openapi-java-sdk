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

package com.aliyuncs.bdrc.transform.v20230808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bdrc.model.v20230808.DescribeTopRiskyResourcesResponse;
import com.aliyuncs.bdrc.model.v20230808.DescribeTopRiskyResourcesResponse.Data;
import com.aliyuncs.bdrc.model.v20230808.DescribeTopRiskyResourcesResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTopRiskyResourcesResponseUnmarshaller {

	public static DescribeTopRiskyResourcesResponse unmarshall(DescribeTopRiskyResourcesResponse describeTopRiskyResourcesResponse, UnmarshallerContext _ctx) {
		
		describeTopRiskyResourcesResponse.setRequestId(_ctx.stringValue("DescribeTopRiskyResourcesResponse.RequestId"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("DescribeTopRiskyResourcesResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("DescribeTopRiskyResourcesResponse.Data.MaxResults"));
		data.setTotalCount(_ctx.longValue("DescribeTopRiskyResourcesResponse.Data.TotalCount"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTopRiskyResourcesResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setResourceArn(_ctx.stringValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].ResourceArn"));
			contentItem.setProductType(_ctx.stringValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].ProductType"));
			contentItem.setResourceType(_ctx.stringValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].ResourceType"));
			contentItem.setResourceId(_ctx.stringValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].ResourceId"));
			contentItem.setResourceName(_ctx.stringValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].ResourceName"));
			contentItem.setRegionId(_ctx.stringValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].RegionId"));
			contentItem.setZoneId(_ctx.stringValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].ZoneId"));
			contentItem.setVpcId(_ctx.stringValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].VpcId"));
			contentItem.setVSwitchId(_ctx.stringValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].VSwitchId"));
			contentItem.setCreateTime(_ctx.longValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].CreateTime"));
			contentItem.setStatus(_ctx.stringValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].Status"));
			contentItem.setTotalDataSize(_ctx.longValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].TotalDataSize"));
			contentItem.setStandardDataSize(_ctx.longValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].StandardDataSize"));
			contentItem.setIaDataSize(_ctx.longValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].IaDataSize"));
			contentItem.setArchiveDataSize(_ctx.longValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].ArchiveDataSize"));
			contentItem.setColdArchiveDataSize(_ctx.longValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].ColdArchiveDataSize"));
			contentItem.setResourceAttr(_ctx.stringValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].ResourceAttr"));
			contentItem.setEnableCheck(_ctx.booleanValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].EnableCheck"));
			contentItem.setProtectionScore(_ctx.integerValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].ProtectionScore"));
			contentItem.setProtectionScoreUpdatedTime(_ctx.longValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].ProtectionScoreUpdatedTime"));
			contentItem.setRiskCount(_ctx.longValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].RiskCount"));
			contentItem.setCheckFailedCount(_ctx.longValue("DescribeTopRiskyResourcesResponse.Data.Content["+ i +"].CheckFailedCount"));

			content.add(contentItem);
		}
		data.setContent(content);
		describeTopRiskyResourcesResponse.setData(data);
	 
	 	return describeTopRiskyResourcesResponse;
	}
}