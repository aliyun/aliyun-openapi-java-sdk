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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeDataAssetsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDataAssetsResponse.Asset;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataAssetsResponseUnmarshaller {

	public static DescribeDataAssetsResponse unmarshall(DescribeDataAssetsResponse describeDataAssetsResponse, UnmarshallerContext context) {
		
		describeDataAssetsResponse.setRequestId(context.stringValue("DescribeDataAssetsResponse.RequestId"));
		describeDataAssetsResponse.setPageSize(context.integerValue("DescribeDataAssetsResponse.PageSize"));
		describeDataAssetsResponse.setCurrentPage(context.integerValue("DescribeDataAssetsResponse.CurrentPage"));
		describeDataAssetsResponse.setTotalCount(context.integerValue("DescribeDataAssetsResponse.TotalCount"));

		List<Asset> items = new ArrayList<Asset>();
		for (int i = 0; i < context.lengthValue("DescribeDataAssetsResponse.Items.Length"); i++) {
			Asset asset = new Asset();
			asset.setId(context.longValue("DescribeDataAssetsResponse.Items["+ i +"].Id"));
			asset.setName(context.stringValue("DescribeDataAssetsResponse.Items["+ i +"].Name"));
			asset.setOwner(context.stringValue("DescribeDataAssetsResponse.Items["+ i +"].Owner"));
			asset.setCreationTime(context.longValue("DescribeDataAssetsResponse.Items["+ i +"].CreationTime"));
			asset.setProductId(context.stringValue("DescribeDataAssetsResponse.Items["+ i +"].ProductId"));
			asset.setProductCode(context.stringValue("DescribeDataAssetsResponse.Items["+ i +"].ProductCode"));
			asset.setProtection(context.booleanValue("DescribeDataAssetsResponse.Items["+ i +"].Protection"));
			asset.setLabelsec(context.integerValue("DescribeDataAssetsResponse.Items["+ i +"].Labelsec"));
			asset.setOdpsRiskLevelName(context.stringValue("DescribeDataAssetsResponse.Items["+ i +"].OdpsRiskLevelName"));
			asset.setSensitive(context.booleanValue("DescribeDataAssetsResponse.Items["+ i +"].Sensitive"));
			asset.setRiskLevelId(context.longValue("DescribeDataAssetsResponse.Items["+ i +"].RiskLevelId"));
			asset.setRiskLevelName(context.stringValue("DescribeDataAssetsResponse.Items["+ i +"].RiskLevelName"));
			asset.setRuleName(context.stringValue("DescribeDataAssetsResponse.Items["+ i +"].RuleName"));
			asset.setDepartName(context.stringValue("DescribeDataAssetsResponse.Items["+ i +"].DepartName"));
			asset.setTotalCount(context.integerValue("DescribeDataAssetsResponse.Items["+ i +"].TotalCount"));
			asset.setSensitiveCount(context.integerValue("DescribeDataAssetsResponse.Items["+ i +"].SensitiveCount"));
			asset.setAcl(context.stringValue("DescribeDataAssetsResponse.Items["+ i +"].Acl"));
			asset.setSensitiveRatio(context.stringValue("DescribeDataAssetsResponse.Items["+ i +"].SensitiveRatio"));
			asset.setDataType(context.stringValue("DescribeDataAssetsResponse.Items["+ i +"].DataType"));
			asset.setObjectKey(context.stringValue("DescribeDataAssetsResponse.Items["+ i +"].ObjectKey"));

			items.add(asset);
		}
		describeDataAssetsResponse.setItems(items);
	 
	 	return describeDataAssetsResponse;
	}
}