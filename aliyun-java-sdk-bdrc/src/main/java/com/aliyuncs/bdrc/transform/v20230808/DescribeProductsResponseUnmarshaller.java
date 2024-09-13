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

import com.aliyuncs.bdrc.model.v20230808.DescribeProductsResponse;
import com.aliyuncs.bdrc.model.v20230808.DescribeProductsResponse.Data;
import com.aliyuncs.bdrc.model.v20230808.DescribeProductsResponse.Data.ContentItem;
import com.aliyuncs.bdrc.model.v20230808.DescribeProductsResponse.Data.ContentItem.ProtectionScoreDistributionItem;
import com.aliyuncs.bdrc.model.v20230808.DescribeProductsResponse.Data.ContentItem.ProtectionScoreDistributionItem.Range;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProductsResponseUnmarshaller {

	public static DescribeProductsResponse unmarshall(DescribeProductsResponse describeProductsResponse, UnmarshallerContext _ctx) {
		
		describeProductsResponse.setRequestId(_ctx.stringValue("DescribeProductsResponse.RequestId"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("DescribeProductsResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("DescribeProductsResponse.Data.MaxResults"));
		data.setTotalCount(_ctx.longValue("DescribeProductsResponse.Data.TotalCount"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductsResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setProductType(_ctx.stringValue("DescribeProductsResponse.Data.Content["+ i +"].ProductType"));
			contentItem.setEnableCheck(_ctx.booleanValue("DescribeProductsResponse.Data.Content["+ i +"].EnableCheck"));
			contentItem.setProtectionScore(_ctx.integerValue("DescribeProductsResponse.Data.Content["+ i +"].ProtectionScore"));
			contentItem.setProtectionScoreUpdatedTime(_ctx.longValue("DescribeProductsResponse.Data.Content["+ i +"].ProtectionScoreUpdatedTime"));
			contentItem.setTotalResourceCount(_ctx.longValue("DescribeProductsResponse.Data.Content["+ i +"].TotalResourceCount"));
			contentItem.setRiskyResourceCount(_ctx.longValue("DescribeProductsResponse.Data.Content["+ i +"].RiskyResourceCount"));
			contentItem.setCheckFailedResourceCount(_ctx.longValue("DescribeProductsResponse.Data.Content["+ i +"].CheckFailedResourceCount"));
			contentItem.setDisableCheckResourceCount(_ctx.longValue("DescribeProductsResponse.Data.Content["+ i +"].DisableCheckResourceCount"));
			contentItem.setRiskCount(_ctx.longValue("DescribeProductsResponse.Data.Content["+ i +"].RiskCount"));
			contentItem.setCheckFailedCount(_ctx.longValue("DescribeProductsResponse.Data.Content["+ i +"].CheckFailedCount"));

			List<ProtectionScoreDistributionItem> protectionScoreDistribution = new ArrayList<ProtectionScoreDistributionItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeProductsResponse.Data.Content["+ i +"].ProtectionScoreDistribution.Length"); j++) {
				ProtectionScoreDistributionItem protectionScoreDistributionItem = new ProtectionScoreDistributionItem();
				protectionScoreDistributionItem.setCount(_ctx.longValue("DescribeProductsResponse.Data.Content["+ i +"].ProtectionScoreDistribution["+ j +"].Count"));

				Range range = new Range();
				range.setFrom(_ctx.integerValue("DescribeProductsResponse.Data.Content["+ i +"].ProtectionScoreDistribution["+ j +"].Range.From"));
				range.setTo(_ctx.integerValue("DescribeProductsResponse.Data.Content["+ i +"].ProtectionScoreDistribution["+ j +"].Range.To"));
				protectionScoreDistributionItem.setRange(range);

				protectionScoreDistribution.add(protectionScoreDistributionItem);
			}
			contentItem.setProtectionScoreDistribution(protectionScoreDistribution);

			content.add(contentItem);
		}
		data.setContent(content);
		describeProductsResponse.setData(data);
	 
	 	return describeProductsResponse;
	}
}