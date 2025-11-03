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

package com.aliyuncs.sophonsoar.transform.v20220728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeComponentAssetsResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeComponentAssetsResponse.ComponentAssetsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeComponentAssetsResponseUnmarshaller {

	public static DescribeComponentAssetsResponse unmarshall(DescribeComponentAssetsResponse describeComponentAssetsResponse, UnmarshallerContext _ctx) {
		
		describeComponentAssetsResponse.setRequestId(_ctx.stringValue("DescribeComponentAssetsResponse.RequestId"));

		List<ComponentAssetsItem> componentAssets = new ArrayList<ComponentAssetsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeComponentAssetsResponse.ComponentAssets.Length"); i++) {
			ComponentAssetsItem componentAssetsItem = new ComponentAssetsItem();
			componentAssetsItem.setId(_ctx.longValue("DescribeComponentAssetsResponse.ComponentAssets["+ i +"].Id"));
			componentAssetsItem.setGmtCreate(_ctx.stringValue("DescribeComponentAssetsResponse.ComponentAssets["+ i +"].GmtCreate"));
			componentAssetsItem.setGmtModified(_ctx.stringValue("DescribeComponentAssetsResponse.ComponentAssets["+ i +"].GmtModified"));
			componentAssetsItem.setName(_ctx.stringValue("DescribeComponentAssetsResponse.ComponentAssets["+ i +"].Name"));
			componentAssetsItem.setComponentname(_ctx.stringValue("DescribeComponentAssetsResponse.ComponentAssets["+ i +"].Componentname"));
			componentAssetsItem.setParams(_ctx.stringValue("DescribeComponentAssetsResponse.ComponentAssets["+ i +"].Params"));
			componentAssetsItem.setDomainId(_ctx.stringValue("DescribeComponentAssetsResponse.ComponentAssets["+ i +"].DomainId"));
			componentAssetsItem.setTenantId(_ctx.stringValue("DescribeComponentAssetsResponse.ComponentAssets["+ i +"].TenantId"));
			componentAssetsItem.setOwner(_ctx.stringValue("DescribeComponentAssetsResponse.ComponentAssets["+ i +"].Owner"));
			componentAssetsItem.setAssetUuid(_ctx.stringValue("DescribeComponentAssetsResponse.ComponentAssets["+ i +"].AssetUuid"));

			componentAssets.add(componentAssetsItem);
		}
		describeComponentAssetsResponse.setComponentAssets(componentAssets);
	 
	 	return describeComponentAssetsResponse;
	}
}