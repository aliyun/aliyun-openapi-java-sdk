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

	public static DescribeDataAssetsResponse unmarshall(DescribeDataAssetsResponse describeDataAssetsResponse, UnmarshallerContext _ctx) {
		
		describeDataAssetsResponse.setRequestId(_ctx.stringValue("DescribeDataAssetsResponse.RequestId"));
		describeDataAssetsResponse.setCurrentPage(_ctx.integerValue("DescribeDataAssetsResponse.CurrentPage"));
		describeDataAssetsResponse.setPageSize(_ctx.integerValue("DescribeDataAssetsResponse.PageSize"));
		describeDataAssetsResponse.setTotalCount(_ctx.integerValue("DescribeDataAssetsResponse.TotalCount"));

		List<Asset> items = new ArrayList<Asset>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataAssetsResponse.Items.Length"); i++) {
			Asset asset = new Asset();
			asset.setAcl(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].Acl"));
			asset.setCreationTime(_ctx.longValue("DescribeDataAssetsResponse.Items["+ i +"].CreationTime"));
			asset.setDataType(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].DataType"));
			asset.setOwner(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].Owner"));
			asset.setSensitiveRatio(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].SensitiveRatio"));
			asset.setProtection(_ctx.booleanValue("DescribeDataAssetsResponse.Items["+ i +"].Protection"));
			asset.setDepartName(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].DepartName"));
			asset.setLabelsec(_ctx.booleanValue("DescribeDataAssetsResponse.Items["+ i +"].Labelsec"));
			asset.setTotalCount(_ctx.integerValue("DescribeDataAssetsResponse.Items["+ i +"].TotalCount"));
			asset.setRiskLevelId(_ctx.longValue("DescribeDataAssetsResponse.Items["+ i +"].RiskLevelId"));
			asset.setRuleName(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].RuleName"));
			asset.setSensitive(_ctx.booleanValue("DescribeDataAssetsResponse.Items["+ i +"].Sensitive"));
			asset.setObjectKey(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].ObjectKey"));
			asset.setRiskLevelName(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].RiskLevelName"));
			asset.setOdpsRiskLevelName(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].OdpsRiskLevelName"));
			asset.setProductId(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].ProductId"));
			asset.setName(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].Name"));
			asset.setSensitiveCount(_ctx.integerValue("DescribeDataAssetsResponse.Items["+ i +"].SensitiveCount"));
			asset.setId(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].Id"));
			asset.setProductCode(_ctx.stringValue("DescribeDataAssetsResponse.Items["+ i +"].ProductCode"));

			items.add(asset);
		}
		describeDataAssetsResponse.setItems(items);
	 
	 	return describeDataAssetsResponse;
	}
}